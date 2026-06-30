package a0;

/* loaded from: classes14.dex */
public final class v0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c0.o f81850d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f81851e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(c0.o oVar, boolean z17) {
        super(3);
        this.f81850d = oVar;
        this.f81851e = z17;
    }

    public static final boolean a(n0.v2 v2Var) {
        return ((java.lang.Boolean) v2Var.mo128745x754a37bb()).booleanValue();
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        z0.t tVar;
        z0.t composed = (z0.t) obj;
        ((java.lang.Number) obj3).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composed, "$this$composed");
        n0.y0 y0Var = (n0.y0) ((n0.o) obj2);
        y0Var.U(1871352361);
        y0Var.U(773894976);
        y0Var.U(-492369756);
        java.lang.Object y17 = y0Var.y();
        java.lang.Object obj4 = n0.n.f415153a;
        if (y17 == obj4) {
            n0.o1 o1Var = new n0.o1(n0.d2.i(oz5.m.f431862d, y0Var));
            y0Var.g0(o1Var);
            y17 = o1Var;
        }
        y0Var.o(false);
        p3325xe03a0797.p3326xc267989b.y0 y0Var2 = ((n0.o1) y17).f415164d;
        y0Var.o(false);
        y0Var.U(-492369756);
        java.lang.Object y18 = y0Var.y();
        if (y18 == obj4) {
            y18 = n0.s4.c(null, null, 2, null);
            y0Var.g0(y18);
        }
        y0Var.o(false);
        n0.v2 v2Var = (n0.v2) y18;
        y0Var.U(-492369756);
        java.lang.Object y19 = y0Var.y();
        if (y19 == obj4) {
            y19 = n0.s4.c(null, null, 2, null);
            y0Var.g0(y19);
        }
        y0Var.o(false);
        n0.v2 v2Var2 = (n0.v2) y19;
        y0Var.U(-492369756);
        java.lang.Object y27 = y0Var.y();
        if (y27 == obj4) {
            y27 = n0.s4.c(java.lang.Boolean.FALSE, null, 2, null);
            y0Var.g0(y27);
        }
        y0Var.o(false);
        n0.v2 v2Var3 = (n0.v2) y27;
        y0Var.U(-492369756);
        java.lang.Object y28 = y0Var.y();
        if (y28 == obj4) {
            y28 = new c1.d0();
            y0Var.g0(y28);
        }
        y0Var.o(false);
        c1.d0 d0Var = (c1.d0) y28;
        y0Var.U(-492369756);
        java.lang.Object y29 = y0Var.y();
        if (y29 == obj4) {
            y29 = new g0.h();
            y0Var.g0(y29);
        }
        y0Var.o(false);
        g0.f bringIntoViewRequester = (g0.f) y29;
        c0.o oVar = this.f81850d;
        n0.d2.c(oVar, new a0.k0(v2Var, oVar), y0Var, 0);
        boolean z17 = this.f81851e;
        n0.d2.c(java.lang.Boolean.valueOf(z17), new a0.n0(z17, y0Var2, v2Var, oVar), y0Var, 0);
        z0.t tVar2 = z0.p.f550454d;
        if (z17) {
            if (a(v2Var3)) {
                y0Var.U(-492369756);
                java.lang.Object y37 = y0Var.y();
                if (y37 == obj4) {
                    y37 = new a0.c1();
                    y0Var.g0(y37);
                }
                y0Var.o(false);
                tVar = (z0.t) y37;
            } else {
                tVar = tVar2;
            }
            z0.t b17 = y1.t.b(tVar2, false, new a0.p0(v2Var3, d0Var));
            a0.q0 q0Var = new a0.q0(v2Var2);
            p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.e3 e3Var = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.e3.f92086d;
            z0.t a17 = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.f3.a(b17, e3Var, new a0.q2(q0Var));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a17, "<this>");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bringIntoViewRequester, "bringIntoViewRequester");
            z0.t a18 = c1.c.a(c1.g0.a(z0.m.a(a17, e3Var, new g0.k(bringIntoViewRequester)), d0Var).k(tVar), new a0.u0(y0Var2, v2Var3, bringIntoViewRequester, v2Var2, v2Var, this.f81850d));
            t1.f fVar = c1.w.f119315a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a18, "<this>");
            tVar2 = z0.m.a(a18, e3Var, c1.v.f119314d);
        }
        y0Var.o(false);
        return tVar2;
    }
}
