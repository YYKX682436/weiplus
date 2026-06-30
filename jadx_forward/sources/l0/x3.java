package l0;

/* loaded from: classes14.dex */
public final class x3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f396152d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l0.m3 f396153e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f396154f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f396155g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.p f396156h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(float f17, l0.m3 m3Var, boolean z17, int i17, int i18, yz5.p pVar) {
        super(3);
        this.f396152d = f17;
        this.f396153e = m3Var;
        this.f396154f = z17;
        this.f396155g = i17;
        this.f396156h = pVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        z0.t modifier = (z0.t) obj;
        n0.o oVar = (n0.o) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modifier, "modifier");
        if ((intValue & 14) == 0) {
            intValue |= ((n0.y0) oVar).e(modifier) ? 4 : 2;
        }
        if ((intValue & 91) == 18) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f384359a;
            }
        }
        z0.t a17 = b1.a.a(modifier, this.f396152d);
        yz5.p pVar = this.f396156h;
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.U(733328855);
        int i17 = z0.d.f550436a;
        s1.t0 c17 = d0.y.c(z0.a.f550422a, false, oVar, 0);
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
        n0.i5.a(oVar, c17, u1.f.f505123e);
        n0.i5.a(oVar, fVar, u1.f.f505122d);
        n0.i5.a(oVar, sVar, u1.f.f505124f);
        n0.i5.a(oVar, k4Var, u1.f.f505125g);
        y0Var2.n();
        ((u0.i) a18).mo147xb9724478(new n0.i4(oVar), oVar, 0);
        y0Var2.U(2058660585);
        y0Var2.U(-2137368960);
        y0Var2.U(1188063364);
        l0.y yVar = (l0.y) this.f396153e;
        yVar.getClass();
        y0Var2.U(264799724);
        n0.e5 e17 = n0.s4.e(new e1.y(this.f396154f ? yVar.f396179t : yVar.f396180u), y0Var2, 0);
        y0Var2.o(false);
        l0.h4.b(((e1.y) e17.mo128745x754a37bb()).f327855a, ((l0.j5) ((n0.y0) oVar).i(l0.l5.f395909a)).f395840g, null, pVar, oVar, (this.f396155g >> 6) & 7168, 4);
        y0Var2.o(false);
        y0Var2.o(false);
        y0Var2.o(false);
        y0Var2.o(true);
        y0Var2.o(false);
        y0Var2.o(false);
        return jz5.f0.f384359a;
    }
}
