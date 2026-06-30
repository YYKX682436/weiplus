package tz0;

/* loaded from: classes14.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f504695d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f504696e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tz0.h f504697f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tz0.j f504698g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f504699h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(yz5.p pVar, boolean z17, tz0.h hVar, tz0.j jVar, java.lang.String str) {
        super(2);
        this.f504695d = pVar;
        this.f504696e = z17;
        this.f504697f = hVar;
        this.f504698g = jVar;
        this.f504699h = str;
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
        yz5.p pVar = this.f504695d;
        if (pVar != null) {
            n0.y0 y0Var2 = (n0.y0) oVar;
            y0Var2.U(794447646);
            pVar.mo149xb9724478(y0Var2, 0);
            y0Var2.o(false);
        } else {
            n0.y0 y0Var3 = (n0.y0) oVar;
            y0Var3.U(794447685);
            java.lang.String str = this.f504699h;
            y0Var3.U(733328855);
            int i17 = z0.t.f550455q1;
            z0.p pVar2 = z0.p.f550454d;
            int i18 = z0.d.f550436a;
            s1.t0 c17 = d0.y.c(z0.a.f550422a, false, y0Var3, 0);
            y0Var3.U(-1323940314);
            n0.h3 h3Var = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92179e;
            p2.f fVar = (p2.f) y0Var3.i(h3Var);
            p2.s sVar = (p2.s) y0Var3.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92185k);
            p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4 k4Var = (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4) y0Var3.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92189o);
            u1.g.f505127i1.getClass();
            yz5.a aVar = u1.f.f505120b;
            yz5.q a17 = s1.g0.a(pVar2);
            if (!(y0Var3.f415294b instanceof n0.e)) {
                n0.l.a();
                throw null;
            }
            y0Var3.X();
            if (y0Var3.L) {
                y0Var3.j(aVar);
            } else {
                y0Var3.i0();
            }
            y0Var3.f415317y = false;
            n0.i5.a(y0Var3, c17, u1.f.f505123e);
            n0.i5.a(y0Var3, fVar, u1.f.f505122d);
            n0.i5.a(y0Var3, sVar, u1.f.f505124f);
            n0.i5.a(y0Var3, k4Var, u1.f.f505125g);
            y0Var3.n();
            ((u0.i) a17).mo147xb9724478(new n0.i4(y0Var3), y0Var3, 0);
            y0Var3.U(2058660585);
            y0Var3.U(-2137368960);
            boolean z17 = this.f504696e;
            tz0.h hVar = this.f504697f;
            long j17 = z17 ? hVar.f504716b : hVar.f504718d;
            tz0.j jVar = this.f504698g;
            long z18 = ((p2.f) y0Var3.i(h3Var)).z(i65.a.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, i65.a.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, jVar.f504723d)));
            f2.r rVar = f2.r.f340356m;
            z0.d dVar = z0.a.f550426e;
            boolean z19 = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.f3.f92095a;
            d0.q qVar = new d0.q(dVar, false, p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.e3.f92086d);
            pVar2.k(qVar);
            tz0.x.b(str, d0.a2.h(qVar, i65.a.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, i65.a.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, jVar.f504724e)), 0.0f, 2, null), j17, z18, null, rVar, null, 0L, null, null, 0L, 0, false, 0, null, null, y0Var3, 196608, 0, 65488);
            y0Var3.o(false);
            y0Var3.o(false);
            y0Var3.o(true);
            y0Var3.o(false);
            y0Var3.o(false);
            y0Var3.o(false);
        }
        return jz5.f0.f384359a;
    }
}
