package p2;

/* loaded from: classes14.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final long f432917b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f432918c = p2.i.b(Float.NaN, Float.NaN);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f432919d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f432920a;

    static {
        float f17 = 0;
        f432917b = p2.i.b(f17, f17);
    }

    public static final float a(long j17) {
        if (j17 != f432918c) {
            return java.lang.Float.intBitsToFloat((int) (j17 & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2));
        }
        throw new java.lang.IllegalStateException("DpSize is unspecified".toString());
    }

    public static final float b(long j17) {
        if (j17 != f432918c) {
            return java.lang.Float.intBitsToFloat((int) (j17 >> 32));
        }
        throw new java.lang.IllegalStateException("DpSize is unspecified".toString());
    }

    public static java.lang.String c(long j17) {
        if (!(j17 != f432918c)) {
            return "DpSize.Unspecified";
        }
        return ((java.lang.Object) p2.h.b(b(j17))) + " x " + ((java.lang.Object) p2.h.b(a(j17)));
    }

    /* renamed from: equals */
    public boolean m157743xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof p2.k) {
            return this.f432920a == ((p2.k) obj).f432920a;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m157744x8cdac1b() {
        return java.lang.Long.hashCode(this.f432920a);
    }

    /* renamed from: toString */
    public java.lang.String m157745x9616526c() {
        return c(this.f432920a);
    }
}
