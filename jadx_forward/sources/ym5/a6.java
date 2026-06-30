package ym5;

/* loaded from: classes8.dex */
public final class a6 {

    /* renamed from: a, reason: collision with root package name */
    public final double f544731a;

    /* renamed from: b, reason: collision with root package name */
    public final double f544732b;

    /* renamed from: c, reason: collision with root package name */
    public final double f544733c;

    /* renamed from: d, reason: collision with root package name */
    public final double f544734d;

    /* renamed from: e, reason: collision with root package name */
    public final int f544735e;

    public a6(double d17, double d18, double d19, double d27, int i17) {
        this.f544731a = d17;
        this.f544732b = d18;
        this.f544733c = d19;
        this.f544734d = d27;
        this.f544735e = i17;
    }

    /* renamed from: equals */
    public boolean m177296xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym5.a6)) {
            return false;
        }
        ym5.a6 a6Var = (ym5.a6) obj;
        return java.lang.Double.compare(this.f544731a, a6Var.f544731a) == 0 && java.lang.Double.compare(this.f544732b, a6Var.f544732b) == 0 && java.lang.Double.compare(this.f544733c, a6Var.f544733c) == 0 && java.lang.Double.compare(this.f544734d, a6Var.f544734d) == 0 && this.f544735e == a6Var.f544735e;
    }

    /* renamed from: hashCode */
    public int m177297x8cdac1b() {
        return (((((((java.lang.Double.hashCode(this.f544731a) * 31) + java.lang.Double.hashCode(this.f544732b)) * 31) + java.lang.Double.hashCode(this.f544733c)) * 31) + java.lang.Double.hashCode(this.f544734d)) * 31) + java.lang.Integer.hashCode(this.f544735e);
    }

    /* renamed from: toString */
    public java.lang.String m177298x9616526c() {
        return "LayoutConfig(X_width=" + this.f544731a + ", X_height=" + this.f544732b + ", X_WideScreenWidth=" + this.f544733c + ", X_WideScreenHeight=" + this.f544734d + ", gravity=" + this.f544735e + ')';
    }

    public /* synthetic */ a6(double d17, double d18, double d19, double d27, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i18 & 1) != 0 ? 0.0d : d17, (i18 & 2) != 0 ? 0.0d : d18, (i18 & 4) != 0 ? 0.0d : d19, (i18 & 8) == 0 ? d27 : 0.0d, (i18 & 16) != 0 ? 17 : i17);
    }
}
