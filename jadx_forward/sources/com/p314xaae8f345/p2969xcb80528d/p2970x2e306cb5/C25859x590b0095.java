package com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5;

/* renamed from: com.tencent.tavkit.ciimage.CIImage */
/* loaded from: classes14.dex */
public class C25859x590b0095 implements java.lang.Cloneable {

    /* renamed from: SUPPORT_CONFIGS */
    private static android.graphics.Bitmap.Config[] f48805xd9d704c1 = {android.graphics.Bitmap.Config.ALPHA_8, android.graphics.Bitmap.Config.RGB_565, android.graphics.Bitmap.Config.ARGB_4444, android.graphics.Bitmap.Config.ARGB_8888};
    private final java.lang.String TAG;

    /* renamed from: _hellAccFlag_ */
    private byte f48806x7f11beae;

    /* renamed from: alpha */
    private float f48807x589b15e;

    /* renamed from: bitmap */
    private android.graphics.Bitmap f48808xad38f12f;

    /* renamed from: frame */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 f48809x5d2a96d;

    /* renamed from: isHardMode */
    private boolean f48810xd79ca878;

    /* renamed from: overlayImages */
    private final java.util.List<com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095> f48811xea6336e8;

    /* renamed from: preferRotation */
    private int f48812xcc7d15ae;

    /* renamed from: rotation */
    private int f48813xfd990f7e;

    /* renamed from: size */
    private final com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 f48814x35e001;

    /* renamed from: textureCacheKey */
    private java.lang.String f48815x5c141db8;

    /* renamed from: textureInfo */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 f48816x602aa869;

    /* renamed from: transform */
    private android.graphics.Matrix f48817x3ebe6b6c;

    /* renamed from: com.tencent.tavkit.ciimage.CIImage$1, reason: invalid class name */
    /* loaded from: classes10.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$com$tencent$tavkit$composition$model$TAVVideoConfiguration$TAVVideoConfigurationContentMode */
        static final /* synthetic */ int[] f48818xaf57ace2;

        static {
            int[] iArr = new int[com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25902x4abb7fa4.TAVVideoConfigurationContentMode.m98714xcee59d22().length];
            f48818xaf57ace2 = iArr;
            try {
                iArr[com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25902x4abb7fa4.TAVVideoConfigurationContentMode.aspectFit.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f48818xaf57ace2[com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25902x4abb7fa4.TAVVideoConfigurationContentMode.aspectFill.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f48818xaf57ace2[com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25902x4abb7fa4.TAVVideoConfigurationContentMode.scaleToFit.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public C25859x590b0095(com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85) {
        java.lang.String str = "CIImage@" + java.lang.Integer.toHexString(hashCode());
        this.TAG = str;
        this.f48811xea6336e8 = new java.util.ArrayList();
        this.f48810xd79ca878 = false;
        this.f48807x589b15e = 1.0f;
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(str, "CIImage() called with: renderSize = [" + c25732x76648a85 + "]");
        this.f48814x35e001 = c25732x76648a85;
    }

    /* renamed from: addOverlayImage */
    private void m98346x8b918a2c(com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 c25859x590b0095) {
        synchronized (this) {
            this.f48811xea6336e8.add(c25859x590b0095);
        }
    }

    /* renamed from: checkBitmapConfig */
    private android.graphics.Bitmap m98347x2bc16e79(android.graphics.Bitmap bitmap) {
        return java.util.Arrays.binarySearch(f48805xd9d704c1, bitmap.getConfig()) < 0 ? m98350x88626624(bitmap) : bitmap;
    }

    /* renamed from: decodeBitmap */
    private android.graphics.Bitmap m98348x6b1ac4bd(java.lang.String str, com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85) {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(options);
        arrayList.add(str);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/tavkit/ciimage/CIImage", "decodeBitmap", "(Ljava/lang/String;Lcom/tencent/tav/coremedia/CGSize;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        yj0.a.e(obj, android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0), (android.graphics.BitmapFactory.Options) arrayList.get(1)), "com/tencent/tavkit/ciimage/CIImage", "decodeBitmap", "(Ljava/lang/String;Lcom/tencent/tav/coremedia/CGSize;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        android.graphics.BitmapFactory.Options options2 = new android.graphics.BitmapFactory.Options();
        options2.inSampleSize = c25732x76648a85 != null ? (int) (options.outWidth / c25732x76648a85.f47833x6be2dc6) : 1;
        options2.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(options2);
        arrayList2.add(str);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/tavkit/ciimage/CIImage", "decodeBitmap", "(Ljava/lang/String;Lcom/tencent/tav/coremedia/CGSize;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeFile = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList2.get(0), (android.graphics.BitmapFactory.Options) arrayList2.get(1));
        yj0.a.e(obj2, decodeFile, "com/tencent/tavkit/ciimage/CIImage", "decodeBitmap", "(Ljava/lang/String;Lcom/tencent/tav/coremedia/CGSize;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        return decodeFile;
    }

    /* renamed from: getImageTextureMatrix */
    private android.graphics.Matrix m98349xfd770d17() {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f});
        return matrix;
    }

    /* renamed from: transcodeBitmap */
    private android.graphics.Bitmap m98350x88626624(android.graphics.Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/tavkit/ciimage/CIImage", "transcodeBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/tavkit/ciimage/CIImage", "transcodeBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    /* renamed from: applyFillInFrame */
    public void m98351xf97b67f7(com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 c25731x76640468, com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25902x4abb7fa4.TAVVideoConfigurationContentMode tAVVideoConfigurationContentMode) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        int i17 = com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095.AnonymousClass1.f48818xaf57ace2[tAVVideoConfigurationContentMode.ordinal()];
        if (i17 == 1) {
            matrix.postConcat(com.p314xaae8f345.p2969xcb80528d.p2980x6a710b1.C25928xa3965e69.m98856x30f85acf(m98362x1841e220(), c25731x76640468));
            m98366xf201bf26(matrix);
            return;
        }
        if (i17 == 2) {
            matrix.postConcat(com.p314xaae8f345.p2969xcb80528d.p2980x6a710b1.C25928xa3965e69.m98855xee12fe85(m98362x1841e220(), c25731x76640468));
            m98366xf201bf26(matrix);
        } else {
            if (i17 != 3) {
                return;
            }
            android.graphics.Matrix matrix2 = new android.graphics.Matrix();
            matrix2.postScale(c25731x76640468.f47830x35e001.f47833x6be2dc6 / m98362x1841e220().f47830x35e001.f47833x6be2dc6, c25731x76640468.f47830x35e001.f47832xb7389127 / m98362x1841e220().f47830x35e001.f47832xb7389127);
            matrix.postConcat(matrix2);
            android.graphics.Matrix matrix3 = new android.graphics.Matrix();
            android.graphics.PointF pointF = c25731x76640468.f47829xc3e1af26;
            matrix3.postTranslate(pointF.x, pointF.y);
            matrix.postConcat(matrix3);
            m98366xf201bf26(matrix);
        }
    }

    /* renamed from: applyFixInSize */
    public void m98352x80b336d(com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85, com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25902x4abb7fa4.TAVVideoConfigurationContentMode tAVVideoConfigurationContentMode) {
        if (com.p314xaae8f345.p2969xcb80528d.p2980x6a710b1.C25931x4e42091.m98864x6351da71(c25732x76648a85)) {
            int i17 = com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095.AnonymousClass1.f48818xaf57ace2[tAVVideoConfigurationContentMode.ordinal()];
            com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 m98852x7d7fa850 = i17 != 1 ? i17 != 2 ? i17 != 3 ? com.p314xaae8f345.p2969xcb80528d.p2980x6a710b1.C25928xa3965e69.m98852x7d7fa850(this.f48814x35e001, c25732x76648a85) : com.p314xaae8f345.p2969xcb80528d.p2980x6a710b1.C25928xa3965e69.m98853x1ceb11c9(this.f48814x35e001, c25732x76648a85) : com.p314xaae8f345.p2969xcb80528d.p2980x6a710b1.C25928xa3965e69.m98851x32756124(this.f48814x35e001, c25732x76648a85) : com.p314xaae8f345.p2969xcb80528d.p2980x6a710b1.C25928xa3965e69.m98852x7d7fa850(this.f48814x35e001, c25732x76648a85);
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            float f17 = m98852x7d7fa850.f47833x6be2dc6;
            com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a852 = this.f48814x35e001;
            matrix.postScale(f17 / c25732x76648a852.f47833x6be2dc6, m98852x7d7fa850.f47832xb7389127 / c25732x76648a852.f47832xb7389127);
            m98366xf201bf26(matrix);
            com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a853 = this.f48814x35e001;
            c25732x76648a853.f47832xb7389127 = m98852x7d7fa850.f47832xb7389127;
            c25732x76648a853.f47833x6be2dc6 = m98852x7d7fa850.f47833x6be2dc6;
        }
    }

    /* renamed from: applyFlip */
    public void m98353x844190fb(boolean z17, boolean z18) {
        if (z17 || z18) {
            float f17 = z17 ? -1.0f : 1.0f;
            float f18 = z17 ? this.f48814x35e001.f47833x6be2dc6 : 0.0f;
            float f19 = z18 ? -1.0f : 1.0f;
            float f27 = z18 ? this.f48814x35e001.f47832xb7389127 : 0.0f;
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.postScale(f17, f19);
            matrix.postTranslate(f18, f27);
            m98366xf201bf26(matrix);
        }
    }

    /* renamed from: applyPreferRotation */
    public void m98354x6ab5ccbc() {
        m98355x6ab5ccbc(0);
    }

    @java.lang.Deprecated
    /* renamed from: convertToBitmap */
    public android.graphics.Bitmap m98358xe979025d() {
        return com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25862xe58d3f23.m98391x2229cd0c(this);
    }

    /* renamed from: draw */
    public void m98359x2f2d44(com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25863x2a5f3c53 c25863x2a5f3c53) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 m98361x49a8c24f = m98361x49a8c24f();
        if (m98361x49a8c24f != null) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "draw: with drawTexture = " + m98361x49a8c24f + ", filter = " + c25863x2a5f3c53);
            c25863x2a5f3c53.mo98380x79f87086(m98361x49a8c24f, this.f48817x3ebe6b6c, m98361x49a8c24f.m97280xc3a49506(), this.f48807x589b15e, this.f48809x5d2a96d);
        }
        if (this.f48811xea6336e8.isEmpty()) {
            return;
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "draw: with: draw overlayImages = " + this.f48811xea6336e8 + ", filter = " + c25863x2a5f3c53);
        java.util.Iterator<com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095> it = this.f48811xea6336e8.iterator();
        while (it.hasNext()) {
            it.next().m98359x2f2d44(c25863x2a5f3c53);
        }
    }

    /* renamed from: getAlpha */
    public float m98360x742757a8() {
        return this.f48807x589b15e;
    }

    /* renamed from: getDrawTextureInfo */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 m98361x49a8c24f() {
        com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049 = this.f48816x602aa869;
        if (c25745xc3945049 != null) {
            return c25745xc3945049;
        }
        android.opengl.EGLContext eglGetCurrentContext = android.opengl.EGL14.eglGetCurrentContext();
        if (this.f48815x5c141db8 == null) {
            this.f48815x5c141db8 = java.lang.String.valueOf(hashCode());
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 m98401x3a00ef33 = com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25864x178eed28.m98400x9cf0d20b().m98401x3a00ef33(this.f48815x5c141db8);
        if (eglGetCurrentContext != null && m98401x3a00ef33 != null && !m98401x3a00ef33.m97284xafdb8087()) {
            return m98401x3a00ef33;
        }
        if (this.f48808xad38f12f == null) {
            return null;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc39450492 = new com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049(com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97623x3164f87f(3553), 3553, this.f48808xad38f12f.getWidth(), this.f48808xad38f12f.getHeight(), m98349xfd770d17(), this.f48812xcc7d15ae);
        android.opengl.GLES20.glBindTexture(3553, c25745xc39450492.f47890xc35d0376);
        android.opengl.GLUtils.texImage2D(3553, 0, this.f48808xad38f12f, 0);
        android.opengl.GLES20.glBindTexture(3553, 0);
        com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25864x178eed28.m98400x9cf0d20b().m98402x12fd6dda(this.f48815x5c141db8, c25745xc39450492);
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "getDrawTextureInfo: bind bitmap texture, texture = " + c25745xc39450492 + ", eglContext = " + eglGetCurrentContext);
        if (this.f48810xd79ca878) {
            this.f48808xad38f12f.recycle();
            this.f48808xad38f12f = null;
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "getDrawTextureInfo: isHardMode, bitmap.recycle()");
        }
        return c25745xc39450492;
    }

    /* renamed from: getExtent */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 m98362x1841e220() {
        return new com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468(new android.graphics.PointF(0.0f, 0.0f), this.f48814x35e001);
    }

    /* renamed from: getSize */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 m98363xfb854877() {
        return this.f48814x35e001;
    }

    /* renamed from: getTransform */
    public android.graphics.Matrix m98364x3e2bdcb6() {
        return this.f48817x3ebe6b6c;
    }

    /* renamed from: imageApplyFillInFrame */
    public com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 m98365x692a3f72(com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 c25731x76640468, com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25902x4abb7fa4.TAVVideoConfigurationContentMode tAVVideoConfigurationContentMode) {
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25902x4abb7fa4.TAVVideoConfigurationContentMode tAVVideoConfigurationContentMode2 = com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25902x4abb7fa4.TAVVideoConfigurationContentMode.aspectFit;
        m98351xf97b67f7(c25731x76640468, tAVVideoConfigurationContentMode);
        return this;
    }

    /* renamed from: imageByApplyingTransform */
    public com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 m98366xf201bf26(android.graphics.Matrix matrix) {
        if (this.f48817x3ebe6b6c == null) {
            this.f48817x3ebe6b6c = new android.graphics.Matrix();
        }
        this.f48817x3ebe6b6c.postConcat(matrix);
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "imageByApplyingTransform() called with: in transform = [" + matrix + "], result transform = " + this.f48817x3ebe6b6c);
        return this;
    }

    /* renamed from: imageByCompositingOverImage */
    public com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 m98367xf0aa9f5(com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 c25859x590b0095) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "imageByCompositingOverImage() called with: destImage = [" + c25859x590b0095 + "]");
        c25859x590b0095.m98346x8b918a2c(this);
        return c25859x590b0095;
    }

    /* renamed from: imageByCroppingToRect */
    public com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 m98368x40e4c953(com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 c25731x76640468) {
        if (!com.p314xaae8f345.p2969xcb80528d.p2980x6a710b1.C25931x4e42091.m98863x8872166e(c25731x76640468)) {
            return this;
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "imageByCroppingToRect: frame = [" + c25731x76640468 + "]");
        com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85 = this.f48814x35e001;
        com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a852 = c25731x76640468.f47830x35e001;
        c25732x76648a85.f47833x6be2dc6 = c25732x76648a852.f47833x6be2dc6;
        c25732x76648a85.f47832xb7389127 = c25732x76648a852.f47832xb7389127;
        if (this.f48813xfd990f7e % 2 != 0) {
            android.graphics.PointF pointF = c25731x76640468.f47829xc3e1af26;
            this.f48809x5d2a96d = new com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468(pointF.y, pointF.x, c25732x76648a852.f47832xb7389127, c25732x76648a852.f47833x6be2dc6);
        } else {
            this.f48809x5d2a96d = c25731x76640468.m97172x5a5dd5d();
        }
        android.graphics.PointF pointF2 = c25731x76640468.f47829xc3e1af26;
        if (pointF2.x != 0.0f || pointF2.y != 0.0f) {
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.postTranslate(-pointF2.x, -pointF2.y);
            m98366xf201bf26(matrix);
        }
        return this;
    }

    /* renamed from: isCanvasImage */
    public boolean m98369x3b1d7759() {
        return this.f48808xad38f12f == null && this.f48816x602aa869 == null;
    }

    /* renamed from: release */
    public synchronized void m98370x41012807() {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(this.TAG, "release() start");
        android.graphics.Bitmap bitmap = this.f48808xad38f12f;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f48808xad38f12f.recycle();
            this.f48808xad38f12f = null;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 m98401x3a00ef33 = com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25864x178eed28.m98400x9cf0d20b().m98401x3a00ef33(this.f48815x5c141db8);
        if (m98401x3a00ef33 != null) {
            m98401x3a00ef33.m97285x41012807();
            com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25864x178eed28.m98400x9cf0d20b().m98404xc84af884(this.f48815x5c141db8);
        }
        for (com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 c25859x590b0095 : this.f48811xea6336e8) {
            if (c25859x590b0095 != null) {
                c25859x590b0095.m98370x41012807();
            }
        }
        this.f48811xea6336e8.clear();
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(this.TAG, "release() end");
    }

    /* renamed from: reset */
    public void m98371x6761d4f() {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "reset() called, before transform = " + this.f48817x3ebe6b6c);
        if (this.f48817x3ebe6b6c != null) {
            this.f48817x3ebe6b6c = null;
        }
    }

    /* renamed from: safeApplyTransform */
    public com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 m98372x3f52d48b(android.graphics.Matrix matrix) {
        if (matrix == null || matrix.isIdentity()) {
            return this;
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "safeApplyTransform: transform = [" + matrix + "]");
        float f17 = m98362x1841e220().f47829xc3e1af26.x + (m98362x1841e220().f47830x35e001.f47833x6be2dc6 / 2.0f);
        float f18 = m98362x1841e220().f47829xc3e1af26.y + (m98362x1841e220().f47830x35e001.f47832xb7389127 / 2.0f);
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        matrix2.postTranslate(-f17, -f18);
        matrix2.postConcat(matrix);
        android.graphics.Matrix matrix3 = new android.graphics.Matrix();
        matrix3.postTranslate(f17, f18);
        matrix2.postConcat(matrix3);
        return m98366xf201bf26(matrix2);
    }

    /* renamed from: setAlpha */
    public void m98373x52b5721c(float f17) {
        this.f48807x589b15e = f17;
    }

    /* renamed from: setHardMode */
    public void m98374x7d779fb0(boolean z17) {
        this.f48810xd79ca878 = z17;
    }

    /* renamed from: simpleClone */
    public com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 m98375xa9dffacb() {
        com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 c25859x590b0095 = new com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095(this.f48814x35e001.m97177x5a5dd5d());
        c25859x590b0095.f48816x602aa869 = this.f48816x602aa869;
        c25859x590b0095.f48812xcc7d15ae = this.f48812xcc7d15ae;
        c25859x590b0095.f48808xad38f12f = this.f48808xad38f12f;
        c25859x590b0095.f48807x589b15e = this.f48807x589b15e;
        return c25859x590b0095;
    }

    /* renamed from: toString */
    public java.lang.String m98376x9616526c() {
        return "CIImage{hash=" + java.lang.Integer.toHexString(hashCode()) + ", size=" + this.f48814x35e001 + ", textureInfo=" + this.f48816x602aa869 + ", bitmap=" + this.f48808xad38f12f + ", transform=" + this.f48817x3ebe6b6c + ", frame=" + this.f48809x5d2a96d + ", overlayImages=" + this.f48811xea6336e8 + '}';
    }

    /* renamed from: applyPreferRotation */
    public void m98355x6ab5ccbc(int i17) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 m98361x49a8c24f = m98361x49a8c24f();
        if (m98361x49a8c24f == null) {
            return;
        }
        int i18 = i17 + m98361x49a8c24f.f47886xcc7d15ae;
        this.f48813xfd990f7e = i18;
        if (i18 == 0) {
            return;
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "applyPreferRotation: textureInfo.preferRotation = " + this.f48813xfd990f7e);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        com.p314xaae8f345.tav.p2959x5befac44.C25762xc5b4d2ed.m97469xa52d49d5(matrix, this.f48813xfd990f7e, (float) m98361x49a8c24f.f47894x6be2dc6, (float) m98361x49a8c24f.f47883xb7389127);
        m98366xf201bf26(matrix);
        if (this.f48813xfd990f7e % 2 == 1) {
            com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85 = this.f48814x35e001;
            c25732x76648a85.f47833x6be2dc6 = m98361x49a8c24f.f47883xb7389127;
            c25732x76648a85.f47832xb7389127 = m98361x49a8c24f.f47894x6be2dc6;
        }
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 m98357x5a5dd5d() {
        com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 c25859x590b0095 = new com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095(this.f48814x35e001.m97177x5a5dd5d());
        c25859x590b0095.f48816x602aa869 = this.f48816x602aa869;
        c25859x590b0095.f48815x5c141db8 = this.f48815x5c141db8;
        c25859x590b0095.f48808xad38f12f = this.f48808xad38f12f;
        c25859x590b0095.f48812xcc7d15ae = this.f48812xcc7d15ae;
        c25859x590b0095.f48817x3ebe6b6c = new android.graphics.Matrix(this.f48817x3ebe6b6c);
        com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 c25731x76640468 = this.f48809x5d2a96d;
        c25859x590b0095.f48809x5d2a96d = c25731x76640468 != null ? new com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468(c25731x76640468.f47829xc3e1af26, c25731x76640468.f47830x35e001) : null;
        c25859x590b0095.f48811xea6336e8.clear();
        c25859x590b0095.f48811xea6336e8.addAll(this.f48811xea6336e8);
        c25859x590b0095.f48807x589b15e = this.f48807x589b15e;
        return c25859x590b0095;
    }

    public C25859x590b0095(com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049) {
        java.lang.String str = "CIImage@" + java.lang.Integer.toHexString(hashCode());
        this.TAG = str;
        this.f48811xea6336e8 = new java.util.ArrayList();
        this.f48810xd79ca878 = false;
        this.f48807x589b15e = 1.0f;
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(str, "CIImage() called with: textureInfo = [" + c25745xc3945049 + "]");
        this.f48816x602aa869 = c25745xc3945049;
        this.f48814x35e001 = new com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85((float) c25745xc3945049.f47894x6be2dc6, (float) c25745xc3945049.f47883xb7389127);
    }

    public C25859x590b0095(android.graphics.Bitmap bitmap) {
        java.lang.String str = "CIImage@" + java.lang.Integer.toHexString(hashCode());
        this.TAG = str;
        this.f48811xea6336e8 = new java.util.ArrayList();
        this.f48810xd79ca878 = false;
        this.f48807x589b15e = 1.0f;
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(str, "CIImage() called with: bitmap = [" + bitmap + "]");
        this.f48808xad38f12f = m98347x2bc16e79(bitmap);
        this.f48814x35e001 = new com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85((float) bitmap.getWidth(), (float) bitmap.getHeight());
    }

    public C25859x590b0095(java.lang.String str) {
        this(str, null);
    }

    public C25859x590b0095(java.lang.String str, com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85) {
        java.lang.String str2 = "CIImage@" + java.lang.Integer.toHexString(hashCode());
        this.TAG = str2;
        this.f48811xea6336e8 = new java.util.ArrayList();
        this.f48810xd79ca878 = false;
        this.f48807x589b15e = 1.0f;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f48812xcc7d15ae = com.p314xaae8f345.p2969xcb80528d.p2980x6a710b1.C25929xfef9979.m98857xc1afa73(str);
        android.graphics.Bitmap m98348x6b1ac4bd = m98348x6b1ac4bd(str, c25732x76648a85);
        this.f48808xad38f12f = m98348x6b1ac4bd;
        android.graphics.Bitmap m98347x2bc16e79 = m98347x2bc16e79(m98348x6b1ac4bd);
        this.f48808xad38f12f = m98347x2bc16e79;
        if (m98347x2bc16e79 != null) {
            com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a852 = new com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85(this.f48808xad38f12f.getWidth(), this.f48808xad38f12f.getHeight());
            this.f48814x35e001 = c25732x76648a852;
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(str2, "CIImage() called with: imagePath = [" + str + "], sampleSize = " + c25732x76648a85 + ", BitmapFactory.decodeFile cons ms = " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", outBitmapSize = " + c25732x76648a852);
            return;
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(str2, "CIImage: 图片解码失败！imagePath = " + str);
        this.f48814x35e001 = new com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85();
    }
}
