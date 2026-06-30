package p2;

/* loaded from: classes14.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final long f432914b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f432915c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f432916a;

    static {
        float f17 = 0;
        p2.i.a(f17, f17);
        f432914b = p2.i.a(Float.NaN, Float.NaN);
    }

    public static final float a(long j17) {
        if (j17 != f432914b) {
            return java.lang.Float.intBitsToFloat((int) (j17 >> 32));
        }
        throw new java.lang.IllegalStateException("DpOffset is unspecified".toString());
    }

    public static final float b(long j17) {
        if (j17 != f432914b) {
            return java.lang.Float.intBitsToFloat((int) (j17 & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2));
        }
        throw new java.lang.IllegalStateException("DpOffset is unspecified".toString());
    }

    /* renamed from: equals */
    public boolean m157739xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof p2.j) {
            return this.f432916a == ((p2.j) obj).f432916a;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m157740x8cdac1b() {
        return java.lang.Long.hashCode(this.f432916a);
    }

    /* renamed from: toString */
    public java.lang.String m157741x9616526c() {
        long j17 = f432914b;
        long j18 = this.f432916a;
        if (!(j18 != j17)) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((java.lang.Object) p2.h.b(a(j18))) + ", " + ((java.lang.Object) p2.h.b(b(j18))) + ')';
    }
}
