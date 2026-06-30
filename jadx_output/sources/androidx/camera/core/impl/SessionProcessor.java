package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public interface SessionProcessor {

    /* loaded from: classes14.dex */
    public interface CaptureCallback {
        default void onCaptureCompleted(long j17, int i17, androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult) {
        }

        default void onCaptureFailed(int i17) {
        }

        default void onCaptureProcessProgressed(int i17) {
        }

        default void onCaptureProcessStarted(int i17) {
        }

        default void onCaptureSequenceAborted(int i17) {
        }

        default void onCaptureSequenceCompleted(int i17) {
        }

        default void onCaptureStarted(int i17, long j17) {
        }
    }

    void abortCapture(int i17);

    void deInitSession();

    default android.util.Pair<java.lang.Long, java.lang.Long> getRealtimeCaptureLatency() {
        return null;
    }

    default java.util.Set<java.lang.Integer> getSupportedCameraOperations() {
        return java.util.Collections.emptySet();
    }

    default java.util.Map<java.lang.Integer, java.util.List<android.util.Size>> getSupportedPostviewSize(android.util.Size size) {
        return java.util.Collections.emptyMap();
    }

    androidx.camera.core.impl.SessionConfig initSession(androidx.camera.core.CameraInfo cameraInfo, androidx.camera.core.impl.OutputSurfaceConfiguration outputSurfaceConfiguration);

    void onCaptureSessionEnd();

    void onCaptureSessionStart(androidx.camera.core.impl.RequestProcessor requestProcessor);

    void setParameters(androidx.camera.core.impl.Config config);

    int startCapture(boolean z17, androidx.camera.core.impl.TagBundle tagBundle, androidx.camera.core.impl.SessionProcessor.CaptureCallback captureCallback);

    int startRepeating(androidx.camera.core.impl.TagBundle tagBundle, androidx.camera.core.impl.SessionProcessor.CaptureCallback captureCallback);

    default int startTrigger(androidx.camera.core.impl.Config config, androidx.camera.core.impl.TagBundle tagBundle, androidx.camera.core.impl.SessionProcessor.CaptureCallback captureCallback) {
        return -1;
    }

    void stopRepeating();
}
