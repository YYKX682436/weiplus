package a2;

/* loaded from: classes14.dex */
public final class m1 {

    /* renamed from: b, reason: collision with root package name */
    public static final long f82314b = a2.n1.a(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f82315c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f82316a;

    public static final boolean a(long j17, long j18) {
        return j17 == j18;
    }

    public static final boolean b(long j17) {
        return ((int) (j17 >> 32)) == c(j17);
    }

    public static final int c(long j17) {
        return (int) (j17 & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2);
    }

    public static final int d(long j17) {
        return e(j17) - f(j17);
    }

    public static final int e(long j17) {
        int i17 = (int) (j17 >> 32);
        return i17 > c(j17) ? i17 : c(j17);
    }

    public static final int f(long j17) {
        int i17 = (int) (j17 >> 32);
        return i17 > c(j17) ? c(j17) : i17;
    }

    public static final boolean g(long j17) {
        return ((int) (j17 >> 32)) > c(j17);
    }

    public static java.lang.String h(long j17) {
        return "TextRange(" + ((int) (j17 >> 32)) + ", " + c(j17) + ')';
    }

    /* renamed from: equals */
    public boolean m374xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof a2.m1) {
            return this.f82316a == ((a2.m1) obj).f82316a;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m375x8cdac1b() {
        return java.lang.Long.hashCode(this.f82316a);
    }

    /* renamed from: toString */
    public java.lang.String m376x9616526c() {
        return h(this.f82316a);
    }
}
