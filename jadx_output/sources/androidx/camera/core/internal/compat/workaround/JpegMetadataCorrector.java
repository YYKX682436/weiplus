package androidx.camera.core.internal.compat.workaround;

/* loaded from: classes13.dex */
public class JpegMetadataCorrector {
    private final androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk mQuirk;

    public JpegMetadataCorrector(androidx.camera.core.impl.Quirks quirks) {
        this.mQuirk = (androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk) quirks.get(androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk.class);
    }

    public byte[] jpegImageToJpegByteArray(androidx.camera.core.ImageProxy imageProxy) {
        androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk = this.mQuirk;
        if (incorrectJpegMetadataQuirk != null) {
            return incorrectJpegMetadataQuirk.jpegImageToJpegByteArray(imageProxy);
        }
        java.nio.ByteBuffer buffer = imageProxy.getPlanes()[0].getBuffer();
        byte[] bArr = new byte[buffer.capacity()];
        buffer.rewind();
        buffer.get(bArr);
        return bArr;
    }

    public boolean needCorrectJpegMetadata() {
        return this.mQuirk != null;
    }
}
