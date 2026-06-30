package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class z9 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.launching.h f85474d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.ModularizingPkgBatchLoadTransaction$IPCCallArgs f85475e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u65.a f85476f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9(com.tencent.luggage.sdk.launching.h hVar, com.tencent.mm.plugin.appbrand.launching.ModularizingPkgBatchLoadTransaction$IPCCallArgs modularizingPkgBatchLoadTransaction$IPCCallArgs, u65.a aVar) {
        super(2);
        this.f85474d = hVar;
        this.f85475e = modularizingPkgBatchLoadTransaction$IPCCallArgs;
        this.f85476f = aVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String str = (java.lang.String) obj2;
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.ModularizingPkgBatchLoadTransaction", "waitForPkgList onError(" + intValue + ", " + str + ')');
        com.tencent.luggage.sdk.launching.h hVar = this.f85474d;
        if (hVar != null) {
            hVar.a(new com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverContract$IPCCallResult(2, null, null, false, intValue, str, 6, null));
        }
        com.tencent.mm.plugin.appbrand.launching.ModularizingPkgBatchLoadTransaction$IPCCallArgs modularizingPkgBatchLoadTransaction$IPCCallArgs = this.f85475e;
        com.tencent.mm.plugin.appbrand.report.quality.i1.a(modularizingPkgBatchLoadTransaction$IPCCallArgs.f84453d, modularizingPkgBatchLoadTransaction$IPCCallArgs.f84455f, modularizingPkgBatchLoadTransaction$IPCCallArgs.f84456g, modularizingPkgBatchLoadTransaction$IPCCallArgs.f84457h, intValue);
        this.f85476f.b();
        return jz5.f0.f302826a;
    }
}
