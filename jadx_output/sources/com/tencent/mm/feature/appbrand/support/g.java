package com.tencent.mm.feature.appbrand.support;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tencent/mm/feature/appbrand/support/AppBrandProcessManagerServiceAnyProcess$ParcelizedAppProcessListWrap;", "kotlin.jvm.PlatformType", "it", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class g<InputType, ResultType> implements com.tencent.mm.ipcinvoker.k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.feature.appbrand.support.g f65073a = new com.tencent.mm.feature.appbrand.support.g();

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.feature.appbrand.support.AppBrandProcessManagerServiceAnyProcess$ParcelizedAppProcess appBrandProcessManagerServiceAnyProcess$ParcelizedAppProcess;
        com.tencent.mm.feature.appbrand.support.AppBrandProcessManagerServiceAnyProcess$ParcelizedAppRecord appBrandProcessManagerServiceAnyProcess$ParcelizedAppRecord;
        java.util.List<ft.b> R6 = ((ft.e) i95.n0.c(ft.e.class)).R6();
        kotlin.jvm.internal.o.f(R6, "getAllProcesses(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(R6, 10));
        for (ft.b bVar : R6) {
            kotlin.jvm.internal.o.d(bVar);
            if (bVar instanceof com.tencent.mm.feature.appbrand.support.AppBrandProcessManagerServiceAnyProcess$ParcelizedAppProcess) {
                appBrandProcessManagerServiceAnyProcess$ParcelizedAppProcess = (com.tencent.mm.feature.appbrand.support.AppBrandProcessManagerServiceAnyProcess$ParcelizedAppProcess) bVar;
            } else {
                java.lang.String f65038d = bVar.getF65038d();
                kotlin.jvm.internal.o.f(f65038d, "processName(...)");
                boolean z17 = false;
                if (r26.i0.n(f65038d, ":appbrand1", false) && com.tencent.mm.plugin.magicbrush.a5.f147838c) {
                    z17 = true;
                }
                boolean z18 = z17;
                java.lang.String f65038d2 = bVar.getF65038d();
                java.util.List<ft.c> f65039e = bVar.getF65039e();
                kotlin.jvm.internal.o.f(f65039e, "appList(...)");
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(f65039e, 10));
                for (ft.c cVar : f65039e) {
                    kotlin.jvm.internal.o.d(cVar);
                    if (cVar instanceof com.tencent.mm.feature.appbrand.support.AppBrandProcessManagerServiceAnyProcess$ParcelizedAppRecord) {
                        appBrandProcessManagerServiceAnyProcess$ParcelizedAppRecord = (com.tencent.mm.feature.appbrand.support.AppBrandProcessManagerServiceAnyProcess$ParcelizedAppRecord) cVar;
                    } else {
                        java.lang.String f65044d = cVar.getF65044d();
                        kotlin.jvm.internal.o.f(f65044d, "appId(...)");
                        ft.d f65045e = cVar.getF65045e();
                        kotlin.jvm.internal.o.f(f65045e, "appType(...)");
                        appBrandProcessManagerServiceAnyProcess$ParcelizedAppRecord = new com.tencent.mm.feature.appbrand.support.AppBrandProcessManagerServiceAnyProcess$ParcelizedAppRecord(f65044d, f65045e, cVar.getF65046f());
                    }
                    arrayList2.add(appBrandProcessManagerServiceAnyProcess$ParcelizedAppRecord);
                }
                ft.d f65040f = bVar.getF65040f();
                kotlin.jvm.internal.o.f(f65040f, "preferUsedAsType(...)");
                appBrandProcessManagerServiceAnyProcess$ParcelizedAppProcess = new com.tencent.mm.feature.appbrand.support.AppBrandProcessManagerServiceAnyProcess$ParcelizedAppProcess(f65038d2, arrayList2, f65040f, z18, 0, 16, null);
            }
            arrayList.add(appBrandProcessManagerServiceAnyProcess$ParcelizedAppProcess);
        }
        return new com.tencent.mm.feature.appbrand.support.AppBrandProcessManagerServiceAnyProcess$ParcelizedAppProcessListWrap(arrayList);
    }
}
