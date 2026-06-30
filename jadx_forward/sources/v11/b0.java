package v11;

/* loaded from: classes11.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f513866a;

    /* renamed from: b, reason: collision with root package name */
    public final int f513867b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f513868c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f513869d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f513870e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f513871f;

    /* renamed from: g, reason: collision with root package name */
    public final int f513872g;

    /* renamed from: h, reason: collision with root package name */
    public final int f513873h;

    /* renamed from: i, reason: collision with root package name */
    public final int f513874i;

    /* renamed from: j, reason: collision with root package name */
    public final int f513875j;

    /* renamed from: k, reason: collision with root package name */
    public final int f513876k;

    /* renamed from: l, reason: collision with root package name */
    public final int f513877l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f513878m;

    public b0(int i17, int i18, boolean z17, boolean z18, boolean z19, boolean z27, int i19, int i27, int i28, int i29, int i37, int i38, boolean z28) {
        this.f513866a = i17;
        this.f513867b = i18;
        this.f513868c = z17;
        this.f513869d = z18;
        this.f513870e = z19;
        this.f513871f = z27;
        this.f513872g = i19;
        this.f513873h = i27;
        this.f513874i = i28;
        this.f513875j = i29;
        this.f513876k = i37;
        this.f513877l = i38;
        this.f513878m = z28;
    }

    public static v11.b0 a(v11.b0 b0Var, int i17, int i18, boolean z17, boolean z18, boolean z19, boolean z27, int i19, int i27, int i28, int i29, int i37, int i38, boolean z28, int i39, java.lang.Object obj) {
        int i47 = (i39 & 1) != 0 ? b0Var.f513866a : i17;
        int i48 = (i39 & 2) != 0 ? b0Var.f513867b : i18;
        boolean z29 = (i39 & 4) != 0 ? b0Var.f513868c : z17;
        boolean z37 = (i39 & 8) != 0 ? b0Var.f513869d : z18;
        boolean z38 = (i39 & 16) != 0 ? b0Var.f513870e : z19;
        boolean z39 = (i39 & 32) != 0 ? b0Var.f513871f : z27;
        int i49 = (i39 & 64) != 0 ? b0Var.f513872g : i19;
        int i57 = (i39 & 128) != 0 ? b0Var.f513873h : i27;
        int i58 = (i39 & 256) != 0 ? b0Var.f513874i : i28;
        int i59 = (i39 & 512) != 0 ? b0Var.f513875j : i29;
        int i66 = (i39 & 1024) != 0 ? b0Var.f513876k : i37;
        int i67 = (i39 & 2048) != 0 ? b0Var.f513877l : i38;
        boolean z47 = (i39 & 4096) != 0 ? b0Var.f513878m : z28;
        b0Var.getClass();
        return new v11.b0(i47, i48, z29, z37, z38, z39, i49, i57, i58, i59, i66, i67, z47);
    }

    /* renamed from: equals */
    public boolean m170866xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.b0)) {
            return false;
        }
        v11.b0 b0Var = (v11.b0) obj;
        return this.f513866a == b0Var.f513866a && this.f513867b == b0Var.f513867b && this.f513868c == b0Var.f513868c && this.f513869d == b0Var.f513869d && this.f513870e == b0Var.f513870e && this.f513871f == b0Var.f513871f && this.f513872g == b0Var.f513872g && this.f513873h == b0Var.f513873h && this.f513874i == b0Var.f513874i && this.f513875j == b0Var.f513875j && this.f513876k == b0Var.f513876k && this.f513877l == b0Var.f513877l && this.f513878m == b0Var.f513878m;
    }

    /* renamed from: hashCode */
    public int m170867x8cdac1b() {
        return (((((((((((((((((((((((java.lang.Integer.hashCode(this.f513866a) * 31) + java.lang.Integer.hashCode(this.f513867b)) * 31) + java.lang.Boolean.hashCode(this.f513868c)) * 31) + java.lang.Boolean.hashCode(this.f513869d)) * 31) + java.lang.Boolean.hashCode(this.f513870e)) * 31) + java.lang.Boolean.hashCode(this.f513871f)) * 31) + java.lang.Integer.hashCode(this.f513872g)) * 31) + java.lang.Integer.hashCode(this.f513873h)) * 31) + java.lang.Integer.hashCode(this.f513874i)) * 31) + java.lang.Integer.hashCode(this.f513875j)) * 31) + java.lang.Integer.hashCode(this.f513876k)) * 31) + java.lang.Integer.hashCode(this.f513877l)) * 31) + java.lang.Boolean.hashCode(this.f513878m);
    }

    /* renamed from: toString */
    public java.lang.String m170868x9616526c() {
        return "NativeMarkdownInlineStyleConfig(linkColor=" + this.f513866a + ", linkPressedBgColor=" + this.f513867b + ", linkBold=" + this.f513868c + ", underlineLink=" + this.f513869d + ", useMonospaceForInlineCode=" + this.f513870e + ", useMonospaceForInlineMath=" + this.f513871f + ", inlineCodeTextSizePx=" + this.f513872g + ", inlineCodeBackgroundColor=" + this.f513873h + ", inlineCodeCornerRadiusPx=" + this.f513874i + ", inlineCodeHorizontalPaddingPx=" + this.f513875j + ", inlineCodeHorizontalMarginPx=" + this.f513876k + ", inlineCodeVerticalPaddingPx=" + this.f513877l + ", inlineCodeUseMediumWeight=" + this.f513878m + ')';
    }
}
