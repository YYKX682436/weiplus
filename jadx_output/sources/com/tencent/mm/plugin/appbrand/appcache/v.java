package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public class v implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f76003a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.u f76004b;

    public v(com.tencent.mm.plugin.appbrand.appcache.u uVar, long j17) {
        this.f76004b = uVar;
        this.f76003a = j17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.autogen.events.WxaGetDownloadUrlReportEvent wxaGetDownloadUrlReportEvent = new com.tencent.mm.autogen.events.WxaGetDownloadUrlReportEvent();
        am.z20 z20Var = wxaGetDownloadUrlReportEvent.f54998g;
        z20Var.f8510a = this.f76004b;
        z20Var.f8512c = this.f76003a;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        z20Var.f8513d = java.lang.System.currentTimeMillis();
        z20Var.f8511b = fVar;
        wxaGetDownloadUrlReportEvent.e();
        return fVar;
    }
}
