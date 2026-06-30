package androidx.camera.core;

/* loaded from: classes14.dex */
public final class ImageProcessingUtil {
    private static final java.lang.String TAG = "ImageProcessingUtil";
    private static int sImageCount;
    private byte _hellAccFlag_;

    /* loaded from: classes6.dex */
    public enum Result {
        UNKNOWN,
        SUCCESS,
        ERROR_CONVERSION
    }

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("image_processing_util_jni");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "androidx/camera/core/ImageProcessingUtil", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "androidx/camera/core/ImageProcessingUtil", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    private ImageProcessingUtil() {
    }

    public static boolean applyPixelShiftForYUV(androidx.camera.core.ImageProxy imageProxy) {
        if (!isSupportedYUVFormat(imageProxy)) {
            androidx.camera.core.Logger.e(TAG, "Unsupported format for YUV to RGB");
            return false;
        }
        if (applyPixelShiftInternal(imageProxy) != androidx.camera.core.ImageProcessingUtil.Result.ERROR_CONVERSION) {
            return true;
        }
        androidx.camera.core.Logger.e(TAG, "One pixel shift for YUV failure");
        return false;
    }

    private static androidx.camera.core.ImageProcessingUtil.Result applyPixelShiftInternal(androidx.camera.core.ImageProxy imageProxy) {
        int width = imageProxy.getWidth();
        int height = imageProxy.getHeight();
        int rowStride = imageProxy.getPlanes()[0].getRowStride();
        int rowStride2 = imageProxy.getPlanes()[1].getRowStride();
        int rowStride3 = imageProxy.getPlanes()[2].getRowStride();
        int pixelStride = imageProxy.getPlanes()[0].getPixelStride();
        int pixelStride2 = imageProxy.getPlanes()[1].getPixelStride();
        return nativeShiftPixel(imageProxy.getPlanes()[0].getBuffer(), rowStride, imageProxy.getPlanes()[1].getBuffer(), rowStride2, imageProxy.getPlanes()[2].getBuffer(), rowStride3, pixelStride, pixelStride2, width, height, pixelStride, pixelStride2, pixelStride2) != 0 ? androidx.camera.core.ImageProcessingUtil.Result.ERROR_CONVERSION : androidx.camera.core.ImageProcessingUtil.Result.SUCCESS;
    }

    public static androidx.camera.core.ImageProxy convertJpegBytesToImage(androidx.camera.core.impl.ImageReaderProxy imageReaderProxy, byte[] bArr) {
        m3.h.a(imageReaderProxy.getImageFormat() == 256);
        bArr.getClass();
        android.view.Surface surface = imageReaderProxy.getSurface();
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            androidx.camera.core.Logger.e(TAG, "Failed to enqueue JPEG image.");
            return null;
        }
        androidx.camera.core.ImageProxy acquireLatestImage = imageReaderProxy.acquireLatestImage();
        if (acquireLatestImage == null) {
            androidx.camera.core.Logger.e(TAG, "Failed to get acquire JPEG image.");
        }
        return acquireLatestImage;
    }

    public static android.graphics.Bitmap convertYUVToBitmap(androidx.camera.core.ImageProxy imageProxy) {
        if (imageProxy.getFormat() != 35) {
            throw new java.lang.IllegalArgumentException("Input image format must be YUV_420_888");
        }
        int width = imageProxy.getWidth();
        int height = imageProxy.getHeight();
        int rowStride = imageProxy.getPlanes()[0].getRowStride();
        int rowStride2 = imageProxy.getPlanes()[1].getRowStride();
        int rowStride3 = imageProxy.getPlanes()[2].getRowStride();
        int pixelStride = imageProxy.getPlanes()[0].getPixelStride();
        int pixelStride2 = imageProxy.getPlanes()[1].getPixelStride();
        int width2 = imageProxy.getWidth();
        int height2 = imageProxy.getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(height2));
        arrayList.add(java.lang.Integer.valueOf(width2));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "androidx/camera/core/ImageProcessingUtil", "convertYUVToBitmap", "(Landroidx/camera/core/ImageProxy;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "androidx/camera/core/ImageProcessingUtil", "convertYUVToBitmap", "(Landroidx/camera/core/ImageProxy;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        if (nativeConvertAndroid420ToBitmap(imageProxy.getPlanes()[0].getBuffer(), rowStride, imageProxy.getPlanes()[1].getBuffer(), rowStride2, imageProxy.getPlanes()[2].getBuffer(), rowStride3, pixelStride, pixelStride2, createBitmap, createBitmap.getRowBytes(), width, height) == 0) {
            return createBitmap;
        }
        throw new java.lang.UnsupportedOperationException("YUV to RGB conversion failed");
    }

    public static androidx.camera.core.ImageProxy convertYUVToRGB(final androidx.camera.core.ImageProxy imageProxy, androidx.camera.core.impl.ImageReaderProxy imageReaderProxy, java.nio.ByteBuffer byteBuffer, int i17, boolean z17) {
        if (!isSupportedYUVFormat(imageProxy)) {
            androidx.camera.core.Logger.e(TAG, "Unsupported format for YUV to RGB");
            return null;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (!isSupportedRotationDegrees(i17)) {
            androidx.camera.core.Logger.e(TAG, "Unsupported rotation degrees for rotate RGB");
            return null;
        }
        if (convertYUVToRGBInternal(imageProxy, imageReaderProxy.getSurface(), byteBuffer, i17, z17) == androidx.camera.core.ImageProcessingUtil.Result.ERROR_CONVERSION) {
            androidx.camera.core.Logger.e(TAG, "YUV to RGB conversion failure");
            return null;
        }
        if (android.util.Log.isLoggable("MH", 3)) {
            androidx.camera.core.Logger.d(TAG, java.lang.String.format(java.util.Locale.US, "Image processing performance profiling, duration: [%d], image count: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(sImageCount)));
            sImageCount++;
        }
        final androidx.camera.core.ImageProxy acquireLatestImage = imageReaderProxy.acquireLatestImage();
        if (acquireLatestImage == null) {
            androidx.camera.core.Logger.e(TAG, "YUV to RGB acquireLatestImage failure");
            return null;
        }
        androidx.camera.core.SingleCloseImageProxy singleCloseImageProxy = new androidx.camera.core.SingleCloseImageProxy(acquireLatestImage);
        singleCloseImageProxy.addOnImageCloseListener(new androidx.camera.core.ForwardingImageProxy.OnImageCloseListener() { // from class: androidx.camera.core.ImageProcessingUtil$$a
            @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
            public final void onImageClose(androidx.camera.core.ImageProxy imageProxy2) {
                androidx.camera.core.ImageProcessingUtil.lambda$convertYUVToRGB$0(androidx.camera.core.ImageProxy.this, imageProxy, imageProxy2);
            }
        });
        return singleCloseImageProxy;
    }

    private static androidx.camera.core.ImageProcessingUtil.Result convertYUVToRGBInternal(androidx.camera.core.ImageProxy imageProxy, android.view.Surface surface, java.nio.ByteBuffer byteBuffer, int i17, boolean z17) {
        int width = imageProxy.getWidth();
        int height = imageProxy.getHeight();
        int rowStride = imageProxy.getPlanes()[0].getRowStride();
        int rowStride2 = imageProxy.getPlanes()[1].getRowStride();
        int rowStride3 = imageProxy.getPlanes()[2].getRowStride();
        int pixelStride = imageProxy.getPlanes()[0].getPixelStride();
        int pixelStride2 = imageProxy.getPlanes()[1].getPixelStride();
        return nativeConvertAndroid420ToABGR(imageProxy.getPlanes()[0].getBuffer(), rowStride, imageProxy.getPlanes()[1].getBuffer(), rowStride2, imageProxy.getPlanes()[2].getBuffer(), rowStride3, pixelStride, pixelStride2, surface, byteBuffer, width, height, z17 ? pixelStride : 0, z17 ? pixelStride2 : 0, z17 ? pixelStride2 : 0, i17) != 0 ? androidx.camera.core.ImageProcessingUtil.Result.ERROR_CONVERSION : androidx.camera.core.ImageProcessingUtil.Result.SUCCESS;
    }

    public static boolean convertYuvToJpegBytesIntoSurface(android.media.Image image, int i17, int i18, android.view.Surface surface) {
        return convertYuvToJpegBytesIntoSurface(new androidx.camera.core.AndroidImageProxy(image), i17, i18, surface);
    }

    public static void copyBitmapToByteBuffer(android.graphics.Bitmap bitmap, java.nio.ByteBuffer byteBuffer, int i17) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, bitmap.getRowBytes(), i17, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    public static void copyByteBufferToBitmap(android.graphics.Bitmap bitmap, java.nio.ByteBuffer byteBuffer, int i17) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i17, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    private static boolean isSupportedRotationDegrees(int i17) {
        return i17 == 0 || i17 == 90 || i17 == 180 || i17 == 270;
    }

    private static boolean isSupportedYUVFormat(androidx.camera.core.ImageProxy imageProxy) {
        return imageProxy.getFormat() == 35 && imageProxy.getPlanes().length == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$convertYUVToRGB$0(androidx.camera.core.ImageProxy imageProxy, androidx.camera.core.ImageProxy imageProxy2, androidx.camera.core.ImageProxy imageProxy3) {
        if (imageProxy == null || imageProxy2 == null) {
            return;
        }
        imageProxy2.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$rotateYUV$1(androidx.camera.core.ImageProxy imageProxy, androidx.camera.core.ImageProxy imageProxy2, androidx.camera.core.ImageProxy imageProxy3) {
        if (imageProxy == null || imageProxy2 == null) {
            return;
        }
        imageProxy2.close();
    }

    private static native int nativeConvertAndroid420ToABGR(java.nio.ByteBuffer byteBuffer, int i17, java.nio.ByteBuffer byteBuffer2, int i18, java.nio.ByteBuffer byteBuffer3, int i19, int i27, int i28, android.view.Surface surface, java.nio.ByteBuffer byteBuffer4, int i29, int i37, int i38, int i39, int i47, int i48);

    private static native int nativeConvertAndroid420ToBitmap(java.nio.ByteBuffer byteBuffer, int i17, java.nio.ByteBuffer byteBuffer2, int i18, java.nio.ByteBuffer byteBuffer3, int i19, int i27, int i28, android.graphics.Bitmap bitmap, int i29, int i37, int i38);

    private static native int nativeCopyBetweenByteBufferAndBitmap(android.graphics.Bitmap bitmap, java.nio.ByteBuffer byteBuffer, int i17, int i18, int i19, int i27, boolean z17);

    private static native int nativeRotateYUV(java.nio.ByteBuffer byteBuffer, int i17, java.nio.ByteBuffer byteBuffer2, int i18, java.nio.ByteBuffer byteBuffer3, int i19, int i27, java.nio.ByteBuffer byteBuffer4, int i28, int i29, java.nio.ByteBuffer byteBuffer5, int i37, int i38, java.nio.ByteBuffer byteBuffer6, int i39, int i47, java.nio.ByteBuffer byteBuffer7, java.nio.ByteBuffer byteBuffer8, java.nio.ByteBuffer byteBuffer9, int i48, int i49, int i57);

    private static native int nativeShiftPixel(java.nio.ByteBuffer byteBuffer, int i17, java.nio.ByteBuffer byteBuffer2, int i18, java.nio.ByteBuffer byteBuffer3, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47);

    private static native int nativeWriteJpegToSurface(byte[] bArr, android.view.Surface surface);

    public static androidx.camera.core.ImageProxy rotateYUV(final androidx.camera.core.ImageProxy imageProxy, androidx.camera.core.impl.ImageReaderProxy imageReaderProxy, android.media.ImageWriter imageWriter, java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2, java.nio.ByteBuffer byteBuffer3, int i17) {
        if (!isSupportedYUVFormat(imageProxy)) {
            androidx.camera.core.Logger.e(TAG, "Unsupported format for rotate YUV");
            return null;
        }
        if (!isSupportedRotationDegrees(i17)) {
            androidx.camera.core.Logger.e(TAG, "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        androidx.camera.core.ImageProcessingUtil.Result result = androidx.camera.core.ImageProcessingUtil.Result.ERROR_CONVERSION;
        if ((i17 > 0 ? rotateYUVInternal(imageProxy, imageWriter, byteBuffer, byteBuffer2, byteBuffer3, i17) : result) == result) {
            androidx.camera.core.Logger.e(TAG, "rotate YUV failure");
            return null;
        }
        final androidx.camera.core.ImageProxy acquireLatestImage = imageReaderProxy.acquireLatestImage();
        if (acquireLatestImage == null) {
            androidx.camera.core.Logger.e(TAG, "YUV rotation acquireLatestImage failure");
            return null;
        }
        androidx.camera.core.SingleCloseImageProxy singleCloseImageProxy = new androidx.camera.core.SingleCloseImageProxy(acquireLatestImage);
        singleCloseImageProxy.addOnImageCloseListener(new androidx.camera.core.ForwardingImageProxy.OnImageCloseListener() { // from class: androidx.camera.core.ImageProcessingUtil$$b
            @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
            public final void onImageClose(androidx.camera.core.ImageProxy imageProxy2) {
                androidx.camera.core.ImageProcessingUtil.lambda$rotateYUV$1(androidx.camera.core.ImageProxy.this, imageProxy, imageProxy2);
            }
        });
        return singleCloseImageProxy;
    }

    private static androidx.camera.core.ImageProcessingUtil.Result rotateYUVInternal(androidx.camera.core.ImageProxy imageProxy, android.media.ImageWriter imageWriter, java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2, java.nio.ByteBuffer byteBuffer3, int i17) {
        int width = imageProxy.getWidth();
        int height = imageProxy.getHeight();
        int rowStride = imageProxy.getPlanes()[0].getRowStride();
        int rowStride2 = imageProxy.getPlanes()[1].getRowStride();
        int rowStride3 = imageProxy.getPlanes()[2].getRowStride();
        int pixelStride = imageProxy.getPlanes()[1].getPixelStride();
        android.media.Image dequeueInputImage = androidx.camera.core.internal.compat.ImageWriterCompat.dequeueInputImage(imageWriter);
        if (dequeueInputImage != null && nativeRotateYUV(imageProxy.getPlanes()[0].getBuffer(), rowStride, imageProxy.getPlanes()[1].getBuffer(), rowStride2, imageProxy.getPlanes()[2].getBuffer(), rowStride3, pixelStride, dequeueInputImage.getPlanes()[0].getBuffer(), dequeueInputImage.getPlanes()[0].getRowStride(), dequeueInputImage.getPlanes()[0].getPixelStride(), dequeueInputImage.getPlanes()[1].getBuffer(), dequeueInputImage.getPlanes()[1].getRowStride(), dequeueInputImage.getPlanes()[1].getPixelStride(), dequeueInputImage.getPlanes()[2].getBuffer(), dequeueInputImage.getPlanes()[2].getRowStride(), dequeueInputImage.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, width, height, i17) == 0) {
            androidx.camera.core.internal.compat.ImageWriterCompat.queueInputImage(imageWriter, dequeueInputImage);
            return androidx.camera.core.ImageProcessingUtil.Result.SUCCESS;
        }
        return androidx.camera.core.ImageProcessingUtil.Result.ERROR_CONVERSION;
    }

    public static boolean writeJpegBytesToSurface(android.view.Surface surface, byte[] bArr) {
        bArr.getClass();
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) == 0) {
            return true;
        }
        androidx.camera.core.Logger.e(TAG, "Failed to enqueue JPEG image.");
        return false;
    }

    public static boolean convertYuvToJpegBytesIntoSurface(androidx.camera.core.ImageProxy imageProxy, int i17, int i18, android.view.Surface surface) {
        try {
            return writeJpegBytesToSurface(surface, androidx.camera.core.internal.utils.ImageUtil.yuvImageToJpegByteArray(imageProxy, null, i17, i18));
        } catch (androidx.camera.core.internal.utils.ImageUtil.CodecFailedException e17) {
            androidx.camera.core.Logger.e(TAG, "Failed to encode YUV to JPEG", e17);
            return false;
        }
    }
}
