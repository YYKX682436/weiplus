package com.tencent.mm.plugin.appbrand.jsapi.channels;

/* loaded from: classes7.dex */
public final class a0 implements com.tencent.mm.plugin.appbrand.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f80224a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f80225b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.channels.b0 f80226c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f80227d;

    public a0(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.channels.b0 b0Var, org.json.JSONObject jSONObject) {
        this.f80224a = lVar;
        this.f80225b = i17;
        this.f80226c = b0Var;
        this.f80227d = jSONObject;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.u
    public void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        com.tencent.mm.plugin.appbrand.jsapi.channels.OpenChannelsRewardedVideoAdResult openChannelsRewardedVideoAdResult = (com.tencent.mm.plugin.appbrand.jsapi.channels.OpenChannelsRewardedVideoAdResult) appBrandProxyUIProcessTask$ProcessResult;
        if (openChannelsRewardedVideoAdResult == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsRewardedVideoAd", "onReceiveResult#IProcessResultReceiver, result is null");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onReceiveResult#IProcessResultReceiver, errCode: ");
        int i17 = openChannelsRewardedVideoAdResult.f80214d;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiOpenChannelsRewardedVideoAd", sb6.toString());
        org.json.JSONObject jSONObject = this.f80227d;
        com.tencent.mm.plugin.appbrand.jsapi.channels.b0 b0Var = this.f80226c;
        int i18 = this.f80225b;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f80224a;
        if (i17 != 0) {
            lVar.a(i18, b0Var.o("fail:internal error"));
            b0Var.C(jSONObject, mq0.z.f330649w, kz5.b1.e(new jz5.l("errMsg", "errCode:" + i17)));
            return;
        }
        org.json.JSONArray jSONArray = null;
        r45.j33 j33Var = openChannelsRewardedVideoAdResult.f80215e;
        java.lang.String string = j33Var != null ? j33Var.getString(1) : null;
        kz5.q0 q0Var = kz5.q0.f314001d;
        if (string == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiOpenChannelsRewardedVideoAd", "onReceiveResult#IProcessResultReceiver, feedbackInfo is null");
            lVar.a(i18, b0Var.o("ok"));
            b0Var.C(jSONObject, mq0.z.f330648v, q0Var);
            return;
        }
        try {
            jSONArray = new org.json.JSONArray(j33Var.getString(1));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsRewardedVideoAd", "onReceiveResult#IProcessResultReceiver, parse feedbackInfo fail since " + e17);
        }
        if (jSONArray == null) {
            lVar.a(i18, b0Var.o("ok"));
            b0Var.C(jSONObject, mq0.z.f330648v, q0Var);
        } else {
            lVar.a(i18, b0Var.p("ok", kz5.c1.i(new jz5.l("rewardedDuration", java.lang.Integer.valueOf(j33Var.getInteger(0))), new jz5.l("feedbackInfo", jSONArray))));
            b0Var.C(jSONObject, mq0.z.f330648v, q0Var);
        }
    }
}
