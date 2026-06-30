package com.p314xaae8f345.p592x631407a.p603x745bd612;

/* renamed from: com.tencent.midas.jsbridge.APWebView */
/* loaded from: classes13.dex */
public class C4795xc7e37cea {
    private static final java.lang.String TAG = "APWebView";

    /* renamed from: callback */
    private com.p314xaae8f345.p592x631407a.p603x745bd612.InterfaceC4800xe864f226 f20700xf5bc2045;

    /* renamed from: mContext */
    private android.app.Activity f20702xd6cfe882;

    /* renamed from: mWebview */
    private android.webkit.WebView f20704xe713eecc;

    /* renamed from: mChromeClient */
    private android.webkit.WebChromeClient f20701xb2be87f2 = new android.webkit.WebChromeClient() { // from class: com.tencent.midas.jsbridge.APWebView.1
        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, android.webkit.JsResult jsResult) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e("inner onJsAlert message", str2);
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(com.p314xaae8f345.p592x631407a.p603x745bd612.C4795xc7e37cea.TAG, " url = " + str);
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(com.p314xaae8f345.p592x631407a.p603x745bd612.C4795xc7e37cea.TAG, " message = " + str2);
            if (com.p314xaae8f345.p592x631407a.p602x551ac888.C4789x4d5bb90b.m41955x2ad99a01(com.p314xaae8f345.p592x631407a.p603x745bd612.C4795xc7e37cea.this.f20702xd6cfe882, str2)) {
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(com.p314xaae8f345.p592x631407a.p603x745bd612.C4795xc7e37cea.TAG, "onJsAlert is pure h5 update! Cancel alert!");
                jsResult.cancel();
                return true;
            }
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(com.p314xaae8f345.p592x631407a.p603x745bd612.C4795xc7e37cea.TAG, "onJsAlert not pure h5 update!");
            if (com.p314xaae8f345.p592x631407a.p603x745bd612.C4794x7c92265d.m41988x47f0c251(com.p314xaae8f345.p592x631407a.p603x745bd612.C4795xc7e37cea.this.f20702xd6cfe882, com.p314xaae8f345.p592x631407a.p603x745bd612.C4795xc7e37cea.this.f20704xe713eecc, str, str2, jsResult, com.p314xaae8f345.p592x631407a.p603x745bd612.C4795xc7e37cea.this.f20700xf5bc2045)) {
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(com.p314xaae8f345.p592x631407a.p603x745bd612.C4795xc7e37cea.TAG, "hookH5Method is processed");
                jsResult.cancel();
                return true;
            }
            if (com.p314xaae8f345.p592x631407a.api.C4727x8a3e11bd.m41359xf1af805e(com.p314xaae8f345.p592x631407a.p603x745bd612.C4795xc7e37cea.this.f20702xd6cfe882, com.p314xaae8f345.p592x631407a.p603x745bd612.C4795xc7e37cea.this.f20704xe713eecc, str, str2, jsResult) != 0) {
                return super.onJsAlert(webView, str, str2, jsResult);
            }
            com.p314xaae8f345.p592x631407a.p603x745bd612.C4795xc7e37cea.this.f20700xf5bc2045.mo41973x1b701f1a(webView, str, str2, jsResult);
            jsResult.cancel();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, java.lang.String str3, android.webkit.JsPromptResult jsPromptResult) {
            return com.p314xaae8f345.p592x631407a.p603x745bd612.C4795xc7e37cea.this.f20700xf5bc2045.mo41974x6c857b66(webView, str, str2, str3, jsPromptResult);
        }
    };

    /* renamed from: mWebViewClient */
    private android.webkit.WebViewClient f20703x2eaa61d7 = new android.webkit.WebViewClient() { // from class: com.tencent.midas.jsbridge.APWebView.2

        /* renamed from: _hellAccFlag_ */
        private byte f20706x7f11beae;

        @Override // android.webkit.WebViewClient
        public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
            super.onPageFinished(webView, str);
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(com.p314xaae8f345.p592x631407a.p603x745bd612.C4795xc7e37cea.TAG, "onPageFinished!");
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APWebView url == ", str);
            com.p314xaae8f345.p592x631407a.p603x745bd612.C4795xc7e37cea.this.f20704xe713eecc.setVisibility(0);
            com.p314xaae8f345.p592x631407a.api.C4727x8a3e11bd.m41346x22f14eb5(com.p314xaae8f345.p592x631407a.p603x745bd612.C4795xc7e37cea.this.f20702xd6cfe882, com.p314xaae8f345.p592x631407a.p603x745bd612.C4795xc7e37cea.this.f20704xe713eecc);
            com.p314xaae8f345.p592x631407a.p603x745bd612.C4795xc7e37cea.this.f20700xf5bc2045.mo41975x220dcf65(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(com.p314xaae8f345.p592x631407a.p603x745bd612.C4795xc7e37cea.TAG, "onPageStarted!");
            com.p314xaae8f345.p592x631407a.p603x745bd612.C4795xc7e37cea.this.f20700xf5bc2045.mo41976xd2f072e(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(android.webkit.WebView webView, int i17, java.lang.String str, java.lang.String str2) {
            super.onReceivedError(webView, i17, str, str2);
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(com.p314xaae8f345.p592x631407a.p603x745bd612.C4795xc7e37cea.TAG, "onReceivedError!");
            com.p314xaae8f345.p592x631407a.p603x745bd612.C4795xc7e37cea.this.f20700xf5bc2045.mo41977x6c8c9de3(webView, i17, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(com.p314xaae8f345.p592x631407a.p603x745bd612.C4795xc7e37cea.TAG, "shouldOverrideUrlLoading url = " + str);
            if (!str.startsWith("http://unipay.sdk.android/?") && !str.startsWith("wsj://") && !str.startsWith("mqqapi://") && !str.startsWith("weixin://") && !str.startsWith("sms://")) {
                webView.loadUrl(str);
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(com.p314xaae8f345.p592x631407a.p603x745bd612.C4795xc7e37cea.TAG, "shouldOverrideUrlLoading loadUrl = ");
            }
            if (!str.startsWith("mqqapi://") && !str.startsWith("weixin://") && !str.startsWith("sms://")) {
                return true;
            }
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str));
            if (intent.resolveActivity(com.p314xaae8f345.p592x631407a.p603x745bd612.C4795xc7e37cea.this.f20702xd6cfe882.getPackageManager()) == null) {
                android.widget.Toast.makeText(com.p314xaae8f345.p592x631407a.p603x745bd612.C4795xc7e37cea.this.f20702xd6cfe882, "抱歉，你未安装相应客户端", 1).show();
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.w(com.p314xaae8f345.p592x631407a.p603x745bd612.C4795xc7e37cea.TAG, "shouldOverrideUrlLoading() intent.resolveActivity == Null ");
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

    public C4795xc7e37cea(android.app.Activity activity, android.webkit.WebView webView, com.p314xaae8f345.p592x631407a.p603x745bd612.InterfaceC4800xe864f226 interfaceC4800xe864f226) {
        this.f20704xe713eecc = null;
        this.f20702xd6cfe882 = null;
        this.f20700xf5bc2045 = null;
        this.f20702xd6cfe882 = activity;
        this.f20704xe713eecc = webView;
        this.f20700xf5bc2045 = interfaceC4800xe864f226;
        m41990xfb04b8c9();
    }

    /* renamed from: InitWebView */
    private void m41990xfb04b8c9() {
        android.webkit.WebSettings settings = this.f20704xe713eecc.getSettings();
        settings.setJavaScriptEnabled(true);
        int i17 = android.os.Build.VERSION.SDK_INT;
        com.p314xaae8f345.p592x631407a.api.C4727x8a3e11bd.env.equals("test");
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(true);
        if (i17 < 33) {
            settings.setAppCacheEnabled(true);
            settings.setAppCachePath(this.f20702xd6cfe882.getApplicationContext().getDir("cache", 0).getPath());
        }
        settings.setCacheMode(-1);
        try {
            settings.setSavePassword(false);
        } catch (java.lang.Exception unused) {
        }
        this.f20704xe713eecc.setScrollBarStyle(0);
        this.f20704xe713eecc.setWebChromeClient(this.f20701xb2be87f2);
        this.f20704xe713eecc.setWebViewClient(this.f20703x2eaa61d7);
        m41994x9bd1e915();
    }

    /* renamed from: removeInterface */
    private void m41994x9bd1e915() {
        try {
            java.lang.reflect.Method method = this.f20704xe713eecc.getClass().getMethod("removeJavascriptInterface", java.lang.String.class);
            if (method != null) {
                method.invoke(this.f20704xe713eecc, "searchBoxJavaBridge_");
                method.invoke(this.f20704xe713eecc, "accessibility");
                method.invoke(this.f20704xe713eecc, "accessibilityTraversal");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("removeJavascriptInterface", e17.toString());
        }
    }

    /* renamed from: getWebView */
    public android.webkit.WebView m41995x86b9ebe3() {
        return this.f20704xe713eecc;
    }

    /* renamed from: loadUrl */
    public void m41996x141096a9(java.lang.String str) {
        this.f20704xe713eecc.loadUrl(str);
    }
}
