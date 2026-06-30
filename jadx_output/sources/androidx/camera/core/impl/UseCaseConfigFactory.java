package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public interface UseCaseConfigFactory {
    public static final androidx.camera.core.impl.UseCaseConfigFactory EMPTY_INSTANCE = new androidx.camera.core.impl.UseCaseConfigFactory() { // from class: androidx.camera.core.impl.UseCaseConfigFactory.1
        @Override // androidx.camera.core.impl.UseCaseConfigFactory
        public androidx.camera.core.impl.Config getConfig(androidx.camera.core.impl.UseCaseConfigFactory.CaptureType captureType, int i17) {
            return null;
        }
    };

    /* loaded from: classes14.dex */
    public enum CaptureType {
        IMAGE_CAPTURE,
        PREVIEW,
        IMAGE_ANALYSIS,
        VIDEO_CAPTURE,
        STREAM_SHARING,
        METERING_REPEATING
    }

    /* loaded from: classes14.dex */
    public interface Provider {
        androidx.camera.core.impl.UseCaseConfigFactory newInstance(android.content.Context context);
    }

    androidx.camera.core.impl.Config getConfig(androidx.camera.core.impl.UseCaseConfigFactory.CaptureType captureType, int i17);
}
