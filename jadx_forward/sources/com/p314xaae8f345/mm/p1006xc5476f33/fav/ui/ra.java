package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class ra {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f182914e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final kk.j f182915f = new jt0.i(10, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra.class);

    /* renamed from: g, reason: collision with root package name */
    public static final kk.j f182916g = new jt0.i(20, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra.class);

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f182917a;

    /* renamed from: b, reason: collision with root package name */
    public y60.h f182918b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.HashMap f182919c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public java.util.HashMap f182920d = new java.util.HashMap();

    public ra(android.content.Context context, int i17) {
        new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5697xfda8a2d7>(this) { // from class: com.tencent.mm.plugin.fav.ui.FavoriteImageServer$MMTrimMemoryEventListener

            /* renamed from: d, reason: collision with root package name */
            public final java.lang.ref.WeakReference f181968d;

            {
                super(com.p314xaae8f345.mm.app.a0.f134821d);
                this.f181968d = new java.lang.ref.WeakReference(this);
                this.f39173x3fe91575 = 708811463;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5697xfda8a2d7 c5697xfda8a2d7) {
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra raVar = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra) this.f181968d.get();
                if (raVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteImageServer", "received MMTrimMemoryEvent: FavoriteImageServer was gone");
                    mo48814x2efc64();
                } else if (ih.a.f(e42.d0.clicfg_matrix_trim_memory_favoriteimageserver_v2, false)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavoriteImageServer", "received MMTrimMemoryEvent: FavoriteImageServer");
                    java.util.HashMap hashMap = raVar.f182919c;
                    if (hashMap != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavoriteImageServer", "received MMTrimMemoryEvent: clear [attachImgPathCache][%s]", java.lang.Integer.valueOf(hashMap.size()));
                        raVar.f182919c.clear();
                    }
                    java.util.HashMap hashMap2 = raVar.f182920d;
                    if (hashMap2 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavoriteImageServer", "received MMTrimMemoryEvent: clear [attachThumbPathCache][%s]", java.lang.Integer.valueOf(hashMap2.size()));
                        raVar.f182920d.clear();
                    }
                }
                return false;
            }
        }.mo48813x58998cd();
        this.f182917a = context;
        y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
        i17 = i17 <= 0 ? 24 : i17;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.sa saVar = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.sa(this);
        ((x60.e) fVar).getClass();
        this.f182918b = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r4(i17, saVar);
    }

    public static void d(final android.widget.ImageView imageView, int i17, final r45.gp0 gp0Var, final o72.r2 r2Var, final boolean z17, final int i18, final int i19) {
        java.lang.String str = gp0Var.T;
        if (str == null) {
            imageView.setImageResource(i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteImageServer", "dataId is null favId:%s localId:%s", java.lang.Integer.valueOf(r2Var.f67643xc8a07680), java.lang.Long.valueOf(r2Var.f67645x88be67a1));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteImageServer", "attachTopThumb dataId:%s, hashCode:%s, width:%s, height:%s, viewWidth:%s, viewHeight:%s", str, java.lang.Integer.valueOf(imageView.hashCode()), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(imageView.getWidth()), java.lang.Integer.valueOf(imageView.getHeight()));
        java.lang.String x17 = o72.x1.x(gp0Var);
        android.graphics.Bitmap j17 = (!com.p314xaae8f345.mm.vfs.w6.j(x17) || com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.g(x17)) ? null : j(x17, i18, i19, true);
        final java.lang.String X = o72.x1.X(gp0Var);
        if ((j17 == null || j17.isRecycled()) && com.p314xaae8f345.mm.vfs.w6.j(X)) {
            j17 = j(X, i18, i19, true);
        }
        if (j17 != null && !j17.isRecycled()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteImageServer", "attachTopThumb 1, bm width:%s, height:%s", java.lang.Integer.valueOf(j17.getWidth()), java.lang.Integer.valueOf(j17.getHeight()));
            imageView.setImageBitmap(j17);
        } else {
            imageView.setImageResource(i17);
            imageView.setTag(X);
            ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.fav.ui.ra$$b
                @Override // java.lang.Runnable
                public final void run() {
                    java.lang.String str2 = X;
                    int i27 = i18;
                    int i28 = i19;
                    boolean z18 = z17;
                    o72.r2 r2Var2 = r2Var;
                    r45.gp0 gp0Var2 = gp0Var;
                    final android.widget.ImageView imageView2 = imageView;
                    final android.graphics.Bitmap j18 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra.j(str2, i27, i28, false);
                    if (j18 == null) {
                        if (z18 || com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra.k(str2)) {
                            o72.x1.A0(r2Var2, gp0Var2, true);
                            return;
                        }
                        return;
                    }
                    java.lang.String str3 = (java.lang.String) imageView2.getTag();
                    if (str3 == null || !str3.equals(str2)) {
                        return;
                    }
                    ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.fav.ui.ra$$h
                        @Override // java.lang.Runnable
                        public final void run() {
                            android.graphics.Bitmap bitmap = j18;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteImageServer", "attachTopThumb 2, bm width:%s, height:%s", java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()));
                            imageView2.setImageBitmap(bitmap);
                        }
                    });
                }
            }, "FavImageServer");
        }
    }

    public static android.graphics.Bitmap g(final r45.gp0 gp0Var, final o72.r2 r2Var, final boolean z17) {
        if (!fp.i.b()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavoriteImageServer", "[getBigImg] sdcardAvail = false, bigImg return nosdcard_chatting_bg");
            android.content.res.Resources resources = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.bkr));
            arrayList.add(resources);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavoriteImageServer", "getBigImg", "(Lcom/tencent/mm/protocal/protobuf/FavDataItem;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;Z)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/fav/ui/FavoriteImageServer", "getBigImg", "(Lcom/tencent/mm/protocal/protobuf/FavDataItem;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;Z)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            return decodeResource;
        }
        java.lang.String str = gp0Var.T;
        if (str == null) {
            return null;
        }
        android.graphics.Bitmap h17 = h(gp0Var, false, false);
        if (h17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteImageServer", "get big img of dataId = " + str + " , is wxam = " + com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.g(o72.x1.x(gp0Var)));
        }
        if (h17 == null) {
            final java.lang.String x17 = o72.x1.x(gp0Var);
            ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.fav.ui.ra$$d
                @Override // java.lang.Runnable
                public final void run() {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("forceDownload = ");
                    boolean z18 = z17;
                    sb6.append(z18);
                    sb6.append(", needRestartCdnDownload = ");
                    java.lang.String str2 = x17;
                    sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra.k(str2));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteImageServer", sb6.toString());
                    if (z18 || com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra.k(str2)) {
                        o72.x1.y0(r2Var, gp0Var, z18);
                    }
                }
            }, "FavImageServer");
        }
        return h17;
    }

    public static android.graphics.Bitmap h(r45.gp0 gp0Var, boolean z17, boolean z18) {
        java.lang.String X = z17 ? o72.x1.X(gp0Var) : o72.x1.x(gp0Var);
        if (com.p314xaae8f345.mm.vfs.w6.j(X)) {
            return com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u1.c(X, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48865xd4605761, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48865xd4605761, z18);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavoriteImageServer", "getBitmap file not exist %s", X);
        return null;
    }

    public static android.graphics.Bitmap i(final r45.gp0 gp0Var, final o72.r2 r2Var) {
        if (fp.i.b()) {
            if (o72.x1.W(gp0Var.T) == null) {
                return null;
            }
            android.graphics.Bitmap h17 = h(gp0Var, true, false);
            if (h17 == null) {
                final java.lang.String X = o72.x1.X(gp0Var);
                ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.fav.ui.ra$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra.k(X)) {
                            o72.x1.A0(r2Var, gp0Var, true);
                        }
                    }
                }, "FavImageServer");
            }
            return h17;
        }
        android.content.res.Resources resources = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.bkr));
        arrayList.add(resources);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavoriteImageServer", "getThumb", "(Lcom/tencent/mm/protocal/protobuf/FavDataItem;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/fav/ui/FavoriteImageServer", "getThumb", "(Lcom/tencent/mm/protocal/protobuf/FavDataItem;Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        return decodeResource;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5 A[Catch: all -> 0x01ae, TryCatch #0 {all -> 0x01ae, blocks: (B:13:0x0034, B:15:0x003a, B:16:0x0054, B:20:0x0069, B:26:0x007e, B:27:0x0080, B:29:0x0086, B:31:0x008a, B:33:0x008f, B:35:0x00c5, B:38:0x00ce, B:40:0x00d5, B:42:0x00d9, B:45:0x00e8, B:47:0x0171, B:49:0x0177, B:54:0x01a7), top: B:12:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap j(java.lang.String r24, int r25, int r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra.j(java.lang.String, int, int, boolean):android.graphics.Bitmap");
    }

    public static boolean k(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!m17.a() ? false : m17.f294799a.F(m17.f294800b)) {
            return false;
        }
        java.util.Map map = f182914e;
        fp.j jVar = (fp.j) ((java.util.HashMap) map).get(str);
        if (jVar == null) {
            ((java.util.HashMap) map).put(str, new fp.j());
            return true;
        }
        if (jVar.a() <= 30000) {
            return false;
        }
        jVar.b();
        return true;
    }

    public void a(android.widget.ImageView imageView, r45.gp0 gp0Var, o72.r2 r2Var, int i17, int i18, int i19) {
        r45.tq0 tq0Var;
        java.lang.String str;
        r45.kv2 kv2Var;
        if (imageView == null) {
            return;
        }
        if (!fp.i.b()) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bkr);
            return;
        }
        if (r2Var == null || gp0Var == null) {
            imageView.setImageDrawable(i65.a.i(this.f182917a, i17));
            return;
        }
        int i27 = gp0Var.I;
        if (i27 != 4) {
            if (i27 == 5) {
                r45.hp0 hp0Var = gp0Var.J1;
                boolean z17 = false;
                if (hp0Var != null) {
                    tq0Var = hp0Var.f457888f;
                    r45.qp0 qp0Var = hp0Var.f457902w;
                    if (qp0Var != null && qp0Var.f465695d == 5) {
                        z17 = true;
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavoriteImageServer", "webpage: get data proto item null, dataid[%s], infoid[%d, %d]", gp0Var.T, java.lang.Long.valueOf(r2Var.f67645x88be67a1), java.lang.Integer.valueOf(r2Var.f67643xc8a07680));
                    tq0Var = null;
                }
                java.lang.String str2 = tq0Var != null ? tq0Var.f468203m : null;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    str2 = gp0Var.G;
                }
                if (z17) {
                    ((qv.k) ((rv.r2) i95.n0.c(rv.r2.class))).getClass();
                    str = qk.c.b(str2, 4, true);
                } else {
                    str = str2;
                }
                b(imageView, gp0Var, r2Var, str, i17, i18, i19);
                return;
            }
            if (i27 != 7) {
                if (i27 == 19) {
                    r45.hp0 hp0Var2 = gp0Var.J1;
                    if (hp0Var2 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavoriteImageServer", "app brand: get data proto item null, dataid[%s], infoid[%d, %d]", gp0Var.T, java.lang.Long.valueOf(r2Var.f67645x88be67a1), java.lang.Integer.valueOf(r2Var.f67643xc8a07680));
                        return;
                    }
                    r45.dp0 dp0Var = hp0Var2.f457901v;
                    if (dp0Var != null) {
                        ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r4) this.f182918b).a(imageView, null, dp0Var.f454170g, i17, i18, i19);
                        return;
                    }
                    return;
                }
                if (i27 == 22) {
                    r45.hp0 hp0Var3 = gp0Var.J1;
                    if (hp0Var3 == null || (kv2Var = hp0Var3.f457904y) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(kv2Var.m75941xfb821914(7)) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((r45.iv2) gp0Var.J1.f457904y.m75941xfb821914(7).getFirst()).m75945x2fec8307(2))) {
                        imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(imageView.getContext(), com.p314xaae8f345.mm.R.raw.f80119x628f1c9a, imageView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560059a7)));
                        return;
                    } else {
                        ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r4) this.f182918b).a(imageView, null, ((r45.iv2) gp0Var.J1.f457904y.m75941xfb821914(7).getFirst()).m75945x2fec8307(2), i17, i18, i19);
                        return;
                    }
                }
                if (i27 != 29) {
                    if (i27 == 36) {
                        b(imageView, gp0Var, r2Var, gp0Var.G, i17, i18, i19);
                        return;
                    }
                    if (i27 == 10) {
                        r45.hp0 hp0Var4 = gp0Var.J1;
                        if (hp0Var4 == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavoriteImageServer", "good: get data proto item null, dataid[%s], infoid[%d, %d]", gp0Var.T, java.lang.Long.valueOf(r2Var.f67645x88be67a1), java.lang.Integer.valueOf(r2Var.f67643xc8a07680));
                            return;
                        }
                        r45.aq0 aq0Var = hp0Var4.f457889g;
                        if (aq0Var != null) {
                            ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r4) this.f182918b).a(imageView, null, aq0Var.f451725h, i17, i18, i19);
                            return;
                        }
                        return;
                    }
                    if (i27 == 11) {
                        r45.hp0 hp0Var5 = gp0Var.J1;
                        if (hp0Var5 == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavoriteImageServer", "product: get data proto item null, dataid[%s], infoid[%d, %d]", gp0Var.T, java.lang.Long.valueOf(r2Var.f67645x88be67a1), java.lang.Integer.valueOf(r2Var.f67643xc8a07680));
                            return;
                        }
                        r45.aq0 aq0Var2 = hp0Var5.f457889g;
                        if (aq0Var2 != null) {
                            ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r4) this.f182918b).a(imageView, null, aq0Var2.f451725h, i17, i18, i19);
                            return;
                        }
                        return;
                    }
                    if (i27 == 14) {
                        r45.hp0 hp0Var6 = gp0Var.J1;
                        if (hp0Var6 == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavoriteImageServer", "tv: get data proto item null, dataid[%s], infoid[%d, %d]", gp0Var.T, java.lang.Long.valueOf(r2Var.f67645x88be67a1), java.lang.Integer.valueOf(r2Var.f67643xc8a07680));
                            return;
                        }
                        r45.mq0 mq0Var = hp0Var6.f457890h;
                        if (mq0Var != null) {
                            ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r4) this.f182918b).a(imageView, null, mq0Var.f462272h, i17, i18, i19);
                            return;
                        }
                        return;
                    }
                    if (i27 != 15) {
                        if (i27 != 32 && i27 != 33) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavoriteImageServer", "attach thumb, pass type is %d", java.lang.Integer.valueOf(r2Var.f67657x2262335f));
                            return;
                        }
                    }
                }
            }
            b(imageView, gp0Var, r2Var, gp0Var.G, i17, i18, i19);
            return;
        }
        b(imageView, gp0Var, r2Var, gp0Var.G, i17, i18, i19);
    }

    public java.lang.String b(android.widget.ImageView imageView, final r45.gp0 gp0Var, final o72.r2 r2Var, java.lang.String str, int i17, int i18, int i19) {
        java.lang.String[] strArr;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteImageServer", "attachThumb hashCode:%s, width:%s, height:%s, viewWidth:%s, viewHeight:%s url:%s", java.lang.Integer.valueOf(imageView.hashCode()), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(imageView.getWidth()), java.lang.Integer.valueOf(imageView.getHeight()), str);
        java.lang.String W = o72.x1.W(gp0Var.T);
        if (gp0Var.T != null) {
            strArr = (java.lang.String[]) this.f182920d.get(W);
            if (strArr == null) {
                strArr = new java.lang.String[]{o72.x1.X(gp0Var)};
                this.f182920d.put(W, strArr);
            }
        } else {
            strArr = null;
        }
        ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r4) this.f182918b).a(imageView, strArr, str, i17, i18, i19);
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        final java.lang.String str2 = strArr[0];
        ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.fav.ui.ra$$g
            @Override // java.lang.Runnable
            public final void run() {
                if (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra.k(str2)) {
                    o72.x1.A0(r2Var, gp0Var, true);
                }
            }
        }, "FavImageServer");
        return strArr[0];
    }

    public void c(android.widget.ImageView imageView, r45.gp0 gp0Var, o72.r2 r2Var, int i17, int i18, int i19) {
        java.lang.String str;
        java.lang.String str2;
        r45.xs4 xs4Var;
        int i27;
        if (imageView == null) {
            return;
        }
        if (!fp.i.b()) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bkr);
            return;
        }
        if (r2Var == null) {
            return;
        }
        if (r2Var.f67640x5ab01132 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavoriteImageServer", "attachThumb: failed favProto error");
            return;
        }
        boolean z17 = false;
        imageView.setVisibility(0);
        int i28 = r2Var.f67657x2262335f;
        if (i28 != 4) {
            if (i28 == 5) {
                r45.bq0 bq0Var = r2Var.f67640x5ab01132;
                r45.qp0 qp0Var = bq0Var.K;
                if (qp0Var != null && qp0Var.f465695d == 5) {
                    z17 = true;
                }
                r45.tq0 tq0Var = bq0Var.f452501m;
                if (gp0Var != null) {
                    java.lang.String str3 = tq0Var == null ? null : tq0Var.f468203m;
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                        str3 = gp0Var.G;
                    }
                    if (z17) {
                        ((qv.k) ((rv.r2) i95.n0.c(rv.r2.class))).getClass();
                        str = qk.c.b(str3, 4, true);
                    } else {
                        str = str3;
                    }
                    b(imageView, gp0Var, r2Var, str, i17, i18, i19);
                    return;
                }
                if (tq0Var != null) {
                    y60.h hVar = this.f182918b;
                    if (z17) {
                        rv.r2 r2Var2 = (rv.r2) i95.n0.c(rv.r2.class);
                        java.lang.String str4 = tq0Var.f468203m;
                        ((qv.k) r2Var2).getClass();
                        str2 = qk.c.b(str4, 4, true);
                    } else {
                        str2 = tq0Var.f468203m;
                    }
                    ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r4) hVar).a(imageView, null, str2, i17, i18, i19);
                    return;
                }
                return;
            }
            if (i28 != 7 && i28 != 21) {
                if (i28 == 24) {
                    r45.op0 op0Var = r2Var.f67640x5ab01132.P;
                    if (op0Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(op0Var.f463942f) || !((i27 = op0Var.f463944h) == 2 || i27 == 1)) {
                        imageView.setVisibility(8);
                        return;
                    } else {
                        ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r4) this.f182918b).a(imageView, null, op0Var.f463942f, i17, i18, i19);
                        return;
                    }
                }
                if (i28 == 10 || i28 == 11) {
                    r45.aq0 aq0Var = r2Var.f67640x5ab01132.f452513y;
                    if (aq0Var != null) {
                        ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r4) this.f182918b).a(imageView, null, aq0Var.f451725h, i17, i18, i19);
                        return;
                    }
                    return;
                }
                if (i28 == 15) {
                    r45.mq0 mq0Var = r2Var.f67640x5ab01132.C;
                    if (mq0Var != null) {
                        ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r4) this.f182918b).a(imageView, null, mq0Var.f462272h, i17, i18, i19);
                        return;
                    }
                    return;
                }
                if (i28 != 16) {
                    if (i28 != 32) {
                        if (i28 != 33) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavoriteImageServer", "attach thumb, pass type is %d", java.lang.Integer.valueOf(i28));
                            return;
                        }
                    }
                }
            }
            if (gp0Var != null) {
                java.lang.String b17 = b(imageView, gp0Var, r2Var, gp0Var.G, i17, i18, i19);
                r45.hp0 hp0Var = gp0Var.J1;
                if (hp0Var == null || (xs4Var = hp0Var.C) == null) {
                    return;
                }
                xs4Var.set(13, b17);
                return;
            }
            return;
        }
        if (gp0Var != null) {
            b(imageView, gp0Var, r2Var, gp0Var.G, i17, i18, i19);
        }
    }

    public void e(android.widget.ImageView imageView, final r45.gp0 gp0Var, final o72.r2 r2Var, int i17, int i18, int i19) {
        java.lang.String str;
        if (imageView == null) {
            return;
        }
        if (!fp.i.b()) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bkr);
            return;
        }
        if (gp0Var == null || r2Var == null || (str = gp0Var.T) == null) {
            return;
        }
        java.lang.String[] strArr = null;
        if (str != null) {
            java.util.HashMap hashMap = this.f182919c;
            if (hashMap != null && !hashMap.isEmpty()) {
                strArr = (java.lang.String[]) this.f182919c.get(str);
            }
            if (strArr == null) {
                strArr = new java.lang.String[]{o72.x1.x(gp0Var), o72.x1.X(gp0Var)};
                java.util.HashMap hashMap2 = this.f182919c;
                if (hashMap2 != null) {
                    hashMap2.put(str, strArr);
                }
            }
        }
        java.lang.String[] strArr2 = strArr;
        ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r4) this.f182918b).a(imageView, strArr2, null, i17, i18, i19);
        if (strArr2 == null || strArr2.length <= 0) {
            return;
        }
        final java.lang.String str2 = strArr2[0];
        final java.lang.String str3 = strArr2[1];
        ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.fav.ui.ra$$c
            @Override // java.lang.Runnable
            public final void run() {
                java.lang.String str4 = str2;
                boolean k17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra.k(str4);
                o72.r2 r2Var2 = r2Var;
                r45.gp0 gp0Var2 = gp0Var;
                if (k17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteImageServer", "attachVideoImg, needRestartCdnDownload, videoPath:%s", com.p314xaae8f345.mm.vfs.w6.i(str4, false));
                    o72.x1.y0(r2Var2, gp0Var2, false);
                }
                java.lang.String str5 = str3;
                if (!com.p314xaae8f345.mm.vfs.w6.j(str5)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteImageServer", "attachVideoImg, restartCdnThumbDownLoad, thumbPath:%s", com.p314xaae8f345.mm.vfs.w6.i(str5, false));
                    o72.x1.A0(r2Var2, gp0Var2, true);
                }
            }
        }, "FavImageServer");
    }

    public void f() {
        kk.j jVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteImageServer", "destory");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r4 r4Var = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r4) this.f182918b;
        synchronized (r4Var.f273398b) {
            r4Var.f273401e.clear();
            r4Var.f273402f.clear();
            r4Var.f273401e = new java.util.HashMap();
            r4Var.f273402f = new java.util.HashMap();
        }
        this.f182919c.clear();
        this.f182920d.clear();
        ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r4) this.f182918b).b();
        this.f182917a = null;
        this.f182919c = null;
        this.f182920d = null;
        this.f182918b = null;
        if (!ih.a.f(e42.d0.clicfg_fav_destory_recycle_bitmap_v2, true) || (jVar = f182915f) == null) {
            return;
        }
        ((lt0.f) jVar).mo143584x5a5b64d();
    }
}
