package io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203;

/* renamed from: io.flutter.plugins.webviewflutter.WebViewFlutterApiImpl */
/* loaded from: classes13.dex */
public class C28958x4c1027f7 {
    private io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewFlutterApi api;

    /* renamed from: binaryMessenger */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f72124x56f9c012;

    /* renamed from: instanceManager */
    private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 f72125xd32bb158;

    public C28958x4c1027f7(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 c28897x97be6938) {
        this.f72124x56f9c012 = interfaceC28679x1b8c77f2;
        this.f72125xd32bb158 = c28897x97be6938;
        this.api = new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewFlutterApi(interfaceC28679x1b8c77f2);
    }

    /* renamed from: create */
    public void m139391xaf65a0fc(android.webkit.WebView webView, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewFlutterApi.Reply<java.lang.Void> reply) {
        if (this.f72125xd32bb158.m139288x591dfd4(webView)) {
            return;
        }
        this.api.m139209xaf65a0fc(java.lang.Long.valueOf(this.f72125xd32bb158.m139286xeaafee74(webView)), reply);
    }

    /* renamed from: onScrollChanged */
    public void m139392x7a6f2788(android.webkit.WebView webView, java.lang.Long l17, java.lang.Long l18, java.lang.Long l19, java.lang.Long l27, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewFlutterApi.Reply<java.lang.Void> reply) {
        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewFlutterApi webViewFlutterApi = this.api;
        java.lang.Long m139289x102c196a = this.f72125xd32bb158.m139289x102c196a(webView);
        java.util.Objects.requireNonNull(m139289x102c196a);
        webViewFlutterApi.m139210x7a6f2788(m139289x102c196a, l17, l18, l19, l27, reply);
    }

    /* renamed from: setApi */
    public void m139393xca025258(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewFlutterApi webViewFlutterApi) {
        this.api = webViewFlutterApi;
    }
}
