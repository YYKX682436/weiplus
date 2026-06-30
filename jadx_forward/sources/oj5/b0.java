package oj5;

/* loaded from: classes12.dex */
public class b0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.y2 {

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f427369c = new java.util.concurrent.ConcurrentHashMap();

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.y2
    public void a() {
        this.f427369c.clear();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.y2
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 b(int i17) {
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = (java.util.concurrent.ConcurrentLinkedDeque) this.f427369c.get(java.lang.Integer.valueOf(i17));
        if (concurrentLinkedDeque != null) {
            return (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) concurrentLinkedDeque.pollFirst();
        }
        return null;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.y2
    public void d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        java.lang.Object putIfAbsent;
        if (k3Var != null) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f427369c;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(k3Var.m8185xcdaf1228());
            java.lang.Object obj = concurrentHashMap.get(valueOf);
            if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, (obj = new java.util.concurrent.ConcurrentLinkedDeque()))) != null) {
                obj = putIfAbsent;
            }
            ((java.util.concurrent.ConcurrentLinkedDeque) obj).offerLast(k3Var);
        }
    }
}
