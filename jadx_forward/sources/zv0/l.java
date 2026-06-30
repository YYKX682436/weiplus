package zv0;

/* loaded from: classes5.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zv0.f0 f557730d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ConcurrentHashMap f557731e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f557732f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f557733g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(zv0.f0 f0Var, java.util.concurrent.ConcurrentHashMap concurrentHashMap, rv0.n1 n1Var, ex0.a0 a0Var) {
        super(1);
        this.f557730d = f0Var;
        this.f557731e = concurrentHashMap;
        this.f557732f = n1Var;
        this.f557733g = a0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        zv0.f0 f0Var = this.f557730d;
        if (f0Var.m160994x67ad68cc()) {
            for (java.util.Map.Entry entry : this.f557731e.entrySet()) {
                com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = (com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78) entry.getKey();
                java.lang.String transitionId = (java.lang.String) entry.getValue();
                ex0.a0 a0Var = this.f557733g;
                ex0.r K = a0Var.K(c3971x241f78);
                ex0.j0 j0Var = K instanceof ex0.j0 ? (ex0.j0) K : null;
                if (j0Var != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transitionId, "transitionId");
                    a0Var.x(j0Var, transitionId);
                    a0Var.J(cx0.d.f306043f.a(cx0.d.f306042e), null);
                    f0Var.H();
                }
            }
        }
        f0Var.H();
        rv0.n1 n1Var = this.f557732f;
        p3325xe03a0797.p3326xc267989b.l.d(n1Var.m158345xefc66565(), null, null, new zv0.k(n1Var, null), 3, null);
        return java.lang.Boolean.TRUE;
    }
}
