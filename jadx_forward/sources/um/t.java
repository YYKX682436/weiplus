package um;

/* loaded from: classes10.dex */
public final class t extends um.g {

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Stack f510232f = new java.util.Stack();

    /* renamed from: clone */
    public java.lang.Object m168244x5a5dd5d() {
        return super.clone();
    }

    public final xk0.n j(boolean z17) {
        e(false).size();
        e(true).size();
        java.util.Iterator it = e(z17).iterator();
        while (it.hasNext()) {
            xk0.f fVar = (xk0.f) it.next();
            if (fVar instanceof xk0.n) {
                return (xk0.n) fVar;
            }
        }
        return null;
    }

    public final xk0.o k(boolean z17) {
        e(false).size();
        e(true).size();
        java.util.Iterator it = e(z17).iterator();
        while (it.hasNext()) {
            xk0.f fVar = (xk0.f) it.next();
            if (fVar instanceof xk0.o) {
                return (xk0.o) fVar;
            }
        }
        return null;
    }

    public final java.util.LinkedList l() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = e(true).iterator();
        while (it.hasNext()) {
            xk0.f fVar = (xk0.f) it.next();
            if (fVar instanceof xk0.o) {
                linkedList.add(fVar);
            }
        }
        e(false).size();
        e(true).size();
        linkedList.size();
        return linkedList;
    }
}
