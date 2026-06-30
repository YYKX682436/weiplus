package com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7;

/* renamed from: com.tencent.thumbplayer.caputure.TPCaptureUtils */
/* loaded from: classes13.dex */
public class C26254xdcaf79a7 {

    /* renamed from: _hellAccFlag_ */
    private byte f51364x7f11beae;

    /* renamed from: byte2Bitmap */
    private static android.graphics.Bitmap m101542x6cb155f9(byte[] bArr, int i17, int i18, int i19) {
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.RGB_565;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/thumbplayer/caputure/TPCaptureUtils", "byte2Bitmap", "([BIII)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/thumbplayer/caputure/TPCaptureUtils", "byte2Bitmap", "([BIII)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        createBitmap.copyPixelsFromBuffer(wrap);
        if (i19 == 0) {
            return createBitmap;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postRotate(i19);
        int width = createBitmap.getWidth();
        int height = createBitmap.getHeight();
        zj0.a aVar = new zj0.a();
        aVar.c(java.lang.Boolean.TRUE);
        aVar.c(matrix);
        aVar.c(java.lang.Integer.valueOf(height));
        aVar.c(java.lang.Integer.valueOf(width));
        aVar.c(0);
        aVar.c(0);
        aVar.c(createBitmap);
        java.lang.Object obj2 = new java.lang.Object();
        yj0.a.d(obj2, aVar.b(), "com/tencent/thumbplayer/caputure/TPCaptureUtils", "byte2Bitmap", "([BIII)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
        yj0.a.e(obj2, createBitmap2, "com/tencent/thumbplayer/caputure/TPCaptureUtils", "byte2Bitmap", "([BIII)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        return createBitmap2;
    }

    /* renamed from: frame2Bitmap */
    public static android.graphics.Bitmap m101543xd702c1f4(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26334x22c4354e c26334x22c4354e) {
        int i17;
        int i18;
        byte[][] bArr = c26334x22c4354e.f52424x2eefaa;
        if (bArr.length <= 0 || (i17 = c26334x22c4354e.f52426xb7389127) == 0 || (i18 = c26334x22c4354e.f52432x6be2dc6) == 0) {
            return null;
        }
        return m101542x6cb155f9(bArr[0], i18, i17, c26334x22c4354e.f52429xfd990f7e);
    }

    /* renamed from: frame2Bitmaps */
    public static android.graphics.Bitmap[] m101544x9557cff(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26334x22c4354e c26334x22c4354e) {
        byte[][] bArr = c26334x22c4354e.f52424x2eefaa;
        if (bArr.length <= 0 || c26334x22c4354e.f52426xb7389127 == 0 || c26334x22c4354e.f52432x6be2dc6 == 0) {
            return null;
        }
        android.graphics.Bitmap[] bitmapArr = new android.graphics.Bitmap[bArr.length];
        int i17 = 0;
        while (true) {
            byte[][] bArr2 = c26334x22c4354e.f52424x2eefaa;
            if (i17 >= bArr2.length) {
                return bitmapArr;
            }
            bitmapArr[i17] = m101542x6cb155f9(bArr2[i17], c26334x22c4354e.f52432x6be2dc6, c26334x22c4354e.f52426xb7389127, c26334x22c4354e.f52429xfd990f7e);
            i17++;
        }
    }
}
