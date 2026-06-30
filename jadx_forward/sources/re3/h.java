package re3;

/* loaded from: classes14.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p935xe99f85f3.C11098x3efa6197 f476050d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.p314xaae8f345.mm.p935xe99f85f3.C11098x3efa6197 c11098x3efa6197) {
        super(2);
        this.f476050d = c11098x3efa6197;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        int intValue = ((java.lang.Number) obj2).intValue() & 11;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (intValue == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return f0Var;
            }
        }
        java.lang.Object obj3 = n0.e1.f415025a;
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.U(1366216429);
        java.lang.Object y17 = y0Var2.y();
        int i17 = n0.o.f415162a;
        java.lang.Object obj4 = n0.n.f415153a;
        if (y17 == obj4) {
            y17 = n0.s4.c(java.lang.Boolean.FALSE, null, 2, null);
            y0Var2.g0(y17);
        }
        n0.v2 v2Var = (n0.v2) y17;
        y0Var2.o(false);
        int i18 = z0.t.f550455q1;
        z0.p pVar = z0.p.f550454d;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        z0.t e17 = d0.a3.e(a0.b.c(pVar, rz0.a.b(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a, context), null, 2, null), 0.0f, 1, null);
        int i19 = z0.d.f550436a;
        z0.t l17 = d0.a3.l(e17, z0.a.f550426e, false, 2, null);
        y0Var2.U(733328855);
        s1.t0 c17 = d0.y.c(z0.a.f550422a, false, y0Var2, 0);
        y0Var2.U(-1323940314);
        p2.f fVar = (p2.f) y0Var2.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92179e);
        p2.s sVar = (p2.s) y0Var2.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92185k);
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4 k4Var = (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4) y0Var2.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92189o);
        u1.g.f505127i1.getClass();
        yz5.a aVar = u1.f.f505120b;
        yz5.q a17 = s1.g0.a(l17);
        if (!(y0Var2.f415294b instanceof n0.e)) {
            n0.l.a();
            throw null;
        }
        y0Var2.X();
        if (y0Var2.L) {
            y0Var2.j(aVar);
        } else {
            y0Var2.i0();
        }
        y0Var2.f415317y = false;
        n0.i5.a(y0Var2, c17, u1.f.f505123e);
        n0.i5.a(y0Var2, fVar, u1.f.f505122d);
        n0.i5.a(y0Var2, sVar, u1.f.f505124f);
        n0.i5.a(y0Var2, k4Var, u1.f.f505125g);
        y0Var2.n();
        ((u0.i) a17).mo147xb9724478(new n0.i4(y0Var2), y0Var2, 0);
        y0Var2.U(2058660585);
        y0Var2.U(-2137368960);
        y.q.c(((java.lang.Boolean) v2Var.mo128745x754a37bb()).booleanValue(), null, null, null, null, u0.j.b(y0Var2, -693452133, true, new re3.f(this.f476050d)), y0Var2, 196608, 30);
        y0Var2.o(false);
        y0Var2.o(false);
        y0Var2.o(true);
        y0Var2.o(false);
        y0Var2.o(false);
        y0Var2.U(1366217487);
        boolean e18 = y0Var2.e(v2Var);
        java.lang.Object y18 = y0Var2.y();
        if (e18 || y18 == obj4) {
            y18 = new re3.g(v2Var, null);
            y0Var2.g0(y18);
        }
        y0Var2.o(false);
        n0.d2.f(f0Var, (yz5.p) y18, y0Var2, 70);
        return f0Var;
    }
}
