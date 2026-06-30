package nt3;

/* loaded from: classes10.dex */
public final class e0 {

    /* renamed from: e, reason: collision with root package name */
    public static final float[] f421300e = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: f, reason: collision with root package name */
    public static final float[] f421301f = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: g, reason: collision with root package name */
    public static final long f421302g = 1380 + (300 / 2);

    /* renamed from: h, reason: collision with root package name */
    public static final long f421303h = 1680;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f421304a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final nt3.b f421305b = new nt3.b();

    /* renamed from: c, reason: collision with root package name */
    public ib5.j f421306c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f421307d;

    public final nt3.c0 a(long j17) {
        float f17;
        long j18 = j17;
        nt3.c0 c0Var = new nt3.c0(this);
        java.util.ArrayList arrayList = this.f421304a;
        if (arrayList.size() == 0) {
            return null;
        }
        int size = arrayList.size();
        float[] fArr = f421301f;
        float[] fArr2 = f421300e;
        float[] fArr3 = c0Var.f421290e;
        float[] fArr4 = c0Var.f421289d;
        if (size == 1) {
            c0Var.f421286a = 0;
            c0Var.f421287b = 0.0f;
            c0Var.f421288c = 1.0f;
            float[] fArr5 = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
            float f18 = ((((float) j18) / ((float) 15000)) / 2) + 1.0f;
            fArr5[0] = f18;
            fArr5[5] = f18;
            android.opengl.Matrix.multiplyMM(c0Var.f421289d, 0, fArr2, 0, fArr, 0);
            android.opengl.Matrix.multiplyMM(c0Var.f421290e, 0, fArr5, 0, fArr, 0);
            if (this.f421307d) {
                android.opengl.Matrix.scaleM(fArr4, 0, 1.0f, -1.0f, 1.0f);
                android.opengl.Matrix.scaleM(fArr3, 0, 1.0f, -1.0f, 1.0f);
            }
            return c0Var;
        }
        android.opengl.Matrix.multiplyMM(c0Var.f421289d, 0, fArr2, 0, fArr, 0);
        android.opengl.Matrix.multiplyMM(c0Var.f421290e, 0, fArr2, 0, fArr, 0);
        long size2 = arrayList.size() - 1;
        long j19 = f421303h;
        long j27 = f421302g;
        boolean z17 = j18 < (size2 * j19) + j27;
        long size3 = j18 > j27 ? (((j18 - j27) / j19) + 1) % arrayList.size() : 0L;
        c0Var.f421286a = (int) size3;
        if (size3 == 0 && z17) {
            c0Var.f421287b = 0.0f;
            c0Var.f421288c = 1.0f;
            f17 = 1.0f;
        } else {
            if (j18 > j27) {
                j18 = (j18 - j27) % j19;
            }
            if (j18 < 300) {
                float f19 = ((float) j18) / ((float) 300);
                c0Var.f421288c = f19;
                f17 = 1.0f;
                c0Var.f421287b = 1.0f - f19;
            } else {
                f17 = 1.0f;
                c0Var.f421287b = 0.0f;
                c0Var.f421288c = 1.0f;
            }
        }
        if (this.f421307d) {
            android.opengl.Matrix.scaleM(fArr4, 0, f17, -1.0f, f17);
            android.opengl.Matrix.scaleM(fArr3, 0, f17, -1.0f, f17);
        }
        return c0Var;
    }

    public final void b(nt3.d0 d0Var) {
        int i17;
        if (d0Var.f421292a == null || d0Var.f421293b == null) {
            pm0.c cVar = new pm0.c("addImage");
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            java.lang.String str = d0Var.f421298g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(options);
            arrayList.add(str);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/background/image2video/StoryImagePlayer", "loadImage", "(Lcom/tencent/mm/plugin/recordvideo/background/image2video/StoryImagePlayer$PlayItem;)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            yj0.a.e(obj, android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0), (android.graphics.BitmapFactory.Options) arrayList.get(1)), "com/tencent/mm/plugin/recordvideo/background/image2video/StoryImagePlayer", "loadImage", "(Lcom/tencent/mm/plugin/recordvideo/background/image2video/StoryImagePlayer$PlayItem;)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            int i18 = options.outWidth;
            int i19 = options.outHeight;
            st3.o oVar = st3.o.f494090a;
            options.inSampleSize = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.f(i18, i19, oVar.a(), oVar.a());
            options.inJustDecodeBounds = false;
            android.graphics.Bitmap c17 = c(com.p314xaae8f345.mm.p786x600aa8b.e.d(d0Var.f421298g, options));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Story.StoryImagePlayer", "resizeBitmap first " + cVar);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            options.inSampleSize = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.f(i18, i19, oVar.a() / 2, oVar.a() / 2);
            android.graphics.Bitmap c18 = c(com.p314xaae8f345.mm.p786x600aa8b.e.d(d0Var.f421298g, options));
            try {
                if (this.f421306c == null) {
                    this.f421306c = new ib5.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                }
                ib5.j jVar = this.f421306c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jVar);
                jVar.b(c18, 4.0f);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Story.StoryImagePlayer", e17, "rsblur exception", new java.lang.Object[0]);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Story.StoryImagePlayer", "rsblur exception, path:%s", d0Var.f421298g);
                if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() >= 1) {
                    dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "RenderScript Exception", 0).show();
                }
                android.graphics.Point c19 = oVar.c();
                c18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.q(android.graphics.Color.parseColor("#ff000000"), c19.x, c19.y);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "createColorBitmap(...)");
            }
            android.graphics.Bitmap bitmap = c18;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Story.StoryImagePlayer", "fastblur cost:%s, sampleSize:%s, width:%s, height:%s resizeBitmap second " + cVar, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(options.inSampleSize), java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()));
            if (c17 != null) {
                java.lang.String path = d0Var.f421298g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
                try {
                    i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.l.a(path);
                } catch (java.io.IOException e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Story.StoryImagePlayer", e18, "readPictureDegree", new java.lang.Object[0]);
                    i17 = 0;
                }
                if (i17 == 0) {
                    d0Var.f421292a = c17;
                    d0Var.f421293b = bitmap;
                    d0Var.f421294c = c17.getWidth();
                    android.graphics.Bitmap bitmap2 = d0Var.f421292a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap2);
                    d0Var.f421295d = bitmap2.getHeight();
                    return;
                }
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                matrix.postRotate(i17);
                int width = c17.getWidth();
                int height = c17.getHeight();
                zj0.a aVar = new zj0.a();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                aVar.c(bool);
                aVar.c(matrix);
                aVar.c(java.lang.Integer.valueOf(height));
                aVar.c(java.lang.Integer.valueOf(width));
                aVar.c(0);
                aVar.c(0);
                aVar.c(c17);
                java.lang.Object obj2 = new java.lang.Object();
                yj0.a.d(obj2, aVar.b(), "com/tencent/mm/plugin/recordvideo/background/image2video/StoryImagePlayer", "loadImage", "(Lcom/tencent/mm/plugin/recordvideo/background/image2video/StoryImagePlayer$PlayItem;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
                yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/recordvideo/background/image2video/StoryImagePlayer", "loadImage", "(Lcom/tencent/mm/plugin/recordvideo/background/image2video/StoryImagePlayer$PlayItem;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
                int width2 = bitmap.getWidth();
                int height2 = bitmap.getHeight();
                zj0.a aVar2 = new zj0.a();
                aVar2.c(bool);
                aVar2.c(matrix);
                aVar2.c(java.lang.Integer.valueOf(height2));
                aVar2.c(java.lang.Integer.valueOf(width2));
                aVar2.c(0);
                aVar2.c(0);
                aVar2.c(bitmap);
                java.lang.Object obj3 = new java.lang.Object();
                yj0.a.d(obj3, aVar2.b(), "com/tencent/mm/plugin/recordvideo/background/image2video/StoryImagePlayer", "loadImage", "(Lcom/tencent/mm/plugin/recordvideo/background/image2video/StoryImagePlayer$PlayItem;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar2.a(0), ((java.lang.Integer) aVar2.a(1)).intValue(), ((java.lang.Integer) aVar2.a(2)).intValue(), ((java.lang.Integer) aVar2.a(3)).intValue(), ((java.lang.Integer) aVar2.a(4)).intValue(), (android.graphics.Matrix) aVar2.a(5), ((java.lang.Boolean) aVar2.a(6)).booleanValue());
                yj0.a.e(obj3, createBitmap2, "com/tencent/mm/plugin/recordvideo/background/image2video/StoryImagePlayer", "loadImage", "(Lcom/tencent/mm/plugin/recordvideo/background/image2video/StoryImagePlayer$PlayItem;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap2, "createBitmap(...)");
                d0Var.f421292a = createBitmap;
                d0Var.f421294c = createBitmap.getWidth();
                android.graphics.Bitmap bitmap3 = d0Var.f421292a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap3);
                d0Var.f421295d = bitmap3.getHeight();
                d0Var.f421293b = createBitmap2;
            }
        }
    }

    public final android.graphics.Bitmap c(android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        if (bitmap.getWidth() % 2 != 1) {
            return bitmap;
        }
        int width = bitmap.getWidth() + 1;
        int height = bitmap.getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/background/image2video/StoryImagePlayer", "resizeBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/recordvideo/background/image2video/StoryImagePlayer", "resizeBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(createBitmap);
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
        return createBitmap;
    }
}
