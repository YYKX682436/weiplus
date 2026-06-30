package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class qc extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 755;
    public static final java.lang.String NAME = "returnCopyUrl";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.luggage.sdk.jsapi.component.service.y yVar = (com.tencent.luggage.sdk.jsapi.component.service.y) lVar;
        if (yVar != null) {
            java.lang.String optString = jSONObject != null ? jSONObject.optString("url") : null;
            if (optString == null) {
                optString = "";
            }
            if (jSONObject != null && jSONObject.optBoolean("shortLinkEnable", false)) {
                com.tencent.mm.plugin.appbrand.jsapi.vf.f83519a.a(com.tencent.mm.plugin.appbrand.jsapi.d1.f80731d, optString);
            } else {
                com.tencent.mm.plugin.appbrand.jsapi.vf.f83519a.a(com.tencent.mm.plugin.appbrand.jsapi.d1.f80732e, optString);
            }
            com.tencent.mm.sdk.platformtools.b0.d(com.tencent.mm.sdk.platformtools.x2.f193071a, null, optString, null);
            yVar.a(i17, o(optString.length() == 0 ? "fail:empty url" : "ok"));
        }
    }
}
