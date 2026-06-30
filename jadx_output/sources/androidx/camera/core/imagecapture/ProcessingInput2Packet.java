package androidx.camera.core.imagecapture;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public final class ProcessingInput2Packet implements androidx.camera.core.processing.Operation<androidx.camera.core.imagecapture.ProcessingNode.InputPacket, androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy>> {
    private static androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy> createPacket(androidx.camera.core.imagecapture.ProcessingRequest processingRequest, androidx.camera.core.impl.utils.Exif exif, androidx.camera.core.ImageProxy imageProxy) {
        return androidx.camera.core.processing.Packet.of(imageProxy, exif, processingRequest.getCropRect(), processingRequest.getRotationDegrees(), processingRequest.getSensorToBufferTransform(), getCameraCaptureResult(imageProxy));
    }

    private static androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy> createPacketWithHalRotation(androidx.camera.core.imagecapture.ProcessingRequest processingRequest, androidx.camera.core.impl.utils.Exif exif, androidx.camera.core.ImageProxy imageProxy) {
        android.util.Size size = new android.util.Size(imageProxy.getWidth(), imageProxy.getHeight());
        int rotationDegrees = processingRequest.getRotationDegrees() - exif.getRotation();
        android.util.Size rotatedSize = getRotatedSize(rotationDegrees, size);
        android.graphics.Matrix rectToRect = androidx.camera.core.impl.utils.TransformUtils.getRectToRect(new android.graphics.RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new android.graphics.RectF(0.0f, 0.0f, rotatedSize.getWidth(), rotatedSize.getHeight()), rotationDegrees);
        return androidx.camera.core.processing.Packet.of(imageProxy, exif, rotatedSize, getUpdatedCropRect(processingRequest.getCropRect(), rectToRect), exif.getRotation(), getUpdatedTransform(processingRequest.getSensorToBufferTransform(), rectToRect), getCameraCaptureResult(imageProxy));
    }

    private static androidx.camera.core.impl.CameraCaptureResult getCameraCaptureResult(androidx.camera.core.ImageProxy imageProxy) {
        return imageProxy.getImageInfo() instanceof androidx.camera.core.internal.CameraCaptureResultImageInfo ? ((androidx.camera.core.internal.CameraCaptureResultImageInfo) imageProxy.getImageInfo()).getCameraCaptureResult() : androidx.camera.core.impl.CameraCaptureResult.EmptyCameraCaptureResult.create();
    }

    private static android.util.Size getRotatedSize(int i17, android.util.Size size) {
        return androidx.camera.core.impl.utils.TransformUtils.is90or270(androidx.camera.core.impl.utils.TransformUtils.within360(i17)) ? new android.util.Size(size.getHeight(), size.getWidth()) : size;
    }

    private static android.graphics.Rect getUpdatedCropRect(android.graphics.Rect rect, android.graphics.Matrix matrix) {
        android.graphics.RectF rectF = new android.graphics.RectF(rect);
        matrix.mapRect(rectF);
        rectF.sort();
        android.graphics.Rect rect2 = new android.graphics.Rect();
        rectF.round(rect2);
        return rect2;
    }

    private static android.graphics.Matrix getUpdatedTransform(android.graphics.Matrix matrix, android.graphics.Matrix matrix2) {
        android.graphics.Matrix matrix3 = new android.graphics.Matrix(matrix);
        matrix3.postConcat(matrix2);
        return matrix3;
    }

    @Override // androidx.camera.core.processing.Operation
    public androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy> apply(androidx.camera.core.imagecapture.ProcessingNode.InputPacket inputPacket) {
        androidx.camera.core.impl.utils.Exif createFromImageProxy;
        androidx.camera.core.ImageProxy imageProxy = inputPacket.getImageProxy();
        androidx.camera.core.imagecapture.ProcessingRequest processingRequest = inputPacket.getProcessingRequest();
        if (androidx.camera.core.internal.utils.ImageUtil.isJpegFormats(imageProxy.getFormat())) {
            try {
                createFromImageProxy = androidx.camera.core.impl.utils.Exif.createFromImageProxy(imageProxy);
                imageProxy.getPlanes()[0].getBuffer().rewind();
            } catch (java.io.IOException e17) {
                throw new androidx.camera.core.ImageCaptureException(1, "Failed to extract EXIF data.", e17);
            }
        } else {
            createFromImageProxy = null;
        }
        if (androidx.camera.core.imagecapture.ImagePipeline.EXIF_ROTATION_AVAILABILITY.shouldUseExifOrientation(imageProxy)) {
            m3.h.d(createFromImageProxy, "JPEG image must have exif.");
            return createPacketWithHalRotation(processingRequest, createFromImageProxy, imageProxy);
        }
        return createPacket(processingRequest, createFromImageProxy, imageProxy);
    }
}
