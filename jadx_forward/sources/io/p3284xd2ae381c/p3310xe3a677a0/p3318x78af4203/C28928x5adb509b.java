package io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203;

/* renamed from: io.flutter.plugins.webviewflutter.WebSettingsHostApiImpl */
/* loaded from: classes13.dex */
public class C28928x5adb509b implements io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi {

    /* renamed from: instanceManager */
    private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 f72110xd32bb158;

    /* renamed from: webSettingsCreator */
    private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28928x5adb509b.WebSettingsCreator f72111x56c05895;

    /* renamed from: io.flutter.plugins.webviewflutter.WebSettingsHostApiImpl$WebSettingsCreator */
    /* loaded from: classes13.dex */
    public static class WebSettingsCreator {
        /* renamed from: createWebSettings */
        public android.webkit.WebSettings m139347xdff728fb(android.webkit.WebView webView) {
            return webView.getSettings();
        }
    }

    public C28928x5adb509b(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 c28897x97be6938, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28928x5adb509b.WebSettingsCreator webSettingsCreator) {
        this.f72110xd32bb158 = c28897x97be6938;
        this.f72111x56c05895 = webSettingsCreator;
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi
    /* renamed from: create */
    public void mo139160xaf65a0fc(java.lang.Long l17, java.lang.Long l18) {
        android.webkit.WebView webView = (android.webkit.WebView) this.f72110xd32bb158.m139290x9cf0d20b(l18.longValue());
        java.util.Objects.requireNonNull(webView);
        this.f72110xd32bb158.m139285xa3622bbd(this.f72111x56c05895.m139347xdff728fb(webView), l17.longValue());
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi
    /* renamed from: getUserAgentString */
    public java.lang.String mo139161xb9044875(java.lang.Long l17) {
        android.webkit.WebSettings webSettings = (android.webkit.WebSettings) this.f72110xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(webSettings);
        return webSettings.getUserAgentString();
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi
    /* renamed from: setAllowFileAccess */
    public void mo139162x5f10ad67(java.lang.Long l17, java.lang.Boolean bool) {
        android.webkit.WebSettings webSettings = (android.webkit.WebSettings) this.f72110xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(webSettings);
        webSettings.setAllowFileAccess(bool.booleanValue());
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi
    /* renamed from: setBuiltInZoomControls */
    public void mo139163x463017ca(java.lang.Long l17, java.lang.Boolean bool) {
        android.webkit.WebSettings webSettings = (android.webkit.WebSettings) this.f72110xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(webSettings);
        webSettings.setBuiltInZoomControls(bool.booleanValue());
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi
    /* renamed from: setDisplayZoomControls */
    public void mo139164xf52941c9(java.lang.Long l17, java.lang.Boolean bool) {
        android.webkit.WebSettings webSettings = (android.webkit.WebSettings) this.f72110xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(webSettings);
        webSettings.setDisplayZoomControls(bool.booleanValue());
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi
    /* renamed from: setDomStorageEnabled */
    public void mo139165xea71b9e6(java.lang.Long l17, java.lang.Boolean bool) {
        android.webkit.WebSettings webSettings = (android.webkit.WebSettings) this.f72110xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(webSettings);
        webSettings.setDomStorageEnabled(bool.booleanValue());
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi
    /* renamed from: setJavaScriptCanOpenWindowsAutomatically */
    public void mo139166x6b8ba2b(java.lang.Long l17, java.lang.Boolean bool) {
        android.webkit.WebSettings webSettings = (android.webkit.WebSettings) this.f72110xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(webSettings);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(bool.booleanValue());
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi
    /* renamed from: setJavaScriptEnabled */
    public void mo139167xcef808b2(java.lang.Long l17, java.lang.Boolean bool) {
        android.webkit.WebSettings webSettings = (android.webkit.WebSettings) this.f72110xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(webSettings);
        webSettings.setJavaScriptEnabled(bool.booleanValue());
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi
    /* renamed from: setLoadWithOverviewMode */
    public void mo139168x7c25ab2a(java.lang.Long l17, java.lang.Boolean bool) {
        android.webkit.WebSettings webSettings = (android.webkit.WebSettings) this.f72110xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(webSettings);
        webSettings.setLoadWithOverviewMode(bool.booleanValue());
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi
    /* renamed from: setMediaPlaybackRequiresUserGesture */
    public void mo139169x60e97253(java.lang.Long l17, java.lang.Boolean bool) {
        android.webkit.WebSettings webSettings = (android.webkit.WebSettings) this.f72110xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(webSettings);
        webSettings.setMediaPlaybackRequiresUserGesture(bool.booleanValue());
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi
    /* renamed from: setSupportMultipleWindows */
    public void mo139170x5d27586(java.lang.Long l17, java.lang.Boolean bool) {
        android.webkit.WebSettings webSettings = (android.webkit.WebSettings) this.f72110xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(webSettings);
        webSettings.setSupportMultipleWindows(bool.booleanValue());
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi
    /* renamed from: setSupportZoom */
    public void mo139171x1e65280(java.lang.Long l17, java.lang.Boolean bool) {
        android.webkit.WebSettings webSettings = (android.webkit.WebSettings) this.f72110xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(webSettings);
        webSettings.setSupportZoom(bool.booleanValue());
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi
    /* renamed from: setTextZoom */
    public void mo139172x3ac31d22(java.lang.Long l17, java.lang.Long l18) {
        android.webkit.WebSettings webSettings = (android.webkit.WebSettings) this.f72110xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(webSettings);
        webSettings.setTextZoom(l18.intValue());
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi
    /* renamed from: setUseWideViewPort */
    public void mo139173xa2cf6f1e(java.lang.Long l17, java.lang.Boolean bool) {
        android.webkit.WebSettings webSettings = (android.webkit.WebSettings) this.f72110xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(webSettings);
        webSettings.setUseWideViewPort(bool.booleanValue());
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi
    /* renamed from: setUserAgentString */
    public void mo139174xefdae1e9(java.lang.Long l17, java.lang.String str) {
        android.webkit.WebSettings webSettings = (android.webkit.WebSettings) this.f72110xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(webSettings);
        webSettings.setUserAgentString(str);
    }
}
