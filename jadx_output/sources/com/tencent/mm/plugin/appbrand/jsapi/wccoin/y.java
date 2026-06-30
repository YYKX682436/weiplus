package com.tencent.mm.plugin.appbrand.jsapi.wccoin;

/* loaded from: classes7.dex */
public final class y extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1103;
    public static final java.lang.String NAME = "showWCCoinFirstBuyCoinTips";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = (com.tencent.mm.plugin.appbrand.jsapi.d0) lVar;
        if (d0Var == null || jSONObject == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.wccoin.ShowWCCoinFirstBuyCoinTipsRequest showWCCoinFirstBuyCoinTipsRequest = new com.tencent.mm.plugin.appbrand.jsapi.wccoin.ShowWCCoinFirstBuyCoinTipsRequest();
        showWCCoinFirstBuyCoinTipsRequest.b(jSONObject.optInt("alwaysDarkMode"));
        com.tencent.mm.plugin.appbrand.jsapi.wccoin.x xVar = new com.tencent.mm.plugin.appbrand.jsapi.wccoin.x(d0Var, i17, this);
        android.content.Context context = d0Var.getContext();
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(context, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, showWCCoinFirstBuyCoinTipsRequest, xVar, null);
    }
}
