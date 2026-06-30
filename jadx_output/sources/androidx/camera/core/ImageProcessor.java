package androidx.camera.core;

/* loaded from: classes14.dex */
public interface ImageProcessor {

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface OutputFormats {
    }

    /* loaded from: classes14.dex */
    public interface Request {
        androidx.camera.core.ImageProxy getInputImage();

        int getOutputFormat();
    }

    /* loaded from: classes14.dex */
    public interface Response {
        androidx.camera.core.ImageProxy getOutputImage();
    }

    androidx.camera.core.ImageProcessor.Response process(androidx.camera.core.ImageProcessor.Request request);
}
