package vz0;

/* loaded from: classes14.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vz0.a f523163d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.r f523164e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vz0.y f523165f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(vz0.a aVar, yz5.r rVar, vz0.y yVar) {
        super(4);
        this.f523163d = aVar;
        this.f523164e = rVar;
        this.f523165f = yVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int i17;
        e0.g items = (e0.g) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        n0.o oVar = (n0.o) obj3;
        int intValue2 = ((java.lang.Number) obj4).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "$this$items");
        if ((intValue2 & 14) == 0) {
            i17 = (((n0.y0) oVar).e(items) ? 4 : 2) | intValue2;
        } else {
            i17 = intValue2;
        }
        if ((intValue2 & 112) == 0) {
            i17 |= ((n0.y0) oVar).c(intValue) ? 32 : 16;
        }
        if ((i17 & 731) == 146) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f384359a;
            }
        }
        java.lang.Object obj5 = n0.e1.f415025a;
        int i18 = z0.t.f550455q1;
        z0.t a17 = o1.g.a(z0.p.f550454d, this.f523163d, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a17, "<this>");
        z0.t l17 = d0.a3.l(d0.a3.j(a17, ((p2.h) ((n0.q4) ((e0.h) items).f327126a).mo128745x754a37bb()).f432913d * 1.0f), null, false, 3, null);
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.U(733328855);
        int i19 = z0.d.f550436a;
        s1.t0 c17 = d0.y.c(z0.a.f550422a, false, y0Var2, 0);
        y0Var2.U(-1323940314);
        p2.f fVar = (p2.f) y0Var2.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92179e);
        p2.s sVar = (p2.s) y0Var2.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92185k);
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4 k4Var = (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4) y0Var2.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92189o);
        u1.g.f505127i1.getClass();
        yz5.a aVar = u1.f.f505120b;
        yz5.q a18 = s1.g0.a(l17);
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
        ((u0.i) a18).mo147xb9724478(new n0.i4(y0Var2), y0Var2, 0);
        y0Var2.U(2058660585);
        y0Var2.U(-2137368960);
        this.f523164e.C(this.f523165f, java.lang.Integer.valueOf(intValue), y0Var2, java.lang.Integer.valueOf(i17 & 112));
        y0Var2.o(false);
        y0Var2.o(false);
        y0Var2.o(true);
        y0Var2.o(false);
        y0Var2.o(false);
        return jz5.f0.f384359a;
    }
}
