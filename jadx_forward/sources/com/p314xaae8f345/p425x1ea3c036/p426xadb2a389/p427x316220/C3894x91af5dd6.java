package com.p314xaae8f345.p425x1ea3c036.p426xadb2a389.p427x316220;

/* renamed from: com.tencent.luggage.bridge.impl.BridgedAndroidWebViewBase */
/* loaded from: classes8.dex */
public class C3894x91af5dd6 extends android.webkit.WebView implements od.p {
    public C3894x91af5dd6(android.content.Context context) {
        this(context, null);
    }

    public void a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BridgedAndroidWebViewBase", "Empty script");
        } else {
            super.evaluateJavascript(str, null);
        }
    }

    @Override // android.webkit.WebView, od.p
    /* renamed from: addJavascriptInterface */
    public void mo32257x74041feb(java.lang.Object obj, java.lang.String str) {
        mo32257x74041feb(obj, str);
    }

    @Override // android.webkit.WebView, od.p
    /* renamed from: evaluateJavascript */
    public void mo32260x738236e6(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        if (android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread()) {
            a(str);
        } else {
            post(new com.p314xaae8f345.p425x1ea3c036.p426xadb2a389.p427x316220.b(this, str));
        }
    }

    @Override // od.p
    /* renamed from: getUserAgent */
    public java.lang.String mo32054x11fd7f44() {
        return getSettings().getUserAgentString();
    }

    public C3894x91af5dd6(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C3894x91af5dd6(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        getSettings().setDomStorageEnabled(true);
        getSettings().setJavaScriptEnabled(true);
        android.webkit.WebView.setWebContentsDebuggingEnabled(true);
    }
}
