package a94;

/* loaded from: classes4.dex */
public abstract class m {
    public static void a(ab4.n0 n0Var, int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportGetShakeCardIdResult", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeAdReporter");
        if (n0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ShakeAdReporter", "reportGetShakeCardIdResult, landingPageData==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportGetShakeCardIdResult", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeAdReporter");
            return;
        }
        java.lang.String k17 = n0Var.k();
        java.lang.String o17 = n0Var.o();
        int l17 = n0Var.l();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (k17 == null) {
                k17 = "";
            }
            jSONObject.put("snsid", k17);
            if (o17 == null) {
                o17 = "";
            }
            jSONObject.put("uxinfo", o17);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, l17);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("result", i17);
            jSONObject2.put("encoreShake", z17 ? 1 : 0);
            jSONObject.put("extInfo", jSONObject2);
            java.lang.String jSONObject3 = jSONObject.toString();
            ca4.m0.a("timeline_shakead_canvas_get_cardId_result", jSONObject3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeAdReporter", "reportGetShakeCardIdResult, content=" + jSONObject3);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ShakeAdReporter", "reportGetShakeCardIdResult exp:" + e17.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportGetShakeCardIdResult", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeAdReporter");
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportShakeActionResult", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeAdReporter");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ShakeAdReporter", "reportShakeActionResult, landingPageData==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportShakeActionResult", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeAdReporter");
            return;
        }
        java.lang.String t07 = ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e);
        java.lang.String m70375x338a8cc7 = c17933xe8d1b226.m70375x338a8cc7();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (t07 == null) {
                t07 = "";
            }
            jSONObject.put("snsid", t07);
            if (m70375x338a8cc7 == null) {
                m70375x338a8cc7 = "";
            }
            jSONObject.put("uxinfo", m70375x338a8cc7);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, i18);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("result", i17);
            jSONObject.put("extInfo", jSONObject2);
            java.lang.String jSONObject3 = jSONObject.toString();
            ca4.m0.a("timeline_shakead_shake_result", jSONObject3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeAdReporter", "reportShakeActionResult, content=" + jSONObject3);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ShakeAdReporter", "reportShakeActionResult exp:" + e17.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportShakeActionResult", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeAdReporter");
    }
}
