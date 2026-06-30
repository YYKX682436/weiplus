package fm3;

/* loaded from: classes10.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f345621a;

    /* renamed from: b, reason: collision with root package name */
    public final long f345622b = c01.id.c();

    /* renamed from: c, reason: collision with root package name */
    public int f345623c;

    /* renamed from: d, reason: collision with root package name */
    public int f345624d;

    /* renamed from: e, reason: collision with root package name */
    public int f345625e;

    public l0(int i17) {
        this.f345621a = i17;
    }

    /* renamed from: equals */
    public boolean m129781xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fm3.l0) && this.f345621a == ((fm3.l0) obj).f345621a;
    }

    /* renamed from: hashCode */
    public int m129782x8cdac1b() {
        return java.lang.Integer.hashCode(this.f345621a);
    }

    /* renamed from: toString */
    public java.lang.String m129783x9616526c() {
        return "StatRecord(index=" + this.f345621a + ')';
    }
}
