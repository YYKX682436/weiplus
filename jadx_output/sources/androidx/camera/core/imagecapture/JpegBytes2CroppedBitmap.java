package androidx.camera.core.imagecapture;

/* loaded from: classes14.dex */
final class JpegBytes2CroppedBitmap implements androidx.camera.core.processing.Operation<androidx.camera.core.processing.Packet<byte[]>, androidx.camera.core.processing.Packet<android.graphics.Bitmap>> {
    private byte _hellAccFlag_;

    private android.graphics.Bitmap createCroppedBitmap(byte[] bArr, android.graphics.Rect rect) {
        try {
            android.graphics.BitmapRegionDecoder newInstance = android.graphics.BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false);
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(options);
            arrayList.add(rect);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(newInstance, arrayList.toArray(), "androidx/camera/core/imagecapture/JpegBytes2CroppedBitmap", "createCroppedBitmap", "([BLandroid/graphics/Rect;)Landroid/graphics/Bitmap;", "android/graphics/BitmapRegionDecoder_EXEC_", "decodeRegion", "(Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeRegion = newInstance.decodeRegion((android.graphics.Rect) arrayList.get(0), (android.graphics.BitmapFactory.Options) arrayList.get(1));
            yj0.a.e(newInstance, decodeRegion, "androidx/camera/core/imagecapture/JpegBytes2CroppedBitmap", "createCroppedBitmap", "([BLandroid/graphics/Rect;)Landroid/graphics/Bitmap;", "android/graphics/BitmapRegionDecoder_EXEC_", "decodeRegion", "(Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            return decodeRegion;
        } catch (java.io.IOException e17) {
            throw new androidx.camera.core.ImageCaptureException(1, "Failed to decode JPEG.", e17);
        }
    }

    @Override // androidx.camera.core.processing.Operation
    public androidx.camera.core.processing.Packet<android.graphics.Bitmap> apply(androidx.camera.core.processing.Packet<byte[]> packet) {
        android.graphics.Rect cropRect = packet.getCropRect();
        android.graphics.Bitmap createCroppedBitmap = createCroppedBitmap(packet.getData(), cropRect);
        androidx.camera.core.impl.utils.Exif exif = packet.getExif();
        java.util.Objects.requireNonNull(exif);
        return androidx.camera.core.processing.Packet.of(createCroppedBitmap, exif, new android.graphics.Rect(0, 0, createCroppedBitmap.getWidth(), createCroppedBitmap.getHeight()), packet.getRotationDegrees(), androidx.camera.core.impl.utils.TransformUtils.updateSensorToBufferTransform(packet.getSensorToBufferTransform(), cropRect), packet.getCameraCaptureResult());
    }
}
