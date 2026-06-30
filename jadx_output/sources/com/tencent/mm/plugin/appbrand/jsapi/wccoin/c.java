package com.tencent.mm.plugin.appbrand.jsapi.wccoin;

/* loaded from: classes8.dex */
public final class c implements js4.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.wccoin.d f83760a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.wccoin.BuyWCCoinResult f83761b;

    public c(com.tencent.mm.plugin.appbrand.jsapi.wccoin.d dVar, com.tencent.mm.plugin.appbrand.jsapi.wccoin.BuyWCCoinResult buyWCCoinResult) {
        this.f83760a = dVar;
        this.f83761b = buyWCCoinResult;
    }

    @Override // js4.o
    public void a(int i17, int i18, java.lang.String errorMsg) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(errorMsg, "errorMsg");
        com.tencent.mm.plugin.appbrand.jsapi.wccoin.d dVar = this.f83760a;
        str = dVar.TAG;
        com.tencent.mars.xlog.Log.i(str, "onFailed,errorType:%s,errorCode:%s, msg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), errorMsg);
        com.tencent.mm.plugin.appbrand.jsapi.wccoin.BuyWCCoinResult buyWCCoinResult = this.f83761b;
        if (i18 == -3) {
            com.tencent.mm.plugin.appbrand.jsapi.wccoin.d.e(buyWCCoinResult, dVar);
        } else {
            com.tencent.mm.plugin.appbrand.jsapi.wccoin.d.f(buyWCCoinResult, dVar);
        }
    }

    @Override // js4.o
    public void onSuccess(java.lang.Object obj) {
        java.lang.String str;
        com.tencent.mm.plugin.appbrand.jsapi.wccoin.d dVar = this.f83760a;
        str = dVar.TAG;
        com.tencent.mars.xlog.Log.i(str, ya.b.SUCCESS);
        com.tencent.mm.plugin.appbrand.jsapi.wccoin.d.g(this.f83761b, dVar);
    }
}
