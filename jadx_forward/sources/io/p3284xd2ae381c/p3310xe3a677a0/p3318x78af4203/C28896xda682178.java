package io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203;

/* renamed from: io.flutter.plugins.webviewflutter.HttpAuthHandlerHostApiImpl */
/* loaded from: classes13.dex */
public class C28896xda682178 implements io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.HttpAuthHandlerHostApi {

    /* renamed from: binaryMessenger */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f72065x56f9c012;

    /* renamed from: instanceManager */
    private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 f72066xd32bb158;

    public C28896xda682178(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 c28897x97be6938) {
        this.f72065x56f9c012 = interfaceC28679x1b8c77f2;
        this.f72066xd32bb158 = c28897x97be6938;
    }

    /* renamed from: getHttpAuthHandlerInstance */
    private android.webkit.HttpAuthHandler m139280xe9564559(java.lang.Long l17) {
        android.webkit.HttpAuthHandler httpAuthHandler = (android.webkit.HttpAuthHandler) this.f72066xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(httpAuthHandler);
        return httpAuthHandler;
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.HttpAuthHandlerHostApi
    /* renamed from: cancel */
    public void mo139037xae7a2e7a(java.lang.Long l17) {
        m139280xe9564559(l17).cancel();
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.HttpAuthHandlerHostApi
    /* renamed from: proceed */
    public void mo139038xed8d1cae(java.lang.Long l17, java.lang.String str, java.lang.String str2) {
        m139280xe9564559(l17).proceed(str, str2);
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.HttpAuthHandlerHostApi
    /* renamed from: useHttpAuthUsernamePassword */
    public java.lang.Boolean mo139039xe7ba70a8(java.lang.Long l17) {
        return java.lang.Boolean.valueOf(m139280xe9564559(l17).useHttpAuthUsernamePassword());
    }
}
