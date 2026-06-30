package sz5;

/* loaded from: classes5.dex */
public abstract class b {
    public static final int a(int i17, int i18, int i19) {
        if (i19 > 0) {
            if (i17 >= i18) {
                return i18;
            }
            int i27 = i18 % i19;
            if (i27 < 0) {
                i27 += i19;
            }
            int i28 = i17 % i19;
            if (i28 < 0) {
                i28 += i19;
            }
            int i29 = (i27 - i28) % i19;
            if (i29 < 0) {
                i29 += i19;
            }
            return i18 - i29;
        }
        if (i19 >= 0) {
            throw new java.lang.IllegalArgumentException("Step is zero.");
        }
        if (i17 <= i18) {
            return i18;
        }
        int i37 = -i19;
        int i38 = i17 % i37;
        if (i38 < 0) {
            i38 += i37;
        }
        int i39 = i18 % i37;
        if (i39 < 0) {
            i39 += i37;
        }
        int i47 = (i38 - i39) % i37;
        if (i47 < 0) {
            i47 += i37;
        }
        return i18 + i47;
    }

    public static final long b(long j17, long j18, long j19) {
        if (j19 > 0) {
            if (j17 >= j18) {
                return j18;
            }
            long j27 = j18 % j19;
            if (j27 < 0) {
                j27 += j19;
            }
            long j28 = j17 % j19;
            if (j28 < 0) {
                j28 += j19;
            }
            long j29 = (j27 - j28) % j19;
            if (j29 < 0) {
                j29 += j19;
            }
            return j18 - j29;
        }
        if (j19 >= 0) {
            throw new java.lang.IllegalArgumentException("Step is zero.");
        }
        if (j17 <= j18) {
            return j18;
        }
        long j37 = -j19;
        long j38 = j17 % j37;
        if (j38 < 0) {
            j38 += j37;
        }
        long j39 = j18 % j37;
        if (j39 < 0) {
            j39 += j37;
        }
        long j47 = (j38 - j39) % j37;
        if (j47 < 0) {
            j47 += j37;
        }
        return j18 + j47;
    }
}
