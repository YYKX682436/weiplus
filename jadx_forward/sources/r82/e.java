package r82;

/* loaded from: classes12.dex */
public class e extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 f474839d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra f474840e;

    public e() {
        super(0);
        this.f474839d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.r2(10);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        final o72.r2 r2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra raVar;
        o72.r2 r2Var2;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5425xe7e9425 c5425xe7e9425 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5425xe7e9425) abstractC20979x809547d1;
        am.s9 s9Var = c5425xe7e9425.f135769g;
        long j17 = s9Var.f89413c;
        android.graphics.Bitmap bitmap = null;
        if (j17 != 0) {
            if (s9Var.f89421k) {
                r2Var2 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(c5425xe7e9425.f135769g.f89413c);
                if (r2Var2 != null) {
                    this.f474839d.put(java.lang.Long.valueOf(c5425xe7e9425.f135769g.f89413c), r2Var2);
                }
            } else {
                r2Var2 = (o72.r2) this.f474839d.get(java.lang.Long.valueOf(j17));
                if (r2Var2 == null && (r2Var2 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(c5425xe7e9425.f135769g.f89413c)) != null) {
                    this.f474839d.put(java.lang.Long.valueOf(c5425xe7e9425.f135769g.f89413c), r2Var2);
                }
            }
            r2Var = r2Var2;
        } else {
            r2Var = null;
        }
        am.s9 s9Var2 = c5425xe7e9425.f135769g;
        int i17 = s9Var2.f89411a;
        long j18 = s9Var2.f89413c;
        final boolean z17 = false;
        if (r2Var != null || i17 == 3 || i17 == 4) {
            if (i17 == 0) {
                c5425xe7e9425.f135770h.f89525a = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra.i(s9Var2.f89412b, r2Var);
            } else if (i17 == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra raVar2 = this.f474840e;
                if (raVar2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavImageServiceListener", "imageServer is null");
                } else {
                    raVar2.a(s9Var2.f89415e, s9Var2.f89412b, r2Var, s9Var2.f89416f, s9Var2.f89417g, s9Var2.f89418h);
                }
            } else if (i17 != 2) {
                if (i17 == 3) {
                    com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra raVar3 = this.f474840e;
                    if (raVar3 != null) {
                        raVar3.f();
                    }
                    this.f474840e = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra(c5425xe7e9425.f135769g.f89419i, 16);
                } else if (i17 == 4 && (raVar = this.f474840e) != null) {
                    raVar.f();
                    this.f474840e = null;
                }
            } else if (s9Var2.f89420j) {
                am.t9 t9Var = c5425xe7e9425.f135770h;
                r45.gp0 gp0Var = s9Var2.f89412b;
                java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra.f182914e;
                if (!fp.i.b()) {
                    android.content.res.Resources resources = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.bkr));
                    arrayList.add(resources);
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavoriteImageServer", "getBigImgFromCache", "(Lcom/tencent/mm/protocal/protobuf/FavDataItem;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
                    bitmap = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
                    yj0.a.e(obj, bitmap, "com/tencent/mm/plugin/fav/ui/FavoriteImageServer", "getBigImgFromCache", "(Lcom/tencent/mm/protocal/protobuf/FavDataItem;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
                } else if (gp0Var.T != null) {
                    bitmap = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra.h(gp0Var, false, true);
                }
                t9Var.f89525a = bitmap;
            } else {
                am.t9 t9Var2 = c5425xe7e9425.f135770h;
                final r45.gp0 gp0Var2 = s9Var2.f89412b;
                int i18 = s9Var2.f89414d;
                java.util.Map map2 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra.f182914e;
                if (!fp.i.b()) {
                    android.content.res.Resources resources2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.bkr));
                    arrayList2.add(resources2);
                    java.lang.Object obj2 = new java.lang.Object();
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/FavoriteImageServer", "getSuitableImg", "(Lcom/tencent/mm/protocal/protobuf/FavDataItem;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;ZI)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
                    bitmap = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue());
                    yj0.a.e(obj2, bitmap, "com/tencent/mm/plugin/fav/ui/FavoriteImageServer", "getSuitableImg", "(Lcom/tencent/mm/protocal/protobuf/FavDataItem;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;ZI)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
                } else if (gp0Var2.T != null) {
                    java.lang.String x17 = o72.x1.x(gp0Var2);
                    if (com.p314xaae8f345.mm.vfs.w6.j(x17)) {
                        jt0.i iVar = (jt0.i) com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra.f182915f;
                        android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) iVar.get(x17);
                        if (bitmap2 != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteImageServer", "get bm from cache %s", x17);
                            bitmap = bitmap2;
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteImageServer", "get from cache fail, try to decode from file");
                            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            android.graphics.Bitmap d17 = com.p314xaae8f345.mm.p786x600aa8b.e.d(x17, options);
                            if (d17 != null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteImageServer", "bitmap recycle %s", d17);
                                d17.recycle();
                            }
                            int i19 = options.outWidth;
                            int i27 = options.outHeight;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteImageServer", "width: %s, height: %s", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
                            if (i19 > i18) {
                                i27 = (options.outHeight * i18) / options.outWidth;
                            } else {
                                i18 = i19;
                            }
                            int max = java.lang.Math.max(1, i18);
                            int max2 = java.lang.Math.max(1, i27);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavoriteImageServer", "fit long picture, beg %d*%d, after %d*%d", java.lang.Integer.valueOf(options.outWidth), java.lang.Integer.valueOf(options.outHeight), java.lang.Integer.valueOf(max), java.lang.Integer.valueOf(max2));
                            int a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.l.a(x17);
                            if (a17 != 90 && a17 != 270) {
                                max2 = max;
                                max = max2;
                            }
                            android.graphics.Bitmap T = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.T(x17, max, max2, false);
                            if (T == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavoriteImageServer", "getSuitableBmp fail, temBmp is null, filePath = " + x17);
                            } else {
                                android.graphics.Bitmap w07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(T, a17);
                                iVar.put(x17, w07);
                                bitmap = w07;
                            }
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavoriteImageServer", "getBitmap file not exist %s", gp0Var2.T);
                    }
                    if (bitmap == null) {
                        final java.lang.String x18 = o72.x1.x(gp0Var2);
                        ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.fav.ui.ra$$f
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z18 = z17;
                                if (z18 || com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra.k(x18)) {
                                    o72.x1.y0(r2Var, gp0Var2, z18);
                                }
                            }
                        }, "FavImageServer");
                    }
                }
                t9Var2.f89525a = bitmap;
            }
        }
        return false;
    }
}
