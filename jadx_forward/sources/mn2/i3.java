package mn2;

/* loaded from: classes10.dex */
public class i3 extends bp0.c {
    @Override // zo0.i
    public hp0.g a(cp0.n targetView, vo0.h reaper, jp0.f input) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetView, "targetView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reaper, "reaper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
        pm0.c cVar = new pm0.c("ProfileDrawerCoverBitmapProducer");
        java.io.InputStream b17 = input.b();
        android.graphics.Bitmap bitmap = null;
        if (b17 != null) {
            yo0.i iVar = reaper.f520005b;
            int i17 = iVar.f545633e;
            int i18 = iVar.f545634f;
            ((d60.y) ((e60.j1) i95.n0.c(e60.j1.class))).getClass();
            android.graphics.Bitmap a17 = z23.h.f551275e.a(b17, i17, i18, true, false, true);
            java.lang.Object a18 = targetView.a();
            android.view.View view = a18 instanceof android.view.View ? (android.view.View) a18 : null;
            java.lang.Object tag = view != null ? view.getTag(com.p314xaae8f345.mm.R.id.fvw) : null;
            java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
            int intValue = num != null ? num.intValue() : 0;
            java.lang.Object a19 = targetView.a();
            android.view.View view2 = a19 instanceof android.view.View ? (android.view.View) a19 : null;
            java.lang.Object tag2 = view2 != null ? view2.getTag(com.p314xaae8f345.mm.R.id.fvx) : null;
            java.lang.String str = tag2 instanceof java.lang.String ? (java.lang.String) tag2 : null;
            if (str == null) {
                str = "";
            }
            int height = a17.getHeight();
            int width = a17.getWidth();
            if (width != 0 && height != 0) {
                float f17 = width;
                float f18 = height;
                float f19 = f17 / f18;
                float f27 = (intValue == 2 || width > height) ? 1.0f : 0.75f;
                if (f19 > f27) {
                    width = (int) (f18 * f27);
                } else {
                    height = (int) (f17 / f27);
                }
            }
            int i19 = width;
            int width2 = (a17.getWidth() - i19) / 2;
            int i27 = width2 < 0 ? 0 : width2;
            int height2 = (a17.getHeight() - height) / 2;
            int i28 = height2 < 0 ? 0 : height2;
            ((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).getClass();
            boolean z17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bm5.o1.f104252a.d(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2554x6e06889c.C20574x4020a1ef()), 1) && com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.h(vz5.a.c(b17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Loader.InputStreamBitmapProducer", "feedId:" + str + " cardShowStyle:" + intValue + " targetWidth:" + i19 + " targetHeight:" + height + " x:" + i27 + " y:" + i28 + " showWxamMark:" + z17);
            android.graphics.Bitmap E = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.E(a17, i27, i28, i19, height, true);
            if (!z17) {
                bitmap = E;
            } else if (E != null) {
                int[] iArr = new int[E.getWidth() * E.getHeight()];
                int width3 = E.getWidth();
                int height3 = E.getHeight();
                if (width3 < height3) {
                    width3 = height3;
                }
                if (100 <= width3) {
                    width3 = 100;
                }
                int height4 = E.getHeight();
                int i29 = 0;
                for (int i37 = 0; i37 < height4; i37++) {
                    int width4 = E.getWidth();
                    for (int i38 = 0; i38 < width4; i38++) {
                        int pixel = E.getPixel(i38, i37);
                        int red = android.graphics.Color.red(pixel);
                        int green = android.graphics.Color.green(pixel);
                        int blue = android.graphics.Color.blue(pixel);
                        int alpha = android.graphics.Color.alpha(pixel);
                        if (i37 < width3 && i38 < width3) {
                            red = 255;
                            green = 0;
                            blue = 0;
                        }
                        iArr[i29] = android.graphics.Color.argb(alpha, red, green, blue);
                        i29++;
                    }
                }
                int width5 = E.getWidth();
                int height5 = E.getHeight();
                android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(config);
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(height5));
                arrayList.add(java.lang.Integer.valueOf(width5));
                arrayList.add(iArr);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/finder/loader/FinderProfileDrawerCoverBitmapProducer", "changeBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                bitmap = android.graphics.Bitmap.createBitmap((int[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(3));
                yj0.a.e(obj, bitmap, "com/tencent/mm/plugin/finder/loader/FinderProfileDrawerCoverBitmapProducer", "changeBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            }
        }
        cVar.a();
        return new hp0.g(bitmap);
    }
}
