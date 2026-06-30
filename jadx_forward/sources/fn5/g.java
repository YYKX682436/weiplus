package fn5;

/* loaded from: classes14.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn5.n0 f346198d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f346199e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f346200f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f346201g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(fn5.n0 n0Var, yz5.a aVar, yz5.l lVar, yz5.l lVar2) {
        super(2);
        this.f346198d = n0Var;
        this.f346199e = aVar;
        this.f346200f = lVar;
        this.f346201g = lVar2;
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
        int i17 = z0.t.f550455q1;
        z0.p pVar = z0.p.f550454d;
        z0.t e17 = d0.a3.e(pVar, 0.0f, 1, null);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        z0.t c17 = a0.b.c(e17, rz0.a.b(com.p314xaae8f345.mm.R.C30859x5a72f63.f560045u, context), null, 2, null);
        yz5.l lVar = this.f346200f;
        yz5.l lVar2 = this.f346201g;
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.U(-483455358);
        d0.l lVar3 = d0.p.f306719d;
        int i18 = z0.d.f550436a;
        s1.t0 a17 = d0.j0.a(lVar3, z0.a.f550433l, y0Var2, 0);
        y0Var2.U(-1323940314);
        p2.f fVar = (p2.f) y0Var2.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92179e);
        p2.s sVar = (p2.s) y0Var2.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92185k);
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4 k4Var = (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4) y0Var2.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92189o);
        u1.g.f505127i1.getClass();
        yz5.a aVar = u1.f.f505120b;
        yz5.q a18 = s1.g0.a(c17);
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
        n0.i5.a(y0Var2, a17, u1.f.f505123e);
        n0.i5.a(y0Var2, fVar, u1.f.f505122d);
        n0.i5.a(y0Var2, sVar, u1.f.f505124f);
        n0.i5.a(y0Var2, k4Var, u1.f.f505125g);
        y0Var2.n();
        ((u0.i) a18).mo147xb9724478(new n0.i4(y0Var2), y0Var2, 0);
        y0Var2.U(2058660585);
        y0Var2.U(-1163856341);
        d0.m0 m0Var = d0.m0.f306704a;
        float f17 = 8;
        d0.e3.a(d0.a3.g(pVar, ((float) 1.5d) * f17), y0Var2, 6);
        yz5.a aVar2 = this.f346199e;
        fn5.n0 n0Var = this.f346198d;
        en5.i1.b(n0Var, aVar2, y0Var2, 8);
        d0.e3.a(d0.a3.g(pVar, 1 * f17), y0Var2, 6);
        z0.t a19 = d0.k0.a(m0Var, pVar, 1.0f, false, 2, null);
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        fn5.p.e(d0.a3.f(a0.b.c(a19, rz0.a.b(com.p314xaae8f345.mm.R.C30859x5a72f63.f560047w, context2), null, 2, null), 0.0f, 1, null), lVar, n0Var, lVar2, y0Var2, 512);
        y0Var2.o(false);
        y0Var2.o(false);
        y0Var2.o(true);
        y0Var2.o(false);
        y0Var2.o(false);
        return jz5.f0.f384359a;
    }
}
