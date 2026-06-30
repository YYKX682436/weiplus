package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

/* loaded from: classes.dex */
public class h1 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 443;
    public static final java.lang.String NAME = "pauseDownloadTask";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        new com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiPauseDownloadTask$PauseDownloadTask(this, (com.tencent.mm.plugin.appbrand.service.c0) lVar, i17, jSONObject).d();
    }
}
