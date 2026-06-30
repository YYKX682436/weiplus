package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

/* loaded from: classes.dex */
public class r implements vz.z1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTaskForNative$AddDownloadTask f78969a;

    public r(com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTaskForNative$AddDownloadTask jsApiAddDownloadTaskForNative$AddDownloadTask) {
        this.f78969a = jsApiAddDownloadTaskForNative$AddDownloadTask;
    }

    @Override // vz.z1
    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTaskForNative$AddDownloadTask jsApiAddDownloadTaskForNative$AddDownloadTask = this.f78969a;
        if (jSONObject == null) {
            jsApiAddDownloadTaskForNative$AddDownloadTask.f78819z = true;
            return;
        }
        jsApiAddDownloadTaskForNative$AddDownloadTask.B = jSONObject.optInt("download_id", -1);
        if (jsApiAddDownloadTaskForNative$AddDownloadTask.B <= 0) {
            jsApiAddDownloadTaskForNative$AddDownloadTask.f78819z = true;
        } else {
            jsApiAddDownloadTaskForNative$AddDownloadTask.f78819z = false;
        }
    }
}
