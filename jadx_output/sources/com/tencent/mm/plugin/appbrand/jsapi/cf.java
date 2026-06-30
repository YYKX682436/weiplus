package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public class cf extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 445;
    public static final java.lang.String NAME = "writeCommData";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        new com.tencent.mm.plugin.appbrand.jsapi.JsApiWriteCommData$WriteCommDataTask(this, lVar, i17, jSONObject).d();
    }
}
