package io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203;

/* renamed from: io.flutter.plugins.webviewflutter.ViewFlutterApiImpl */
/* loaded from: classes16.dex */
public class C28907xe601b9c3 {
    private io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.ViewFlutterApi api;

    /* renamed from: binaryMessenger */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f72091x56f9c012;

    /* renamed from: instanceManager */
    private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 f72092xd32bb158;

    public C28907xe601b9c3(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 c28897x97be6938) {
        this.f72091x56f9c012 = interfaceC28679x1b8c77f2;
        this.f72092xd32bb158 = c28897x97be6938;
        this.api = new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.ViewFlutterApi(interfaceC28679x1b8c77f2);
    }

    /* renamed from: create */
    public void m139305xaf65a0fc(android.view.View view, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.ViewFlutterApi.Reply<java.lang.Void> reply) {
        if (this.f72092xd32bb158.m139288x591dfd4(view)) {
            return;
        }
        this.api.m139072xaf65a0fc(java.lang.Long.valueOf(this.f72092xd32bb158.m139286xeaafee74(view)), reply);
    }

    /* renamed from: setApi */
    public void m139306xca025258(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.ViewFlutterApi viewFlutterApi) {
        this.api = viewFlutterApi;
    }
}
