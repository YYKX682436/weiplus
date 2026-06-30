package com.tencent.midas.jsbridge;

/* loaded from: classes13.dex */
public class APX5WebPage implements com.tencent.midas.jsbridge.IAPWebPage {
    private static final int HEADER_BACK = 1;
    private static final int HEADER_CLOSE = 2;
    private static final int HEADER_REFRESH = 4;
    private static final java.lang.String TAG = "APX5WebPage";
    private android.app.Activity activity;
    protected android.app.ProgressDialog waitDialog;
    protected com.tencent.midas.jsbridge.APX5WebView webView = null;
    private com.tencent.midas.jsbridge.IAPX5WebViewCallback webviewCallback = new com.tencent.midas.jsbridge.IAPX5WebViewCallback() { // from class: com.tencent.midas.jsbridge.APX5WebPage.1
        @Override // com.tencent.midas.jsbridge.IAPX5WebViewCallback
        public boolean WebChromeClientJsAlert(com.tencent.smtt.sdk.WebView webView, java.lang.String str, java.lang.String str2, com.tencent.smtt.export.external.interfaces.JsResult jsResult) {
            com.tencent.midas.comm.APLog.d(com.tencent.midas.jsbridge.APX5WebPage.TAG, "WebChromeClientJsAlert message=" + str2);
            com.tencent.midas.jsbridge.APWebProtocol.AnalyzeWebEntry(com.tencent.midas.jsbridge.APX5WebPage.this.activity, com.tencent.midas.jsbridge.APX5WebPage.this.webView.getWebView(), com.tencent.midas.jsbridge.APX5WebPage.this, str2);
            return true;
        }

        @Override // com.tencent.midas.jsbridge.IAPX5WebViewCallback
        public boolean WebChromeClientJsPrompt(com.tencent.smtt.sdk.WebView webView, java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.smtt.export.external.interfaces.JsPromptResult jsPromptResult) {
            return true;
        }

        @Override // com.tencent.midas.jsbridge.IAPX5WebViewCallback
        public void WebViewClientPageFinished(com.tencent.smtt.sdk.WebView webView, java.lang.String str) {
            android.app.ProgressDialog progressDialog;
            try {
                if (com.tencent.midas.jsbridge.APX5WebPage.this.activity.isFinishing() || (progressDialog = com.tencent.midas.jsbridge.APX5WebPage.this.waitDialog) == null || !progressDialog.isShowing()) {
                    return;
                }
                com.tencent.midas.jsbridge.APX5WebPage.this.waitDialog.dismiss();
            } catch (java.lang.Throwable unused) {
            }
        }

        @Override // com.tencent.midas.jsbridge.IAPX5WebViewCallback
        public void WebViewClientPageStarted(com.tencent.smtt.sdk.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
            android.app.ProgressDialog progressDialog;
            try {
                if (com.tencent.midas.jsbridge.APX5WebPage.this.activity.isFinishing() || (progressDialog = com.tencent.midas.jsbridge.APX5WebPage.this.waitDialog) == null) {
                    return;
                }
                progressDialog.show();
            } catch (java.lang.Throwable unused) {
            }
        }

        @Override // com.tencent.midas.jsbridge.IAPX5WebViewCallback
        public void WebViewClientReceivedError(com.tencent.smtt.sdk.WebView webView, int i17, java.lang.String str, java.lang.String str2) {
            android.app.ProgressDialog progressDialog;
            if (com.tencent.midas.jsbridge.APX5WebPage.this.activity.isFinishing() || (progressDialog = com.tencent.midas.jsbridge.APX5WebPage.this.waitDialog) == null || !progressDialog.isShowing()) {
                return;
            }
            com.tencent.midas.jsbridge.APX5WebPage.this.waitDialog.dismiss();
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
                imageButton.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.midas.jsbridge.APX5WebPage.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(android.view.View view) {
                        com.tencent.midas.comm.APLog.d(com.tencent.midas.jsbridge.APX5WebPage.TAG, "backBtn() clicked");
                        com.tencent.midas.jsbridge.APX5WebView aPX5WebView = com.tencent.midas.jsbridge.APX5WebPage.this.webView;
                        boolean z17 = (aPX5WebView == null || aPX5WebView.getWebView() == null) ? false : true;
                        com.tencent.midas.data.APPluginReportManager.getInstance().insertData(com.tencent.midas.data.APPluginDataInterface.singleton().getLaunchInterface(), com.tencent.midas.data.APPluginReportManager.MIDASPLUGIN_WEBPAGE_X5_BACK, "", "webviewNotNull=" + z17);
                        if (z17 && com.tencent.midas.jsbridge.APX5WebPage.this.webView.getWebView().canGoBack()) {
                            com.tencent.midas.jsbridge.APX5WebPage.this.webView.getWebView().goBack();
                        }
                    }
                });
            } else {
                imageButton.setVisibility(8);
            }
            android.widget.ImageButton imageButton2 = (android.widget.ImageButton) activity.findViewById(ub.a.c(activity, "midas_header_close"));
            if ((i17 & 2) == 2) {
                imageButton2.setVisibility(0);
                imageButton2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.midas.jsbridge.APX5WebPage.5
                    @Override // android.view.View.OnClickListener
                    public void onClick(android.view.View view) {
                        com.tencent.midas.comm.APLog.d(com.tencent.midas.jsbridge.APX5WebPage.TAG, "closeBtn() clicked");
                        com.tencent.midas.data.APPluginReportManager.getInstance().insertData(com.tencent.midas.data.APPluginDataInterface.singleton().getLaunchInterface(), com.tencent.midas.data.APPluginReportManager.MIDASPLUGIN_WEBPAGE_X5_CLOSE, "", "");
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
                imageButton3.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.midas.jsbridge.APX5WebPage.6
                    @Override // android.view.View.OnClickListener
                    public void onClick(android.view.View view) {
                        com.tencent.midas.comm.APLog.d(com.tencent.midas.jsbridge.APX5WebPage.TAG, "refreshBtn() clicked");
                        com.tencent.midas.data.APPluginReportManager.getInstance().insertData(com.tencent.midas.data.APPluginDataInterface.singleton().getLaunchInterface(), com.tencent.midas.data.APPluginReportManager.MIDASPLUGIN_WEBPAGE_X5_REFRESH, "", "");
                        com.tencent.midas.jsbridge.APX5WebView aPX5WebView = com.tencent.midas.jsbridge.APX5WebPage.this.webView;
                        if (aPX5WebView == null || aPX5WebView.getWebView() == null) {
                            return;
                        }
                        com.tencent.midas.jsbridge.APX5WebPage.this.webView.getWebView().reload();
                    }
                });
            }
        } catch (java.lang.Throwable unused2) {
        }
    }

    @Override // com.tencent.midas.jsbridge.IAPWebPage
    public void initUI(android.app.Activity activity) {
        this.activity = activity;
        activity.setContentView(ub.a.d(activity, "unipay_layout_activity_web_x5"));
        com.tencent.smtt.sdk.WebView findViewById = activity.findViewById(ub.a.c(activity, "unipay_id_WebView"));
        this.webView = new com.tencent.midas.jsbridge.APX5WebView(activity, findViewById, this.webviewCallback);
        com.tencent.midas.comm.APProgressDialog createDialog = createDialog();
        this.waitDialog = createDialog;
        createDialog.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() { // from class: com.tencent.midas.jsbridge.APX5WebPage.3
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(android.content.DialogInterface dialogInterface) {
            }
        });
        android.view.ViewParent parent = findViewById.getParent();
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
        activity.setContentView(ub.a.d(activity, "unipay_layout_activity_web_x5"));
        com.tencent.smtt.sdk.WebView findViewById = activity.findViewById(ub.a.c(activity, "unipay_id_WebView"));
        activity.getWindowManager().getDefaultDisplay().getMetrics(new android.util.DisplayMetrics());
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams.width = (int) (r0.widthPixels * 0.85f);
        layoutParams.height = (int) (r0.heightPixels * 0.85f);
        layoutParams.topMargin = 20;
        layoutParams.gravity = 17;
        findViewById.setLayoutParams(layoutParams);
        this.webView = new com.tencent.midas.jsbridge.APX5WebView(activity, findViewById, this.webviewCallback);
        com.tencent.midas.comm.APProgressDialog createDialog = createDialog();
        this.waitDialog = createDialog;
        createDialog.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() { // from class: com.tencent.midas.jsbridge.APX5WebPage.2
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(android.content.DialogInterface dialogInterface) {
            }
        });
        android.view.ViewParent parent = findViewById.getParent();
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
