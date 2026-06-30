package i44;

/* loaded from: classes4.dex */
public final class a extends a84.s0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f369917a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f369918b;

    /* renamed from: c, reason: collision with root package name */
    public int f369919c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f369920d;

    /* renamed from: e, reason: collision with root package name */
    public int f369921e;

    /* renamed from: f, reason: collision with root package name */
    public int f369922f;

    /* renamed from: g, reason: collision with root package name */
    public int f369923g;

    @Override // a84.s0
    public void a(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.halfscreen.report.AdDownloadHalfScreenChannel");
        if (jSONObject != null) {
            try {
                jSONObject.putOpt("snsid", this.f369917a);
            } catch (java.lang.Throwable unused) {
            }
        }
        if (jSONObject != null) {
            jSONObject.putOpt("uxinfo", this.f369918b);
        }
        if (jSONObject != null) {
            jSONObject.putOpt("adExtInfo", this.f369920d);
        }
        if (jSONObject != null) {
            jSONObject.putOpt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(this.f369919c));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.halfscreen.report.AdDownloadHalfScreenChannel");
    }

    @Override // a84.s0
    public void b(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.halfscreen.report.AdDownloadHalfScreenChannel");
        if (jSONObject != null) {
            jSONObject.putOpt("clickAction", java.lang.Integer.valueOf(this.f369921e));
        }
        if (jSONObject != null) {
            jSONObject.putOpt("downloadStatus", java.lang.Integer.valueOf(this.f369922f));
        }
        if (jSONObject != null) {
            jSONObject.putOpt("autoDownload", java.lang.Integer.valueOf(this.f369923g));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.halfscreen.report.AdDownloadHalfScreenChannel");
    }

    public final void c(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setData", "com.tencent.mm.plugin.sns.ad.halfscreen.report.AdDownloadHalfScreenChannel");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        this.f369917a = str;
        if (str2 == null) {
            str2 = "";
        }
        this.f369918b = str2;
        this.f369919c = i17;
        this.f369920d = str3;
        this.f369921e = i18;
        this.f369922f = i19;
        this.f369923g = i27;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setData", "com.tencent.mm.plugin.sns.ad.halfscreen.report.AdDownloadHalfScreenChannel");
    }

    @Override // a84.r0
    /* renamed from: getChannel */
    public java.lang.String mo650x69d8b8cd() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getChannel", "com.tencent.mm.plugin.sns.ad.halfscreen.report.AdDownloadHalfScreenChannel");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getChannel", "com.tencent.mm.plugin.sns.ad.halfscreen.report.AdDownloadHalfScreenChannel");
        return "sns_ad_half_screen_download_report";
    }
}
