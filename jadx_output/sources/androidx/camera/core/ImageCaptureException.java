package androidx.camera.core;

/* loaded from: classes13.dex */
public class ImageCaptureException extends java.lang.Exception {
    private final int mImageCaptureError;

    public ImageCaptureException(int i17, java.lang.String str, java.lang.Throwable th6) {
        super(str, th6);
        this.mImageCaptureError = i17;
    }

    public int getImageCaptureError() {
        return this.mImageCaptureError;
    }
}
