package g2;

/* loaded from: classes14.dex */
public abstract class g {
    public static final long a(long j17, long j18) {
        int d17;
        int f17 = a2.m1.f(j17);
        int e17 = a2.m1.e(j17);
        if (a2.m1.f(j18) < a2.m1.e(j17) && a2.m1.f(j17) < a2.m1.e(j18)) {
            if (a2.m1.f(j18) <= a2.m1.f(j17) && a2.m1.e(j17) <= a2.m1.e(j18)) {
                f17 = a2.m1.f(j18);
                e17 = f17;
            } else {
                if (a2.m1.f(j17) <= a2.m1.f(j18) && a2.m1.e(j18) <= a2.m1.e(j17)) {
                    d17 = a2.m1.d(j18);
                } else {
                    if (f17 < a2.m1.e(j18) && a2.m1.f(j18) <= f17) {
                        f17 = a2.m1.f(j18);
                        d17 = a2.m1.d(j18);
                    } else {
                        e17 = a2.m1.f(j18);
                    }
                }
                e17 -= d17;
            }
        } else if (e17 > a2.m1.f(j18)) {
            f17 -= a2.m1.d(j18);
            d17 = a2.m1.d(j18);
            e17 -= d17;
        }
        return a2.n1.a(f17, e17);
    }
}
