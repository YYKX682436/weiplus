package en5;

/* loaded from: classes14.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aq.d f336918d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f336919e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f336920f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f336921g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(aq.d dVar, p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var, p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var2, yz5.l lVar) {
        super(3);
        this.f336918d = dVar;
        this.f336919e = e0Var;
        this.f336920f = e0Var2;
        this.f336921g = lVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        e0.g item = (e0.g) obj;
        n0.o oVar = (n0.o) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "$this$item");
        if ((intValue & 81) == 16) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f384359a;
            }
        }
        java.lang.Object obj4 = n0.e1.f415025a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        aq.d dVar = this.f336918d;
        int i17 = 0;
        for (java.lang.Object obj5 : dVar.f94383b) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.api.C4988x89c61bdd c4988x89c61bdd = (com.p314xaae8f345.mm.api.C4988x89c61bdd) obj5;
            arrayList.add(new jz5.o(c4988x89c61bdd.f134738f, java.lang.Long.valueOf(c4988x89c61bdd.f134736d), c4988x89c61bdd.f134743n));
            n0.y0 y0Var2 = (n0.y0) oVar;
            y0Var2.U(-597781459);
            if (i18 % 4 == 0 || i18 == dVar.f94383b.size()) {
                int i19 = z0.t.f550455q1;
                z0.p pVar = z0.p.f550454d;
                z0.t f17 = d0.a3.f(pVar, 0.0f, 1, null);
                float f18 = this.f336919e.f391648d;
                float f19 = 8;
                float f27 = ((float) 0.125d) * f19;
                z0.t i27 = d0.a2.i(f17, f18, f27, f18, f27);
                d0.e g17 = d0.p.f306716a.g(((float) 0.25d) * f19);
                y0Var2.U(693286680);
                int i28 = z0.d.f550436a;
                s1.t0 a17 = d0.n2.a(g17, z0.a.f550431j, y0Var2, 6);
                y0Var2.U(-1323940314);
                p2.f fVar = (p2.f) y0Var2.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92179e);
                p2.s sVar = (p2.s) y0Var2.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92185k);
                p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4 k4Var = (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4) y0Var2.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92189o);
                u1.g.f505127i1.getClass();
                yz5.a aVar = u1.f.f505120b;
                yz5.q a18 = s1.g0.a(i27);
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
                y0Var2.U(-678309503);
                y0Var2.U(2066821354);
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jz5.o oVar2 = (jz5.o) it.next();
                    int i29 = z0.t.f550455q1;
                    z0.t h17 = d0.a3.h(pVar, this.f336920f.f391648d);
                    y0Var2.U(-517002849);
                    yz5.l lVar = this.f336921g;
                    boolean e17 = y0Var2.e(lVar) | y0Var2.e(oVar2);
                    java.lang.Object y17 = y0Var2.y();
                    if (!e17) {
                        int i37 = n0.o.f415162a;
                        if (y17 != n0.n.f415153a) {
                            y0Var2.o(false);
                            en5.n0.c(a0.d0.d(h17, false, null, null, (yz5.a) y17, 7, null), (java.lang.String) oVar2.f384374d, (java.lang.Long) oVar2.f384375e, (java.lang.String) oVar2.f384376f, y0Var2, 0, 0);
                        }
                    }
                    y17 = new en5.d0(lVar, oVar2);
                    y0Var2.g0(y17);
                    y0Var2.o(false);
                    en5.n0.c(a0.d0.d(h17, false, null, null, (yz5.a) y17, 7, null), (java.lang.String) oVar2.f384374d, (java.lang.Long) oVar2.f384375e, (java.lang.String) oVar2.f384376f, y0Var2, 0, 0);
                }
                y0Var2.o(false);
                y0Var2.o(false);
                y0Var2.o(false);
                y0Var2.o(true);
                y0Var2.o(false);
                y0Var2.o(false);
                arrayList.clear();
            }
            y0Var2.o(false);
            i17 = i18;
        }
        java.lang.Object obj6 = n0.e1.f415025a;
        return jz5.f0.f384359a;
    }
}
