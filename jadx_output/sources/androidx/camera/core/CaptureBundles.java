package androidx.camera.core;

/* loaded from: classes13.dex */
public final class CaptureBundles {

    /* loaded from: classes13.dex */
    public static final class CaptureBundleImpl implements androidx.camera.core.impl.CaptureBundle {
        final java.util.List<androidx.camera.core.impl.CaptureStage> mCaptureStageList;

        public CaptureBundleImpl(java.util.List<androidx.camera.core.impl.CaptureStage> list) {
            if (list == null || list.isEmpty()) {
                throw new java.lang.IllegalArgumentException("Cannot set an empty CaptureStage list.");
            }
            this.mCaptureStageList = java.util.Collections.unmodifiableList(new java.util.ArrayList(list));
        }

        @Override // androidx.camera.core.impl.CaptureBundle
        public java.util.List<androidx.camera.core.impl.CaptureStage> getCaptureStages() {
            return this.mCaptureStageList;
        }
    }

    private CaptureBundles() {
    }

    public static androidx.camera.core.impl.CaptureBundle createCaptureBundle(androidx.camera.core.impl.CaptureStage... captureStageArr) {
        return new androidx.camera.core.CaptureBundles.CaptureBundleImpl(java.util.Arrays.asList(captureStageArr));
    }

    public static androidx.camera.core.impl.CaptureBundle singleDefaultCaptureBundle() {
        return createCaptureBundle(new androidx.camera.core.impl.CaptureStage.DefaultCaptureStage());
    }

    public static androidx.camera.core.impl.CaptureBundle createCaptureBundle(java.util.List<androidx.camera.core.impl.CaptureStage> list) {
        return new androidx.camera.core.CaptureBundles.CaptureBundleImpl(list);
    }
}
