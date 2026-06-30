package androidx.camera.core.imagecapture;

/* loaded from: classes14.dex */
public abstract class TakePictureRequest {
    private int mRemainingRetires = new androidx.camera.core.internal.compat.workaround.CaptureFailedRetryEnabler().getRetryCount();

    /* loaded from: classes14.dex */
    public interface RetryControl {
        void retryRequest(androidx.camera.core.imagecapture.TakePictureRequest takePictureRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCaptureProcessProgressed$3(int i17) {
        if (getOnDiskCallback() != null) {
            getOnDiskCallback().onCaptureProcessProgressed(i17);
        } else if (getInMemoryCallback() != null) {
            getInMemoryCallback().onCaptureProcessProgressed(i17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onError$0(androidx.camera.core.ImageCaptureException imageCaptureException) {
        boolean z17 = getInMemoryCallback() != null;
        boolean z18 = getOnDiskCallback() != null;
        if (z17 && !z18) {
            androidx.camera.core.ImageCapture.OnImageCapturedCallback inMemoryCallback = getInMemoryCallback();
            java.util.Objects.requireNonNull(inMemoryCallback);
            inMemoryCallback.onError(imageCaptureException);
        } else {
            if (!z18 || z17) {
                throw new java.lang.IllegalStateException("One and only one callback is allowed.");
            }
            androidx.camera.core.ImageCapture.OnImageSavedCallback onDiskCallback = getOnDiskCallback();
            java.util.Objects.requireNonNull(onDiskCallback);
            onDiskCallback.onError(imageCaptureException);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onPostviewBitmapAvailable$4(android.graphics.Bitmap bitmap) {
        if (getOnDiskCallback() != null) {
            getOnDiskCallback().onPostviewBitmapAvailable(bitmap);
        } else if (getInMemoryCallback() != null) {
            getInMemoryCallback().onPostviewBitmapAvailable(bitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onResult$1(androidx.camera.core.ImageCapture.OutputFileResults outputFileResults) {
        androidx.camera.core.ImageCapture.OnImageSavedCallback onDiskCallback = getOnDiskCallback();
        java.util.Objects.requireNonNull(onDiskCallback);
        java.util.Objects.requireNonNull(outputFileResults);
        onDiskCallback.onImageSaved(outputFileResults);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onResult$2(androidx.camera.core.ImageProxy imageProxy) {
        androidx.camera.core.ImageCapture.OnImageCapturedCallback inMemoryCallback = getInMemoryCallback();
        java.util.Objects.requireNonNull(inMemoryCallback);
        java.util.Objects.requireNonNull(imageProxy);
        inMemoryCallback.onCaptureSuccess(imageProxy);
    }

    public static androidx.camera.core.imagecapture.TakePictureRequest of(java.util.concurrent.Executor executor, androidx.camera.core.ImageCapture.OnImageCapturedCallback onImageCapturedCallback, androidx.camera.core.ImageCapture.OnImageSavedCallback onImageSavedCallback, androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions, android.graphics.Rect rect, android.graphics.Matrix matrix, int i17, int i18, int i19, java.util.List<androidx.camera.core.impl.CameraCaptureCallback> list) {
        m3.h.b((onImageSavedCallback == null) == (outputFileOptions == null), "onDiskCallback and outputFileOptions should be both null or both non-null.");
        m3.h.b((onImageCapturedCallback == null) ^ (onImageSavedCallback == null), "One and only one on-disk or in-memory callback should be present.");
        return new androidx.camera.core.imagecapture.AutoValue_TakePictureRequest(executor, onImageCapturedCallback, onImageSavedCallback, outputFileOptions, rect, matrix, i17, i18, i19, list);
    }

    public boolean decrementRetryCounter() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        int i17 = this.mRemainingRetires;
        if (i17 <= 0) {
            return false;
        }
        this.mRemainingRetires = i17 - 1;
        return true;
    }

    public abstract java.util.concurrent.Executor getAppExecutor();

    public abstract int getCaptureMode();

    public abstract android.graphics.Rect getCropRect();

    public abstract androidx.camera.core.ImageCapture.OnImageCapturedCallback getInMemoryCallback();

    public abstract int getJpegQuality();

    public abstract androidx.camera.core.ImageCapture.OnImageSavedCallback getOnDiskCallback();

    public abstract androidx.camera.core.ImageCapture.OutputFileOptions getOutputFileOptions();

    public int getRemainingRetries() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        return this.mRemainingRetires;
    }

    public abstract int getRotationDegrees();

    public abstract android.graphics.Matrix getSensorToBufferTransform();

    public abstract java.util.List<androidx.camera.core.impl.CameraCaptureCallback> getSessionConfigCameraCaptureCallbacks();

    public void incrementRetryCounter() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        this.mRemainingRetires++;
    }

    public void onCaptureProcessProgressed(final int i17) {
        getAppExecutor().execute(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.TakePictureRequest$$a
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.imagecapture.TakePictureRequest.this.lambda$onCaptureProcessProgressed$3(i17);
            }
        });
    }

    public void onError(final androidx.camera.core.ImageCaptureException imageCaptureException) {
        getAppExecutor().execute(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.TakePictureRequest$$d
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.imagecapture.TakePictureRequest.this.lambda$onError$0(imageCaptureException);
            }
        });
    }

    public void onPostviewBitmapAvailable(final android.graphics.Bitmap bitmap) {
        getAppExecutor().execute(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.TakePictureRequest$$b
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.imagecapture.TakePictureRequest.this.lambda$onPostviewBitmapAvailable$4(bitmap);
            }
        });
    }

    public void onResult(final androidx.camera.core.ImageCapture.OutputFileResults outputFileResults) {
        getAppExecutor().execute(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.TakePictureRequest$$c
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.imagecapture.TakePictureRequest.this.lambda$onResult$1(outputFileResults);
            }
        });
    }

    public void onResult(final androidx.camera.core.ImageProxy imageProxy) {
        getAppExecutor().execute(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.TakePictureRequest$$e
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.imagecapture.TakePictureRequest.this.lambda$onResult$2(imageProxy);
            }
        });
    }
}
