package io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203;

/* renamed from: io.flutter.plugins.webviewflutter.JavaObjectHostApiImpl */
/* loaded from: classes13.dex */
public class C28899xa58f2db1 implements io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.JavaObjectHostApi {

    /* renamed from: instanceManager */
    private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 f72078xd32bb158;

    public C28899xa58f2db1(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 c28897x97be6938) {
        this.f72078xd32bb158 = c28897x97be6938;
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.JavaObjectHostApi
    /* renamed from: dispose */
    public void mo139051x63a5261f(java.lang.Long l17) {
        java.lang.Object m139290x9cf0d20b = this.f72078xd32bb158.m139290x9cf0d20b(l17.longValue());
        if (m139290x9cf0d20b instanceof io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28963x27d102d9.WebViewPlatformView) {
            ((io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28963x27d102d9.WebViewPlatformView) m139290x9cf0d20b).destroy();
        }
        this.f72078xd32bb158.m139292xc84af884(l17.longValue());
    }
}
