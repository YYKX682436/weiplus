package org.p3343x72743996.p3360x5ff5cf14;

/* renamed from: org.chromium.support_lib_boundary.WebViewClientBoundaryInterface */
/* loaded from: classes13.dex */
public interface InterfaceC29672x58bdd76b extends org.p3343x72743996.p3360x5ff5cf14.InterfaceC29648xe93d3221 {
    void onPageCommitVisible(android.webkit.WebView webView, java.lang.String str);

    /* renamed from: onReceivedError */
    void mo8351xa740e108(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, java.lang.reflect.InvocationHandler invocationHandler);

    void onReceivedHttpError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse);

    /* renamed from: onSafeBrowsingHit */
    void mo8353xeaa637a0(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, int i17, java.lang.reflect.InvocationHandler invocationHandler);

    /* renamed from: onWebAuthnIntent */
    boolean mo8355x4c7b75cd(android.webkit.WebView webView, android.app.PendingIntent pendingIntent, java.lang.reflect.InvocationHandler invocationHandler);

    boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest);
}
