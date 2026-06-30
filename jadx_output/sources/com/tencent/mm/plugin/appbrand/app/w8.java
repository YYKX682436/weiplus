package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes4.dex */
public final class w8 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f75333a;

    public w8(com.tencent.mm.ipcinvoker.r rVar) {
        this.f75333a = rVar;
    }

    @Override // km5.e
    public final void a(java.lang.Object obj) {
        java.lang.String errMsg;
        com.tencent.mm.ipcinvoker.r rVar = this.f75333a;
        if (rVar != null) {
            java.lang.Throwable th6 = obj instanceof java.lang.Throwable ? (java.lang.Throwable) obj : null;
            if (th6 == null || (errMsg = th6.getMessage()) == null) {
                errMsg = obj.toString();
            }
            kotlin.jvm.internal.o.g(errMsg, "errMsg");
            rVar.a(new com.tencent.mm.plugin.appbrand.app.ServiceForWebViewAnyProcess$IPCReportMiniProgramPageDataResult(0, false, errMsg));
        }
    }
}
