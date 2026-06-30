package io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203;

/* renamed from: io.flutter.plugins.webviewflutter.JavaScriptChannelHostApiImpl */
/* loaded from: classes16.dex */
public class C28904xa2b4501c implements io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.JavaScriptChannelHostApi {

    /* renamed from: flutterApi */
    private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28903xe56c2fd4 f72083x2014845e;

    /* renamed from: instanceManager */
    private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 f72084xd32bb158;

    /* renamed from: javaScriptChannelCreator */
    private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28904xa2b4501c.JavaScriptChannelCreator f72085xb634d896;

    /* renamed from: platformThreadHandler */
    private android.os.Handler f72086xbc4f3c2d;

    /* renamed from: io.flutter.plugins.webviewflutter.JavaScriptChannelHostApiImpl$JavaScriptChannelCreator */
    /* loaded from: classes16.dex */
    public static class JavaScriptChannelCreator {
        /* renamed from: createJavaScriptChannel */
        public io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28900x16eda696 m139301x2b169d1a(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28903xe56c2fd4 c28903xe56c2fd4, java.lang.String str, android.os.Handler handler) {
            return new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28900x16eda696(c28903xe56c2fd4, str, handler);
        }
    }

    public C28904xa2b4501c(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 c28897x97be6938, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28904xa2b4501c.JavaScriptChannelCreator javaScriptChannelCreator, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28903xe56c2fd4 c28903xe56c2fd4, android.os.Handler handler) {
        this.f72084xd32bb158 = c28897x97be6938;
        this.f72085xb634d896 = javaScriptChannelCreator;
        this.f72083x2014845e = c28903xe56c2fd4;
        this.f72086xbc4f3c2d = handler;
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.JavaScriptChannelHostApi
    /* renamed from: create */
    public void mo139059xaf65a0fc(java.lang.Long l17, java.lang.String str) {
        this.f72084xd32bb158.m139285xa3622bbd(this.f72085xb634d896.m139301x2b169d1a(this.f72083x2014845e, str, this.f72086xbc4f3c2d), l17.longValue());
    }

    /* renamed from: setPlatformThreadHandler */
    public void m139300x980dc0eb(android.os.Handler handler) {
        this.f72086xbc4f3c2d = handler;
    }
}
