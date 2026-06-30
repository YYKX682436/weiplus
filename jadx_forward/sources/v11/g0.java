package v11;

/* loaded from: classes11.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final v11.j0 f513910a;

    /* renamed from: b, reason: collision with root package name */
    public final v11.j0 f513911b;

    /* renamed from: c, reason: collision with root package name */
    public final int f513912c;

    /* renamed from: d, reason: collision with root package name */
    public final int f513913d;

    /* renamed from: e, reason: collision with root package name */
    public final int f513914e;

    /* renamed from: f, reason: collision with root package name */
    public final int f513915f;

    /* renamed from: g, reason: collision with root package name */
    public final int f513916g;

    /* renamed from: h, reason: collision with root package name */
    public final int f513917h;

    /* renamed from: i, reason: collision with root package name */
    public final int f513918i;

    /* renamed from: j, reason: collision with root package name */
    public final int f513919j;

    /* renamed from: k, reason: collision with root package name */
    public final int f513920k;

    /* renamed from: l, reason: collision with root package name */
    public final int f513921l;

    /* renamed from: m, reason: collision with root package name */
    public final int f513922m;

    /* renamed from: n, reason: collision with root package name */
    public final int f513923n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f513924o;

    /* renamed from: p, reason: collision with root package name */
    public final v11.b0 f513925p;

    public g0(v11.j0 cellTextView, v11.j0 headerTextView, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47, int i48, int i49, boolean z17, v11.b0 b0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cellTextView, "cellTextView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headerTextView, "headerTextView");
        this.f513910a = cellTextView;
        this.f513911b = headerTextView;
        this.f513912c = i17;
        this.f513913d = i18;
        this.f513914e = i19;
        this.f513915f = i27;
        this.f513916g = i28;
        this.f513917h = i29;
        this.f513918i = i37;
        this.f513919j = i38;
        this.f513920k = i39;
        this.f513921l = i47;
        this.f513922m = i48;
        this.f513923n = i49;
        this.f513924o = z17;
        this.f513925p = b0Var;
    }

    public static v11.g0 a(v11.g0 g0Var, v11.j0 j0Var, v11.j0 j0Var2, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47, int i48, int i49, boolean z17, v11.b0 b0Var, int i57, java.lang.Object obj) {
        v11.j0 cellTextView = (i57 & 1) != 0 ? g0Var.f513910a : j0Var;
        v11.j0 headerTextView = (i57 & 2) != 0 ? g0Var.f513911b : j0Var2;
        int i58 = (i57 & 4) != 0 ? g0Var.f513912c : i17;
        int i59 = (i57 & 8) != 0 ? g0Var.f513913d : i18;
        int i66 = (i57 & 16) != 0 ? g0Var.f513914e : i19;
        int i67 = (i57 & 32) != 0 ? g0Var.f513915f : i27;
        int i68 = (i57 & 64) != 0 ? g0Var.f513916g : i28;
        int i69 = (i57 & 128) != 0 ? g0Var.f513917h : i29;
        int i76 = (i57 & 256) != 0 ? g0Var.f513918i : i37;
        int i77 = (i57 & 512) != 0 ? g0Var.f513919j : i38;
        int i78 = (i57 & 1024) != 0 ? g0Var.f513920k : i39;
        int i79 = (i57 & 2048) != 0 ? g0Var.f513921l : i47;
        int i86 = (i57 & 4096) != 0 ? g0Var.f513922m : i48;
        int i87 = (i57 & 8192) != 0 ? g0Var.f513923n : i49;
        boolean z18 = (i57 & 16384) != 0 ? g0Var.f513924o : z17;
        v11.b0 b0Var2 = (i57 & 32768) != 0 ? g0Var.f513925p : b0Var;
        g0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cellTextView, "cellTextView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headerTextView, "headerTextView");
        return new v11.g0(cellTextView, headerTextView, i58, i59, i66, i67, i68, i69, i76, i77, i78, i79, i86, i87, z18, b0Var2);
    }

    /* renamed from: equals */
    public boolean m170890xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.g0)) {
            return false;
        }
        v11.g0 g0Var = (v11.g0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513910a, g0Var.f513910a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513911b, g0Var.f513911b) && this.f513912c == g0Var.f513912c && this.f513913d == g0Var.f513913d && this.f513914e == g0Var.f513914e && this.f513915f == g0Var.f513915f && this.f513916g == g0Var.f513916g && this.f513917h == g0Var.f513917h && this.f513918i == g0Var.f513918i && this.f513919j == g0Var.f513919j && this.f513920k == g0Var.f513920k && this.f513921l == g0Var.f513921l && this.f513922m == g0Var.f513922m && this.f513923n == g0Var.f513923n && this.f513924o == g0Var.f513924o && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513925p, g0Var.f513925p);
    }

    /* renamed from: hashCode */
    public int m170891x8cdac1b() {
        int m170909x8cdac1b = ((((((((((((((((((((((((((((this.f513910a.m170909x8cdac1b() * 31) + this.f513911b.m170909x8cdac1b()) * 31) + java.lang.Integer.hashCode(this.f513912c)) * 31) + java.lang.Integer.hashCode(this.f513913d)) * 31) + java.lang.Integer.hashCode(this.f513914e)) * 31) + java.lang.Integer.hashCode(this.f513915f)) * 31) + java.lang.Integer.hashCode(this.f513916g)) * 31) + java.lang.Integer.hashCode(this.f513917h)) * 31) + java.lang.Integer.hashCode(this.f513918i)) * 31) + java.lang.Integer.hashCode(this.f513919j)) * 31) + java.lang.Integer.hashCode(this.f513920k)) * 31) + java.lang.Integer.hashCode(this.f513921l)) * 31) + java.lang.Integer.hashCode(this.f513922m)) * 31) + java.lang.Integer.hashCode(this.f513923n)) * 31) + java.lang.Boolean.hashCode(this.f513924o)) * 31;
        v11.b0 b0Var = this.f513925p;
        return m170909x8cdac1b + (b0Var == null ? 0 : b0Var.m170867x8cdac1b());
    }

    /* renamed from: toString */
    public java.lang.String m170892x9616526c() {
        return "NativeMarkdownTableConfig(cellTextView=" + this.f513910a + ", headerTextView=" + this.f513911b + ", horizontalPaddingPx=" + this.f513912c + ", verticalPaddingPx=" + this.f513913d + ", cellStartPaddingPx=" + this.f513914e + ", cellEndPaddingPx=" + this.f513915f + ", lastRowCellEndPaddingPx=" + this.f513916g + ", cellVerticalPaddingPx=" + this.f513917h + ", headerTopPaddingPx=" + this.f513918i + ", bottomDividerBottomMarginPx=" + this.f513919j + ", minCellWidthPx=" + this.f513920k + ", maxCellWidthPx=" + this.f513921l + ", borderWidthPx=" + this.f513922m + ", borderColor=" + this.f513923n + ", drawVerticalDivider=" + this.f513924o + ", inlineStyleOverride=" + this.f513925p + ')';
    }
}
