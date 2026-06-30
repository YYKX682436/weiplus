package xt2;

/* loaded from: classes3.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f538592a;

    /* renamed from: b, reason: collision with root package name */
    public final int f538593b;

    /* renamed from: c, reason: collision with root package name */
    public final int f538594c;

    /* renamed from: d, reason: collision with root package name */
    public final int f538595d;

    /* renamed from: e, reason: collision with root package name */
    public final int f538596e;

    /* renamed from: f, reason: collision with root package name */
    public final int f538597f;

    /* renamed from: g, reason: collision with root package name */
    public final int f538598g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f538599h;

    /* renamed from: i, reason: collision with root package name */
    public final float f538600i;

    /* renamed from: j, reason: collision with root package name */
    public final int f538601j;

    /* renamed from: k, reason: collision with root package name */
    public final int f538602k;

    /* renamed from: l, reason: collision with root package name */
    public final int f538603l;

    public v1(int i17, int i18, int i19, int i27, int i28, int i29, int i37, boolean z17, float f17, int i38, int i39, int i47) {
        this.f538592a = i17;
        this.f538593b = i18;
        this.f538594c = i19;
        this.f538595d = i27;
        this.f538596e = i28;
        this.f538597f = i29;
        this.f538598g = i37;
        this.f538599h = z17;
        this.f538600i = f17;
        this.f538601j = i38;
        this.f538602k = i39;
        this.f538603l = i47;
    }

    /* renamed from: equals */
    public boolean m175959xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt2.v1)) {
            return false;
        }
        xt2.v1 v1Var = (xt2.v1) obj;
        return this.f538592a == v1Var.f538592a && this.f538593b == v1Var.f538593b && this.f538594c == v1Var.f538594c && this.f538595d == v1Var.f538595d && this.f538596e == v1Var.f538596e && this.f538597f == v1Var.f538597f && this.f538598g == v1Var.f538598g && this.f538599h == v1Var.f538599h && java.lang.Float.compare(this.f538600i, v1Var.f538600i) == 0 && this.f538601j == v1Var.f538601j && this.f538602k == v1Var.f538602k && this.f538603l == v1Var.f538603l;
    }

    /* renamed from: hashCode */
    public int m175960x8cdac1b() {
        return (((((((((((((((((((((java.lang.Integer.hashCode(this.f538592a) * 31) + java.lang.Integer.hashCode(this.f538593b)) * 31) + java.lang.Integer.hashCode(this.f538594c)) * 31) + java.lang.Integer.hashCode(this.f538595d)) * 31) + java.lang.Integer.hashCode(this.f538596e)) * 31) + java.lang.Integer.hashCode(this.f538597f)) * 31) + java.lang.Integer.hashCode(this.f538598g)) * 31) + java.lang.Boolean.hashCode(this.f538599h)) * 31) + java.lang.Float.hashCode(this.f538600i)) * 31) + java.lang.Integer.hashCode(this.f538601j)) * 31) + java.lang.Integer.hashCode(this.f538602k)) * 31) + java.lang.Integer.hashCode(this.f538603l);
    }

    /* renamed from: toString */
    public java.lang.String m175961x9616526c() {
        return "MeasureCacheKey(widthSpecMode=" + this.f538592a + ", widthSpecSize=" + this.f538593b + ", heightSpecMode=" + this.f538594c + ", heightSpecSize=" + this.f538595d + ", textHashCode=" + this.f538596e + ", textLength=" + this.f538597f + ", spanCount=" + this.f538598g + ", isDarkMode=" + this.f538599h + ", fontSize=" + this.f538600i + ", drawableHashCode=" + this.f538601j + ", maxLines=" + this.f538602k + ", minLines=" + this.f538603l + ')';
    }
}
