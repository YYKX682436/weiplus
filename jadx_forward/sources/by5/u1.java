package by5;

/* loaded from: classes13.dex */
public class u1 implements qx5.j {
    @Override // qx5.j
    public qx5.a a(android.content.Context context, android.net.Uri uri, qx5.l lVar) {
        java.lang.String queryParameter = uri.getQueryParameter("mm_webview_mode");
        by5.z e17 = by5.a0.e(queryParameter);
        if (!e17.f118148a) {
            by5.c4.g("XWebCommandHandler", "handleCommand, set mm webview mode error, config:" + queryParameter);
            return qx5.a.a();
        }
        int b17 = e17.b();
        com.p314xaae8f345.p3210x3857dc.u0 u0Var = com.p314xaae8f345.p3210x3857dc.t0.f302127a;
        if (b17 < 0 || b17 >= com.p314xaae8f345.p3210x3857dc.z2.m120531xcee59d22().length) {
            by5.c4.g("WebDebugCfg", "setWebViewModeForMM, clear mm webview mode");
            by5.d4.e().edit().remove("WebViewModeForMM").commit();
        } else {
            com.p314xaae8f345.p3210x3857dc.z2 z2Var = com.p314xaae8f345.p3210x3857dc.z2.m120531xcee59d22()[b17];
            by5.c4.g("WebDebugCfg", "setWebViewModeForMM, set mm webview mode:" + z2Var);
            if (z2Var != null) {
                by5.d4.e().edit().putInt("WebViewModeForMM", z2Var.ordinal()).commit();
            }
        }
        return new qx5.a(true, true);
    }
}
