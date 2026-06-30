package zq5;

/* loaded from: classes15.dex */
public abstract class h {
    public static final long a(int i17, int i18) {
        long j17 = (i18 & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2) | (i17 << 32);
        int i19 = zq5.g.f556599c;
        return j17;
    }

    public static final boolean b(long j17) {
        int i17 = zq5.g.f556599c;
        return ((int) (j17 >> 32)) <= 0 || zq5.g.b(j17) <= 0;
    }

    public static final boolean c(long j17) {
        int i17 = zq5.g.f556599c;
        return ((int) (j17 >> 32)) > 0 && zq5.g.b(j17) > 0;
    }

    public static final long d(long j17, int i17) {
        return i17 % 180 == 0 ? j17 : a(zq5.g.b(j17), (int) (j17 >> 32));
    }

    public static final long e(long j17, long j18) {
        int i17 = zq5.g.f556599c;
        return a(a06.d.b(((int) (j17 >> 32)) * zq5.q.b(j18)), a06.d.b(zq5.g.b(j17) * zq5.q.c(j18)));
    }

    public static final java.lang.String f(long j17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = zq5.g.f556599c;
        sb6.append((int) (j17 >> 32));
        sb6.append('x');
        sb6.append(zq5.g.b(j17));
        return sb6.toString();
    }

    public static final long g(long j17) {
        return zq5.u.a((int) (j17 >> 32), zq5.g.b(j17));
    }
}
