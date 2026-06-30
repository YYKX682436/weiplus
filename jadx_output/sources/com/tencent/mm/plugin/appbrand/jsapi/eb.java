package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class eb extends com.tencent.mm.plugin.appbrand.jsapi.f {

    @java.lang.Deprecated
    public static final int CTRL_INDEX = 678;

    @java.lang.Deprecated
    public static final java.lang.String NAME = "predownloadMiniProgramPackage";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (jSONObject == null || lVar == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiPredownloadMiniProgramPackage", "invoke with appId:" + lVar.getAppId() + ", data:" + jSONObject + ", callbackId:" + i17);
        java.lang.String optString = jSONObject.optString(dm.i4.COL_USERNAME);
        java.lang.String optString2 = jSONObject.optString("appId");
        boolean z17 = true;
        if (optString == null || optString.length() == 0) {
            if (optString2 != null && optString2.length() != 0) {
                z17 = false;
            }
            if (z17) {
                lVar.a(i17, o("fail:invalid data"));
                return;
            }
        }
        java.lang.String optString3 = jSONObject.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
        java.lang.String optString4 = jSONObject.optString("moduleName");
        int optInt = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        com.tencent.mm.plugin.appbrand.service.q6 q6Var = new com.tencent.mm.plugin.appbrand.service.q6();
        q6Var.f88751a = optString;
        q6Var.f88752b = optString2;
        q6Var.f88754d = optString3;
        q6Var.f88755e = optString4;
        q6Var.f88753c = optInt;
        q6Var.f88756f = new com.tencent.mm.plugin.appbrand.jsapi.cb(optString2, optString4, optInt, lVar, i17, this);
        d75.b.g(new com.tencent.mm.plugin.appbrand.jsapi.db(lVar, q6Var));
        ((com.tencent.mm.plugin.appbrand.service.s6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.s6.class)).a4(q6Var);
    }
}
