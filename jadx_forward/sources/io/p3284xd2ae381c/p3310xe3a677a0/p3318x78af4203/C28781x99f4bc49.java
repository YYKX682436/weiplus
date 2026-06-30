package io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203;

/* renamed from: io.flutter.plugins.webviewflutter.CookieManagerHostApiImpl */
/* loaded from: classes13.dex */
public class C28781x99f4bc49 implements io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.CookieManagerHostApi {

    /* renamed from: binaryMessenger */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f71983x56f9c012;

    /* renamed from: instanceManager */
    private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 f71984xd32bb158;

    /* renamed from: proxy */
    private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28781x99f4bc49.CookieManagerProxy f71985x65fca6e;

    /* renamed from: sdkChecker */
    private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28781x99f4bc49.AndroidSdkChecker f71986xa24e561b;

    /* renamed from: io.flutter.plugins.webviewflutter.CookieManagerHostApiImpl$AndroidSdkChecker */
    /* loaded from: classes13.dex */
    public interface AndroidSdkChecker {
        /* renamed from: sdkIsAtLeast */
        boolean mo138946xe345c652(int i17);
    }

    /* renamed from: io.flutter.plugins.webviewflutter.CookieManagerHostApiImpl$CookieManagerProxy */
    /* loaded from: classes13.dex */
    public static class CookieManagerProxy {
        /* renamed from: getInstance */
        public android.webkit.CookieManager m138947x9cf0d20b() {
            return android.webkit.CookieManager.getInstance();
        }
    }

    public C28781x99f4bc49(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 c28897x97be6938) {
        this(interfaceC28679x1b8c77f2, c28897x97be6938, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28781x99f4bc49.CookieManagerProxy());
    }

    /* renamed from: getCookieManagerInstance */
    private android.webkit.CookieManager m138939x3b1df6a8(java.lang.Long l17) {
        android.webkit.CookieManager cookieManager = (android.webkit.CookieManager) this.f71984xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(cookieManager);
        return cookieManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$new$0 */
    public static /* synthetic */ boolean m138940x51ef5f0f(int i17) {
        return android.os.Build.VERSION.SDK_INT >= i17;
    }

    /* renamed from: removeCookiesPreL */
    private boolean m138941x13026e14(android.webkit.CookieManager cookieManager) {
        boolean hasCookies = cookieManager.hasCookies();
        if (hasCookies) {
            cookieManager.removeAllCookie();
        }
        return hasCookies;
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.CookieManagerHostApi
    /* renamed from: attachInstance */
    public void mo138942x68b3d1fa(java.lang.Long l17) {
        this.f71984xd32bb158.m139285xa3622bbd(this.f71985x65fca6e.m138947x9cf0d20b(), l17.longValue());
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.CookieManagerHostApi
    /* renamed from: removeAllCookies */
    public void mo138943xc95e7952(java.lang.Long l17, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.Result<java.lang.Boolean> result) {
        if (!this.f71986xa24e561b.mo138946xe345c652(21)) {
            result.mo138994x90b54003(java.lang.Boolean.valueOf(m138941x13026e14(m138939x3b1df6a8(l17))));
            return;
        }
        android.webkit.CookieManager m138939x3b1df6a8 = m138939x3b1df6a8(l17);
        java.util.Objects.requireNonNull(result);
        m138939x3b1df6a8.removeAllCookies(new android.webkit.ValueCallback() { // from class: io.flutter.plugins.webviewflutter.CookieManagerHostApiImpl$$a
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.Result.this.mo138994x90b54003((java.lang.Boolean) obj);
            }
        });
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.CookieManagerHostApi
    /* renamed from: setAcceptThirdPartyCookies */
    public void mo138944x8c9250e6(java.lang.Long l17, java.lang.Long l18, java.lang.Boolean bool) {
        if (!this.f71986xa24e561b.mo138946xe345c652(21)) {
            throw new java.lang.UnsupportedOperationException("`setAcceptThirdPartyCookies` is unsupported on versions below `Build.VERSION_CODES.LOLLIPOP`.");
        }
        android.webkit.CookieManager m138939x3b1df6a8 = m138939x3b1df6a8(l17);
        android.webkit.WebView webView = (android.webkit.WebView) this.f71984xd32bb158.m139290x9cf0d20b(l18.longValue());
        java.util.Objects.requireNonNull(webView);
        m138939x3b1df6a8.setAcceptThirdPartyCookies(webView, bool.booleanValue());
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.CookieManagerHostApi
    /* renamed from: setCookie */
    public void mo138945x78c6166(java.lang.Long l17, java.lang.String str, java.lang.String str2) {
        m138939x3b1df6a8(l17).setCookie(str, str2);
    }

    public C28781x99f4bc49(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 c28897x97be6938, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28781x99f4bc49.CookieManagerProxy cookieManagerProxy) {
        this(interfaceC28679x1b8c77f2, c28897x97be6938, cookieManagerProxy, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28783x7237ef9());
    }

    public C28781x99f4bc49(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 c28897x97be6938, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28781x99f4bc49.CookieManagerProxy cookieManagerProxy, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28781x99f4bc49.AndroidSdkChecker androidSdkChecker) {
        this.f71983x56f9c012 = interfaceC28679x1b8c77f2;
        this.f71984xd32bb158 = c28897x97be6938;
        this.f71985x65fca6e = cookieManagerProxy;
        this.f71986xa24e561b = androidSdkChecker;
    }
}
