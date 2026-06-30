package zq5;

/* loaded from: classes15.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final long f556610b = zq5.m.a(0.0f, 0.0f);

    /* renamed from: c, reason: collision with root package name */
    public static final long f556611c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f556612d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f556613a;

    static {
        zq5.m.a(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
        f556611c = zq5.m.a(Float.NaN, Float.NaN);
    }

    public static final long a(long j17, float f17) {
        return zq5.m.a(b(j17) / f17, c(j17) / f17);
    }

    public static final float b(long j17) {
        if (j17 != f556611c) {
            return java.lang.Float.intBitsToFloat((int) (j17 >> 32));
        }
        throw new java.lang.IllegalStateException("OffsetCompat is unspecified".toString());
    }

    public static final float c(long j17) {
        if (j17 != f556611c) {
            return java.lang.Float.intBitsToFloat((int) (j17 & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2));
        }
        throw new java.lang.IllegalStateException("OffsetCompat is unspecified".toString());
    }

    public static final long d(long j17, long j18) {
        return zq5.m.a(b(j17) - b(j18), c(j17) - c(j18));
    }

    public static final long e(long j17, long j18) {
        return zq5.m.a(b(j17) + b(j18), c(j17) + c(j18));
    }

    public static final long f(long j17, float f17) {
        return zq5.m.a(b(j17) * f17, c(j17) * f17);
    }

    public static java.lang.String g(long j17) {
        if (!(j17 != f556611c)) {
            return "OffsetCompat.Unspecified";
        }
        return "OffsetCompat(" + zq5.b.e(b(j17), 1) + ", " + zq5.b.e(c(j17), 1) + ')';
    }

    /* renamed from: equals */
    public boolean m179329xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof zq5.l) {
            return this.f556613a == ((zq5.l) obj).f556613a;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m179330x8cdac1b() {
        return java.lang.Long.hashCode(this.f556613a);
    }

    /* renamed from: toString */
    public java.lang.String m179331x9616526c() {
        return g(this.f556613a);
    }
}
