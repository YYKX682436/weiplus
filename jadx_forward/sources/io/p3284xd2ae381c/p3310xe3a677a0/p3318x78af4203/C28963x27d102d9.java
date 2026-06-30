package io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203;

/* renamed from: io.flutter.plugins.webviewflutter.WebViewHostApiImpl */
/* loaded from: classes13.dex */
public class C28963x27d102d9 implements io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi {

    /* renamed from: binaryMessenger */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f72130x56f9c012;

    /* renamed from: context */
    private android.content.Context f72131x38b735af;

    /* renamed from: instanceManager */
    private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 f72132xd32bb158;

    /* renamed from: webViewProxy */
    private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28963x27d102d9.WebViewProxy f72133xeec751d5;

    /* renamed from: io.flutter.plugins.webviewflutter.WebViewHostApiImpl$WebViewPlatformView */
    /* loaded from: classes13.dex */
    public static class WebViewPlatformView extends android.webkit.WebView implements io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8 {
        private io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28958x4c1027f7 api;

        /* renamed from: currentWebChromeClient */
        private io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28916x5eecba99.SecureWebChromeClient f72134x96369a0;

        /* renamed from: currentWebViewClient */
        private android.webkit.WebViewClient f72135xfd9f384b;

        /* renamed from: sdkChecker */
        private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28963x27d102d9.WebViewPlatformView.AndroidSdkChecker f72136xa24e561b;

        /* renamed from: io.flutter.plugins.webviewflutter.WebViewHostApiImpl$WebViewPlatformView$AndroidSdkChecker */
        /* loaded from: classes13.dex */
        public interface AndroidSdkChecker {
            /* renamed from: sdkIsAtLeast */
            boolean mo139402xe345c652(int i17);
        }

        public WebViewPlatformView(android.content.Context context, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 c28897x97be6938) {
            this(context, interfaceC28679x1b8c77f2, c28897x97be6938, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28966xa5ff301c());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$new$0 */
        public static /* synthetic */ boolean m139403x51ef5f0f(int i17) {
            return android.os.Build.VERSION.SDK_INT >= i17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onScrollChanged$1 */
        public static /* synthetic */ void m139404x2f7fc678(java.lang.Void r07) {
        }

        /* renamed from: tryFindFlutterView */
        private io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1 m139405x9548762d() {
            android.view.ViewParent viewParent = this;
            while (viewParent.getParent() != null) {
                viewParent = viewParent.getParent();
                if (viewParent instanceof io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1) {
                    return (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1) viewParent;
                }
            }
            return null;
        }

        @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8
        /* renamed from: dispose */
        public void mo31847x63a5261f() {
        }

        @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8
        /* renamed from: getView */
        public android.view.View mo31848xfb86a31b() {
            return this;
        }

        @Override // android.webkit.WebView
        public android.webkit.WebChromeClient getWebChromeClient() {
            return this.f72134x96369a0;
        }

        @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1 m139405x9548762d;
            super.onAttachedToWindow();
            if (!this.f72136xa24e561b.mo139402xe345c652(26) || (m139405x9548762d = m139405x9548762d()) == null) {
                return;
            }
            m139405x9548762d.setImportantForAutofill(1);
        }

        @Override // android.webkit.WebView, android.view.View
        public void onScrollChanged(int i17, int i18, int i19, int i27) {
            super.onScrollChanged(i17, i18, i19, i27);
            this.api.m139392x7a6f2788(this, java.lang.Long.valueOf(i17), java.lang.Long.valueOf(i18), java.lang.Long.valueOf(i19), java.lang.Long.valueOf(i27), new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28965xa5ff301b());
        }

        /* renamed from: setApi */
        public void m139406xca025258(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28958x4c1027f7 c28958x4c1027f7) {
            this.api = c28958x4c1027f7;
        }

        @Override // android.webkit.WebView
        public void setWebChromeClient(android.webkit.WebChromeClient webChromeClient) {
            super.setWebChromeClient(webChromeClient);
            if (!(webChromeClient instanceof io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28916x5eecba99.SecureWebChromeClient)) {
                throw new java.lang.AssertionError("Client must be a SecureWebChromeClient.");
            }
            io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28916x5eecba99.SecureWebChromeClient secureWebChromeClient = (io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28916x5eecba99.SecureWebChromeClient) webChromeClient;
            this.f72134x96369a0 = secureWebChromeClient;
            secureWebChromeClient.m139329x23d27c02(this.f72135xfd9f384b);
        }

        @Override // android.webkit.WebView
        public void setWebViewClient(android.webkit.WebViewClient webViewClient) {
            super.setWebViewClient(webViewClient);
            this.f72135xfd9f384b = webViewClient;
            this.f72134x96369a0.m139329x23d27c02(webViewClient);
        }

        public WebViewPlatformView(android.content.Context context, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 c28897x97be6938, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28963x27d102d9.WebViewPlatformView.AndroidSdkChecker androidSdkChecker) {
            super(context);
            this.f72135xfd9f384b = new android.webkit.WebViewClient();
            this.f72134x96369a0 = new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28916x5eecba99.SecureWebChromeClient();
            this.api = new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28958x4c1027f7(interfaceC28679x1b8c77f2, c28897x97be6938);
            this.f72136xa24e561b = androidSdkChecker;
            setWebViewClient(this.f72135xfd9f384b);
            setWebChromeClient(this.f72134x96369a0);
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.WebViewHostApiImpl$WebViewProxy */
    /* loaded from: classes13.dex */
    public static class WebViewProxy {
        /* renamed from: createWebView */
        public io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28963x27d102d9.WebViewPlatformView m139407xced3d37d(android.content.Context context, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 c28897x97be6938) {
            return new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28963x27d102d9.WebViewPlatformView(context, interfaceC28679x1b8c77f2, c28897x97be6938);
        }

        /* renamed from: setWebContentsDebuggingEnabled */
        public void m139408xc9bc595f(boolean z17) {
            android.webkit.WebView.setWebContentsDebuggingEnabled(z17);
        }
    }

    public C28963x27d102d9(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 c28897x97be6938, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28963x27d102d9.WebViewProxy webViewProxy, android.content.Context context) {
        this.f72132xd32bb158 = c28897x97be6938;
        this.f72130x56f9c012 = interfaceC28679x1b8c77f2;
        this.f72133xeec751d5 = webViewProxy;
        this.f72131x38b735af = context;
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi
    /* renamed from: addJavaScriptChannel */
    public void mo139240xfaca6415(java.lang.Long l17, java.lang.Long l18) {
        android.webkit.WebView webView = (android.webkit.WebView) this.f72132xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(webView);
        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28900x16eda696 c28900x16eda696 = (io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28900x16eda696) this.f72132xd32bb158.m139290x9cf0d20b(l18.longValue());
        java.util.Objects.requireNonNull(c28900x16eda696);
        webView.addJavascriptInterface(c28900x16eda696, c28900x16eda696.f72080x97300a61);
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi
    /* renamed from: canGoBack */
    public java.lang.Boolean mo139241xed1a21df(java.lang.Long l17) {
        android.webkit.WebView webView = (android.webkit.WebView) this.f72132xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(webView);
        return java.lang.Boolean.valueOf(webView.canGoBack());
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi
    /* renamed from: canGoForward */
    public java.lang.Boolean mo139242xc062b2cd(java.lang.Long l17) {
        android.webkit.WebView webView = (android.webkit.WebView) this.f72132xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(webView);
        return java.lang.Boolean.valueOf(webView.canGoForward());
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi
    /* renamed from: clearCache */
    public void mo139243xd2bef135(java.lang.Long l17, java.lang.Boolean bool) {
        android.webkit.WebView webView = (android.webkit.WebView) this.f72132xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(webView);
        webView.clearCache(bool.booleanValue());
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi
    /* renamed from: create */
    public void mo139244xaf65a0fc(java.lang.Long l17) {
        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28786xc3bbfc98 c28786xc3bbfc98 = new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28786xc3bbfc98();
        android.hardware.display.DisplayManager displayManager = (android.hardware.display.DisplayManager) this.f72131x38b735af.getSystemService("display");
        c28786xc3bbfc98.m138954xfed94b35(displayManager);
        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28963x27d102d9.WebViewPlatformView m139407xced3d37d = this.f72133xeec751d5.m139407xced3d37d(this.f72131x38b735af, this.f72130x56f9c012, this.f72132xd32bb158);
        c28786xc3bbfc98.m138953x9b50b3a(displayManager);
        this.f72132xd32bb158.m139285xa3622bbd(m139407xced3d37d, l17.longValue());
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi
    /* renamed from: evaluateJavascript */
    public void mo139245x738236e6(java.lang.Long l17, java.lang.String str, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.Result<java.lang.String> result) {
        android.webkit.WebView webView = (android.webkit.WebView) this.f72132xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(webView);
        java.util.Objects.requireNonNull(result);
        webView.evaluateJavascript(str, new android.webkit.ValueCallback() { // from class: io.flutter.plugins.webviewflutter.WebViewHostApiImpl$$a
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.Result.this.mo138994x90b54003((java.lang.String) obj);
            }
        });
    }

    /* renamed from: getInstanceManager */
    public io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 m139400xb78d8322() {
        return this.f72132xd32bb158;
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi
    /* renamed from: getScrollPosition */
    public io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewPoint mo139246x6a71940c(java.lang.Long l17) {
        java.util.Objects.requireNonNull((android.webkit.WebView) this.f72132xd32bb158.m139290x9cf0d20b(l17.longValue()));
        return new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewPoint.Builder().m139274x35d036(java.lang.Long.valueOf(r4.getScrollX())).m139275x35d037(java.lang.Long.valueOf(r4.getScrollY())).m139273x59bc66e();
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi
    /* renamed from: getScrollX */
    public java.lang.Long mo139247xb0a42ef5(java.lang.Long l17) {
        java.util.Objects.requireNonNull((android.webkit.WebView) this.f72132xd32bb158.m139290x9cf0d20b(l17.longValue()));
        return java.lang.Long.valueOf(r4.getScrollX());
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi
    /* renamed from: getScrollY */
    public java.lang.Long mo139248xb0a42ef6(java.lang.Long l17) {
        java.util.Objects.requireNonNull((android.webkit.WebView) this.f72132xd32bb158.m139290x9cf0d20b(l17.longValue()));
        return java.lang.Long.valueOf(r4.getScrollY());
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi
    /* renamed from: getTitle */
    public java.lang.String mo139249x7531c8a2(java.lang.Long l17) {
        android.webkit.WebView webView = (android.webkit.WebView) this.f72132xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(webView);
        return webView.getTitle();
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi
    /* renamed from: getUrl */
    public java.lang.String mo139250xb5887639(java.lang.Long l17) {
        android.webkit.WebView webView = (android.webkit.WebView) this.f72132xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(webView);
        return webView.getUrl();
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi
    /* renamed from: goBack */
    public void mo139251xb5fed1ef(java.lang.Long l17) {
        android.webkit.WebView webView = (android.webkit.WebView) this.f72132xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(webView);
        webView.goBack();
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi
    /* renamed from: goForward */
    public void mo139252xed0748bd(java.lang.Long l17) {
        android.webkit.WebView webView = (android.webkit.WebView) this.f72132xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(webView);
        webView.goForward();
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi
    /* renamed from: loadData */
    public void mo139253x6dfa45b0(java.lang.Long l17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.webkit.WebView webView = (android.webkit.WebView) this.f72132xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(webView);
        webView.loadData(str, str2, str3);
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi
    /* renamed from: loadDataWithBaseUrl */
    public void mo139254x9b341968(java.lang.Long l17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        android.webkit.WebView webView = (android.webkit.WebView) this.f72132xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(webView);
        webView.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi
    /* renamed from: loadUrl */
    public void mo139255x141096a9(java.lang.Long l17, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        android.webkit.WebView webView = (android.webkit.WebView) this.f72132xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(webView);
        webView.loadUrl(str, map);
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi
    /* renamed from: postUrl */
    public void mo139256xe8ae70af(java.lang.Long l17, java.lang.String str, byte[] bArr) {
        android.webkit.WebView webView = (android.webkit.WebView) this.f72132xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(webView);
        webView.postUrl(str, bArr);
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi
    /* renamed from: reload */
    public void mo139257xc84a8199(java.lang.Long l17) {
        android.webkit.WebView webView = (android.webkit.WebView) this.f72132xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(webView);
        webView.reload();
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi
    /* renamed from: removeJavaScriptChannel */
    public void mo139258x5a2a4692(java.lang.Long l17, java.lang.Long l18) {
        android.webkit.WebView webView = (android.webkit.WebView) this.f72132xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(webView);
        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28900x16eda696 c28900x16eda696 = (io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28900x16eda696) this.f72132xd32bb158.m139290x9cf0d20b(l18.longValue());
        java.util.Objects.requireNonNull(c28900x16eda696);
        webView.removeJavascriptInterface(c28900x16eda696.f72080x97300a61);
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi
    /* renamed from: scrollBy */
    public void mo139259xe8077004(java.lang.Long l17, java.lang.Long l18, java.lang.Long l19) {
        android.webkit.WebView webView = (android.webkit.WebView) this.f72132xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(webView);
        webView.scrollBy(l18.intValue(), l19.intValue());
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi
    /* renamed from: scrollTo */
    public void mo139260xe8077228(java.lang.Long l17, java.lang.Long l18, java.lang.Long l19) {
        android.webkit.WebView webView = (android.webkit.WebView) this.f72132xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(webView);
        webView.scrollTo(l18.intValue(), l19.intValue());
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi
    /* renamed from: setBackgroundColor */
    public void mo139261x67f06213(java.lang.Long l17, java.lang.Long l18) {
        android.webkit.WebView webView = (android.webkit.WebView) this.f72132xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(webView);
        webView.setBackgroundColor(l18.intValue());
    }

    /* renamed from: setContext */
    public void m139401xe9f5beed(android.content.Context context) {
        this.f72131x38b735af = context;
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi
    /* renamed from: setDownloadListener */
    public void mo139262x7619e5de(java.lang.Long l17, java.lang.Long l18) {
        android.webkit.WebView webView = (android.webkit.WebView) this.f72132xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(webView);
        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 c28897x97be6938 = this.f72132xd32bb158;
        java.util.Objects.requireNonNull(l18);
        webView.setDownloadListener((android.webkit.DownloadListener) c28897x97be6938.m139290x9cf0d20b(l18.longValue()));
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi
    /* renamed from: setWebChromeClient */
    public void mo139263x6fd49b97(java.lang.Long l17, java.lang.Long l18) {
        android.webkit.WebView webView = (android.webkit.WebView) this.f72132xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(webView);
        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 c28897x97be6938 = this.f72132xd32bb158;
        java.util.Objects.requireNonNull(l18);
        webView.setWebChromeClient((android.webkit.WebChromeClient) c28897x97be6938.m139290x9cf0d20b(l18.longValue()));
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi
    /* renamed from: setWebContentsDebuggingEnabled */
    public void mo139264xc9bc595f(java.lang.Boolean bool) {
        this.f72133xeec751d5.m139408xc9bc595f(bool.booleanValue());
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi
    /* renamed from: setWebViewClient */
    public void mo139265x23d27c02(java.lang.Long l17, java.lang.Long l18) {
        android.webkit.WebView webView = (android.webkit.WebView) this.f72132xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(webView);
        webView.setWebViewClient((android.webkit.WebViewClient) this.f72132xd32bb158.m139290x9cf0d20b(l18.longValue()));
    }
}
