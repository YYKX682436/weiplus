package n74;

/* loaded from: classes4.dex */
public abstract class s {
    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, java.lang.String str, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportFollowResult", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdFinderFollowReportHelper");
        try {
            b(ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e), c17933xe8d1b226.m70375x338a8cc7(), c17933xe8d1b226.m70354x74235b3e().f38172xd73c98cc, str, i17, i18);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderFollowReportHelper", "reportFollowResult, exp=" + e17.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportFollowResult", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdFinderFollowReportHelper");
    }

    public static void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportFollowResult", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdFinderFollowReportHelper");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("snsid", str);
            jSONObject.put("uxinfo", str2);
            jSONObject.put("adExtInfo", str3);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("finderUsername", str4);
            jSONObject2.put("result", i17);
            jSONObject2.put(ya.b.f77502x92235c1b, i18);
            jSONObject.put("extInfo", jSONObject2);
            ca4.m0.a("sns_ad_finder_follow_result", jSONObject.toString());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderFollowReportHelper", "reportFollowResult, exp=" + e17.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportFollowResult", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdFinderFollowReportHelper");
    }
}
