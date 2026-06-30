package com.tencent.mm.plugin.appbrand.jsapi.webview;

/* loaded from: classes7.dex */
public interface o extends ni1.f, gb1.l {
    @Override // gb1.l
    default void d(org.json.JSONObject jSONObject) {
        try {
            jSONObject.put("webviewId", hashCode());
        } catch (org.json.JSONException unused) {
        }
    }

    android.view.View getAndroidView();

    java.lang.String getCurrentUrl();

    com.tencent.mm.ui.widget.MMWebView getWebView();

    boolean post(java.lang.Runnable runnable);

    void setAndroidViewId(int i17);

    void setAudioMuted(boolean z17);

    void setBizDomainList(java.util.ArrayList arrayList);
}
