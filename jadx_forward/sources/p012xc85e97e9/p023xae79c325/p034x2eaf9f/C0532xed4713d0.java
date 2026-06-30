package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* renamed from: androidx.camera.core.ImageProcessingUtil */
/* loaded from: classes14.dex */
public final class C0532xed4713d0 {
    private static final java.lang.String TAG = "ImageProcessingUtil";

    /* renamed from: sImageCount */
    private static int f1111x2028147;

    /* renamed from: _hellAccFlag_ */
    private byte f1112x7f11beae;

    /* renamed from: androidx.camera.core.ImageProcessingUtil$Result */
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
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "androidx/camera/core/ImageProcessingUtil", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    private C0532xed4713d0() {
    }

    /* renamed from: applyPixelShiftForYUV */
    public static boolean m4614xe42d6b9b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3) {
        if (!m4625x17416b2d(interfaceC0536x1ffeadf3)) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Unsupported format for YUV to RGB");
            return false;
        }
        if (m4615x955e9c87(interfaceC0536x1ffeadf3) != p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0532xed4713d0.Result.ERROR_CONVERSION) {
            return true;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "One pixel shift for YUV failure");
        return false;
    }

    /* renamed from: applyPixelShiftInternal */
    private static p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0532xed4713d0.Result m4615x955e9c87(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3) {
        int mo4175x755bd410 = interfaceC0536x1ffeadf3.mo4175x755bd410();
        int mo4171x1c4fb41d = interfaceC0536x1ffeadf3.mo4171x1c4fb41d();
        int mo4179x3bc92a9d = interfaceC0536x1ffeadf3.mo4174x2a55948d()[0].mo4179x3bc92a9d();
        int mo4179x3bc92a9d2 = interfaceC0536x1ffeadf3.mo4174x2a55948d()[1].mo4179x3bc92a9d();
        int mo4179x3bc92a9d3 = interfaceC0536x1ffeadf3.mo4174x2a55948d()[2].mo4179x3bc92a9d();
        int mo4178x9149e7c9 = interfaceC0536x1ffeadf3.mo4174x2a55948d()[0].mo4178x9149e7c9();
        int mo4178x9149e7c92 = interfaceC0536x1ffeadf3.mo4174x2a55948d()[1].mo4178x9149e7c9();
        return m4632x5869329b(interfaceC0536x1ffeadf3.mo4174x2a55948d()[0].mo4177x12f2b736(), mo4179x3bc92a9d, interfaceC0536x1ffeadf3.mo4174x2a55948d()[1].mo4177x12f2b736(), mo4179x3bc92a9d2, interfaceC0536x1ffeadf3.mo4174x2a55948d()[2].mo4177x12f2b736(), mo4179x3bc92a9d3, mo4178x9149e7c9, mo4178x9149e7c92, mo4175x755bd410, mo4171x1c4fb41d, mo4178x9149e7c9, mo4178x9149e7c92, mo4178x9149e7c92) != 0 ? p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0532xed4713d0.Result.ERROR_CONVERSION : p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0532xed4713d0.Result.SUCCESS;
    }

    /* renamed from: convertJpegBytesToImage */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 m4616x58858d10(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30 interfaceC0719xa3f4ef30, byte[] bArr) {
        m3.h.a(interfaceC0719xa3f4ef30.mo4188x450a23fc() == 256);
        bArr.getClass();
        android.view.Surface mo4190xcf572877 = interfaceC0719xa3f4ef30.mo4190xcf572877();
        mo4190xcf572877.getClass();
        if (m4633x7ccf2902(bArr, mo4190xcf572877) != 0) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Failed to enqueue JPEG image.");
            return null;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 mo4183xaf314b5e = interfaceC0719xa3f4ef30.mo4183xaf314b5e();
        if (mo4183xaf314b5e == null) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Failed to get acquire JPEG image.");
        }
        return mo4183xaf314b5e;
    }

    /* renamed from: convertYUVToBitmap */
    public static android.graphics.Bitmap m4617x5070aad1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3) {
        if (interfaceC0536x1ffeadf3.mo4170x19771aed() != 35) {
            throw new java.lang.IllegalArgumentException("Input image format must be YUV_420_888");
        }
        int mo4175x755bd410 = interfaceC0536x1ffeadf3.mo4175x755bd410();
        int mo4171x1c4fb41d = interfaceC0536x1ffeadf3.mo4171x1c4fb41d();
        int mo4179x3bc92a9d = interfaceC0536x1ffeadf3.mo4174x2a55948d()[0].mo4179x3bc92a9d();
        int mo4179x3bc92a9d2 = interfaceC0536x1ffeadf3.mo4174x2a55948d()[1].mo4179x3bc92a9d();
        int mo4179x3bc92a9d3 = interfaceC0536x1ffeadf3.mo4174x2a55948d()[2].mo4179x3bc92a9d();
        int mo4178x9149e7c9 = interfaceC0536x1ffeadf3.mo4174x2a55948d()[0].mo4178x9149e7c9();
        int mo4178x9149e7c92 = interfaceC0536x1ffeadf3.mo4174x2a55948d()[1].mo4178x9149e7c9();
        int mo4175x755bd4102 = interfaceC0536x1ffeadf3.mo4175x755bd410();
        int mo4171x1c4fb41d2 = interfaceC0536x1ffeadf3.mo4171x1c4fb41d();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(mo4171x1c4fb41d2));
        arrayList.add(java.lang.Integer.valueOf(mo4175x755bd4102));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "androidx/camera/core/ImageProcessingUtil", "convertYUVToBitmap", "(Landroidx/camera/core/ImageProxy;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "androidx/camera/core/ImageProcessingUtil", "convertYUVToBitmap", "(Landroidx/camera/core/ImageProxy;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        if (m4629xa65bb809(interfaceC0536x1ffeadf3.mo4174x2a55948d()[0].mo4177x12f2b736(), mo4179x3bc92a9d, interfaceC0536x1ffeadf3.mo4174x2a55948d()[1].mo4177x12f2b736(), mo4179x3bc92a9d2, interfaceC0536x1ffeadf3.mo4174x2a55948d()[2].mo4177x12f2b736(), mo4179x3bc92a9d3, mo4178x9149e7c9, mo4178x9149e7c92, createBitmap, createBitmap.getRowBytes(), mo4175x755bd410, mo4171x1c4fb41d) == 0) {
            return createBitmap;
        }
        throw new java.lang.UnsupportedOperationException("YUV to RGB conversion failed");
    }

    /* renamed from: convertYUVToRGB */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 m4618xb2732e6b(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30 interfaceC0719xa3f4ef30, java.nio.ByteBuffer byteBuffer, int i17, boolean z17) {
        if (!m4625x17416b2d(interfaceC0536x1ffeadf3)) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Unsupported format for YUV to RGB");
            return null;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (!m4624x30452e85(i17)) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Unsupported rotation degrees for rotate RGB");
            return null;
        }
        if (m4619xf9d9be48(interfaceC0536x1ffeadf3, interfaceC0719xa3f4ef30.mo4190xcf572877(), byteBuffer, i17, z17) == p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0532xed4713d0.Result.ERROR_CONVERSION) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "YUV to RGB conversion failure");
            return null;
        }
        if (android.util.Log.isLoggable("MH", 3)) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, java.lang.String.format(java.util.Locale.US, "Image processing performance profiling, duration: [%d], image count: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(f1111x2028147)));
            f1111x2028147++;
        }
        final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 mo4183xaf314b5e = interfaceC0719xa3f4ef30.mo4183xaf314b5e();
        if (mo4183xaf314b5e == null) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "YUV to RGB acquireLatestImage failure");
            return null;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0565x1eeae063 c0565x1eeae063 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0565x1eeae063(mo4183xaf314b5e);
        c0565x1eeae063.m4405x5b6423b1(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0504x6bc05cd0.OnImageCloseListener() { // from class: androidx.camera.core.ImageProcessingUtil$$a
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0504x6bc05cd0.OnImageCloseListener
            /* renamed from: onImageClose */
            public final void mo4407x6f90449c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf32) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0532xed4713d0.m4626x769da09a(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3.this, interfaceC0536x1ffeadf3, interfaceC0536x1ffeadf32);
            }
        });
        return c0565x1eeae063;
    }

    /* renamed from: convertYUVToRGBInternal */
    private static p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0532xed4713d0.Result m4619xf9d9be48(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3, android.view.Surface surface, java.nio.ByteBuffer byteBuffer, int i17, boolean z17) {
        int mo4175x755bd410 = interfaceC0536x1ffeadf3.mo4175x755bd410();
        int mo4171x1c4fb41d = interfaceC0536x1ffeadf3.mo4171x1c4fb41d();
        int mo4179x3bc92a9d = interfaceC0536x1ffeadf3.mo4174x2a55948d()[0].mo4179x3bc92a9d();
        int mo4179x3bc92a9d2 = interfaceC0536x1ffeadf3.mo4174x2a55948d()[1].mo4179x3bc92a9d();
        int mo4179x3bc92a9d3 = interfaceC0536x1ffeadf3.mo4174x2a55948d()[2].mo4179x3bc92a9d();
        int mo4178x9149e7c9 = interfaceC0536x1ffeadf3.mo4174x2a55948d()[0].mo4178x9149e7c9();
        int mo4178x9149e7c92 = interfaceC0536x1ffeadf3.mo4174x2a55948d()[1].mo4178x9149e7c9();
        return m4628x4d27ce06(interfaceC0536x1ffeadf3.mo4174x2a55948d()[0].mo4177x12f2b736(), mo4179x3bc92a9d, interfaceC0536x1ffeadf3.mo4174x2a55948d()[1].mo4177x12f2b736(), mo4179x3bc92a9d2, interfaceC0536x1ffeadf3.mo4174x2a55948d()[2].mo4177x12f2b736(), mo4179x3bc92a9d3, mo4178x9149e7c9, mo4178x9149e7c92, surface, byteBuffer, mo4175x755bd410, mo4171x1c4fb41d, z17 ? mo4178x9149e7c9 : 0, z17 ? mo4178x9149e7c92 : 0, z17 ? mo4178x9149e7c92 : 0, i17) != 0 ? p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0532xed4713d0.Result.ERROR_CONVERSION : p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0532xed4713d0.Result.SUCCESS;
    }

    /* renamed from: convertYuvToJpegBytesIntoSurface */
    public static boolean m4620x71edc76c(android.media.Image image, int i17, int i18, android.view.Surface surface) {
        return m4621x71edc76c(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0451xf2492582(image), i17, i18, surface);
    }

    /* renamed from: copyBitmapToByteBuffer */
    public static void m4622xbf629767(android.graphics.Bitmap bitmap, java.nio.ByteBuffer byteBuffer, int i17) {
        m4630x94466f82(bitmap, byteBuffer, bitmap.getRowBytes(), i17, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    /* renamed from: copyByteBufferToBitmap */
    public static void m4623x4adb367(android.graphics.Bitmap bitmap, java.nio.ByteBuffer byteBuffer, int i17) {
        m4630x94466f82(bitmap, byteBuffer, i17, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    /* renamed from: isSupportedRotationDegrees */
    private static boolean m4624x30452e85(int i17) {
        return i17 == 0 || i17 == 90 || i17 == 180 || i17 == 270;
    }

    /* renamed from: isSupportedYUVFormat */
    private static boolean m4625x17416b2d(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3) {
        return interfaceC0536x1ffeadf3.mo4170x19771aed() == 35 && interfaceC0536x1ffeadf3.mo4174x2a55948d().length == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$convertYUVToRGB$0 */
    public static /* synthetic */ void m4626x769da09a(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf32, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf33) {
        if (interfaceC0536x1ffeadf3 == null || interfaceC0536x1ffeadf32 == null) {
            return;
        }
        interfaceC0536x1ffeadf32.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$rotateYUV$1 */
    public static /* synthetic */ void m4627xd047cef(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf32, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf33) {
        if (interfaceC0536x1ffeadf3 == null || interfaceC0536x1ffeadf32 == null) {
            return;
        }
        interfaceC0536x1ffeadf32.close();
    }

    /* renamed from: nativeConvertAndroid420ToABGR */
    private static native int m4628x4d27ce06(java.nio.ByteBuffer byteBuffer, int i17, java.nio.ByteBuffer byteBuffer2, int i18, java.nio.ByteBuffer byteBuffer3, int i19, int i27, int i28, android.view.Surface surface, java.nio.ByteBuffer byteBuffer4, int i29, int i37, int i38, int i39, int i47, int i48);

    /* renamed from: nativeConvertAndroid420ToBitmap */
    private static native int m4629xa65bb809(java.nio.ByteBuffer byteBuffer, int i17, java.nio.ByteBuffer byteBuffer2, int i18, java.nio.ByteBuffer byteBuffer3, int i19, int i27, int i28, android.graphics.Bitmap bitmap, int i29, int i37, int i38);

    /* renamed from: nativeCopyBetweenByteBufferAndBitmap */
    private static native int m4630x94466f82(android.graphics.Bitmap bitmap, java.nio.ByteBuffer byteBuffer, int i17, int i18, int i19, int i27, boolean z17);

    /* renamed from: nativeRotateYUV */
    private static native int m4631x9be9b328(java.nio.ByteBuffer byteBuffer, int i17, java.nio.ByteBuffer byteBuffer2, int i18, java.nio.ByteBuffer byteBuffer3, int i19, int i27, java.nio.ByteBuffer byteBuffer4, int i28, int i29, java.nio.ByteBuffer byteBuffer5, int i37, int i38, java.nio.ByteBuffer byteBuffer6, int i39, int i47, java.nio.ByteBuffer byteBuffer7, java.nio.ByteBuffer byteBuffer8, java.nio.ByteBuffer byteBuffer9, int i48, int i49, int i57);

    /* renamed from: nativeShiftPixel */
    private static native int m4632x5869329b(java.nio.ByteBuffer byteBuffer, int i17, java.nio.ByteBuffer byteBuffer2, int i18, java.nio.ByteBuffer byteBuffer3, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47);

    /* renamed from: nativeWriteJpegToSurface */
    private static native int m4633x7ccf2902(byte[] bArr, android.view.Surface surface);

    /* renamed from: rotateYUV */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 m4634xb586b97f(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30 interfaceC0719xa3f4ef30, android.media.ImageWriter imageWriter, java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2, java.nio.ByteBuffer byteBuffer3, int i17) {
        if (!m4625x17416b2d(interfaceC0536x1ffeadf3)) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Unsupported format for rotate YUV");
            return null;
        }
        if (!m4624x30452e85(i17)) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0532xed4713d0.Result result = p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0532xed4713d0.Result.ERROR_CONVERSION;
        if ((i17 > 0 ? m4635xf78af55c(interfaceC0536x1ffeadf3, imageWriter, byteBuffer, byteBuffer2, byteBuffer3, i17) : result) == result) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "rotate YUV failure");
            return null;
        }
        final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 mo4183xaf314b5e = interfaceC0719xa3f4ef30.mo4183xaf314b5e();
        if (mo4183xaf314b5e == null) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "YUV rotation acquireLatestImage failure");
            return null;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0565x1eeae063 c0565x1eeae063 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0565x1eeae063(mo4183xaf314b5e);
        c0565x1eeae063.m4405x5b6423b1(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0504x6bc05cd0.OnImageCloseListener() { // from class: androidx.camera.core.ImageProcessingUtil$$b
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0504x6bc05cd0.OnImageCloseListener
            /* renamed from: onImageClose */
            public final void mo4407x6f90449c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf32) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0532xed4713d0.m4627xd047cef(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3.this, interfaceC0536x1ffeadf3, interfaceC0536x1ffeadf32);
            }
        });
        return c0565x1eeae063;
    }

    /* renamed from: rotateYUVInternal */
    private static p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0532xed4713d0.Result m4635xf78af55c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3, android.media.ImageWriter imageWriter, java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2, java.nio.ByteBuffer byteBuffer3, int i17) {
        int mo4175x755bd410 = interfaceC0536x1ffeadf3.mo4175x755bd410();
        int mo4171x1c4fb41d = interfaceC0536x1ffeadf3.mo4171x1c4fb41d();
        int mo4179x3bc92a9d = interfaceC0536x1ffeadf3.mo4174x2a55948d()[0].mo4179x3bc92a9d();
        int mo4179x3bc92a9d2 = interfaceC0536x1ffeadf3.mo4174x2a55948d()[1].mo4179x3bc92a9d();
        int mo4179x3bc92a9d3 = interfaceC0536x1ffeadf3.mo4174x2a55948d()[2].mo4179x3bc92a9d();
        int mo4178x9149e7c9 = interfaceC0536x1ffeadf3.mo4174x2a55948d()[1].mo4178x9149e7c9();
        android.media.Image m6152x897a8501 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.C0843x60f66eb0.m6152x897a8501(imageWriter);
        if (m6152x897a8501 != null && m4631x9be9b328(interfaceC0536x1ffeadf3.mo4174x2a55948d()[0].mo4177x12f2b736(), mo4179x3bc92a9d, interfaceC0536x1ffeadf3.mo4174x2a55948d()[1].mo4177x12f2b736(), mo4179x3bc92a9d2, interfaceC0536x1ffeadf3.mo4174x2a55948d()[2].mo4177x12f2b736(), mo4179x3bc92a9d3, mo4178x9149e7c9, m6152x897a8501.getPlanes()[0].getBuffer(), m6152x897a8501.getPlanes()[0].getRowStride(), m6152x897a8501.getPlanes()[0].getPixelStride(), m6152x897a8501.getPlanes()[1].getBuffer(), m6152x897a8501.getPlanes()[1].getRowStride(), m6152x897a8501.getPlanes()[1].getPixelStride(), m6152x897a8501.getPlanes()[2].getBuffer(), m6152x897a8501.getPlanes()[2].getRowStride(), m6152x897a8501.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, mo4175x755bd410, mo4171x1c4fb41d, i17) == 0) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.C0843x60f66eb0.m6155x89343a2(imageWriter, m6152x897a8501);
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0532xed4713d0.Result.SUCCESS;
        }
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0532xed4713d0.Result.ERROR_CONVERSION;
    }

    /* renamed from: writeJpegBytesToSurface */
    public static boolean m4636x7fe33e4e(android.view.Surface surface, byte[] bArr) {
        bArr.getClass();
        surface.getClass();
        if (m4633x7ccf2902(bArr, surface) == 0) {
            return true;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Failed to enqueue JPEG image.");
        return false;
    }

    /* renamed from: convertYuvToJpegBytesIntoSurface */
    public static boolean m4621x71edc76c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3, int i17, int i18, android.view.Surface surface) {
        try {
            return m4636x7fe33e4e(surface, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0869x431b07dd.m6229xa5ff610d(interfaceC0536x1ffeadf3, null, i17, i18));
        } catch (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0869x431b07dd.CodecFailedException e17) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Failed to encode YUV to JPEG", e17);
            return false;
        }
    }
}
