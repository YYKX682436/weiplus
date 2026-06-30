package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

/* loaded from: classes.dex */
public class l1 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 441;
    public static final java.lang.String NAME = "queryDownloadTask";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        new com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiQueryDownloadTask$QueryDownloadTask(this, e9Var, i17, jSONObject).d();
        com.tencent.mm.plugin.appbrand.jsapi.appdownload.j.B(e9Var);
    }
}
