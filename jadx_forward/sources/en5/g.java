package en5;

/* loaded from: classes14.dex */
public abstract class g {
    public static final void a(h1.c painter, z0.t modifier, java.lang.String str, n0.o oVar, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(painter, "painter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modifier, "modifier");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(1959201981);
        java.lang.String str2 = (i18 & 4) != 0 ? null : str;
        java.lang.Object obj = n0.e1.f415025a;
        int i19 = s1.p.f483587a;
        s1.p pVar = s1.o.f483577a;
        int i27 = z0.d.f550436a;
        a0.q1.a(painter, str2, modifier, z0.a.f550426e, pVar, 0.0f, null, y0Var, ((i17 >> 3) & 112) | 27656 | ((i17 << 3) & ce1.h.f4368x366c91de), 96);
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f415141d = new en5.e(painter, modifier, str2, i17, i18);
        }
    }

    public static final void b(h1.c painter, float f17, float f18, java.lang.String str, n0.o oVar, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(painter, "painter");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-1010960939);
        if ((i18 & 8) != 0) {
            str = null;
        }
        java.lang.Object obj = n0.e1.f415025a;
        int i19 = z0.t.f550455q1;
        a(painter, d0.a3.i(z0.p.f550454d, f17, f18), str, y0Var, ((i17 >> 3) & ce1.h.f4368x366c91de) | 8, 0);
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f415141d = new en5.f(painter, f17, f18, str, i17, i18);
        }
    }
}
