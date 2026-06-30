package io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203;

/* renamed from: io.flutter.plugins.webviewflutter.CustomViewCallbackHostApiImpl */
/* loaded from: classes13.dex */
public class C28785x6c7b2957 implements io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.CustomViewCallbackHostApi {

    /* renamed from: binaryMessenger */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f71989x56f9c012;

    /* renamed from: instanceManager */
    private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 f71990xd32bb158;

    public C28785x6c7b2957(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 c28897x97be6938) {
        this.f71989x56f9c012 = interfaceC28679x1b8c77f2;
        this.f71990xd32bb158 = c28897x97be6938;
    }

    /* renamed from: getCustomViewCallbackInstance */
    private android.webkit.WebChromeClient.CustomViewCallback m138950x2d1d41c6(java.lang.Long l17) {
        android.webkit.WebChromeClient.CustomViewCallback customViewCallback = (android.webkit.WebChromeClient.CustomViewCallback) this.f71990xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(customViewCallback);
        return customViewCallback;
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.CustomViewCallbackHostApi
    /* renamed from: onCustomViewHidden */
    public void mo138951x3887b6ff(java.lang.Long l17) {
        m138950x2d1d41c6(l17).onCustomViewHidden();
    }
}
