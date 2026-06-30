package en5;

/* loaded from: classes14.dex */
public abstract class p1 {
    public static final void a(en5.d selectType, en5.d type, yz5.l onClick, n0.o oVar, int i17) {
        int i18;
        java.lang.String g17;
        f2.r rVar;
        long b17;
        n0.y0 y0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectType, "selectType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onClick, "onClick");
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.V(-779191347);
        if ((i17 & 14) == 0) {
            i18 = (y0Var2.e(selectType) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i17 & 112) == 0) {
            i18 |= y0Var2.e(type) ? 32 : 16;
        }
        if ((i17 & ce1.h.f4368x366c91de) == 0) {
            i18 |= y0Var2.e(onClick) ? 256 : 128;
        }
        if ((i18 & 731) == 146 && y0Var2.v()) {
            y0Var2.O();
            y0Var = y0Var2;
        } else {
            java.lang.Object obj = n0.e1.f415025a;
            int ordinal = type.ordinal();
            if (ordinal == 0) {
                g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.fzx);
            } else if (ordinal == 1) {
                g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.fzz);
            } else {
                if (ordinal != 2) {
                    throw new jz5.j();
                }
                g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.fzy);
            }
            int i19 = z0.t.f550455q1;
            z0.p pVar = z0.p.f550454d;
            y0Var2.U(-341085522);
            java.lang.Object y17 = y0Var2.y();
            int i27 = n0.o.f415162a;
            java.lang.Object obj2 = n0.n.f415153a;
            if (y17 == obj2) {
                y17 = new c0.p();
                y0Var2.g0(y17);
            }
            c0.o oVar2 = (c0.o) y17;
            y0Var2.o(false);
            y0Var2.U(-341085481);
            boolean e17 = y0Var2.e(onClick) | y0Var2.e(type);
            java.lang.Object y18 = y0Var2.y();
            if (e17 || y18 == obj2) {
                y18 = new en5.j1(onClick, type);
                y0Var2.g0(y18);
            }
            y0Var2.o(false);
            z0.t c17 = a0.d0.c(pVar, oVar2, null, false, null, null, (yz5.a) y18, 28, null);
            int i28 = aq.o.f94453a ? com.p314xaae8f345.mm.R.C30859x5a72f63.f77628xb498cd1d : com.p314xaae8f345.mm.R.C30859x5a72f63.f560047w;
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            float f17 = 8;
            z0.t b18 = a0.b.b(c17, rz0.a.b(i28, context), i0.h.a(2 * f17));
            y0Var2.U(733328855);
            int i29 = z0.d.f550436a;
            s1.t0 c18 = d0.y.c(z0.a.f550422a, false, y0Var2, 0);
            y0Var2.U(-1323940314);
            n0.h3 h3Var = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92179e;
            p2.f fVar = (p2.f) y0Var2.i(h3Var);
            p2.s sVar = (p2.s) y0Var2.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92185k);
            p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4 k4Var = (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4) y0Var2.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92189o);
            u1.f fVar2 = u1.g.f505127i1;
            fVar2.getClass();
            yz5.a aVar = u1.f.f505120b;
            yz5.q a17 = s1.g0.a(b18);
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
            fVar2.getClass();
            n0.i5.a(y0Var2, c18, u1.f.f505123e);
            fVar2.getClass();
            n0.i5.a(y0Var2, fVar, u1.f.f505122d);
            fVar2.getClass();
            n0.i5.a(y0Var2, sVar, u1.f.f505124f);
            fVar2.getClass();
            n0.i5.a(y0Var2, k4Var, u1.f.f505125g);
            y0Var2.n();
            ((u0.i) a17).mo147xb9724478(new n0.i4(y0Var2), y0Var2, 0);
            y0Var2.U(2058660585);
            y0Var2.U(-2137368960);
            float f18 = ((float) 1.5d) * f17;
            float f19 = ((float) 0.5d) * f17;
            z0.t i37 = d0.a2.i(pVar, f18, f19, f18, f19);
            long z17 = ((p2.f) y0Var2.i(h3Var)).z(((float) 1.88d) * f17);
            if (selectType == type) {
                f2.r rVar2 = f2.r.f340351e;
                rVar = f2.r.f340356m;
            } else {
                rVar = null;
            }
            if (selectType == type) {
                y0Var2.U(1962776744);
                int i38 = aq.o.f94453a ? com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832 : com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230;
                android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                b17 = rz0.a.b(i38, context2);
                y0Var2.o(false);
            } else {
                y0Var2.U(1962776793);
                int i39 = aq.o.f94453a ? com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833 : com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d;
                android.content.Context context3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
                b17 = rz0.a.b(i39, context3);
                y0Var2.o(false);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g17);
            tz0.x.b(g17, i37, b17, z17, null, rVar, null, 0L, null, new l2.f(3), 0L, 0, false, 0, null, null, y0Var2, 3072, 0, 64976);
            y0Var = y0Var2;
            y0Var.o(false);
            y0Var.o(false);
            y0Var.o(true);
            y0Var.o(false);
            y0Var.o(false);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f415141d = new en5.k1(selectType, type, onClick, i17);
        }
    }

    public static final void b(fn5.n0 viewModel, n0.o oVar, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewModel, "viewModel");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(610569425);
        java.lang.Object obj = n0.e1.f415025a;
        n0.e5 V6 = viewModel.V6(y0Var, 8);
        int i18 = z0.t.f550455q1;
        z0.p pVar = z0.p.f550454d;
        float f17 = 8;
        float f18 = ((float) 1.5d) * f17;
        z0.t j17 = d0.a2.j(pVar, f18, f18, 0.0f, f18, 4, null);
        y0Var.U(693286680);
        d0.p pVar2 = d0.p.f306716a;
        d0.d dVar = d0.p.f306717b;
        int i19 = z0.d.f550436a;
        s1.t0 a17 = d0.n2.a(dVar, z0.a.f550431j, y0Var, 0);
        y0Var.U(-1323940314);
        p2.f fVar = (p2.f) y0Var.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92179e);
        p2.s sVar = (p2.s) y0Var.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92185k);
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4 k4Var = (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4) y0Var.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92189o);
        u1.f fVar2 = u1.g.f505127i1;
        fVar2.getClass();
        yz5.a aVar = u1.f.f505120b;
        yz5.q a18 = s1.g0.a(j17);
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
        n0.i5.a(y0Var, a17, u1.f.f505123e);
        fVar2.getClass();
        n0.i5.a(y0Var, fVar, u1.f.f505122d);
        fVar2.getClass();
        n0.i5.a(y0Var, sVar, u1.f.f505124f);
        fVar2.getClass();
        n0.i5.a(y0Var, k4Var, u1.f.f505125g);
        y0Var.n();
        ((u0.i) a18).mo147xb9724478(new n0.i4(y0Var), y0Var, 0);
        y0Var.U(2058660585);
        y0Var.U(-678309503);
        java.lang.Object mo128745x754a37bb = V6.mo128745x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo128745x754a37bb, "<get-value>(...)");
        a((en5.d) mo128745x754a37bb, en5.d.f336904d, new en5.l1(viewModel), y0Var, 48);
        float f19 = 1 * f17;
        d0.e3.a(d0.a3.h(pVar, f19), y0Var, 6);
        java.lang.Object mo128745x754a37bb2 = V6.mo128745x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo128745x754a37bb2, "<get-value>(...)");
        a((en5.d) mo128745x754a37bb2, en5.d.f336905e, new en5.m1(viewModel), y0Var, 48);
        d0.e3.a(d0.a3.h(pVar, f19), y0Var, 6);
        java.lang.Object mo128745x754a37bb3 = V6.mo128745x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo128745x754a37bb3, "<get-value>(...)");
        a((en5.d) mo128745x754a37bb3, en5.d.f336906f, new en5.n1(viewModel), y0Var, 48);
        y0Var.o(false);
        y0Var.o(false);
        y0Var.o(true);
        y0Var.o(false);
        y0Var.o(false);
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f415141d = new en5.o1(viewModel, i17);
        }
    }
}
