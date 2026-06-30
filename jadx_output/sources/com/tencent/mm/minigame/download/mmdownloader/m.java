package com.tencent.mm.minigame.download.mmdownloader;

/* loaded from: classes7.dex */
public class m extends com.tencent.mm.plugin.appbrand.jsapi.appdownload.i {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "onWVAPkgDownloadStateChange";

    public static void B(com.tencent.mm.plugin.appbrand.e9 e9Var) {
        if (com.tencent.mm.plugin.appbrand.jsapi.appdownload.i.f78958m.containsKey(e9Var.getAppId())) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WVADownloadAppStateChangeEvent", "listen -> " + e9Var.getAppId());
        com.tencent.mm.minigame.download.mmdownloader.m mVar = new com.tencent.mm.minigame.download.mmdownloader.m();
        mVar.y(e9Var);
        com.tencent.mm.plugin.appbrand.jsapi.appdownload.i.x(e9Var, mVar);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.appdownload.i
    public void y(final com.tencent.mm.plugin.appbrand.e9 e9Var) {
        this.f78960i = new com.tencent.mm.plugin.appbrand.ipc.l0() { // from class: com.tencent.mm.minigame.download.mmdownloader.m$$a
            @Override // com.tencent.mm.plugin.appbrand.ipc.l0
            public final void a(java.lang.Object obj) {
                com.tencent.mm.minigame.download.mmdownloader.m mVar = com.tencent.mm.minigame.download.mmdownloader.m.this;
                com.tencent.mm.plugin.appbrand.e9 e9Var2 = e9Var;
                mVar.getClass();
                if (e9Var2 != null && (obj instanceof com.tencent.mm.minigame.download.mmdownloader.WVADownloadState)) {
                    com.tencent.mm.minigame.download.mmdownloader.WVADownloadState wVADownloadState = (com.tencent.mm.minigame.download.mmdownloader.WVADownloadState) obj;
                    com.tencent.mars.xlog.Log.i("MicroMsg.WVADownloadAppStateChangeEvent", "onCustomDataNotify, state: %s, appId: %s, downloadId: %d, moduleName: %s, pkgPath: %s", wVADownloadState.f78779d, wVADownloadState.f78781f, java.lang.Long.valueOf(wVADownloadState.f78780e), wVADownloadState.f69034m, wVADownloadState.f69035n);
                    if (!"download_succ".equals(wVADownloadState.f78779d)) {
                        org.json.JSONObject a17 = wVADownloadState.a();
                        mVar.u(e9Var2);
                        mVar.f82374f = a17.toString();
                        mVar.m();
                        return;
                    }
                    java.lang.String str = wVADownloadState.f69034m;
                    java.lang.String str2 = wVADownloadState.f69035n;
                    if (str == null || str.isEmpty()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WVADownloadAppStateChangeEvent", "handleDownloadSuccess: special handling for old version");
                        org.json.JSONObject a18 = wVADownloadState.a();
                        mVar.u(e9Var2);
                        mVar.f82374f = a18.toString();
                        mVar.m();
                        return;
                    }
                    if (str2 == null || str2.isEmpty()) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.WVADownloadAppStateChangeEvent", "handleDownloadSuccess: pkgPath is empty for downloadId=" + wVADownloadState.f78780e);
                        wVADownloadState.f78779d = "download_failed";
                        wVADownloadState.f69040s = "pkgPath is empty";
                        org.json.JSONObject a19 = wVADownloadState.a();
                        mVar.u(e9Var2);
                        mVar.f82374f = a19.toString();
                        mVar.m();
                        return;
                    }
                    com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = e9Var2.t3();
                    kotlin.jvm.internal.o.g(t37, "<this>");
                    com.tencent.mm.plugin.appbrand.appcache.a4 o17 = com.tencent.mm.plugin.appbrand.appcache.la.o(t37, false);
                    com.tencent.mm.plugin.appbrand.appcache.la laVar = o17 instanceof com.tencent.mm.plugin.appbrand.appcache.la ? (com.tencent.mm.plugin.appbrand.appcache.la) o17 : null;
                    com.tencent.mm.plugin.appbrand.appcache.y3 y3Var = laVar != null ? laVar.f75655a : null;
                    com.tencent.mm.plugin.appbrand.appcache.ac acVar = y3Var instanceof com.tencent.mm.plugin.appbrand.appcache.ac ? (com.tencent.mm.plugin.appbrand.appcache.ac) y3Var : null;
                    if (acVar == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.WVADownloadAppStateChangeEvent", "handleDownloadSuccess: mergeDirReader is null for appId=" + wVADownloadState.f78781f);
                        wVADownloadState.f78779d = "download_failed";
                        wVADownloadState.f69040s = "mergeDirReader is null";
                        org.json.JSONObject a27 = wVADownloadState.a();
                        mVar.u(e9Var2);
                        mVar.f82374f = a27.toString();
                        mVar.m();
                        return;
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo modulePkgInfo = new com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo();
                    modulePkgInfo.name = str;
                    modulePkgInfo.pkgPath = str2;
                    arrayList.add(modulePkgInfo);
                    acVar.o(arrayList);
                    com.tencent.mars.xlog.Log.i("MicroMsg.WVADownloadAppStateChangeEvent", "handleDownloadSuccess: merged module " + str + ", pkgPath=" + str2);
                    org.json.JSONObject a28 = wVADownloadState.a();
                    mVar.u(e9Var2);
                    mVar.f82374f = a28.toString();
                    mVar.m();
                }
            }
        };
        com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.B(e9Var.getAppId(), this.f78960i);
        e9Var.t3().N.a(new u81.f() { // from class: com.tencent.mm.minigame.download.mmdownloader.m$$b
            @Override // u81.f
            public final void D(java.lang.String str, u81.b bVar) {
                com.tencent.mm.minigame.download.mmdownloader.m mVar = com.tencent.mm.minigame.download.mmdownloader.m.this;
                mVar.getClass();
                if (bVar == u81.b.DESTROYED) {
                    com.tencent.mm.plugin.appbrand.e9 e9Var2 = e9Var;
                    com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.F(e9Var2.getAppId(), mVar.f78960i);
                    com.tencent.mm.plugin.appbrand.jsapi.appdownload.i.A(e9Var2);
                }
            }
        });
    }
}
