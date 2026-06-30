package com.tencent.midas.jsbridge;

/* loaded from: classes13.dex */
public interface IAPX5WebViewCallback {
    boolean WebChromeClientJsAlert(com.tencent.smtt.sdk.WebView webView, java.lang.String str, java.lang.String str2, com.tencent.smtt.export.external.interfaces.JsResult jsResult);

    boolean WebChromeClientJsPrompt(com.tencent.smtt.sdk.WebView webView, java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.smtt.export.external.interfaces.JsPromptResult jsPromptResult);

    void WebViewClientPageFinished(com.tencent.smtt.sdk.WebView webView, java.lang.String str);

    void WebViewClientPageStarted(com.tencent.smtt.sdk.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap);

    void WebViewClientReceivedError(com.tencent.smtt.sdk.WebView webView, int i17, java.lang.String str, java.lang.String str2);
}
