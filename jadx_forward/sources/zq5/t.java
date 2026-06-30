package zq5;

/* loaded from: classes15.dex */
public final class t {

    /* renamed from: b, reason: collision with root package name */
    public static final long f556624b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f556625c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f556626a;

    static {
        zq5.u.a(0.0f, 0.0f);
        f556624b = zq5.u.a(Float.NaN, Float.NaN);
    }

    public static final float a(long j17) {
        if (j17 != f556624b) {
            return java.lang.Float.intBitsToFloat((int) (j17 & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2));
        }
        throw new java.lang.IllegalStateException("SizeCompat is unspecified".toString());
    }

    public static final float b(long j17) {
        if (j17 != f556624b) {
            return java.lang.Float.intBitsToFloat((int) (j17 >> 32));
        }
        throw new java.lang.IllegalStateException("SizeCompat is unspecified".toString());
    }

    /* renamed from: equals */
    public boolean m179343xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof zq5.t) {
            return this.f556626a == ((zq5.t) obj).f556626a;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m179344x8cdac1b() {
        return java.lang.Long.hashCode(this.f556626a);
    }

    /* renamed from: toString */
    public java.lang.String m179345x9616526c() {
        long j17 = f556624b;
        long j18 = this.f556626a;
        if (!(j18 != j17)) {
            return "SizeCompat.Unspecified";
        }
        return "SizeCompat(" + zq5.b.e(b(j18), 1) + ", " + zq5.b.e(a(j18), 1) + ')';
    }
}
