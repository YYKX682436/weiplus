package com.p314xaae8f345.p425x1ea3c036.p426xadb2a389.p427x316220;

/* renamed from: com.tencent.luggage.bridge.impl.BridgedAndroidWebView */
/* loaded from: classes8.dex */
public class C3893x36d71d65 extends com.p314xaae8f345.p425x1ea3c036.p426xadb2a389.p427x316220.C3894x91af5dd6 {

    /* renamed from: d, reason: collision with root package name */
    public final od.l f128730d;

    public C3893x36d71d65(android.content.Context context) {
        this(context, null);
    }

    /* renamed from: getBridge */
    public od.l m32053x12c9c67f() {
        return this.f128730d;
    }

    public C3893x36d71d65(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C3893x36d71d65(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        com.p314xaae8f345.p425x1ea3c036.p426xadb2a389.p427x316220.a aVar = new com.p314xaae8f345.p425x1ea3c036.p426xadb2a389.p427x316220.a(this);
        android.webkit.WebChromeClient webChromeClient = new android.webkit.WebChromeClient() { // from class: com.tencent.luggage.bridge.impl.BridgedAndroidWebView.2
            @Override // android.webkit.WebChromeClient
            public boolean onJsPrompt(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, java.lang.String str3, android.webkit.JsPromptResult jsPromptResult) {
                java.lang.String a17 = ((od.n) com.p314xaae8f345.p425x1ea3c036.p426xadb2a389.p427x316220.C3893x36d71d65.this.f128730d.f426052d).a(str2);
                if (a17 == null) {
                    return false;
                }
                jsPromptResult.confirm(a17);
                return true;
            }
        };
        this.f128730d = new od.l(this);
        setWebViewClient(aVar);
        setWebChromeClient(webChromeClient);
    }
}
