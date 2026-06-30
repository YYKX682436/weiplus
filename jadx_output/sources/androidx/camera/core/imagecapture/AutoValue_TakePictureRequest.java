package androidx.camera.core.imagecapture;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public final class AutoValue_TakePictureRequest extends androidx.camera.core.imagecapture.TakePictureRequest {
    private final java.util.concurrent.Executor appExecutor;
    private final int captureMode;
    private final android.graphics.Rect cropRect;
    private final androidx.camera.core.ImageCapture.OnImageCapturedCallback inMemoryCallback;
    private final int jpegQuality;
    private final androidx.camera.core.ImageCapture.OnImageSavedCallback onDiskCallback;
    private final androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions;
    private final int rotationDegrees;
    private final android.graphics.Matrix sensorToBufferTransform;
    private final java.util.List<androidx.camera.core.impl.CameraCaptureCallback> sessionConfigCameraCaptureCallbacks;

    public AutoValue_TakePictureRequest(java.util.concurrent.Executor executor, androidx.camera.core.ImageCapture.OnImageCapturedCallback onImageCapturedCallback, androidx.camera.core.ImageCapture.OnImageSavedCallback onImageSavedCallback, androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions, android.graphics.Rect rect, android.graphics.Matrix matrix, int i17, int i18, int i19, java.util.List<androidx.camera.core.impl.CameraCaptureCallback> list) {
        if (executor == null) {
            throw new java.lang.NullPointerException("Null appExecutor");
        }
        this.appExecutor = executor;
        this.inMemoryCallback = onImageCapturedCallback;
        this.onDiskCallback = onImageSavedCallback;
        this.outputFileOptions = outputFileOptions;
        if (rect == null) {
            throw new java.lang.NullPointerException("Null cropRect");
        }
        this.cropRect = rect;
        if (matrix == null) {
            throw new java.lang.NullPointerException("Null sensorToBufferTransform");
        }
        this.sensorToBufferTransform = matrix;
        this.rotationDegrees = i17;
        this.jpegQuality = i18;
        this.captureMode = i19;
        if (list == null) {
            throw new java.lang.NullPointerException("Null sessionConfigCameraCaptureCallbacks");
        }
        this.sessionConfigCameraCaptureCallbacks = list;
    }

    public boolean equals(java.lang.Object obj) {
        androidx.camera.core.ImageCapture.OnImageCapturedCallback onImageCapturedCallback;
        androidx.camera.core.ImageCapture.OnImageSavedCallback onImageSavedCallback;
        androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.imagecapture.TakePictureRequest)) {
            return false;
        }
        androidx.camera.core.imagecapture.TakePictureRequest takePictureRequest = (androidx.camera.core.imagecapture.TakePictureRequest) obj;
        return this.appExecutor.equals(takePictureRequest.getAppExecutor()) && ((onImageCapturedCallback = this.inMemoryCallback) != null ? onImageCapturedCallback.equals(takePictureRequest.getInMemoryCallback()) : takePictureRequest.getInMemoryCallback() == null) && ((onImageSavedCallback = this.onDiskCallback) != null ? onImageSavedCallback.equals(takePictureRequest.getOnDiskCallback()) : takePictureRequest.getOnDiskCallback() == null) && ((outputFileOptions = this.outputFileOptions) != null ? outputFileOptions.equals(takePictureRequest.getOutputFileOptions()) : takePictureRequest.getOutputFileOptions() == null) && this.cropRect.equals(takePictureRequest.getCropRect()) && this.sensorToBufferTransform.equals(takePictureRequest.getSensorToBufferTransform()) && this.rotationDegrees == takePictureRequest.getRotationDegrees() && this.jpegQuality == takePictureRequest.getJpegQuality() && this.captureMode == takePictureRequest.getCaptureMode() && this.sessionConfigCameraCaptureCallbacks.equals(takePictureRequest.getSessionConfigCameraCaptureCallbacks());
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    public java.util.concurrent.Executor getAppExecutor() {
        return this.appExecutor;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    public int getCaptureMode() {
        return this.captureMode;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    public android.graphics.Rect getCropRect() {
        return this.cropRect;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    public androidx.camera.core.ImageCapture.OnImageCapturedCallback getInMemoryCallback() {
        return this.inMemoryCallback;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    public int getJpegQuality() {
        return this.jpegQuality;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    public androidx.camera.core.ImageCapture.OnImageSavedCallback getOnDiskCallback() {
        return this.onDiskCallback;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    public androidx.camera.core.ImageCapture.OutputFileOptions getOutputFileOptions() {
        return this.outputFileOptions;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    public int getRotationDegrees() {
        return this.rotationDegrees;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    public android.graphics.Matrix getSensorToBufferTransform() {
        return this.sensorToBufferTransform;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    public java.util.List<androidx.camera.core.impl.CameraCaptureCallback> getSessionConfigCameraCaptureCallbacks() {
        return this.sessionConfigCameraCaptureCallbacks;
    }

    public int hashCode() {
        int hashCode = (this.appExecutor.hashCode() ^ 1000003) * 1000003;
        androidx.camera.core.ImageCapture.OnImageCapturedCallback onImageCapturedCallback = this.inMemoryCallback;
        int hashCode2 = (hashCode ^ (onImageCapturedCallback == null ? 0 : onImageCapturedCallback.hashCode())) * 1000003;
        androidx.camera.core.ImageCapture.OnImageSavedCallback onImageSavedCallback = this.onDiskCallback;
        int hashCode3 = (hashCode2 ^ (onImageSavedCallback == null ? 0 : onImageSavedCallback.hashCode())) * 1000003;
        androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions = this.outputFileOptions;
        return ((((((((((((hashCode3 ^ (outputFileOptions != null ? outputFileOptions.hashCode() : 0)) * 1000003) ^ this.cropRect.hashCode()) * 1000003) ^ this.sensorToBufferTransform.hashCode()) * 1000003) ^ this.rotationDegrees) * 1000003) ^ this.jpegQuality) * 1000003) ^ this.captureMode) * 1000003) ^ this.sessionConfigCameraCaptureCallbacks.hashCode();
    }

    public java.lang.String toString() {
        return "TakePictureRequest{appExecutor=" + this.appExecutor + ", inMemoryCallback=" + this.inMemoryCallback + ", onDiskCallback=" + this.onDiskCallback + ", outputFileOptions=" + this.outputFileOptions + ", cropRect=" + this.cropRect + ", sensorToBufferTransform=" + this.sensorToBufferTransform + ", rotationDegrees=" + this.rotationDegrees + ", jpegQuality=" + this.jpegQuality + ", captureMode=" + this.captureMode + ", sessionConfigCameraCaptureCallbacks=" + this.sessionConfigCameraCaptureCallbacks + "}";
    }
}
