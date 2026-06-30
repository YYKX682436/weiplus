package sc2;

/* loaded from: classes2.dex */
public final class y6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ad2.h f487925d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f487926e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f487927f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(ad2.h hVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(1);
        this.f487925d = hVar;
        this.f487926e = i17;
        this.f487927f = h0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        xc2.p0 p0Var;
        java.lang.Object obj2;
        ad2.h thatObserver = (ad2.h) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thatObserver, "thatObserver");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(thatObserver, this.f487925d) && (p0Var = thatObserver.f84680h) != null) {
            java.util.LinkedList<r45.wf6> m76521x7528c3fb = p0Var.f534767a.m76521x7528c3fb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76521x7528c3fb, "getStyle(...)");
            java.util.Iterator<T> it = m76521x7528c3fb.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((r45.wf6) obj2).m75939xb282bd08(2) == p0Var.f534790s) {
                    break;
                }
            }
            r45.wf6 wf6Var = (r45.wf6) obj2;
            if (wf6Var != null) {
                if (this.f487926e == wf6Var.m75939xb282bd08(14) / 1000) {
                    this.f487927f.f391656d = thatObserver;
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
