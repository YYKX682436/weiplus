package vo4;

/* loaded from: classes10.dex */
public final class j extends vo4.b {

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.Bitmap f520181p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i17, int i18, int i19, com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.n0 material) {
        super(i17, i18, i19, material, false, 16, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(material, "material");
    }

    @Override // vo4.b
    public void a(boolean z17) {
    }

    @Override // vo4.b
    public void b(long j17, boolean z17) {
        android.graphics.Bitmap bitmap;
        if (!z17 || (bitmap = this.f520181p) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogImagePlayer", "VLogImagePlayer playing, uploadBitmapTexture, bitmap:" + bitmap + ", width:" + bitmap.getWidth() + ", height:" + bitmap.getHeight());
        rs0.g gVar = rs0.i.f480829a;
        android.opengl.GLES20.glBindTexture(3553, this.f520135a);
        android.opengl.GLUtils.texImage2D(3553, 0, bitmap, 0);
        android.opengl.GLES20.glBindTexture(3553, 0);
        bitmap.recycle();
        this.f520181p = null;
    }

    @Override // vo4.b
    public void c() {
        this.f520149o = true;
    }

    @Override // vo4.b
    public void d(long j17) {
        boolean z17;
        vo4.k kVar;
        long j18;
        android.graphics.Bitmap bitmap;
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9 c1098xe10e35e9;
        java.lang.Integer num;
        int i17;
        java.lang.Integer num2;
        if (this.f520148n) {
            return;
        }
        this.f520148n = true;
        vo4.k kVar2 = vo4.k.f520182a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p0 p0Var = this.f520138d;
        vo4.a a17 = kVar2.a(p0Var.f257243c);
        if (a17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogImagePlayer", "prepare get info from cache");
            this.f520140f = a17.f520128a;
            this.f520141g = a17.f520129b;
            this.f520146l = a17.f520130c;
            z17 = true;
        } else {
            z17 = false;
        }
        int i18 = this.f520137c;
        int i19 = this.f520136b;
        if (z17 && this.f520181p != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogImagePlayer", "prepare finish get from cache");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogImagePlayer", "prepare drawWidth:" + i19 + ", drawHeight:" + i18 + ", width:" + this.f520140f + ", height:" + this.f520141g);
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        java.lang.String str = p0Var.f257243c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(options);
        arrayList.add(str);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/vlog/player/VLogImagePlayer", "readyAt", "(J)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        yj0.a.e(obj, android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0), (android.graphics.BitmapFactory.Options) arrayList.get(1)), "com/tencent/mm/plugin/vlog/player/VLogImagePlayer", "readyAt", "(J)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        int i27 = options.outWidth;
        int i28 = options.outHeight;
        options.inSampleSize = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.f(i27, i28, i19, i18);
        options.inJustDecodeBounds = false;
        android.graphics.Bitmap d17 = com.p314xaae8f345.mm.p786x600aa8b.e.d(p0Var.f257243c, options);
        if (d17 == null || d17.isRecycled()) {
            kVar = kVar2;
            j18 = currentTimeMillis;
            bitmap = null;
        } else {
            if (d17.getWidth() % 2 == 1) {
                int width = d17.getWidth() + 1;
                int height = d17.getHeight();
                j18 = currentTimeMillis;
                android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(config);
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(java.lang.Integer.valueOf(height));
                arrayList2.add(java.lang.Integer.valueOf(width));
                java.lang.Object obj2 = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/player/VLogImagePlayer", "resizeBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                kVar = kVar2;
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList2.get(2));
                yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/vlog/player/VLogImagePlayer", "resizeBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(createBitmap);
                android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
                canvas.drawARGB(0, 0, 0, 0);
                canvas.drawBitmap(d17, 0.0f, 0.0f, (android.graphics.Paint) null);
                d17 = createBitmap;
            } else {
                kVar = kVar2;
                j18 = currentTimeMillis;
            }
            bitmap = d17;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap);
        this.f520140f = bitmap.getWidth();
        this.f520141g = bitmap.getHeight();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogImagePlayer", "prepare,oriWidth:" + i27 + "  oriHeight:" + i28 + " drawWidth:" + i19 + ", drawHeight:" + i18 + ", width:" + this.f520140f + ", height:" + this.f520141g);
        java.io.InputStream E = com.p314xaae8f345.mm.vfs.w6.E(p0Var.f257243c);
        if (E != null) {
            try {
                c1098xe10e35e9 = new p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9(E);
                num = null;
                vz5.b.a(E, null);
            } finally {
            }
        } else {
            num = null;
            c1098xe10e35e9 = null;
        }
        if (c1098xe10e35e9 != null) {
            i17 = 1;
            num2 = java.lang.Integer.valueOf(c1098xe10e35e9.m7343x245ab229(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3264x118c46b, 1));
        } else {
            i17 = 1;
            num2 = num;
        }
        if (num2 != null && num2.intValue() == 6) {
            this.f520146l = i17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogImagePlayer", "image rotate 90");
        } else if (num2 != null && num2.intValue() == 3) {
            this.f520146l = 2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogImagePlayer", "image rotate 180");
        } else if (num2 != null && num2.intValue() == 8) {
            this.f520146l = 3;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogImagePlayer", "image rotate 270");
        }
        this.f520181p = bitmap;
        vo4.k.b(kVar, p0Var.f257243c, this.f520140f, this.f520141g, this.f520146l, 0, 0, 0, 0, 240, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogImagePlayer", "[prepare] image play time = " + (java.lang.System.currentTimeMillis() - j18));
    }

    @Override // vo4.b
    public void e() {
        this.f520148n = false;
        android.graphics.Bitmap bitmap = this.f520181p;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f520181p = null;
        this.f520149o = false;
    }

    @Override // vo4.b
    public void f() {
        this.f520148n = false;
    }
}
