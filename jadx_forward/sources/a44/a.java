package a44;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f82758a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f82759b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f82760c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Boolean f82761d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Integer f82762e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f82763f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f82764g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f82765h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f82766i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f82767j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f82768k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f82769l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f82770m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f82771n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f82772o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f82773p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f82774q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f82775r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f82776s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f82777t;

    public a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Boolean bool, java.lang.Integer num, java.lang.String str4) {
        this.f82758a = str;
        this.f82759b = str2;
        this.f82760c = str3;
        this.f82761d = bool;
        this.f82762e = num;
        this.f82763f = str4;
    }

    public static final a44.a q(java.util.Map map, java.lang.String str) {
        java.lang.Integer h17;
        java.lang.Integer h18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo$Companion");
        a44.a aVar = null;
        if (map == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo$Companion");
        } else if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo$Companion");
        } else {
            java.lang.String str2 = (java.lang.String) map.get(str.concat(".openSdkAppIdAndroid"));
            java.lang.String str3 = str2 == null ? "" : str2;
            java.lang.String str4 = (java.lang.String) map.get(str.concat(".packageName"));
            java.lang.String str5 = str4 == null ? "" : str4;
            java.lang.String str6 = (java.lang.String) map.get(str.concat(".channelId"));
            java.lang.String str7 = str6 == null ? "" : str6;
            java.lang.String str8 = (java.lang.String) map.get(str.concat(".useGameDownloadWidget"));
            int i17 = 1;
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf((str8 == null || (h18 = r26.h0.h(str8)) == null || h18.intValue() != 1) ? false : true);
            java.lang.String str9 = (java.lang.String) map.get(str.concat(".platform"));
            if (str9 != null && (h17 = r26.h0.h(str9)) != null) {
                i17 = h17.intValue();
            }
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i17);
            java.lang.String str10 = (java.lang.String) map.get(str.concat(".warningAndroid"));
            if (str10 == null) {
                str10 = "";
            }
            aVar = new a44.a(str3, str5, str7, valueOf, valueOf2, str10);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo$Companion");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        return aVar;
    }

    public final java.lang.String a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAgreementUrl", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        java.lang.String str = this.f82768k;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAgreementUrl", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        return str;
    }

    public final java.lang.String b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAppDescUrl", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        java.lang.String str = this.f82766i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAppDescUrl", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        return str;
    }

    public final java.lang.String c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAppIcon", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        java.lang.String str = this.f82774q;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAppIcon", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        return str;
    }

    public final java.lang.String d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAppName", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        java.lang.String str = this.f82773p;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAppName", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        return str;
    }

    public final java.lang.String e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAppVersion", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        java.lang.String str = this.f82764g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAppVersion", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        return str;
    }

    public final java.lang.String f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAuthorName", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        java.lang.String str = this.f82771n;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAuthorName", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        return str;
    }

    public final java.lang.String g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAuthorityUrl", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        java.lang.String str = this.f82767j;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAuthorityUrl", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        return str;
    }

    public final java.lang.String h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDeveloper", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        java.lang.String str = this.f82765h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDeveloper", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        return str;
    }

    public final java.lang.String i() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDownloadUrl", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        java.lang.String str = this.f82776s;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDownloadUrl", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        return str;
    }

    public final java.lang.String j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMd5", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        java.lang.String str = this.f82775r;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMd5", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        return str;
    }

    public final java.lang.String k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getOpenSdkAppIdAndroid", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOpenSdkAppIdAndroid", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        return this.f82758a;
    }

    public final java.lang.String l() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPackageName", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPackageName", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        return this.f82759b;
    }

    public final java.lang.String m() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRecordNumber", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        java.lang.String str = this.f82769l;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRecordNumber", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        return str;
    }

    public final java.lang.String n() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRedirectUrl", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        java.lang.String str = this.f82777t;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRedirectUrl", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        return str;
    }

    public final java.lang.String o() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSuitableAge", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        java.lang.String str = this.f82770m;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSuitableAge", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        return str;
    }

    public final java.lang.Boolean p() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUseGameDownloadWidget", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        java.lang.Boolean bool = this.f82761d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUseGameDownloadWidget", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        return bool;
    }
}
