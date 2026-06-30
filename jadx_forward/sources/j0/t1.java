package j0;

/* loaded from: classes14.dex */
public abstract class t1 {

    /* renamed from: a, reason: collision with root package name */
    public static final jz5.l f378101a;

    static {
        kz5.p0 p0Var = kz5.p0.f395529d;
        f378101a = new jz5.l(p0Var, p0Var);
    }

    public static final void a(a2.d text, java.util.List inlineContents, n0.o oVar, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inlineContents, "inlineContents");
        java.lang.Object obj = n0.e1.f415025a;
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-110905764);
        int size = inlineContents.size();
        for (int i18 = 0; i18 < size; i18++) {
            a2.c cVar = (a2.c) inlineContents.get(i18);
            yz5.q qVar = (yz5.q) cVar.f82208a;
            j0.r1 r1Var = j0.r1.f378072a;
            y0Var.U(-1323940314);
            int i19 = z0.t.f550455q1;
            z0.p pVar = z0.p.f550454d;
            p2.f fVar = (p2.f) y0Var.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92179e);
            p2.s sVar = (p2.s) y0Var.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92185k);
            p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4 k4Var = (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4) y0Var.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92189o);
            u1.f fVar2 = u1.g.f505127i1;
            fVar2.getClass();
            yz5.a aVar = u1.f.f505120b;
            yz5.q a17 = s1.g0.a(pVar);
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
            n0.i5.a(y0Var, r1Var, u1.f.f505123e);
            fVar2.getClass();
            n0.i5.a(y0Var, fVar, u1.f.f505122d);
            fVar2.getClass();
            n0.i5.a(y0Var, sVar, u1.f.f505124f);
            fVar2.getClass();
            n0.i5.a(y0Var, k4Var, u1.f.f505125g);
            y0Var.n();
            ((u0.i) a17).mo147xb9724478(new n0.i4(y0Var), y0Var, 0);
            y0Var.U(2058660585);
            y0Var.U(-72427749);
            qVar.mo147xb9724478(text.subSequence(cVar.f82209b, cVar.f82210c).f82214d, y0Var, 0);
            y0Var.o(false);
            y0Var.o(false);
            y0Var.o(true);
            y0Var.o(false);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f415141d = new j0.s1(text, inlineContents, i17);
        }
        java.lang.Object obj2 = n0.e1.f415025a;
    }

    public static final j0.k3 b(j0.k3 current, a2.d text, a2.o1 style, p2.f density, f2.g fontFamilyResolver, boolean z17, int i17, int i18, java.util.List placeholders) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(current, "current");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(style, "style");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(density, "density");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fontFamilyResolver, "fontFamilyResolver");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(placeholders, "placeholders");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(current.f377936a, text) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(current.f377937b, style)) {
            if (current.f377939d == z17) {
                if (current.f377940e == i17) {
                    if (current.f377938c == i18 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(current.f377941f, density) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(current.f377943h, placeholders) && current.f377942g == fontFamilyResolver) {
                        return current;
                    }
                    return new j0.k3(text, style, i18, z17, i17, density, fontFamilyResolver, placeholders, null);
                }
                return new j0.k3(text, style, i18, z17, i17, density, fontFamilyResolver, placeholders, null);
            }
        }
        return new j0.k3(text, style, i18, z17, i17, density, fontFamilyResolver, placeholders, null);
    }
}
