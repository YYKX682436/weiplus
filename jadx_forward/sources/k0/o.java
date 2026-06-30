package k0;

/* loaded from: classes14.dex */
public final class o implements k0.v {
    @Override // k0.v
    public long a(a2.k1 textLayoutResult, long j17, int i17, boolean z17, a2.m1 m1Var) {
        int c17;
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textLayoutResult, "textLayoutResult");
        if (m1Var == null) {
            return k0.u.a(k0.u.f384495a, textLayoutResult, j17, new k0.s(textLayoutResult));
        }
        boolean b17 = a2.m1.b(j17);
        long j18 = m1Var.f82316a;
        if (b17) {
            return k0.w.a((int) (j17 >> 32), r26.n0.H(textLayoutResult.f82298a.f82287a), z17, a2.m1.g(j18));
        }
        if (z17) {
            i18 = c(textLayoutResult, (int) (j17 >> 32), i17, (int) (j18 >> 32), a2.m1.c(j17), true, a2.m1.g(j17));
            c17 = a2.m1.c(j17);
        } else {
            int i19 = (int) (j17 >> 32);
            c17 = c(textLayoutResult, a2.m1.c(j17), i17, a2.m1.c(j18), i19, false, a2.m1.g(j17));
            i18 = i19;
        }
        return a2.n1.a(i18, c17);
    }

    public final int b(a2.k1 k1Var, int i17, int i18, int i19, boolean z17, boolean z18) {
        long n17 = k1Var.n(i17);
        int i27 = (int) (n17 >> 32);
        if (k1Var.f(i27) != i18) {
            i27 = k1Var.j(i18);
        }
        int c17 = k1Var.f(a2.m1.c(n17)) == i18 ? a2.m1.c(n17) : k1Var.e(i18, false);
        if (i27 == i19) {
            return c17;
        }
        if (c17 == i19) {
            return i27;
        }
        int i28 = (i27 + c17) / 2;
        if (z17 ^ z18) {
            if (i17 <= i28) {
                return i27;
            }
        } else if (i17 < i28) {
            return i27;
        }
        return c17;
    }

    public final int c(a2.k1 k1Var, int i17, int i18, int i19, int i27, boolean z17, boolean z18) {
        if (i17 == i18) {
            return i19;
        }
        int f17 = k1Var.f(i17);
        if (f17 != k1Var.f(i19)) {
            return b(k1Var, i17, f17, i27, z17, z18);
        }
        if (!(i18 == -1 || (i17 != i18 && (!(z17 ^ z18) ? i17 <= i18 : i17 >= i18)))) {
            return i17;
        }
        long n17 = k1Var.n(i19);
        return !(i19 == ((int) (n17 >> 32)) || i19 == a2.m1.c(n17)) ? i17 : b(k1Var, i17, f17, i27, z17, z18);
    }
}
