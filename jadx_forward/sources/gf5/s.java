package gf5;

/* loaded from: classes11.dex */
public final class s implements gf5.x {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f352976a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f352977b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f352978c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f352979d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f352980e;

    /* renamed from: f, reason: collision with root package name */
    public final gf5.z f352981f;

    /* renamed from: g, reason: collision with root package name */
    public final gf5.z f352982g;

    /* renamed from: h, reason: collision with root package name */
    public final gf5.z f352983h;

    /* renamed from: i, reason: collision with root package name */
    public final int f352984i;

    public s(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list, gf5.z zVar, gf5.z zVar2, gf5.z zVar3, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        java.util.List attributeValueDelimiters;
        java.lang.String tagOpen = (i18 & 1) != 0 ? "<" : str;
        java.lang.String tagClose = (i18 & 2) != 0 ? ">" : str2;
        java.lang.String closingTagPrefix = (i18 & 4) != 0 ? "/" : str3;
        java.lang.String selfClosingMarker = (i18 & 8) == 0 ? str4 : "/";
        if ((i18 & 16) != 0) {
            gf5.z zVar4 = gf5.z.f353014r;
            attributeValueDelimiters = kz5.c0.i(new gf5.a("\"", "\"", zVar4, false, false, false, 0, 96, null), new gf5.a("'", "'", zVar4, false, false, false, 0, 96, null));
        } else {
            attributeValueDelimiters = list;
        }
        gf5.z tagNameTokenType = (i18 & 32) != 0 ? gf5.z.f353011o : zVar;
        gf5.z attributeNameTokenType = (i18 & 64) != 0 ? gf5.z.f353012p : zVar2;
        gf5.z delimiterTokenType = (i18 & 128) != 0 ? gf5.z.f353009m : zVar3;
        int i19 = (i18 & 256) != 0 ? 0 : i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagOpen, "tagOpen");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagClose, "tagClose");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(closingTagPrefix, "closingTagPrefix");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selfClosingMarker, "selfClosingMarker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attributeValueDelimiters, "attributeValueDelimiters");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagNameTokenType, "tagNameTokenType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attributeNameTokenType, "attributeNameTokenType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delimiterTokenType, "delimiterTokenType");
        this.f352976a = tagOpen;
        this.f352977b = tagClose;
        this.f352978c = closingTagPrefix;
        this.f352979d = selfClosingMarker;
        this.f352980e = attributeValueDelimiters;
        this.f352981f = tagNameTokenType;
        this.f352982g = attributeNameTokenType;
        this.f352983h = delimiterTokenType;
        this.f352984i = i19;
    }

    /* renamed from: equals */
    public boolean m131490xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf5.s)) {
            return false;
        }
        gf5.s sVar = (gf5.s) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352976a, sVar.f352976a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352977b, sVar.f352977b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352978c, sVar.f352978c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352979d, sVar.f352979d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352980e, sVar.f352980e) && this.f352981f == sVar.f352981f && this.f352982g == sVar.f352982g && this.f352983h == sVar.f352983h && this.f352984i == sVar.f352984i;
    }

    /* renamed from: hashCode */
    public int m131491x8cdac1b() {
        return (((((((((((((((this.f352976a.hashCode() * 31) + this.f352977b.hashCode()) * 31) + this.f352978c.hashCode()) * 31) + this.f352979d.hashCode()) * 31) + this.f352980e.hashCode()) * 31) + this.f352981f.hashCode()) * 31) + this.f352982g.hashCode()) * 31) + this.f352983h.hashCode()) * 31) + java.lang.Integer.hashCode(this.f352984i);
    }

    /* renamed from: toString */
    public java.lang.String m131492x9616526c() {
        return "MarkupSyntaxRule(tagOpen=" + this.f352976a + ", tagClose=" + this.f352977b + ", closingTagPrefix=" + this.f352978c + ", selfClosingMarker=" + this.f352979d + ", attributeValueDelimiters=" + this.f352980e + ", tagNameTokenType=" + this.f352981f + ", attributeNameTokenType=" + this.f352982g + ", delimiterTokenType=" + this.f352983h + ", priority=" + this.f352984i + ')';
    }
}
