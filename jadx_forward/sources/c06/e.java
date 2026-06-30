package c06;

/* loaded from: classes10.dex */
public abstract class e {

    /* renamed from: d, reason: collision with root package name */
    public static final c06.d f119249d = new c06.d(null);

    /* renamed from: e, reason: collision with root package name */
    public static final c06.e f119250e;

    static {
        java.lang.Integer num = uz5.a.f513717a;
        f119250e = num == null || num.intValue() >= 34 ? new d06.a() : new c06.c();
    }

    public abstract int a(int i17);

    public float b() {
        return a(24) / 1.6777216E7f;
    }

    public abstract int c();

    public int d(int i17) {
        return e(0, i17);
    }

    public int e(int i17, int i18) {
        int c17;
        int i19;
        int i27;
        int c18;
        if (!(i18 > i17)) {
            throw new java.lang.IllegalArgumentException(c06.f.b(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)).toString());
        }
        int i28 = i18 - i17;
        if (i28 > 0 || i28 == Integer.MIN_VALUE) {
            if (((-i28) & i28) == i28) {
                i27 = a(31 - java.lang.Integer.numberOfLeadingZeros(i28));
                return i17 + i27;
            }
            do {
                c17 = c() >>> 1;
                i19 = c17 % i28;
            } while ((c17 - i19) + (i28 - 1) < 0);
            i27 = i19;
            return i17 + i27;
        }
        do {
            c18 = c();
        } while (!(i17 <= c18 && c18 < i18));
        return c18;
    }

    public long f() {
        return (c() << 32) + c();
    }

    public long g(long j17) {
        return h(0L, j17);
    }

    public long h(long j17, long j18) {
        long f17;
        long f18;
        long j19;
        long j27;
        int c17;
        if (!(j18 > j17)) {
            throw new java.lang.IllegalArgumentException(c06.f.b(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18)).toString());
        }
        long j28 = j18 - j17;
        if (j28 > 0) {
            if (((-j28) & j28) == j28) {
                int i17 = (int) j28;
                int i18 = (int) (j28 >>> 32);
                if (i17 != 0) {
                    c17 = a(31 - java.lang.Integer.numberOfLeadingZeros(i17));
                } else {
                    if (i18 != 1) {
                        j27 = (a(31 - java.lang.Integer.numberOfLeadingZeros(i18)) << 32) + (c() & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2);
                        return j17 + j27;
                    }
                    c17 = c();
                }
                j27 = c17 & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
                return j17 + j27;
            }
            do {
                f18 = f() >>> 1;
                j19 = f18 % j28;
            } while ((f18 - j19) + (j28 - 1) < 0);
            j27 = j19;
            return j17 + j27;
        }
        do {
            f17 = f();
        } while (!(j17 <= f17 && f17 < j18));
        return f17;
    }
}
