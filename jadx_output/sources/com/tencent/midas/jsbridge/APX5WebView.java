package com.tencent.midas.jsbridge;

/* loaded from: classes13.dex */
public class APX5WebView {
    private static final java.lang.String TAG = "APX5WebView";
    private com.tencent.midas.jsbridge.IAPX5WebViewCallback callback;
    private android.app.Activity mContext;
    private com.tencent.smtt.sdk.WebView mWebview;
    private com.tencent.smtt.sdk.WebChromeClient mChromeClient = new com.tencent.smtt.sdk.WebChromeClient() { // from class: com.tencent.midas.jsbridge.APX5WebView.1
        public boolean onJsAlert(com.tencent.smtt.sdk.WebView webView, java.lang.String str, java.lang.String str2, com.tencent.smtt.export.external.interfaces.JsResult jsResult) {
            com.tencent.midas.comm.APLog.e("inner onJsAlert message", str2);
            com.tencent.midas.comm.APLog.e(com.tencent.midas.jsbridge.APX5WebView.TAG, " url = " + str);
            com.tencent.midas.comm.APLog.e(com.tencent.midas.jsbridge.APX5WebView.TAG, " message = " + str2);
            if (com.tencent.midas.download.APMidasPluginDownloadUtils.handlePureH5UpdateJsAlertLogic(com.tencent.midas.jsbridge.APX5WebView.this.mContext, str2)) {
                com.tencent.midas.comm.APLog.d(com.tencent.midas.jsbridge.APX5WebView.TAG, "onJsAlert is pure h5 update! Cancel alert!");
                jsResult.cancel();
                return true;
            }
            com.tencent.midas.comm.APLog.d(com.tencent.midas.jsbridge.APX5WebView.TAG, "onJsAlert not pure h5 update!");
            if (com.tencent.midas.jsbridge.APWebProtocol.hookH5Method(com.tencent.midas.jsbridge.APX5WebView.this.mContext, com.tencent.midas.jsbridge.APX5WebView.this.mWebview, str, str2, jsResult, com.tencent.midas.jsbridge.APX5WebView.this.callback)) {
                com.tencent.midas.comm.APLog.d(com.tencent.midas.jsbridge.APX5WebView.TAG, "hookH5Method is processed");
                jsResult.cancel();
                return true;
            }
            if (com.tencent.midas.api.APMidasPayAPI.h5PayHookX5(com.tencent.midas.jsbridge.APX5WebView.this.mContext, com.tencent.midas.jsbridge.APX5WebView.this.mWebview, str, str2, jsResult) != 0) {
                return super.onJsAlert(webView, str, str2, jsResult);
            }
            com.tencent.midas.jsbridge.APX5WebView.this.callback.WebChromeClientJsAlert(webView, str, str2, jsResult);
            jsResult.cancel();
            return true;
        }

        public boolean onJsPrompt(com.tencent.smtt.sdk.WebView webView, java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.smtt.export.external.interfaces.JsPromptResult jsPromptResult) {
            return com.tencent.midas.jsbridge.APX5WebView.this.callback.WebChromeClientJsPrompt(webView, str, str2, str3, jsPromptResult);
        }
    };
    private com.tencent.smtt.sdk.WebViewClient mWebViewClient = new com.tencent.smtt.sdk.WebViewClient() { // from class: com.tencent.midas.jsbridge.APX5WebView.2
        private byte _hellAccFlag_;

        public void onPageFinished(com.tencent.smtt.sdk.WebView webView, java.lang.String str) {
            super.onPageFinished(webView, str);
            com.tencent.midas.comm.APLog.d(com.tencent.midas.jsbridge.APX5WebView.TAG, "onPageFinished!");
            com.tencent.midas.comm.APLog.i("APWebView url == ", str);
            com.tencent.midas.jsbridge.APX5WebView.this.mWebview.setVisibility(0);
            com.tencent.midas.api.APMidasPayAPI.InnerH5PayInitX5(com.tencent.midas.jsbridge.APX5WebView.this.mContext, com.tencent.midas.jsbridge.APX5WebView.this.mWebview);
            com.tencent.midas.jsbridge.APX5WebView.this.callback.WebViewClientPageFinished(webView, str);
        }

        public void onPageStarted(com.tencent.smtt.sdk.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            com.tencent.midas.comm.APLog.d(com.tencent.midas.jsbridge.APX5WebView.TAG, "onPageStarted!");
            com.tencent.midas.jsbridge.APX5WebView.this.callback.WebViewClientPageStarted(webView, str, bitmap);
        }

        public void onReceivedError(com.tencent.smtt.sdk.WebView webView, int i17, java.lang.String str, java.lang.String str2) {
            super.onReceivedError(webView, i17, str, str2);
            com.tencent.midas.comm.APLog.d(com.tencent.midas.jsbridge.APX5WebView.TAG, "onReceivedError!");
            com.tencent.midas.jsbridge.APX5WebView.this.callback.WebViewClientReceivedError(webView, i17, str, str2);
        }

        public boolean shouldOverrideUrlLoading(com.tencent.smtt.sdk.WebView webView, java.lang.String str) {
            com.tencent.midas.comm.APLog.d(com.tencent.midas.jsbridge.APX5WebView.TAG, "shouldOverrideUrlLoading url = " + str);
            if (!str.startsWith("http://unipay.sdk.android/?") && !str.startsWith("wsj://") && !str.startsWith("mqqapi://") && !str.startsWith("weixin://") && !str.startsWith("sms://")) {
                webView.loadUrl(str);
                com.tencent.midas.comm.APLog.d(com.tencent.midas.jsbridge.APX5WebView.TAG, "shouldOverrideUrlLoading loadUrl = ");
            }
            if (!str.startsWith("mqqapi://") && !str.startsWith("weixin://") && !str.startsWith("sms://")) {
                return true;
            }
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str));
            if (intent.resolveActivity(com.tencent.midas.jsbridge.APX5WebView.this.mContext.getPackageManager()) == null) {
                android.widget.Toast.makeText(com.tencent.midas.jsbridge.APX5WebView.this.mContext, "抱歉，你未安装相应客户端", 1).show();
                com.tencent.midas.comm.APLog.w(com.tencent.midas.jsbridge.APX5WebView.TAG, "shouldOverrideUrlLoading() intent.resolveActivity == Null ");
                return true;
            }
            android.content.Context context = webView.getContext();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/midas/jsbridge/APX5WebView$2", "shouldOverrideUrlLoading", "(Lcom/tencent/smtt/sdk/WebView;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/midas/jsbridge/APX5WebView$2", "shouldOverrideUrlLoading", "(Lcom/tencent/smtt/sdk/WebView;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    };

    public APX5WebView(android.app.Activity activity, com.tencent.smtt.sdk.WebView webView, com.tencent.midas.jsbridge.IAPX5WebViewCallback iAPX5WebViewCallback) {
        this.mWebview = null;
        this.mContext = null;
        this.callback = null;
        this.mContext = activity;
        this.mWebview = webView;
        this.callback = iAPX5WebViewCallback;
        InitWebView();
    }

    private void InitWebView() {
        com.tencent.smtt.sdk.WebSettings settings = this.mWebview.getSettings();
        settings.setJavaScriptEnabled(true);
        com.tencent.midas.api.APMidasPayAPI.env.equals("test");
        settings.setDomStorageEnabled(true);
        settings.setAppCachePath(this.mContext.getApplicationContext().getDir("cache", 0).getPath());
        settings.setAllowFileAccess(true);
        settings.setAppCacheEnabled(true);
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

    public com.tencent.smtt.sdk.WebView getWebView() {
        return this.mWebview;
    }

    public void loadUrl(java.lang.String str) {
        this.mWebview.loadUrl(str);
    }
}
