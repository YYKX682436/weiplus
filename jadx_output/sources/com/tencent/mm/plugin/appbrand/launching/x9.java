package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class x9 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.launching.h f85415d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u65.a f85416e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(com.tencent.luggage.sdk.launching.h hVar, u65.a aVar) {
        super(1);
        this.f85415d = hVar;
        this.f85416e = aVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List resultPkgList = (java.util.List) obj;
        kotlin.jvm.internal.o.g(resultPkgList, "resultPkgList");
        com.tencent.luggage.sdk.launching.h hVar = this.f85415d;
        if (hVar != null) {
            hVar.a(new com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverContract$IPCCallResult(2, null, resultPkgList, true, 0, null, 50, null));
        }
        this.f85416e.b();
        return jz5.f0.f302826a;
    }
}
