package com.github.henryye.nativeiv;

/* loaded from: classes7.dex */
public class LegacyBitmap implements com.github.henryye.nativeiv.bitmap.IBitmap<android.graphics.Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    public android.graphics.Bitmap f44068a = null;

    /* renamed from: b, reason: collision with root package name */
    public long f44069b = -1;

    public android.graphics.Bitmap a(java.io.InputStream inputStream, com.github.henryye.nativeiv.ImageDecodeConfig imageDecodeConfig, f8.c cVar) {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inPreferredConfig = imageDecodeConfig.mConfig;
        options.inPremultiplied = imageDecodeConfig.mPremultiplyAlpha;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(options);
        arrayList.add(null);
        arrayList.add(inputStream);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/github/henryye/nativeiv/LegacyBitmap", "decodeInputStreamImp", "(Ljava/io/InputStream;Lcom/github/henryye/nativeiv/ImageDecodeConfig;Lcom/github/henryye/nativeiv/bitmap/PictureFormat;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeStream = android.graphics.BitmapFactory.decodeStream((java.io.InputStream) arrayList.get(0), (android.graphics.Rect) arrayList.get(1), (android.graphics.BitmapFactory.Options) arrayList.get(2));
        yj0.a.e(obj, decodeStream, "com/github/henryye/nativeiv/LegacyBitmap", "decodeInputStreamImp", "(Ljava/io/InputStream;Lcom/github/henryye/nativeiv/ImageDecodeConfig;Lcom/github/henryye/nativeiv/bitmap/PictureFormat;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        if (decodeStream == null || decodeStream.getConfig() == android.graphics.Bitmap.Config.ARGB_8888) {
            return decodeStream;
        }
        g8.g.f269409a.w("Ni.LegacyBitmap", "hy: config not argb-8888", new java.lang.Object[0]);
        int width = decodeStream.getWidth();
        int height = decodeStream.getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(height));
        arrayList2.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/github/henryye/nativeiv/LegacyBitmap", "decodeInputStreamImp", "(Ljava/io/InputStream;Lcom/github/henryye/nativeiv/ImageDecodeConfig;Lcom/github/henryye/nativeiv/bitmap/PictureFormat;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList2.get(2));
        yj0.a.e(obj2, createBitmap, "com/github/henryye/nativeiv/LegacyBitmap", "decodeInputStreamImp", "(Ljava/io/InputStream;Lcom/github/henryye/nativeiv/ImageDecodeConfig;Lcom/github/henryye/nativeiv/bitmap/PictureFormat;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        new android.graphics.Canvas(createBitmap).drawBitmap(decodeStream, 0.0f, 0.0f, (android.graphics.Paint) null);
        decodeStream.recycle();
        return createBitmap;
    }

    @Override // com.github.henryye.nativeiv.bitmap.IBitmap
    public void decodeInputStream(java.io.InputStream inputStream, com.github.henryye.nativeiv.ImageDecodeConfig imageDecodeConfig, f8.c cVar) {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        this.f44068a = a(inputStream, imageDecodeConfig, cVar);
        this.f44069b = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
    }

    @Override // com.github.henryye.nativeiv.bitmap.IBitmap
    public long getDecodeTime() {
        return this.f44069b;
    }

    @Override // com.github.henryye.nativeiv.bitmap.IBitmap
    public com.github.henryye.nativeiv.bitmap.BitmapType getType() {
        return com.github.henryye.nativeiv.bitmap.BitmapType.Legacy;
    }

    @Override // com.github.henryye.nativeiv.bitmap.IBitmap
    public void recycle() {
        android.graphics.Bitmap bitmap = this.f44068a;
        if (bitmap != null) {
            bitmap.recycle();
        }
    }

    @Override // com.github.henryye.nativeiv.bitmap.IBitmap
    public android.graphics.Bitmap provide() {
        return this.f44068a;
    }
}
