package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class sd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f251984d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f251985e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f251986f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f251987g;

    public sd(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17, int i18, int i19) {
        this.f251984d = c17933xe8d1b226;
        this.f251985e = i17;
        this.f251986f = i18;
        this.f251987g = i19;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.StringBuilder sb6;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$4");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f251984d;
        int i17 = this.f251985e;
        int i18 = this.f251986f;
        int i19 = this.f251987g;
        java.lang.String str5 = "";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doReportVideoPlay", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        try {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            str = "run";
            try {
                sb6 = new java.lang.StringBuilder();
                str2 = "doReportVideoPlay";
                str3 = "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl";
            } catch (java.lang.Exception e17) {
                e = e17;
                str2 = "doReportVideoPlay";
                str3 = "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdPressGestureCtrl", "reportVideoPlay, exp=" + e.toString());
                str4 = str2;
                ca4.q.c(str4, e);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str4, str3);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$4");
            }
            try {
                sb6.append(c17933xe8d1b226.f68891x29d1292e);
                sb6.append("");
                jSONObject.put("snsid", sb6.toString());
                java.lang.String str6 = c17933xe8d1b226.m70346x10413e67().f38104xce64ddf1;
                if (str6 != null) {
                    str5 = str6;
                }
                jSONObject.put("uxinfo", str5);
                jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, i19);
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("playCount", i17);
                jSONObject2.put("playTotalTime", i18);
                jSONObject.put("extInfo", jSONObject2);
                java.lang.String jSONObject3 = jSONObject.toString();
                ca4.m0.a("timeline_fullcard_longpress_exposure", jSONObject3);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdPressGestureCtrl", "reportVideoPlay, content=" + jSONObject3 + ", channel=timeline_fullcard_longpress_exposure, cost=" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                str4 = str2;
            } catch (java.lang.Exception e18) {
                e = e18;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdPressGestureCtrl", "reportVideoPlay, exp=" + e.toString());
                str4 = str2;
                ca4.q.c(str4, e);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str4, str3);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$4");
            }
        } catch (java.lang.Exception e19) {
            e = e19;
            str = "run";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str4, str3);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$4");
    }
}
