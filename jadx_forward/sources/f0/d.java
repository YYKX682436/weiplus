package f0;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f339573a;

    /* renamed from: equals */
    public boolean m128517xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof f0.d) {
            return this.f339573a == ((f0.d) obj).f339573a;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m128518x8cdac1b() {
        return java.lang.Long.hashCode(this.f339573a);
    }

    /* renamed from: toString */
    public java.lang.String m128519x9616526c() {
        return "GridItemSpan(packedValue=" + this.f339573a + ')';
    }
}
