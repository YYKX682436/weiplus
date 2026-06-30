package io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203;

/* renamed from: io.flutter.plugins.webviewflutter.WebViewClientFlutterApiImpl */
/* loaded from: classes16.dex */
public class C28930x527b81e2 extends io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewClientFlutterApi {

    /* renamed from: binaryMessenger */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f72114x56f9c012;

    /* renamed from: instanceManager */
    private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 f72115xd32bb158;

    /* renamed from: webViewFlutterApi */
    private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28958x4c1027f7 f72116x6e0c8557;

    public C28930x527b81e2(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 c28897x97be6938) {
        super(interfaceC28679x1b8c77f2);
        this.f72114x56f9c012 = interfaceC28679x1b8c77f2;
        this.f72115xd32bb158 = c28897x97be6938;
        this.f72116x6e0c8557 = new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28958x4c1027f7(interfaceC28679x1b8c77f2, c28897x97be6938);
    }

    /* renamed from: createWebResourceErrorData */
    public static io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebResourceErrorData m139349x3820838c(android.webkit.WebResourceError webResourceError) {
        return new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebResourceErrorData.Builder().m139121x6f5de1d3(java.lang.Long.valueOf(webResourceError.getErrorCode())).m139120x9713e3a(webResourceError.getDescription().toString()).m139119x59bc66e();
    }

    /* renamed from: createWebResourceRequestData */
    public static io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebResourceRequestData m139351x566b8213(android.webkit.WebResourceRequest webResourceRequest) {
        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebResourceRequestData.Builder m139141x77531af9 = new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebResourceRequestData.Builder().m139142xca029dad(webResourceRequest.getUrl().toString()).m139138x58ed6bb7(java.lang.Boolean.valueOf(webResourceRequest.isForMainFrame())).m139137x910f2751(java.lang.Boolean.valueOf(webResourceRequest.hasGesture())).m139140x181227e3(webResourceRequest.getMethod()).m139141x77531af9(webResourceRequest.getRequestHeaders() != null ? webResourceRequest.getRequestHeaders() : new java.util.HashMap<>());
        m139141x77531af9.m139139xbed9a528(java.lang.Boolean.valueOf(webResourceRequest.isRedirect()));
        return m139141x77531af9.m139136x59bc66e();
    }

    /* renamed from: getIdentifierForClient */
    private long m139352xea7b7015(android.webkit.WebViewClient webViewClient) {
        java.lang.Long m139289x102c196a = this.f72115xd32bb158.m139289x102c196a(webViewClient);
        if (m139289x102c196a != null) {
            return m139289x102c196a.longValue();
        }
        throw new java.lang.IllegalStateException("Could not find identifier for WebViewClient.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$doUpdateVisitedHistory$7 */
    public static /* synthetic */ void m139353x11e127ae(java.lang.Void r07) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onPageFinished$1 */
    public static /* synthetic */ void m139354x6a10bb6a(java.lang.Void r07) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onPageStarted$0 */
    public static /* synthetic */ void m139355xab9c5482(java.lang.Void r07) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onReceivedError$4 */
    public static /* synthetic */ void m139356x6ec91ffb(java.lang.Void r07) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onReceivedHttpAuthRequest$8 */
    public static /* synthetic */ void m139357x2011fe96(java.lang.Void r07) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onReceivedRequestError$2 */
    public static /* synthetic */ void m139358x59533a44(java.lang.Void r07) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onReceivedRequestError$3 */
    public static /* synthetic */ void m139359x59533a45(java.lang.Void r07) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$requestLoading$5 */
    public static /* synthetic */ void m139360x7b9c303b(java.lang.Void r07) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$urlLoading$6 */
    public static /* synthetic */ void m139361xd651bfdc(java.lang.Void r07) {
    }

    /* renamed from: doUpdateVisitedHistory */
    public void m139362x8268445e(android.webkit.WebViewClient webViewClient, android.webkit.WebView webView, java.lang.String str, boolean z17, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewClientFlutterApi.Reply<java.lang.Void> reply) {
        this.f72116x6e0c8557.m139391xaf65a0fc(webView, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28932x92b026c0());
        java.lang.Long m139289x102c196a = this.f72115xd32bb158.m139289x102c196a(webView);
        java.util.Objects.requireNonNull(m139289x102c196a);
        m139190x8268445e(java.lang.Long.valueOf(m139352xea7b7015(webViewClient)), m139289x102c196a, str, java.lang.Boolean.valueOf(z17), reply);
    }

    /* renamed from: onPageFinished */
    public void m139363xe1e213a0(android.webkit.WebViewClient webViewClient, android.webkit.WebView webView, java.lang.String str, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewClientFlutterApi.Reply<java.lang.Void> reply) {
        this.f72116x6e0c8557.m139391xaf65a0fc(webView, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28938x92b026c6());
        java.lang.Long m139289x102c196a = this.f72115xd32bb158.m139289x102c196a(webView);
        java.util.Objects.requireNonNull(m139289x102c196a);
        m139191xe1e213a0(java.lang.Long.valueOf(m139352xea7b7015(webViewClient)), m139289x102c196a, str, reply);
    }

    /* renamed from: onPageStarted */
    public void m139364x65f3cf93(android.webkit.WebViewClient webViewClient, android.webkit.WebView webView, java.lang.String str, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewClientFlutterApi.Reply<java.lang.Void> reply) {
        this.f72116x6e0c8557.m139391xaf65a0fc(webView, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28934x92b026c2());
        java.lang.Long m139289x102c196a = this.f72115xd32bb158.m139289x102c196a(webView);
        java.util.Objects.requireNonNull(m139289x102c196a);
        m139192x65f3cf93(java.lang.Long.valueOf(m139352xea7b7015(webViewClient)), m139289x102c196a, str, reply);
    }

    /* renamed from: onReceivedError */
    public void m139365xa740e108(android.webkit.WebViewClient webViewClient, android.webkit.WebView webView, java.lang.Long l17, java.lang.String str, java.lang.String str2, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewClientFlutterApi.Reply<java.lang.Void> reply) {
        this.f72116x6e0c8557.m139391xaf65a0fc(webView, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28935x92b026c3());
        java.lang.Long m139289x102c196a = this.f72115xd32bb158.m139289x102c196a(webView);
        java.util.Objects.requireNonNull(m139289x102c196a);
        m139193xa740e108(java.lang.Long.valueOf(m139352xea7b7015(webViewClient)), m139289x102c196a, l17, str, str2, reply);
    }

    /* renamed from: onReceivedHttpAuthRequest */
    public void m139366x2255491f(android.webkit.WebViewClient webViewClient, android.webkit.WebView webView, android.webkit.HttpAuthHandler httpAuthHandler, java.lang.String str, java.lang.String str2, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewClientFlutterApi.Reply<java.lang.Void> reply) {
        new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28895xc0490f8(this.f72114x56f9c012, this.f72115xd32bb158).m139279xaf65a0fc(httpAuthHandler, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28933x92b026c1());
        java.lang.Long m139289x102c196a = this.f72115xd32bb158.m139289x102c196a(webViewClient);
        java.util.Objects.requireNonNull(m139289x102c196a);
        java.lang.Long m139289x102c196a2 = this.f72115xd32bb158.m139289x102c196a(webView);
        java.util.Objects.requireNonNull(m139289x102c196a2);
        java.lang.Long m139289x102c196a3 = this.f72115xd32bb158.m139289x102c196a(httpAuthHandler);
        java.util.Objects.requireNonNull(m139289x102c196a3);
        m139194x2255491f(m139289x102c196a, m139289x102c196a2, m139289x102c196a3, str, str2, reply);
    }

    /* renamed from: onReceivedRequestError */
    public void m139367x78e441b9(android.webkit.WebViewClient webViewClient, android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewClientFlutterApi.Reply<java.lang.Void> reply) {
        this.f72116x6e0c8557.m139391xaf65a0fc(webView, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28937x92b026c5());
        java.lang.Long m139289x102c196a = this.f72115xd32bb158.m139289x102c196a(webView);
        java.util.Objects.requireNonNull(m139289x102c196a);
        m139195x78e441b9(java.lang.Long.valueOf(m139352xea7b7015(webViewClient)), m139289x102c196a, m139351x566b8213(webResourceRequest), m139349x3820838c(webResourceError), reply);
    }

    /* renamed from: requestLoading */
    public void m139369xa56e57ad(android.webkit.WebViewClient webViewClient, android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewClientFlutterApi.Reply<java.lang.Void> reply) {
        this.f72116x6e0c8557.m139391xaf65a0fc(webView, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28931x92b026bf());
        java.lang.Long m139289x102c196a = this.f72115xd32bb158.m139289x102c196a(webView);
        java.util.Objects.requireNonNull(m139289x102c196a);
        m139196xa56e57ad(java.lang.Long.valueOf(m139352xea7b7015(webViewClient)), m139289x102c196a, m139351x566b8213(webResourceRequest), reply);
    }

    /* renamed from: urlLoading */
    public void m139370xf65288cd(android.webkit.WebViewClient webViewClient, android.webkit.WebView webView, java.lang.String str, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewClientFlutterApi.Reply<java.lang.Void> reply) {
        this.f72116x6e0c8557.m139391xaf65a0fc(webView, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28936x92b026c4());
        java.lang.Long m139289x102c196a = this.f72115xd32bb158.m139289x102c196a(webView);
        java.util.Objects.requireNonNull(m139289x102c196a);
        m139197xf65288cd(java.lang.Long.valueOf(m139352xea7b7015(webViewClient)), m139289x102c196a, str, reply);
    }

    /* renamed from: createWebResourceErrorData */
    public static io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebResourceErrorData m139350x3820838c(y4.k kVar) {
        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebResourceErrorData.Builder builder = new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebResourceErrorData.Builder();
        z4.b0 b0Var = (z4.b0) kVar;
        b0Var.getClass();
        z4.e0.f551593b.getClass();
        if (b0Var.f551589a == null) {
            b0Var.f551589a = (android.webkit.WebResourceError) z4.f0.f551599a.f551605a.m154459x69427f79(java.lang.reflect.Proxy.getInvocationHandler(b0Var.f551590b));
        }
        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebResourceErrorData.Builder m139121x6f5de1d3 = builder.m139121x6f5de1d3(java.lang.Long.valueOf(z4.n.f(b0Var.f551589a)));
        z4.e0.f551592a.getClass();
        if (b0Var.f551589a == null) {
            b0Var.f551589a = (android.webkit.WebResourceError) z4.f0.f551599a.f551605a.m154459x69427f79(java.lang.reflect.Proxy.getInvocationHandler(b0Var.f551590b));
        }
        return m139121x6f5de1d3.m139120x9713e3a(z4.n.e(b0Var.f551589a).toString()).m139119x59bc66e();
    }

    /* renamed from: onReceivedRequestError */
    public void m139368x78e441b9(android.webkit.WebViewClient webViewClient, android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, y4.k kVar, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewClientFlutterApi.Reply<java.lang.Void> reply) {
        this.f72116x6e0c8557.m139391xaf65a0fc(webView, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28939x92b026c7());
        java.lang.Long m139289x102c196a = this.f72115xd32bb158.m139289x102c196a(webView);
        java.util.Objects.requireNonNull(m139289x102c196a);
        m139195x78e441b9(java.lang.Long.valueOf(m139352xea7b7015(webViewClient)), m139289x102c196a, m139351x566b8213(webResourceRequest), m139350x3820838c(kVar), reply);
    }
}
