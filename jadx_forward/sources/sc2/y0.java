package sc2;

/* loaded from: classes2.dex */
public final class y0 implements zy2.ub {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.ub f487907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f487908e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487909f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.t01 f487910g;

    public y0(sc2.h1 h1Var, in5.s0 s0Var, r45.t01 t01Var) {
        this.f487908e = h1Var;
        this.f487909f = s0Var;
        this.f487910g = t01Var;
        if (!zy2.ub.class.isInterface()) {
            throw new java.lang.IllegalArgumentException("T must be an interface".toString());
        }
        java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(zy2.ub.class.getClassLoader(), new java.lang.Class[]{zy2.ub.class}, pm0.v.f438336b);
        if (newProxyInstance == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.tencent.mm.plugin.findersdk.api.IFinderVideoViewCallback");
        }
        this.f487907d = (zy2.ub) newProxyInstance;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
        pm0.v.X(new sc2.x0(this.f487908e, this.f487909f, this.f487910g));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
        this.f487907d.I(str, str2, i17, i18);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        this.f487907d.N(str, str2, str3, i17, i18);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void N5(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        sc2.h1 h1Var = this.f487908e;
        h1Var.getClass();
        ym5.a1.f(new sc2.e1(h1Var, this.f487909f));
    }

    @Override // zy2.ub
    public void e3(int i17, int i18) {
        this.f487907d.e3(i17, i18);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
        sc2.h1 h1Var = this.f487908e;
        h1Var.getClass();
        ym5.a1.f(new sc2.s(h1Var));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
        this.f487907d.l(str, str2);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void m2(java.lang.String str, java.lang.String str2, boolean z17) {
        sc2.h1 h1Var = this.f487908e;
        h1Var.getClass();
        ym5.a1.f(new sc2.s(h1Var));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void o(java.lang.String str, java.lang.String str2) {
        this.f487907d.o(str, str2);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    /* renamed from: onSeekComplete */
    public void mo55683xe1fdf750(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        this.f487907d.mo55683xe1fdf750(interfaceC26164x73fc6bc6);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void p2(java.lang.String str, java.lang.String str2) {
        this.f487907d.p2(str, str2);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void v3(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
        this.f487907d.v3(str, str2, i17, i18, i19);
    }
}
