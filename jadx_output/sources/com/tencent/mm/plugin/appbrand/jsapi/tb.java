package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public class tb extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 406;
    public static final java.lang.String NAME = "private_openUrl";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        android.content.Intent putExtra;
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = (com.tencent.mm.plugin.appbrand.jsapi.d0) lVar;
        java.lang.String optString = jSONObject.optString("url");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            D(d0Var, i17, "fail");
            return;
        }
        boolean optBoolean = jSONObject.optBoolean("isNativeStyle", false);
        if (optBoolean) {
            android.content.Intent putExtra2 = new android.content.Intent().putExtra("rawUrl", optString);
            int i18 = com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.f78347p;
            putExtra = putExtra2.putExtra("appbrand_report_key_target_url", optString).putExtra("open_custom_style_url", optBoolean).putExtra("forceHideShare", true).putExtra("status_bar_style", "black");
        } else {
            android.content.Intent putExtra3 = new android.content.Intent().putExtra("rawUrl", optString);
            int i19 = com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.f78347p;
            putExtra = putExtra3.putExtra("appbrand_report_key_target_url", optString);
        }
        putExtra.putExtra("ad_info", jSONObject.optString("adInfo"));
        int optInt = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, -1);
        if (optInt > 0) {
            putExtra.putExtra("geta8key_scene", optInt);
        } else {
            putExtra.putExtra("geta8key_scene", 75);
        }
        putExtra.putExtra("geta8key_open_webview_appid", d0Var.getAppId());
        if (d0Var.t3() instanceof com.tencent.mm.plugin.appbrand.o6) {
            com.tencent.mm.plugin.appbrand.o6 o6Var = (com.tencent.mm.plugin.appbrand.o6) d0Var.t3();
            java.lang.String optString2 = jSONObject.optString("adUxInfo", null);
            if (android.text.TextUtils.isEmpty(optString2)) {
                if (o6Var.u0().V != null) {
                    optString2 = o6Var.u0().V.getString("adUxInfo");
                }
                qp3.a.c("AppBrandRuntime", "private_openUrl", optString2, "wechatTransitExtraData");
            } else {
                qp3.a.c("AppBrandRuntime", "private_openUrl", optString2, com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
            }
            putExtra.putExtra("ad_ux_info_for_jsapi_pay", optString2);
            java.lang.String optString3 = jSONObject.optString("commonUxInfo");
            if (android.text.TextUtils.isEmpty(optString3)) {
                if (o6Var.u0().V != null) {
                    optString3 = o6Var.u0().V.getString("commonUxInfo");
                }
                qp3.a.d("AppBrandRuntime", "private_openUrl", optString3, "wechatTransitExtraData");
            } else {
                qp3.a.d("AppBrandRuntime", "private_openUrl", optString3, com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
            }
            putExtra.putExtra("common_ux_info_for_jsapi_pay", optString3);
        }
        C(d0Var.getContext(), putExtra, d0Var, i17);
    }

    public void C(android.content.Context context, android.content.Intent intent, com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, int i17) {
        if (context == null) {
            D(d0Var, i17, "fail");
        } else {
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            D(d0Var, i17, "ok");
        }
    }

    public final void D(com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiPrivateOpenUrl", "switchCallback msg:%s", str);
        if (d0Var != null) {
            d0Var.a(i17, o(str));
        }
    }
}
