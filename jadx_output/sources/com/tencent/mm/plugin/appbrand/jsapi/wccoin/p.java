package com.tencent.mm.plugin.appbrand.jsapi.wccoin;

/* loaded from: classes7.dex */
public final class p implements com.tencent.mm.plugin.appbrand.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f83776a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f83777b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.wccoin.q f83778c;

    public p(com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.wccoin.q qVar) {
        this.f83776a = d0Var;
        this.f83777b = i17;
        this.f83778c = qVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.u
    public void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.jsapi.wccoin.BuyWCCoinResult buyWCCoinResult = (com.tencent.mm.plugin.appbrand.jsapi.wccoin.BuyWCCoinResult) appBrandProxyUIProcessTask$ProcessResult;
        com.tencent.mm.plugin.appbrand.jsapi.wccoin.q qVar = this.f83778c;
        int i17 = this.f83777b;
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = this.f83776a;
        if (buyWCCoinResult == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiBuyWCCoin", "onReceiveResult get NULL result");
            qVar.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            d0Var.a(i17, qVar.u(str2, jSONObject));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiBuyWCCoin", "onReceiveResult resultCode:%s", buyWCCoinResult.f83739d);
        if (kotlin.jvm.internal.o.b(buyWCCoinResult.f83739d, "ok")) {
            qVar.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 0);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            d0Var.a(i17, qVar.u(str2, jSONObject2));
            return;
        }
        java.lang.String str5 = "fail " + buyWCCoinResult.f83739d;
        qVar.getClass();
        str = android.text.TextUtils.isEmpty(str5) ? null : str5;
        str2 = str != null ? str : "";
        java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put("errno", 0);
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
        }
        d0Var.a(i17, qVar.u(str2, jSONObject3));
    }
}
