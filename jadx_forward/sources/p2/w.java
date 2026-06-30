package p2;

/* loaded from: classes14.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public static final long f432937b = p2.x.a(0.0f, 0.0f);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f432938c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f432939a;

    public static long a(long j17, float f17, float f18, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            f17 = b(j17);
        }
        if ((i17 & 2) != 0) {
            f18 = c(j17);
        }
        return p2.x.a(f17, f18);
    }

    public static final float b(long j17) {
        return java.lang.Float.intBitsToFloat((int) (j17 >> 32));
    }

    public static final float c(long j17) {
        return java.lang.Float.intBitsToFloat((int) (j17 & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2));
    }

    public static final long d(long j17, long j18) {
        return p2.x.a(b(j17) - b(j18), c(j17) - c(j18));
    }

    public static final long e(long j17, long j18) {
        return p2.x.a(b(j17) + b(j18), c(j17) + c(j18));
    }

    /* renamed from: equals */
    public boolean m157768xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof p2.w) {
            return this.f432939a == ((p2.w) obj).f432939a;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m157769x8cdac1b() {
        return java.lang.Long.hashCode(this.f432939a);
    }

    /* renamed from: toString */
    public java.lang.String m157770x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("(");
        long j17 = this.f432939a;
        sb6.append(b(j17));
        sb6.append(", ");
        sb6.append(c(j17));
        sb6.append(") px/sec");
        return sb6.toString();
    }
}
