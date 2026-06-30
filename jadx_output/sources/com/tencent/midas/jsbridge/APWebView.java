package com.tencent.midas.jsbridge;

/* loaded from: classes13.dex */
public class APWebView {
    private static final java.lang.String TAG = "APWebView";
    private com.tencent.midas.jsbridge.IAPWebViewCallback callback;
    private android.app.Activity mContext;
    private android.webkit.WebView mWebview;
    private android.webkit.WebChromeClient mChromeClient = new android.webkit.WebChromeClient() { // from class: com.tencent.midas.jsbridge.APWebView.1
        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, android.webkit.JsResult jsResult) {
            com.tencent.midas.comm.APLog.e("inner onJsAlert message", str2);
            com.tencent.midas.comm.APLog.e(com.tencent.midas.jsbridge.APWebView.TAG, " url = " + str);
            com.tencent.midas.comm.APLog.e(com.tencent.midas.jsbridge.APWebView.TAG, " message = " + str2);
            if (com.tencent.midas.download.APMidasPluginDownloadUtils.handlePureH5UpdateJsAlertLogic(com.tencent.midas.jsbridge.APWebView.this.mContext, str2)) {
                com.tencent.midas.comm.APLog.d(com.tencent.midas.jsbridge.APWebView.TAG, "onJsAlert is pure h5 update! Cancel alert!");
                jsResult.cancel();
                return true;
            }
            com.tencent.midas.comm.APLog.d(com.tencent.midas.jsbridge.APWebView.TAG, "onJsAlert not pure h5 update!");
            if (com.tencent.midas.jsbridge.APWebProtocol.hookH5Method(com.tencent.midas.jsbridge.APWebView.this.mContext, com.tencent.midas.jsbridge.APWebView.this.mWebview, str, str2, jsResult, com.tencent.midas.jsbridge.APWebView.this.callback)) {
                com.tencent.midas.comm.APLog.d(com.tencent.midas.jsbridge.APWebView.TAG, "hookH5Method is processed");
                jsResult.cancel();
                return true;
            }
            if (com.tencent.midas.api.APMidasPayAPI.h5PayHook(com.tencent.midas.jsbridge.APWebView.this.mContext, com.tencent.midas.jsbridge.APWebView.this.mWebview, str, str2, jsResult) != 0) {
                return super.onJsAlert(webView, str, str2, jsResult);
            }
            com.tencent.midas.jsbridge.APWebView.this.callback.WebChromeClientJsAlert(webView, str, str2, jsResult);
            jsResult.cancel();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, java.lang.String str3, android.webkit.JsPromptResult jsPromptResult) {
            return com.tencent.midas.jsbridge.APWebView.this.callback.WebChromeClientJsPrompt(webView, str, str2, str3, jsPromptResult);
        }
    };
    private android.webkit.WebViewClient mWebViewClient = new android.webkit.WebViewClient() { // from class: com.tencent.midas.jsbridge.APWebView.2
        private byte _hellAccFlag_;

        @Override // android.webkit.WebViewClient
        public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
            super.onPageFinished(webView, str);
            com.tencent.midas.comm.APLog.d(com.tencent.midas.jsbridge.APWebView.TAG, "onPageFinished!");
            com.tencent.midas.comm.APLog.i("APWebView url == ", str);
            com.tencent.midas.jsbridge.APWebView.this.mWebview.setVisibility(0);
            com.tencent.midas.api.APMidasPayAPI.InnerH5PayInit(com.tencent.midas.jsbridge.APWebView.this.mContext, com.tencent.midas.jsbridge.APWebView.this.mWebview);
            com.tencent.midas.jsbridge.APWebView.this.callback.WebViewClientPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            com.tencent.midas.comm.APLog.d(com.tencent.midas.jsbridge.APWebView.TAG, "onPageStarted!");
            com.tencent.midas.jsbridge.APWebView.this.callback.WebViewClientPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(android.webkit.WebView webView, int i17, java.lang.String str, java.lang.String str2) {
            super.onReceivedError(webView, i17, str, str2);
            com.tencent.midas.comm.APLog.d(com.tencent.midas.jsbridge.APWebView.TAG, "onReceivedError!");
            com.tencent.midas.jsbridge.APWebView.this.callback.WebViewClientReceivedError(webView, i17, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
            com.tencent.midas.comm.APLog.d(com.tencent.midas.jsbridge.APWebView.TAG, "shouldOverrideUrlLoading url = " + str);
            if (!str.startsWith("http://unipay.sdk.android/?") && !str.startsWith("wsj://") && !str.startsWith("mqqapi://") && !str.startsWith("weixin://") && !str.startsWith("sms://")) {
                webView.loadUrl(str);
                com.tencent.midas.comm.APLog.d(com.tencent.midas.jsbridge.APWebView.TAG, "shouldOverrideUrlLoading loadUrl = ");
            }
            if (!str.startsWith("mqqapi://") && !str.startsWith("weixin://") && !str.startsWith("sms://")) {
                return true;
            }
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str));
            if (intent.resolveActivity(com.tencent.midas.jsbridge.APWebView.this.mContext.getPackageManager()) == null) {
                android.widget.Toast.makeText(com.tencent.midas.jsbridge.APWebView.this.mContext, "抱歉，你未安装相应客户端", 1).show();
                com.tencent.midas.comm.APLog.w(com.tencent.midas.jsbridge.APWebView.TAG, "shouldOverrideUrlLoading() intent.resolveActivity == Null ");
                return true;
            }
            android.content.Context context = webView.getContext();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/midas/jsbridge/APWebView$2", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/midas/jsbridge/APWebView$2", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    };

    public APWebView(android.app.Activity activity, android.webkit.WebView webView, com.tencent.midas.jsbridge.IAPWebViewCallback iAPWebViewCallback) {
        this.mWebview = null;
        this.mContext = null;
        this.callback = null;
        this.mContext = activity;
        this.mWebview = webView;
        this.callback = iAPWebViewCallback;
        InitWebView();
    }

    private void InitWebView() {
        android.webkit.WebSettings settings = this.mWebview.getSettings();
        settings.setJavaScriptEnabled(true);
        int i17 = android.os.Build.VERSION.SDK_INT;
        com.tencent.midas.api.APMidasPayAPI.env.equals("test");
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(true);
        if (i17 < 33) {
            settings.setAppCacheEnabled(true);
            settings.setAppCachePath(this.mContext.getApplicationContext().getDir("cache", 0).getPath());
        }
        settings.setCacheMode(-1);
        try {
            settings.setSavePassword(false);
        } catch (java.lang.Exception unused) {
        }
        this.mWebview.setScrollBarStyle(0);
        this.mWebview.setWebChromeClient(this.mChromeClient);
        this.mWebview.setWebViewClient(this.mWebViewClient);
        removeInterface();
    }

    private void removeInterface() {
        try {
            java.lang.reflect.Method method = this.mWebview.getClass().getMethod("removeJavascriptInterface", java.lang.String.class);
            if (method != null) {
                method.invoke(this.mWebview, "searchBoxJavaBridge_");
                method.invoke(this.mWebview, "accessibility");
                method.invoke(this.mWebview, "accessibilityTraversal");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.midas.comm.APLog.i("removeJavascriptInterface", e17.toString());
        }
    }

    public android.webkit.WebView getWebView() {
        return this.mWebview;
    }

    public void loadUrl(java.lang.String str) {
        this.mWebview.loadUrl(str);
    }
}
