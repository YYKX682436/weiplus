package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes4.dex */
public final class f9 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km5.b f75082d;

    public f9(km5.b bVar) {
        this.f75082d = bVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.app.ServiceForWebViewAnyProcess$IPCReportMiniProgramPageDataResult serviceForWebViewAnyProcess$IPCReportMiniProgramPageDataResult = (com.tencent.mm.plugin.appbrand.app.ServiceForWebViewAnyProcess$IPCReportMiniProgramPageDataResult) obj;
        int i17 = serviceForWebViewAnyProcess$IPCReportMiniProgramPageDataResult.f74998d;
        boolean z17 = serviceForWebViewAnyProcess$IPCReportMiniProgramPageDataResult.f74999e;
        km5.b bVar = this.f75082d;
        if (z17) {
            bVar.c(java.lang.Integer.valueOf(i17));
        } else {
            bVar.a(serviceForWebViewAnyProcess$IPCReportMiniProgramPageDataResult.f75000f);
        }
    }
}
