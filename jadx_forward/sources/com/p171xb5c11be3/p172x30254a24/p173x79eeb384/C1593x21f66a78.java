package com.p171xb5c11be3.p172x30254a24.p173x79eeb384;

/* renamed from: com.github.henryye.nativeiv.LegacyBitmap */
/* loaded from: classes7.dex */
public class C1593x21f66a78 implements com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.InterfaceC1596x8c44c2d8<android.graphics.Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    public android.graphics.Bitmap f125601a = null;

    /* renamed from: b, reason: collision with root package name */
    public long f125602b = -1;

    public android.graphics.Bitmap a(java.io.InputStream inputStream, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab c1592x888963ab, f8.c cVar) {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inPreferredConfig = c1592x888963ab.f5274xfeabaa0f;
        options.inPremultiplied = c1592x888963ab.f5278xefd30a64;
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
        g8.g.f350942a.w("Ni.LegacyBitmap", "hy: config not argb-8888", new java.lang.Object[0]);
        int width = decodeStream.getWidth();
        int height = decodeStream.getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
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

    @Override // com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.InterfaceC1596x8c44c2d8
    /* renamed from: decodeInputStream */
    public void mo17129xb55d491c(java.io.InputStream inputStream, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab c1592x888963ab, f8.c cVar) {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        this.f125601a = a(inputStream, c1592x888963ab, cVar);
        this.f125602b = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
    }

    @Override // com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.InterfaceC1596x8c44c2d8
    /* renamed from: getDecodeTime */
    public long mo17130xa63469d1() {
        return this.f125602b;
    }

    @Override // com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.InterfaceC1596x8c44c2d8
    /* renamed from: getType */
    public com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.EnumC1595xee8a129 mo17131xfb85f7b0() {
        return com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.EnumC1595xee8a129.Legacy;
    }

    @Override // com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.InterfaceC1596x8c44c2d8
    /* renamed from: recycle */
    public void mo17133x408b7293() {
        android.graphics.Bitmap bitmap = this.f125601a;
        if (bitmap != null) {
            bitmap.recycle();
        }
    }

    @Override // com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.InterfaceC1596x8c44c2d8
    /* renamed from: provide */
    public android.graphics.Bitmap mo17132xed95cea1() {
        return this.f125601a;
    }
}
