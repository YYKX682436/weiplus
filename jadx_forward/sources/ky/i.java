package ky;

/* loaded from: classes14.dex */
public abstract class i {
    public static final void a(ky.a aVar, n0.o oVar, int i17, int i18) {
        ky.a aVar2;
        int i19;
        n0.y0 y0Var;
        int i27;
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.V(1748210033);
        if ((i17 & 14) == 0) {
            if ((i18 & 1) == 0) {
                aVar2 = aVar;
                if (y0Var2.e(aVar2)) {
                    i27 = 4;
                    i19 = i27 | i17;
                }
            } else {
                aVar2 = aVar;
            }
            i27 = 2;
            i19 = i27 | i17;
        } else {
            aVar2 = aVar;
            i19 = i17;
        }
        if ((i19 & 11) == 2 && y0Var2.v()) {
            y0Var2.O();
            y0Var = y0Var2;
        } else {
            y0Var2.Q();
            if ((i17 & 1) != 0 && !y0Var2.u()) {
                y0Var2.O();
                int i28 = i18 & 1;
            } else if ((i18 & 1) != 0) {
                aVar2 = b(y0Var2, 0);
            }
            ky.a aVar3 = aVar2;
            y0Var2.p();
            java.lang.Object obj = n0.e1.f415025a;
            y0Var2.U(-1803305593);
            java.lang.Object y17 = y0Var2.y();
            int i29 = n0.o.f415162a;
            if (y17 == n0.n.f415153a) {
                p2.h hVar = new p2.h(50);
                y0Var2.g0(hVar);
                y17 = hVar;
            }
            float f17 = ((p2.h) y17).f432913d;
            y0Var2.o(false);
            y0Var = y0Var2;
            ky.p.a(null, 0L, aVar3.a() != ky.m0.f394925d, 20, 800, 0.4f, 200, 0.0f, 0.0f, u0.j.b(y0Var2, 1937488041, true, new ky.c(aVar3, f17)), y0Var2, 807103488, 387);
            aVar2 = aVar3;
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f415141d = new ky.d(aVar2, i17, i18);
        }
    }

    public static final ky.a b(n0.o oVar, int i17) {
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.U(769217197);
        java.lang.Object obj = n0.e1.f415025a;
        y0Var.U(-417747390);
        java.lang.Object y17 = y0Var.y();
        int i18 = n0.o.f415162a;
        if (y17 == n0.n.f415153a) {
            y17 = new ky.a();
            y0Var.g0(y17);
        }
        ky.a aVar = (ky.a) y17;
        y0Var.o(false);
        y0Var.o(false);
        return aVar;
    }
}
