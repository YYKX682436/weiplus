package androidx.camera.core.imagecapture;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class AutoValue_JpegBytes2Disk_In extends androidx.camera.core.imagecapture.JpegBytes2Disk.In {
    private final androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions;
    private final androidx.camera.core.processing.Packet<byte[]> packet;

    public AutoValue_JpegBytes2Disk_In(androidx.camera.core.processing.Packet<byte[]> packet, androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions) {
        if (packet == null) {
            throw new java.lang.NullPointerException("Null packet");
        }
        this.packet = packet;
        if (outputFileOptions == null) {
            throw new java.lang.NullPointerException("Null outputFileOptions");
        }
        this.outputFileOptions = outputFileOptions;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.imagecapture.JpegBytes2Disk.In)) {
            return false;
        }
        androidx.camera.core.imagecapture.JpegBytes2Disk.In in6 = (androidx.camera.core.imagecapture.JpegBytes2Disk.In) obj;
        return this.packet.equals(in6.getPacket()) && this.outputFileOptions.equals(in6.getOutputFileOptions());
    }

    @Override // androidx.camera.core.imagecapture.JpegBytes2Disk.In
    public androidx.camera.core.ImageCapture.OutputFileOptions getOutputFileOptions() {
        return this.outputFileOptions;
    }

    @Override // androidx.camera.core.imagecapture.JpegBytes2Disk.In
    public androidx.camera.core.processing.Packet<byte[]> getPacket() {
        return this.packet;
    }

    public int hashCode() {
        return ((this.packet.hashCode() ^ 1000003) * 1000003) ^ this.outputFileOptions.hashCode();
    }

    public java.lang.String toString() {
        return "In{packet=" + this.packet + ", outputFileOptions=" + this.outputFileOptions + "}";
    }
}
