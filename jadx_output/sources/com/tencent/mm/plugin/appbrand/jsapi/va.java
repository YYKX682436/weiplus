package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class va extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 228;
    public static final java.lang.String NAME = "openWeRunSetting";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        new com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenWeRunSetting$OpenWeRunSetting(this, lVar, i17, jSONObject != null ? jSONObject.optBoolean("checkSupport", true) : true).d();
    }
}
