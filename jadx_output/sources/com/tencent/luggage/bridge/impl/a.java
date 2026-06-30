package com.tencent.luggage.bridge.impl;

/* loaded from: classes8.dex */
public class a extends android.webkit.WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.bridge.impl.BridgedAndroidWebView f47199a;

    public a(com.tencent.luggage.bridge.impl.BridgedAndroidWebView bridgedAndroidWebView) {
        this.f47199a = bridgedAndroidWebView;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        ((od.n) this.f47199a.f47197d.f344519d).f344524a.a();
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        this.f47199a.f47197d.f344519d.getClass();
    }
}
