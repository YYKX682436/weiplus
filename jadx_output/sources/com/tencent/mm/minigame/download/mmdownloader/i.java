package com.tencent.mm.minigame.download.mmdownloader;

/* loaded from: classes.dex */
public class i extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1521;
    public static final java.lang.String NAME = "cancelDownloadTaskForWVA";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WVA.cancelDownloadTaskForWVA", "invoke");
        new com.tencent.mm.minigame.download.mmdownloader.JsApiCancelDownloadTaskForWVA$CancelWVATask(this, (com.tencent.mm.plugin.appbrand.service.c0) lVar, i17, jSONObject).d();
    }
}
