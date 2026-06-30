package d1;

/* loaded from: classes14.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final long f307174b = d1.l.a(0.0f, 0.0f);

    /* renamed from: c, reason: collision with root package name */
    public static final long f307175c = d1.l.a(Float.NaN, Float.NaN);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f307176d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f307177a;

    public static final boolean a(long j17, long j18) {
        return j17 == j18;
    }

    public static final float b(long j17) {
        if (j17 != f307175c) {
            return java.lang.Float.intBitsToFloat((int) (j17 & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2));
        }
        throw new java.lang.IllegalStateException("Size is unspecified".toString());
    }

    public static final float c(long j17) {
        return java.lang.Math.min(java.lang.Math.abs(d(j17)), java.lang.Math.abs(b(j17)));
    }

    public static final float d(long j17) {
        if (j17 != f307175c) {
            return java.lang.Float.intBitsToFloat((int) (j17 >> 32));
        }
        throw new java.lang.IllegalStateException("Size is unspecified".toString());
    }

    public static final boolean e(long j17) {
        return d(j17) <= 0.0f || b(j17) <= 0.0f;
    }

    public static java.lang.String f(long j17) {
        if (!(j17 != f307175c)) {
            return "Size.Unspecified";
        }
        return "Size(" + d1.c.a(d(j17), 1) + ", " + d1.c.a(b(j17), 1) + ')';
    }

    /* renamed from: equals */
    public boolean m123326xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof d1.k) {
            return this.f307177a == ((d1.k) obj).f307177a;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m123327x8cdac1b() {
        return java.lang.Long.hashCode(this.f307177a);
    }

    /* renamed from: toString */
    public java.lang.String m123328x9616526c() {
        return f(this.f307177a);
    }
}
