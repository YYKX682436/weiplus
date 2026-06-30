package p2;

/* loaded from: classes14.dex */
public final class q {

    /* renamed from: b, reason: collision with root package name */
    public static final p2.p f432928b = new p2.p(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f432929a;

    public static final boolean a(long j17, long j18) {
        return j17 == j18;
    }

    public static final int b(long j17) {
        return (int) (j17 & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2);
    }

    public static java.lang.String c(long j17) {
        return ((int) (j17 >> 32)) + " x " + b(j17);
    }

    /* renamed from: equals */
    public boolean m157754xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof p2.q) {
            return this.f432929a == ((p2.q) obj).f432929a;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m157755x8cdac1b() {
        return java.lang.Long.hashCode(this.f432929a);
    }

    /* renamed from: toString */
    public java.lang.String m157756x9616526c() {
        return c(this.f432929a);
    }
}
