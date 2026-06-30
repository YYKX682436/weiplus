package androidx.camera.core.internal.utils;

/* loaded from: classes14.dex */
public final class ImageUtil {
    public static final int DEFAULT_RGBA_PIXEL_STRIDE = 4;
    private static final java.lang.String TAG = "ImageUtil";
    private byte _hellAccFlag_;

    private ImageUtil() {
    }

    public static android.graphics.Rect computeCropRectFromAspectRatio(android.util.Size size, android.util.Rational rational) {
        int i17;
        if (!isAspectRatioValid(rational)) {
            androidx.camera.core.Logger.w(TAG, "Invalid view ratio.");
            return null;
        }
        int width = size.getWidth();
        int height = size.getHeight();
        float f17 = width;
        float f18 = height;
        float f19 = f17 / f18;
        int numerator = rational.getNumerator();
        int denominator = rational.getDenominator();
        int i18 = 0;
        if (rational.floatValue() > f19) {
            int round = java.lang.Math.round((f17 / numerator) * denominator);
            i17 = (height - round) / 2;
            height = round;
        } else {
            int round2 = java.lang.Math.round((f18 / denominator) * numerator);
            int i19 = (width - round2) / 2;
            width = round2;
            i17 = 0;
            i18 = i19;
        }
        return new android.graphics.Rect(i18, i17, width + i18, height + i17);
    }

    public static android.graphics.Rect computeCropRectFromDispatchInfo(android.graphics.Rect rect, int i17, android.util.Size size, int i18) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setRotate(i18 - i17);
        float[] sizeToVertexes = sizeToVertexes(size);
        matrix.mapPoints(sizeToVertexes);
        matrix.postTranslate(-min(sizeToVertexes[0], sizeToVertexes[2], sizeToVertexes[4], sizeToVertexes[6]), -min(sizeToVertexes[1], sizeToVertexes[3], sizeToVertexes[5], sizeToVertexes[7]));
        matrix.invert(matrix);
        android.graphics.RectF rectF = new android.graphics.RectF();
        matrix.mapRect(rectF, new android.graphics.RectF(rect));
        rectF.sort();
        android.graphics.Rect rect2 = new android.graphics.Rect();
        rectF.round(rect2);
        return rect2;
    }

    public static android.graphics.Bitmap createBitmapFromImageProxy(androidx.camera.core.ImageProxy imageProxy) {
        int format = imageProxy.getFormat();
        if (format == 1) {
            return createBitmapFromRgbaImage(imageProxy);
        }
        if (format == 35) {
            return androidx.camera.core.ImageProcessingUtil.convertYUVToBitmap(imageProxy);
        }
        if (format == 256 || format == 4101) {
            return createBitmapFromJpegImage(imageProxy);
        }
        throw new java.lang.IllegalArgumentException("Incorrect image format of the input image proxy: " + imageProxy.getFormat() + ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
    }

    private static android.graphics.Bitmap createBitmapFromJpegImage(androidx.camera.core.ImageProxy imageProxy) {
        byte[] jpegImageToJpegByteArray = jpegImageToJpegByteArray(imageProxy);
        int length = jpegImageToJpegByteArray.length;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(null);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(length));
        arrayList.add(0);
        arrayList.add(jpegImageToJpegByteArray);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "androidx/camera/core/internal/utils/ImageUtil", "createBitmapFromJpegImage", "(Landroidx/camera/core/ImageProxy;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), (android.graphics.BitmapFactory.Options) arrayList.get(3));
        yj0.a.e(obj, decodeByteArray, "androidx/camera/core/internal/utils/ImageUtil", "createBitmapFromJpegImage", "(Landroidx/camera/core/ImageProxy;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        if (decodeByteArray != null) {
            return decodeByteArray;
        }
        throw new java.lang.UnsupportedOperationException("Decode jpeg byte array failed");
    }

    public static android.graphics.Bitmap createBitmapFromPlane(androidx.camera.core.ImageProxy.PlaneProxy[] planeProxyArr, int i17, int i18) {
        m3.h.b(planeProxyArr.length == 1, "Expect a single plane");
        m3.h.b(planeProxyArr[0].getPixelStride() == 4, "Expect pixelStride=4");
        m3.h.b(planeProxyArr[0].getRowStride() == i17 * 4, "Expect rowStride=width*4");
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "androidx/camera/core/internal/utils/ImageUtil", "createBitmapFromPlane", "([Landroidx/camera/core/ImageProxy$PlaneProxy;II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "androidx/camera/core/internal/utils/ImageUtil", "createBitmapFromPlane", "([Landroidx/camera/core/ImageProxy$PlaneProxy;II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        planeProxyArr[0].getBuffer().rewind();
        androidx.camera.core.ImageProcessingUtil.copyByteBufferToBitmap(createBitmap, planeProxyArr[0].getBuffer(), planeProxyArr[0].getRowStride());
        return createBitmap;
    }

    private static android.graphics.Bitmap createBitmapFromRgbaImage(androidx.camera.core.ImageProxy imageProxy) {
        int width = imageProxy.getWidth();
        int height = imageProxy.getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "androidx/camera/core/internal/utils/ImageUtil", "createBitmapFromRgbaImage", "(Landroidx/camera/core/ImageProxy;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "androidx/camera/core/internal/utils/ImageUtil", "createBitmapFromRgbaImage", "(Landroidx/camera/core/ImageProxy;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        imageProxy.getPlanes()[0].getBuffer().rewind();
        androidx.camera.core.ImageProcessingUtil.copyByteBufferToBitmap(createBitmap, imageProxy.getPlanes()[0].getBuffer(), imageProxy.getPlanes()[0].getRowStride());
        return createBitmap;
    }

    public static java.nio.ByteBuffer createDirectByteBuffer(android.graphics.Bitmap bitmap) {
        m3.h.b(bitmap.getConfig() == android.graphics.Bitmap.Config.ARGB_8888, "Only accept Bitmap with ARGB_8888 format for now.");
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(bitmap.getAllocationByteCount());
        androidx.camera.core.ImageProcessingUtil.copyBitmapToByteBuffer(bitmap, allocateDirect, bitmap.getRowBytes());
        allocateDirect.rewind();
        return allocateDirect;
    }

    private static byte[] cropJpegByteArray(byte[] bArr, android.graphics.Rect rect, int i17) {
        try {
            android.graphics.BitmapRegionDecoder newInstance = android.graphics.BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false);
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(options);
            arrayList.add(rect);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(newInstance, arrayList.toArray(), "androidx/camera/core/internal/utils/ImageUtil", "cropJpegByteArray", "([BLandroid/graphics/Rect;I)[B", "android/graphics/BitmapRegionDecoder_EXEC_", "decodeRegion", "(Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeRegion = newInstance.decodeRegion((android.graphics.Rect) arrayList.get(0), (android.graphics.BitmapFactory.Options) arrayList.get(1));
            yj0.a.e(newInstance, decodeRegion, "androidx/camera/core/internal/utils/ImageUtil", "cropJpegByteArray", "([BLandroid/graphics/Rect;I)[B", "android/graphics/BitmapRegionDecoder_EXEC_", "decodeRegion", "(Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            newInstance.recycle();
            if (decodeRegion == null) {
                throw new androidx.camera.core.internal.utils.ImageUtil.CodecFailedException("Decode byte array failed.", androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType.DECODE_FAILED);
            }
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            if (!decodeRegion.compress(android.graphics.Bitmap.CompressFormat.JPEG, i17, byteArrayOutputStream)) {
                throw new androidx.camera.core.internal.utils.ImageUtil.CodecFailedException("Encode bitmap failed.", androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType.ENCODE_FAILED);
            }
            decodeRegion.recycle();
            return byteArrayOutputStream.toByteArray();
        } catch (java.io.IOException unused) {
            throw new androidx.camera.core.internal.utils.ImageUtil.CodecFailedException("Decode byte array failed.", androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType.DECODE_FAILED);
        } catch (java.lang.IllegalArgumentException e17) {
            throw new androidx.camera.core.internal.utils.ImageUtil.CodecFailedException("Decode byte array failed with illegal argument." + e17, androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType.DECODE_FAILED);
        }
    }

    public static android.util.Rational getRotatedAspectRatio(int i17, android.util.Rational rational) {
        return (i17 == 90 || i17 == 270) ? inverseRational(rational) : new android.util.Rational(rational.getNumerator(), rational.getDenominator());
    }

    private static android.util.Rational inverseRational(android.util.Rational rational) {
        return rational == null ? rational : new android.util.Rational(rational.getDenominator(), rational.getNumerator());
    }

    public static boolean isAspectRatioValid(android.util.Rational rational) {
        return (rational == null || rational.floatValue() <= 0.0f || rational.isNaN()) ? false : true;
    }

    private static boolean isCropAspectRatioHasEffect(android.util.Size size, android.util.Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        float numerator = rational.getNumerator();
        float denominator = rational.getDenominator();
        return (height == java.lang.Math.round((((float) width) / numerator) * denominator) && width == java.lang.Math.round((((float) height) / denominator) * numerator)) ? false : true;
    }

    public static boolean isJpegFormats(int i17) {
        return i17 == 256 || i17 == 4101;
    }

    public static byte[] jpegImageToJpegByteArray(androidx.camera.core.ImageProxy imageProxy) {
        if (isJpegFormats(imageProxy.getFormat())) {
            java.nio.ByteBuffer buffer = imageProxy.getPlanes()[0].getBuffer();
            byte[] bArr = new byte[buffer.capacity()];
            buffer.rewind();
            buffer.get(bArr);
            return bArr;
        }
        throw new java.lang.IllegalArgumentException("Incorrect image format of the input image proxy: " + imageProxy.getFormat());
    }

    public static float min(float f17, float f18, float f19, float f27) {
        return java.lang.Math.min(java.lang.Math.min(f17, f18), java.lang.Math.min(f19, f27));
    }

    public static android.graphics.Bitmap rotateBitmap(android.graphics.Bitmap bitmap, int i17) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postRotate(i17);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        zj0.a aVar = new zj0.a();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        aVar.c(java.lang.Boolean.TRUE);
        aVar.c(matrix);
        aVar.c(java.lang.Integer.valueOf(height));
        aVar.c(java.lang.Integer.valueOf(width));
        aVar.c(0);
        aVar.c(0);
        aVar.c(bitmap);
        java.lang.Object obj = new java.lang.Object();
        yj0.a.d(obj, aVar.b(), "androidx/camera/core/internal/utils/ImageUtil", "rotateBitmap", "(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
        yj0.a.e(obj, createBitmap, "androidx/camera/core/internal/utils/ImageUtil", "rotateBitmap", "(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        return createBitmap;
    }

    public static boolean shouldCropImage(int i17, int i18, int i19, int i27) {
        return (i17 == i19 && i18 == i27) ? false : true;
    }

    public static float[] sizeToVertexes(android.util.Size size) {
        return new float[]{0.0f, 0.0f, size.getWidth(), 0.0f, size.getWidth(), size.getHeight(), 0.0f, size.getHeight()};
    }

    public static byte[] yuvImageToJpegByteArray(androidx.camera.core.ImageProxy imageProxy, android.graphics.Rect rect, int i17, int i18) {
        if (imageProxy.getFormat() != 35) {
            throw new java.lang.IllegalArgumentException("Incorrect image format of the input image proxy: " + imageProxy.getFormat());
        }
        android.graphics.YuvImage yuvImage = new android.graphics.YuvImage(yuv_420_888toNv21(imageProxy), 17, imageProxy.getWidth(), imageProxy.getHeight(), null);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        androidx.camera.core.impl.utils.ExifOutputStream exifOutputStream = new androidx.camera.core.impl.utils.ExifOutputStream(byteArrayOutputStream, androidx.camera.core.impl.utils.ExifData.create(imageProxy, i18));
        if (rect == null) {
            rect = new android.graphics.Rect(0, 0, imageProxy.getWidth(), imageProxy.getHeight());
        }
        if (yuvImage.compressToJpeg(rect, i17, exifOutputStream)) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new androidx.camera.core.internal.utils.ImageUtil.CodecFailedException("YuvImage failed to encode jpeg.", androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType.ENCODE_FAILED);
    }

    public static byte[] yuv_420_888toNv21(androidx.camera.core.ImageProxy imageProxy) {
        androidx.camera.core.ImageProxy.PlaneProxy planeProxy = imageProxy.getPlanes()[0];
        androidx.camera.core.ImageProxy.PlaneProxy planeProxy2 = imageProxy.getPlanes()[1];
        androidx.camera.core.ImageProxy.PlaneProxy planeProxy3 = imageProxy.getPlanes()[2];
        java.nio.ByteBuffer buffer = planeProxy.getBuffer();
        java.nio.ByteBuffer buffer2 = planeProxy2.getBuffer();
        java.nio.ByteBuffer buffer3 = planeProxy3.getBuffer();
        buffer.rewind();
        buffer2.rewind();
        buffer3.rewind();
        int remaining = buffer.remaining();
        byte[] bArr = new byte[((imageProxy.getWidth() * imageProxy.getHeight()) / 2) + remaining];
        int i17 = 0;
        for (int i18 = 0; i18 < imageProxy.getHeight(); i18++) {
            buffer.get(bArr, i17, imageProxy.getWidth());
            i17 += imageProxy.getWidth();
            buffer.position(java.lang.Math.min(remaining, (buffer.position() - imageProxy.getWidth()) + planeProxy.getRowStride()));
        }
        int height = imageProxy.getHeight() / 2;
        int width = imageProxy.getWidth() / 2;
        int rowStride = planeProxy3.getRowStride();
        int rowStride2 = planeProxy2.getRowStride();
        int pixelStride = planeProxy3.getPixelStride();
        int pixelStride2 = planeProxy2.getPixelStride();
        byte[] bArr2 = new byte[rowStride];
        byte[] bArr3 = new byte[rowStride2];
        for (int i19 = 0; i19 < height; i19++) {
            buffer3.get(bArr2, 0, java.lang.Math.min(rowStride, buffer3.remaining()));
            buffer2.get(bArr3, 0, java.lang.Math.min(rowStride2, buffer2.remaining()));
            int i27 = 0;
            int i28 = 0;
            for (int i29 = 0; i29 < width; i29++) {
                int i37 = i17 + 1;
                bArr[i17] = bArr2[i27];
                i17 = i37 + 1;
                bArr[i37] = bArr3[i28];
                i27 += pixelStride;
                i28 += pixelStride2;
            }
        }
        return bArr;
    }

    /* loaded from: classes14.dex */
    public static final class CodecFailedException extends java.lang.Exception {
        private final androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType mFailureType;

        /* loaded from: classes6.dex */
        public enum FailureType {
            ENCODE_FAILED,
            DECODE_FAILED,
            UNKNOWN
        }

        public CodecFailedException(java.lang.String str) {
            super(str);
            this.mFailureType = androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType.UNKNOWN;
        }

        public androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType getFailureType() {
            return this.mFailureType;
        }

        public CodecFailedException(java.lang.String str, androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType failureType) {
            super(str);
            this.mFailureType = failureType;
        }
    }

    public static boolean isAspectRatioValid(android.util.Size size, android.util.Rational rational) {
        return rational != null && rational.floatValue() > 0.0f && isCropAspectRatioHasEffect(size, rational) && !rational.isNaN();
    }

    public static boolean shouldCropImage(androidx.camera.core.ImageProxy imageProxy) {
        return shouldCropImage(imageProxy.getWidth(), imageProxy.getHeight(), imageProxy.getCropRect().width(), imageProxy.getCropRect().height());
    }

    public static byte[] jpegImageToJpegByteArray(androidx.camera.core.ImageProxy imageProxy, android.graphics.Rect rect, int i17) {
        if (isJpegFormats(imageProxy.getFormat())) {
            return cropJpegByteArray(jpegImageToJpegByteArray(imageProxy), rect, i17);
        }
        throw new java.lang.IllegalArgumentException("Incorrect image format of the input image proxy: " + imageProxy.getFormat());
    }
}
