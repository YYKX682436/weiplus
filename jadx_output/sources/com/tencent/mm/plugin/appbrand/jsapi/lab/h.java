package com.tencent.mm.plugin.appbrand.jsapi.lab;

/* loaded from: classes7.dex */
public class h extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 558;
    public static final java.lang.String NAME = "setLabInfo";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetLabInfo", "fail:data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        java.lang.String optString = jSONObject.optString("labId");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString) || !jSONObject.has("enabled")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetLabInfo", "fail:labId is null or no enabled");
            lVar.a(i17, o("fail:invalid data"));
        } else {
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.appbrand.jsapi.lab.JsApiSetLabInfo$IPCSetLabInfoRequest(optString, jSONObject.optBoolean("enabled")), com.tencent.mm.plugin.appbrand.jsapi.lab.f.class, new com.tencent.mm.plugin.appbrand.jsapi.lab.e(this, lVar, i17));
        }
    }
}
