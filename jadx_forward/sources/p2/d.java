package p2;

/* loaded from: classes14.dex */
public abstract class d {
    public static final long a(int i17, int i18, int i19, int i27) {
        if (!(i18 >= i17)) {
            throw new java.lang.IllegalArgumentException(("maxWidth(" + i18 + ") must be >= than minWidth(" + i17 + ')').toString());
        }
        if (!(i27 >= i19)) {
            throw new java.lang.IllegalArgumentException(("maxHeight(" + i27 + ") must be >= than minHeight(" + i19 + ')').toString());
        }
        if (i17 >= 0 && i19 >= 0) {
            return p2.c.f432906b.b(i17, i18, i19, i27);
        }
        throw new java.lang.IllegalArgumentException(("minWidth(" + i17 + ") and minHeight(" + i19 + ") must be >= 0").toString());
    }

    public static /* synthetic */ long b(int i17, int i18, int i19, int i27, int i28, java.lang.Object obj) {
        if ((i28 & 1) != 0) {
            i17 = 0;
        }
        if ((i28 & 2) != 0) {
            i18 = Integer.MAX_VALUE;
        }
        if ((i28 & 4) != 0) {
            i19 = 0;
        }
        if ((i28 & 8) != 0) {
            i27 = Integer.MAX_VALUE;
        }
        return a(i17, i18, i19, i27);
    }

    public static final long c(long j17, long j18) {
        return p2.r.a(e06.p.f((int) (j18 >> 32), p2.c.j(j17), p2.c.h(j17)), e06.p.f(p2.q.b(j18), p2.c.i(j17), p2.c.g(j17)));
    }

    public static final int d(long j17, int i17) {
        return e06.p.f(i17, p2.c.i(j17), p2.c.g(j17));
    }

    public static final int e(long j17, int i17) {
        return e06.p.f(i17, p2.c.j(j17), p2.c.h(j17));
    }

    public static final long f(long j17, int i17, int i18) {
        int j18 = p2.c.j(j17) + i17;
        if (j18 < 0) {
            j18 = 0;
        }
        int h17 = p2.c.h(j17);
        if (h17 != Integer.MAX_VALUE && (h17 = h17 + i17) < 0) {
            h17 = 0;
        }
        int i19 = p2.c.i(j17) + i18;
        if (i19 < 0) {
            i19 = 0;
        }
        int g17 = p2.c.g(j17);
        return a(j18, h17, i19, (g17 == Integer.MAX_VALUE || (g17 = g17 + i18) >= 0) ? g17 : 0);
    }
}
