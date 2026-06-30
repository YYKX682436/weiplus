package com.tencent.luggage.bridge.impl;

/* loaded from: classes8.dex */
public class BridgedAndroidWebView extends com.tencent.luggage.bridge.impl.BridgedAndroidWebViewBase {

    /* renamed from: d, reason: collision with root package name */
    public final od.l f47197d;

    public BridgedAndroidWebView(android.content.Context context) {
        this(context, null);
    }

    public od.l getBridge() {
        return this.f47197d;
    }

    public BridgedAndroidWebView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BridgedAndroidWebView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        com.tencent.luggage.bridge.impl.a aVar = new com.tencent.luggage.bridge.impl.a(this);
        android.webkit.WebChromeClient webChromeClient = new android.webkit.WebChromeClient() { // from class: com.tencent.luggage.bridge.impl.BridgedAndroidWebView.2
            @Override // android.webkit.WebChromeClient
            public boolean onJsPrompt(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, java.lang.String str3, android.webkit.JsPromptResult jsPromptResult) {
                java.lang.String a17 = ((od.n) com.tencent.luggage.bridge.impl.BridgedAndroidWebView.this.f47197d.f344519d).a(str2);
                if (a17 == null) {
                    return false;
                }
                jsPromptResult.confirm(a17);
                return true;
            }
        };
        this.f47197d = new od.l(this);
        setWebViewClient(aVar);
        setWebChromeClient(webChromeClient);
    }
}
