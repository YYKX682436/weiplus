package com.tencent.mm.plugin.appbrand.jsapi.wccoin;

/* loaded from: classes.dex */
public final class v implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f83785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f83786e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.wccoin.w f83787f;

    public v(com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.wccoin.w wVar) {
        this.f83785d = d0Var;
        this.f83786e = i17;
        this.f83787f = wVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCLong iPCLong = (com.tencent.mm.ipcinvoker.type.IPCLong) obj;
        long j17 = iPCLong.f68405d;
        com.tencent.mm.plugin.appbrand.jsapi.wccoin.w wVar = this.f83787f;
        int i17 = this.f83786e;
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = this.f83785d;
        if (j17 >= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetWCCoinBalance", ya.b.SUCCESS);
            java.util.HashMap i18 = kz5.c1.i(new jz5.l("balance", java.lang.Long.valueOf(iPCLong.f68405d)));
            wVar.getClass();
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            i18.put("errno", 0);
            d0Var.a(i17, wVar.t("ok", i18));
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetWCCoinBalance", "fail");
        wVar.getClass();
        java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errno", 4);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        d0Var.a(i17, wVar.u(str2, jSONObject));
    }
}
