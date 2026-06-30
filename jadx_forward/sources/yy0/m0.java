package yy0;

@j95.b
/* loaded from: classes5.dex */
public final class m0 extends i95.w implements pp0.h0 {

    /* renamed from: d, reason: collision with root package name */
    public volatile yy0.i0 f549740d = yy0.i0.f549670d;

    public java.lang.String Ai(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (!((java.lang.Boolean) p3325xe03a0797.p3326xc267989b.l.f(null, new yy0.k0(null), 1, null)).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJPublisher", "calcFileCheckSum error: load so failed");
            return null;
        }
        p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        try {
            java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(path, false);
            if (i17 != null) {
                return com.p314xaae8f345.p457x3304c6.p483x6a710b1.C4202xa3116391.a(i17);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJPublisher", "calcVideoCheckSum error: exportPath is null");
            return null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJPublisher", "calcVideoCheckSum error: " + e17.getMessage());
            return null;
        }
    }

    public java.util.Map Bi() {
        java.lang.Object m143895xf1229813;
        java.util.List f07;
        java.lang.String uj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).uj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2545xe20e94ff.p2546x5be56f80.C20392x7afa0b92());
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(uj6);
        for (java.lang.String str : r26.n0.e0(uj6, new char[]{','}, false, 0, 6, null)) {
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                f07 = r26.n0.f0(str, new java.lang.String[]{"__"}, false, 0, 6, null);
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            if (f07.size() >= 2) {
                java.lang.String str2 = (java.lang.String) f07.get(0);
                java.lang.Integer h17 = r26.h0.h((java.lang.String) f07.get(1));
                if ((str2.length() > 0) && h17 != null && h17.intValue() > 0) {
                    concurrentHashMap.put(str2, h17);
                }
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
                java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
                if (m143898xd4a2fc34 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("getCaptionLanguageSentenceLengthList", "sentenceLength: " + m143898xd4a2fc34 + ", error: " + m143898xd4a2fc34.getMessage());
                }
            }
        }
        return concurrentHashMap;
    }

    public final int Di(e42.c0 c0Var, int i17) {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(c0Var, i17);
    }

    public float Ni() {
        if (!pp0.h0.Q2(this, false, 1, null)) {
            return 0.0f;
        }
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).hj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2545xe20e94ff.p2546x5be56f80.C20387x85ab5185());
    }

    public float Ri() {
        if (!pp0.h0.Q2(this, false, 1, null)) {
            return 0.0f;
        }
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).hj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2545xe20e94ff.p2546x5be56f80.C20395x6cfd66b7());
    }

    public boolean Ui() {
        if (pp0.h0.Q2(this, false, 1, null)) {
            return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2545xe20e94ff.p2546x5be56f80.C20390xc1add6dc()) == 1;
        }
        return false;
    }

    public boolean Vi() {
        if (!Zi(true)) {
            return false;
        }
        int Di = Di(e42.c0.clicfg_finder_maas_mj_publisher_entry_type, 0);
        if (Di == 0) {
            if (bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2545xe20e94ff.C20380x4b9233a9()) == 1) {
                return true;
            }
        } else if (Di == 1) {
            return true;
        }
        return false;
    }

    public boolean Zi(boolean z17) {
        if (z17) {
            mj();
        }
        if (!((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).Ni(false)) {
            return false;
        }
        ((yy0.q7) ((pp0.n0) i95.n0.c(pp0.n0.class))).getClass();
        if (!py0.b.f440504a.a()) {
            return false;
        }
        int h17 = bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2545xe20e94ff.C20379x469869c6());
        if (h17 != 1) {
            return h17 != 2 && Di(e42.c0.clicfg_finder_maas_mj_publisher_enable, 0) == 1;
        }
        return true;
    }

    public boolean aj() {
        if (!pp0.h0.Q2(this, false, 1, null)) {
            return false;
        }
        int h17 = bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2545xe20e94ff.C20382x3eea51fe());
        if (h17 != 1) {
            return h17 != 2 && Di(e42.c0.clicfg_finder_maas_mj_publisher_movie_composing_enable, 0) == 1;
        }
        return true;
    }

    public boolean bj() {
        if (pp0.h0.Q2(this, false, 1, null)) {
            return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2545xe20e94ff.p2546x5be56f80.C20398x6257645f()) == 1;
        }
        return false;
    }

    public boolean cj() {
        if (pp0.h0.Q2(this, false, 1, null)) {
            return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2545xe20e94ff.p2546x5be56f80.C20402x505454da()) == 1;
        }
        return false;
    }

    public boolean fj() {
        if (pp0.h0.Q2(this, false, 1, null) && Ui()) {
            return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2545xe20e94ff.p2546x5be56f80.C20403xbf86570c()) == 1;
        }
        return false;
    }

    public boolean hj() {
        if (pp0.h0.Q2(this, false, 1, null)) {
            return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2545xe20e94ff.p2546x5be56f80.C20393xa0736629()) == 1;
        }
        return false;
    }

    public void ij() {
        if (pp0.h0.Q2(this, false, 1, null) && this.f549740d == yy0.i0.f549670d) {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_finder_maas_so_preload_in_feed, 1) == 1) {
                this.f549740d = yy0.i0.f549671e;
                p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new yy0.l0(this, null), 2, null);
            }
        }
    }

    public void mj() {
        h62.d dVar = (h62.d) ((e42.e0) i95.n0.c(e42.e0.class));
        dVar.Ni(e42.c0.clicfg_finder_maas_mj_publisher_enable, 0);
        dVar.Ni(e42.c0.clicfg_finder_maas_mj_publisher_entry_type, 0);
        dVar.Ni(e42.c0.clicfg_finder_maas_mj_publisher_movie_composing_enable, 0);
    }

    public void wi(java.util.List waitSaveToAlbumList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(waitSaveToAlbumList, "waitSaveToAlbumList");
        if (waitSaveToAlbumList.isEmpty()) {
            return;
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2545xe20e94ff.p2547xabf495af.C20434xc4a9458a()) != 1) {
            return;
        }
        java.util.Iterator it = waitSaveToAlbumList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p839xf223db21.C10858x5d0663fa c10858x5d0663fa = (com.p314xaae8f345.mm.p839xf223db21.C10858x5d0663fa) it.next();
            if (yy0.j0.f549691a[c10858x5d0663fa.f150171d.ordinal()] == 1) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.String str = c10858x5d0663fa.f150172e;
                arrayList.add(str);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/mj_template/feature_service/MJPublisherFeatureServiceImpl", "addFinderWaterMarkThenSaveToAlbum", "(Ljava/util/List;)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap decodeFile = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0));
                yj0.a.e(obj, decodeFile, "com/tencent/mm/mj_template/feature_service/MJPublisherFeatureServiceImpl", "addFinderWaterMarkThenSaveToAlbum", "(Ljava/util/List;)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(decodeFile);
                int width = decodeFile.getWidth();
                int height = decodeFile.getHeight();
                android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(config);
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(java.lang.Integer.valueOf(height));
                arrayList2.add(java.lang.Integer.valueOf(width));
                java.lang.Object obj2 = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/mj_template/feature_service/MJPublisherFeatureServiceImpl", "addFinderWaterMark", "(Landroid/content/Context;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList2.get(2));
                yj0.a.e(obj2, createBitmap, "com/tencent/mm/mj_template/feature_service/MJPublisherFeatureServiceImpl", "addFinderWaterMark", "(Landroid/content/Context;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
                android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
                canvas.drawBitmap(decodeFile, 0.0f, 0.0f, (android.graphics.Paint) null);
                android.graphics.drawable.Drawable drawable = context.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.d4j);
                if (drawable != null) {
                    float width2 = decodeFile.getWidth() / 1080.0f;
                    int width3 = (decodeFile.getWidth() - ((int) (146 * width2))) / 2;
                    int height2 = decodeFile.getHeight() - ((int) (37 * width2));
                    drawable.setBounds(width3, height2 - ((int) (34 * width2)), decodeFile.getWidth() - width3, height2);
                    drawable.draw(canvas);
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(createBitmap, 100, android.graphics.Bitmap.CompressFormat.JPEG, str, true);
                java.lang.String g17 = ai3.d.g("jpg");
                zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
                android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                ((yb0.g) b0Var).getClass();
                com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.b(context2, str, g17);
                q75.c.f(g17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            }
        }
    }
}
