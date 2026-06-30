package i0;

/* loaded from: classes14.dex */
public final class f implements i0.b {

    /* renamed from: a, reason: collision with root package name */
    public final float f368025a;

    public f(float f17) {
        this.f368025a = f17;
        if (f17 < 0.0f || f17 > 100.0f) {
            throw new java.lang.IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    @Override // i0.b
    public float a(long j17, p2.f density) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(density, "density");
        return d1.k.c(j17) * (this.f368025a / 100.0f);
    }

    /* renamed from: equals */
    public boolean m134317xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0.f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368025a), java.lang.Float.valueOf(((i0.f) obj).f368025a));
    }

    /* renamed from: hashCode */
    public int m134318x8cdac1b() {
        return java.lang.Float.hashCode(this.f368025a);
    }

    /* renamed from: toString */
    public java.lang.String m134319x9616526c() {
        return "CornerSize(size = " + this.f368025a + "%)";
    }
}
