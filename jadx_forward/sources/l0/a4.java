package l0;

/* loaded from: classes14.dex */
public final class a4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f395577d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d0.d2 f395578e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f395579f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f395580g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(n0.v2 v2Var, d0.d2 d2Var, yz5.p pVar, int i17) {
        super(2);
        this.f395577d = v2Var;
        this.f395578e = d2Var;
        this.f395579f = pVar;
        this.f395580g = i17;
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
        int i17 = z0.t.f550455q1;
        z0.t outlineCutout = s1.c0.b(z0.p.f550454d, "border");
        long j17 = ((d1.k) this.f395577d.mo128745x754a37bb()).f307177a;
        float f17 = l0.c1.f395626a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outlineCutout, "$this$outlineCutout");
        d0.d2 paddingValues = this.f395578e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paddingValues, "paddingValues");
        z0.t c17 = b1.j.c(outlineCutout, new l0.b1(j17, paddingValues));
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.U(733328855);
        int i18 = z0.d.f550436a;
        s1.t0 c18 = d0.y.c(z0.a.f550422a, true, oVar, 48);
        y0Var2.U(-1323940314);
        p2.f fVar = (p2.f) y0Var2.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92179e);
        p2.s sVar = (p2.s) y0Var2.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92185k);
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4 k4Var = (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4) y0Var2.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92189o);
        u1.g.f505127i1.getClass();
        yz5.a aVar = u1.f.f505120b;
        yz5.q a17 = s1.g0.a(c17);
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
        n0.i5.a(oVar, c18, u1.f.f505123e);
        n0.i5.a(oVar, fVar, u1.f.f505122d);
        n0.i5.a(oVar, sVar, u1.f.f505124f);
        n0.i5.a(oVar, k4Var, u1.f.f505125g);
        y0Var2.n();
        ((u0.i) a17).mo147xb9724478(new n0.i4(oVar), oVar, 0);
        y0Var2.U(2058660585);
        y0Var2.U(-2137368960);
        y0Var2.U(1029492925);
        yz5.p pVar = this.f395579f;
        if (pVar != null) {
            pVar.mo149xb9724478(oVar, java.lang.Integer.valueOf((this.f395580g >> 12) & 14));
        }
        y0Var2.o(false);
        y0Var2.o(false);
        y0Var2.o(false);
        y0Var2.o(true);
        y0Var2.o(false);
        y0Var2.o(false);
        return jz5.f0.f384359a;
    }
}
