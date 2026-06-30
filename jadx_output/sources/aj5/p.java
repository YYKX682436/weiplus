package aj5;

/* loaded from: classes.dex */
public final class p implements yz5.l {
    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.ArrayList snapshotList = (java.util.ArrayList) obj;
        kotlin.jvm.internal.o.g(snapshotList, "snapshotList");
        java.util.Iterator it = snapshotList.iterator();
        kotlin.jvm.internal.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            kotlin.jvm.internal.o.f(next, "next(...)");
            if (((ri5.j) next).f396110e == ri5.j.Q) {
                it.remove();
            }
        }
        return jz5.f0.f302826a;
    }
}
