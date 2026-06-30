package com.tencent.midas.jsbridge;

/* loaded from: classes13.dex */
public class APSystemWebPage implements com.tencent.midas.jsbridge.IAPWebPage {
    private static final int HEADER_BACK = 1;
    private static final int HEADER_CLOSE = 2;
    private static final int HEADER_REFRESH = 4;
    private static final java.lang.String TAG = "APSystemWebPage";
    private android.app.Activity activity;
    private com.tencent.midas.comm.APProgressDialog waitDialog;
    private com.tencent.midas.jsbridge.APWebView webView;
    private com.tencent.midas.jsbridge.IAPWebViewCallback webviewCallback = new com.tencent.midas.jsbridge.IAPWebViewCallback() { // from class: com.tencent.midas.jsbridge.APSystemWebPage.1
        @Override // com.tencent.midas.jsbridge.IAPWebViewCallback
        public boolean WebChromeClientJsAlert(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, android.webkit.JsResult jsResult) {
            com.tencent.midas.comm.APLog.d(com.tencent.midas.jsbridge.APSystemWebPage.TAG, "WebChromeClientJsAlert message=" + str2);
            com.tencent.midas.jsbridge.APWebProtocol.AnalyzeWebEntry(com.tencent.midas.jsbridge.APSystemWebPage.this.activity, com.tencent.midas.jsbridge.APSystemWebPage.this.webView.getWebView(), com.tencent.midas.jsbridge.APSystemWebPage.this, str2);
            return true;
        }

        @Override // com.tencent.midas.jsbridge.IAPWebViewCallback
        public boolean WebChromeClientJsPrompt(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, java.lang.String str3, android.webkit.JsPromptResult jsPromptResult) {
            return true;
        }

        @Override // com.tencent.midas.jsbridge.IAPWebViewCallback
        public void WebViewClientPageFinished(android.webkit.WebView webView, java.lang.String str) {
            try {
                if (com.tencent.midas.jsbridge.APSystemWebPage.this.activity.isFinishing() || com.tencent.midas.jsbridge.APSystemWebPage.this.waitDialog == null || !com.tencent.midas.jsbridge.APSystemWebPage.this.waitDialog.isShowing()) {
                    return;
                }
                com.tencent.midas.jsbridge.APSystemWebPage.this.waitDialog.dismiss();
            } catch (java.lang.Throwable unused) {
            }
        }

        @Override // com.tencent.midas.jsbridge.IAPWebViewCallback
        public void WebViewClientPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
            try {
                if (com.tencent.midas.jsbridge.APSystemWebPage.this.activity.isFinishing() || com.tencent.midas.jsbridge.APSystemWebPage.this.waitDialog == null) {
                    return;
                }
                com.tencent.midas.jsbridge.APSystemWebPage.this.waitDialog.show();
            } catch (java.lang.Throwable unused) {
            }
        }

        @Override // com.tencent.midas.jsbridge.IAPWebViewCallback
        public void WebViewClientReceivedError(android.webkit.WebView webView, int i17, java.lang.String str, java.lang.String str2) {
            if (com.tencent.midas.jsbridge.APSystemWebPage.this.activity.isFinishing() || com.tencent.midas.jsbridge.APSystemWebPage.this.waitDialog == null || !com.tencent.midas.jsbridge.APSystemWebPage.this.waitDialog.isShowing()) {
                return;
            }
            com.tencent.midas.jsbridge.APSystemWebPage.this.waitDialog.dismiss();
        }
    };

    public com.tencent.midas.comm.APProgressDialog createDialog() {
        com.tencent.midas.comm.APProgressDialog aPProgressDialog = new com.tencent.midas.comm.APProgressDialog(this.activity);
        aPProgressDialog.setMessage("请稍候...");
        return aPProgressDialog;
    }

    @Override // com.tencent.midas.jsbridge.IAPWebPage
    public void initHead(final android.app.Activity activity, java.lang.String str, java.lang.String str2) {
        int i17;
        try {
            com.tencent.midas.data.APPluginReportManager.getInstance().insertData(com.tencent.midas.data.APPluginDataInterface.singleton().getLaunchInterface(), com.tencent.midas.data.APPluginReportManager.MIDASPLUGIN_WEBPAGE_HEAD_INIT, "", "headControl=" + str + "&headTitle=" + str2);
            try {
                i17 = java.lang.Integer.valueOf(str).intValue();
            } catch (java.lang.Exception unused) {
                i17 = 0;
            }
            if (!android.text.TextUtils.isEmpty(str2)) {
                str2 = ub.b.e(str2, 1);
            }
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) activity.findViewById(ub.a.c(activity, "midas_header_layout"));
            if (i17 <= 0 && android.text.TextUtils.isEmpty(str2)) {
                linearLayout.setVisibility(8);
                return;
            }
            linearLayout.setVisibility(0);
            android.widget.TextView textView = (android.widget.TextView) activity.findViewById(ub.a.c(activity, "midas_header_title"));
            if (android.text.TextUtils.isEmpty(str2)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(str2);
            }
            android.widget.ImageButton imageButton = (android.widget.ImageButton) activity.findViewById(ub.a.c(activity, "midas_header_back"));
            if ((i17 & 1) == 1) {
                imageButton.setVisibility(0);
                imageButton.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.midas.jsbridge.APSystemWebPage.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(android.view.View view) {
                        com.tencent.midas.comm.APLog.d(com.tencent.midas.jsbridge.APSystemWebPage.TAG, "backBtn() clicked");
                        boolean z17 = (com.tencent.midas.jsbridge.APSystemWebPage.this.webView == null || com.tencent.midas.jsbridge.APSystemWebPage.this.webView.getWebView() == null) ? false : true;
                        com.tencent.midas.data.APPluginReportManager.getInstance().insertData(com.tencent.midas.data.APPluginDataInterface.singleton().getLaunchInterface(), com.tencent.midas.data.APPluginReportManager.MIDASPLUGIN_WEBPAGE_BACK, "", "webviewNotNull=" + z17);
                        if (z17 && com.tencent.midas.jsbridge.APSystemWebPage.this.webView.getWebView().canGoBack()) {
                            com.tencent.midas.jsbridge.APSystemWebPage.this.webView.getWebView().goBack();
                        }
                    }
                });
            } else {
                imageButton.setVisibility(8);
            }
            android.widget.ImageButton imageButton2 = (android.widget.ImageButton) activity.findViewById(ub.a.c(activity, "midas_header_close"));
            if ((i17 & 2) == 2) {
                imageButton2.setVisibility(0);
                imageButton2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.midas.jsbridge.APSystemWebPage.5
                    @Override // android.view.View.OnClickListener
                    public void onClick(android.view.View view) {
                        com.tencent.midas.comm.APLog.d(com.tencent.midas.jsbridge.APSystemWebPage.TAG, "closeBtn() clicked");
                        com.tencent.midas.data.APPluginReportManager.getInstance().insertData(com.tencent.midas.data.APPluginDataInterface.singleton().getLaunchInterface(), com.tencent.midas.data.APPluginReportManager.MIDASPLUGIN_WEBPAGE_CLOSE, "", "");
                        com.tencent.midas.api.APMidasResponse aPMidasResponse = new com.tencent.midas.api.APMidasResponse();
                        aPMidasResponse.resultCode = 100;
                        aPMidasResponse.resultMsg = "关闭";
                        com.tencent.midas.control.APMidasPayHelper.midasCallBack(aPMidasResponse);
                        activity.finish();
                    }
                });
            } else {
                imageButton2.setVisibility(8);
            }
            android.widget.ImageButton imageButton3 = (android.widget.ImageButton) activity.findViewById(ub.a.c(activity, "midas_header_refresh"));
            if ((i17 & 4) != 4) {
                imageButton3.setVisibility(8);
            } else {
                imageButton3.setVisibility(0);
                imageButton3.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.midas.jsbridge.APSystemWebPage.6
                    @Override // android.view.View.OnClickListener
                    public void onClick(android.view.View view) {
                        com.tencent.midas.comm.APLog.d(com.tencent.midas.jsbridge.APSystemWebPage.TAG, "refreshBtn() clicked");
                        com.tencent.midas.data.APPluginReportManager.getInstance().insertData(com.tencent.midas.data.APPluginDataInterface.singleton().getLaunchInterface(), com.tencent.midas.data.APPluginReportManager.MIDASPLUGIN_WEBPAGE_REFRESH, "", "");
                        if (com.tencent.midas.jsbridge.APSystemWebPage.this.webView == null || com.tencent.midas.jsbridge.APSystemWebPage.this.webView.getWebView() == null) {
                            return;
                        }
                        com.tencent.midas.jsbridge.APSystemWebPage.this.webView.getWebView().reload();
                    }
                });
            }
        } catch (java.lang.Throwable unused2) {
        }
    }

    @Override // com.tencent.midas.jsbridge.IAPWebPage
    public void initUI(android.app.Activity activity) {
        this.activity = activity;
        activity.setContentView(ub.a.d(activity, "unipay_layout_activity_web"));
        android.webkit.WebView webView = (android.webkit.WebView) activity.findViewById(ub.a.c(activity, "unipay_id_WebView"));
        this.webView = new com.tencent.midas.jsbridge.APWebView(activity, webView, this.webviewCallback);
        com.tencent.midas.comm.APProgressDialog createDialog = createDialog();
        this.waitDialog = createDialog;
        createDialog.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() { // from class: com.tencent.midas.jsbridge.APSystemWebPage.2
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(android.content.DialogInterface dialogInterface) {
            }
        });
        android.view.ViewParent parent = webView.getParent();
        if (parent == null || !(parent instanceof android.view.ViewGroup)) {
            return;
        }
        ((android.view.ViewGroup) parent).setFitsSystemWindows(true);
    }

    @Override // com.tencent.midas.jsbridge.IAPWebPage
    public void loadUrl(java.lang.String str) {
        this.webView.loadUrl(str);
    }

    @Override // com.tencent.midas.jsbridge.IAPWebPage
    public void toPureH5Pay(android.app.Activity activity, com.tencent.midas.api.request.APMidasBaseRequest aPMidasBaseRequest) {
        this.activity = activity;
        activity.setContentView(ub.a.d(activity, "unipay_layout_activity_web"));
        android.webkit.WebView webView = (android.webkit.WebView) activity.findViewById(ub.a.c(activity, "unipay_id_WebView"));
        activity.getWindowManager().getDefaultDisplay().getMetrics(new android.util.DisplayMetrics());
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) webView.getLayoutParams();
        layoutParams.width = (int) (r0.widthPixels * 0.85f);
        layoutParams.height = (int) (r0.heightPixels * 0.85f);
        layoutParams.gravity = 17;
        webView.setLayoutParams(layoutParams);
        this.webView = new com.tencent.midas.jsbridge.APWebView(activity, webView, this.webviewCallback);
        com.tencent.midas.comm.APProgressDialog createDialog = createDialog();
        this.waitDialog = createDialog;
        createDialog.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() { // from class: com.tencent.midas.jsbridge.APSystemWebPage.3
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(android.content.DialogInterface dialogInterface) {
            }
        });
        android.view.ViewParent parent = webView.getParent();
        if (parent == null || !(parent instanceof android.view.ViewGroup)) {
            return;
        }
        ((android.view.ViewGroup) parent).setFitsSystemWindows(true);
    }

    @Override // com.tencent.midas.jsbridge.IAPWebPage
    public void updateWebViewSize(java.lang.String str) {
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.webView.getWebView().getLayoutParams();
        com.tencent.midas.comm.APLog.i("webviewclient == ", "updateWebViewSize ");
        java.lang.String c17 = ub.b.c(str, "mpwidth");
        int intValue = !android.text.TextUtils.isEmpty(c17) ? java.lang.Integer.valueOf(c17).intValue() : 0;
        java.lang.String c18 = ub.b.c(str, "mpheight");
        int intValue2 = android.text.TextUtils.isEmpty(c18) ? 0 : java.lang.Integer.valueOf(c18).intValue();
        if (intValue2 == 0 || intValue == 0) {
            return;
        }
        layoutParams.width = ub.a.a(this.activity, intValue);
        layoutParams.height = ub.a.a(this.activity, intValue2);
        this.webView.getWebView().setLayoutParams(layoutParams);
    }
}
