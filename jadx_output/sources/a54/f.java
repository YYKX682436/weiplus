package a54;

/* loaded from: classes4.dex */
public class f extends a84.s0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f1596a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f1597b;

    /* renamed from: c, reason: collision with root package name */
    public int f1598c;

    /* renamed from: d, reason: collision with root package name */
    public int f1599d;

    /* renamed from: e, reason: collision with root package name */
    public int f1600e;

    @Override // a84.s0
    public void a(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageShareReportData");
        try {
            java.lang.String str = this.f1596a;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            jSONObject.put("snsid", str);
            java.lang.String str2 = this.f1597b;
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("uxinfo", str2);
            jSONObject.put("adExtInfo", "");
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        } catch (java.lang.Exception unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageShareReportData");
    }

    @Override // a84.s0
    public void b(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageShareReportData");
        try {
            jSONObject.put("reportType", this.f1598c);
            jSONObject.put("shareScene", this.f1599d);
            jSONObject.put("canvasType", this.f1600e);
        } catch (java.lang.Exception unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageShareReportData");
    }

    @Override // a84.r0
    public java.lang.String getChannel() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageShareReportData");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageShareReportData");
        return "sns_ad_canvas_share_report";
    }
}
