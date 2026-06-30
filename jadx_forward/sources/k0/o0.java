package k0;

/* loaded from: classes14.dex */
public abstract class o0 {
    public static final void a(z0.t tVar, yz5.p content, n0.o oVar, int i17, int i18) {
        int i19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        java.lang.Object obj = n0.e1.f415025a;
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-2105228848);
        int i27 = i18 & 1;
        if (i27 != 0) {
            i19 = i17 | 6;
        } else if ((i17 & 14) == 0) {
            i19 = (y0Var.e(tVar) ? 4 : 2) | i17;
        } else {
            i19 = i17;
        }
        if ((i18 & 2) != 0) {
            i19 |= 48;
        } else if ((i17 & 112) == 0) {
            i19 |= y0Var.e(content) ? 32 : 16;
        }
        if ((i19 & 91) == 18 && y0Var.v()) {
            y0Var.O();
        } else {
            if (i27 != 0) {
                int i28 = z0.t.f550455q1;
                tVar = z0.p.f550454d;
            }
            k0.m0 m0Var = k0.m0.f384483a;
            y0Var.U(-1323940314);
            p2.f fVar = (p2.f) y0Var.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92179e);
            p2.s sVar = (p2.s) y0Var.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92185k);
            p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4 k4Var = (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4) y0Var.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92189o);
            u1.f fVar2 = u1.g.f505127i1;
            fVar2.getClass();
            yz5.a aVar = u1.f.f505120b;
            yz5.q a17 = s1.g0.a(tVar);
            int i29 = (((((i19 << 3) & 112) | ((i19 >> 3) & 14)) << 9) & 7168) | 6;
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
            n0.i5.a(y0Var, m0Var, u1.f.f505123e);
            fVar2.getClass();
            n0.i5.a(y0Var, fVar, u1.f.f505122d);
            fVar2.getClass();
            n0.i5.a(y0Var, sVar, u1.f.f505124f);
            fVar2.getClass();
            n0.i5.a(y0Var, k4Var, u1.f.f505125g);
            y0Var.n();
            ((u0.i) a17).mo147xb9724478(new n0.i4(y0Var), y0Var, java.lang.Integer.valueOf((i29 >> 3) & 112));
            y0Var.U(2058660585);
            content.mo149xb9724478(y0Var, java.lang.Integer.valueOf((i29 >> 9) & 14));
            y0Var.o(false);
            y0Var.o(true);
            y0Var.o(false);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 == null) {
            return;
        }
        ((n0.l3) q17).f415141d = new k0.n0(tVar, content, i17, i18);
    }
}
