package com.tencent.mm.plugin.appbrand.task;

/* loaded from: classes7.dex */
public final class g1 extends com.tencent.mm.plugin.appbrand.task.u0 {

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.Map f89028n = kz5.c1.k(new jz5.l(":appbrand0", new com.tencent.mm.plugin.appbrand.task.f1(com.tencent.mm.plugin.appbrand.ui.AppBrandUI.class, com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI.class, com.tencent.mm.plugin.appbrand.keepalive.AppBrandKeepAliveService.class, com.tencent.mm.plugin.appbrand.backgroundrunning.service.AppBrandForegroundNotificationService.class, com.tencent.mm.plugin.appbrand.loading.AppBrandProcessTriggerService0.class, com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI.class)), new jz5.l(":appbrand1", new com.tencent.mm.plugin.appbrand.task.f1(com.tencent.mm.plugin.appbrand.ui.AppBrandUI1.class, com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI1.class, com.tencent.mm.plugin.appbrand.keepalive.AppBrandKeepAliveService1.class, com.tencent.mm.plugin.appbrand.backgroundrunning.service.AppBrandForegroundNotificationService1.class, com.tencent.mm.plugin.appbrand.loading.AppBrandProcessTriggerService1.class, com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI1.class)), new jz5.l(":appbrand2", new com.tencent.mm.plugin.appbrand.task.f1(com.tencent.mm.plugin.appbrand.ui.AppBrandUI2.class, com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI2.class, com.tencent.mm.plugin.appbrand.keepalive.AppBrandKeepAliveService2.class, com.tencent.mm.plugin.appbrand.backgroundrunning.service.AppBrandForegroundNotificationService2.class, com.tencent.mm.plugin.appbrand.loading.AppBrandProcessTriggerService2.class, com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI2.class)), new jz5.l(":appbrand3", new com.tencent.mm.plugin.appbrand.task.f1(com.tencent.mm.plugin.appbrand.ui.AppBrandUI3.class, com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI3.class, com.tencent.mm.plugin.appbrand.keepalive.AppBrandKeepAliveService3.class, com.tencent.mm.plugin.appbrand.backgroundrunning.service.AppBrandForegroundNotificationService3.class, com.tencent.mm.plugin.appbrand.loading.AppBrandProcessTriggerService3.class, com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI3.class)), new jz5.l(":appbrand4", new com.tencent.mm.plugin.appbrand.task.f1(com.tencent.mm.plugin.appbrand.ui.AppBrandUI4.class, com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI4.class, com.tencent.mm.plugin.appbrand.keepalive.AppBrandKeepAliveService4.class, com.tencent.mm.plugin.appbrand.backgroundrunning.service.AppBrandForegroundNotificationService4.class, com.tencent.mm.plugin.appbrand.loading.AppBrandProcessTriggerService4.class, com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI4.class)));

    public g1() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWAServiceV8LiteProcessManager", "<init>");
    }

    @Override // com.tencent.luggage.sdk.processes.r
    public com.tencent.luggage.sdk.processes.h[] o() {
        java.util.Map map;
        java.lang.String[] strArr = com.tencent.mm.plugin.appbrand.jsruntime.f2.f83989d;
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        int length = strArr.length;
        int i17 = 0;
        while (true) {
            map = f89028n;
            if (i17 >= length) {
                break;
            }
            java.lang.Object obj = map.get(strArr[i17]);
            kotlin.jvm.internal.o.d(obj);
            arrayList.add((com.tencent.mm.plugin.appbrand.task.f1) obj);
            i17++;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.task.f1 f1Var = (com.tencent.mm.plugin.appbrand.task.f1) it.next();
            arrayList2.add(new com.tencent.mm.plugin.appbrand.task.l(f1Var.f89018a, f1Var.f89019b, f1Var.f89020c, f1Var.f89021d, f1Var.f89022e, f1Var.f89023f));
        }
        java.lang.String[] strArr2 = com.tencent.mm.plugin.appbrand.jsruntime.f2.f83990e;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(strArr2.length);
        for (java.lang.String str : strArr2) {
            java.lang.Object obj2 = map.get(str);
            kotlin.jvm.internal.o.d(obj2);
            arrayList3.add((com.tencent.mm.plugin.appbrand.task.f1) obj2);
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(arrayList3, 10));
        java.util.Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            com.tencent.mm.plugin.appbrand.task.f1 f1Var2 = (com.tencent.mm.plugin.appbrand.task.f1) it6.next();
            arrayList4.add(new com.tencent.mm.plugin.appbrand.task.m(f1Var2.f89018a, f1Var2.f89019b, f1Var2.f89020c, f1Var2.f89021d, f1Var2.f89022e, f1Var2.f89023f));
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList(arrayList2);
        arrayList5.addAll(arrayList4);
        return (com.tencent.mm.plugin.appbrand.task.k[]) arrayList5.toArray(new com.tencent.mm.plugin.appbrand.task.k[0]);
    }
}
