package io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203;

/* renamed from: io.flutter.plugins.webviewflutter.GeolocationPermissionsCallbackHostApiImpl */
/* loaded from: classes13.dex */
public class C28894xb57dcb6f implements io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.GeolocationPermissionsCallbackHostApi {

    /* renamed from: binaryMessenger */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f72061x56f9c012;

    /* renamed from: instanceManager */
    private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 f72062xd32bb158;

    public C28894xb57dcb6f(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 c28897x97be6938) {
        this.f72061x56f9c012 = interfaceC28679x1b8c77f2;
        this.f72062xd32bb158 = c28897x97be6938;
    }

    /* renamed from: getGeolocationPermissionsCallbackInstance */
    private android.webkit.GeolocationPermissions.Callback m139278xa04c85ae(java.lang.Long l17) {
        android.webkit.GeolocationPermissions.Callback callback = (android.webkit.GeolocationPermissions.Callback) this.f72062xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(callback);
        return callback;
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.GeolocationPermissionsCallbackHostApi
    /* renamed from: invoke */
    public void mo139027xb9724478(java.lang.Long l17, java.lang.String str, java.lang.Boolean bool, java.lang.Boolean bool2) {
        m139278xa04c85ae(l17).invoke(str, bool.booleanValue(), bool2.booleanValue());
    }
}
