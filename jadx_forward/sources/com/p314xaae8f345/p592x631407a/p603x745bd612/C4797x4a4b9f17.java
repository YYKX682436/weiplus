package com.p314xaae8f345.p592x631407a.p603x745bd612;

/* renamed from: com.tencent.midas.jsbridge.APX5WebPage */
/* loaded from: classes13.dex */
public class C4797x4a4b9f17 implements com.p314xaae8f345.p592x631407a.p603x745bd612.InterfaceC4799x70d1e6ab {

    /* renamed from: HEADER_BACK */
    private static final int f20709xc8a2ef59 = 1;

    /* renamed from: HEADER_CLOSE */
    private static final int f20710x4bce41a6 = 2;

    /* renamed from: HEADER_REFRESH */
    private static final int f20711x9e50bf09 = 4;
    private static final java.lang.String TAG = "APX5WebPage";

    /* renamed from: activity */
    private android.app.Activity f20712x9d4bf30f;

    /* renamed from: waitDialog */
    protected android.app.ProgressDialog f20713xc9becf1d;

    /* renamed from: webView */
    protected com.p314xaae8f345.p592x631407a.p603x745bd612.C4798x4a4e772d f20714x48ecb019 = null;

    /* renamed from: webviewCallback */
    private com.p314xaae8f345.p592x631407a.p603x745bd612.InterfaceC4801x2ab9fa9 f20715x13b6b75e = new com.p314xaae8f345.p592x631407a.p603x745bd612.InterfaceC4801x2ab9fa9() { // from class: com.tencent.midas.jsbridge.APX5WebPage.1
        @Override // com.p314xaae8f345.p592x631407a.p603x745bd612.InterfaceC4801x2ab9fa9
        /* renamed from: WebChromeClientJsAlert */
        public boolean mo42008x1b701f1a(com.tencent.smtt.sdk.WebView webView, java.lang.String str, java.lang.String str2, com.tencent.smtt.export.external.interfaces.JsResult jsResult) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(com.p314xaae8f345.p592x631407a.p603x745bd612.C4797x4a4b9f17.TAG, "WebChromeClientJsAlert message=" + str2);
            com.p314xaae8f345.p592x631407a.p603x745bd612.C4794x7c92265d.m41986x9e48aeca(com.p314xaae8f345.p592x631407a.p603x745bd612.C4797x4a4b9f17.this.f20712x9d4bf30f, com.p314xaae8f345.p592x631407a.p603x745bd612.C4797x4a4b9f17.this.f20714x48ecb019.m42018x86b9ebe3(), com.p314xaae8f345.p592x631407a.p603x745bd612.C4797x4a4b9f17.this, str2);
            return true;
        }

        @Override // com.p314xaae8f345.p592x631407a.p603x745bd612.InterfaceC4801x2ab9fa9
        /* renamed from: WebChromeClientJsPrompt */
        public boolean mo42009x6c857b66(com.tencent.smtt.sdk.WebView webView, java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.smtt.export.external.interfaces.JsPromptResult jsPromptResult) {
            return true;
        }

        @Override // com.p314xaae8f345.p592x631407a.p603x745bd612.InterfaceC4801x2ab9fa9
        /* renamed from: WebViewClientPageFinished */
        public void mo42010x220dcf65(com.tencent.smtt.sdk.WebView webView, java.lang.String str) {
            android.app.ProgressDialog progressDialog;
            try {
                if (com.p314xaae8f345.p592x631407a.p603x745bd612.C4797x4a4b9f17.this.f20712x9d4bf30f.isFinishing() || (progressDialog = com.p314xaae8f345.p592x631407a.p603x745bd612.C4797x4a4b9f17.this.f20713xc9becf1d) == null || !progressDialog.isShowing()) {
                    return;
                }
                com.p314xaae8f345.p592x631407a.p603x745bd612.C4797x4a4b9f17.this.f20713xc9becf1d.dismiss();
            } catch (java.lang.Throwable unused) {
            }
        }

        @Override // com.p314xaae8f345.p592x631407a.p603x745bd612.InterfaceC4801x2ab9fa9
        /* renamed from: WebViewClientPageStarted */
        public void mo42011xd2f072e(com.tencent.smtt.sdk.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
            android.app.ProgressDialog progressDialog;
            try {
                if (com.p314xaae8f345.p592x631407a.p603x745bd612.C4797x4a4b9f17.this.f20712x9d4bf30f.isFinishing() || (progressDialog = com.p314xaae8f345.p592x631407a.p603x745bd612.C4797x4a4b9f17.this.f20713xc9becf1d) == null) {
                    return;
                }
                progressDialog.show();
            } catch (java.lang.Throwable unused) {
            }
        }

        @Override // com.p314xaae8f345.p592x631407a.p603x745bd612.InterfaceC4801x2ab9fa9
        /* renamed from: WebViewClientReceivedError */
        public void mo42012x6c8c9de3(com.tencent.smtt.sdk.WebView webView, int i17, java.lang.String str, java.lang.String str2) {
            android.app.ProgressDialog progressDialog;
            if (com.p314xaae8f345.p592x631407a.p603x745bd612.C4797x4a4b9f17.this.f20712x9d4bf30f.isFinishing() || (progressDialog = com.p314xaae8f345.p592x631407a.p603x745bd612.C4797x4a4b9f17.this.f20713xc9becf1d) == null || !progressDialog.isShowing()) {
                return;
            }
            com.p314xaae8f345.p592x631407a.p603x745bd612.C4797x4a4b9f17.this.f20713xc9becf1d.dismiss();
        }
    };

    /* renamed from: createDialog */
    public com.p314xaae8f345.p592x631407a.p595x2eaf0c.ProgressDialogC4761x9393ebe4 m42007x414edd64() {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.ProgressDialogC4761x9393ebe4 progressDialogC4761x9393ebe4 = new com.p314xaae8f345.p592x631407a.p595x2eaf0c.ProgressDialogC4761x9393ebe4(this.f20712x9d4bf30f);
        progressDialogC4761x9393ebe4.setMessage("请稍候...");
        return progressDialogC4761x9393ebe4;
    }

    @Override // com.p314xaae8f345.p592x631407a.p603x745bd612.InterfaceC4799x70d1e6ab
    /* renamed from: initHead */
    public void mo41968xffa9f10(final android.app.Activity activity, java.lang.String str, java.lang.String str2) {
        int i17;
        try {
            com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41934x398f2203(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.m41839xa6eb780b().m41849x19e1b490(), com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.f20628x4a64aee1, "", "headControl=" + str + "&headTitle=" + str2);
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
                        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(com.p314xaae8f345.p592x631407a.p603x745bd612.C4797x4a4b9f17.TAG, "backBtn() clicked");
                        com.p314xaae8f345.p592x631407a.p603x745bd612.C4798x4a4e772d c4798x4a4e772d = com.p314xaae8f345.p592x631407a.p603x745bd612.C4797x4a4b9f17.this.f20714x48ecb019;
                        boolean z17 = (c4798x4a4e772d == null || c4798x4a4e772d.m42018x86b9ebe3() == null) ? false : true;
                        com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41934x398f2203(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.m41839xa6eb780b().m41849x19e1b490(), com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.f20635xec5a2c5b, "", "webviewNotNull=" + z17);
                        if (z17 && com.p314xaae8f345.p592x631407a.p603x745bd612.C4797x4a4b9f17.this.f20714x48ecb019.m42018x86b9ebe3().canGoBack()) {
                            com.p314xaae8f345.p592x631407a.p603x745bd612.C4797x4a4b9f17.this.f20714x48ecb019.m42018x86b9ebe3().goBack();
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
                        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(com.p314xaae8f345.p592x631407a.p603x745bd612.C4797x4a4b9f17.TAG, "closeBtn() clicked");
                        com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41934x398f2203(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.m41839xa6eb780b().m41849x19e1b490(), com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.f20636x9efea4e4, "", "");
                        com.p314xaae8f345.p592x631407a.api.C4728x8ec3caec c4728x8ec3caec = new com.p314xaae8f345.p592x631407a.api.C4728x8ec3caec();
                        c4728x8ec3caec.f20116xdde293aa = 100;
                        c4728x8ec3caec.f20118x938b9624 = "关闭";
                        com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41776x3161eff(c4728x8ec3caec);
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
                        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(com.p314xaae8f345.p592x631407a.p603x745bd612.C4797x4a4b9f17.TAG, "refreshBtn() clicked");
                        com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41934x398f2203(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.m41839xa6eb780b().m41849x19e1b490(), com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.f20639xe6f54ac7, "", "");
                        com.p314xaae8f345.p592x631407a.p603x745bd612.C4798x4a4e772d c4798x4a4e772d = com.p314xaae8f345.p592x631407a.p603x745bd612.C4797x4a4b9f17.this.f20714x48ecb019;
                        if (c4798x4a4e772d == null || c4798x4a4e772d.m42018x86b9ebe3() == null) {
                            return;
                        }
                        com.p314xaae8f345.p592x631407a.p603x745bd612.C4797x4a4b9f17.this.f20714x48ecb019.m42018x86b9ebe3().reload();
                    }
                });
            }
        } catch (java.lang.Throwable unused2) {
        }
    }

    @Override // com.p314xaae8f345.p592x631407a.p603x745bd612.InterfaceC4799x70d1e6ab
    /* renamed from: initUI */
    public void mo41969xb96c6ba4(android.app.Activity activity) {
        this.f20712x9d4bf30f = activity;
        activity.setContentView(ub.a.d(activity, "unipay_layout_activity_web_x5"));
        com.tencent.smtt.sdk.WebView findViewById = activity.findViewById(ub.a.c(activity, "unipay_id_WebView"));
        this.f20714x48ecb019 = new com.p314xaae8f345.p592x631407a.p603x745bd612.C4798x4a4e772d(activity, findViewById, this.f20715x13b6b75e);
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.ProgressDialogC4761x9393ebe4 m42007x414edd64 = m42007x414edd64();
        this.f20713xc9becf1d = m42007x414edd64;
        m42007x414edd64.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() { // from class: com.tencent.midas.jsbridge.APX5WebPage.3
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

    @Override // com.p314xaae8f345.p592x631407a.p603x745bd612.InterfaceC4799x70d1e6ab
    /* renamed from: loadUrl */
    public void mo41970x141096a9(java.lang.String str) {
        this.f20714x48ecb019.m42019x141096a9(str);
    }

    @Override // com.p314xaae8f345.p592x631407a.p603x745bd612.InterfaceC4799x70d1e6ab
    /* renamed from: toPureH5Pay */
    public void mo41971x71b50448(android.app.Activity activity, com.p314xaae8f345.p592x631407a.api.p594x414ef28f.AbstractC4741xef9abf3 abstractC4741xef9abf3) {
        this.f20712x9d4bf30f = activity;
        activity.setContentView(ub.a.d(activity, "unipay_layout_activity_web_x5"));
        com.tencent.smtt.sdk.WebView findViewById = activity.findViewById(ub.a.c(activity, "unipay_id_WebView"));
        activity.getWindowManager().getDefaultDisplay().getMetrics(new android.util.DisplayMetrics());
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams.width = (int) (r0.widthPixels * 0.85f);
        layoutParams.height = (int) (r0.heightPixels * 0.85f);
        layoutParams.topMargin = 20;
        layoutParams.gravity = 17;
        findViewById.setLayoutParams(layoutParams);
        this.f20714x48ecb019 = new com.p314xaae8f345.p592x631407a.p603x745bd612.C4798x4a4e772d(activity, findViewById, this.f20715x13b6b75e);
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.ProgressDialogC4761x9393ebe4 m42007x414edd64 = m42007x414edd64();
        this.f20713xc9becf1d = m42007x414edd64;
        m42007x414edd64.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() { // from class: com.tencent.midas.jsbridge.APX5WebPage.2
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

    @Override // com.p314xaae8f345.p592x631407a.p603x745bd612.InterfaceC4799x70d1e6ab
    /* renamed from: updateWebViewSize */
    public void mo41972x60ad9731(java.lang.String str) {
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f20714x48ecb019.m42018x86b9ebe3().getLayoutParams();
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("webviewclient == ", "updateWebViewSize ");
        java.lang.String c17 = ub.b.c(str, "mpwidth");
        int intValue = !android.text.TextUtils.isEmpty(c17) ? java.lang.Integer.valueOf(c17).intValue() : 0;
        java.lang.String c18 = ub.b.c(str, "mpheight");
        int intValue2 = android.text.TextUtils.isEmpty(c18) ? 0 : java.lang.Integer.valueOf(c18).intValue();
        if (intValue2 == 0 || intValue == 0) {
            return;
        }
        layoutParams.width = ub.a.a(this.f20712x9d4bf30f, intValue);
        layoutParams.height = ub.a.a(this.f20712x9d4bf30f, intValue2);
        this.f20714x48ecb019.m42018x86b9ebe3().setLayoutParams(layoutParams);
    }
}
