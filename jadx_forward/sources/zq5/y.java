package zq5;

/* loaded from: classes15.dex */
public final class y {

    /* renamed from: b, reason: collision with root package name */
    public static final zq5.x f556633b = new zq5.x(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f556634a;

    static {
        zq5.a0.a(0.5f, 0.5f);
    }

    public /* synthetic */ y(long j17) {
        this.f556634a = j17;
    }

    public static final boolean a(long j17, long j18) {
        return j17 == j18;
    }

    public static java.lang.String b(long j17) {
        return "TransformOriginCompat(" + zq5.b.c(java.lang.Float.intBitsToFloat((int) (j17 >> 32)), 2) + ", " + zq5.b.c(java.lang.Float.intBitsToFloat((int) (j17 & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2)), 2) + "))";
    }

    /* renamed from: equals */
    public boolean m179351xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof zq5.y) {
            return this.f556634a == ((zq5.y) obj).f556634a;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m179352x8cdac1b() {
        return java.lang.Long.hashCode(this.f556634a);
    }

    /* renamed from: toString */
    public java.lang.String m179353x9616526c() {
        return b(this.f556634a);
    }
}
