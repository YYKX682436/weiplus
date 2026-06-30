package com.tencent.mm.plugin.appbrand.jsapi.biz;

/* loaded from: classes7.dex */
public final class m1 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1515;
    private static final java.lang.String NAME = "startBindPhone";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l env, org.json.JSONObject data, int i17) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiStartBindPhone", NAME);
        com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiStartBindPhone$BindPhoneRequest jsApiStartBindPhone$BindPhoneRequest = new com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiStartBindPhone$BindPhoneRequest();
        jsApiStartBindPhone$BindPhoneRequest.b(data.optInt("enterType", 0));
        com.tencent.mm.plugin.appbrand.jsapi.biz.l1 l1Var = new com.tencent.mm.plugin.appbrand.jsapi.biz.l1(env, i17, this);
        android.content.Context context = env.getContext();
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(context, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, jsApiStartBindPhone$BindPhoneRequest, l1Var, null);
    }
}
