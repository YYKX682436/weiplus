package oj0;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final oj0.c f427259a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f427260b;

    /* renamed from: c, reason: collision with root package name */
    public static oj0.h f427261c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f427262d;

    static {
        oj0.c cVar = new oj0.c();
        f427259a = cVar;
        java.lang.String str = lp0.b.h() + "photoedit";
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hif);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        oj0.a aVar = new oj0.a(0, string, "");
        java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hi8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        oj0.a aVar2 = new oj0.a(1, string2, str + "/filter_source_0.png");
        java.lang.String string3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hi9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
        oj0.a aVar3 = new oj0.a(2, string3, str + "/filter_source_1.png");
        java.lang.String string4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hi_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
        oj0.a aVar4 = new oj0.a(3, string4, str + "/filter_source_2.png");
        java.lang.String string5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hia);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string5, "getString(...)");
        oj0.a aVar5 = new oj0.a(4, string5, str + "/filter_source_3.png");
        java.lang.String string6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hib);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string6, "getString(...)");
        oj0.a aVar6 = new oj0.a(5, string6, str + "/filter_source_4.png");
        java.lang.String string7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hic);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string7, "getString(...)");
        oj0.a aVar7 = new oj0.a(6, string7, str + "/filter_source_5.png");
        java.lang.String string8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hid);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string8, "getString(...)");
        oj0.a aVar8 = new oj0.a(7, string8, str + "/filter_source_6.png");
        java.lang.String string9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hie);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string9, "getString(...)");
        f427260b = kz5.c0.i(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, new oj0.a(8, string9, str + "/filter_source_7.png"));
        android.content.res.AssetManager assets = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(assets, "getAssets(...)");
        cVar.a(assets, "photofilters", str);
    }

    public final void a(android.content.res.AssetManager assets, java.lang.String assetsPath, java.lang.String localPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(assets, "assets");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(assetsPath, "assetsPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localPath, "localPath");
        try {
            java.lang.String[] list = assets.list(assetsPath);
            if (list == null) {
                return;
            }
            if (!(list.length == 0)) {
                com.p314xaae8f345.mm.vfs.w6.u(localPath);
                for (java.lang.String str : list) {
                    f427259a.a(assets, assetsPath + '/' + str, localPath + '/' + str);
                }
                return;
            }
            java.io.InputStream open = assets.open(assetsPath);
            try {
                java.io.OutputStream K = com.p314xaae8f345.mm.vfs.w6.K(localPath, false);
                try {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(open);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(K);
                    vz5.a.b(open, K, 0, 2, null);
                    vz5.b.a(K, null);
                    vz5.b.a(open, null);
                } finally {
                }
            } finally {
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BitmapFilter", e17, "copyAssets", new java.lang.Object[0]);
        }
    }

    public final android.graphics.Bitmap b(android.graphics.Bitmap preBitmap, int i17, int i18, int i19, float f17) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preBitmap, "preBitmap");
        if (!f427262d) {
            d(preBitmap);
        }
        if (f427261c == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BitmapFilter", "filter render is null");
            android.graphics.Bitmap.Config config = preBitmap.getConfig();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(config);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i19));
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.lang.Object obj2 = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/glrender/BitmapFilter", "filterBitmap", "(Landroid/graphics/Bitmap;IIIF)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj2, createBitmap, "com/tencent/mm/glrender/BitmapFilter", "filterBitmap", "(Landroid/graphics/Bitmap;IIIF)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
            return createBitmap;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Iterator it = f427260b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((oj0.a) obj).f427254a == i17) {
                break;
            }
        }
        oj0.a aVar = (oj0.a) obj;
        java.lang.String str = aVar != null ? aVar.f427256c : null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            if (i17 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BitmapFilter", "lut file not exist:" + str);
            }
            oj0.h hVar = f427261c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hVar);
            return c(hVar.a(), i18, i19, i17);
        }
        java.lang.Object obj3 = new java.lang.Object();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        oj0.h hVar2 = f427261c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hVar2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        hVar2.f427269a.mo50293x3498a0(new oj0.d(hVar2, new oj0.b(obj3, h0Var), str, f17));
        synchronized (obj3) {
            if (h0Var.f391656d == null) {
                obj3.wait();
            }
        }
        java.lang.Object obj4 = h0Var.f391656d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj4);
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj4;
        if (i18 == bitmap.getWidth() && i19 == bitmap.getHeight()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("filterBitmap cost ");
            sb6.append(java.lang.System.currentTimeMillis() - currentTimeMillis);
            sb6.append("ms, bitmap width:");
            oj0.h hVar3 = f427261c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hVar3);
            sb6.append(java.lang.Integer.valueOf(hVar3.a().getWidth()));
            sb6.append(", height:");
            oj0.h hVar4 = f427261c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hVar4);
            sb6.append(java.lang.Integer.valueOf(hVar4.a().getHeight()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BitmapFilter", sb6.toString());
            java.lang.Object obj5 = h0Var.f391656d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj5);
            return (android.graphics.Bitmap) obj5;
        }
        android.graphics.Bitmap c17 = f427259a.c(bitmap, i18, i19, 0);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("filterBitmap cost ");
        sb7.append(java.lang.System.currentTimeMillis() - currentTimeMillis);
        sb7.append("ms, bitmap width:");
        oj0.h hVar5 = f427261c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hVar5);
        sb7.append(java.lang.Integer.valueOf(hVar5.a().getWidth()));
        sb7.append(", height:");
        oj0.h hVar6 = f427261c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hVar6);
        sb7.append(java.lang.Integer.valueOf(hVar6.a().getHeight()));
        sb7.append(", targetWidth:");
        sb7.append(i18);
        sb7.append(", targetHeight:");
        sb7.append(i19);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BitmapFilter", sb7.toString());
        return c17;
    }

    public final android.graphics.Bitmap c(android.graphics.Bitmap bitmap, int i17, int i18, int i19) {
        android.graphics.Bitmap.Config config = bitmap.getConfig();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(config);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/glrender/BitmapFilter", "filterToTargetSizeByMatrix", "(Landroid/graphics/Bitmap;III)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/glrender/BitmapFilter", "filterToTargetSizeByMatrix", "(Landroid/graphics/Bitmap;III)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        android.graphics.ColorMatrix colorMatrix = new android.graphics.ColorMatrix();
        colorMatrix.set(i19 != 0 ? i19 != 1 ? i19 != 2 ? i19 != 3 ? i19 != 4 ? i19 != 5 ? new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f} : new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 100.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f} : new float[]{1.0f, 0.0f, 0.0f, 0.0f, 100.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f} : new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f} : new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f} : new float[]{2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f} : new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColorFilter(new android.graphics.ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, new android.graphics.Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new android.graphics.Rect(0, 0, i17, i18), paint);
        return createBitmap;
    }

    public final void d(android.graphics.Bitmap bitmap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        if (!f427262d) {
            oj0.h hVar = new oj0.h();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "getContext(...)");
            hVar.f427275g = bitmap;
            hVar.f427279k = bitmap.getWidth();
            hVar.f427280l = bitmap.getHeight();
            hVar.f427269a.mo50293x3498a0(new oj0.f(hVar));
            f427261c = hVar;
        }
        f427262d = true;
    }
}
