package io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203;

/* renamed from: io.flutter.plugins.webviewflutter.PermissionRequestHostApiImpl */
/* loaded from: classes13.dex */
public class C28906xe8765ed2 implements io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.PermissionRequestHostApi {

    /* renamed from: binaryMessenger */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f72089x56f9c012;

    /* renamed from: instanceManager */
    private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 f72090xd32bb158;

    public C28906xe8765ed2(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 c28897x97be6938) {
        this.f72089x56f9c012 = interfaceC28679x1b8c77f2;
        this.f72090xd32bb158 = c28897x97be6938;
    }

    /* renamed from: getPermissionRequestInstance */
    private android.webkit.PermissionRequest m139304x66a43bf(java.lang.Long l17) {
        android.webkit.PermissionRequest permissionRequest = (android.webkit.PermissionRequest) this.f72090xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(permissionRequest);
        return permissionRequest;
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.PermissionRequestHostApi
    /* renamed from: deny */
    public void mo139068x2efe0c(java.lang.Long l17) {
        m139304x66a43bf(l17).deny();
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.PermissionRequestHostApi
    /* renamed from: grant */
    public void mo139069x5e0c11c(java.lang.Long l17, java.util.List<java.lang.String> list) {
        m139304x66a43bf(l17).grant((java.lang.String[]) list.toArray(new java.lang.String[0]));
    }
}
