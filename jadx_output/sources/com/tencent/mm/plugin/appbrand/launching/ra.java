package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class ra {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f85118a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs f85119b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f85120c;

    public ra(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs modularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs, java.util.concurrent.atomic.AtomicReference atomicReference) {
        this.f85118a = atomicBoolean;
        this.f85119b = modularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs;
        this.f85120c = atomicReference;
    }

    public final void a(com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverContract$IPCCallResult callbackResult) {
        kotlin.jvm.internal.o.g(callbackResult, "callbackResult");
        int i17 = callbackResult.f84447d;
        com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs modularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs = this.f85119b;
        if (1 == i17) {
            com.tencent.luggage.sdk.launching.h hVar = modularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs.f84466t;
            if (hVar != null) {
                hVar.a(callbackResult);
                return;
            }
            return;
        }
        boolean z17 = this.f85118a.get();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ModularizingPkgRetrieverSeparatedPluginsCompatible.IPCCallTask", "onCallback instance:" + modularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs.f84462p.f88134d + " appId:" + modularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs.f84453d + " module:" + modularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs.f84465s + " isCallStackCompleted:" + z17);
        if (z17) {
            com.tencent.luggage.sdk.launching.h hVar2 = modularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs.f84466t;
            if (hVar2 != null) {
                hVar2.a(callbackResult);
            }
        } else {
            this.f85120c.set(callbackResult);
        }
        modularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs.f84460n.close();
    }
}
