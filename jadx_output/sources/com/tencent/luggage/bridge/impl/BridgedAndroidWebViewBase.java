package com.tencent.luggage.bridge.impl;

/* loaded from: classes8.dex */
public class BridgedAndroidWebViewBase extends android.webkit.WebView implements od.p {
    public BridgedAndroidWebViewBase(android.content.Context context) {
        this(context, null);
    }

    public void a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e("BridgedAndroidWebViewBase", "Empty script");
        } else {
            super.evaluateJavascript(str, null);
        }
    }

    @Override // android.webkit.WebView, od.p
    public void addJavascriptInterface(java.lang.Object obj, java.lang.String str) {
        addJavascriptInterface(obj, str);
    }

    @Override // android.webkit.WebView, od.p
    public void evaluateJavascript(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        if (android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread()) {
            a(str);
        } else {
            post(new com.tencent.luggage.bridge.impl.b(this, str));
        }
    }

    @Override // od.p
    public java.lang.String getUserAgent() {
        return getSettings().getUserAgentString();
    }

    public BridgedAndroidWebViewBase(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BridgedAndroidWebViewBase(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        getSettings().setDomStorageEnabled(true);
        getSettings().setJavaScriptEnabled(true);
        android.webkit.WebView.setWebContentsDebuggingEnabled(true);
    }
}
