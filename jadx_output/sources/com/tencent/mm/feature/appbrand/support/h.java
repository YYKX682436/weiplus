package com.tencent.mm.feature.appbrand.support;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tencent/mm/feature/appbrand/support/AppBrandProcessManagerServiceAnyProcess$ParcelizedAppProcess;", "it", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class h<InputType, ResultType> implements com.tencent.mm.ipcinvoker.k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.feature.appbrand.support.h f65074a = new com.tencent.mm.feature.appbrand.support.h();

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.LinkedList linkedList;
        ft.d dVar;
        ft.d dVar2;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedHashMap linkedHashMap = com.tencent.mm.plugin.appbrand.l.f84209b;
        synchronized (linkedHashMap) {
            linkedList = new java.util.LinkedList(linkedHashMap.values());
        }
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            dVar = ft.d.WASERVICE;
            dVar2 = ft.d.WAGAME;
            if (!hasNext) {
                break;
            }
            com.tencent.mm.plugin.appbrand.o6 o6Var = (com.tencent.mm.plugin.appbrand.o6) it.next();
            java.lang.String str = o6Var.f74803n;
            kotlin.jvm.internal.o.f(str, "getAppId(...)");
            if (o6Var.q2()) {
                dVar = dVar2;
            }
            if (o6Var.u0().W1 != com.tencent.luggage.sdk.launching.p.HEADLESS) {
                r4 = false;
            }
            linkedList2.add(new com.tencent.mm.feature.appbrand.support.AppBrandProcessManagerServiceAnyProcess$ParcelizedAppRecord(str, dVar, r4));
        }
        if (linkedList2.isEmpty()) {
            java.lang.String a17 = bm5.f1.a();
            kotlin.jvm.internal.o.f(a17, "getProcessName(...)");
            if (!r26.i0.n(a17, ":appbrand1", false) && !com.tencent.mm.plugin.appbrand.task.r.m(com.tencent.mm.plugin.appbrand.task.x0.WAGAME)) {
                dVar2 = dVar;
            }
        } else {
            dVar2 = ((com.tencent.mm.feature.appbrand.support.AppBrandProcessManagerServiceAnyProcess$ParcelizedAppRecord) linkedList2.getLast()).f65045e;
        }
        java.lang.String a18 = bm5.f1.a();
        kotlin.jvm.internal.o.d(a18);
        return new com.tencent.mm.feature.appbrand.support.AppBrandProcessManagerServiceAnyProcess$ParcelizedAppProcess(a18, linkedList2, dVar2, r26.i0.n(a18, ":appbrand1", false) && com.tencent.mm.plugin.magicbrush.a5.f147837b, android.os.Process.myPid());
    }
}
