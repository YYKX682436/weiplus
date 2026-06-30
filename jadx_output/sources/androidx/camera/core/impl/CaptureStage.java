package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public interface CaptureStage {

    /* loaded from: classes14.dex */
    public static final class DefaultCaptureStage implements androidx.camera.core.impl.CaptureStage {
        private final androidx.camera.core.impl.CaptureConfig mCaptureConfig = new androidx.camera.core.impl.CaptureConfig.Builder().build();

        @Override // androidx.camera.core.impl.CaptureStage
        public androidx.camera.core.impl.CaptureConfig getCaptureConfig() {
            return this.mCaptureConfig;
        }

        @Override // androidx.camera.core.impl.CaptureStage
        public int getId() {
            return 0;
        }
    }

    androidx.camera.core.impl.CaptureConfig getCaptureConfig();

    int getId();
}
