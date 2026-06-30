package s84;

/* loaded from: classes4.dex */
public class b extends a84.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f486426a;

    /* renamed from: b, reason: collision with root package name */
    public final int f486427b;

    /* renamed from: c, reason: collision with root package name */
    public final s84.a f486428c;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17, s84.a aVar) {
        this.f486426a = c17933xe8d1b226;
        this.f486427b = i17 == 0 ? 1 : 2;
        this.f486428c = aVar;
    }

    @Override // a84.s0
    public void a(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f486426a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragReportData");
        try {
            jSONObject.putOpt("snsid", ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e));
            java.lang.String m70375x338a8cc7 = c17933xe8d1b226.m70375x338a8cc7();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            java.lang.String str = "";
            if (m70375x338a8cc7 == null) {
                m70375x338a8cc7 = "";
            }
            jSONObject.putOpt("uxinfo", m70375x338a8cc7);
            java.lang.String str2 = c17933xe8d1b226.m70354x74235b3e().f38172xd73c98cc;
            if (str2 != null) {
                str = str2;
            }
            jSONObject.putOpt("adExtInfo", str);
            jSONObject.putOpt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(this.f486427b));
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragReportData");
    }

    @Override // a84.s0
    public void b(org.json.JSONObject jSONObject) {
        s84.a aVar = this.f486428c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragReportData");
        try {
            jSONObject.put("dragDuration", aVar.f486422a);
            jSONObject.put("dragCount", aVar.f486423b);
            jSONObject.put("jumpCount", aVar.f486424c);
            jSONObject.put("firstPlaybackTime", aVar.f486425d);
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragReportData");
    }

    @Override // a84.r0
    /* renamed from: getChannel */
    public java.lang.String mo650x69d8b8cd() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getChannel", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragReportData");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getChannel", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragReportData");
        return "sns_ad_full_card_drag_image_report";
    }
}
