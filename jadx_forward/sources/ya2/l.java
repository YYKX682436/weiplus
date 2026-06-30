package ya2;

/* loaded from: classes10.dex */
public final class l implements zy2.v8 {

    /* renamed from: a, reason: collision with root package name */
    public static final ya2.l f542035a = new ya2.l();

    /* renamed from: b, reason: collision with root package name */
    public static final android.util.LruCache f542036b = new android.util.LruCache(2);

    public mn2.h3 e(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90 mediaType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaType, "mediaType");
        return new mn2.q3(str, mediaType);
    }

    public void f(java.lang.String str, android.widget.ImageView imageView, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "imageView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLoaderApi", "#loadChattingFeedCoverImage url=" + str);
        if (str == null || str.length() == 0) {
            return;
        }
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        yo0.f fVar = new yo0.f();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.c4 INSTANCE = com.p314xaae8f345.mm.sdk.p2603x2137b148.c4.f274029b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(INSTANCE, "INSTANCE");
        fVar.f545621l = INSTANCE;
        fVar.f545611b = true;
        fVar.f545610a = true;
        if (i17 <= 0 || i18 <= 0) {
            fVar.f545617h = com.p314xaae8f345.mm.R.C30859x5a72f63.f77627xb498cd1c;
        } else {
            android.util.LruCache lruCache = f542036b;
            android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) lruCache.get(new jz5.l(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)));
            if (drawable != null) {
                fVar.f545618i = drawable;
            } else {
                int dimensionPixelSize = imageView.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561187bs);
                int color = imageView.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77768x20e836);
                int color2 = imageView.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77627xb498cd1c);
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.f274597a;
                android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(config);
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i18));
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/sdk/platformtools/BitmapUtil", "createIconBitmapWithBg", "(IIIIIII)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                yj0.a.e(obj, createBitmap, "com/tencent/mm/sdk/platformtools/BitmapUtil", "createIconBitmapWithBg", "(IIIIIII)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
                android.graphics.drawable.Drawable drawable2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f80862x137353c3, null);
                int i19 = (i17 - dimensionPixelSize) / 2;
                int i27 = (i18 - dimensionPixelSize) / 2;
                drawable2.setBounds(i19, i27, i19 + dimensionPixelSize, dimensionPixelSize + i27);
                drawable2.draw(canvas);
                canvas.drawColor(color, android.graphics.PorterDuff.Mode.SRC_IN);
                canvas.drawColor(color2, android.graphics.PorterDuff.Mode.DST_OVER);
                android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable((android.content.res.Resources) null, createBitmap);
                lruCache.put(new jz5.l(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), bitmapDrawable);
                fVar.f545618i = bitmapDrawable;
            }
        }
        fVar.f545615f = ((java.lang.Number) t70Var.u().r()).intValue();
        fVar.f545614e = ((java.lang.Number) t70Var.v().r()).intValue();
        yo0.i a17 = fVar.a();
        r45.mb4 mb4Var = new r45.mb4();
        java.lang.String j17 = hc2.l.j(str, "token");
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        mb4Var.set(9, com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(j17.getBytes()));
        mb4Var.set(0, str);
        mb4Var.set(1, str);
        java.lang.String k17 = hc2.l.k(j17);
        mb4Var.set(46, k17);
        mb4Var.set(47, k17);
        new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).b(new mn2.c1(mb4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f, null, null, 12, null), a17).c(imageView);
    }

    public void g(android.widget.ImageView view, java.lang.String url, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90 mediaType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaType, "mediaType");
        mn2.g1 g1Var = mn2.g1.f411508a;
        g1Var.a().c(new mn2.n(url, mediaType), view, g1Var.h(mn2.f1.f411490h));
    }

    public void h(java.lang.String str, android.widget.ImageView imageView, mn2.f1 loaderType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loaderType, "loaderType");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLoaderApi", "#loadImage url=" + str);
        if (str == null || str.length() == 0) {
            return;
        }
        mn2.g1 g1Var = mn2.g1.f411508a;
        yo0.i h17 = g1Var.h(loaderType);
        r45.mb4 mb4Var = new r45.mb4();
        java.lang.String j17 = hc2.l.j(str, "token");
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        mb4Var.set(9, com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(j17.getBytes()));
        mb4Var.set(0, str);
        mb4Var.set(1, str);
        java.lang.String k17 = hc2.l.k(j17);
        mb4Var.set(46, k17);
        mb4Var.set(47, k17);
        mn2.c1 c1Var = new mn2.c1(mb4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f, null, null, 12, null);
        if (imageView != null) {
            g1Var.e().b(c1Var, h17).c(imageView);
        } else {
            g1Var.e().b(c1Var, h17).a();
        }
    }

    public void i(java.lang.String str, android.view.View qImageView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qImageView, "qImageView");
        wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(new mn2.q3(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e));
        ya2.j jVar = new ya2.j(qImageView);
        a17.getClass();
        a17.f529406d = jVar;
        a17.f();
    }

    public void j(java.lang.String str, android.widget.ImageView imageView, mn2.f1 loaderType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loaderType, "loaderType");
        if ((str == null || str.length() == 0) || imageView == null) {
            return;
        }
        mn2.g1 g1Var = mn2.g1.f411508a;
        g1Var.f().c(new mn2.q3(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), imageView, g1Var.h(loaderType));
    }

    public void k(java.lang.String url, android.widget.ImageView imageView, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        if (url.length() == 0) {
            return;
        }
        r45.mb4 mb4Var = new r45.mb4();
        java.lang.String j17 = hc2.l.j(url, "token");
        if (str == null) {
            str = j17;
        }
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        mb4Var.set(9, com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes()));
        mb4Var.set(0, url);
        mb4Var.set(1, url);
        java.lang.String k17 = hc2.l.k(j17);
        mb4Var.set(46, k17);
        mb4Var.set(47, k17);
        mn2.j3 j3Var = new mn2.j3(mb4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f);
        mn2.g1 g1Var = mn2.g1.f411508a;
        if (imageView == null) {
            g1Var.j().b(j3Var, g1Var.h(mn2.f1.f411504y)).a();
        } else {
            g1Var.j().b(j3Var, g1Var.h(mn2.f1.f411504y)).c(imageView);
        }
    }

    public void l(java.lang.String str, android.widget.ImageView imageView, mn2.f1 loaderType, java.lang.ref.WeakReference weakReference) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loaderType, "loaderType");
        if ((str == null || str.length() == 0) || imageView == null) {
            return;
        }
        r45.mb4 mb4Var = new r45.mb4();
        java.lang.String j17 = hc2.l.j(str, "token");
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        mb4Var.set(9, com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(j17.getBytes()));
        mb4Var.set(0, str);
        mb4Var.set(1, str);
        java.lang.String k17 = hc2.l.k(j17);
        mb4Var.set(46, k17);
        mb4Var.set(47, k17);
        mn2.c1 c1Var = new mn2.c1(mb4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f, null, null, 12, null);
        mn2.g1 g1Var = mn2.g1.f411508a;
        ((mn2.d1) g1Var.e()).j(c1Var, g1Var.h(loaderType)).i(imageView, new ya2.k(weakReference));
    }
}
