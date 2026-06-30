package zq5;

/* loaded from: classes11.dex */
public abstract class d {
    public static final long a(int i17, int i18) {
        long j17 = (i18 & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2) | (i17 << 32);
        int i19 = zq5.c.f556591c;
        return j17;
    }

    public static final java.lang.String b(long j17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = zq5.c.f556591c;
        sb6.append((int) (j17 >> 32));
        sb6.append('x');
        sb6.append(zq5.c.a(j17));
        return sb6.toString();
    }
}
