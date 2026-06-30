package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public final class ExtendedCameraConfigProviderStore {
    private static final java.lang.Object LOCK = new java.lang.Object();
    private static final java.util.Map<java.lang.Object, androidx.camera.core.impl.CameraConfigProvider> CAMERA_CONFIG_PROVIDERS = new java.util.HashMap();

    private ExtendedCameraConfigProviderStore() {
    }

    public static void addConfig(java.lang.Object obj, androidx.camera.core.impl.CameraConfigProvider cameraConfigProvider) {
        synchronized (LOCK) {
            CAMERA_CONFIG_PROVIDERS.put(obj, cameraConfigProvider);
        }
    }

    public static void clear() {
        synchronized (LOCK) {
            CAMERA_CONFIG_PROVIDERS.clear();
        }
    }

    public static androidx.camera.core.impl.CameraConfigProvider getConfigProvider(java.lang.Object obj) {
        androidx.camera.core.impl.CameraConfigProvider cameraConfigProvider;
        synchronized (LOCK) {
            cameraConfigProvider = CAMERA_CONFIG_PROVIDERS.get(obj);
        }
        return cameraConfigProvider == null ? androidx.camera.core.impl.CameraConfigProvider.EMPTY : cameraConfigProvider;
    }
}
