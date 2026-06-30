package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes9.dex */
public final class r2 implements h45.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f82662a;

    public r2(com.tencent.mm.ipcinvoker.r rVar) {
        this.f82662a = rVar;
    }

    @Override // h45.n
    public final void onSessionId(java.lang.String str) {
        if (str == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiReportCrossPlatformPay", "onSessionId is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiReportCrossPlatformPay", "onSessionId: ".concat(str));
        com.tencent.mm.ipcinvoker.r rVar = this.f82662a;
        if (rVar != null) {
            rVar.a(new com.tencent.mm.plugin.appbrand.jsapi.pay.JsApiReportCrossPlatformPayResponse(str));
        }
    }
}
