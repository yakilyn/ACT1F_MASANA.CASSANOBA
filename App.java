class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

class BinaryTree {
    Node root;

    void inOrder(Node node) {
        if (node == null)
            return;
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    void preOrder(Node node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    void postOrder(Node node) {
        if (node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(5);
        tree.root.right = new Node(15);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(8);
        tree.root.right.right = new Node(20);

        System.out.print("In-Order: ");
        tree.inOrder(tree.root);
        System.out.println();
        System.out.print("Pre-Order: ");
        tree.preOrder(tree.root);
        System.out.println();
        System.out.print("Post-Order: ");
        tree.postOrder(tree.root);
        System.out.println();
    }
}