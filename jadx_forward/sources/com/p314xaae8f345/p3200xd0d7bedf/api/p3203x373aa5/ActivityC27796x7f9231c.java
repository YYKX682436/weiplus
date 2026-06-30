package com.p314xaae8f345.p3200xd0d7bedf.api.p3203x373aa5;

/* renamed from: com.tencent.wework.api.view.H5Activity */
/* loaded from: classes13.dex */
public class ActivityC27796x7f9231c extends com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c {
    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent() == null || !getIntent().hasExtra("url")) {
            finish();
            return;
        }
        setContentView(com.p314xaae8f345.mm.R.C30864xbddafb2a.d_j);
        findViewById(com.p314xaae8f345.mm.R.id.f564846aa1).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.wework.api.view.H5Activity.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.p314xaae8f345.p3200xd0d7bedf.api.p3203x373aa5.ActivityC27796x7f9231c.this.finish();
            }
        });
        android.webkit.WebView webView = (android.webkit.WebView) findViewById(com.p314xaae8f345.mm.R.id.phw);
        webView.removeJavascriptInterface("searchBoxJavaBridge_");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setAllowFileAccessFromFileURLs(false);
        webView.getSettings().setAllowUniversalAccessFromFileURLs(false);
        webView.getSettings().setLayoutAlgorithm(android.webkit.WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setDatabaseEnabled(true);
        webView.getSettings().setGeolocationEnabled(true);
        webView.getSettings().setSupportMultipleWindows(false);
        webView.getSettings().setSavePassword(false);
        webView.setDownloadListener(new android.webkit.DownloadListener() { // from class: com.tencent.wework.api.view.H5Activity.2
            @Override // android.webkit.DownloadListener
            public void onDownloadStart(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j17) {
                try {
                    android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str));
                    com.p314xaae8f345.p3200xd0d7bedf.api.p3203x373aa5.ActivityC27796x7f9231c activityC27796x7f9231c = com.p314xaae8f345.p3200xd0d7bedf.api.p3203x373aa5.ActivityC27796x7f9231c.this;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(activityC27796x7f9231c, arrayList.toArray(), "com/tencent/wework/api/view/H5Activity$2", "onDownloadStart", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activityC27796x7f9231c.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(activityC27796x7f9231c, "com/tencent/wework/api/view/H5Activity$2", "onDownloadStart", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } catch (java.lang.Throwable unused) {
                }
            }
        });
        webView.setWebChromeClient(new android.webkit.WebChromeClient() { // from class: com.tencent.wework.api.view.H5Activity.3
            @Override // android.webkit.WebChromeClient
            public boolean onJsPrompt(android.webkit.WebView webView2, java.lang.String str, java.lang.String str2, java.lang.String str3, android.webkit.JsPromptResult jsPromptResult) {
                return super.onJsPrompt(webView2, str, str2, str3, jsPromptResult);
            }

            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(android.webkit.WebView webView2, int i17) {
                super.onProgressChanged(webView2, i17);
            }

            @Override // android.webkit.WebChromeClient
            public void onReceivedIcon(android.webkit.WebView webView2, android.graphics.Bitmap bitmap) {
                super.onReceivedIcon(webView2, bitmap);
            }

            @Override // android.webkit.WebChromeClient
            public void onReceivedTitle(android.webkit.WebView webView2, java.lang.String str) {
                super.onReceivedTitle(webView2, str);
                ((android.widget.TextView) com.p314xaae8f345.p3200xd0d7bedf.api.p3203x373aa5.ActivityC27796x7f9231c.this.findViewById(com.p314xaae8f345.mm.R.id.obc)).setText(str);
            }
        });
        webView.setWebViewClient(new android.webkit.WebViewClient() { // from class: com.tencent.wework.api.view.H5Activity.4
            @Override // android.webkit.WebViewClient
            public void onPageFinished(android.webkit.WebView webView2, java.lang.String str) {
            }

            @Override // android.webkit.WebViewClient
            public void onPageStarted(android.webkit.WebView webView2, java.lang.String str, android.graphics.Bitmap bitmap) {
                super.onPageStarted(webView2, str, bitmap);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(android.webkit.WebView webView2, int i17, java.lang.String str, java.lang.String str2) {
                super.onReceivedError(webView2, i17, str, str2);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedHttpAuthRequest(android.webkit.WebView webView2, android.webkit.HttpAuthHandler httpAuthHandler, java.lang.String str, java.lang.String str2) {
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedSslError(android.webkit.WebView webView2, android.webkit.SslErrorHandler sslErrorHandler, android.net.http.SslError sslError) {
                super.onReceivedSslError(webView2, sslErrorHandler, sslError);
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(android.webkit.WebView webView2, java.lang.String str) {
                try {
                    if (!android.net.Uri.parse(str).getScheme().toLowerCase().contains("http")) {
                        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str));
                        com.p314xaae8f345.p3200xd0d7bedf.api.p3203x373aa5.ActivityC27796x7f9231c activityC27796x7f9231c = com.p314xaae8f345.p3200xd0d7bedf.api.p3203x373aa5.ActivityC27796x7f9231c.this;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(intent);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(activityC27796x7f9231c, arrayList.toArray(), "com/tencent/wework/api/view/H5Activity$4", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        activityC27796x7f9231c.startActivity((android.content.Intent) arrayList.get(0));
                        yj0.a.f(activityC27796x7f9231c, "com/tencent/wework/api/view/H5Activity$4", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        return true;
                    }
                } catch (java.lang.Throwable unused) {
                }
                return super.shouldOverrideUrlLoading(webView2, str);
            }
        });
        webView.loadUrl(getIntent().getStringExtra("url"));
    }
}
