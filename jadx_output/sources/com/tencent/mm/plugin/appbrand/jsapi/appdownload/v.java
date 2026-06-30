package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

/* loaded from: classes.dex */
public class v extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 440;
    public static final java.lang.String NAME = "addDownloadTaskStraight";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        new com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTaskStraight$AddDownloadTaskStraightTask(this, e9Var, i17, jSONObject).d();
        com.tencent.mm.plugin.appbrand.jsapi.appdownload.j.B(e9Var);
    }
}
