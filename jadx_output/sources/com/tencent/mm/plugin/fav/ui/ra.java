package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class ra {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f101381e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final kk.j f101382f = new jt0.i(10, com.tencent.mm.plugin.fav.ui.ra.class);

    /* renamed from: g, reason: collision with root package name */
    public static final kk.j f101383g = new jt0.i(20, com.tencent.mm.plugin.fav.ui.ra.class);

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f101384a;

    /* renamed from: b, reason: collision with root package name */
    public y60.h f101385b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.HashMap f101386c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public java.util.HashMap f101387d = new java.util.HashMap();

    public ra(android.content.Context context, int i17) {
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MMTrimMemoryEvent>(this) { // from class: com.tencent.mm.plugin.fav.ui.FavoriteImageServer$MMTrimMemoryEventListener

            /* renamed from: d, reason: collision with root package name */
            public final java.lang.ref.WeakReference f100435d;

            {
                super(com.tencent.mm.app.a0.f53288d);
                this.f100435d = new java.lang.ref.WeakReference(this);
                this.__eventId = 708811463;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MMTrimMemoryEvent mMTrimMemoryEvent) {
                com.tencent.mm.plugin.fav.ui.ra raVar = (com.tencent.mm.plugin.fav.ui.ra) this.f100435d.get();
                if (raVar == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteImageServer", "received MMTrimMemoryEvent: FavoriteImageServer was gone");
                    dead();
                } else if (ih.a.f(e42.d0.clicfg_matrix_trim_memory_favoriteimageserver_v2, false)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FavoriteImageServer", "received MMTrimMemoryEvent: FavoriteImageServer");
                    java.util.HashMap hashMap = raVar.f101386c;
                    if (hashMap != null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.FavoriteImageServer", "received MMTrimMemoryEvent: clear [attachImgPathCache][%s]", java.lang.Integer.valueOf(hashMap.size()));
                        raVar.f101386c.clear();
                    }
                    java.util.HashMap hashMap2 = raVar.f101387d;
                    if (hashMap2 != null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.FavoriteImageServer", "received MMTrimMemoryEvent: clear [attachThumbPathCache][%s]", java.lang.Integer.valueOf(hashMap2.size()));
                        raVar.f101387d.clear();
                    }
                }
                return false;
            }
        }.alive();
        this.f101384a = context;
        y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
        i17 = i17 <= 0 ? 24 : i17;
        com.tencent.mm.plugin.fav.ui.sa saVar = new com.tencent.mm.plugin.fav.ui.sa(this);
        ((x60.e) fVar).getClass();
        this.f101385b = new com.tencent.mm.pluginsdk.ui.tools.r4(i17, saVar);
    }

    public static void d(final android.widget.ImageView imageView, int i17, final r45.gp0 gp0Var, final o72.r2 r2Var, final boolean z17, final int i18, final int i19) {
        java.lang.String str = gp0Var.T;
        if (str == null) {
            imageView.setImageResource(i17);
            com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteImageServer", "dataId is null favId:%s localId:%s", java.lang.Integer.valueOf(r2Var.field_id), java.lang.Long.valueOf(r2Var.field_localId));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteImageServer", "attachTopThumb dataId:%s, hashCode:%s, width:%s, height:%s, viewWidth:%s, viewHeight:%s", str, java.lang.Integer.valueOf(imageView.hashCode()), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(imageView.getWidth()), java.lang.Integer.valueOf(imageView.getHeight()));
        java.lang.String x17 = o72.x1.x(gp0Var);
        android.graphics.Bitmap j17 = (!com.tencent.mm.vfs.w6.j(x17) || com.tencent.mm.sdk.platformtools.y1.g(x17)) ? null : j(x17, i18, i19, true);
        final java.lang.String X = o72.x1.X(gp0Var);
        if ((j17 == null || j17.isRecycled()) && com.tencent.mm.vfs.w6.j(X)) {
            j17 = j(X, i18, i19, true);
        }
        if (j17 != null && !j17.isRecycled()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteImageServer", "attachTopThumb 1, bm width:%s, height:%s", java.lang.Integer.valueOf(j17.getWidth()), java.lang.Integer.valueOf(j17.getHeight()));
            imageView.setImageBitmap(j17);
        } else {
            imageView.setImageResource(i17);
            imageView.setTag(X);
            ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.fav.ui.ra$$b
                @Override // java.lang.Runnable
                public final void run() {
                    java.lang.String str2 = X;
                    int i27 = i18;
                    int i28 = i19;
                    boolean z18 = z17;
                    o72.r2 r2Var2 = r2Var;
                    r45.gp0 gp0Var2 = gp0Var;
                    final android.widget.ImageView imageView2 = imageView;
                    final android.graphics.Bitmap j18 = com.tencent.mm.plugin.fav.ui.ra.j(str2, i27, i28, false);
                    if (j18 == null) {
                        if (z18 || com.tencent.mm.plugin.fav.ui.ra.k(str2)) {
                            o72.x1.A0(r2Var2, gp0Var2, true);
                            return;
                        }
                        return;
                    }
                    java.lang.String str3 = (java.lang.String) imageView2.getTag();
                    if (str3 == null || !str3.equals(str2)) {
                        return;
                    }
                    ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.fav.ui.ra$$h
                        @Override // java.lang.Runnable
                        public final void run() {
                            android.graphics.Bitmap bitmap = j18;
                            com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteImageServer", "attachTopThumb 2, bm width:%s, height:%s", java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()));
                            imageView2.setImageBitmap(bitmap);
                        }
                    });
                }
            }, "FavImageServer");
        }
    }

    public static android.graphics.Bitmap g(final r45.gp0 gp0Var, final o72.r2 r2Var, final boolean z17) {
        if (!fp.i.b()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavoriteImageServer", "[getBigImg] sdcardAvail = false, bigImg return nosdcard_chatting_bg");
            android.content.res.Resources resources = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.bkr));
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
            com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteImageServer", "get big img of dataId = " + str + " , is wxam = " + com.tencent.mm.sdk.platformtools.y1.g(o72.x1.x(gp0Var)));
        }
        if (h17 == null) {
            final java.lang.String x17 = o72.x1.x(gp0Var);
            ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.fav.ui.ra$$d
                @Override // java.lang.Runnable
                public final void run() {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("forceDownload = ");
                    boolean z18 = z17;
                    sb6.append(z18);
                    sb6.append(", needRestartCdnDownload = ");
                    java.lang.String str2 = x17;
                    sb6.append(com.tencent.mm.plugin.fav.ui.ra.k(str2));
                    com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteImageServer", sb6.toString());
                    if (z18 || com.tencent.mm.plugin.fav.ui.ra.k(str2)) {
                        o72.x1.y0(r2Var, gp0Var, z18);
                    }
                }
            }, "FavImageServer");
        }
        return h17;
    }

    public static android.graphics.Bitmap h(r45.gp0 gp0Var, boolean z17, boolean z18) {
        java.lang.String X = z17 ? o72.x1.X(gp0Var) : o72.x1.x(gp0Var);
        if (com.tencent.mm.vfs.w6.j(X)) {
            return com.tencent.mm.plugin.fav.ui.u1.c(X, com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT, com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT, z18);
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteImageServer", "getBitmap file not exist %s", X);
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
                ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.fav.ui.ra$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (com.tencent.mm.plugin.fav.ui.ra.k(X)) {
                            o72.x1.A0(r2Var, gp0Var, true);
                        }
                    }
                }, "FavImageServer");
            }
            return h17;
        }
        android.content.res.Resources resources = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.bkr));
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.fav.ui.ra.j(java.lang.String, int, int, boolean):android.graphics.Bitmap");
    }

    public static boolean k(java.lang.String str) {
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!m17.a() ? false : m17.f213266a.F(m17.f213267b)) {
            return false;
        }
        java.util.Map map = f101381e;
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
            imageView.setImageResource(com.tencent.mm.R.drawable.bkr);
            return;
        }
        if (r2Var == null || gp0Var == null) {
            imageView.setImageDrawable(i65.a.i(this.f101384a, i17));
            return;
        }
        int i27 = gp0Var.I;
        if (i27 != 4) {
            if (i27 == 5) {
                r45.hp0 hp0Var = gp0Var.J1;
                boolean z17 = false;
                if (hp0Var != null) {
                    tq0Var = hp0Var.f376355f;
                    r45.qp0 qp0Var = hp0Var.f376369w;
                    if (qp0Var != null && qp0Var.f384162d == 5) {
                        z17 = true;
                    }
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteImageServer", "webpage: get data proto item null, dataid[%s], infoid[%d, %d]", gp0Var.T, java.lang.Long.valueOf(r2Var.field_localId), java.lang.Integer.valueOf(r2Var.field_id));
                    tq0Var = null;
                }
                java.lang.String str2 = tq0Var != null ? tq0Var.f386670m : null;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
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
                        com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteImageServer", "app brand: get data proto item null, dataid[%s], infoid[%d, %d]", gp0Var.T, java.lang.Long.valueOf(r2Var.field_localId), java.lang.Integer.valueOf(r2Var.field_id));
                        return;
                    }
                    r45.dp0 dp0Var = hp0Var2.f376368v;
                    if (dp0Var != null) {
                        ((com.tencent.mm.pluginsdk.ui.tools.r4) this.f101385b).a(imageView, null, dp0Var.f372637g, i17, i18, i19);
                        return;
                    }
                    return;
                }
                if (i27 == 22) {
                    r45.hp0 hp0Var3 = gp0Var.J1;
                    if (hp0Var3 == null || (kv2Var = hp0Var3.f376371y) == null || com.tencent.mm.sdk.platformtools.t8.L0(kv2Var.getList(7)) || com.tencent.mm.sdk.platformtools.t8.K0(((r45.iv2) gp0Var.J1.f376371y.getList(7).getFirst()).getString(2))) {
                        imageView.setImageDrawable(com.tencent.mm.ui.uk.e(imageView.getContext(), com.tencent.mm.R.raw.icons_outlined_finder_icon, imageView.getContext().getResources().getColor(com.tencent.mm.R.color.f478526a7)));
                        return;
                    } else {
                        ((com.tencent.mm.pluginsdk.ui.tools.r4) this.f101385b).a(imageView, null, ((r45.iv2) gp0Var.J1.f376371y.getList(7).getFirst()).getString(2), i17, i18, i19);
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
                            com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteImageServer", "good: get data proto item null, dataid[%s], infoid[%d, %d]", gp0Var.T, java.lang.Long.valueOf(r2Var.field_localId), java.lang.Integer.valueOf(r2Var.field_id));
                            return;
                        }
                        r45.aq0 aq0Var = hp0Var4.f376356g;
                        if (aq0Var != null) {
                            ((com.tencent.mm.pluginsdk.ui.tools.r4) this.f101385b).a(imageView, null, aq0Var.f370192h, i17, i18, i19);
                            return;
                        }
                        return;
                    }
                    if (i27 == 11) {
                        r45.hp0 hp0Var5 = gp0Var.J1;
                        if (hp0Var5 == null) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteImageServer", "product: get data proto item null, dataid[%s], infoid[%d, %d]", gp0Var.T, java.lang.Long.valueOf(r2Var.field_localId), java.lang.Integer.valueOf(r2Var.field_id));
                            return;
                        }
                        r45.aq0 aq0Var2 = hp0Var5.f376356g;
                        if (aq0Var2 != null) {
                            ((com.tencent.mm.pluginsdk.ui.tools.r4) this.f101385b).a(imageView, null, aq0Var2.f370192h, i17, i18, i19);
                            return;
                        }
                        return;
                    }
                    if (i27 == 14) {
                        r45.hp0 hp0Var6 = gp0Var.J1;
                        if (hp0Var6 == null) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteImageServer", "tv: get data proto item null, dataid[%s], infoid[%d, %d]", gp0Var.T, java.lang.Long.valueOf(r2Var.field_localId), java.lang.Integer.valueOf(r2Var.field_id));
                            return;
                        }
                        r45.mq0 mq0Var = hp0Var6.f376357h;
                        if (mq0Var != null) {
                            ((com.tencent.mm.pluginsdk.ui.tools.r4) this.f101385b).a(imageView, null, mq0Var.f380739h, i17, i18, i19);
                            return;
                        }
                        return;
                    }
                    if (i27 != 15) {
                        if (i27 != 32 && i27 != 33) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteImageServer", "attach thumb, pass type is %d", java.lang.Integer.valueOf(r2Var.field_type));
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
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteImageServer", "attachThumb hashCode:%s, width:%s, height:%s, viewWidth:%s, viewHeight:%s url:%s", java.lang.Integer.valueOf(imageView.hashCode()), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(imageView.getWidth()), java.lang.Integer.valueOf(imageView.getHeight()), str);
        java.lang.String W = o72.x1.W(gp0Var.T);
        if (gp0Var.T != null) {
            strArr = (java.lang.String[]) this.f101387d.get(W);
            if (strArr == null) {
                strArr = new java.lang.String[]{o72.x1.X(gp0Var)};
                this.f101387d.put(W, strArr);
            }
        } else {
            strArr = null;
        }
        ((com.tencent.mm.pluginsdk.ui.tools.r4) this.f101385b).a(imageView, strArr, str, i17, i18, i19);
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        final java.lang.String str2 = strArr[0];
        ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.fav.ui.ra$$g
            @Override // java.lang.Runnable
            public final void run() {
                if (com.tencent.mm.plugin.fav.ui.ra.k(str2)) {
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
            imageView.setImageResource(com.tencent.mm.R.drawable.bkr);
            return;
        }
        if (r2Var == null) {
            return;
        }
        if (r2Var.field_favProto == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavoriteImageServer", "attachThumb: failed favProto error");
            return;
        }
        boolean z17 = false;
        imageView.setVisibility(0);
        int i28 = r2Var.field_type;
        if (i28 != 4) {
            if (i28 == 5) {
                r45.bq0 bq0Var = r2Var.field_favProto;
                r45.qp0 qp0Var = bq0Var.K;
                if (qp0Var != null && qp0Var.f384162d == 5) {
                    z17 = true;
                }
                r45.tq0 tq0Var = bq0Var.f370968m;
                if (gp0Var != null) {
                    java.lang.String str3 = tq0Var == null ? null : tq0Var.f386670m;
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
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
                    y60.h hVar = this.f101385b;
                    if (z17) {
                        rv.r2 r2Var2 = (rv.r2) i95.n0.c(rv.r2.class);
                        java.lang.String str4 = tq0Var.f386670m;
                        ((qv.k) r2Var2).getClass();
                        str2 = qk.c.b(str4, 4, true);
                    } else {
                        str2 = tq0Var.f386670m;
                    }
                    ((com.tencent.mm.pluginsdk.ui.tools.r4) hVar).a(imageView, null, str2, i17, i18, i19);
                    return;
                }
                return;
            }
            if (i28 != 7 && i28 != 21) {
                if (i28 == 24) {
                    r45.op0 op0Var = r2Var.field_favProto.P;
                    if (op0Var == null || com.tencent.mm.sdk.platformtools.t8.K0(op0Var.f382409f) || !((i27 = op0Var.f382411h) == 2 || i27 == 1)) {
                        imageView.setVisibility(8);
                        return;
                    } else {
                        ((com.tencent.mm.pluginsdk.ui.tools.r4) this.f101385b).a(imageView, null, op0Var.f382409f, i17, i18, i19);
                        return;
                    }
                }
                if (i28 == 10 || i28 == 11) {
                    r45.aq0 aq0Var = r2Var.field_favProto.f370980y;
                    if (aq0Var != null) {
                        ((com.tencent.mm.pluginsdk.ui.tools.r4) this.f101385b).a(imageView, null, aq0Var.f370192h, i17, i18, i19);
                        return;
                    }
                    return;
                }
                if (i28 == 15) {
                    r45.mq0 mq0Var = r2Var.field_favProto.C;
                    if (mq0Var != null) {
                        ((com.tencent.mm.pluginsdk.ui.tools.r4) this.f101385b).a(imageView, null, mq0Var.f380739h, i17, i18, i19);
                        return;
                    }
                    return;
                }
                if (i28 != 16) {
                    if (i28 != 32) {
                        if (i28 != 33) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteImageServer", "attach thumb, pass type is %d", java.lang.Integer.valueOf(i28));
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
            imageView.setImageResource(com.tencent.mm.R.drawable.bkr);
            return;
        }
        if (gp0Var == null || r2Var == null || (str = gp0Var.T) == null) {
            return;
        }
        java.lang.String[] strArr = null;
        if (str != null) {
            java.util.HashMap hashMap = this.f101386c;
            if (hashMap != null && !hashMap.isEmpty()) {
                strArr = (java.lang.String[]) this.f101386c.get(str);
            }
            if (strArr == null) {
                strArr = new java.lang.String[]{o72.x1.x(gp0Var), o72.x1.X(gp0Var)};
                java.util.HashMap hashMap2 = this.f101386c;
                if (hashMap2 != null) {
                    hashMap2.put(str, strArr);
                }
            }
        }
        java.lang.String[] strArr2 = strArr;
        ((com.tencent.mm.pluginsdk.ui.tools.r4) this.f101385b).a(imageView, strArr2, null, i17, i18, i19);
        if (strArr2 == null || strArr2.length <= 0) {
            return;
        }
        final java.lang.String str2 = strArr2[0];
        final java.lang.String str3 = strArr2[1];
        ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.fav.ui.ra$$c
            @Override // java.lang.Runnable
            public final void run() {
                java.lang.String str4 = str2;
                boolean k17 = com.tencent.mm.plugin.fav.ui.ra.k(str4);
                o72.r2 r2Var2 = r2Var;
                r45.gp0 gp0Var2 = gp0Var;
                if (k17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteImageServer", "attachVideoImg, needRestartCdnDownload, videoPath:%s", com.tencent.mm.vfs.w6.i(str4, false));
                    o72.x1.y0(r2Var2, gp0Var2, false);
                }
                java.lang.String str5 = str3;
                if (!com.tencent.mm.vfs.w6.j(str5)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteImageServer", "attachVideoImg, restartCdnThumbDownLoad, thumbPath:%s", com.tencent.mm.vfs.w6.i(str5, false));
                    o72.x1.A0(r2Var2, gp0Var2, true);
                }
            }
        }, "FavImageServer");
    }

    public void f() {
        kk.j jVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteImageServer", "destory");
        com.tencent.mm.pluginsdk.ui.tools.r4 r4Var = (com.tencent.mm.pluginsdk.ui.tools.r4) this.f101385b;
        synchronized (r4Var.f191865b) {
            r4Var.f191868e.clear();
            r4Var.f191869f.clear();
            r4Var.f191868e = new java.util.HashMap();
            r4Var.f191869f = new java.util.HashMap();
        }
        this.f101386c.clear();
        this.f101387d.clear();
        ((com.tencent.mm.pluginsdk.ui.tools.r4) this.f101385b).b();
        this.f101384a = null;
        this.f101386c = null;
        this.f101387d = null;
        this.f101385b = null;
        if (!ih.a.f(e42.d0.clicfg_fav_destory_recycle_bitmap_v2, true) || (jVar = f101382f) == null) {
            return;
        }
        ((lt0.f) jVar).clear();
    }
}
