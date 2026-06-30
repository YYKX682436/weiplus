package zq5;

/* loaded from: classes11.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final long f556598b = zq5.h.a(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f556599c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f556600a;

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
    public boolean m179319xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof zq5.g) {
            return this.f556600a == ((zq5.g) obj).f556600a;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m179320x8cdac1b() {
        return java.lang.Long.hashCode(this.f556600a);
    }

    /* renamed from: toString */
    public java.lang.String m179321x9616526c() {
        return c(this.f556600a);
    }
}
