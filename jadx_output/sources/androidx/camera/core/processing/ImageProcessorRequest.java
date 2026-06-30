package androidx.camera.core.processing;

/* loaded from: classes14.dex */
public class ImageProcessorRequest implements androidx.camera.core.ImageProcessor.Request {
    private final androidx.camera.core.ImageProxy mImageProxy;
    private final int mOutputFormat;

    public ImageProcessorRequest(androidx.camera.core.ImageProxy imageProxy, int i17) {
        this.mImageProxy = imageProxy;
        this.mOutputFormat = i17;
    }

    @Override // androidx.camera.core.ImageProcessor.Request
    public androidx.camera.core.ImageProxy getInputImage() {
        return this.mImageProxy;
    }

    @Override // androidx.camera.core.ImageProcessor.Request
    public int getOutputFormat() {
        return this.mOutputFormat;
    }
}
