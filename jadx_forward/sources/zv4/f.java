package zv4;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final zv4.f f557993a = new zv4.f();

    public final int a(int i17) {
        switch (i17) {
            case 1:
                return 4001;
            case 2:
                return 4002;
            case 3:
                return com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2477xcdece81b.f7529x7d0fa359;
            case 4:
                return com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2477xcdece81b.f7532x3a129d88;
            case 5:
                return com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2477xcdece81b.f7528x16eb0541;
            case 6:
                return com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2477xcdece81b.f7530xe5db58ec;
            case 7:
                return com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2477xcdece81b.f7534x97f3504d;
            case 8:
                return com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2477xcdece81b.f7536x419518a9;
            case 9:
                return 4009;
            case 10:
                return 4010;
            case 11:
                return 4011;
            case 12:
                return 4012;
            case 13:
                return 4013;
            case 14:
                return 4015;
            case 15:
                return 4023;
            case 16:
                return 4020;
            case 17:
                return 4025;
            case 18:
                return 4026;
            case 19:
                return 4031;
            default:
                return 0;
        }
    }

    public final java.lang.String b(android.graphics.Bitmap bmp, int i17, boolean z17) {
        android.graphics.Bitmap bitmap;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bmp, "bmp");
        int width = bmp.getWidth();
        int height = bmp.getHeight();
        if (java.lang.Math.min(width, height) > i17) {
            int max = java.lang.Math.max(width / height, 1) * i17;
            bitmap = android.graphics.Bitmap.createScaledBitmap(bmp, max, (height * max) / width, false);
        } else {
            bitmap = bmp;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap);
        java.lang.String d17 = d(bitmap, false);
        if (z17) {
            bmp.recycle();
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bmp, bitmap)) {
            bitmap.recycle();
        }
        return d17;
    }

    public final java.lang.String c(java.lang.String fileName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        return gm0.j1.u().h() + "mediaOpt/imageQuery/crop/" + fileName;
    }

    public final java.lang.String d(android.graphics.Bitmap bmp, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bmp, "bmp");
        java.lang.String c17 = c(java.lang.System.currentTimeMillis() + '_' + bmp.getWidth() + '_' + bmp.getHeight() + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bmp, 75, android.graphics.Bitmap.CompressFormat.JPEG, c17, z17);
        return c17;
    }

    public final java.lang.String e(byte[] data, android.graphics.Point imgSize, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imgSize, "imgSize");
        int i17 = imgSize.x;
        int i18 = imgSize.y;
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/websearch/utils/FTSImageRecognizeUtils", "saveTmpRGBAImageData", "([BLandroid/graphics/Point;Z)Ljava/lang/String;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/websearch/utils/FTSImageRecognizeUtils", "saveTmpRGBAImageData", "([BLandroid/graphics/Point;Z)Ljava/lang/String;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
        createBitmap.copyPixelsFromBuffer(java.nio.ByteBuffer.wrap(data));
        return d(createBitmap, z17);
    }

    public final java.lang.String f(byte[] data, android.graphics.Point imgSize) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imgSize, "imgSize");
        java.lang.String c17 = c(java.lang.System.currentTimeMillis() + '_' + imgSize.x + '_' + imgSize.y + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG);
        byte[] bj6 = ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).bj(data, 4);
        if (bj6 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSImageRecognizeUtils", "saveTmpWXAMImageData nativeWxam2Pic failed");
            return null;
        }
        if (com.p314xaae8f345.mm.vfs.w6.S(c17, bj6, 0, bj6.length) >= 0) {
            return c17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSImageRecognizeUtils", "saveTmpWXAMImageData writeFile failed");
        return null;
    }

    public final java.lang.String g(byte[] data, android.graphics.Point imgSize, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imgSize, "imgSize");
        android.graphics.YuvImage yuvImage = new android.graphics.YuvImage(data, 17, imgSize.x, imgSize.y, null);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        yuvImage.compressToJpeg(new android.graphics.Rect(0, 0, imgSize.x, imgSize.y), 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(byteArray);
        android.graphics.Bitmap a17 = com.p314xaae8f345.mm.p786x600aa8b.e.a(byteArray, 0, byteArray.length);
        if (a17 != null) {
            return f557993a.d(a17, z17);
        }
        return null;
    }
}
