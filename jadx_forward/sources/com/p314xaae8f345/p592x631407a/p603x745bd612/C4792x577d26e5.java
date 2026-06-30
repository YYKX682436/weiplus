package com.p314xaae8f345.p592x631407a.p603x745bd612;

/* renamed from: com.tencent.midas.jsbridge.APSystemWebPage */
/* loaded from: classes13.dex */
public class C4792x577d26e5 implements com.p314xaae8f345.p592x631407a.p603x745bd612.InterfaceC4799x70d1e6ab {

    /* renamed from: HEADER_BACK */
    private static final int f20674xc8a2ef59 = 1;

    /* renamed from: HEADER_CLOSE */
    private static final int f20675x4bce41a6 = 2;

    /* renamed from: HEADER_REFRESH */
    private static final int f20676x9e50bf09 = 4;
    private static final java.lang.String TAG = "APSystemWebPage";

    /* renamed from: activity */
    private android.app.Activity f20677x9d4bf30f;

    /* renamed from: waitDialog */
    private com.p314xaae8f345.p592x631407a.p595x2eaf0c.ProgressDialogC4761x9393ebe4 f20678xc9becf1d;

    /* renamed from: webView */
    private com.p314xaae8f345.p592x631407a.p603x745bd612.C4795xc7e37cea f20679x48ecb019;

    /* renamed from: webviewCallback */
    private com.p314xaae8f345.p592x631407a.p603x745bd612.InterfaceC4800xe864f226 f20680x13b6b75e = new com.p314xaae8f345.p592x631407a.p603x745bd612.InterfaceC4800xe864f226() { // from class: com.tencent.midas.jsbridge.APSystemWebPage.1
        @Override // com.p314xaae8f345.p592x631407a.p603x745bd612.InterfaceC4800xe864f226
        /* renamed from: WebChromeClientJsAlert */
        public boolean mo41973x1b701f1a(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, android.webkit.JsResult jsResult) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(com.p314xaae8f345.p592x631407a.p603x745bd612.C4792x577d26e5.TAG, "WebChromeClientJsAlert message=" + str2);
            com.p314xaae8f345.p592x631407a.p603x745bd612.C4794x7c92265d.m41986x9e48aeca(com.p314xaae8f345.p592x631407a.p603x745bd612.C4792x577d26e5.this.f20677x9d4bf30f, com.p314xaae8f345.p592x631407a.p603x745bd612.C4792x577d26e5.this.f20679x48ecb019.m41995x86b9ebe3(), com.p314xaae8f345.p592x631407a.p603x745bd612.C4792x577d26e5.this, str2);
            return true;
        }

        @Override // com.p314xaae8f345.p592x631407a.p603x745bd612.InterfaceC4800xe864f226
        /* renamed from: WebChromeClientJsPrompt */
        public boolean mo41974x6c857b66(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, java.lang.String str3, android.webkit.JsPromptResult jsPromptResult) {
            return true;
        }

        @Override // com.p314xaae8f345.p592x631407a.p603x745bd612.InterfaceC4800xe864f226
        /* renamed from: WebViewClientPageFinished */
        public void mo41975x220dcf65(android.webkit.WebView webView, java.lang.String str) {
            try {
                if (com.p314xaae8f345.p592x631407a.p603x745bd612.C4792x577d26e5.this.f20677x9d4bf30f.isFinishing() || com.p314xaae8f345.p592x631407a.p603x745bd612.C4792x577d26e5.this.f20678xc9becf1d == null || !com.p314xaae8f345.p592x631407a.p603x745bd612.C4792x577d26e5.this.f20678xc9becf1d.isShowing()) {
                    return;
                }
                com.p314xaae8f345.p592x631407a.p603x745bd612.C4792x577d26e5.this.f20678xc9becf1d.dismiss();
            } catch (java.lang.Throwable unused) {
            }
        }

        @Override // com.p314xaae8f345.p592x631407a.p603x745bd612.InterfaceC4800xe864f226
        /* renamed from: WebViewClientPageStarted */
        public void mo41976xd2f072e(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
            try {
                if (com.p314xaae8f345.p592x631407a.p603x745bd612.C4792x577d26e5.this.f20677x9d4bf30f.isFinishing() || com.p314xaae8f345.p592x631407a.p603x745bd612.C4792x577d26e5.this.f20678xc9becf1d == null) {
                    return;
                }
                com.p314xaae8f345.p592x631407a.p603x745bd612.C4792x577d26e5.this.f20678xc9becf1d.show();
            } catch (java.lang.Throwable unused) {
            }
        }

        @Override // com.p314xaae8f345.p592x631407a.p603x745bd612.InterfaceC4800xe864f226
        /* renamed from: WebViewClientReceivedError */
        public void mo41977x6c8c9de3(android.webkit.WebView webView, int i17, java.lang.String str, java.lang.String str2) {
            if (com.p314xaae8f345.p592x631407a.p603x745bd612.C4792x577d26e5.this.f20677x9d4bf30f.isFinishing() || com.p314xaae8f345.p592x631407a.p603x745bd612.C4792x577d26e5.this.f20678xc9becf1d == null || !com.p314xaae8f345.p592x631407a.p603x745bd612.C4792x577d26e5.this.f20678xc9becf1d.isShowing()) {
                return;
            }
            com.p314xaae8f345.p592x631407a.p603x745bd612.C4792x577d26e5.this.f20678xc9becf1d.dismiss();
        }
    };

    /* renamed from: createDialog */
    public com.p314xaae8f345.p592x631407a.p595x2eaf0c.ProgressDialogC4761x9393ebe4 m41967x414edd64() {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.ProgressDialogC4761x9393ebe4 progressDialogC4761x9393ebe4 = new com.p314xaae8f345.p592x631407a.p595x2eaf0c.ProgressDialogC4761x9393ebe4(this.f20677x9d4bf30f);
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
                imageButton.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.midas.jsbridge.APSystemWebPage.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(android.view.View view) {
                        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(com.p314xaae8f345.p592x631407a.p603x745bd612.C4792x577d26e5.TAG, "backBtn() clicked");
                        boolean z17 = (com.p314xaae8f345.p592x631407a.p603x745bd612.C4792x577d26e5.this.f20679x48ecb019 == null || com.p314xaae8f345.p592x631407a.p603x745bd612.C4792x577d26e5.this.f20679x48ecb019.m41995x86b9ebe3() == null) ? false : true;
                        com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41934x398f2203(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.m41839xa6eb780b().m41849x19e1b490(), com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.f20626x7f124ed5, "", "webviewNotNull=" + z17);
                        if (z17 && com.p314xaae8f345.p592x631407a.p603x745bd612.C4792x577d26e5.this.f20679x48ecb019.m41995x86b9ebe3().canGoBack()) {
                            com.p314xaae8f345.p592x631407a.p603x745bd612.C4792x577d26e5.this.f20679x48ecb019.m41995x86b9ebe3().goBack();
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
                        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(com.p314xaae8f345.p592x631407a.p603x745bd612.C4792x577d26e5.TAG, "closeBtn() clicked");
                        com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41934x398f2203(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.m41839xa6eb780b().m41849x19e1b490(), com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.f20627x634ad1aa, "", "");
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
                imageButton3.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.midas.jsbridge.APSystemWebPage.6
                    @Override // android.view.View.OnClickListener
                    public void onClick(android.view.View view) {
                        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(com.p314xaae8f345.p592x631407a.p603x745bd612.C4792x577d26e5.TAG, "refreshBtn() clicked");
                        com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41934x398f2203(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.m41839xa6eb780b().m41849x19e1b490(), com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.f20631xc8e95e0d, "", "");
                        if (com.p314xaae8f345.p592x631407a.p603x745bd612.C4792x577d26e5.this.f20679x48ecb019 == null || com.p314xaae8f345.p592x631407a.p603x745bd612.C4792x577d26e5.this.f20679x48ecb019.m41995x86b9ebe3() == null) {
                            return;
                        }
                        com.p314xaae8f345.p592x631407a.p603x745bd612.C4792x577d26e5.this.f20679x48ecb019.m41995x86b9ebe3().reload();
                    }
                });
            }
        } catch (java.lang.Throwable unused2) {
        }
    }

    @Override // com.p314xaae8f345.p592x631407a.p603x745bd612.InterfaceC4799x70d1e6ab
    /* renamed from: initUI */
    public void mo41969xb96c6ba4(android.app.Activity activity) {
        this.f20677x9d4bf30f = activity;
        activity.setContentView(ub.a.d(activity, "unipay_layout_activity_web"));
        android.webkit.WebView webView = (android.webkit.WebView) activity.findViewById(ub.a.c(activity, "unipay_id_WebView"));
        this.f20679x48ecb019 = new com.p314xaae8f345.p592x631407a.p603x745bd612.C4795xc7e37cea(activity, webView, this.f20680x13b6b75e);
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.ProgressDialogC4761x9393ebe4 m41967x414edd64 = m41967x414edd64();
        this.f20678xc9becf1d = m41967x414edd64;
        m41967x414edd64.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() { // from class: com.tencent.midas.jsbridge.APSystemWebPage.2
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

    @Override // com.p314xaae8f345.p592x631407a.p603x745bd612.InterfaceC4799x70d1e6ab
    /* renamed from: loadUrl */
    public void mo41970x141096a9(java.lang.String str) {
        this.f20679x48ecb019.m41996x141096a9(str);
    }

    @Override // com.p314xaae8f345.p592x631407a.p603x745bd612.InterfaceC4799x70d1e6ab
    /* renamed from: toPureH5Pay */
    public void mo41971x71b50448(android.app.Activity activity, com.p314xaae8f345.p592x631407a.api.p594x414ef28f.AbstractC4741xef9abf3 abstractC4741xef9abf3) {
        this.f20677x9d4bf30f = activity;
        activity.setContentView(ub.a.d(activity, "unipay_layout_activity_web"));
        android.webkit.WebView webView = (android.webkit.WebView) activity.findViewById(ub.a.c(activity, "unipay_id_WebView"));
        activity.getWindowManager().getDefaultDisplay().getMetrics(new android.util.DisplayMetrics());
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) webView.getLayoutParams();
        layoutParams.width = (int) (r0.widthPixels * 0.85f);
        layoutParams.height = (int) (r0.heightPixels * 0.85f);
        layoutParams.gravity = 17;
        webView.setLayoutParams(layoutParams);
        this.f20679x48ecb019 = new com.p314xaae8f345.p592x631407a.p603x745bd612.C4795xc7e37cea(activity, webView, this.f20680x13b6b75e);
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.ProgressDialogC4761x9393ebe4 m41967x414edd64 = m41967x414edd64();
        this.f20678xc9becf1d = m41967x414edd64;
        m41967x414edd64.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() { // from class: com.tencent.midas.jsbridge.APSystemWebPage.3
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

    @Override // com.p314xaae8f345.p592x631407a.p603x745bd612.InterfaceC4799x70d1e6ab
    /* renamed from: updateWebViewSize */
    public void mo41972x60ad9731(java.lang.String str) {
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f20679x48ecb019.m41995x86b9ebe3().getLayoutParams();
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("webviewclient == ", "updateWebViewSize ");
        java.lang.String c17 = ub.b.c(str, "mpwidth");
        int intValue = !android.text.TextUtils.isEmpty(c17) ? java.lang.Integer.valueOf(c17).intValue() : 0;
        java.lang.String c18 = ub.b.c(str, "mpheight");
        int intValue2 = android.text.TextUtils.isEmpty(c18) ? 0 : java.lang.Integer.valueOf(c18).intValue();
        if (intValue2 == 0 || intValue == 0) {
            return;
        }
        layoutParams.width = ub.a.a(this.f20677x9d4bf30f, intValue);
        layoutParams.height = ub.a.a(this.f20677x9d4bf30f, intValue2);
        this.f20679x48ecb019.m41995x86b9ebe3().setLayoutParams(layoutParams);
    }
}
