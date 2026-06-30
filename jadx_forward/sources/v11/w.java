package v11;

/* loaded from: classes11.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final v11.j0 f514006a;

    /* renamed from: b, reason: collision with root package name */
    public final v11.x f514007b;

    /* renamed from: c, reason: collision with root package name */
    public final float f514008c;

    /* renamed from: d, reason: collision with root package name */
    public final int f514009d;

    /* renamed from: e, reason: collision with root package name */
    public final float f514010e;

    /* renamed from: f, reason: collision with root package name */
    public final int f514011f;

    /* renamed from: g, reason: collision with root package name */
    public final int f514012g;

    /* renamed from: h, reason: collision with root package name */
    public final int f514013h;

    /* renamed from: i, reason: collision with root package name */
    public final int f514014i;

    /* renamed from: j, reason: collision with root package name */
    public final int f514015j;

    /* renamed from: k, reason: collision with root package name */
    public final int f514016k;

    /* renamed from: l, reason: collision with root package name */
    public final int f514017l;

    /* renamed from: m, reason: collision with root package name */
    public final int f514018m;

    /* renamed from: n, reason: collision with root package name */
    public final int f514019n;

    public w(v11.j0 contentTextView, v11.x highlightColors, float f17, int i17, float f18, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentTextView, "contentTextView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(highlightColors, "highlightColors");
        this.f514006a = contentTextView;
        this.f514007b = highlightColors;
        this.f514008c = f17;
        this.f514009d = i17;
        this.f514010e = f18;
        this.f514011f = i18;
        this.f514012g = i19;
        this.f514013h = i27;
        this.f514014i = i28;
        this.f514015j = i29;
        this.f514016k = i37;
        this.f514017l = i38;
        this.f514018m = i39;
        this.f514019n = i47;
    }

    public static v11.w a(v11.w wVar, v11.j0 j0Var, v11.x xVar, float f17, int i17, float f18, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47, int i48, java.lang.Object obj) {
        v11.j0 contentTextView = (i48 & 1) != 0 ? wVar.f514006a : j0Var;
        v11.x highlightColors = (i48 & 2) != 0 ? wVar.f514007b : xVar;
        float f19 = (i48 & 4) != 0 ? wVar.f514008c : f17;
        int i49 = (i48 & 8) != 0 ? wVar.f514009d : i17;
        float f27 = (i48 & 16) != 0 ? wVar.f514010e : f18;
        int i57 = (i48 & 32) != 0 ? wVar.f514011f : i18;
        int i58 = (i48 & 64) != 0 ? wVar.f514012g : i19;
        int i59 = (i48 & 128) != 0 ? wVar.f514013h : i27;
        int i66 = (i48 & 256) != 0 ? wVar.f514014i : i28;
        int i67 = (i48 & 512) != 0 ? wVar.f514015j : i29;
        int i68 = (i48 & 1024) != 0 ? wVar.f514016k : i37;
        int i69 = (i48 & 2048) != 0 ? wVar.f514017l : i38;
        int i76 = (i48 & 4096) != 0 ? wVar.f514018m : i39;
        int i77 = (i48 & 8192) != 0 ? wVar.f514019n : i47;
        wVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentTextView, "contentTextView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(highlightColors, "highlightColors");
        return new v11.w(contentTextView, highlightColors, f19, i49, f27, i57, i58, i59, i66, i67, i68, i69, i76, i77);
    }

    /* renamed from: equals */
    public boolean m170958xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.w)) {
            return false;
        }
        v11.w wVar = (v11.w) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f514006a, wVar.f514006a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f514007b, wVar.f514007b) && java.lang.Float.compare(this.f514008c, wVar.f514008c) == 0 && this.f514009d == wVar.f514009d && java.lang.Float.compare(this.f514010e, wVar.f514010e) == 0 && this.f514011f == wVar.f514011f && this.f514012g == wVar.f514012g && this.f514013h == wVar.f514013h && this.f514014i == wVar.f514014i && this.f514015j == wVar.f514015j && this.f514016k == wVar.f514016k && this.f514017l == wVar.f514017l && this.f514018m == wVar.f514018m && this.f514019n == wVar.f514019n;
    }

    /* renamed from: hashCode */
    public int m170959x8cdac1b() {
        return (((((((((((((((((((((((((this.f514006a.m170909x8cdac1b() * 31) + this.f514007b.m170962x8cdac1b()) * 31) + java.lang.Float.hashCode(this.f514008c)) * 31) + java.lang.Integer.hashCode(this.f514009d)) * 31) + java.lang.Float.hashCode(this.f514010e)) * 31) + java.lang.Integer.hashCode(this.f514011f)) * 31) + java.lang.Integer.hashCode(this.f514012g)) * 31) + java.lang.Integer.hashCode(this.f514013h)) * 31) + java.lang.Integer.hashCode(this.f514014i)) * 31) + java.lang.Integer.hashCode(this.f514015j)) * 31) + java.lang.Integer.hashCode(this.f514016k)) * 31) + java.lang.Integer.hashCode(this.f514017l)) * 31) + java.lang.Integer.hashCode(this.f514018m)) * 31) + java.lang.Integer.hashCode(this.f514019n);
    }

    /* renamed from: toString */
    public java.lang.String m170960x9616526c() {
        return "NativeMarkdownCodeBlockConfig(contentTextView=" + this.f514006a + ", highlightColors=" + this.f514007b + ", languageTextSizeDp=" + this.f514008c + ", languageTextColor=" + this.f514009d + ", languageTextFontWeight=" + this.f514010e + ", copyButtonSizePx=" + this.f514011f + ", copyIconColor=" + this.f514012g + ", elementGapPx=" + this.f514013h + ", actionBarTopMarginPx=" + this.f514014i + ", contentMarginTopPx=" + this.f514015j + ", contentMarginBottomPx=" + this.f514016k + ", separatorColor=" + this.f514017l + ", separatorHeightPx=" + this.f514018m + ", separatorMarginPx=" + this.f514019n + ')';
    }
}
