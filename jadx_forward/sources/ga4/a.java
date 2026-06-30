package ga4;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f351434a;

    /* renamed from: b, reason: collision with root package name */
    public final int f351435b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f351436c;

    public a(int i17, int i18, java.lang.String keyword) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyword, "keyword");
        this.f351434a = i17;
        this.f351435b = i18;
        this.f351436c = keyword;
    }

    /* renamed from: equals */
    public boolean m131149xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
            return true;
        }
        if (!(obj instanceof ga4.a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
            return false;
        }
        ga4.a aVar = (ga4.a) obj;
        if (this.f351434a != aVar.f351434a) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
            return false;
        }
        if (this.f351435b != aVar.f351435b) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
            return false;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f351436c, aVar.f351436c);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
        return b17;
    }

    /* renamed from: hashCode */
    public int m131150x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
        int hashCode = (((java.lang.Integer.hashCode(this.f351434a) * 31) + java.lang.Integer.hashCode(this.f351435b)) * 31) + this.f351436c.hashCode();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
        return hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m131151x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
        java.lang.String str = "ContentMatchResult(startPos=" + this.f351434a + ", endPos=" + this.f351435b + ", keyword=" + this.f351436c + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
        return str;
    }
}
