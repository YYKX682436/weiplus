package com.tencent.mm.plugin.appbrand.ipc;

/* loaded from: classes14.dex */
public class o implements com.tencent.mm.plugin.appbrand.ipc.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask f78422a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f78423b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUI f78424c;

    public o(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUI appBrandProxyTransparentUI, com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask appBrandProxyTransparentUIProcessTask, java.lang.String str) {
        this.f78424c = appBrandProxyTransparentUI;
        this.f78422a = appBrandProxyTransparentUIProcessTask;
        this.f78423b = str;
    }

    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProxyTransparentUI", "onResult");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("task_object", this.f78422a);
        intent.putExtra("task_id", this.f78423b);
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUI appBrandProxyTransparentUI = this.f78424c;
        appBrandProxyTransparentUI.setResult(-1, intent);
        appBrandProxyTransparentUI.finish();
    }
}
