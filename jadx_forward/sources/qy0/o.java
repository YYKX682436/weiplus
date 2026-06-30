package qy0;

/* loaded from: classes5.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qy0.d0 f449160d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f449161e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dz0.l f449162f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f449163g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(qy0.d0 d0Var, int i17, dz0.l lVar, java.util.List list) {
        super(2);
        this.f449160d = d0Var;
        this.f449161e = i17;
        this.f449162f = lVar;
        this.f449163g = list;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        float f17;
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m7 m7Var;
        n0.o oVar;
        boolean z17;
        ty0.b1 b1Var;
        n0.o oVar2 = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar2;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f384359a;
            }
        }
        java.lang.Object obj3 = n0.e1.f415025a;
        qy0.d0 d0Var = this.f449160d;
        qy0.m mVar = new qy0.m(d0Var);
        qy0.n nVar = new qy0.n(d0Var.m80379x76847179());
        float intValue = ((java.lang.Number) ((n0.q4) d0Var.A).mo128745x754a37bb()).intValue();
        n0.h3 h3Var = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92179e;
        n0.y0 y0Var2 = (n0.y0) oVar2;
        float mo7005x9a59d0b2 = intValue / ((p2.f) y0Var2.i(h3Var)).mo7005x9a59d0b2();
        float mo7005x9a59d0b22 = this.f449161e / ((p2.f) y0Var2.i(h3Var)).mo7005x9a59d0b2();
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m7 m7Var2 = d0Var.f449116y;
        y0Var2.U(639367031);
        n0.v2 v2Var = d0Var.f449113v;
        if (((java.lang.Boolean) ((n0.q4) v2Var).mo128745x754a37bb()).booleanValue()) {
            boolean z18 = !d0Var.W6().f151303f;
            dz0.l iMaasSdkUIC = this.f449162f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iMaasSdkUIC, "iMaasSdkUIC");
            y0Var2.U(-1079347522);
            dz0.x xVar = ((com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b) iMaasSdkUIC).f151322m;
            n0.e5 a17 = v0.c.a(xVar.f326585c, kz5.p0.f395529d, y0Var2, 72);
            p012xc85e97e9.p093xedfae76a.g0 g0Var = xVar.f326586d;
            y0Var2.U(215963239);
            java.lang.Object y17 = y0Var2.y();
            oVar = oVar2;
            java.lang.Object obj4 = n0.n.f415153a;
            if (y17 == obj4) {
                f17 = mo7005x9a59d0b22;
                m7Var = m7Var2;
                y17 = new com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356("", "", "", com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44, new java.lang.Object[0]);
                y0Var2.g0(y17);
            } else {
                f17 = mo7005x9a59d0b22;
                m7Var = m7Var2;
            }
            y0Var2.o(false);
            n0.e5 a18 = v0.c.a(g0Var, (com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356) y17, y0Var2, 72);
            p012xc85e97e9.p093xedfae76a.j0 j0Var = xVar.f326587e;
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            n0.e5 a19 = v0.c.a(j0Var, bool, y0Var2, 56);
            n0.e5 a27 = v0.c.a(xVar.f326588f, bool, y0Var2, 56);
            y0Var2.U(215963651);
            boolean f18 = y0Var2.f(z18);
            java.lang.Object y18 = y0Var2.y();
            java.lang.Object obj5 = y18;
            if (f18 || y18 == obj4) {
                ty0.b1 b1Var2 = new ty0.b1(a17, a18, new py0.e(d0Var), a19, a27, new py0.f(iMaasSdkUIC), new py0.g(iMaasSdkUIC), new py0.i(d0Var, iMaasSdkUIC), z18, null, 512, null);
                d0Var.f440566h = b1Var2;
                y0Var2.g0(b1Var2);
                obj5 = b1Var2;
            }
            b1Var = (ty0.b1) obj5;
            z17 = false;
            y0Var2.o(false);
            y0Var2.o(false);
        } else {
            f17 = mo7005x9a59d0b22;
            m7Var = m7Var2;
            oVar = oVar2;
            z17 = false;
            b1Var = d0Var.X6().f151285q;
        }
        y0Var2.o(z17);
        qy0.a1.a(mVar, nVar, mo7005x9a59d0b2, f17, m7Var, b1Var, ((java.lang.Boolean) ((n0.q4) v2Var).mo128745x754a37bb()).booleanValue(), d0Var.mo144225x95f74600(), d0Var.V6(), this.f449163g, d0Var.f449115x, oVar, 1090813952, 0);
        return jz5.f0.f384359a;
    }
}
