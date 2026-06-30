package com.tencent.mm.plugin.appbrand.jsapi.wccoin;

/* loaded from: classes7.dex */
public final class r implements com.tencent.mm.plugin.appbrand.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f83779a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f83780b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.wccoin.s f83781c;

    public r(com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.wccoin.s sVar) {
        this.f83779a = d0Var;
        this.f83780b = i17;
        this.f83781c = sVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.u
    public void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.jsapi.wccoin.ConsumeWCCoinResult consumeWCCoinResult = (com.tencent.mm.plugin.appbrand.jsapi.wccoin.ConsumeWCCoinResult) appBrandProxyUIProcessTask$ProcessResult;
        com.tencent.mm.plugin.appbrand.jsapi.wccoin.s sVar = this.f83781c;
        int i17 = this.f83780b;
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = this.f83779a;
        if (consumeWCCoinResult == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiConsumeWCCoin", "onReceiveResult get NULL result");
            sVar.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            d0Var.a(i17, sVar.u(str2, jSONObject));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiConsumeWCCoin", "onReceiveResult resultCode:%s", consumeWCCoinResult.f83752d);
        if (kotlin.jvm.internal.o.b(consumeWCCoinResult.f83752d, "ok")) {
            java.util.HashMap i18 = kz5.c1.i(new jz5.l("balance", consumeWCCoinResult.f83753e));
            sVar.getClass();
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            i18.put("errno", 0);
            d0Var.a(i17, sVar.t("ok", i18));
            return;
        }
        java.lang.String str5 = "fail " + consumeWCCoinResult.f83752d;
        sVar.getClass();
        str = android.text.TextUtils.isEmpty(str5) ? null : str5;
        str2 = str != null ? str : "";
        java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 0);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        d0Var.a(i17, sVar.u(str2, jSONObject2));
    }
}
