package com.tencent.mm.plugin.appbrand.jsapi.lab;

/* loaded from: classes7.dex */
public class d extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 557;
    public static final java.lang.String NAME = "getLabInfo";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetLabInfo", "fail:data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        java.lang.String optString = jSONObject.optString("labId");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(optString), com.tencent.mm.plugin.appbrand.jsapi.lab.c.class, new com.tencent.mm.plugin.appbrand.jsapi.lab.a(this, lVar, i17));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetLabInfo", "fail:labId is null");
            lVar.a(i17, o("fail:invalid data"));
        }
    }
}
