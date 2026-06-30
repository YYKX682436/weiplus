package com.tencent.mm.plugin.appbrand.ipc;

/* loaded from: classes14.dex */
public class q implements nf.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask f78429a;

    public q(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask appBrandProxyTransparentUIProcessTask) {
        this.f78429a = appBrandProxyTransparentUIProcessTask;
    }

    @Override // nf.j
    public void onResult(int i17, android.content.Intent intent) {
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask appBrandProxyTransparentUIProcessTask = this.f78429a;
        appBrandProxyTransparentUIProcessTask.f78365e.mmOnActivityResult(appBrandProxyTransparentUIProcessTask.hashCode() & 65535, i17, intent);
    }
}
