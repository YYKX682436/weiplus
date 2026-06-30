package a12;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final double f82040a;

    /* renamed from: b, reason: collision with root package name */
    public final double f82041b;

    public a(double d17, double d18) {
        this.f82040a = d17;
        this.f82041b = d18;
    }

    /* renamed from: equals */
    public boolean m240xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a12.a)) {
            return false;
        }
        a12.a aVar = (a12.a) obj;
        return java.lang.Double.compare(this.f82040a, aVar.f82040a) == 0 && java.lang.Double.compare(this.f82041b, aVar.f82041b) == 0;
    }

    /* renamed from: hashCode */
    public int m241x8cdac1b() {
        return (java.lang.Double.hashCode(this.f82040a) * 31) + java.lang.Double.hashCode(this.f82041b);
    }

    /* renamed from: toString */
    public java.lang.String m242x9616526c() {
        return "EcsKFDynamicCardViewInfo(offsetHeight=" + this.f82040a + ", offsetTop=" + this.f82041b + ')';
    }
}
