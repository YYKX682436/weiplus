package androidx.camera.core.impl.capability;

/* loaded from: classes14.dex */
public class PreviewCapabilitiesImpl implements androidx.camera.core.PreviewCapabilities {
    private boolean mIsStabilizationSupported;

    public PreviewCapabilitiesImpl(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal) {
        this.mIsStabilizationSupported = cameraInfoInternal.isPreviewStabilizationSupported();
    }

    public static androidx.camera.core.PreviewCapabilities from(androidx.camera.core.CameraInfo cameraInfo) {
        return new androidx.camera.core.impl.capability.PreviewCapabilitiesImpl((androidx.camera.core.impl.CameraInfoInternal) cameraInfo);
    }

    @Override // androidx.camera.core.PreviewCapabilities
    public boolean isStabilizationSupported() {
        return this.mIsStabilizationSupported;
    }
}
