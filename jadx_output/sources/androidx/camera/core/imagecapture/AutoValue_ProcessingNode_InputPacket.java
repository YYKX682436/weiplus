package androidx.camera.core.imagecapture;

/* loaded from: classes14.dex */
final class AutoValue_ProcessingNode_InputPacket extends androidx.camera.core.imagecapture.ProcessingNode.InputPacket {
    private final androidx.camera.core.ImageProxy imageProxy;
    private final androidx.camera.core.imagecapture.ProcessingRequest processingRequest;

    public AutoValue_ProcessingNode_InputPacket(androidx.camera.core.imagecapture.ProcessingRequest processingRequest, androidx.camera.core.ImageProxy imageProxy) {
        if (processingRequest == null) {
            throw new java.lang.NullPointerException("Null processingRequest");
        }
        this.processingRequest = processingRequest;
        if (imageProxy == null) {
            throw new java.lang.NullPointerException("Null imageProxy");
        }
        this.imageProxy = imageProxy;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.imagecapture.ProcessingNode.InputPacket)) {
            return false;
        }
        androidx.camera.core.imagecapture.ProcessingNode.InputPacket inputPacket = (androidx.camera.core.imagecapture.ProcessingNode.InputPacket) obj;
        return this.processingRequest.equals(inputPacket.getProcessingRequest()) && this.imageProxy.equals(inputPacket.getImageProxy());
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.InputPacket
    public androidx.camera.core.ImageProxy getImageProxy() {
        return this.imageProxy;
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.InputPacket
    public androidx.camera.core.imagecapture.ProcessingRequest getProcessingRequest() {
        return this.processingRequest;
    }

    public int hashCode() {
        return ((this.processingRequest.hashCode() ^ 1000003) * 1000003) ^ this.imageProxy.hashCode();
    }

    public java.lang.String toString() {
        return "InputPacket{processingRequest=" + this.processingRequest + ", imageProxy=" + this.imageProxy + "}";
    }
}
