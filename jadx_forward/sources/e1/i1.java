package e1;

/* loaded from: classes14.dex */
public final class i1 {

    /* renamed from: b, reason: collision with root package name */
    public static final long f327805b = (java.lang.Float.floatToIntBits(0.5f) << 32) | (java.lang.Float.floatToIntBits(0.5f) & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f327806c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f327807a;

    public static final float a(long j17) {
        return java.lang.Float.intBitsToFloat((int) (j17 & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2));
    }

    /* renamed from: equals */
    public boolean m126652xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof e1.i1) {
            return this.f327807a == ((e1.i1) obj).f327807a;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m126653x8cdac1b() {
        return java.lang.Long.hashCode(this.f327807a);
    }

    /* renamed from: toString */
    public java.lang.String m126654x9616526c() {
        return "TransformOrigin(packedValue=" + this.f327807a + ')';
    }
}
