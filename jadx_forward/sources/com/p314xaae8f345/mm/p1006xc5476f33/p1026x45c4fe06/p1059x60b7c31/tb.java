package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public class tb extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34885x366c91de = 406;

    /* renamed from: NAME */
    public static final java.lang.String f34886x24728b = "private_openUrl";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        android.content.Intent putExtra;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) lVar;
        java.lang.String optString = jSONObject.optString("url");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            D(d0Var, i17, "fail");
            return;
        }
        boolean optBoolean = jSONObject.optBoolean("isNativeStyle", false);
        if (optBoolean) {
            android.content.Intent putExtra2 = new android.content.Intent().putExtra("rawUrl", optString);
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.f159880p;
            putExtra = putExtra2.putExtra("appbrand_report_key_target_url", optString).putExtra("open_custom_style_url", optBoolean).putExtra("forceHideShare", true).putExtra("status_bar_style", "black");
        } else {
            android.content.Intent putExtra3 = new android.content.Intent().putExtra("rawUrl", optString);
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.f159880p;
            putExtra = putExtra3.putExtra("appbrand_report_key_target_url", optString);
        }
        putExtra.putExtra("ad_info", jSONObject.optString("adInfo"));
        int optInt = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, -1);
        if (optInt > 0) {
            putExtra.putExtra("geta8key_scene", optInt);
        } else {
            putExtra.putExtra("geta8key_scene", 75);
        }
        putExtra.putExtra("geta8key_open_webview_appid", d0Var.mo48798x74292566());
        if (d0Var.t3() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) d0Var.t3();
            java.lang.String optString2 = jSONObject.optString("adUxInfo", null);
            if (android.text.TextUtils.isEmpty(optString2)) {
                if (o6Var.u0().V != null) {
                    optString2 = o6Var.u0().V.getString("adUxInfo");
                }
                qp3.a.c("AppBrandRuntime", "private_openUrl", optString2, "wechatTransitExtraData");
            } else {
                qp3.a.c("AppBrandRuntime", "private_openUrl", optString2, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
            }
            putExtra.putExtra("ad_ux_info_for_jsapi_pay", optString2);
            java.lang.String optString3 = jSONObject.optString("commonUxInfo");
            if (android.text.TextUtils.isEmpty(optString3)) {
                if (o6Var.u0().V != null) {
                    optString3 = o6Var.u0().V.getString("commonUxInfo");
                }
                qp3.a.d("AppBrandRuntime", "private_openUrl", optString3, "wechatTransitExtraData");
            } else {
                qp3.a.d("AppBrandRuntime", "private_openUrl", optString3, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
            }
            putExtra.putExtra("common_ux_info_for_jsapi_pay", optString3);
        }
        C(d0Var.mo50352x76847179(), putExtra, d0Var, i17);
    }

    public void C(android.content.Context context, android.content.Intent intent, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var, int i17) {
        if (context == null) {
            D(d0Var, i17, "fail");
        } else {
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            D(d0Var, i17, "ok");
        }
    }

    public final void D(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var, int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiPrivateOpenUrl", "switchCallback msg:%s", str);
        if (d0Var != null) {
            d0Var.a(i17, o(str));
        }
    }
}
