package com.tencent.mm.plugin.appbrand.jsapi.wccoin;

/* loaded from: classes7.dex */
public final class u extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1140;
    public static final java.lang.String NAME = "enterWCCoinHomePage";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = (com.tencent.mm.plugin.appbrand.jsapi.d0) lVar;
        if (d0Var == null || jSONObject == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.wccoin.EnterWCCoinHomePageRequest enterWCCoinHomePageRequest = new com.tencent.mm.plugin.appbrand.jsapi.wccoin.EnterWCCoinHomePageRequest();
        java.lang.String optString = jSONObject.optString("businessId");
        kotlin.jvm.internal.o.f(optString, "optString(...)");
        enterWCCoinHomePageRequest.b(optString);
        com.tencent.mm.plugin.appbrand.jsapi.wccoin.t tVar = new com.tencent.mm.plugin.appbrand.jsapi.wccoin.t(d0Var, i17, this);
        android.content.Context context = d0Var.getContext();
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(context, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, enterWCCoinHomePageRequest, tVar, null);
    }
}
