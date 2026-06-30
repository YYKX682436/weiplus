package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

/* loaded from: classes.dex */
public class o1 implements vz.z1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiResumeDownloadTaskForNative$ResumeDownloadTask f78968a;

    public o1(com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiResumeDownloadTaskForNative$ResumeDownloadTask jsApiResumeDownloadTaskForNative$ResumeDownloadTask) {
        this.f78968a = jsApiResumeDownloadTaskForNative$ResumeDownloadTask;
    }

    @Override // vz.z1
    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiResumeDownloadTaskForNative$ResumeDownloadTask jsApiResumeDownloadTaskForNative$ResumeDownloadTask = this.f78968a;
        if (K0) {
            jsApiResumeDownloadTaskForNative$ResumeDownloadTask.f78928o = false;
        } else {
            jsApiResumeDownloadTaskForNative$ResumeDownloadTask.f78928o = true;
        }
    }
}
