package androidx.camera.core.imagecapture;

/* loaded from: classes14.dex */
final class Image2JpegBytes implements androidx.camera.core.processing.Operation<androidx.camera.core.imagecapture.Image2JpegBytes.In, androidx.camera.core.processing.Packet<byte[]>> {
    private final androidx.camera.core.internal.compat.workaround.JpegMetadataCorrector mJpegMetadataCorrector;

    /* loaded from: classes14.dex */
    public static abstract class In {
        public static androidx.camera.core.imagecapture.Image2JpegBytes.In of(androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy> packet, int i17) {
            return new androidx.camera.core.imagecapture.AutoValue_Image2JpegBytes_In(packet, i17);
        }

        public abstract int getJpegQuality();

        public abstract androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy> getPacket();
    }

    public Image2JpegBytes(androidx.camera.core.impl.Quirks quirks) {
        this.mJpegMetadataCorrector = new androidx.camera.core.internal.compat.workaround.JpegMetadataCorrector(quirks);
    }

    private static androidx.camera.core.impl.utils.Exif extractExif(byte[] bArr) {
        try {
            return androidx.camera.core.impl.utils.Exif.createFromInputStream(new java.io.ByteArrayInputStream(bArr));
        } catch (java.io.IOException e17) {
            throw new androidx.camera.core.ImageCaptureException(0, "Failed to extract Exif from YUV-generated JPEG", e17);
        }
    }

    private androidx.camera.core.processing.Packet<byte[]> processJpegImage(androidx.camera.core.imagecapture.Image2JpegBytes.In in6, int i17) {
        androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy> packet = in6.getPacket();
        byte[] jpegImageToJpegByteArray = this.mJpegMetadataCorrector.jpegImageToJpegByteArray(packet.getData());
        androidx.camera.core.impl.utils.Exif exif = packet.getExif();
        java.util.Objects.requireNonNull(exif);
        return androidx.camera.core.processing.Packet.of(jpegImageToJpegByteArray, exif, i17, packet.getSize(), packet.getCropRect(), packet.getRotationDegrees(), packet.getSensorToBufferTransform(), packet.getCameraCaptureResult());
    }

    private androidx.camera.core.processing.Packet<byte[]> processYuvImage(androidx.camera.core.imagecapture.Image2JpegBytes.In in6) {
        androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy> packet = in6.getPacket();
        androidx.camera.core.ImageProxy data = packet.getData();
        android.graphics.Rect cropRect = packet.getCropRect();
        try {
            byte[] yuvImageToJpegByteArray = androidx.camera.core.internal.utils.ImageUtil.yuvImageToJpegByteArray(data, cropRect, in6.getJpegQuality(), packet.getRotationDegrees());
            return androidx.camera.core.processing.Packet.of(yuvImageToJpegByteArray, extractExif(yuvImageToJpegByteArray), 256, new android.util.Size(cropRect.width(), cropRect.height()), new android.graphics.Rect(0, 0, cropRect.width(), cropRect.height()), packet.getRotationDegrees(), androidx.camera.core.impl.utils.TransformUtils.updateSensorToBufferTransform(packet.getSensorToBufferTransform(), cropRect), packet.getCameraCaptureResult());
        } catch (androidx.camera.core.internal.utils.ImageUtil.CodecFailedException e17) {
            throw new androidx.camera.core.ImageCaptureException(1, "Failed to encode the image to JPEG.", e17);
        }
    }

    @Override // androidx.camera.core.processing.Operation
    public androidx.camera.core.processing.Packet<byte[]> apply(androidx.camera.core.imagecapture.Image2JpegBytes.In in6) {
        androidx.camera.core.processing.Packet<byte[]> processYuvImage;
        try {
            int format = in6.getPacket().getFormat();
            if (format != 35) {
                if (format != 256 && format != 4101) {
                    throw new java.lang.IllegalArgumentException("Unexpected format: " + format);
                }
                processYuvImage = processJpegImage(in6, format);
            } else {
                processYuvImage = processYuvImage(in6);
            }
            return processYuvImage;
        } finally {
            in6.getPacket().getData().close();
        }
    }
}
