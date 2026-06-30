package a54;

/* loaded from: classes4.dex */
public class f extends a84.s0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f83129a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f83130b;

    /* renamed from: c, reason: collision with root package name */
    public int f83131c;

    /* renamed from: d, reason: collision with root package name */
    public int f83132d;

    /* renamed from: e, reason: collision with root package name */
    public int f83133e;

    @Override // a84.s0
    public void a(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageShareReportData");
        try {
            java.lang.String str = this.f83129a;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            jSONObject.put("snsid", str);
            java.lang.String str2 = this.f83130b;
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("uxinfo", str2);
            jSONObject.put("adExtInfo", "");
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        } catch (java.lang.Exception unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageShareReportData");
    }

    @Override // a84.s0
    public void b(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageShareReportData");
        try {
            jSONObject.put("reportType", this.f83131c);
            jSONObject.put("shareScene", this.f83132d);
            jSONObject.put("canvasType", this.f83133e);
        } catch (java.lang.Exception unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageShareReportData");
    }

    @Override // a84.r0
    /* renamed from: getChannel */
    public java.lang.String mo650x69d8b8cd() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getChannel", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageShareReportData");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getChannel", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageShareReportData");
        return "sns_ad_canvas_share_report";
    }
}
