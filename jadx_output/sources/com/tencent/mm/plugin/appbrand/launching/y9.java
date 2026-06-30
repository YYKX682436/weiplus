package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class y9 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.launching.h f85441d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(com.tencent.luggage.sdk.launching.h hVar) {
        super(1);
        this.f85441d = hVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress progressInfo = (com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress) obj;
        kotlin.jvm.internal.o.g(progressInfo, "progressInfo");
        com.tencent.luggage.sdk.launching.h hVar = this.f85441d;
        if (hVar != null) {
            hVar.a(new com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverContract$IPCCallResult(1, progressInfo, null, false, 0, null, 60, null));
        }
        return jz5.f0.f302826a;
    }
}
