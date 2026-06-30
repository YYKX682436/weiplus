package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes14.dex */
public final class y2 extends p3325xe03a0797.p3326xc267989b.w2 {

    /* renamed from: h, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.c3 f392235h;

    /* renamed from: i, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.z2 f392236i;

    /* renamed from: m, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.x f392237m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Object f392238n;

    public y2(p3325xe03a0797.p3326xc267989b.c3 c3Var, p3325xe03a0797.p3326xc267989b.z2 z2Var, p3325xe03a0797.p3326xc267989b.x xVar, java.lang.Object obj) {
        this.f392235h = c3Var;
        this.f392236i = z2Var;
        this.f392237m = xVar;
        this.f392238n = obj;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ java.lang.Object mo146xb9724478(java.lang.Object obj) {
        u((java.lang.Throwable) obj);
        return jz5.f0.f384359a;
    }

    @Override // p3325xe03a0797.p3326xc267989b.g0
    public void u(java.lang.Throwable th6) {
        p3325xe03a0797.p3326xc267989b.c3 c3Var = this.f392235h;
        p3325xe03a0797.p3326xc267989b.x X = c3Var.X(this.f392237m);
        p3325xe03a0797.p3326xc267989b.z2 z2Var = this.f392236i;
        java.lang.Object obj = this.f392238n;
        if (X == null || !c3Var.g0(z2Var, X, obj)) {
            c3Var.u(c3Var.I(z2Var, obj));
        }
    }
}
