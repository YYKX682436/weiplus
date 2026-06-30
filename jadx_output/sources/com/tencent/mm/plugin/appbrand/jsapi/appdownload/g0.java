package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

/* loaded from: classes7.dex */
public class g0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 439;
    public static final java.lang.String NAME = "getInstallState";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        new com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiGetInstallState$GetInstallStateTask(this, lVar, i17, jSONObject).d();
    }
}
