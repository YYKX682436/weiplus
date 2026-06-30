package d44;

/* loaded from: classes4.dex */
public class a extends a84.s0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f307950a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f307951b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f307952c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f307953d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f307954e;

    /* renamed from: f, reason: collision with root package name */
    public int f307955f;

    /* renamed from: g, reason: collision with root package name */
    public int f307956g;

    @Override // a84.s0
    public void a(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.finder.AdFinderLivingNoticeChannel");
        try {
            jSONObject.putOpt("snsid", this.f307950a);
            jSONObject.putOpt("uxinfo", this.f307951b);
            jSONObject.putOpt("adExtInfo", this.f307952c);
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.finder.AdFinderLivingNoticeChannel");
    }

    @Override // a84.s0
    public void b(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.finder.AdFinderLivingNoticeChannel");
        try {
            jSONObject.putOpt("finderUsername", this.f307953d);
            jSONObject.putOpt("finderLiveNoticeId", this.f307954e);
            jSONObject.putOpt("result", java.lang.Integer.valueOf(this.f307955f));
            jSONObject.putOpt(ya.b.f77502x92235c1b, java.lang.Integer.valueOf(this.f307956g));
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.finder.AdFinderLivingNoticeChannel");
    }

    public void c(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setData", "com.tencent.mm.plugin.sns.ad.finder.AdFinderLivingNoticeChannel");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        this.f307950a = str;
        if (str2 == null) {
            str2 = "";
        }
        this.f307951b = str2;
        if (str3 == null) {
            str3 = "";
        }
        this.f307952c = str3;
        if (str4 == null) {
            str4 = "";
        }
        this.f307953d = str4;
        if (str5 == null) {
            str5 = "";
        }
        this.f307954e = str5;
        this.f307955f = i17;
        this.f307956g = i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setData", "com.tencent.mm.plugin.sns.ad.finder.AdFinderLivingNoticeChannel");
    }

    @Override // a84.r0
    /* renamed from: getChannel */
    public java.lang.String mo650x69d8b8cd() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getChannel", "com.tencent.mm.plugin.sns.ad.finder.AdFinderLivingNoticeChannel");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getChannel", "com.tencent.mm.plugin.sns.ad.finder.AdFinderLivingNoticeChannel");
        return "sns_ad_finder_live_notice_reserve";
    }
}
