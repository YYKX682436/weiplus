package com.tencent.mm.minigame.download.mmdownloader;

/* loaded from: classes.dex */
public class k extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1525;
    public static final java.lang.String NAME = "queryDownloadTaskForWVA";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        new com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiQueryDownloadTaskForNative$QueryDownloadTask(this, e9Var, i17, jSONObject).d();
        com.tencent.mm.minigame.download.mmdownloader.m.B(e9Var);
    }
}
