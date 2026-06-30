package com.tencent.midas.jsbridge;

/* loaded from: classes13.dex */
public interface IAPWebViewCallback {
    boolean WebChromeClientJsAlert(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, android.webkit.JsResult jsResult);

    boolean WebChromeClientJsPrompt(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, java.lang.String str3, android.webkit.JsPromptResult jsPromptResult);

    void WebViewClientPageFinished(android.webkit.WebView webView, java.lang.String str);

    void WebViewClientPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap);

    void WebViewClientReceivedError(android.webkit.WebView webView, int i17, java.lang.String str, java.lang.String str2);
}
