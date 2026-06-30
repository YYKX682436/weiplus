package androidx.appcompat.app;

/* loaded from: classes13.dex */
public class r0 {

    /* renamed from: d, reason: collision with root package name */
    public static androidx.appcompat.app.r0 f9212d;

    /* renamed from: a, reason: collision with root package name */
    public long f9213a;

    /* renamed from: b, reason: collision with root package name */
    public long f9214b;

    /* renamed from: c, reason: collision with root package name */
    public int f9215c;

    public void a(long j17, double d17, double d18) {
        double d19 = (0.01720197f * (((float) (j17 - 946728000000L)) / 8.64E7f)) + 6.24006f;
        double sin = (java.lang.Math.sin(d19) * 0.03341960161924362d) + d19 + (java.lang.Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (java.lang.Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double round = ((float) java.lang.Math.round((r3 - 9.0E-4f) - r7)) + 9.0E-4f + ((-d18) / 360.0d) + (java.lang.Math.sin(d19) * 0.0053d) + (java.lang.Math.sin(2.0d * sin) * (-0.0069d));
        double asin = java.lang.Math.asin(java.lang.Math.sin(sin) * java.lang.Math.sin(0.4092797040939331d));
        double d27 = 0.01745329238474369d * d17;
        double sin2 = (java.lang.Math.sin(-0.10471975803375244d) - (java.lang.Math.sin(d27) * java.lang.Math.sin(asin))) / (java.lang.Math.cos(d27) * java.lang.Math.cos(asin));
        if (sin2 >= 1.0d) {
            this.f9215c = 1;
            this.f9213a = -1L;
            this.f9214b = -1L;
        } else {
            if (sin2 <= -1.0d) {
                this.f9215c = 0;
                this.f9213a = -1L;
                this.f9214b = -1L;
                return;
            }
            double acos = (float) (java.lang.Math.acos(sin2) / 6.283185307179586d);
            this.f9213a = java.lang.Math.round((round + acos) * 8.64E7d) + 946728000000L;
            long round2 = java.lang.Math.round((round - acos) * 8.64E7d) + 946728000000L;
            this.f9214b = round2;
            if (round2 >= j17 || this.f9213a <= j17) {
                this.f9215c = 1;
            } else {
                this.f9215c = 0;
            }
        }
    }
}
