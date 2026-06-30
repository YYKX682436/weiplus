package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public interface RequestProcessor {

    /* loaded from: classes14.dex */
    public interface Callback {
        default void onCaptureBufferLost(androidx.camera.core.impl.RequestProcessor.Request request, long j17, int i17) {
        }

        default void onCaptureCompleted(androidx.camera.core.impl.RequestProcessor.Request request, androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult) {
        }

        default void onCaptureFailed(androidx.camera.core.impl.RequestProcessor.Request request, androidx.camera.core.impl.CameraCaptureFailure cameraCaptureFailure) {
        }

        default void onCaptureProgressed(androidx.camera.core.impl.RequestProcessor.Request request, androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult) {
        }

        default void onCaptureSequenceAborted(int i17) {
        }

        default void onCaptureSequenceCompleted(int i17, long j17) {
        }

        default void onCaptureStarted(androidx.camera.core.impl.RequestProcessor.Request request, long j17, long j18) {
        }
    }

    /* loaded from: classes14.dex */
    public interface Request {
        androidx.camera.core.impl.Config getParameters();

        java.util.List<java.lang.Integer> getTargetOutputConfigIds();

        int getTemplateId();
    }

    void abortCaptures();

    int setRepeating(androidx.camera.core.impl.RequestProcessor.Request request, androidx.camera.core.impl.RequestProcessor.Callback callback);

    void stopRepeating();

    int submit(androidx.camera.core.impl.RequestProcessor.Request request, androidx.camera.core.impl.RequestProcessor.Callback callback);

    int submit(java.util.List<androidx.camera.core.impl.RequestProcessor.Request> list, androidx.camera.core.impl.RequestProcessor.Callback callback);
}
