package androidx.camera.core.imagecapture;

/* loaded from: classes14.dex */
final class AutoValue_Image2JpegBytes_In extends androidx.camera.core.imagecapture.Image2JpegBytes.In {
    private final int jpegQuality;
    private final androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy> packet;

    public AutoValue_Image2JpegBytes_In(androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy> packet, int i17) {
        if (packet == null) {
            throw new java.lang.NullPointerException("Null packet");
        }
        this.packet = packet;
        this.jpegQuality = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.imagecapture.Image2JpegBytes.In)) {
            return false;
        }
        androidx.camera.core.imagecapture.Image2JpegBytes.In in6 = (androidx.camera.core.imagecapture.Image2JpegBytes.In) obj;
        return this.packet.equals(in6.getPacket()) && this.jpegQuality == in6.getJpegQuality();
    }

    @Override // androidx.camera.core.imagecapture.Image2JpegBytes.In
    public int getJpegQuality() {
        return this.jpegQuality;
    }

    @Override // androidx.camera.core.imagecapture.Image2JpegBytes.In
    public androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy> getPacket() {
        return this.packet;
    }

    public int hashCode() {
        return ((this.packet.hashCode() ^ 1000003) * 1000003) ^ this.jpegQuality;
    }

    public java.lang.String toString() {
        return "In{packet=" + this.packet + ", jpegQuality=" + this.jpegQuality + "}";
    }
}
