package ky;

/* loaded from: classes14.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ky.a f394868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f394869e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ky.a aVar, float f17) {
        super(2);
        this.f394868d = aVar;
        this.f394869e = f17;
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
        ky.a aVar = this.f394868d;
        ky.m0 a17 = aVar.a();
        ky.m0 m0Var = ky.m0.f394925d;
        z0.t i17 = d0.a3.i(z0.p.f550454d, ((p2.h) ((z.r) z.j.a(a17 != m0Var ? (float) 294.40000000000003d : 184, z.q.d(450, 0, z.j0.f550237a, 2, null), null, oVar, 0, 4)).mo128745x754a37bb()).f432913d, 56);
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.U(1518571596);
        boolean e17 = y0Var2.e(aVar);
        float f17 = this.f394869e;
        boolean b17 = e17 | y0Var2.b(f17);
        java.lang.Object y17 = y0Var2.y();
        java.lang.Object obj4 = n0.n.f415153a;
        if (b17 || y17 == obj4) {
            y17 = new ky.b(aVar, f17);
            y0Var2.g0(y17);
        }
        yz5.l gesture = (yz5.l) y17;
        y0Var2.o(false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(i17, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gesture, "gesture");
        y0Var2.U(1194403321);
        y0Var2.U(-708137160);
        java.lang.Object y18 = y0Var2.y();
        if (y18 == obj4) {
            y18 = n0.s4.c(ky.z.f394981a, null, 2, null);
            y0Var2.g0(y18);
        }
        n0.v2 v2Var = (n0.v2) y18;
        y0Var2.o(false);
        y0Var2.U(773894976);
        y0Var2.U(-492369756);
        java.lang.Object y19 = y0Var2.y();
        if (y19 == obj4) {
            n0.o1 o1Var = new n0.o1(n0.d2.i(oz5.m.f431862d, y0Var2));
            y0Var2.g0(o1Var);
            y19 = o1Var;
        }
        y0Var2.o(false);
        p3325xe03a0797.p3326xc267989b.y0 y0Var3 = ((n0.o1) y19).f415164d;
        y0Var2.o(false);
        ky.d0 d0Var = (ky.d0) v2Var.mo128745x754a37bb();
        y0Var2.U(-708137024);
        boolean e18 = y0Var2.e(gesture) | y0Var2.e(v2Var);
        java.lang.Object y27 = y0Var2.y();
        if (e18 || y27 == obj4) {
            y27 = new ky.e(gesture, v2Var, null);
            y0Var2.g0(y27);
        }
        y0Var2.o(false);
        n0.d2.f(d0Var, (yz5.p) y27, y0Var2, 64);
        z0.t b18 = p1.x0.b(i17, f0Var, new ky.h(y0Var3, v2Var, null));
        y0Var2.o(false);
        z0.t b19 = a0.b.b(b18, x1.b.a(com.p314xaae8f345.mm.R.C30859x5a72f63.ang, y0Var2, 0), i0.h.a(100));
        z0.c cVar = z0.a.f550432k;
        d0.e eVar = d0.p.f306721f;
        y0Var2.U(693286680);
        s1.t0 a18 = d0.n2.a(eVar, cVar, y0Var2, 54);
        y0Var2.U(-1323940314);
        p2.f fVar = (p2.f) y0Var2.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92179e);
        p2.s sVar = (p2.s) y0Var2.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92185k);
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4 k4Var = (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4) y0Var2.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92189o);
        u1.g.f505127i1.getClass();
        yz5.a aVar2 = u1.f.f505120b;
        yz5.q a19 = s1.g0.a(b19);
        if (!(y0Var2.f415294b instanceof n0.e)) {
            n0.l.a();
            throw null;
        }
        y0Var2.X();
        if (y0Var2.L) {
            y0Var2.j(aVar2);
        } else {
            y0Var2.i0();
        }
        y0Var2.f415317y = false;
        n0.i5.a(y0Var2, a18, u1.f.f505123e);
        n0.i5.a(y0Var2, fVar, u1.f.f505122d);
        n0.i5.a(y0Var2, sVar, u1.f.f505124f);
        n0.i5.a(y0Var2, k4Var, u1.f.f505125g);
        y0Var2.n();
        ((u0.i) a19).mo147xb9724478(new n0.i4(y0Var2), y0Var2, 0);
        y0Var2.U(2058660585);
        y0Var2.U(-678309503);
        d0.q2 q2Var = d0.q2.f306731a;
        y.q.b(q2Var, aVar.a() == ky.m0.f394926e, null, null, null, null, ky.t.f394966a, y0Var2, 1572870, 30);
        y.q.b(q2Var, aVar.a() == m0Var, null, null, null, null, ky.t.f394967b, y0Var2, 1572870, 30);
        y.q.b(q2Var, aVar.a() == ky.m0.f394927f, null, null, null, null, ky.t.f394968c, y0Var2, 1572870, 30);
        y0Var2.o(false);
        y0Var2.o(false);
        y0Var2.o(true);
        y0Var2.o(false);
        y0Var2.o(false);
        return f0Var;
    }
}
