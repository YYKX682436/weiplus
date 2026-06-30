package x45;

/* loaded from: classes10.dex */
public abstract class a {
    public static android.graphics.Bitmap a(android.content.Context context, android.graphics.Bitmap bitmap, byte[] bArr, int[] iArr, double d17) {
        int width = bitmap.getWidth();
        int d18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, 197.0f);
        if (d18 < width) {
            d18 = width;
        }
        int i17 = iArr[0];
        int i18 = (int) (i17 * d17);
        int i19 = i18 * 2;
        int i27 = d18 / (i17 + i19);
        if (i27 == 0) {
            i27 = 1;
        }
        int i28 = i18 * i27;
        int i29 = (i17 + i19) * i27;
        int i37 = (iArr[1] * i27) + (i27 * 2 * i18);
        int i38 = i29 < width ? width : i29;
        int i39 = i37 < width ? width : i37;
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i39));
        arrayList.add(java.lang.Integer.valueOf(i38));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/qrcode/encoder/QRCodeBitmapFactory", "createAvatarQRCodeBitmap", "(Landroid/content/Context;Landroid/graphics/Bitmap;[B[ID)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/qrcode/encoder/QRCodeBitmapFactory", "createAvatarQRCodeBitmap", "(Landroid/content/Context;Landroid/graphics/Bitmap;[B[ID)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        int[] iArr2 = new int[i38 * i39];
        int i47 = (i38 - width) / 2;
        int i48 = i47;
        for (int i49 = 0; i48 < i38 - i47 && i49 < width; i49++) {
            int i57 = i47;
            for (int i58 = 0; i57 < i39 - i47 && i58 < width; i58++) {
                iArr2[(i48 * i38) + i57] = bitmap.getPixel(i58, i49);
                i57++;
            }
            i48++;
        }
        for (int i59 = 0; i59 < iArr[1]; i59++) {
            int i66 = 0;
            while (true) {
                int i67 = iArr[0];
                if (i66 < i67) {
                    if (bArr[(i67 * i59) + i66] == 1) {
                        for (int i68 = 0; i68 < i27; i68++) {
                            for (int i69 = 0; i69 < i27; i69++) {
                                int i76 = (((i59 * i27) + i28 + i68) * i38) + (i66 * i27) + i28 + i69;
                                if (iArr2[i76] == 0) {
                                    iArr2[i76] = -16777216;
                                }
                            }
                        }
                    } else {
                        for (int i77 = 0; i77 < i27; i77++) {
                            for (int i78 = 0; i78 < i27; i78++) {
                                int i79 = (((i59 * i27) + i28 + i77) * i38) + (i66 * i27) + i28 + i78;
                                if (iArr2[i79] == 0) {
                                    iArr2[i79] = -1;
                                }
                            }
                        }
                    }
                    i66++;
                }
            }
        }
        createBitmap.setPixels(iArr2, 0, i38, 0, 0, i38, i39);
        return createBitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap b(android.content.Context r27, java.lang.String r28, int r29, int r30, double r31) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x45.a.b(android.content.Context, java.lang.String, int, int, double):android.graphics.Bitmap");
    }
}
