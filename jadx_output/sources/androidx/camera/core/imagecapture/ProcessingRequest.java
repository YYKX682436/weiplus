package androidx.camera.core.imagecapture;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class ProcessingRequest {
    static final int PROGRESS_NOT_RECEIVED = -1;
    private final androidx.camera.core.imagecapture.TakePictureCallback mCallback;
    final wa.a mCaptureFuture;
    private final android.graphics.Rect mCropRect;
    private final int mJpegQuality;
    private int mLastCaptureProcessProgressed;
    private final androidx.camera.core.ImageCapture.OutputFileOptions mOutputFileOptions;
    private final int mRequestId;
    private final int mRotationDegrees;
    private final android.graphics.Matrix mSensorToBufferTransform;
    private final java.util.List<java.lang.Integer> mStageIds;
    private final java.lang.String mTagBundleKey;

    public ProcessingRequest(androidx.camera.core.impl.CaptureBundle captureBundle, androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions, android.graphics.Rect rect, int i17, int i18, android.graphics.Matrix matrix, androidx.camera.core.imagecapture.TakePictureCallback takePictureCallback, wa.a aVar) {
        this(captureBundle, outputFileOptions, rect, i17, i18, matrix, takePictureCallback, aVar, 0);
    }

    public wa.a getCaptureFuture() {
        return this.mCaptureFuture;
    }

    public android.graphics.Rect getCropRect() {
        return this.mCropRect;
    }

    public int getJpegQuality() {
        return this.mJpegQuality;
    }

    public androidx.camera.core.ImageCapture.OutputFileOptions getOutputFileOptions() {
        return this.mOutputFileOptions;
    }

    public int getRequestId() {
        return this.mRequestId;
    }

    public int getRotationDegrees() {
        return this.mRotationDegrees;
    }

    public android.graphics.Matrix getSensorToBufferTransform() {
        return this.mSensorToBufferTransform;
    }

    public java.util.List<java.lang.Integer> getStageIds() {
        return this.mStageIds;
    }

    public java.lang.String getTagBundleKey() {
        return this.mTagBundleKey;
    }

    public boolean isAborted() {
        return this.mCallback.isAborted();
    }

    public boolean isInMemoryCapture() {
        return getOutputFileOptions() == null;
    }

    public void onCaptureFailure(androidx.camera.core.ImageCaptureException imageCaptureException) {
        this.mCallback.onCaptureFailure(imageCaptureException);
    }

    public void onCaptureProcessProgressed(int i17) {
        if (this.mLastCaptureProcessProgressed != i17) {
            this.mLastCaptureProcessProgressed = i17;
            this.mCallback.onCaptureProcessProgressed(i17);
        }
    }

    public void onCaptureStarted() {
        this.mCallback.onCaptureStarted();
    }

    public void onFinalResult(androidx.camera.core.ImageCapture.OutputFileResults outputFileResults) {
        this.mCallback.onFinalResult(outputFileResults);
    }

    public void onImageCaptured() {
        if (this.mLastCaptureProcessProgressed != -1) {
            onCaptureProcessProgressed(100);
        }
        this.mCallback.onImageCaptured();
    }

    public void onPostviewBitmapAvailable(android.graphics.Bitmap bitmap) {
        this.mCallback.onPostviewBitmapAvailable(bitmap);
    }

    public void onProcessFailure(androidx.camera.core.ImageCaptureException imageCaptureException) {
        this.mCallback.onProcessFailure(imageCaptureException);
    }

    public ProcessingRequest(androidx.camera.core.impl.CaptureBundle captureBundle, androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions, android.graphics.Rect rect, int i17, int i18, android.graphics.Matrix matrix, androidx.camera.core.imagecapture.TakePictureCallback takePictureCallback, wa.a aVar, int i19) {
        this.mLastCaptureProcessProgressed = -1;
        this.mRequestId = i19;
        this.mOutputFileOptions = outputFileOptions;
        this.mJpegQuality = i18;
        this.mRotationDegrees = i17;
        this.mCropRect = rect;
        this.mSensorToBufferTransform = matrix;
        this.mCallback = takePictureCallback;
        this.mTagBundleKey = java.lang.String.valueOf(captureBundle.hashCode());
        this.mStageIds = new java.util.ArrayList();
        java.util.List<androidx.camera.core.impl.CaptureStage> captureStages = captureBundle.getCaptureStages();
        java.util.Objects.requireNonNull(captureStages);
        java.util.Iterator<androidx.camera.core.impl.CaptureStage> it = captureStages.iterator();
        while (it.hasNext()) {
            this.mStageIds.add(java.lang.Integer.valueOf(it.next().getId()));
        }
        this.mCaptureFuture = aVar;
    }

    public void onFinalResult(androidx.camera.core.ImageProxy imageProxy) {
        this.mCallback.onFinalResult(imageProxy);
    }
}
