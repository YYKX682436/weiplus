package g05;

/* loaded from: classes7.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final double f349028a;

    /* renamed from: b, reason: collision with root package name */
    public final double f349029b;

    public t(double d17, double d18) {
        this.f349028a = d17;
        this.f349029b = d18;
    }

    /* renamed from: equals */
    public boolean m130612xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g05.t)) {
            return false;
        }
        g05.t tVar = (g05.t) obj;
        return java.lang.Double.compare(this.f349028a, tVar.f349028a) == 0 && java.lang.Double.compare(this.f349029b, tVar.f349029b) == 0;
    }

    /* renamed from: hashCode */
    public int m130613x8cdac1b() {
        return (java.lang.Double.hashCode(this.f349028a) * 31) + java.lang.Double.hashCode(this.f349029b);
    }

    /* renamed from: toString */
    public java.lang.String m130614x9616526c() {
        return "WxGameCardViewInfo(offsetHeight=" + this.f349028a + ", offsetTop=" + this.f349029b + ')';
    }
}
