package mz0;

/* loaded from: classes5.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f414439d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f414440e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dz0.l f414441f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(mz0.b2 b2Var, n0.v2 v2Var, dz0.l lVar) {
        super(2);
        this.f414439d = b2Var;
        this.f414440e = v2Var;
        this.f414441f = lVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f384359a;
            }
        }
        java.lang.Object obj3 = n0.e1.f415025a;
        mz0.b2 b2Var = this.f414439d;
        boolean booleanValue = ((java.lang.Boolean) ((n0.q4) b2Var.f414424o).mo128745x754a37bb()).booleanValue();
        android.view.TextureView textureView = (android.view.TextureView) ((n0.q4) b2Var.f414421i).mo128745x754a37bb();
        n0.v2 v2Var = b2Var.f414435z;
        n0.v2 v2Var2 = this.f414440e;
        n0.y0 y0Var2 = (n0.y0) oVar;
        float O6 = mz0.b2.O6(b2Var) / ((p2.f) y0Var2.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92179e)).mo7005x9a59d0b2();
        mz0.x xVar = new mz0.x(b2Var);
        mz0.y yVar = new mz0.y(b2Var);
        mz0.z zVar = new mz0.z(b2Var);
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m7 o76 = b2Var.o7();
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.c1 c1Var = (com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.c1) b2Var.f414429t.mo141623x754a37bb();
        y0Var2.U(693099541);
        dz0.l lVar = this.f414441f;
        dz0.x xVar2 = ((com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b) lVar).f151322m;
        n0.e5 a17 = v0.c.a(xVar2.f326585c, kz5.p0.f395529d, y0Var2, 72);
        n0.e5 a18 = v0.c.a(xVar2.f326586d, new com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356("", "", "", com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44, new java.lang.Object[0]), y0Var2, 72);
        p012xc85e97e9.p093xedfae76a.j0 j0Var = xVar2.f326587e;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        n0.e5 a19 = v0.c.a(j0Var, bool, y0Var2, 56);
        n0.e5 a27 = v0.c.a(xVar2.f326588f, bool, y0Var2, 56);
        y0Var2.U(-378583377);
        java.lang.Object y17 = y0Var2.y();
        java.lang.Object obj4 = y17;
        if (y17 == n0.n.f415153a) {
            ty0.b1 b1Var = new ty0.b1(a17, a18, new mz0.t(b2Var), a19, a27, new mz0.u(lVar), new mz0.v(lVar), new mz0.w(b2Var), false, b2Var.h7(), 256, null);
            b2Var.f414422m = b1Var;
            y0Var2.g0(b1Var);
            obj4 = b1Var;
        }
        ty0.b1 b1Var2 = (ty0.b1) obj4;
        y0Var2.o(false);
        y0Var2.o(false);
        kz0.k1.b(booleanValue, textureView, v2Var, v2Var2, O6, xVar, yVar, zVar, o76, c1Var, b1Var2, (com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p920xd1075a44.C11009x358a2db0) b2Var.f414431v.mo141623x754a37bb(), (com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.y) b2Var.f414430u.mo141623x754a37bb(), b2Var.F, b2Var.q7() ? new mz0.a0(b2Var) : null, b2Var.i7(), (gz0.i) b2Var.A.mo141623x754a37bb(), new mz0.b0(b2Var), b2Var.mo144225x95f74600(), oVar, 1207962688, 136315464);
        return jz5.f0.f384359a;
    }
}
