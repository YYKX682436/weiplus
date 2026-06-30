package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class fa extends ph1.q {
    @Override // ph1.q
    public void a(java.lang.String transactionKey) {
        com.tencent.mm.plugin.appbrand.launching.ea eaVar;
        kotlin.jvm.internal.o.g(transactionKey, "transactionKey");
        java.util.Map map = com.tencent.mm.plugin.appbrand.launching.ea.f84597d;
        java.util.Map map2 = com.tencent.mm.plugin.appbrand.launching.ea.f84597d;
        if (map2 instanceof java.util.concurrent.ConcurrentHashMap) {
            eaVar = (com.tencent.mm.plugin.appbrand.launching.ea) ((java.util.concurrent.ConcurrentHashMap) map2).remove(transactionKey);
        } else {
            synchronized (map2) {
                eaVar = (com.tencent.mm.plugin.appbrand.launching.ea) ((java.util.concurrent.ConcurrentHashMap) map2).remove(transactionKey);
            }
        }
        if (eaVar != null) {
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = eaVar.f84599b;
            if (concurrentLinkedQueue.isEmpty()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.ModularizingPkgBatchLoadTransaction", "commit for key:" + eaVar.f84598a + " but no requests");
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(concurrentLinkedQueue, 10));
            java.util.Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.appbrand.launching.ma maVar = (com.tencent.mm.plugin.appbrand.launching.ma) it.next();
                arrayList.add(new com.tencent.mm.plugin.appbrand.launching.ModularizingPkgBatchLoadTransaction$IPCCallModuleItem(maVar.f84787c, (com.tencent.luggage.sdk.launching.h) ((jz5.n) maVar.f84790f).getValue()));
            }
            ((ph1.n) ph1.o.f354347c).execute(new com.tencent.mm.plugin.appbrand.launching.da(eaVar, arrayList));
        }
    }

    @Override // ph1.q
    public ph1.r b(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime, java.lang.String requestModuleName, java.lang.String str) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        kotlin.jvm.internal.o.g(requestModuleName, "requestModuleName");
        return !(str == null || str.length() == 0) ? new com.tencent.mm.plugin.appbrand.launching.ma(runtime, requestModuleName, str) : new com.tencent.mm.plugin.appbrand.launching.va(runtime, requestModuleName);
    }
}
