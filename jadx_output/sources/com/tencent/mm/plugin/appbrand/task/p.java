package com.tencent.mm.plugin.appbrand.task;

/* loaded from: classes7.dex */
public class p extends com.tencent.mm.plugin.appbrand.task.u0 {
    @Override // com.tencent.luggage.sdk.processes.r
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.plugin.appbrand.task.k[] o() {
        java.util.ArrayList d17 = kz5.c0.d(new com.tencent.mm.plugin.appbrand.task.k(com.tencent.mm.plugin.appbrand.ui.AppBrandUI.class, com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI.class, com.tencent.mm.plugin.appbrand.keepalive.AppBrandKeepAliveService.class, com.tencent.mm.plugin.appbrand.backgroundrunning.service.AppBrandForegroundNotificationService.class, com.tencent.mm.plugin.appbrand.loading.AppBrandProcessTriggerService0.class, com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI.class), new com.tencent.mm.plugin.appbrand.task.k(com.tencent.mm.plugin.appbrand.ui.AppBrandUI1.class, com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI1.class, com.tencent.mm.plugin.appbrand.keepalive.AppBrandKeepAliveService1.class, com.tencent.mm.plugin.appbrand.backgroundrunning.service.AppBrandForegroundNotificationService1.class, com.tencent.mm.plugin.appbrand.loading.AppBrandProcessTriggerService1.class, com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI1.class), new com.tencent.mm.plugin.appbrand.task.k(com.tencent.mm.plugin.appbrand.ui.AppBrandUI2.class, com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI2.class, com.tencent.mm.plugin.appbrand.keepalive.AppBrandKeepAliveService2.class, com.tencent.mm.plugin.appbrand.backgroundrunning.service.AppBrandForegroundNotificationService2.class, com.tencent.mm.plugin.appbrand.loading.AppBrandProcessTriggerService2.class, com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI2.class), new com.tencent.mm.plugin.appbrand.task.k(com.tencent.mm.plugin.appbrand.ui.AppBrandUI3.class, com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI3.class, com.tencent.mm.plugin.appbrand.keepalive.AppBrandKeepAliveService3.class, com.tencent.mm.plugin.appbrand.backgroundrunning.service.AppBrandForegroundNotificationService3.class, com.tencent.mm.plugin.appbrand.loading.AppBrandProcessTriggerService3.class, com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI3.class), new com.tencent.mm.plugin.appbrand.task.k(com.tencent.mm.plugin.appbrand.ui.AppBrandUI4.class, com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI4.class, com.tencent.mm.plugin.appbrand.keepalive.AppBrandKeepAliveService4.class, com.tencent.mm.plugin.appbrand.backgroundrunning.service.AppBrandForegroundNotificationService4.class, com.tencent.mm.plugin.appbrand.loading.AppBrandProcessTriggerService4.class, com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI4.class));
        if (com.tencent.mm.plugin.appbrand.ui.t7.a()) {
            d17.add(d17.size(), new com.tencent.mm.plugin.appbrand.task.n());
        }
        int i17 = 0;
        for (java.lang.Object obj : d17) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.plugin.appbrand.task.k kVar = (com.tencent.mm.plugin.appbrand.task.k) obj;
            if (!kVar.u(com.tencent.luggage.sdk.processes.LuggageServiceType.f47626e) || !kVar.u(com.tencent.luggage.sdk.processes.LuggageServiceType.f47627f)) {
                throw new java.lang.IllegalStateException(("Incorrect declaration(" + kVar + ") for AppBrandNormalProcessManager").toString());
            }
            i17 = i18;
        }
        return (com.tencent.mm.plugin.appbrand.task.k[]) d17.toArray(new com.tencent.mm.plugin.appbrand.task.k[0]);
    }
}
