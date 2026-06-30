package o94;

/* loaded from: classes4.dex */
public abstract class c {
    public static void a(int i17, java.lang.String str, android.widget.ImageView imageView) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("loadImage", "com.tencent.mm.plugin.sns.adutils.HalfScreenSubscribeUtils");
        if (android.text.TextUtils.isEmpty(str) || imageView == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadImage", "com.tencent.mm.plugin.sns.adutils.HalfScreenSubscribeUtils");
            return;
        }
        imageView.hashCode();
        za4.t0.a(str, false, 41, 0, new o94.b(imageView, i17, str));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadImage", "com.tencent.mm.plugin.sns.adutils.HalfScreenSubscribeUtils");
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x2 x2Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("subscribeReport", "com.tencent.mm.plugin.sns.adutils.HalfScreenSubscribeUtils");
        if (c17933xe8d1b226 == null || x2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HalfScreenSubscribeUtils", "reportSubscribe snsInfo==null or reportInfo==null, scene = " + i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("subscribeReport", "com.tencent.mm.plugin.sns.adutils.HalfScreenSubscribeUtils");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTempId", "com.tencent.mm.plugin.sns.storage.SubscribeReportInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTempId", "com.tencent.mm.plugin.sns.storage.SubscribeReportInfo");
            jSONObject2.put("tempId", x2Var.f247700a);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWeausername", "com.tencent.mm.plugin.sns.storage.SubscribeReportInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWeausername", "com.tencent.mm.plugin.sns.storage.SubscribeReportInfo");
            jSONObject2.put("weausername", x2Var.f247701b);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getClickSubmitBtn", "com.tencent.mm.plugin.sns.storage.SubscribeReportInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getClickSubmitBtn", "com.tencent.mm.plugin.sns.storage.SubscribeReportInfo");
            jSONObject2.put("clickSubmitBtn", x2Var.f247702c);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSubscribeResult", "com.tencent.mm.plugin.sns.storage.SubscribeReportInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSubscribeResult", "com.tencent.mm.plugin.sns.storage.SubscribeReportInfo");
            jSONObject2.put("subscribeResult", x2Var.f247703d);
            int i18 = i17 == 0 ? 1 : 2;
            java.lang.String m70375x338a8cc7 = c17933xe8d1b226.m70375x338a8cc7();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (m70375x338a8cc7 == null) {
                m70375x338a8cc7 = "";
            }
            jSONObject.put("extInfo", jSONObject2);
            jSONObject.put("uxinfo", m70375x338a8cc7);
            jSONObject.put("snsid", c17933xe8d1b226.f68891x29d1292e);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, i18);
            java.lang.String jSONObject3 = jSONObject.toString();
            ca4.m0.a("timeline_subscription_message", jSONObject3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HalfScreenSubscribeUtils", "reportSubscribe timeline_subscription_message, content=" + jSONObject3);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HalfScreenSubscribeUtils", "reportSubscribe exp:" + e17.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("subscribeReport", "com.tencent.mm.plugin.sns.adutils.HalfScreenSubscribeUtils");
    }
}
