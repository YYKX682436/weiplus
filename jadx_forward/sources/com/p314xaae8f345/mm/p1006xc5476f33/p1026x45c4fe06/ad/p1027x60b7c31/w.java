package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31;

/* loaded from: classes7.dex */
public class w extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f33401x366c91de = 757;

    /* renamed from: NAME */
    public static final java.lang.String f33402x24728b = "splashAdFirstStepViewLayoutStateChange";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        int optInt = jSONObject.optInt("state", -1);
        if (optInt != 0 && optInt != 1) {
            c0Var.a(i17, o("fail:invalid data"));
            return;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (optInt == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiSplashAdFirstStepLayoutChange[AppBrandSplashAd]", "splashAdFirstStep, startTime:%s", java.lang.Long.valueOf(currentTimeMillis));
            i81.a0.a(c0Var.t3()).f371101l = currentTimeMillis;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiSplashAdFirstStepLayoutChange[AppBrandSplashAd]", "splashAdFirstStep, endTime:%s", java.lang.Long.valueOf(currentTimeMillis));
            i81.a0.a(c0Var.t3()).f371102m = currentTimeMillis;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiSplashAdFirstStepLayoutChange[AppBrandSplashAd]", "splashAdFirstStep, costTime:%s", java.lang.Long.valueOf(i81.a0.a(c0Var.t3()).f371102m - i81.a0.a(c0Var.t3()).f371101l));
        }
        c0Var.a(i17, o("ok"));
    }
}
