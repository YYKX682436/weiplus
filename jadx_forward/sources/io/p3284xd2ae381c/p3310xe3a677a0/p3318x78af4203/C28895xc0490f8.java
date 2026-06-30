package io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203;

/* renamed from: io.flutter.plugins.webviewflutter.HttpAuthHandlerFlutterApiImpl */
/* loaded from: classes16.dex */
public class C28895xc0490f8 {
    private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.HttpAuthHandlerFlutterApi api;

    /* renamed from: binaryMessenger */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f72063x56f9c012;

    /* renamed from: instanceManager */
    private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 f72064xd32bb158;

    public C28895xc0490f8(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 c28897x97be6938) {
        this.f72063x56f9c012 = interfaceC28679x1b8c77f2;
        this.f72064xd32bb158 = c28897x97be6938;
        this.api = new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.HttpAuthHandlerFlutterApi(interfaceC28679x1b8c77f2);
    }

    /* renamed from: create */
    public void m139279xaf65a0fc(android.webkit.HttpAuthHandler httpAuthHandler, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.HttpAuthHandlerFlutterApi.Reply<java.lang.Void> reply) {
        if (this.f72064xd32bb158.m139288x591dfd4(httpAuthHandler)) {
            return;
        }
        this.api.m139030xaf65a0fc(java.lang.Long.valueOf(this.f72064xd32bb158.m139286xeaafee74(httpAuthHandler)), reply);
    }
}
