package com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::video")
/* renamed from: com.tencent.liteav.videobase.utils.BitmapUtils */
/* loaded from: classes10.dex */
public class C3819xce373ca2 {

    /* renamed from: _hellAccFlag_ */
    private byte f14971x7f11beae;

    /* renamed from: createBitmap */
    public static android.graphics.Bitmap m31134x3dedd14b(android.graphics.Bitmap bitmap, android.graphics.Matrix matrix, boolean z17) {
        if (bitmap == null) {
            return null;
        }
        bitmap.getConfig();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        if (!z17) {
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
            yj0.a.d(obj, aVar.b(), "com/tencent/liteav/videobase/utils/BitmapUtils", "createBitmap", "(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
            yj0.a.e(obj, createBitmap, "com/tencent/liteav/videobase/utils/BitmapUtils", "createBitmap", "(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
            return createBitmap;
        }
        int width2 = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        android.graphics.Bitmap.Config config2 = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config2);
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(height2));
        arrayList.add(java.lang.Integer.valueOf(width2));
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj2, arrayList.toArray(), "com/tencent/liteav/videobase/utils/BitmapUtils", "createBitmap", "(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj2, createBitmap2, "com/tencent/liteav/videobase/utils/BitmapUtils", "createBitmap", "(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        new android.graphics.Canvas(createBitmap2).drawBitmap(bitmap, matrix, paint);
        return createBitmap2;
    }

    /* renamed from: createBitmapFromBuffer */
    public static android.graphics.Bitmap m31135xa9157c35(java.nio.ByteBuffer byteBuffer, int i17, int i18) {
        try {
            byteBuffer.position(0);
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/liteav/videobase/utils/BitmapUtils", "createBitmapFromBuffer", "(Ljava/nio/ByteBuffer;II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/liteav/videobase/utils/BitmapUtils", "createBitmapFromBuffer", "(Ljava/nio/ByteBuffer;II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            createBitmap.copyPixelsFromBuffer(byteBuffer);
            return createBitmap;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("BitmapUtils", "build bitmap failed.", th6);
            return null;
        }
    }

    /* renamed from: createBitmapFromFile */
    public static android.graphics.Bitmap m31136x93d56b1(java.lang.String str, int i17, int i18) {
        boolean z17;
        int i19;
        try {
            switch (new android.media.ExifInterface(str).getAttributeInt(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3264x118c46b, 1)) {
                case 1:
                    z17 = false;
                    i19 = 0;
                    break;
                case 2:
                    z17 = true;
                    i19 = 0;
                    break;
                case 3:
                    z17 = false;
                    i19 = 180;
                    break;
                case 4:
                    z17 = true;
                    i19 = 180;
                    break;
                case 5:
                    z17 = true;
                    i19 = 270;
                    break;
                case 6:
                    z17 = false;
                    i19 = 90;
                    break;
                case 7:
                    z17 = true;
                    i19 = 90;
                    break;
                case 8:
                    z17 = false;
                    i19 = 270;
                    break;
                default:
                    z17 = false;
                    i19 = 0;
                    break;
            }
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            if (z17) {
                matrix.postScale(-1.0f, 1.0f);
            }
            if (i19 != 0) {
                matrix.postRotate(i19);
            }
            android.graphics.Bitmap m31137xd6e864d1 = m31137xd6e864d1(str, i17, i18, i19);
            int width = m31137xd6e864d1.getWidth();
            int height = m31137xd6e864d1.getHeight();
            zj0.a aVar = new zj0.a();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            aVar.c(java.lang.Boolean.TRUE);
            aVar.c(matrix);
            aVar.c(java.lang.Integer.valueOf(height));
            aVar.c(java.lang.Integer.valueOf(width));
            aVar.c(0);
            aVar.c(0);
            aVar.c(m31137xd6e864d1);
            java.lang.Object obj = new java.lang.Object();
            yj0.a.d(obj, aVar.b(), "com/tencent/liteav/videobase/utils/BitmapUtils", "createBitmapFromFile", "(Ljava/lang/String;II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
            yj0.a.e(obj, createBitmap, "com/tencent/liteav/videobase/utils/BitmapUtils", "createBitmapFromFile", "(Ljava/lang/String;II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
            return createBitmap;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("BitmapUtils", "build bitmap failed, path: ".concat(java.lang.String.valueOf(str)), th6);
            return null;
        }
    }

    /* renamed from: loadBitmapFile */
    private static android.graphics.Bitmap m31137xd6e864d1(java.lang.String str, int i17, int i18, int i19) {
        int i27;
        if (i17 <= 0 || i18 <= 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(str);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/liteav/videobase/utils/BitmapUtils", "loadBitmapFile", "(Ljava/lang/String;III)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeFile = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0));
            yj0.a.e(obj, decodeFile, "com/tencent/liteav/videobase/utils/BitmapUtils", "loadBitmapFile", "(Ljava/lang/String;III)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
            return decodeFile;
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(options);
        arrayList2.add(str);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/liteav/videobase/utils/BitmapUtils", "loadBitmapFile", "(Ljava/lang/String;III)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        yj0.a.e(obj2, android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList2.get(0), (android.graphics.BitmapFactory.Options) arrayList2.get(1)), "com/tencent/liteav/videobase/utils/BitmapUtils", "loadBitmapFile", "(Ljava/lang/String;III)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        boolean z17 = i19 == 90 || i19 == 270;
        int i28 = z17 ? options.outHeight : options.outWidth;
        int i29 = z17 ? options.outWidth : options.outHeight;
        if (i28 > i17 || i29 > i18) {
            i27 = i28 / ((i17 / 2) + 1);
            int i37 = i29 / ((i18 / 2) + 1);
            if (i37 <= i27) {
                i27 = i37;
            }
        } else {
            i27 = 1;
        }
        options.inSampleSize = i27;
        options.inJustDecodeBounds = false;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(options);
        arrayList3.add(str);
        java.lang.Object obj3 = new java.lang.Object();
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(obj3, arrayList3.toArray(), "com/tencent/liteav/videobase/utils/BitmapUtils", "loadBitmapFile", "(Ljava/lang/String;III)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeFile2 = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList3.get(0), (android.graphics.BitmapFactory.Options) arrayList3.get(1));
        yj0.a.e(obj3, decodeFile2, "com/tencent/liteav/videobase/utils/BitmapUtils", "loadBitmapFile", "(Ljava/lang/String;III)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        return decodeFile2;
    }

    /* renamed from: saveBitmapToFile */
    public static void m31138x8d3b82c3(android.graphics.Bitmap bitmap, java.lang.String str) {
        java.io.FileOutputStream fileOutputStream;
        java.io.File file = new java.io.File(str);
        if (file.exists()) {
            file.delete();
        }
        java.io.FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new java.io.FileOutputStream(file);
            } catch (java.lang.Exception e17) {
                e = e17;
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
        try {
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.e.a(fileOutputStream);
        } catch (java.lang.Exception e18) {
            e = e18;
            fileOutputStream2 = fileOutputStream;
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("BitmapUtils", "save jpg file failed.", e);
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.e.a(fileOutputStream2);
        } catch (java.lang.Throwable th7) {
            th = th7;
            fileOutputStream2 = fileOutputStream;
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.e.a(fileOutputStream2);
            throw th;
        }
    }
}
