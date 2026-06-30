package com.tencent.mm.plugin.appbrand.ipc;

/* loaded from: classes7.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult f78417d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI f78418e;

    public l(com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI appBrandProcessProxyUI, com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        this.f78418e = appBrandProcessProxyUI;
        this.f78417d = appBrandProxyUIProcessTask$ProcessResult;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI appBrandProcessProxyUI = this.f78418e;
        com.tencent.mm.plugin.appbrand.ipc.v vVar = appBrandProcessProxyUI.f78349e;
        if (vVar == null || vVar.onInterceptFinishActivityAction()) {
            int g17 = com.tencent.mm.sdk.platformtools.c2.g(appBrandProcessProxyUI.getIntent(), "key_running_mode", 0);
            if (g17 == 2 || g17 == 3) {
                appBrandProcessProxyUI.finish();
            }
        } else {
            appBrandProcessProxyUI.finish();
        }
        appBrandProcessProxyUI.U6(this.f78417d);
    }
}
