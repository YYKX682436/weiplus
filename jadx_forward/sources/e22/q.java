package e22;

/* loaded from: classes14.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f328232d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f328233e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f328234f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f328235g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(boolean z17, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, boolean z18, yz5.a aVar) {
        super(3);
        this.f328232d = z17;
        this.f328233e = c19792x256d2725;
        this.f328234f = z18;
        this.f328235g = aVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean z17;
        boolean z18;
        boolean z19;
        z0.p pVar;
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.e3 e3Var;
        n0.o oVar;
        n0.y0 y0Var;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        d0.f0 BoxWithConstraints = (d0.f0) obj;
        n0.o oVar2 = (n0.o) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((intValue & 14) == 0) {
            intValue |= ((n0.y0) oVar2).e(BoxWithConstraints) ? 4 : 2;
        }
        if ((intValue & 91) == 18) {
            n0.y0 y0Var2 = (n0.y0) oVar2;
            if (y0Var2.v()) {
                y0Var2.O();
                return jz5.f0.f384359a;
            }
        }
        java.lang.Object obj4 = n0.e1.f415025a;
        int h17 = (int) ((p2.c.h(((d0.g0) BoxWithConstraints).f306653b) * 4.0d) / 3.0d);
        int i17 = z0.t.f550455q1;
        z0.p pVar2 = z0.p.f550454d;
        z0.t f17 = d0.a3.f(pVar2, 0.0f, 1, null);
        n0.h3 h3Var = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92179e;
        n0.y0 y0Var3 = (n0.y0) oVar2;
        z0.t a17 = b1.a.a(d0.a3.g(f17, h17 / ((p2.f) y0Var3.i(h3Var)).mo7005x9a59d0b2()), this.f328232d ? 0.2f : 1.0f);
        boolean z27 = this.f328234f;
        boolean z28 = this.f328232d;
        y0Var3.U(733328855);
        int i18 = z0.d.f550436a;
        s1.t0 c17 = d0.y.c(z0.a.f550422a, false, oVar2, 0);
        y0Var3.U(-1323940314);
        p2.f fVar = (p2.f) y0Var3.i(h3Var);
        p2.s sVar = (p2.s) y0Var3.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92185k);
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4 k4Var = (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4) y0Var3.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92189o);
        u1.g.f505127i1.getClass();
        yz5.a aVar = u1.f.f505120b;
        yz5.q a18 = s1.g0.a(a17);
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
        n0.i5.a(oVar2, c17, u1.f.f505123e);
        n0.i5.a(oVar2, fVar, u1.f.f505122d);
        n0.i5.a(oVar2, sVar, u1.f.f505124f);
        n0.i5.a(oVar2, k4Var, u1.f.f505125g);
        y0Var3.n();
        ((u0.i) a18).mo147xb9724478(new n0.i4(oVar2), oVar2, 0);
        y0Var3.U(2058660585);
        y0Var3.U(-2137368960);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = this.f328233e.m76802x2dd01666();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e = (m76802x2dd01666 == null || (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) == null) ? null : (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e);
        y0Var3.U(1175260593);
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.e3 e3Var2 = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.e3.f92086d;
        if (c19788xd7cfd73e != null) {
            java.lang.String str = c19788xd7cfd73e.m76623xd93f812f() + c19788xd7cfd73e.m76624x4c9b7dca();
            java.util.LinkedList<r45.vf2> m76622xfb856031 = c19788xd7cfd73e.m76622xfb856031();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76622xfb856031, "getSpec(...)");
            r45.vf2 vf2Var = (r45.vf2) kz5.n0.Z(m76622xfb856031);
            y0Var3.U(604400049);
            int i19 = u5.e.f506235a;
            u5.d dVar = u5.d.f506234b;
            r5.j a19 = u5.c.a(u5.y.f506287a, oVar2, 6);
            y0Var3.U(604401818);
            c6.h hVar = new c6.h((android.content.Context) y0Var3.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.a1.f92036b));
            hVar.f120338c = str;
            z18 = z28;
            z19 = z27;
            u5.s a27 = u5.x.a(hVar.a(), a19, dVar, oVar2, nd1.k2.f72953x366c91de, 0);
            y0Var3.o(false);
            y0Var3.o(false);
            int i27 = s1.p.f483587a;
            y0Var = y0Var3;
            a0.q1.a(a27, null, d0.a3.e(pVar2, 0.0f, 1, null), null, s1.o.f483577a, 0.0f, null, oVar2, 25008, 104);
            if (vf2Var != null) {
                java.lang.String a28 = y46.b.a(vf2Var.m75939xb282bd08(8), vf2Var.m75939xb282bd08(8) >= 3600000 ? "H:mm:ss" : "mm:ss", true);
                a2.o1 o1Var = new a2.o1(e1.y.f327848f, ((p2.f) y0Var.i(h3Var)).z(12), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262140, null);
                z0.d dVar2 = z0.a.f550428g;
                boolean z29 = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.f3.f92095a;
                d0.q qVar = new d0.q(dVar2, false, e3Var2);
                pVar2.k(qVar);
                z17 = false;
                pVar = pVar2;
                e3Var = e3Var2;
                oVar = oVar2;
                l0.e5.c(a28, d0.a2.f(qVar, 4), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, o1Var, oVar, 0, 0, 32764);
                y0Var = y0Var;
            } else {
                oVar = oVar2;
                pVar = pVar2;
                e3Var = e3Var2;
                z17 = false;
            }
        } else {
            z17 = false;
            z18 = z28;
            z19 = z27;
            pVar = pVar2;
            e3Var = e3Var2;
            oVar = oVar2;
            y0Var = y0Var3;
        }
        y0Var.o(z17);
        z0.d dVar3 = z0.a.f550424c;
        boolean z37 = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.f3.f92095a;
        d0.q qVar2 = new d0.q(dVar3, z17, e3Var);
        pVar.k(qVar2);
        z0.t f18 = d0.a2.f(qVar2, 4);
        y0Var.U(1175262004);
        java.lang.Object y17 = y0Var.y();
        int i28 = n0.o.f415162a;
        java.lang.Object obj5 = n0.n.f415153a;
        if (y17 == obj5) {
            y17 = new c0.p();
            y0Var.g0(y17);
        }
        c0.o oVar3 = (c0.o) y17;
        y0Var.o(z17);
        y0Var.U(1175262066);
        yz5.a aVar2 = this.f328235g;
        boolean e17 = y0Var.e(aVar2);
        java.lang.Object y18 = y0Var.y();
        if (e17 || y18 == obj5) {
            y18 = new e22.p(aVar2);
            y0Var.g0(y18);
        }
        y0Var.o(z17);
        e22.a1.g(z19, z18, a0.d0.c(f18, oVar3, null, false, null, null, (yz5.a) y18, 28, null), oVar, 0, 0);
        y0Var.o(z17);
        y0Var.o(z17);
        y0Var.o(true);
        y0Var.o(z17);
        y0Var.o(z17);
        return jz5.f0.f384359a;
    }
}
