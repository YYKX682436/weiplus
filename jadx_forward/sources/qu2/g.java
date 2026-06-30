package qu2;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final float f448314a;

    public g(float f17) {
        this.f448314a = f17;
    }

    /* renamed from: equals */
    public boolean m160892xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qu2.g) && java.lang.Float.compare(this.f448314a, ((qu2.g) obj).f448314a) == 0;
    }

    /* renamed from: hashCode */
    public int m160893x8cdac1b() {
        return java.lang.Float.hashCode(this.f448314a);
    }

    /* renamed from: toString */
    public java.lang.String m160894x9616526c() {
        return "MemoryData(pss=" + this.f448314a + ')';
    }
}
