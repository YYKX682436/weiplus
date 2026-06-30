package r01;

/* loaded from: classes8.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f449626a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f449627b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f449628c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f449629d;

    /* renamed from: e, reason: collision with root package name */
    public final int f449630e;

    /* renamed from: f, reason: collision with root package name */
    public final int f449631f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f449632g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f449633h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f449634i;

    /* renamed from: j, reason: collision with root package name */
    public final int f449635j;

    public h0(java.lang.String urlKey, boolean z17, java.lang.String brandName, java.lang.String alias, int i17, int i18, java.lang.String shareImageWatermarkParams, java.lang.String brandUserName, java.lang.String title, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(urlKey, "urlKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(brandName, "brandName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(alias, "alias");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareImageWatermarkParams, "shareImageWatermarkParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(brandUserName, "brandUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        this.f449626a = urlKey;
        this.f449627b = z17;
        this.f449628c = brandName;
        this.f449629d = alias;
        this.f449630e = i17;
        this.f449631f = i18;
        this.f449632g = shareImageWatermarkParams;
        this.f449633h = brandUserName;
        this.f449634i = title;
        this.f449635j = i19;
    }

    /* renamed from: equals */
    public boolean m161195xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r01.h0)) {
            return false;
        }
        r01.h0 h0Var = (r01.h0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f449626a, h0Var.f449626a) && this.f449627b == h0Var.f449627b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f449628c, h0Var.f449628c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f449629d, h0Var.f449629d) && this.f449630e == h0Var.f449630e && this.f449631f == h0Var.f449631f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f449632g, h0Var.f449632g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f449633h, h0Var.f449633h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f449634i, h0Var.f449634i) && this.f449635j == h0Var.f449635j;
    }

    /* renamed from: hashCode */
    public int m161196x8cdac1b() {
        return (((((((((((((((((this.f449626a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f449627b)) * 31) + this.f449628c.hashCode()) * 31) + this.f449629d.hashCode()) * 31) + java.lang.Integer.hashCode(this.f449630e)) * 31) + java.lang.Integer.hashCode(this.f449631f)) * 31) + this.f449632g.hashCode()) * 31) + this.f449633h.hashCode()) * 31) + this.f449634i.hashCode()) * 31) + java.lang.Integer.hashCode(this.f449635j);
    }

    /* renamed from: toString */
    public java.lang.String m161197x9616526c() {
        return "BizMpInfo(urlKey=" + this.f449626a + ", enableWaterMark=" + this.f449627b + ", brandName=" + this.f449628c + ", alias=" + this.f449629d + ", brandServiceType=" + this.f449630e + ", imageWatermarkType=" + this.f449631f + ", shareImageWatermarkParams=" + this.f449632g + ", brandUserName=" + this.f449633h + ", title=" + this.f449634i + ", itemShowType=" + this.f449635j + ')';
    }
}
