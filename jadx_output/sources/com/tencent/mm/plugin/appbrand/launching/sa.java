package com.tencent.mm.plugin.appbrand.launching;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/launching/sa;", "Lcom/tencent/mm/ipcinvoker/k0;", "Lcom/tencent/mm/plugin/appbrand/launching/ModularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs;", "Lcom/tencent/mm/plugin/appbrand/launching/ModularizingPkgRetrieverContract$IPCCallResult;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class sa implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs modularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs = (com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs) obj;
        if (modularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs == null) {
            return null;
        }
        com.tencent.mm.plugin.appbrand.launching.ta taVar = new com.tencent.mm.plugin.appbrand.launching.ta();
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference(null);
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
        com.tencent.mm.plugin.appbrand.launching.ra raVar = new com.tencent.mm.plugin.appbrand.launching.ra(atomicBoolean, modularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs, atomicReference);
        int i17 = com.tencent.mm.plugin.appbrand.launching.ka.f84720a;
        com.tencent.mm.plugin.appbrand.launching.ga gaVar = com.tencent.mm.plugin.appbrand.launching.ga.f84629a;
        com.tencent.mm.plugin.appbrand.launching.u3 u3Var = com.tencent.mm.plugin.appbrand.launching.u3.f85212a;
        java.lang.String str = modularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs.f84465s;
        kotlin.jvm.internal.o.d(str);
        gaVar.a(u3Var, modularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs, kz5.b0.c(str), new com.tencent.mm.plugin.appbrand.launching.oa(raVar), new com.tencent.mm.plugin.appbrand.launching.pa(raVar), new com.tencent.mm.plugin.appbrand.launching.qa(raVar, modularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs), taVar, null);
        java.util.Iterator it = taVar.f85166d.iterator();
        while (it.hasNext()) {
            ((wu5.c) it.next()).get();
        }
        try {
            return (com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverContract$IPCCallResult) atomicReference.get();
        } finally {
            atomicBoolean.set(true);
        }
    }
}
