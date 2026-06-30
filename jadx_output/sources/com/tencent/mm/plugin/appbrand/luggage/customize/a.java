package com.tencent.mm.plugin.appbrand.luggage.customize;

/* loaded from: classes7.dex */
public class a implements com.tencent.mm.plugin.appbrand.jsapi.r1 {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.r1
    public void N(android.content.Context context, java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.appbrand.jsapi.q1 q1Var) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.CustomizeExternalToolsHelper", "openWebViewActivity with empty url, stack:%s", android.util.Log.getStackTraceString(new java.lang.Throwable()));
            return;
        }
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        } else {
            android.app.Activity a17 = q75.a.a(context);
            if (a17 != null) {
                context = a17;
            }
        }
        android.content.Intent putExtra = new android.content.Intent().putExtra("rawUrl", str);
        int i17 = com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.f78347p;
        android.content.Intent putExtra2 = putExtra.putExtra("appbrand_report_key_target_url", str);
        putExtra2.putExtra("rawUrl", str);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CustomizeExternalToolsHelper", "orientation:%s", str2);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            putExtra2.putExtra("screen_orientation", str2.equals("landscape") ? 0 : str2.equals("portrait") ? 1 : str2.equals("auto") ? 4 : -1);
        }
        if (!(context instanceof android.app.Activity)) {
            putExtra2.addFlags(268435456);
        }
        if (q1Var != null) {
            putExtra2.putExtra("show_native_web_view", q1Var.f82848a);
            putExtra2.putExtra("KRightBtn", q1Var.f82849b);
            if (q1Var.f82850c instanceof com.tencent.mm.plugin.appbrand.y) {
                putExtra2.putExtra("geta8key_scene", 76);
                putExtra2.putExtra("geta8key_open_webview_appid", q1Var.f82850c.getAppId());
            }
        }
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", putExtra2, null);
    }
}
