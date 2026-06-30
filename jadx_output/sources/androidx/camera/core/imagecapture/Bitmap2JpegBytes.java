package androidx.camera.core.imagecapture;

/* loaded from: classes14.dex */
class Bitmap2JpegBytes implements androidx.camera.core.processing.Operation<androidx.camera.core.imagecapture.Bitmap2JpegBytes.In, androidx.camera.core.processing.Packet<byte[]>> {

    /* loaded from: classes6.dex */
    public static class Api34Impl {
        private Api34Impl() {
        }

        public static boolean hasGainmap(android.graphics.Bitmap bitmap) {
            return bitmap.hasGainmap();
        }
    }

    /* loaded from: classes14.dex */
    public static abstract class In {
        public static androidx.camera.core.imagecapture.Bitmap2JpegBytes.In of(androidx.camera.core.processing.Packet<android.graphics.Bitmap> packet, int i17) {
            return new androidx.camera.core.imagecapture.AutoValue_Bitmap2JpegBytes_In(packet, i17);
        }

        public abstract int getJpegQuality();

        public abstract androidx.camera.core.processing.Packet<android.graphics.Bitmap> getPacket();
    }

    private static int getOutputFormat(android.graphics.Bitmap bitmap) {
        return (android.os.Build.VERSION.SDK_INT < 34 || !androidx.camera.core.imagecapture.Bitmap2JpegBytes.Api34Impl.hasGainmap(bitmap)) ? 256 : 4101;
    }

    @Override // androidx.camera.core.processing.Operation
    public androidx.camera.core.processing.Packet<byte[]> apply(androidx.camera.core.imagecapture.Bitmap2JpegBytes.In in6) {
        androidx.camera.core.processing.Packet<android.graphics.Bitmap> packet = in6.getPacket();
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        packet.getData().compress(android.graphics.Bitmap.CompressFormat.JPEG, in6.getJpegQuality(), byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        androidx.camera.core.impl.utils.Exif exif = packet.getExif();
        java.util.Objects.requireNonNull(exif);
        return androidx.camera.core.processing.Packet.of(byteArray, exif, getOutputFormat(packet.getData()), packet.getSize(), packet.getCropRect(), packet.getRotationDegrees(), packet.getSensorToBufferTransform(), packet.getCameraCaptureResult());
    }
}
