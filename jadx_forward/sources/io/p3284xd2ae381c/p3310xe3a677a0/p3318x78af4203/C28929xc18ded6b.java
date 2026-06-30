package io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203;

/* renamed from: io.flutter.plugins.webviewflutter.WebStorageHostApiImpl */
/* loaded from: classes13.dex */
public class C28929xc18ded6b implements io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebStorageHostApi {

    /* renamed from: instanceManager */
    private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 f72112xd32bb158;

    /* renamed from: webStorageCreator */
    private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28929xc18ded6b.WebStorageCreator f72113xa96159a5;

    /* renamed from: io.flutter.plugins.webviewflutter.WebStorageHostApiImpl$WebStorageCreator */
    /* loaded from: classes13.dex */
    public static class WebStorageCreator {
        /* renamed from: createWebStorage */
        public android.webkit.WebStorage m139348x310edaa3() {
            return android.webkit.WebStorage.getInstance();
        }
    }

    public C28929xc18ded6b(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 c28897x97be6938, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28929xc18ded6b.WebStorageCreator webStorageCreator) {
        this.f72112xd32bb158 = c28897x97be6938;
        this.f72113xa96159a5 = webStorageCreator;
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebStorageHostApi
    /* renamed from: create */
    public void mo139179xaf65a0fc(java.lang.Long l17) {
        this.f72112xd32bb158.m139285xa3622bbd(this.f72113xa96159a5.m139348x310edaa3(), l17.longValue());
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebStorageHostApi
    /* renamed from: deleteAllData */
    public void mo139180xbd6590c0(java.lang.Long l17) {
        android.webkit.WebStorage webStorage = (android.webkit.WebStorage) this.f72112xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(webStorage);
        webStorage.deleteAllData();
    }
}
