package p012xc85e97e9.p085x39fce629.p086x62f6fe4;

/* loaded from: classes13.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f92721a;

    /* renamed from: b, reason: collision with root package name */
    public final long f92722b;

    public e(long j17, long j18) {
        if (j18 == 0) {
            this.f92721a = 0L;
            this.f92722b = 1L;
        } else {
            this.f92721a = j17;
            this.f92722b = j18;
        }
    }

    public static p012xc85e97e9.p085x39fce629.p086x62f6fe4.e a(double d17) {
        long j17;
        long j18;
        long j19 = 1;
        if (d17 >= 9.223372036854776E18d || d17 <= -9.223372036854776E18d) {
            return new p012xc85e97e9.p085x39fce629.p086x62f6fe4.e(d17 > 0.0d ? com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697 : Long.MIN_VALUE, 1L);
        }
        double abs = java.lang.Math.abs(d17);
        long j27 = 0;
        long j28 = 1;
        double d18 = abs;
        long j29 = 0;
        while (true) {
            double d19 = d18 % 1.0d;
            long j37 = (long) (d18 - d19);
            j17 = j29 + (j37 * j19);
            j18 = (j37 * j27) + j28;
            d18 = 1.0d / d19;
            long j38 = j19;
            if (java.lang.Math.abs(abs - (j17 / j18)) <= 1.0E-8d * abs) {
                break;
            }
            j28 = j27;
            j19 = j17;
            j29 = j38;
            j27 = j18;
        }
        if (d17 < 0.0d) {
            j17 = -j17;
        }
        return new p012xc85e97e9.p085x39fce629.p086x62f6fe4.e(j17, j18);
    }

    /* renamed from: toString */
    public java.lang.String m7385x9616526c() {
        return this.f92721a + "/" + this.f92722b;
    }
}
