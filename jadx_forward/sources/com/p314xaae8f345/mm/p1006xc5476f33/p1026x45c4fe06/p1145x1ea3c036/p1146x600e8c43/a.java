package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1146x600e8c43;

/* loaded from: classes7.dex */
public class a implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r1 {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r1
    public void N(android.content.Context context, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.q1 q1Var) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.CustomizeExternalToolsHelper", "openWebViewActivity with empty url, stack:%s", android.util.Log.getStackTraceString(new java.lang.Throwable()));
            return;
        }
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        } else {
            android.app.Activity a17 = q75.a.a(context);
            if (a17 != null) {
                context = a17;
            }
        }
        android.content.Intent putExtra = new android.content.Intent().putExtra("rawUrl", str);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.f159880p;
        android.content.Intent putExtra2 = putExtra.putExtra("appbrand_report_key_target_url", str);
        putExtra2.putExtra("rawUrl", str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.CustomizeExternalToolsHelper", "orientation:%s", str2);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            putExtra2.putExtra("screen_orientation", str2.equals("landscape") ? 0 : str2.equals("portrait") ? 1 : str2.equals("auto") ? 4 : -1);
        }
        if (!(context instanceof android.app.Activity)) {
            putExtra2.addFlags(268435456);
        }
        if (q1Var != null) {
            putExtra2.putExtra("show_native_web_view", q1Var.f164381a);
            putExtra2.putExtra("KRightBtn", q1Var.f164382b);
            if (q1Var.f164383c instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) {
                putExtra2.putExtra("geta8key_scene", 76);
                putExtra2.putExtra("geta8key_open_webview_appid", q1Var.f164383c.mo48798x74292566());
            }
        }
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", putExtra2, null);
    }
}
