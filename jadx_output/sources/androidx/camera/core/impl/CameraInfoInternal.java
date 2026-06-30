package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public interface CameraInfoInternal extends androidx.camera.core.CameraInfo {
    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default java.util.List lambda$getCameraSelector$0(java.util.List list) {
        java.lang.String cameraId = getCameraId();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            androidx.camera.core.CameraInfo cameraInfo = (androidx.camera.core.CameraInfo) it.next();
            m3.h.a(cameraInfo instanceof androidx.camera.core.impl.CameraInfoInternal);
            if (((androidx.camera.core.impl.CameraInfoInternal) cameraInfo).getCameraId().equals(cameraId)) {
                return java.util.Collections.singletonList(cameraInfo);
            }
        }
        throw new java.lang.IllegalStateException("Unable to find camera with id " + cameraId + " from list of available cameras.");
    }

    void addSessionCaptureCallback(java.util.concurrent.Executor executor, androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback);

    java.lang.Object getCameraCharacteristics();

    java.lang.String getCameraId();

    androidx.camera.core.impl.Quirks getCameraQuirks();

    @Override // androidx.camera.core.CameraInfo
    default androidx.camera.core.CameraSelector getCameraSelector() {
        return new androidx.camera.core.CameraSelector.Builder().addCameraFilter(new androidx.camera.core.CameraFilter() { // from class: androidx.camera.core.impl.CameraInfoInternal$$a
            @Override // androidx.camera.core.CameraFilter
            public final java.util.List filter(java.util.List list) {
                java.util.List lambda$getCameraSelector$0;
                lambda$getCameraSelector$0 = androidx.camera.core.impl.CameraInfoInternal.this.lambda$getCameraSelector$0(list);
                return lambda$getCameraSelector$0;
            }
        }).addCameraFilter(new androidx.camera.core.impl.LensFacingCameraFilter(getLensFacing())).build();
    }

    androidx.camera.core.impl.EncoderProfilesProvider getEncoderProfilesProvider();

    default androidx.camera.core.impl.CameraInfoInternal getImplementation() {
        return this;
    }

    java.lang.Object getPhysicalCameraCharacteristics(java.lang.String str);

    java.util.Set<androidx.camera.core.DynamicRange> getSupportedDynamicRanges();

    java.util.List<android.util.Size> getSupportedHighResolutions(int i17);

    java.util.Set<java.lang.Integer> getSupportedOutputFormats();

    java.util.List<android.util.Size> getSupportedResolutions(int i17);

    androidx.camera.core.impl.Timebase getTimebase();

    default boolean isCaptureProcessProgressSupported() {
        return false;
    }

    default boolean isPostviewSupported() {
        return false;
    }

    boolean isPreviewStabilizationSupported();

    boolean isVideoStabilizationSupported();

    void removeSessionCaptureCallback(androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback);
}
