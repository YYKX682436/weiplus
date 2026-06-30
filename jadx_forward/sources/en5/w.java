package en5;

/* loaded from: classes14.dex */
public abstract class w {
    public static final void a(yz5.l onDetailClick, fn5.n0 viewModel, n0.o oVar, int i17) {
        int size;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onDetailClick, "onDetailClick");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewModel, "viewModel");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-1936400087);
        java.lang.Object obj = n0.e1.f415025a;
        y0Var.U(1058851250);
        n0.e5 a17 = v0.c.a(viewModel.f346261n, new java.util.ArrayList(), y0Var, 72);
        y0Var.o(false);
        java.util.ArrayList arrayList = (java.util.ArrayList) a17.mo128745x754a37bb();
        e0.f1 a18 = e0.h1.a(0, 0, y0Var, 0, 3);
        float f17 = 8;
        float f18 = ((float) 1.5d) * f17;
        e0.f.b(null, a18, d0.a2.b(f18, 0.0f, 2, null), false, d0.p.f306716a.g(((float) 2.75d) * f17), null, null, false, new en5.o(arrayList, onDetailClick), y0Var, 24960, com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10095xfbb5a33d);
        y0Var.U(475164255);
        java.lang.Object y17 = y0Var.y();
        if (y17 == n0.n.f415153a) {
            y17 = n0.s4.c(0, null, 2, null);
            y0Var.g0(y17);
        }
        n0.v2 v2Var = (n0.v2) y17;
        y0Var.o(false);
        if (a18.f().b().isEmpty()) {
            n0.f4 q17 = y0Var.q();
            if (q17 != null) {
                ((n0.l3) q17).f415141d = new en5.p(onDetailClick, viewModel, i17);
                return;
            }
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((fn5.o0) viewModel.T6(y0Var, 8).mo128745x754a37bb()).name(), "STOP")) {
            if (((java.lang.Number) v2Var.mo128745x754a37bb()).intValue() == 0) {
                v2Var.mo148714x53d8522f(java.lang.Integer.valueOf(a18.f().b().size()));
            }
            size = ((java.lang.Number) v2Var.mo128745x754a37bb()).intValue();
        } else {
            size = a18.f().b().size();
        }
        int size2 = arrayList.size() % size == 0 ? arrayList.size() / size : (arrayList.size() / size) + 1;
        if (size2 > 1) {
            d0.e3.a(d0.a3.h(z0.p.f550454d, f18), y0Var, 6);
            c(size2, a18.d(), y0Var, 0);
        }
        n0.f4 q18 = y0Var.q();
        if (q18 != null) {
            ((n0.l3) q18).f415141d = new en5.q(onDetailClick, viewModel, i17);
        }
    }

    public static final void b(yz5.l onDetailClick, fn5.n0 viewModel, n0.o oVar, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onDetailClick, "onDetailClick");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewModel, "viewModel");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(1674245758);
        java.lang.Object obj = n0.e1.f415025a;
        java.lang.String g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.fzp);
        long z17 = ((p2.f) y0Var.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92179e)).z(i65.a.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, i65.a.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561383gz)));
        int i18 = aq.o.f94453a ? com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832 : com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        long b17 = rz0.a.b(i18, context);
        int i19 = z0.t.f550455q1;
        z0.p pVar = z0.p.f550454d;
        float f17 = 8;
        z0.t j17 = d0.a2.j(pVar, ((float) 1.5d) * f17, 1 * f17, 0.0f, 2 * f17, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g17);
        tz0.x.b(g17, j17, b17, z17, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, y0Var, 0, 0, 65520);
        a(onDetailClick, viewModel, y0Var, (i17 & 14) | 64);
        d0.e3.a(d0.a3.h(pVar, 3 * f17), y0Var, 6);
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f415141d = new en5.r(onDetailClick, viewModel, i17);
        }
    }

    public static final void c(int i17, int i18, n0.o oVar, int i19) {
        int i27;
        d0.l3 c17;
        d0.l3 l3Var;
        n0.y0 y0Var;
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.V(164702642);
        if ((i19 & 14) == 0) {
            i27 = (y0Var2.c(i17) ? 4 : 2) | i19;
        } else {
            i27 = i19;
        }
        if ((i19 & 112) == 0) {
            i27 |= y0Var2.c(i18) ? 32 : 16;
        }
        if ((i27 & 91) == 18 && y0Var2.v()) {
            y0Var2.O();
            y0Var = y0Var2;
        } else {
            java.lang.Object obj = n0.e1.f415025a;
            int i28 = aq.o.f94453a ? com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833 : com.p314xaae8f345.mm.R.C30859x5a72f63.f560802um;
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            long b17 = rz0.a.b(i28, context);
            int i29 = aq.o.f94453a ? com.p314xaae8f345.mm.R.C30859x5a72f63.f77768x20e836 : com.p314xaae8f345.mm.R.C30859x5a72f63.f560801ul;
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            long b18 = rz0.a.b(i29, context2);
            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
            int i37 = i18 + i17;
            int i38 = i37 % i17;
            int i39 = i37 / i17;
            if (i38 != 0) {
                i39++;
            }
            f0Var.f391649d = i39;
            if (i39 > i17) {
                f0Var.f391649d = i17;
            }
            int i47 = z0.t.f550455q1;
            z0.p pVar = z0.p.f550454d;
            z0.t f17 = d0.a3.f(pVar, 0.0f, 1, null);
            int i48 = z0.d.f550436a;
            z0.d dVar = z0.a.f550423b;
            y0Var2.U(733328855);
            s1.t0 c18 = d0.y.c(dVar, false, y0Var2, 6);
            y0Var2.U(-1323940314);
            p2.f fVar = (p2.f) y0Var2.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92179e);
            p2.s sVar = (p2.s) y0Var2.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92185k);
            p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4 k4Var = (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4) y0Var2.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92189o);
            u1.f fVar2 = u1.g.f505127i1;
            fVar2.getClass();
            yz5.a aVar = u1.f.f505120b;
            yz5.q a17 = s1.g0.a(f17);
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
            z0.b bVar = z0.a.f550434m;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, bVar)) {
                l3Var = d0.a3.f306601d;
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, z0.a.f550433l)) {
                l3Var = d0.a3.f306602e;
            } else {
                c17 = d0.a3.c(bVar, false);
                pVar.k(c17);
                d0.e g17 = d0.p.f306716a.g(1 * 8);
                en5.u uVar = new en5.u(i17, f0Var, b17, b18);
                y0Var = y0Var2;
                e0.f.b(c17, null, null, false, g17, null, null, false, uVar, y0Var, 24582, 238);
                y0Var.o(false);
                y0Var.o(false);
                y0Var.o(true);
                y0Var.o(false);
                y0Var.o(false);
            }
            c17 = l3Var;
            pVar.k(c17);
            d0.e g172 = d0.p.f306716a.g(1 * 8);
            en5.u uVar2 = new en5.u(i17, f0Var, b17, b18);
            y0Var = y0Var2;
            e0.f.b(c17, null, null, false, g172, null, null, false, uVar2, y0Var, 24582, 238);
            y0Var.o(false);
            y0Var.o(false);
            y0Var.o(true);
            y0Var.o(false);
            y0Var.o(false);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f415141d = new en5.v(i17, i18, i19);
        }
    }
}
