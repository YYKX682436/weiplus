package io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203;

/* renamed from: io.flutter.plugins.webviewflutter.WebViewClientHostApiImpl */
/* loaded from: classes16.dex */
public class C28940xccee8ce implements io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewClientHostApi {

    /* renamed from: flutterApi */
    private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28930x527b81e2 f72117x2014845e;

    /* renamed from: instanceManager */
    private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 f72118xd32bb158;

    /* renamed from: webViewClientCreator */
    private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28940xccee8ce.WebViewClientCreator f72119xa5d48a48;

    /* renamed from: io.flutter.plugins.webviewflutter.WebViewClientHostApiImpl$WebViewClientCompatImpl */
    /* loaded from: classes16.dex */
    public static class WebViewClientCompatImpl extends p012xc85e97e9.p116xd0ce2302.AbstractC1192x89b53dc6 {

        /* renamed from: flutterApi */
        private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28930x527b81e2 f72120x2014845e;

        /* renamed from: returnValueForShouldOverrideUrlLoading */
        private boolean f72121xaceabbd4 = false;

        public WebViewClientCompatImpl(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28930x527b81e2 c28930x527b81e2) {
            this.f72120x2014845e = c28930x527b81e2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$doUpdateVisitedHistory$6 */
        public static /* synthetic */ void m139371x11e127ad(java.lang.Void r07) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onPageFinished$1 */
        public static /* synthetic */ void m139372x6a10bb6a(java.lang.Void r07) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onPageStarted$0 */
        public static /* synthetic */ void m139373xab9c5482(java.lang.Void r07) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onReceivedError$2 */
        public static /* synthetic */ void m139374x6ec91ff9(java.lang.Void r07) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onReceivedError$3 */
        public static /* synthetic */ void m139375x6ec91ffa(java.lang.Void r07) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onReceivedHttpAuthRequest$7 */
        public static /* synthetic */ void m139376x2011fe95(java.lang.Void r07) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$shouldOverrideUrlLoading$4 */
        public static /* synthetic */ void m139377xc6a80159(java.lang.Void r07) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$shouldOverrideUrlLoading$5 */
        public static /* synthetic */ void m139378xc6a8015a(java.lang.Void r07) {
        }

        @Override // android.webkit.WebViewClient
        public void doUpdateVisitedHistory(android.webkit.WebView webView, java.lang.String str, boolean z17) {
            this.f72120x2014845e.m139362x8268445e(this, webView, str, z17, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28942x8f4246b2());
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
            this.f72120x2014845e.m139363xe1e213a0(this, webView, str, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28943x8f4246b3());
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
            this.f72120x2014845e.m139364x65f3cf93(this, webView, str, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28948x8f4246b8());
        }

        @Override // p012xc85e97e9.p116xd0ce2302.AbstractC1192x89b53dc6
        /* renamed from: onReceivedError */
        public void mo8352xa740e108(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, y4.k kVar) {
            this.f72120x2014845e.m139368x78e441b9(this, webView, webResourceRequest, kVar, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28944x8f4246b4());
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(android.webkit.WebView webView, android.webkit.HttpAuthHandler httpAuthHandler, java.lang.String str, java.lang.String str2) {
            this.f72120x2014845e.m139366x2255491f(this, webView, httpAuthHandler, str, str2, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28941x8f4246b1());
        }

        @Override // android.webkit.WebViewClient
        public void onUnhandledKeyEvent(android.webkit.WebView webView, android.view.KeyEvent keyEvent) {
        }

        /* renamed from: setReturnValueForShouldOverrideUrlLoading */
        public void m139379x21ca8ad6(boolean z17) {
            this.f72121xaceabbd4 = z17;
        }

        @Override // android.webkit.WebViewClient, org.p3343x72743996.p3360x5ff5cf14.InterfaceC29672x58bdd76b
        public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
            this.f72120x2014845e.m139369xa56e57ad(this, webView, webResourceRequest, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28946x8f4246b6());
            return this.f72121xaceabbd4;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(android.webkit.WebView webView, int i17, java.lang.String str, java.lang.String str2) {
            this.f72120x2014845e.m139365xa740e108(this, webView, java.lang.Long.valueOf(i17), str, str2, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28947x8f4246b7());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
            this.f72120x2014845e.m139370xf65288cd(this, webView, str, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28945x8f4246b5());
            return this.f72121xaceabbd4;
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.WebViewClientHostApiImpl$WebViewClientCreator */
    /* loaded from: classes16.dex */
    public static class WebViewClientCreator {
        /* renamed from: createWebViewClient */
        public android.webkit.WebViewClient m139380x344c61a8(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28930x527b81e2 c28930x527b81e2) {
            return new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28940xccee8ce.WebViewClientImpl(c28930x527b81e2);
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.WebViewClientHostApiImpl$WebViewClientImpl */
    /* loaded from: classes16.dex */
    public static class WebViewClientImpl extends android.webkit.WebViewClient {

        /* renamed from: flutterApi */
        private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28930x527b81e2 f72122x2014845e;

        /* renamed from: returnValueForShouldOverrideUrlLoading */
        private boolean f72123xaceabbd4 = false;

        public WebViewClientImpl(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28930x527b81e2 c28930x527b81e2) {
            this.f72122x2014845e = c28930x527b81e2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$doUpdateVisitedHistory$6 */
        public static /* synthetic */ void m139381x11e127ad(java.lang.Void r07) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onPageFinished$1 */
        public static /* synthetic */ void m139382x6a10bb6a(java.lang.Void r07) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onPageStarted$0 */
        public static /* synthetic */ void m139383xab9c5482(java.lang.Void r07) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onReceivedError$2 */
        public static /* synthetic */ void m139384x6ec91ff9(java.lang.Void r07) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onReceivedError$3 */
        public static /* synthetic */ void m139385x6ec91ffa(java.lang.Void r07) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onReceivedHttpAuthRequest$7 */
        public static /* synthetic */ void m139386x2011fe95(java.lang.Void r07) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$shouldOverrideUrlLoading$4 */
        public static /* synthetic */ void m139387xc6a80159(java.lang.Void r07) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$shouldOverrideUrlLoading$5 */
        public static /* synthetic */ void m139388xc6a8015a(java.lang.Void r07) {
        }

        @Override // android.webkit.WebViewClient
        public void doUpdateVisitedHistory(android.webkit.WebView webView, java.lang.String str, boolean z17) {
            this.f72122x2014845e.m139362x8268445e(this, webView, str, z17, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28951xbd467e15());
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
            this.f72122x2014845e.m139363xe1e213a0(this, webView, str, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28950xbd467e14());
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
            this.f72122x2014845e.m139364x65f3cf93(this, webView, str, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28949xbd467e13());
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
            this.f72122x2014845e.m139367x78e441b9(this, webView, webResourceRequest, webResourceError, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28955xbd467e19());
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(android.webkit.WebView webView, android.webkit.HttpAuthHandler httpAuthHandler, java.lang.String str, java.lang.String str2) {
            this.f72122x2014845e.m139366x2255491f(this, webView, httpAuthHandler, str, str2, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28956xbd467e1a());
        }

        @Override // android.webkit.WebViewClient
        public void onUnhandledKeyEvent(android.webkit.WebView webView, android.view.KeyEvent keyEvent) {
        }

        /* renamed from: setReturnValueForShouldOverrideUrlLoading */
        public void m139389x21ca8ad6(boolean z17) {
            this.f72123xaceabbd4 = z17;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
            this.f72122x2014845e.m139369xa56e57ad(this, webView, webResourceRequest, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28954xbd467e18());
            return this.f72123xaceabbd4;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(android.webkit.WebView webView, int i17, java.lang.String str, java.lang.String str2) {
            this.f72122x2014845e.m139365xa740e108(this, webView, java.lang.Long.valueOf(i17), str, str2, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28952xbd467e16());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
            this.f72122x2014845e.m139370xf65288cd(this, webView, str, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28953xbd467e17());
            return this.f72123xaceabbd4;
        }
    }

    public C28940xccee8ce(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 c28897x97be6938, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28940xccee8ce.WebViewClientCreator webViewClientCreator, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28930x527b81e2 c28930x527b81e2) {
        this.f72118xd32bb158 = c28897x97be6938;
        this.f72119xa5d48a48 = webViewClientCreator;
        this.f72117x2014845e = c28930x527b81e2;
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewClientHostApi
    /* renamed from: create */
    public void mo139204xaf65a0fc(java.lang.Long l17) {
        this.f72118xd32bb158.m139285xa3622bbd(this.f72119xa5d48a48.m139380x344c61a8(this.f72117x2014845e), l17.longValue());
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewClientHostApi
    /* renamed from: setSynchronousReturnValueForShouldOverrideUrlLoading */
    public void mo139205xe8c4c03b(java.lang.Long l17, java.lang.Boolean bool) {
        android.webkit.WebViewClient webViewClient = (android.webkit.WebViewClient) this.f72118xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(webViewClient);
        if (webViewClient instanceof io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28940xccee8ce.WebViewClientCompatImpl) {
            ((io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28940xccee8ce.WebViewClientCompatImpl) webViewClient).m139379x21ca8ad6(bool.booleanValue());
        } else {
            if (!(webViewClient instanceof io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28940xccee8ce.WebViewClientImpl)) {
                throw new java.lang.IllegalStateException("This WebViewClient doesn't support setting the returnValueForShouldOverrideUrlLoading.");
            }
            ((io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28940xccee8ce.WebViewClientImpl) webViewClient).m139389x21ca8ad6(bool.booleanValue());
        }
    }
}
