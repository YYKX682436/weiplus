package p2;

/* loaded from: classes14.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final long f432921b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f432922c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f432923a;

    static {
        new p2.l(null);
        f432921b = p2.n.a(0, 0);
    }

    public static long a(long j17, int i17, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 1) != 0) {
            i17 = (int) (j17 >> 32);
        }
        if ((i19 & 2) != 0) {
            i18 = b(j17);
        }
        return p2.n.a(i17, i18);
    }

    public static final int b(long j17) {
        return (int) (j17 & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2);
    }

    public static java.lang.String c(long j17) {
        return "(" + ((int) (j17 >> 32)) + ", " + b(j17) + ')';
    }

    /* renamed from: equals */
    public boolean m157747xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof p2.m) {
            return this.f432923a == ((p2.m) obj).f432923a;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m157748x8cdac1b() {
        return java.lang.Long.hashCode(this.f432923a);
    }

    /* renamed from: toString */
    public java.lang.String m157749x9616526c() {
        return c(this.f432923a);
    }
}
