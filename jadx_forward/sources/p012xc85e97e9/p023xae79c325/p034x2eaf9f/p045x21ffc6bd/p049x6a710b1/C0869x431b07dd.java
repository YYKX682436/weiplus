package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1;

/* renamed from: androidx.camera.core.internal.utils.ImageUtil */
/* loaded from: classes14.dex */
public final class C0869x431b07dd {

    /* renamed from: DEFAULT_RGBA_PIXEL_STRIDE */
    public static final int f2117x1f20215f = 4;
    private static final java.lang.String TAG = "ImageUtil";

    /* renamed from: _hellAccFlag_ */
    private byte f2118x7f11beae;

    private C0869x431b07dd() {
    }

    /* renamed from: computeCropRectFromAspectRatio */
    public static android.graphics.Rect m6209x6601831e(android.util.Size size, android.util.Rational rational) {
        int i17;
        if (!m6219xd00abe73(rational)) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "Invalid view ratio.");
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

    /* renamed from: computeCropRectFromDispatchInfo */
    public static android.graphics.Rect m6210x29b1211d(android.graphics.Rect rect, int i17, android.util.Size size, int i18) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setRotate(i18 - i17);
        float[] m6228xb29d1bce = m6228xb29d1bce(size);
        matrix.mapPoints(m6228xb29d1bce);
        matrix.postTranslate(-min(m6228xb29d1bce[0], m6228xb29d1bce[2], m6228xb29d1bce[4], m6228xb29d1bce[6]), -min(m6228xb29d1bce[1], m6228xb29d1bce[3], m6228xb29d1bce[5], m6228xb29d1bce[7]));
        matrix.invert(matrix);
        android.graphics.RectF rectF = new android.graphics.RectF();
        matrix.mapRect(rectF, new android.graphics.RectF(rect));
        rectF.sort();
        android.graphics.Rect rect2 = new android.graphics.Rect();
        rectF.round(rect2);
        return rect2;
    }

    /* renamed from: createBitmapFromImageProxy */
    public static android.graphics.Bitmap m6211x2497b748(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3) {
        int mo4170x19771aed = interfaceC0536x1ffeadf3.mo4170x19771aed();
        if (mo4170x19771aed == 1) {
            return m6214x338b1072(interfaceC0536x1ffeadf3);
        }
        if (mo4170x19771aed == 35) {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0532xed4713d0.m4617x5070aad1(interfaceC0536x1ffeadf3);
        }
        if (mo4170x19771aed == 256 || mo4170x19771aed == 4101) {
            return m6212xe141f1be(interfaceC0536x1ffeadf3);
        }
        throw new java.lang.IllegalArgumentException("Incorrect image format of the input image proxy: " + interfaceC0536x1ffeadf3.mo4170x19771aed() + ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
    }

    /* renamed from: createBitmapFromJpegImage */
    private static android.graphics.Bitmap m6212xe141f1be(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3) {
        byte[] m6223x3d94199b = m6223x3d94199b(interfaceC0536x1ffeadf3);
        int length = m6223x3d94199b.length;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(null);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(length));
        arrayList.add(0);
        arrayList.add(m6223x3d94199b);
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

    /* renamed from: createBitmapFromPlane */
    public static android.graphics.Bitmap m6213x1efb9fc7(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3.PlaneProxy[] planeProxyArr, int i17, int i18) {
        m3.h.b(planeProxyArr.length == 1, "Expect a single plane");
        m3.h.b(planeProxyArr[0].mo4178x9149e7c9() == 4, "Expect pixelStride=4");
        m3.h.b(planeProxyArr[0].mo4179x3bc92a9d() == i17 * 4, "Expect rowStride=width*4");
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "androidx/camera/core/internal/utils/ImageUtil", "createBitmapFromPlane", "([Landroidx/camera/core/ImageProxy$PlaneProxy;II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "androidx/camera/core/internal/utils/ImageUtil", "createBitmapFromPlane", "([Landroidx/camera/core/ImageProxy$PlaneProxy;II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        planeProxyArr[0].mo4177x12f2b736().rewind();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0532xed4713d0.m4623x4adb367(createBitmap, planeProxyArr[0].mo4177x12f2b736(), planeProxyArr[0].mo4179x3bc92a9d());
        return createBitmap;
    }

    /* renamed from: createBitmapFromRgbaImage */
    private static android.graphics.Bitmap m6214x338b1072(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3) {
        int mo4175x755bd410 = interfaceC0536x1ffeadf3.mo4175x755bd410();
        int mo4171x1c4fb41d = interfaceC0536x1ffeadf3.mo4171x1c4fb41d();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(mo4171x1c4fb41d));
        arrayList.add(java.lang.Integer.valueOf(mo4175x755bd410));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "androidx/camera/core/internal/utils/ImageUtil", "createBitmapFromRgbaImage", "(Landroidx/camera/core/ImageProxy;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "androidx/camera/core/internal/utils/ImageUtil", "createBitmapFromRgbaImage", "(Landroidx/camera/core/ImageProxy;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        interfaceC0536x1ffeadf3.mo4174x2a55948d()[0].mo4177x12f2b736().rewind();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0532xed4713d0.m4623x4adb367(createBitmap, interfaceC0536x1ffeadf3.mo4174x2a55948d()[0].mo4177x12f2b736(), interfaceC0536x1ffeadf3.mo4174x2a55948d()[0].mo4179x3bc92a9d());
        return createBitmap;
    }

    /* renamed from: createDirectByteBuffer */
    public static java.nio.ByteBuffer m6215x3448d14d(android.graphics.Bitmap bitmap) {
        m3.h.b(bitmap.getConfig() == android.graphics.Bitmap.Config.ARGB_8888, "Only accept Bitmap with ARGB_8888 format for now.");
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(bitmap.getAllocationByteCount());
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0532xed4713d0.m4622xbf629767(bitmap, allocateDirect, bitmap.getRowBytes());
        allocateDirect.rewind();
        return allocateDirect;
    }

    /* renamed from: cropJpegByteArray */
    private static byte[] m6216xbeb8d9f9(byte[] bArr, android.graphics.Rect rect, int i17) {
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
                throw new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0869x431b07dd.CodecFailedException("Decode byte array failed.", p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0869x431b07dd.CodecFailedException.FailureType.DECODE_FAILED);
            }
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            if (!decodeRegion.compress(android.graphics.Bitmap.CompressFormat.JPEG, i17, byteArrayOutputStream)) {
                throw new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0869x431b07dd.CodecFailedException("Encode bitmap failed.", p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0869x431b07dd.CodecFailedException.FailureType.ENCODE_FAILED);
            }
            decodeRegion.recycle();
            return byteArrayOutputStream.toByteArray();
        } catch (java.io.IOException unused) {
            throw new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0869x431b07dd.CodecFailedException("Decode byte array failed.", p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0869x431b07dd.CodecFailedException.FailureType.DECODE_FAILED);
        } catch (java.lang.IllegalArgumentException e17) {
            throw new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0869x431b07dd.CodecFailedException("Decode byte array failed with illegal argument." + e17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0869x431b07dd.CodecFailedException.FailureType.DECODE_FAILED);
        }
    }

    /* renamed from: getRotatedAspectRatio */
    public static android.util.Rational m6217xf04e9260(int i17, android.util.Rational rational) {
        return (i17 == 90 || i17 == 270) ? m6218x88e6687e(rational) : new android.util.Rational(rational.getNumerator(), rational.getDenominator());
    }

    /* renamed from: inverseRational */
    private static android.util.Rational m6218x88e6687e(android.util.Rational rational) {
        return rational == null ? rational : new android.util.Rational(rational.getDenominator(), rational.getNumerator());
    }

    /* renamed from: isAspectRatioValid */
    public static boolean m6219xd00abe73(android.util.Rational rational) {
        return (rational == null || rational.floatValue() <= 0.0f || rational.isNaN()) ? false : true;
    }

    /* renamed from: isCropAspectRatioHasEffect */
    private static boolean m6221x73e74972(android.util.Size size, android.util.Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        float numerator = rational.getNumerator();
        float denominator = rational.getDenominator();
        return (height == java.lang.Math.round((((float) width) / numerator) * denominator) && width == java.lang.Math.round((((float) height) / denominator) * numerator)) ? false : true;
    }

    /* renamed from: isJpegFormats */
    public static boolean m6222xb838964a(int i17) {
        return i17 == 256 || i17 == 4101;
    }

    /* renamed from: jpegImageToJpegByteArray */
    public static byte[] m6223x3d94199b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3) {
        if (m6222xb838964a(interfaceC0536x1ffeadf3.mo4170x19771aed())) {
            java.nio.ByteBuffer mo4177x12f2b736 = interfaceC0536x1ffeadf3.mo4174x2a55948d()[0].mo4177x12f2b736();
            byte[] bArr = new byte[mo4177x12f2b736.capacity()];
            mo4177x12f2b736.rewind();
            mo4177x12f2b736.get(bArr);
            return bArr;
        }
        throw new java.lang.IllegalArgumentException("Incorrect image format of the input image proxy: " + interfaceC0536x1ffeadf3.mo4170x19771aed());
    }

    public static float min(float f17, float f18, float f19, float f27) {
        return java.lang.Math.min(java.lang.Math.min(f17, f18), java.lang.Math.min(f19, f27));
    }

    /* renamed from: rotateBitmap */
    public static android.graphics.Bitmap m6225x42f60a6a(android.graphics.Bitmap bitmap, int i17) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postRotate(i17);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        zj0.a aVar = new zj0.a();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
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

    /* renamed from: shouldCropImage */
    public static boolean m6226xf2fdc38(int i17, int i18, int i19, int i27) {
        return (i17 == i19 && i18 == i27) ? false : true;
    }

    /* renamed from: sizeToVertexes */
    public static float[] m6228xb29d1bce(android.util.Size size) {
        return new float[]{0.0f, 0.0f, size.getWidth(), 0.0f, size.getWidth(), size.getHeight(), 0.0f, size.getHeight()};
    }

    /* renamed from: yuvImageToJpegByteArray */
    public static byte[] m6229xa5ff610d(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3, android.graphics.Rect rect, int i17, int i18) {
        if (interfaceC0536x1ffeadf3.mo4170x19771aed() != 35) {
            throw new java.lang.IllegalArgumentException("Incorrect image format of the input image proxy: " + interfaceC0536x1ffeadf3.mo4170x19771aed());
        }
        android.graphics.YuvImage yuvImage = new android.graphics.YuvImage(m6230x80a1dd28(interfaceC0536x1ffeadf3), 17, interfaceC0536x1ffeadf3.mo4175x755bd410(), interfaceC0536x1ffeadf3.mo4171x1c4fb41d(), null);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0788x995d0931 c0788x995d0931 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0788x995d0931(byteArrayOutputStream, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa.m5886xaf65a0fc(interfaceC0536x1ffeadf3, i18));
        if (rect == null) {
            rect = new android.graphics.Rect(0, 0, interfaceC0536x1ffeadf3.mo4175x755bd410(), interfaceC0536x1ffeadf3.mo4171x1c4fb41d());
        }
        if (yuvImage.compressToJpeg(rect, i17, c0788x995d0931)) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0869x431b07dd.CodecFailedException("YuvImage failed to encode jpeg.", p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0869x431b07dd.CodecFailedException.FailureType.ENCODE_FAILED);
    }

    /* renamed from: yuv_420_888toNv21 */
    public static byte[] m6230x80a1dd28(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3.PlaneProxy planeProxy = interfaceC0536x1ffeadf3.mo4174x2a55948d()[0];
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3.PlaneProxy planeProxy2 = interfaceC0536x1ffeadf3.mo4174x2a55948d()[1];
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3.PlaneProxy planeProxy3 = interfaceC0536x1ffeadf3.mo4174x2a55948d()[2];
        java.nio.ByteBuffer mo4177x12f2b736 = planeProxy.mo4177x12f2b736();
        java.nio.ByteBuffer mo4177x12f2b7362 = planeProxy2.mo4177x12f2b736();
        java.nio.ByteBuffer mo4177x12f2b7363 = planeProxy3.mo4177x12f2b736();
        mo4177x12f2b736.rewind();
        mo4177x12f2b7362.rewind();
        mo4177x12f2b7363.rewind();
        int remaining = mo4177x12f2b736.remaining();
        byte[] bArr = new byte[((interfaceC0536x1ffeadf3.mo4175x755bd410() * interfaceC0536x1ffeadf3.mo4171x1c4fb41d()) / 2) + remaining];
        int i17 = 0;
        for (int i18 = 0; i18 < interfaceC0536x1ffeadf3.mo4171x1c4fb41d(); i18++) {
            mo4177x12f2b736.get(bArr, i17, interfaceC0536x1ffeadf3.mo4175x755bd410());
            i17 += interfaceC0536x1ffeadf3.mo4175x755bd410();
            mo4177x12f2b736.position(java.lang.Math.min(remaining, (mo4177x12f2b736.position() - interfaceC0536x1ffeadf3.mo4175x755bd410()) + planeProxy.mo4179x3bc92a9d()));
        }
        int mo4171x1c4fb41d = interfaceC0536x1ffeadf3.mo4171x1c4fb41d() / 2;
        int mo4175x755bd410 = interfaceC0536x1ffeadf3.mo4175x755bd410() / 2;
        int mo4179x3bc92a9d = planeProxy3.mo4179x3bc92a9d();
        int mo4179x3bc92a9d2 = planeProxy2.mo4179x3bc92a9d();
        int mo4178x9149e7c9 = planeProxy3.mo4178x9149e7c9();
        int mo4178x9149e7c92 = planeProxy2.mo4178x9149e7c9();
        byte[] bArr2 = new byte[mo4179x3bc92a9d];
        byte[] bArr3 = new byte[mo4179x3bc92a9d2];
        for (int i19 = 0; i19 < mo4171x1c4fb41d; i19++) {
            mo4177x12f2b7363.get(bArr2, 0, java.lang.Math.min(mo4179x3bc92a9d, mo4177x12f2b7363.remaining()));
            mo4177x12f2b7362.get(bArr3, 0, java.lang.Math.min(mo4179x3bc92a9d2, mo4177x12f2b7362.remaining()));
            int i27 = 0;
            int i28 = 0;
            for (int i29 = 0; i29 < mo4175x755bd410; i29++) {
                int i37 = i17 + 1;
                bArr[i17] = bArr2[i27];
                i17 = i37 + 1;
                bArr[i37] = bArr3[i28];
                i27 += mo4178x9149e7c9;
                i28 += mo4178x9149e7c92;
            }
        }
        return bArr;
    }

    /* renamed from: androidx.camera.core.internal.utils.ImageUtil$CodecFailedException */
    /* loaded from: classes14.dex */
    public static final class CodecFailedException extends java.lang.Exception {

        /* renamed from: mFailureType */
        private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0869x431b07dd.CodecFailedException.FailureType f2119x25897137;

        /* renamed from: androidx.camera.core.internal.utils.ImageUtil$CodecFailedException$FailureType */
        /* loaded from: classes6.dex */
        public enum FailureType {
            ENCODE_FAILED,
            DECODE_FAILED,
            UNKNOWN
        }

        public CodecFailedException(java.lang.String str) {
            super(str);
            this.f2119x25897137 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0869x431b07dd.CodecFailedException.FailureType.UNKNOWN;
        }

        /* renamed from: getFailureType */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0869x431b07dd.CodecFailedException.FailureType m6231x5552a6ae() {
            return this.f2119x25897137;
        }

        public CodecFailedException(java.lang.String str, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0869x431b07dd.CodecFailedException.FailureType failureType) {
            super(str);
            this.f2119x25897137 = failureType;
        }
    }

    /* renamed from: isAspectRatioValid */
    public static boolean m6220xd00abe73(android.util.Size size, android.util.Rational rational) {
        return rational != null && rational.floatValue() > 0.0f && m6221x73e74972(size, rational) && !rational.isNaN();
    }

    /* renamed from: shouldCropImage */
    public static boolean m6227xf2fdc38(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3) {
        return m6226xf2fdc38(interfaceC0536x1ffeadf3.mo4175x755bd410(), interfaceC0536x1ffeadf3.mo4171x1c4fb41d(), interfaceC0536x1ffeadf3.mo4169xfa2ffe0a().width(), interfaceC0536x1ffeadf3.mo4169xfa2ffe0a().height());
    }

    /* renamed from: jpegImageToJpegByteArray */
    public static byte[] m6224x3d94199b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3, android.graphics.Rect rect, int i17) {
        if (m6222xb838964a(interfaceC0536x1ffeadf3.mo4170x19771aed())) {
            return m6216xbeb8d9f9(m6223x3d94199b(interfaceC0536x1ffeadf3), rect, i17);
        }
        throw new java.lang.IllegalArgumentException("Incorrect image format of the input image proxy: " + interfaceC0536x1ffeadf3.mo4170x19771aed());
    }
}
