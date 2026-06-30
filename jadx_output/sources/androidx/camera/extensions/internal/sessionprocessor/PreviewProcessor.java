package androidx.camera.extensions.internal.sessionprocessor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class PreviewProcessor {
    private static final java.lang.String TAG = "PreviewProcessor";
    private final androidx.camera.extensions.impl.PreviewImageProcessorImpl mPreviewImageProcessor;
    private final androidx.camera.extensions.internal.sessionprocessor.CaptureResultImageMatcher mCaptureResultImageMatcher = new androidx.camera.extensions.internal.sessionprocessor.CaptureResultImageMatcher();
    private final java.lang.Object mLock = new java.lang.Object();
    private boolean mIsClosed = false;
    private boolean mIsPaused = false;

    /* loaded from: classes14.dex */
    public interface OnCaptureResultCallback {
        void onCaptureResult(long j17, java.util.List<android.util.Pair<android.hardware.camera2.CaptureResult.Key, java.lang.Object>> list);
    }

    public PreviewProcessor(androidx.camera.extensions.impl.PreviewImageProcessorImpl previewImageProcessorImpl, android.view.Surface surface, android.util.Size size) {
        this.mPreviewImageProcessor = previewImageProcessorImpl;
        previewImageProcessorImpl.onResolutionUpdate(size);
        previewImageProcessorImpl.onOutputSurface(surface, 1);
        previewImageProcessorImpl.onImageFormatUpdate(35);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0(final androidx.camera.extensions.internal.sessionprocessor.PreviewProcessor.OnCaptureResultCallback onCaptureResultCallback, androidx.camera.extensions.internal.sessionprocessor.ImageReference imageReference, android.hardware.camera2.TotalCaptureResult totalCaptureResult, int i17) {
        synchronized (this.mLock) {
            if (this.mIsClosed || this.mIsPaused) {
                imageReference.decrement();
                androidx.camera.core.Logger.d(TAG, "Ignore image in closed or paused state");
                return;
            }
            try {
                androidx.camera.extensions.internal.Version version = androidx.camera.extensions.internal.Version.VERSION_1_3;
                if (androidx.camera.extensions.internal.ClientVersion.isMinimumCompatibleVersion(version) && androidx.camera.extensions.internal.ExtensionVersion.isMinimumCompatibleVersion(version)) {
                    this.mPreviewImageProcessor.process(imageReference.get(), totalCaptureResult, new androidx.camera.extensions.impl.ProcessResultImpl() { // from class: androidx.camera.extensions.internal.sessionprocessor.PreviewProcessor.1
                        public void onCaptureCompleted(long j17, java.util.List<android.util.Pair<android.hardware.camera2.CaptureResult.Key, java.lang.Object>> list) {
                            onCaptureResultCallback.onCaptureResult(j17, list);
                        }

                        public void onCaptureProcessProgressed(int i18) {
                        }
                    }, androidx.camera.core.impl.utils.executor.CameraXExecutors.ioExecutor());
                } else {
                    this.mPreviewImageProcessor.process(imageReference.get(), totalCaptureResult);
                }
            } finally {
                imageReference.decrement();
            }
        }
    }

    public void close() {
        synchronized (this.mLock) {
            this.mIsClosed = true;
            this.mCaptureResultImageMatcher.clear();
            this.mCaptureResultImageMatcher.clearImageReferenceListener();
        }
    }

    public void notifyCaptureResult(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
        this.mCaptureResultImageMatcher.captureResultIncoming(totalCaptureResult);
    }

    public void notifyImage(androidx.camera.extensions.internal.sessionprocessor.ImageReference imageReference) {
        this.mCaptureResultImageMatcher.imageIncoming(imageReference);
    }

    public void pause() {
        synchronized (this.mLock) {
            this.mIsPaused = true;
        }
    }

    public void resume() {
        synchronized (this.mLock) {
            this.mIsPaused = false;
        }
    }

    public void start(final androidx.camera.extensions.internal.sessionprocessor.PreviewProcessor.OnCaptureResultCallback onCaptureResultCallback) {
        this.mCaptureResultImageMatcher.setImageReferenceListener(new androidx.camera.extensions.internal.sessionprocessor.CaptureResultImageMatcher.ImageReferenceListener() { // from class: androidx.camera.extensions.internal.sessionprocessor.PreviewProcessor$$a
            @Override // androidx.camera.extensions.internal.sessionprocessor.CaptureResultImageMatcher.ImageReferenceListener
            public final void onImageReferenceIncoming(androidx.camera.extensions.internal.sessionprocessor.ImageReference imageReference, android.hardware.camera2.TotalCaptureResult totalCaptureResult, int i17) {
                androidx.camera.extensions.internal.sessionprocessor.PreviewProcessor.this.lambda$start$0(onCaptureResultCallback, imageReference, totalCaptureResult, i17);
            }
        });
    }
}
