package t41;

/* loaded from: classes2.dex */
public abstract class d {
    public static java.util.LinkedList a(java.util.List list) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            r45.xz4 xz4Var = new r45.xz4();
            xz4Var.f472163d = str;
            linkedList.add(xz4Var);
        }
        return linkedList;
    }
}
