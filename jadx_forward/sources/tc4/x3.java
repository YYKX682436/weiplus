package tc4;

/* loaded from: classes4.dex */
public final class x3 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f499064a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f499065b;

    public x3(java.lang.String url, java.lang.String uniqueKey, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        url = (i17 & 1) != 0 ? "" : url;
        uniqueKey = (i17 & 2) != 0 ? "" : uniqueKey;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uniqueKey, "uniqueKey");
        this.f499064a = url;
        this.f499065b = uniqueKey;
    }

    public final java.lang.String a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUniqueKey", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
        java.lang.String str = this.f499065b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUniqueKey", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
        return str;
    }

    public final java.lang.String b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUrl", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
        java.lang.String str = this.f499064a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUrl", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
        return str;
    }

    public final void c(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setUniqueKey", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.f499065b = str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setUniqueKey", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
    }

    public final void d(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setUrl", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.f499064a = str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setUrl", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
    }

    /* renamed from: equals */
    public boolean m166251xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
            return true;
        }
        if (!(obj instanceof tc4.x3)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
            return false;
        }
        tc4.x3 x3Var = (tc4.x3) obj;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f499064a, x3Var.f499064a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
            return false;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f499065b, x3Var.f499065b);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
        return b17;
    }

    /* renamed from: hashCode */
    public int m166252x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
        int hashCode = (this.f499064a.hashCode() * 31) + this.f499065b.hashCode();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
        return hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m166253x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
        java.lang.String str = "UrlAndToken(url=" + this.f499064a + ", uniqueKey=" + this.f499065b + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
        return str;
    }
}
