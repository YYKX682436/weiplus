package androidx.camera.core.imagecapture;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public final class AutoValue_CaptureNode_In extends androidx.camera.core.imagecapture.CaptureNode.In {
    private final androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.TakePictureManager.CaptureError> errorEdge;
    private final androidx.camera.core.ImageReaderProxyProvider imageReaderProxyProvider;
    private final int inputFormat;
    private final int outputFormat;
    private final int postviewImageFormat;
    private final android.util.Size postviewSize;
    private final androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingRequest> requestEdge;
    private final android.util.Size size;
    private final boolean virtualCamera;

    public AutoValue_CaptureNode_In(android.util.Size size, int i17, int i18, boolean z17, androidx.camera.core.ImageReaderProxyProvider imageReaderProxyProvider, android.util.Size size2, int i19, androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingRequest> edge, androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.TakePictureManager.CaptureError> edge2) {
        if (size == null) {
            throw new java.lang.NullPointerException("Null size");
        }
        this.size = size;
        this.inputFormat = i17;
        this.outputFormat = i18;
        this.virtualCamera = z17;
        this.imageReaderProxyProvider = imageReaderProxyProvider;
        this.postviewSize = size2;
        this.postviewImageFormat = i19;
        if (edge == null) {
            throw new java.lang.NullPointerException("Null requestEdge");
        }
        this.requestEdge = edge;
        if (edge2 == null) {
            throw new java.lang.NullPointerException("Null errorEdge");
        }
        this.errorEdge = edge2;
    }

    public boolean equals(java.lang.Object obj) {
        androidx.camera.core.ImageReaderProxyProvider imageReaderProxyProvider;
        android.util.Size size;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.imagecapture.CaptureNode.In)) {
            return false;
        }
        androidx.camera.core.imagecapture.CaptureNode.In in6 = (androidx.camera.core.imagecapture.CaptureNode.In) obj;
        return this.size.equals(in6.getSize()) && this.inputFormat == in6.getInputFormat() && this.outputFormat == in6.getOutputFormat() && this.virtualCamera == in6.isVirtualCamera() && ((imageReaderProxyProvider = this.imageReaderProxyProvider) != null ? imageReaderProxyProvider.equals(in6.getImageReaderProxyProvider()) : in6.getImageReaderProxyProvider() == null) && ((size = this.postviewSize) != null ? size.equals(in6.getPostviewSize()) : in6.getPostviewSize() == null) && this.postviewImageFormat == in6.getPostviewImageFormat() && this.requestEdge.equals(in6.getRequestEdge()) && this.errorEdge.equals(in6.getErrorEdge());
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    public androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.TakePictureManager.CaptureError> getErrorEdge() {
        return this.errorEdge;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    public androidx.camera.core.ImageReaderProxyProvider getImageReaderProxyProvider() {
        return this.imageReaderProxyProvider;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    public int getInputFormat() {
        return this.inputFormat;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    public int getOutputFormat() {
        return this.outputFormat;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    public int getPostviewImageFormat() {
        return this.postviewImageFormat;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    public android.util.Size getPostviewSize() {
        return this.postviewSize;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    public androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingRequest> getRequestEdge() {
        return this.requestEdge;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    public android.util.Size getSize() {
        return this.size;
    }

    public int hashCode() {
        int hashCode = (((((((this.size.hashCode() ^ 1000003) * 1000003) ^ this.inputFormat) * 1000003) ^ this.outputFormat) * 1000003) ^ (this.virtualCamera ? 1231 : 1237)) * 1000003;
        androidx.camera.core.ImageReaderProxyProvider imageReaderProxyProvider = this.imageReaderProxyProvider;
        int hashCode2 = (hashCode ^ (imageReaderProxyProvider == null ? 0 : imageReaderProxyProvider.hashCode())) * 1000003;
        android.util.Size size = this.postviewSize;
        return ((((((hashCode2 ^ (size != null ? size.hashCode() : 0)) * 1000003) ^ this.postviewImageFormat) * 1000003) ^ this.requestEdge.hashCode()) * 1000003) ^ this.errorEdge.hashCode();
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    public boolean isVirtualCamera() {
        return this.virtualCamera;
    }

    public java.lang.String toString() {
        return "In{size=" + this.size + ", inputFormat=" + this.inputFormat + ", outputFormat=" + this.outputFormat + ", virtualCamera=" + this.virtualCamera + ", imageReaderProxyProvider=" + this.imageReaderProxyProvider + ", postviewSize=" + this.postviewSize + ", postviewImageFormat=" + this.postviewImageFormat + ", requestEdge=" + this.requestEdge + ", errorEdge=" + this.errorEdge + "}";
    }
}
