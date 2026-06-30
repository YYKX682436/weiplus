package ak4;

/* loaded from: classes11.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f87161a;

    /* renamed from: b, reason: collision with root package name */
    public final int f87162b;

    /* renamed from: c, reason: collision with root package name */
    public final int f87163c;

    /* renamed from: d, reason: collision with root package name */
    public final int f87164d;

    /* renamed from: e, reason: collision with root package name */
    public final int f87165e;

    /* renamed from: f, reason: collision with root package name */
    public final int f87166f;

    /* renamed from: g, reason: collision with root package name */
    public final int f87167g;

    /* renamed from: h, reason: collision with root package name */
    public final int f87168h;

    /* renamed from: i, reason: collision with root package name */
    public final int f87169i;

    /* renamed from: j, reason: collision with root package name */
    public final int f87170j;

    /* renamed from: k, reason: collision with root package name */
    public final int f87171k;

    /* renamed from: l, reason: collision with root package name */
    public final int f87172l;

    /* renamed from: m, reason: collision with root package name */
    public final int f87173m;

    /* renamed from: n, reason: collision with root package name */
    public final int f87174n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f87175o;

    /* renamed from: p, reason: collision with root package name */
    public final int f87176p;

    /* renamed from: q, reason: collision with root package name */
    public final int f87177q;

    /* renamed from: r, reason: collision with root package name */
    public final int f87178r;

    /* renamed from: s, reason: collision with root package name */
    public final int f87179s;

    public i(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47, int i48, int i49, int i57, int i58, boolean z17, int i59, int i66, int i67, int i68) {
        this.f87161a = i17;
        this.f87162b = i18;
        this.f87163c = i19;
        this.f87164d = i27;
        this.f87165e = i28;
        this.f87166f = i29;
        this.f87167g = i37;
        this.f87168h = i38;
        this.f87169i = i39;
        this.f87170j = i47;
        this.f87171k = i48;
        this.f87172l = i49;
        this.f87173m = i57;
        this.f87174n = i58;
        this.f87175o = z17;
        this.f87176p = i59;
        this.f87177q = i66;
        this.f87178r = i67;
        this.f87179s = i68;
    }

    /* renamed from: equals */
    public boolean m2171xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ak4.i)) {
            return false;
        }
        ak4.i iVar = (ak4.i) obj;
        return this.f87161a == iVar.f87161a && this.f87162b == iVar.f87162b && this.f87163c == iVar.f87163c && this.f87164d == iVar.f87164d && this.f87165e == iVar.f87165e && this.f87166f == iVar.f87166f && this.f87167g == iVar.f87167g && this.f87168h == iVar.f87168h && this.f87169i == iVar.f87169i && this.f87170j == iVar.f87170j && this.f87171k == iVar.f87171k && this.f87172l == iVar.f87172l && this.f87173m == iVar.f87173m && this.f87174n == iVar.f87174n && this.f87175o == iVar.f87175o && this.f87176p == iVar.f87176p && this.f87177q == iVar.f87177q && this.f87178r == iVar.f87178r && this.f87179s == iVar.f87179s;
    }

    /* renamed from: hashCode */
    public int m2172x8cdac1b() {
        return (((((((((((((((((((((((((((((((((((java.lang.Integer.hashCode(this.f87161a) * 31) + java.lang.Integer.hashCode(this.f87162b)) * 31) + java.lang.Integer.hashCode(this.f87163c)) * 31) + java.lang.Integer.hashCode(this.f87164d)) * 31) + java.lang.Integer.hashCode(this.f87165e)) * 31) + java.lang.Integer.hashCode(this.f87166f)) * 31) + java.lang.Integer.hashCode(this.f87167g)) * 31) + java.lang.Integer.hashCode(this.f87168h)) * 31) + java.lang.Integer.hashCode(this.f87169i)) * 31) + java.lang.Integer.hashCode(this.f87170j)) * 31) + java.lang.Integer.hashCode(this.f87171k)) * 31) + java.lang.Integer.hashCode(this.f87172l)) * 31) + java.lang.Integer.hashCode(this.f87173m)) * 31) + java.lang.Integer.hashCode(this.f87174n)) * 31) + java.lang.Boolean.hashCode(this.f87175o)) * 31) + java.lang.Integer.hashCode(this.f87176p)) * 31) + java.lang.Integer.hashCode(this.f87177q)) * 31) + java.lang.Integer.hashCode(this.f87178r)) * 31) + java.lang.Integer.hashCode(this.f87179s);
    }

    /* renamed from: toString */
    public java.lang.String m2173x9616526c() {
        return "Metrics(totalWidth=" + this.f87161a + ", totalHeight=" + this.f87162b + ", contentWidth=" + this.f87163c + ", contentHeight=" + this.f87164d + ", attachLeftPx=" + this.f87165e + ", attachRightPx=" + this.f87166f + ", insetLeft=" + this.f87167g + ", insetTop=" + this.f87168h + ", insetRight=" + this.f87169i + ", insetBottom=" + this.f87170j + ", iconX=" + this.f87171k + ", iconY=" + this.f87172l + ", iconW=" + this.f87173m + ", iconH=" + this.f87174n + ", showWording=" + this.f87175o + ", wordingX=" + this.f87176p + ", wordingBaseY=" + this.f87177q + ", wordingWidth=" + this.f87178r + ", wordingHeight=" + this.f87179s + ')';
    }
}
