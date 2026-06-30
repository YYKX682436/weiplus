package androidx.camera.core.imagecapture;

/* loaded from: classes14.dex */
public class NoMetadataImageReader implements androidx.camera.core.impl.ImageReaderProxy {
    private androidx.camera.core.imagecapture.ProcessingRequest mPendingRequest;
    private final androidx.camera.core.impl.ImageReaderProxy mWrappedImageReader;

    public NoMetadataImageReader(androidx.camera.core.impl.ImageReaderProxy imageReaderProxy) {
        this.mWrappedImageReader = imageReaderProxy;
    }

    private androidx.camera.core.ImageProxy createImageProxyWithEmptyMetadata(androidx.camera.core.ImageProxy imageProxy) {
        if (imageProxy == null) {
            return null;
        }
        androidx.camera.core.impl.TagBundle emptyBundle = this.mPendingRequest == null ? androidx.camera.core.impl.TagBundle.emptyBundle() : androidx.camera.core.impl.TagBundle.create(new android.util.Pair(this.mPendingRequest.getTagBundleKey(), this.mPendingRequest.getStageIds().get(0)));
        this.mPendingRequest = null;
        return new androidx.camera.core.SettableImageProxy(imageProxy, new android.util.Size(imageProxy.getWidth(), imageProxy.getHeight()), new androidx.camera.core.internal.CameraCaptureResultImageInfo(new androidx.camera.core.streamsharing.VirtualCameraCaptureResult(emptyBundle, imageProxy.getImageInfo().getTimestamp())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnImageAvailableListener$0(androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, androidx.camera.core.impl.ImageReaderProxy imageReaderProxy) {
        onImageAvailableListener.onImageAvailable(this);
    }

    public void acceptProcessingRequest(androidx.camera.core.imagecapture.ProcessingRequest processingRequest) {
        m3.h.e(this.mPendingRequest == null, "Pending request should be null");
        this.mPendingRequest = processingRequest;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public androidx.camera.core.ImageProxy acquireLatestImage() {
        return createImageProxyWithEmptyMetadata(this.mWrappedImageReader.acquireLatestImage());
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public androidx.camera.core.ImageProxy acquireNextImage() {
        return createImageProxyWithEmptyMetadata(this.mWrappedImageReader.acquireNextImage());
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void clearOnImageAvailableListener() {
        this.mWrappedImageReader.clearOnImageAvailableListener();
    }

    public void clearProcessingRequest() {
        this.mPendingRequest = null;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void close() {
        this.mWrappedImageReader.close();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getHeight() {
        return this.mWrappedImageReader.getHeight();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getImageFormat() {
        return this.mWrappedImageReader.getImageFormat();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getMaxImages() {
        return this.mWrappedImageReader.getMaxImages();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public android.view.Surface getSurface() {
        return this.mWrappedImageReader.getSurface();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getWidth() {
        return this.mWrappedImageReader.getWidth();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void setOnImageAvailableListener(final androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, java.util.concurrent.Executor executor) {
        this.mWrappedImageReader.setOnImageAvailableListener(new androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.core.imagecapture.NoMetadataImageReader$$a
            @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
            public final void onImageAvailable(androidx.camera.core.impl.ImageReaderProxy imageReaderProxy) {
                androidx.camera.core.imagecapture.NoMetadataImageReader.this.lambda$setOnImageAvailableListener$0(onImageAvailableListener, imageReaderProxy);
            }
        }, executor);
    }
}
