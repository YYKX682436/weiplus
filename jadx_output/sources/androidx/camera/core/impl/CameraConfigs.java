package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public class CameraConfigs {
    private static final androidx.camera.core.impl.CameraConfig DEFAULT_CAMERA_CONFIG = new androidx.camera.core.impl.CameraConfigs.DefaultCameraConfig();

    /* loaded from: classes14.dex */
    public static final class DefaultCameraConfig implements androidx.camera.core.impl.CameraConfig {
        private final androidx.camera.core.impl.Identifier mIdentifier = androidx.camera.core.impl.Identifier.create(new java.lang.Object());

        @Override // androidx.camera.core.impl.CameraConfig
        public androidx.camera.core.impl.Identifier getCompatibilityId() {
            return this.mIdentifier;
        }

        @Override // androidx.camera.core.impl.ReadableConfig
        public androidx.camera.core.impl.Config getConfig() {
            return androidx.camera.core.impl.OptionsBundle.emptyBundle();
        }
    }

    private CameraConfigs() {
    }

    public static androidx.camera.core.impl.CameraConfig defaultConfig() {
        return DEFAULT_CAMERA_CONFIG;
    }
}
