package io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203;

/* renamed from: io.flutter.plugins.webviewflutter.GeolocationPermissionsCallbackFlutterApiImpl */
/* loaded from: classes16.dex */
public class C28893x2a128fa1 {
    private io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.GeolocationPermissionsCallbackFlutterApi api;

    /* renamed from: binaryMessenger */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f72059x56f9c012;

    /* renamed from: instanceManager */
    private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 f72060xd32bb158;

    public C28893x2a128fa1(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 c28897x97be6938) {
        this.f72059x56f9c012 = interfaceC28679x1b8c77f2;
        this.f72060xd32bb158 = c28897x97be6938;
        this.api = new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.GeolocationPermissionsCallbackFlutterApi(interfaceC28679x1b8c77f2);
    }

    /* renamed from: create */
    public void m139276xaf65a0fc(android.webkit.GeolocationPermissions.Callback callback, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.GeolocationPermissionsCallbackFlutterApi.Reply<java.lang.Void> reply) {
        if (this.f72060xd32bb158.m139288x591dfd4(callback)) {
            return;
        }
        this.api.m139022xaf65a0fc(java.lang.Long.valueOf(this.f72060xd32bb158.m139286xeaafee74(callback)), reply);
    }

    /* renamed from: setApi */
    public void m139277xca025258(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.GeolocationPermissionsCallbackFlutterApi geolocationPermissionsCallbackFlutterApi) {
        this.api = geolocationPermissionsCallbackFlutterApi;
    }
}
