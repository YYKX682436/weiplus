package com.tencent.mm.plugin.appbrand.jsapi.webview;

/* loaded from: classes7.dex */
public class e0 extends gb1.h {
    public static final int CTRL_INDEX = 300;
    public static final java.lang.String NAME = "updateHTMLWebView";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.getInt("htmlId");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gb1.h
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public boolean K(com.tencent.mm.plugin.appbrand.page.n7 n7Var, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        if (jSONObject.has("backgroundColor")) {
            try {
                view.setBackgroundColor(ik1.w.l(jSONObject.getString("backgroundColor")));
            } catch (java.lang.Exception unused) {
            }
        }
        if (jSONObject.has("adjustResizeOnKeyboardStateChanged")) {
            ((of1.w1) ((com.tencent.mm.plugin.appbrand.jsapi.webview.o) view)).setAdjustResizeOnKeyboardStateChanged(jSONObject.optBoolean("adjustResizeOnKeyboardStateChanged", true));
        }
        ((of1.w1) ((com.tencent.mm.plugin.appbrand.jsapi.webview.o) view)).setAudioMuted(jSONObject.optBoolean("muted", false));
        java.lang.String optString = jSONObject.optString("src", "");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiUpdateHTMLWebView", "onUpdateView appId[%s] viewId[%d] viewHash[%d] src[%s]", n7Var.getAppId(), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(view.hashCode()), optString);
        if (android.text.TextUtils.isEmpty(optString)) {
            return true;
        }
        of1.v0 v0Var = (of1.v0) ((of1.w1) ((com.tencent.mm.plugin.appbrand.jsapi.webview.o) view)).getController();
        v0Var.getClass();
        if (!(optString == null || optString.length() == 0)) {
            v0Var.f345028g2.b(optString);
        }
        return true;
    }
}
