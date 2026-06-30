package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class cd extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 249;
    public static final java.lang.String NAME = "setEnableDebug";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.luggage.sdk.jsapi.component.service.y yVar = (com.tencent.luggage.sdk.jsapi.component.service.y) lVar;
        boolean optBoolean = jSONObject.optBoolean("enableDebug", false);
        if (yVar.t3().E0().f47296w == optBoolean) {
            yVar.a(i17, o("ok"));
        } else {
            com.tencent.mm.plugin.appbrand.menu.devtools.n.d(yVar, yVar.getAppId(), optBoolean);
            yVar.a(i17, o("ok"));
        }
    }
}
