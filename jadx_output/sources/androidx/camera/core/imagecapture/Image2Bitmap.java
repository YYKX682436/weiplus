package androidx.camera.core.imagecapture;

/* loaded from: classes14.dex */
public class Image2Bitmap implements androidx.camera.core.processing.Operation<androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy>, android.graphics.Bitmap> {
    @Override // androidx.camera.core.processing.Operation
    public android.graphics.Bitmap apply(androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy> packet) {
        android.graphics.Bitmap rotateBitmap;
        androidx.camera.core.SafeCloseImageReaderProxy safeCloseImageReaderProxy = null;
        try {
            try {
                if (packet.getFormat() == 35) {
                    androidx.camera.core.ImageProxy data = packet.getData();
                    boolean z17 = packet.getRotationDegrees() % 180 != 0;
                    androidx.camera.core.SafeCloseImageReaderProxy safeCloseImageReaderProxy2 = new androidx.camera.core.SafeCloseImageReaderProxy(androidx.camera.core.ImageReaderProxys.createIsolatedReader(z17 ? data.getHeight() : data.getWidth(), z17 ? data.getWidth() : data.getHeight(), 1, 2));
                    try {
                        androidx.camera.core.ImageProxy convertYUVToRGB = androidx.camera.core.ImageProcessingUtil.convertYUVToRGB(data, safeCloseImageReaderProxy2, java.nio.ByteBuffer.allocateDirect(data.getWidth() * data.getHeight() * 4), packet.getRotationDegrees(), false);
                        data.close();
                        if (convertYUVToRGB != null) {
                            rotateBitmap = androidx.camera.core.internal.utils.ImageUtil.createBitmapFromImageProxy(convertYUVToRGB);
                            convertYUVToRGB.close();
                            safeCloseImageReaderProxy = safeCloseImageReaderProxy2;
                        } else {
                            throw new androidx.camera.core.ImageCaptureException(0, "Can't covert YUV to RGB", null);
                        }
                    } catch (java.lang.UnsupportedOperationException e17) {
                        e = e17;
                        throw new androidx.camera.core.ImageCaptureException(0, "Can't convert " + (packet.getFormat() == 35 ? "YUV" : "JPEG") + " to bitmap", e);
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        safeCloseImageReaderProxy = safeCloseImageReaderProxy2;
                        if (safeCloseImageReaderProxy != null) {
                            safeCloseImageReaderProxy.close();
                        }
                        throw th;
                    }
                } else if (packet.getFormat() == 256) {
                    androidx.camera.core.ImageProxy data2 = packet.getData();
                    android.graphics.Bitmap createBitmapFromImageProxy = androidx.camera.core.internal.utils.ImageUtil.createBitmapFromImageProxy(data2);
                    data2.close();
                    rotateBitmap = androidx.camera.core.internal.utils.ImageUtil.rotateBitmap(createBitmapFromImageProxy, packet.getRotationDegrees());
                } else {
                    throw new java.lang.IllegalArgumentException("Invalid postview image format : " + packet.getFormat());
                }
                if (safeCloseImageReaderProxy != null) {
                    safeCloseImageReaderProxy.close();
                }
                return rotateBitmap;
            } catch (java.lang.UnsupportedOperationException e18) {
                e = e18;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }
}
