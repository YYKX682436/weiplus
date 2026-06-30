package d1;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final long f307156b = d1.f.a(0.0f, 0.0f);

    /* renamed from: c, reason: collision with root package name */
    public static final long f307157c = d1.f.a(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: d, reason: collision with root package name */
    public static final long f307158d = d1.f.a(Float.NaN, Float.NaN);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f307159e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f307160a;

    public static final boolean a(long j17, long j18) {
        return j17 == j18;
    }

    public static final float b(long j17) {
        return (float) java.lang.Math.sqrt((c(j17) * c(j17)) + (d(j17) * d(j17)));
    }

    public static final float c(long j17) {
        if (j17 != f307158d) {
            return java.lang.Float.intBitsToFloat((int) (j17 >> 32));
        }
        throw new java.lang.IllegalStateException("Offset is unspecified".toString());
    }

    public static final float d(long j17) {
        if (j17 != f307158d) {
            return java.lang.Float.intBitsToFloat((int) (j17 & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2));
        }
        throw new java.lang.IllegalStateException("Offset is unspecified".toString());
    }

    public static final long e(long j17, long j18) {
        return d1.f.a(c(j17) - c(j18), d(j17) - d(j18));
    }

    public static final long f(long j17, long j18) {
        return d1.f.a(c(j17) + c(j18), d(j17) + d(j18));
    }

    public static final long g(long j17, float f17) {
        return d1.f.a(c(j17) * f17, d(j17) * f17);
    }

    public static java.lang.String h(long j17) {
        if (!d1.f.c(j17)) {
            return "Offset.Unspecified";
        }
        return "Offset(" + d1.c.a(c(j17), 1) + ", " + d1.c.a(d(j17), 1) + ')';
    }

    /* renamed from: equals */
    public boolean m123314xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof d1.e) {
            return this.f307160a == ((d1.e) obj).f307160a;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m123315x8cdac1b() {
        return java.lang.Long.hashCode(this.f307160a);
    }

    /* renamed from: toString */
    public java.lang.String m123316x9616526c() {
        return h(this.f307160a);
    }
}
