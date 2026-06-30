package com.tencent.mm.plugin.appbrand.task;

/* loaded from: classes7.dex */
public class z0 extends com.tencent.mm.plugin.appbrand.task.u0 {

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String f89222n = com.tencent.mm.sdk.platformtools.x2.f193072b + ":appbrand0";

    @Override // com.tencent.mm.plugin.appbrand.task.u0
    public com.tencent.mm.plugin.appbrand.task.k G(com.tencent.luggage.sdk.processes.LuggageServiceType serviceType) {
        kotlin.jvm.internal.o.g(serviceType, "serviceType");
        int ordinal = serviceType.ordinal();
        if (ordinal == 0) {
            return super.G(serviceType);
        }
        if (ordinal != 1) {
            return null;
        }
        if (L(com.tencent.luggage.sdk.processes.LuggageServiceType.f47627f)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSingleProcessManager", "tryPreloadNextTaskProcess serviceType = [" + serviceType + "] reachedMaxLimit");
            return null;
        }
        java.util.List k17 = k();
        java.util.ArrayList<com.tencent.mm.plugin.appbrand.task.k> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : k17) {
            com.tencent.mm.plugin.appbrand.task.k kVar = (com.tencent.mm.plugin.appbrand.task.k) obj;
            if (kVar.u(com.tencent.luggage.sdk.processes.LuggageServiceType.f47627f) && !kotlin.jvm.internal.o.b(f89222n, kVar.i())) {
                arrayList.add(obj);
            }
        }
        for (com.tencent.mm.plugin.appbrand.task.k kVar2 : arrayList) {
            if ((kVar2.k() && kVar2.l()) || kVar2.k()) {
                return kVar2;
            }
        }
        return (com.tencent.mm.plugin.appbrand.task.k) kz5.n0.X(arrayList);
    }

    public final void Q(java.util.ArrayList arrayList) {
        kotlin.jvm.internal.o.g(arrayList, "<this>");
        com.tencent.mm.plugin.appbrand.task.m[] mVarArr = {new com.tencent.mm.plugin.appbrand.task.m(com.tencent.mm.plugin.appbrand.ui.AppBrandUI1.class, com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI1.class, com.tencent.mm.plugin.appbrand.keepalive.AppBrandKeepAliveService1.class, com.tencent.mm.plugin.appbrand.backgroundrunning.service.AppBrandForegroundNotificationService1.class, com.tencent.mm.plugin.appbrand.loading.AppBrandProcessTriggerService1.class, com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI1.class), new com.tencent.mm.plugin.appbrand.task.m(com.tencent.mm.plugin.appbrand.ui.AppBrandUI2.class, com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI2.class, com.tencent.mm.plugin.appbrand.keepalive.AppBrandKeepAliveService2.class, com.tencent.mm.plugin.appbrand.backgroundrunning.service.AppBrandForegroundNotificationService2.class, com.tencent.mm.plugin.appbrand.loading.AppBrandProcessTriggerService2.class, com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI2.class), new com.tencent.mm.plugin.appbrand.task.m(com.tencent.mm.plugin.appbrand.ui.AppBrandUI3.class, com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI3.class, com.tencent.mm.plugin.appbrand.keepalive.AppBrandKeepAliveService3.class, com.tencent.mm.plugin.appbrand.backgroundrunning.service.AppBrandForegroundNotificationService3.class, com.tencent.mm.plugin.appbrand.loading.AppBrandProcessTriggerService3.class, com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI3.class), new com.tencent.mm.plugin.appbrand.task.m(com.tencent.mm.plugin.appbrand.ui.AppBrandUI4.class, com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI4.class, com.tencent.mm.plugin.appbrand.keepalive.AppBrandKeepAliveService4.class, com.tencent.mm.plugin.appbrand.backgroundrunning.service.AppBrandForegroundNotificationService4.class, com.tencent.mm.plugin.appbrand.loading.AppBrandProcessTriggerService4.class, com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI4.class), new com.tencent.mm.plugin.appbrand.task.m(com.tencent.mm.plugin.appbrand.ui.AppBrandUI.class, com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI.class, com.tencent.mm.plugin.appbrand.keepalive.AppBrandKeepAliveService.class, com.tencent.mm.plugin.appbrand.backgroundrunning.service.AppBrandForegroundNotificationService.class, com.tencent.mm.plugin.appbrand.loading.AppBrandProcessTriggerService0.class, com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI.class)};
        int h17 = com.tencent.mm.plugin.appbrand.task.x0.h();
        if (h17 >= 1) {
            arrayList.add(mVarArr[0]);
        }
        if (h17 >= 2) {
            arrayList.add(mVarArr[1]);
        }
        if (h17 >= 3) {
            arrayList.add(mVarArr[2]);
        }
        if (h17 >= 4) {
            arrayList.add(mVarArr[3]);
        }
        if (h17 >= 5) {
            arrayList.add(mVarArr[4]);
        }
    }

    @Override // com.tencent.luggage.sdk.processes.r
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.plugin.appbrand.task.k[] o() {
        java.util.ArrayList d17 = kz5.c0.d(new com.tencent.mm.plugin.appbrand.task.k(com.tencent.mm.plugin.appbrand.ui.AppBrandUI00.class, com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI.class, com.tencent.mm.plugin.appbrand.keepalive.AppBrandKeepAliveService.class, com.tencent.mm.plugin.appbrand.backgroundrunning.service.AppBrandForegroundNotificationService.class, com.tencent.mm.plugin.appbrand.loading.AppBrandProcessTriggerService0.class, com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI.class), new com.tencent.mm.plugin.appbrand.task.k(com.tencent.mm.plugin.appbrand.ui.AppBrandUI01.class, com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI.class, com.tencent.mm.plugin.appbrand.keepalive.AppBrandKeepAliveService.class, com.tencent.mm.plugin.appbrand.backgroundrunning.service.AppBrandForegroundNotificationService.class, com.tencent.mm.plugin.appbrand.loading.AppBrandProcessTriggerService0.class, com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI.class), new com.tencent.mm.plugin.appbrand.task.k(com.tencent.mm.plugin.appbrand.ui.AppBrandUI02.class, com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI.class, com.tencent.mm.plugin.appbrand.keepalive.AppBrandKeepAliveService.class, com.tencent.mm.plugin.appbrand.backgroundrunning.service.AppBrandForegroundNotificationService.class, com.tencent.mm.plugin.appbrand.loading.AppBrandProcessTriggerService0.class, com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI.class), new com.tencent.mm.plugin.appbrand.task.k(com.tencent.mm.plugin.appbrand.ui.AppBrandUI03.class, com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI.class, com.tencent.mm.plugin.appbrand.keepalive.AppBrandKeepAliveService.class, com.tencent.mm.plugin.appbrand.backgroundrunning.service.AppBrandForegroundNotificationService.class, com.tencent.mm.plugin.appbrand.loading.AppBrandProcessTriggerService0.class, com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI.class), new com.tencent.mm.plugin.appbrand.task.k(com.tencent.mm.plugin.appbrand.ui.AppBrandUI04.class, com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI.class, com.tencent.mm.plugin.appbrand.keepalive.AppBrandKeepAliveService.class, com.tencent.mm.plugin.appbrand.backgroundrunning.service.AppBrandForegroundNotificationService.class, com.tencent.mm.plugin.appbrand.loading.AppBrandProcessTriggerService0.class, com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI.class));
        java.util.Iterator it = d17.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.appbrand.task.k) it.next()).t(com.tencent.luggage.sdk.processes.LuggageServiceType.f47626e);
        }
        Q(d17);
        if (com.tencent.mm.plugin.appbrand.ui.t7.a()) {
            d17.add(d17.size(), new com.tencent.mm.plugin.appbrand.task.n());
        }
        return (com.tencent.mm.plugin.appbrand.task.k[]) d17.toArray(new com.tencent.mm.plugin.appbrand.task.k[0]);
    }
}
