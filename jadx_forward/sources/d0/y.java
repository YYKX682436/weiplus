package d0;

/* loaded from: classes14.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final s1.t0 f306774a = new d0.x(false, z0.a.f550422a);

    /* renamed from: b, reason: collision with root package name */
    public static final s1.t0 f306775b = d0.t.f306740a;

    public static final void a(z0.t modifier, n0.o oVar, int i17) {
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modifier, "modifier");
        java.lang.Object obj = n0.e1.f415025a;
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-211209833);
        if ((i17 & 14) == 0) {
            i18 = (y0Var.e(modifier) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i18 & 11) == 2 && y0Var.v()) {
            y0Var.O();
        } else {
            s1.t0 t0Var = f306775b;
            y0Var.U(-1323940314);
            p2.f fVar = (p2.f) y0Var.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92179e);
            p2.s sVar = (p2.s) y0Var.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92185k);
            p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4 k4Var = (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4) y0Var.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92189o);
            u1.f fVar2 = u1.g.f505127i1;
            fVar2.getClass();
            yz5.a aVar = u1.f.f505120b;
            yz5.q a17 = s1.g0.a(modifier);
            int i19 = (((((i18 << 3) & 112) | 384) << 9) & 7168) | 6;
            if (!(y0Var.f415294b instanceof n0.e)) {
                n0.l.a();
                throw null;
            }
            y0Var.X();
            if (y0Var.L) {
                y0Var.j(aVar);
            } else {
                y0Var.i0();
            }
            y0Var.f415317y = false;
            fVar2.getClass();
            n0.i5.a(y0Var, t0Var, u1.f.f505123e);
            fVar2.getClass();
            n0.i5.a(y0Var, fVar, u1.f.f505122d);
            fVar2.getClass();
            n0.i5.a(y0Var, sVar, u1.f.f505124f);
            fVar2.getClass();
            n0.i5.a(y0Var, k4Var, u1.f.f505125g);
            y0Var.n();
            ((u0.i) a17).mo147xb9724478(new n0.i4(y0Var), y0Var, java.lang.Integer.valueOf((i19 >> 3) & 112));
            y0Var.U(2058660585);
            y0Var.U(1021196736);
            if (((i19 >> 9) & 14 & 11) == 2 && y0Var.v()) {
                y0Var.O();
            }
            y0Var.o(false);
            y0Var.o(false);
            y0Var.o(true);
            y0Var.o(false);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 == null) {
            return;
        }
        ((n0.l3) q17).f415141d = new d0.r(modifier, i17);
    }

    public static final void b(s1.n1 n1Var, s1.o1 o1Var, s1.r0 r0Var, p2.s sVar, int i17, int i18, z0.d dVar) {
        z0.d dVar2;
        java.lang.Object g17 = r0Var.g();
        d0.q qVar = g17 instanceof d0.q ? (d0.q) g17 : null;
        if (qVar == null || (dVar2 = qVar.f306724d) == null) {
            dVar2 = dVar;
        }
        s1.n1.d(n1Var, o1Var, ((z0.g) dVar2).a(p2.r.a(o1Var.f483583d, o1Var.f483584e), p2.r.a(i17, i18), sVar), 0.0f, 2, null);
    }

    public static final s1.t0 c(z0.d alignment, boolean z17, n0.o oVar, int i17) {
        s1.t0 t0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(alignment, "alignment");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.U(56522820);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(alignment, z0.a.f550422a) || z17) {
            y0Var.U(1157296644);
            boolean e17 = y0Var.e(alignment);
            java.lang.Object y17 = y0Var.y();
            if (e17 || y17 == n0.n.f415153a) {
                y17 = new d0.x(z17, alignment);
                y0Var.g0(y17);
            }
            y0Var.o(false);
            t0Var = (s1.t0) y17;
        } else {
            t0Var = f306774a;
        }
        y0Var.o(false);
        return t0Var;
    }
}
