package com.p314xaae8f345.p592x631407a.p603x745bd612;

/* renamed from: com.tencent.midas.jsbridge.APX5WebView */
/* loaded from: classes13.dex */
public class C4798x4a4e772d {
    private static final java.lang.String TAG = "APX5WebView";

    /* renamed from: callback */
    private com.p314xaae8f345.p592x631407a.p603x745bd612.InterfaceC4801x2ab9fa9 f20723xf5bc2045;

    /* renamed from: mContext */
    private android.app.Activity f20725xd6cfe882;

    /* renamed from: mWebview */
    private com.tencent.smtt.sdk.WebView f20727xe713eecc;

    /* renamed from: mChromeClient */
    private com.tencent.smtt.sdk.WebChromeClient f20724xb2be87f2 = new com.tencent.smtt.sdk.WebChromeClient() { // from class: com.tencent.midas.jsbridge.APX5WebView.1
        /* renamed from: onJsAlert */
        public boolean m42020xfefe72b4(com.tencent.smtt.sdk.WebView webView, java.lang.String str, java.lang.String str2, com.tencent.smtt.export.external.interfaces.JsResult jsResult) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e("inner onJsAlert message", str2);
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(com.p314xaae8f345.p592x631407a.p603x745bd612.C4798x4a4e772d.TAG, " url = " + str);
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(com.p314xaae8f345.p592x631407a.p603x745bd612.C4798x4a4e772d.TAG, " message = " + str2);
            if (com.p314xaae8f345.p592x631407a.p602x551ac888.C4789x4d5bb90b.m41955x2ad99a01(com.p314xaae8f345.p592x631407a.p603x745bd612.C4798x4a4e772d.this.f20725xd6cfe882, str2)) {
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(com.p314xaae8f345.p592x631407a.p603x745bd612.C4798x4a4e772d.TAG, "onJsAlert is pure h5 update! Cancel alert!");
                jsResult.cancel();
                return true;
            }
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(com.p314xaae8f345.p592x631407a.p603x745bd612.C4798x4a4e772d.TAG, "onJsAlert not pure h5 update!");
            if (com.p314xaae8f345.p592x631407a.p603x745bd612.C4794x7c92265d.m41989x47f0c251(com.p314xaae8f345.p592x631407a.p603x745bd612.C4798x4a4e772d.this.f20725xd6cfe882, com.p314xaae8f345.p592x631407a.p603x745bd612.C4798x4a4e772d.this.f20727xe713eecc, str, str2, jsResult, com.p314xaae8f345.p592x631407a.p603x745bd612.C4798x4a4e772d.this.f20723xf5bc2045)) {
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(com.p314xaae8f345.p592x631407a.p603x745bd612.C4798x4a4e772d.TAG, "hookH5Method is processed");
                jsResult.cancel();
                return true;
            }
            if (com.p314xaae8f345.p592x631407a.api.C4727x8a3e11bd.m41360x43d0ebbb(com.p314xaae8f345.p592x631407a.p603x745bd612.C4798x4a4e772d.this.f20725xd6cfe882, com.p314xaae8f345.p592x631407a.p603x745bd612.C4798x4a4e772d.this.f20727xe713eecc, str, str2, jsResult) != 0) {
                return super.onJsAlert(webView, str, str2, jsResult);
            }
            com.p314xaae8f345.p592x631407a.p603x745bd612.C4798x4a4e772d.this.f20723xf5bc2045.mo42008x1b701f1a(webView, str, str2, jsResult);
            jsResult.cancel();
            return true;
        }

        /* renamed from: onJsPrompt */
        public boolean m42021xfac19b0c(com.tencent.smtt.sdk.WebView webView, java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.smtt.export.external.interfaces.JsPromptResult jsPromptResult) {
            return com.p314xaae8f345.p592x631407a.p603x745bd612.C4798x4a4e772d.this.f20723xf5bc2045.mo42009x6c857b66(webView, str, str2, str3, jsPromptResult);
        }
    };

    /* renamed from: mWebViewClient */
    private com.tencent.smtt.sdk.WebViewClient f20726x2eaa61d7 = new com.tencent.smtt.sdk.WebViewClient() { // from class: com.tencent.midas.jsbridge.APX5WebView.2

        /* renamed from: _hellAccFlag_ */
        private byte f20729x7f11beae;

        /* renamed from: onPageFinished */
        public void m42022xe1e213a0(com.tencent.smtt.sdk.WebView webView, java.lang.String str) {
            super.onPageFinished(webView, str);
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(com.p314xaae8f345.p592x631407a.p603x745bd612.C4798x4a4e772d.TAG, "onPageFinished!");
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APWebView url == ", str);
            com.p314xaae8f345.p592x631407a.p603x745bd612.C4798x4a4e772d.this.f20727xe713eecc.setVisibility(0);
            com.p314xaae8f345.p592x631407a.api.C4727x8a3e11bd.m41347x2bd88052(com.p314xaae8f345.p592x631407a.p603x745bd612.C4798x4a4e772d.this.f20725xd6cfe882, com.p314xaae8f345.p592x631407a.p603x745bd612.C4798x4a4e772d.this.f20727xe713eecc);
            com.p314xaae8f345.p592x631407a.p603x745bd612.C4798x4a4e772d.this.f20723xf5bc2045.mo42010x220dcf65(webView, str);
        }

        /* renamed from: onPageStarted */
        public void m42023x65f3cf93(com.tencent.smtt.sdk.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(com.p314xaae8f345.p592x631407a.p603x745bd612.C4798x4a4e772d.TAG, "onPageStarted!");
            com.p314xaae8f345.p592x631407a.p603x745bd612.C4798x4a4e772d.this.f20723xf5bc2045.mo42011xd2f072e(webView, str, bitmap);
        }

        /* renamed from: onReceivedError */
        public void m42024xa740e108(com.tencent.smtt.sdk.WebView webView, int i17, java.lang.String str, java.lang.String str2) {
            super.onReceivedError(webView, i17, str, str2);
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(com.p314xaae8f345.p592x631407a.p603x745bd612.C4798x4a4e772d.TAG, "onReceivedError!");
            com.p314xaae8f345.p592x631407a.p603x745bd612.C4798x4a4e772d.this.f20723xf5bc2045.mo42012x6c8c9de3(webView, i17, str, str2);
        }

        /* renamed from: shouldOverrideUrlLoading */
        public boolean m42025xec6a1ccc(com.tencent.smtt.sdk.WebView webView, java.lang.String str) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(com.p314xaae8f345.p592x631407a.p603x745bd612.C4798x4a4e772d.TAG, "shouldOverrideUrlLoading url = " + str);
            if (!str.startsWith("http://unipay.sdk.android/?") && !str.startsWith("wsj://") && !str.startsWith("mqqapi://") && !str.startsWith("weixin://") && !str.startsWith("sms://")) {
                webView.loadUrl(str);
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(com.p314xaae8f345.p592x631407a.p603x745bd612.C4798x4a4e772d.TAG, "shouldOverrideUrlLoading loadUrl = ");
            }
            if (!str.startsWith("mqqapi://") && !str.startsWith("weixin://") && !str.startsWith("sms://")) {
                return true;
            }
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str));
            if (intent.resolveActivity(com.p314xaae8f345.p592x631407a.p603x745bd612.C4798x4a4e772d.this.f20725xd6cfe882.getPackageManager()) == null) {
                android.widget.Toast.makeText(com.p314xaae8f345.p592x631407a.p603x745bd612.C4798x4a4e772d.this.f20725xd6cfe882, "抱歉，你未安装相应客户端", 1).show();
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.w(com.p314xaae8f345.p592x631407a.p603x745bd612.C4798x4a4e772d.TAG, "shouldOverrideUrlLoading() intent.resolveActivity == Null ");
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

    public C4798x4a4e772d(android.app.Activity activity, com.tencent.smtt.sdk.WebView webView, com.p314xaae8f345.p592x631407a.p603x745bd612.InterfaceC4801x2ab9fa9 interfaceC4801x2ab9fa9) {
        this.f20727xe713eecc = null;
        this.f20725xd6cfe882 = null;
        this.f20723xf5bc2045 = null;
        this.f20725xd6cfe882 = activity;
        this.f20727xe713eecc = webView;
        this.f20723xf5bc2045 = interfaceC4801x2ab9fa9;
        m42013xfb04b8c9();
    }

    /* renamed from: InitWebView */
    private void m42013xfb04b8c9() {
        com.tencent.smtt.sdk.WebSettings settings = this.f20727xe713eecc.getSettings();
        settings.setJavaScriptEnabled(true);
        com.p314xaae8f345.p592x631407a.api.C4727x8a3e11bd.env.equals("test");
        settings.setDomStorageEnabled(true);
        settings.setAppCachePath(this.f20725xd6cfe882.getApplicationContext().getDir("cache", 0).getPath());
        settings.setAllowFileAccess(true);
        settings.setAppCacheEnabled(true);
        settings.setCacheMode(-1);
        try {
            settings.setSavePassword(false);
        } catch (java.lang.Exception unused) {
        }
        this.f20727xe713eecc.setScrollBarStyle(0);
        this.f20727xe713eecc.setWebChromeClient(this.f20724xb2be87f2);
        this.f20727xe713eecc.setWebViewClient(this.f20726x2eaa61d7);
        m42017x9bd1e915();
    }

    /* renamed from: removeInterface */
    private void m42017x9bd1e915() {
        try {
            java.lang.reflect.Method method = this.f20727xe713eecc.getClass().getMethod("removeJavascriptInterface", java.lang.String.class);
            if (method != null) {
                method.invoke(this.f20727xe713eecc, "searchBoxJavaBridge_");
                method.invoke(this.f20727xe713eecc, "accessibility");
                method.invoke(this.f20727xe713eecc, "accessibilityTraversal");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("removeJavascriptInterface", e17.toString());
        }
    }

    /* renamed from: getWebView */
    public com.tencent.smtt.sdk.WebView m42018x86b9ebe3() {
        return this.f20727xe713eecc;
    }

    /* renamed from: loadUrl */
    public void m42019x141096a9(java.lang.String str) {
        this.f20727xe713eecc.loadUrl(str);
    }
}
