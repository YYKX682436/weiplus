package yf2;

/* loaded from: classes3.dex */
public final class i implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f543244d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mm2.n0 f543245e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yf2.o f543246f;

    public i(p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var, mm2.n0 n0Var, yf2.o oVar) {
        this.f543244d = g0Var;
        this.f543245e = n0Var;
        this.f543246f = oVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object a17;
        re2.e0 e0Var = re2.j1.f475971b;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (e0Var == null) {
            return f0Var;
        }
        long j17 = e0Var.f475923c;
        if (j17 == 0) {
            return f0Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var = this.f543244d;
        return (j17 == g0Var.f391654d || (a17 = yf2.l.a(g0Var, this.f543245e, this.f543246f, interfaceC29045xdcb5ca57)) != pz5.a.f440719d) ? f0Var : a17;
    }
}
