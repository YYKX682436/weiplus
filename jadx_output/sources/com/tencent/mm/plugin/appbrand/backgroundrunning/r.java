package com.tencent.mm.plugin.appbrand.backgroundrunning;

/* loaded from: classes7.dex */
final class r implements com.tencent.mm.ipcinvoker.j {
    private r() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningMonitor$NotifyLocationBackgroundChanged appBrandBackgroundRunningMonitor$NotifyLocationBackgroundChanged = (com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningMonitor$NotifyLocationBackgroundChanged) obj;
        if (appBrandBackgroundRunningMonitor$NotifyLocationBackgroundChanged != null) {
            com.tencent.mm.plugin.appbrand.ipc.l0 l0Var = com.tencent.mm.plugin.appbrand.backgroundrunning.t.f76992a;
            com.tencent.mm.plugin.appbrand.ipc.m0.b(appBrandBackgroundRunningMonitor$NotifyLocationBackgroundChanged.f76930d, new com.tencent.mm.plugin.appbrand.jsapi.EventLocationBackgroundStateChanged(appBrandBackgroundRunningMonitor$NotifyLocationBackgroundChanged.f76931e));
        }
    }
}
