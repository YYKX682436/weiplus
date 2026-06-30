package io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203;

/* renamed from: io.flutter.plugins.webviewflutter.PermissionRequestFlutterApiImpl */
/* loaded from: classes16.dex */
public class C28905xb71a1d5e {
    private io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.PermissionRequestFlutterApi api;

    /* renamed from: binaryMessenger */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f72087x56f9c012;

    /* renamed from: instanceManager */
    private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 f72088xd32bb158;

    public C28905xb71a1d5e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 c28897x97be6938) {
        this.f72087x56f9c012 = interfaceC28679x1b8c77f2;
        this.f72088xd32bb158 = c28897x97be6938;
        this.api = new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.PermissionRequestFlutterApi(interfaceC28679x1b8c77f2);
    }

    /* renamed from: create */
    public void m139302xaf65a0fc(android.webkit.PermissionRequest permissionRequest, java.lang.String[] strArr, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.PermissionRequestFlutterApi.Reply<java.lang.Void> reply) {
        if (this.f72088xd32bb158.m139288x591dfd4(permissionRequest)) {
            return;
        }
        this.api.m139062xaf65a0fc(java.lang.Long.valueOf(this.f72088xd32bb158.m139286xeaafee74(permissionRequest)), java.util.Arrays.asList(strArr), reply);
    }

    /* renamed from: setApi */
    public void m139303xca025258(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.PermissionRequestFlutterApi permissionRequestFlutterApi) {
        this.api = permissionRequestFlutterApi;
    }
}
