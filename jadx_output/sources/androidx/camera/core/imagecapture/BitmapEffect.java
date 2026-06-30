package androidx.camera.core.imagecapture;

/* loaded from: classes14.dex */
public class BitmapEffect implements androidx.camera.core.processing.Operation<androidx.camera.core.processing.Packet<android.graphics.Bitmap>, androidx.camera.core.processing.Packet<android.graphics.Bitmap>> {
    private final androidx.camera.core.processing.InternalImageProcessor mProcessor;

    public BitmapEffect(androidx.camera.core.processing.InternalImageProcessor internalImageProcessor) {
        this.mProcessor = internalImageProcessor;
    }

    @Override // androidx.camera.core.processing.Operation
    public androidx.camera.core.processing.Packet<android.graphics.Bitmap> apply(androidx.camera.core.processing.Packet<android.graphics.Bitmap> packet) {
        androidx.camera.core.ImageProxy outputImage = this.mProcessor.safeProcess(new androidx.camera.core.processing.ImageProcessorRequest(new androidx.camera.core.imagecapture.RgbaImageProxy(packet), 1)).getOutputImage();
        java.util.Objects.requireNonNull(outputImage);
        android.graphics.Bitmap createBitmapFromPlane = androidx.camera.core.internal.utils.ImageUtil.createBitmapFromPlane(outputImage.getPlanes(), outputImage.getWidth(), outputImage.getHeight());
        androidx.camera.core.impl.utils.Exif exif = packet.getExif();
        java.util.Objects.requireNonNull(exif);
        return androidx.camera.core.processing.Packet.of(createBitmapFromPlane, exif, packet.getCropRect(), packet.getRotationDegrees(), packet.getSensorToBufferTransform(), packet.getCameraCaptureResult());
    }
}
