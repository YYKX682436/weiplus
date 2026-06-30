package com.p314xaae8f345.tav.p2959x5befac44;

/* renamed from: com.tencent.tav.decoder.ImageDecoder */
/* loaded from: classes16.dex */
public class C25771x8963c289 implements com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32 {

    /* renamed from: IMAGE_DECODE_SIZE */
    public static final com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 f48108x3bfe9eae = new com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85(720.0f, 1280.0f);
    private static final java.lang.String TAG = "ImageDecoder";

    /* renamed from: _hellAccFlag_ */
    private byte f48109x7f11beae;

    /* renamed from: bitmap */
    private android.graphics.Bitmap f48110xad38f12f;

    /* renamed from: displaySize */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 f48112x662e3be3;

    /* renamed from: sourceImagePath */
    private java.lang.String f48115xf43c0245;

    /* renamed from: textureInfo */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 f48116x602aa869;

    /* renamed from: timeRange */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 f48118x16fae70;

    /* renamed from: preferRotation */
    private int f48114xcc7d15ae = 0;

    /* renamed from: currentDecoderTime */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f48111x198ca5f8 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47861xbee5ffa0;

    /* renamed from: frameDuration */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f48113xef5b9e21 = new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(1, 30);

    /* renamed from: threadId */
    private long f48117x57d5bcc5 = -1;

    /* renamed from: checkThread */
    private void m97569x2edbf932() {
        long j17 = this.f48117x57d5bcc5;
        if (j17 == -1 || j17 == java.lang.Thread.currentThread().getId()) {
            return;
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "线程不对，注意EGL相关的泄露问题！threadId = " + this.f48117x57d5bcc5 + ", Thread.currentThread() name = " + java.lang.Thread.currentThread().getName(), new java.lang.RuntimeException());
    }

    /* renamed from: createTexture */
    private synchronized com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 m97570x3164f87f() {
        com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049 = this.f48116x602aa869;
        if (c25745xc3945049 != null && !c25745xc3945049.m97284xafdb8087()) {
            return this.f48116x602aa869;
        }
        if (this.f48110xad38f12f == null) {
            this.f48110xad38f12f = m97571x6b1ac4bd(this.f48115xf43c0245, this.f48112x662e3be3);
            this.f48114xcc7d15ae = m97574xc1afa73(this.f48115xf43c0245);
        }
        if (this.f48110xad38f12f == null) {
            return null;
        }
        this.f48117x57d5bcc5 = java.lang.Thread.currentThread().getId();
        com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc39450492 = new com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049(com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97623x3164f87f(3553), 3553, this.f48110xad38f12f.getWidth(), this.f48110xad38f12f.getHeight(), m97573xfd770d17(), this.f48114xcc7d15ae);
        this.f48116x602aa869 = c25745xc39450492;
        android.opengl.GLES20.glBindTexture(3553, c25745xc39450492.f47890xc35d0376);
        android.opengl.GLUtils.texImage2D(3553, 0, this.f48110xad38f12f, 0);
        android.opengl.GLES20.glBindTexture(3553, 0);
        return this.f48116x602aa869;
    }

    /* renamed from: decodeBitmap */
    private android.graphics.Bitmap m97571x6b1ac4bd(java.lang.String str, com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85) {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(options);
        arrayList.add(str);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/tav/decoder/ImageDecoder", "decodeBitmap", "(Ljava/lang/String;Lcom/tencent/tav/coremedia/CGSize;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        yj0.a.e(obj, android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0), (android.graphics.BitmapFactory.Options) arrayList.get(1)), "com/tencent/tav/decoder/ImageDecoder", "decodeBitmap", "(Ljava/lang/String;Lcom/tencent/tav/coremedia/CGSize;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        android.graphics.BitmapFactory.Options options2 = new android.graphics.BitmapFactory.Options();
        options2.inSampleSize = c25732x76648a85 != null ? (int) (options.outWidth / c25732x76648a85.f47833x6be2dc6) : 1;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(options2);
        arrayList2.add(str);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/tav/decoder/ImageDecoder", "decodeBitmap", "(Ljava/lang/String;Lcom/tencent/tav/coremedia/CGSize;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeFile = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList2.get(0), (android.graphics.BitmapFactory.Options) arrayList2.get(1));
        yj0.a.e(obj2, decodeFile, "com/tencent/tav/decoder/ImageDecoder", "decodeBitmap", "(Ljava/lang/String;Lcom/tencent/tav/coremedia/CGSize;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        return decodeFile;
    }

    /* renamed from: getDefaultOutputImageSize */
    public static com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 m97572xa1ee5e70(java.lang.String str) {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(options);
        arrayList.add(str);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/tav/decoder/ImageDecoder", "getDefaultOutputImageSize", "(Ljava/lang/String;)Lcom/tencent/tav/coremedia/CGSize;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        yj0.a.e(obj, android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0), (android.graphics.BitmapFactory.Options) arrayList.get(1)), "com/tencent/tav/decoder/ImageDecoder", "getDefaultOutputImageSize", "(Ljava/lang/String;)Lcom/tencent/tav/coremedia/CGSize;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        android.graphics.BitmapFactory.Options options2 = new android.graphics.BitmapFactory.Options();
        options2.inSampleSize = (int) (options.outWidth / f48108x3bfe9eae.f47833x6be2dc6);
        options2.inJustDecodeBounds = true;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(options2);
        arrayList2.add(str);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/tav/decoder/ImageDecoder", "getDefaultOutputImageSize", "(Ljava/lang/String;)Lcom/tencent/tav/coremedia/CGSize;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        yj0.a.e(obj2, android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList2.get(0), (android.graphics.BitmapFactory.Options) arrayList2.get(1)), "com/tencent/tav/decoder/ImageDecoder", "getDefaultOutputImageSize", "(Ljava/lang/String;)Lcom/tencent/tav/coremedia/CGSize;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        int i17 = options2.outWidth;
        int i18 = options2.outHeight;
        return m97574xc1afa73(str) % 2 == 1 ? new com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85(i18, i17) : new com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85(i17, i18);
    }

    /* renamed from: getImageTextureMatrix */
    private android.graphics.Matrix m97573xfd770d17() {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f});
        return matrix;
    }

    /* renamed from: readImagePreferRotation */
    private static int m97574xc1afa73(java.lang.String str) {
        try {
            int attributeInt = new android.media.ExifInterface(str).getAttributeInt(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3264x118c46b, 1);
            if (attributeInt == 3) {
                return 2;
            }
            if (attributeInt != 6) {
                return attributeInt != 8 ? 0 : 1;
            }
            return 3;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "readImagePreferRotation", e17);
            return 0;
        }
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb
    /* renamed from: getDecodePerformance */
    public com.p314xaae8f345.tav.p2968xc84c5534.C25854x244e356b mo97357xc291ccac() {
        return null;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32
    /* renamed from: getPreReadCost */
    public long mo97558x15b5cd10() {
        return 0L;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb
    /* renamed from: getSourcePath */
    public java.lang.String mo97358xabff72d6() {
        return this.f48115xf43c0245;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32
    /* renamed from: getTextureInfo */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 mo97559x3a00ef33() {
        return this.f48116x602aa869;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb
    /* renamed from: hasTrack */
    public boolean mo97359x7c8fed1() {
        return this.f48115xf43c0245 != null;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32
    /* renamed from: init */
    public void mo97560x316510(java.lang.String str, com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85, com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50.SurfaceCreator surfaceCreator) {
        this.f48115xf43c0245 = str;
        this.f48112x662e3be3 = c25732x76648a85;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32
    /* renamed from: isLastFrameValid */
    public boolean mo97561xa27b058f() {
        return true;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32
    /* renamed from: nextFrameTime */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo97562x99ce2827(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        return c25736x76b98a57.add(this.f48113xef5b9e21);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb
    /* renamed from: outputBuffer */
    public java.nio.ByteBuffer mo97362xdb4114a1() {
        return null;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32
    /* renamed from: outputSurface */
    public android.view.Surface mo97563x10d4786c() {
        return null;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb
    /* renamed from: readSample */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d mo97363xe121b2e0() {
        return mo97364xe121b2e0(this.f48111x198ca5f8.add(this.f48113xef5b9e21));
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32
    /* renamed from: readVideoSampleBuffer */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 mo97564xe7f79baf(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d mo97364xe121b2e0 = mo97364xe121b2e0(c25736x76b98a57);
        return (mo97364xe121b2e0.m97206x8311a768() <= -1 || !mo97561xa27b058f() || mo97364xe121b2e0.m97204xfab0f3b7() < 0) ? new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(mo97364xe121b2e0) : new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(mo97364xe121b2e0, mo97559x3a00ef33());
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb
    /* renamed from: release */
    public void mo97365x41012807() {
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb
    /* renamed from: seekTo */
    public void mo97367xc9fc1b13(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32, com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb
    /* renamed from: setLogger */
    public void mo97368x16e44c92(com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1 c25799x4a77fd1) {
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb
    /* renamed from: start */
    public void mo97369x68ac462(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        mo97370x68ac462(c25738xead39d26, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32
    /* renamed from: switchFrame */
    public void mo97567x7d8a6299() {
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb
    /* renamed from: readSample */
    public synchronized com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d mo97364xe121b2e0(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        if (c25736x76b98a57.m97222xf922bec1(this.f48118x16fae70.m97256x51e8b0a())) {
            return com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-1L);
        }
        m97570x3164f87f();
        return new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(c25736x76b98a57);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32
    /* renamed from: release */
    public synchronized void mo97565x41012807(boolean z17) {
        m97569x2edbf932();
        com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049 = this.f48116x602aa869;
        if (c25745xc3945049 != null) {
            c25745xc3945049.m97285x41012807();
            this.f48116x602aa869 = null;
        }
        android.graphics.Bitmap bitmap = this.f48110xad38f12f;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f48110xad38f12f.recycle();
            this.f48110xad38f12f = null;
        }
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25770x60526e32
    /* renamed from: seekTo */
    public void mo97566xc9fc1b13(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, boolean z17) {
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb
    /* renamed from: start */
    public void mo97370x68ac462(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        if (c25738xead39d26 == null) {
            this.f48118x16fae70 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f, this.f48113xef5b9e21);
        } else {
            this.f48118x16fae70 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(c25738xead39d26.m97260x75286aac(), c25738xead39d26.m97256x51e8b0a());
        }
    }
}
