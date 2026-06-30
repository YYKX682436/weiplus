package com.tencent.mm.plugin.appbrand.appcache.predownload;

/* loaded from: classes7.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f75892d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f75893e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(java.lang.String str, long j17) {
        super(0);
        this.f75892d = str;
        this.f75893e = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = this.f75892d;
        k91.v5 n17 = com.tencent.mm.plugin.appbrand.app.r9.ij().n1(str, "appInfo");
        k91.j5 u07 = n17 != null ? n17.u0() : null;
        if (u07 != null) {
            boolean b17 = u07.b();
            long j17 = this.f75893e;
            if (b17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PreDownloadServiceExportImpl", "triggerPrefetchWeAppQRCode tryPreload WAGAME username:" + str + ", timestamp:" + j17);
                com.tencent.mm.plugin.appbrand.task.u0.f89199h.a().P(com.tencent.luggage.sdk.processes.LuggageServiceType.f47627f, com.tencent.mm.plugin.appbrand.service.x6.f88829t);
            } else if (u07.c()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PreDownloadServiceExportImpl", "triggerPrefetchWeAppQRCode tryPreload FAKE NATIVE username:" + str + ", timestamp:" + j17);
                com.tencent.mm.plugin.appbrand.task.u0.f89199h.a().P(com.tencent.luggage.sdk.processes.LuggageServiceType.f47626e, com.tencent.mm.plugin.appbrand.service.x6.f88829t);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PreDownloadServiceExportImpl", "triggerPrefetchWeAppQRCode tryPreload WASERVICE username:" + str + ", timestamp:" + j17);
                com.tencent.mm.plugin.appbrand.task.u0.f89199h.a().P(com.tencent.luggage.sdk.processes.LuggageServiceType.f47626e, com.tencent.mm.plugin.appbrand.service.x6.f88829t);
            }
        }
        return jz5.f0.f302826a;
    }
}
