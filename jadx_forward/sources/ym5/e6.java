package ym5;

/* loaded from: classes.dex */
public final class e6 {

    /* renamed from: a, reason: collision with root package name */
    public final double f544799a;

    /* renamed from: b, reason: collision with root package name */
    public final double f544800b;

    /* renamed from: c, reason: collision with root package name */
    public final int f544801c;

    public e6(double d17, double d18, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        d17 = (i18 & 1) != 0 ? 0.0d : d17;
        d18 = (i18 & 2) != 0 ? 0.0d : d18;
        i17 = (i18 & 4) != 0 ? 17 : i17;
        this.f544799a = d17;
        this.f544800b = d18;
        this.f544801c = i17;
    }

    /* renamed from: equals */
    public boolean m177303xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym5.e6)) {
            return false;
        }
        ym5.e6 e6Var = (ym5.e6) obj;
        return java.lang.Double.compare(this.f544799a, e6Var.f544799a) == 0 && java.lang.Double.compare(this.f544800b, e6Var.f544800b) == 0 && this.f544801c == e6Var.f544801c;
    }

    /* renamed from: hashCode */
    public int m177304x8cdac1b() {
        return (((java.lang.Double.hashCode(this.f544799a) * 31) + java.lang.Double.hashCode(this.f544800b)) * 31) + java.lang.Integer.hashCode(this.f544801c);
    }

    /* renamed from: toString */
    public java.lang.String m177305x9616526c() {
        return "LayoutConfig(X_width=" + this.f544799a + ", X_height=" + this.f544800b + ", gravity=" + this.f544801c + ')';
    }
}
