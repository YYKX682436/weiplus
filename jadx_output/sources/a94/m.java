package a94;

/* loaded from: classes4.dex */
public abstract class m {
    public static void a(ab4.n0 n0Var, int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportGetShakeCardIdResult", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeAdReporter");
        if (n0Var == null) {
            com.tencent.mars.xlog.Log.e("ShakeAdReporter", "reportGetShakeCardIdResult, landingPageData==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportGetShakeCardIdResult", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeAdReporter");
            return;
        }
        java.lang.String k17 = n0Var.k();
        java.lang.String o17 = n0Var.o();
        int l17 = n0Var.l();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (k17 == null) {
                k17 = "";
            }
            jSONObject.put("snsid", k17);
            if (o17 == null) {
                o17 = "";
            }
            jSONObject.put("uxinfo", o17);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, l17);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("result", i17);
            jSONObject2.put("encoreShake", z17 ? 1 : 0);
            jSONObject.put("extInfo", jSONObject2);
            java.lang.String jSONObject3 = jSONObject.toString();
            ca4.m0.a("timeline_shakead_canvas_get_cardId_result", jSONObject3);
            com.tencent.mars.xlog.Log.i("ShakeAdReporter", "reportGetShakeCardIdResult, content=" + jSONObject3);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("ShakeAdReporter", "reportGetShakeCardIdResult exp:" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportGetShakeCardIdResult", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeAdReporter");
    }

    public static void b(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportShakeActionResult", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeAdReporter");
        if (snsInfo == null) {
            com.tencent.mars.xlog.Log.e("ShakeAdReporter", "reportShakeActionResult, landingPageData==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportShakeActionResult", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeAdReporter");
            return;
        }
        java.lang.String t07 = ca4.z0.t0(snsInfo.field_snsId);
        java.lang.String uxinfo = snsInfo.getUxinfo();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (t07 == null) {
                t07 = "";
            }
            jSONObject.put("snsid", t07);
            if (uxinfo == null) {
                uxinfo = "";
            }
            jSONObject.put("uxinfo", uxinfo);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i18);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("result", i17);
            jSONObject.put("extInfo", jSONObject2);
            java.lang.String jSONObject3 = jSONObject.toString();
            ca4.m0.a("timeline_shakead_shake_result", jSONObject3);
            com.tencent.mars.xlog.Log.i("ShakeAdReporter", "reportShakeActionResult, content=" + jSONObject3);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("ShakeAdReporter", "reportShakeActionResult exp:" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportShakeActionResult", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeAdReporter");
    }
}
