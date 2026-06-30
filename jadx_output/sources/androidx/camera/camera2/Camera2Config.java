package androidx.camera.camera2;

/* loaded from: classes14.dex */
public final class Camera2Config {

    /* loaded from: classes14.dex */
    public static final class DefaultProvider implements androidx.camera.core.CameraXConfig.Provider {
        @Override // androidx.camera.core.CameraXConfig.Provider
        public androidx.camera.core.CameraXConfig getCameraXConfig() {
            return androidx.camera.camera2.Camera2Config.defaultConfig();
        }
    }

    private Camera2Config() {
    }

    public static androidx.camera.core.CameraXConfig defaultConfig() {
        t.a$$a a__a = new t.a$$a();
        t.a$$b a__b = new t.a$$b();
        return new androidx.camera.core.CameraXConfig.Builder().setCameraFactoryProvider(a__a).setDeviceSurfaceManagerProvider(a__b).setUseCaseConfigFactoryProvider(new t.a$$c()).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ androidx.camera.core.impl.CameraDeviceSurfaceManager lambda$defaultConfig$0(android.content.Context context, java.lang.Object obj, java.util.Set set) {
        try {
            return new androidx.camera.camera2.internal.Camera2DeviceSurfaceManager(context, obj, set);
        } catch (androidx.camera.core.CameraUnavailableException e17) {
            throw new androidx.camera.core.InitializationException(e17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ androidx.camera.core.impl.UseCaseConfigFactory lambda$defaultConfig$1(android.content.Context context) {
        return new androidx.camera.camera2.internal.Camera2UseCaseConfigFactory(context);
    }
}
