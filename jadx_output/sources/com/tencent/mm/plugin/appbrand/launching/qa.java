package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class qa extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.ra f85084d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs f85085e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa(com.tencent.mm.plugin.appbrand.launching.ra raVar, com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs modularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs) {
        super(2);
        this.f85084d = raVar;
        this.f85085e = modularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String str = (java.lang.String) obj2;
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.ModularizingPkgRetrieverSeparatedPluginsCompatible.IPCCallTask", "waitForPkgList onError(" + intValue + ", " + str + ')');
        this.f85084d.a(new com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverContract$IPCCallResult(2, null, null, false, intValue, str, 6, null));
        com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs modularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs = this.f85085e;
        com.tencent.mm.plugin.appbrand.report.quality.i1.a(modularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs.f84453d, modularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs.f84455f, modularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs.f84456g, modularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs.f84457h, intValue);
        return jz5.f0.f302826a;
    }
}
