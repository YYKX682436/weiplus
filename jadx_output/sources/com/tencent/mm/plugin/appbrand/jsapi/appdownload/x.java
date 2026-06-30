package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

/* loaded from: classes.dex */
public class x extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 475;
    public static final java.lang.String NAME = "cancelDownloadTask";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("downloadIdArray");
        if (optJSONArray != null && optJSONArray.length() != 0) {
            new com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiCancelDownloadTask$CancelDownloadTask(optJSONArray, this, e9Var, i17).d();
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCancelDownloadTask", "doCancelDownloadTask fail, invalid downloadIdArray");
            e9Var.a(i17, o("fail"));
        }
    }
}
