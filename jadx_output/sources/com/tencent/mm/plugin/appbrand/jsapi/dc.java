package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class dc extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1088;
    private static final java.lang.String NAME = "recordOperateUserDataInWa";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String string;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiRecordOperateUserDataInWa", "invoke data " + jSONObject);
        if (jSONObject != null && (string = jSONObject.getString("datalist")) != null) {
            uk0.a.c(new com.tencent.mm.ipcinvoker.type.IPCString(string), com.tencent.mm.plugin.appbrand.jsapi.cc.f80197d, null, 4, null);
        }
        if (lVar != null) {
            lVar.a(i17, o("ok"));
        }
    }
}
