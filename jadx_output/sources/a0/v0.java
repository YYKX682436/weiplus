package a0;

/* loaded from: classes14.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c0.o f317d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f318e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(c0.o oVar, boolean z17) {
        super(3);
        this.f317d = oVar;
        this.f318e = z17;
    }

    public static final boolean a(n0.v2 v2Var) {
        return ((java.lang.Boolean) v2Var.getValue()).booleanValue();
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        z0.t tVar;
        z0.t composed = (z0.t) obj;
        ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(composed, "$this$composed");
        n0.y0 y0Var = (n0.y0) ((n0.o) obj2);
        y0Var.U(1871352361);
        y0Var.U(773894976);
        y0Var.U(-492369756);
        java.lang.Object y17 = y0Var.y();
        java.lang.Object obj4 = n0.n.f333620a;
        if (y17 == obj4) {
            n0.o1 o1Var = new n0.o1(n0.d2.i(oz5.m.f350329d, y0Var));
            y0Var.g0(o1Var);
            y17 = o1Var;
        }
        y0Var.o(false);
        kotlinx.coroutines.y0 y0Var2 = ((n0.o1) y17).f333631d;
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
        c0.o oVar = this.f317d;
        n0.d2.c(oVar, new a0.k0(v2Var, oVar), y0Var, 0);
        boolean z17 = this.f318e;
        n0.d2.c(java.lang.Boolean.valueOf(z17), new a0.n0(z17, y0Var2, v2Var, oVar), y0Var, 0);
        z0.t tVar2 = z0.p.f468921d;
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
            androidx.compose.ui.platform.e3 e3Var = androidx.compose.ui.platform.e3.f10553d;
            z0.t a17 = androidx.compose.ui.platform.f3.a(b17, e3Var, new a0.q2(q0Var));
            kotlin.jvm.internal.o.g(a17, "<this>");
            kotlin.jvm.internal.o.g(bringIntoViewRequester, "bringIntoViewRequester");
            z0.t a18 = c1.c.a(c1.g0.a(z0.m.a(a17, e3Var, new g0.k(bringIntoViewRequester)), d0Var).k(tVar), new a0.u0(y0Var2, v2Var3, bringIntoViewRequester, v2Var2, v2Var, this.f317d));
            t1.f fVar = c1.w.f37782a;
            kotlin.jvm.internal.o.g(a18, "<this>");
            tVar2 = z0.m.a(a18, e3Var, c1.v.f37781d);
        }
        y0Var.o(false);
        return tVar2;
    }
}
