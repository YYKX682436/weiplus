package zq5;

/* loaded from: classes15.dex */
public final class q {

    /* renamed from: b, reason: collision with root package name */
    public static final zq5.p f556619b = new zq5.p(null);

    /* renamed from: c, reason: collision with root package name */
    public static final long f556620c = zq5.s.a(Float.NaN, Float.NaN);

    /* renamed from: a, reason: collision with root package name */
    public final long f556621a;

    public /* synthetic */ q(long j17) {
        this.f556621a = j17;
    }

    public static final boolean a(long j17, long j18) {
        return j17 == j18;
    }

    public static final float b(long j17) {
        if (j17 != f556620c) {
            return java.lang.Float.intBitsToFloat((int) (j17 >> 32));
        }
        throw new java.lang.IllegalStateException("ScaleFactorCompat is unspecified".toString());
    }

    public static final float c(long j17) {
        if (j17 != f556620c) {
            return java.lang.Float.intBitsToFloat((int) (j17 & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2));
        }
        throw new java.lang.IllegalStateException("ScaleFactorCompat is unspecified".toString());
    }

    /* renamed from: equals */
    public boolean m179337xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof zq5.q) {
            return this.f556621a == ((zq5.q) obj).f556621a;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m179338x8cdac1b() {
        return java.lang.Long.hashCode(this.f556621a);
    }

    /* renamed from: toString */
    public java.lang.String m179339x9616526c() {
        long j17 = this.f556621a;
        if (!(j17 != f556620c)) {
            return "ScaleFactorCompat.Unspecified";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ScaleFactorCompat(");
        float f17 = 10;
        float b17 = b(j17) * f17;
        int i17 = (int) b17;
        if (b17 - i17 >= 0.5f) {
            i17++;
        }
        sb6.append(i17 / f17);
        sb6.append(", ");
        float c17 = c(j17) * f17;
        int i18 = (int) c17;
        if (c17 - i18 >= 0.5f) {
            i18++;
        }
        sb6.append(i18 / f17);
        sb6.append(')');
        return sb6.toString();
    }
}
