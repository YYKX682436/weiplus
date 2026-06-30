package s2;

/* loaded from: classes14.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s2.b0 f483781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f483782e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s2.b0 b0Var, n0.e5 e5Var) {
        super(2);
        this.f483781d = b0Var;
        this.f483782e = e5Var;
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
        z0.t b17 = y1.t.b(z0.p.f550454d, false, s2.n.f483778d);
        s2.b0 b0Var = this.f483781d;
        s2.o oVar2 = new s2.o(b0Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(b17, "<this>");
        z0.t a17 = b1.a.a(b17.k(new s1.k1(oVar2, p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.e3.f92086d)), b0Var.m163639x87df5135() ? 1.0f : 0.0f);
        u0.a b18 = u0.j.b(oVar, 606497925, true, new s2.p(this.f483782e));
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.U(1406149896);
        s2.u uVar = s2.u.f483786a;
        y0Var2.U(-1323940314);
        p2.f fVar = (p2.f) y0Var2.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92179e);
        p2.s sVar = (p2.s) y0Var2.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92185k);
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4 k4Var = (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4) y0Var2.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92189o);
        u1.g.f505127i1.getClass();
        yz5.a aVar = u1.f.f505120b;
        yz5.q a18 = s1.g0.a(a17);
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
        n0.i5.a(oVar, uVar, u1.f.f505123e);
        n0.i5.a(oVar, fVar, u1.f.f505122d);
        n0.i5.a(oVar, sVar, u1.f.f505124f);
        n0.i5.a(oVar, k4Var, u1.f.f505125g);
        y0Var2.n();
        ((u0.i) a18).mo147xb9724478(new n0.i4(oVar), oVar, 0);
        y0Var2.U(2058660585);
        ((u0.i) b18).mo149xb9724478(oVar, 6);
        y0Var2.o(false);
        y0Var2.o(true);
        y0Var2.o(false);
        y0Var2.o(false);
        return jz5.f0.f384359a;
    }
}
