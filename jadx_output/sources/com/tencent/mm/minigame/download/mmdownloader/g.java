package com.tencent.mm.minigame.download.mmdownloader;

/* loaded from: classes7.dex */
public final class g extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1520;
    public static final java.lang.String NAME = "addDownloadTaskForWVA";

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.minigame.download.mmdownloader.e f69052g = new com.tencent.mm.minigame.download.mmdownloader.e(null);

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f69053h = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.mm.minigame.download.mmdownloader.d f69054i = new com.tencent.mm.minigame.download.mmdownloader.d();

    /* renamed from: m, reason: collision with root package name */
    public static volatile boolean f69055m;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject data, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 service = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        kotlin.jvm.internal.o.g(service, "service");
        kotlin.jvm.internal.o.g(data, "data");
        try {
            com.tencent.mm.minigame.download.mmdownloader.JsApiAddDownloadTaskForWVA$AddDownloadTask jsApiAddDownloadTaskForWVA$AddDownloadTask = new com.tencent.mm.minigame.download.mmdownloader.JsApiAddDownloadTaskForWVA$AddDownloadTask(false, this, service, i17, data);
            com.tencent.mm.minigame.download.mmdownloader.m.B(service);
            jsApiAddDownloadTaskForWVA$AddDownloadTask.d();
        } catch (java.io.IOException unused) {
            java.lang.String str = android.text.TextUtils.isEmpty("fail: destPath resolve failed") ? "fail:jsapi invalid request data" : "fail: destPath resolve failed";
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            service.a(i17, u(str, jSONObject));
        }
    }
}
