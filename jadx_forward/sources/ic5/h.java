package ic5;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final ic5.h f371974a = new ic5.h();

    public final int a(java.lang.String str) {
        if (!(str == null || r26.n0.N(str))) {
            if (c01.e2.R(str)) {
                return 4;
            }
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.V4(str)) {
                return 1;
            }
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(str)) {
                return 2;
            }
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str)) {
                return 3;
            }
        }
        return 0;
    }

    public final int b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(f9Var, "<this>");
        if (f9Var.J2()) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            if (m11.b1.Di().S1(f9Var).j()) {
                return 1;
            }
        } else if (f9Var.m78014x7b98c171() && ((java.lang.Number) ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Di(f9Var).f384366d).intValue() != 0) {
            return 1;
        }
        return 2;
    }

    public final int c(java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "<this>");
        boolean z17 = false;
        if (!list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (f371974a.b((com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next()) == 1) {
                    z17 = true;
                    break;
                }
            }
        }
        return z17 ? 1 : 2;
    }

    public final wg3.k d(java.util.List list) {
        int i17;
        boolean z17;
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "<this>");
        int i19 = 0;
        if (list.isEmpty()) {
            return new wg3.k("", 0, 0, 0);
        }
        java.lang.String b17 = ic5.f.f371970c.b((com.p314xaae8f345.mm.p2621x8fb0427b.f9) kz5.n0.X(list));
        if (list.isEmpty()) {
            i17 = 0;
        } else {
            java.util.Iterator it = list.iterator();
            i17 = 0;
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(f9Var, "<this>");
                if (f9Var.J2()) {
                    j15.d dVar = new j15.d();
                    java.lang.String j17 = f9Var.j();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(j17, "getContent(...)");
                    dVar.m126728xdc93280d(j17);
                    z17 = !xs.l1.a(dVar);
                } else {
                    z17 = false;
                }
                if (z17 && (i17 = i17 + 1) < 0) {
                    kz5.c0.o();
                    throw null;
                }
            }
        }
        if (list.isEmpty()) {
            i18 = 0;
        } else {
            java.util.Iterator it6 = list.iterator();
            i18 = 0;
            while (it6.hasNext()) {
                if (((com.p314xaae8f345.mm.p2621x8fb0427b.f9) it6.next()).m78014x7b98c171() && (i18 = i18 + 1) < 0) {
                    kz5.c0.o();
                    throw null;
                }
            }
        }
        if (!list.isEmpty()) {
            java.util.Iterator it7 = list.iterator();
            while (it7.hasNext()) {
                if (f371974a.e((com.p314xaae8f345.mm.p2621x8fb0427b.f9) it7.next()) && (i19 = i19 + 1) < 0) {
                    kz5.c0.o();
                    throw null;
                }
            }
        }
        return new wg3.k(b17, i17, i18, i19);
    }

    public final boolean e(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(f9Var, "<this>");
        if (!f9Var.J2()) {
            return false;
        }
        j15.d dVar = new j15.d();
        java.lang.String j17 = f9Var.j();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(j17, "getContent(...)");
        dVar.m126728xdc93280d(j17);
        return xs.l1.a(dVar);
    }
}
