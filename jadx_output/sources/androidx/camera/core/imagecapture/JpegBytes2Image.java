package androidx.camera.core.imagecapture;

/* loaded from: classes14.dex */
public class JpegBytes2Image implements androidx.camera.core.processing.Operation<androidx.camera.core.processing.Packet<byte[]>, androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy>> {
    private static final int MAX_IMAGES = 2;

    @Override // androidx.camera.core.processing.Operation
    public androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy> apply(androidx.camera.core.processing.Packet<byte[]> packet) {
        androidx.camera.core.SafeCloseImageReaderProxy safeCloseImageReaderProxy = new androidx.camera.core.SafeCloseImageReaderProxy(androidx.camera.core.ImageReaderProxys.createIsolatedReader(packet.getSize().getWidth(), packet.getSize().getHeight(), 256, 2));
        androidx.camera.core.ImageProxy convertJpegBytesToImage = androidx.camera.core.ImageProcessingUtil.convertJpegBytesToImage(safeCloseImageReaderProxy, packet.getData());
        safeCloseImageReaderProxy.safeClose();
        java.util.Objects.requireNonNull(convertJpegBytesToImage);
        androidx.camera.core.impl.utils.Exif exif = packet.getExif();
        java.util.Objects.requireNonNull(exif);
        return androidx.camera.core.processing.Packet.of(convertJpegBytesToImage, exif, packet.getCropRect(), packet.getRotationDegrees(), packet.getSensorToBufferTransform(), packet.getCameraCaptureResult());
    }
}
