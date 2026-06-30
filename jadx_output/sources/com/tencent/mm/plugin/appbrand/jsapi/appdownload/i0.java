package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

/* loaded from: classes7.dex */
public class i0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 656;
    public static final java.lang.String NAME = "getInstallStateForNative";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        new com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiGetInstallStateForNative$GetInstallStateTask(this, (com.tencent.mm.plugin.appbrand.e9) lVar, i17, jSONObject).d();
    }
}
