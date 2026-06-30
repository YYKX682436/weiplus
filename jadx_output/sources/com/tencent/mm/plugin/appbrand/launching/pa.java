package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class pa extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.ra f84899d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa(com.tencent.mm.plugin.appbrand.launching.ra raVar) {
        super(1);
        this.f84899d = raVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress wholeProgressInfo = (com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress) obj;
        kotlin.jvm.internal.o.g(wholeProgressInfo, "wholeProgressInfo");
        this.f84899d.a(new com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverContract$IPCCallResult(1, wholeProgressInfo, null, false, 0, null, 60, null));
        return jz5.f0.f302826a;
    }
}
