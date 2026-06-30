package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public class w2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.JsApiAddNativeDownloadTask$AddNativeDownloadTaskTask f83698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f83699e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f83700f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.y2 f83701g;

    public w2(com.tencent.mm.plugin.appbrand.jsapi.y2 y2Var, com.tencent.mm.plugin.appbrand.jsapi.JsApiAddNativeDownloadTask$AddNativeDownloadTaskTask jsApiAddNativeDownloadTask$AddNativeDownloadTaskTask, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17) {
        this.f83701g = y2Var;
        this.f83698d = jsApiAddNativeDownloadTask$AddNativeDownloadTaskTask;
        this.f83699e = e9Var;
        this.f83700f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.JsApiAddNativeDownloadTask$AddNativeDownloadTaskTask jsApiAddNativeDownloadTask$AddNativeDownloadTaskTask = this.f83698d;
        jsApiAddNativeDownloadTask$AddNativeDownloadTaskTask.x();
        java.util.HashMap hashMap = new java.util.HashMap();
        int i17 = jsApiAddNativeDownloadTask$AddNativeDownloadTaskTask.f78491f;
        com.tencent.mm.plugin.appbrand.jsapi.y2 y2Var = this.f83701g;
        int i18 = this.f83700f;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f83699e;
        if (i17 == 0) {
            e9Var.a(i18, y2Var.o("fail:cancel"));
            return;
        }
        if (i17 == 1) {
            e9Var.a(i18, y2Var.o("fail:download fail"));
        } else {
            if (i17 != 2) {
                return;
            }
            hashMap.put("download_id", java.lang.Long.valueOf(jsApiAddNativeDownloadTask$AddNativeDownloadTaskTask.f78492g));
            e9Var.a(i18, y2Var.p("ok", hashMap));
        }
    }
}
