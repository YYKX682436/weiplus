package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public class vc extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 731;
    public static final java.lang.String NAME = "saveWaid";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            fe0.r4 r4Var = (fe0.r4) i95.n0.c(fe0.r4.class);
            jSONObject.toString();
            ((ee0.z4) r4Var).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseWaidFromJsApi", "com.tencent.mm.feature.sns.WaidHelperService");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseWaidFromJsApi", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseWaidFromJsApi", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseWaidFromJsApi", "com.tencent.mm.feature.sns.WaidHelperService");
            hashMap.put("result", java.lang.String.valueOf(0));
            lVar.a(i17, p("ok", hashMap));
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSaveWaid", "appBrand JsApiSaveWaid, data=" + jSONObject + ", waidNum=0");
        } catch (java.lang.Exception e17) {
            hashMap.put("result", "0");
            lVar.a(i17, p("fail", hashMap));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSaveWaid", "appBrand JsApiSaveWaid, exp=" + e17.toString());
        }
    }
}
