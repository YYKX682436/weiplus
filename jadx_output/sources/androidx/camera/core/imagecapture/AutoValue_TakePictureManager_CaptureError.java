package androidx.camera.core.imagecapture;

/* loaded from: classes14.dex */
final class AutoValue_TakePictureManager_CaptureError extends androidx.camera.core.imagecapture.TakePictureManager.CaptureError {
    private final androidx.camera.core.ImageCaptureException imageCaptureException;
    private final int requestId;

    public AutoValue_TakePictureManager_CaptureError(int i17, androidx.camera.core.ImageCaptureException imageCaptureException) {
        this.requestId = i17;
        if (imageCaptureException == null) {
            throw new java.lang.NullPointerException("Null imageCaptureException");
        }
        this.imageCaptureException = imageCaptureException;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.imagecapture.TakePictureManager.CaptureError)) {
            return false;
        }
        androidx.camera.core.imagecapture.TakePictureManager.CaptureError captureError = (androidx.camera.core.imagecapture.TakePictureManager.CaptureError) obj;
        return this.requestId == captureError.getRequestId() && this.imageCaptureException.equals(captureError.getImageCaptureException());
    }

    @Override // androidx.camera.core.imagecapture.TakePictureManager.CaptureError
    public androidx.camera.core.ImageCaptureException getImageCaptureException() {
        return this.imageCaptureException;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureManager.CaptureError
    public int getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        return ((this.requestId ^ 1000003) * 1000003) ^ this.imageCaptureException.hashCode();
    }

    public java.lang.String toString() {
        return "CaptureError{requestId=" + this.requestId + ", imageCaptureException=" + this.imageCaptureException + "}";
    }
}
