package com.tencent.mm.plugin.appbrand.jsapi.webview;

/* loaded from: classes7.dex */
public class d0 extends com.tencent.mm.plugin.appbrand.jsapi.webview.e0 {
    public static final int CTRL_INDEX = 1165;
    public static final java.lang.String NAME = "updateGameHTMLWebView";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.webview.e0, gb1.h
    public /* bridge */ /* synthetic */ boolean K(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        K((com.tencent.mm.plugin.appbrand.page.n7) tVar, i17, view, jSONObject);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.plugin.appbrand.jsapi.webview.e0
    /* renamed from: M */
    public boolean K(com.tencent.mm.plugin.appbrand.page.n7 n7Var, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        super.K(n7Var, i17, view, jSONObject);
        java.lang.String optString = jSONObject.optString("evaluateJavascript", "");
        if (!android.text.TextUtils.isEmpty(optString)) {
            of1.v0 v0Var = (of1.v0) ((of1.w1) ((com.tencent.mm.plugin.appbrand.jsapi.webview.o) view)).getController();
            v0Var.getClass();
            if (!(optString == null || optString.length() == 0)) {
                com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar = v0Var.W1;
                if (oVar == null) {
                    kotlin.jvm.internal.o.o("mView");
                    throw null;
                }
                com.tencent.mm.ui.widget.MMWebView webView = ((of1.w1) oVar).getWebView();
                if (webView != null) {
                    webView.evaluateJavascript(optString, new of1.e0(v0Var));
                }
            }
        }
        return true;
    }
}
