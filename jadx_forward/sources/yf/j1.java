package yf;

/* loaded from: classes11.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final double f542936a;

    /* renamed from: b, reason: collision with root package name */
    public final double f542937b;

    /* renamed from: c, reason: collision with root package name */
    public final double f542938c;

    /* renamed from: d, reason: collision with root package name */
    public final double f542939d;

    public j1(double d17, double d18, double d19, double d27) {
        this.f542936a = d17;
        this.f542937b = d18;
        this.f542938c = d19;
        this.f542939d = d27;
    }

    /* renamed from: equals */
    public boolean m176938xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf.j1)) {
            return false;
        }
        yf.j1 j1Var = (yf.j1) obj;
        return java.lang.Double.compare(this.f542936a, j1Var.f542936a) == 0 && java.lang.Double.compare(this.f542937b, j1Var.f542937b) == 0 && java.lang.Double.compare(this.f542938c, j1Var.f542938c) == 0 && java.lang.Double.compare(this.f542939d, j1Var.f542939d) == 0;
    }

    /* renamed from: hashCode */
    public int m176939x8cdac1b() {
        return (((((java.lang.Double.hashCode(this.f542936a) * 31) + java.lang.Double.hashCode(this.f542937b)) * 31) + java.lang.Double.hashCode(this.f542938c)) * 31) + java.lang.Double.hashCode(this.f542939d);
    }

    /* renamed from: toString */
    public java.lang.String m176940x9616526c() {
        return "Position(x1=" + this.f542936a + ", y1=" + this.f542937b + ", x2=" + this.f542938c + ", y2=" + this.f542939d + ')';
    }
}
