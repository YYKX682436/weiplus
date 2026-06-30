package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class re {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f51145a = "tileOverlay";

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f51146b = "getTile";

    /* renamed from: c, reason: collision with root package name */
    public static final int f51147c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f51148d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f51149e = 100;

    /* renamed from: j, reason: collision with root package name */
    private static final java.lang.String f51150j = "x";

    /* renamed from: k, reason: collision with root package name */
    private static final java.lang.String f51151k = "y";

    /* renamed from: l, reason: collision with root package name */
    private static final java.lang.String f51152l = "z";

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mapsdk.internal.tk f51153f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map<java.lang.Integer, com.tencent.mapsdk.internal.qz> f51154g = new java.util.Hashtable(4);

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mapsdk.internal.ne f51155h;

    /* renamed from: i, reason: collision with root package name */
    final java.lang.String f51156i;

    /* renamed from: m, reason: collision with root package name */
    private com.tencent.mapsdk.internal.rg f51157m;

    /* renamed from: n, reason: collision with root package name */
    private final android.content.Context f51158n;

    public re(android.content.Context context, com.tencent.mapsdk.internal.ne neVar) {
        this.f51158n = context;
        this.f51155h = neVar;
        this.f51153f = neVar.f50506f;
        this.f51156i = com.tencent.mapsdk.internal.mz.a(context, (com.tencent.tencentmap.mapsdk.maps.TencentMapOptions) null).b().getPath();
    }

    private com.tencent.mapsdk.internal.ne b() {
        return this.f51155h;
    }

    private boolean c() {
        return this.f51153f.v();
    }

    private void d() {
        java.util.Map<java.lang.Integer, com.tencent.mapsdk.internal.qz> map = this.f51154g;
        if (map == null || map.isEmpty()) {
            return;
        }
        for (com.tencent.mapsdk.internal.qz qzVar : (com.tencent.mapsdk.internal.qz[]) this.f51154g.values().toArray(new com.tencent.mapsdk.internal.qz[this.f51154g.keySet().size()])) {
            qzVar.remove();
        }
    }

    public final com.tencent.mapsdk.internal.qz a(int i17) {
        if (i17 >= 0) {
            return this.f51154g.get(java.lang.Integer.valueOf(i17));
        }
        return null;
    }

    private android.content.Context a() {
        return this.f51158n;
    }

    private void c(int i17) {
        if (this.f51153f == null) {
            return;
        }
        this.f51154g.remove(java.lang.Integer.valueOf(i17));
        this.f51153f.f(i17);
        com.tencent.mapsdk.internal.lb.c(com.tencent.mapsdk.internal.kx.f50202c, this.f51155h.K);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
    
        if ((r1 instanceof com.tencent.mapsdk.internal.sq) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.tencentmap.mapsdk.maps.model.TileOverlay b(com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions r5) {
        /*
            r4 = this;
            com.tencent.mapsdk.internal.qz r0 = r4.a(r5)
            if (r5 == 0) goto L17
            com.tencent.tencentmap.mapsdk.maps.model.TileProvider r1 = r5.getTileProvider()
            if (r1 == 0) goto L17
            boolean r2 = r1 instanceof com.tencent.mapsdk.internal.ro
            r3 = 0
            if (r2 == 0) goto L12
            goto L18
        L12:
            boolean r1 = r1 instanceof com.tencent.mapsdk.internal.sq
            if (r1 == 0) goto L17
            goto L18
        L17:
            r3 = 1
        L18:
            if (r3 == 0) goto L29
            if (r0 == 0) goto L29
            if (r5 == 0) goto L29
            int r1 = r5.getMinVisibleLevel()
            int r5 = r5.getMaxVisibleLevel()
            r0.a(r1, r5)
        L29:
            com.tencent.mapsdk.internal.ne r5 = r4.f51155h
            int r5 = r5.K
            java.lang.String r1 = "TTO"
            com.tencent.mapsdk.internal.lb.a(r1, r5)
            com.tencent.mapsdk.internal.ay r5 = new com.tencent.mapsdk.internal.ay
            r5.<init>(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.re.b(com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions):com.tencent.tencentmap.mapsdk.maps.model.TileOverlay");
    }

    public final void a(com.tencent.mapsdk.internal.qz qzVar) {
        int i17;
        if (qzVar == null || (i17 = qzVar.f51132p) <= 0) {
            return;
        }
        this.f51154g.put(java.lang.Integer.valueOf(i17), qzVar);
    }

    public final com.tencent.mapsdk.internal.qz a(com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions tileOverlayOptions) {
        if (this.f51157m == null) {
            this.f51157m = new com.tencent.mapsdk.internal.rg(this);
        }
        return this.f51157m.a(tileOverlayOptions);
    }

    private void a(boolean z17) {
        this.f51153f.j(z17);
    }

    private int a(com.tencent.map.lib.callbacks.TileOverlayCallback tileOverlayCallback, boolean z17, boolean z18, int i17) {
        if (this.f51153f == null) {
            return -1;
        }
        com.tencent.mapsdk.internal.lb.b(com.tencent.mapsdk.internal.kx.f50202c, this.f51155h.K);
        com.tencent.mapsdk.internal.tk tkVar = this.f51153f;
        return ((java.lang.Integer) tkVar.a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass17>) new com.tencent.mapsdk.internal.tk.AnonymousClass17(tileOverlayCallback, z17, z18, i17), (com.tencent.mapsdk.internal.tk.AnonymousClass17) (-1))).intValue();
    }

    public final void b(int i17, int i18, int i19) {
        com.tencent.mapsdk.internal.tk tkVar = this.f51153f;
        if (tkVar == null) {
            return;
        }
        tkVar.b(i17, i18, i19);
    }

    public final void b(int i17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f51153f;
        if (tkVar == null) {
            return;
        }
        tkVar.g(i17);
    }

    public final void a(int i17, int i18) {
        com.tencent.mapsdk.internal.tk tkVar = this.f51153f;
        if (tkVar == null) {
            return;
        }
        tkVar.b(i17, i18);
    }

    public final void a(int i17, int i18, int i19) {
        com.tencent.mapsdk.internal.tk tkVar = this.f51153f;
        if (tkVar == null) {
            return;
        }
        tkVar.a(i17, i18, i19);
    }

    public final byte[] a(java.lang.String str) {
        int a17;
        com.tencent.mapsdk.internal.qz qzVar;
        try {
            android.net.Uri parse = android.net.Uri.parse(str);
            if (!com.tencent.mapsdk.internal.hr.a(parse.getAuthority(), f51146b) || (a17 = a(parse)) == -1 || (qzVar = this.f51154g.get(java.lang.Integer.valueOf(a17))) == null) {
                return null;
            }
            int a18 = a(parse, f51150j);
            int a19 = a(parse, f51151k);
            int a27 = a(parse, f51152l);
            com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions tileOverlayOptions = qzVar.f51134r;
            if (tileOverlayOptions != null && tileOverlayOptions.getTileProvider() != null && a27 >= 0) {
                java.lang.String format = java.lang.String.format(com.tencent.mapsdk.internal.qz.f51127b, com.tencent.mapsdk.internal.ks.b(qzVar.f51134r.getVersionInfo()), java.lang.Integer.valueOf(a18), java.lang.Integer.valueOf(a19), java.lang.Integer.valueOf(a27));
                com.tencent.tencentmap.mapsdk.maps.model.Tile tile = qzVar.f51134r.getTileProvider().getTile(a18, a19, a27);
                if (tile != null && tile != com.tencent.tencentmap.mapsdk.maps.model.Tile.EMPTY_TILE) {
                    byte[] bArr = tile.mData;
                    if (bArr != null && bArr.length > 0) {
                        com.tencent.mapsdk.internal.lb.b(com.tencent.mapsdk.internal.kx.f50202c, "cacheId", (java.lang.Object) format, qzVar.f51136t);
                        qzVar.a(format, bArr);
                    }
                    return bArr;
                }
                com.tencent.mapsdk.core.utils.log.LogUtil.d(com.tencent.mapsdk.internal.kx.f50202c, "Provider没有瓦片数据，返回空瓦块");
                byte[] a28 = com.tencent.mapsdk.internal.hl.a();
                qzVar.a(format, a28);
                return a28;
            }
            com.tencent.mapsdk.core.utils.log.LogUtil.d(com.tencent.mapsdk.internal.kx.f50202c, "无效坐标，返回空瓦块");
            return com.tencent.mapsdk.internal.hl.a();
        } catch (java.lang.Exception e17) {
            com.tencent.mapsdk.core.utils.log.LogUtil.d(android.util.Log.getStackTraceString(e17));
            return null;
        }
    }

    private static int a(android.net.Uri uri) {
        java.lang.String lastPathSegment;
        if (uri == null || (lastPathSegment = uri.getLastPathSegment()) == null) {
            return -1;
        }
        try {
            return java.lang.Integer.parseInt(lastPathSegment);
        } catch (java.lang.NumberFormatException e17) {
            com.tencent.mapsdk.core.utils.log.LogUtil.d(android.util.Log.getStackTraceString(e17));
            return -1;
        }
    }

    private static int a(android.net.Uri uri, java.lang.String str) {
        if (uri == null) {
            return -1;
        }
        try {
            return java.lang.Integer.parseInt(uri.getQueryParameter(str));
        } catch (java.lang.NumberFormatException e17) {
            com.tencent.mapsdk.core.utils.log.LogUtil.d(android.util.Log.getStackTraceString(e17));
            return -1;
        }
    }

    private static void a(android.content.Context context) {
        java.io.File[] listFiles;
        if (context == null) {
            return;
        }
        java.io.File file = new java.io.File(com.tencent.mapsdk.internal.mz.a(context, (com.tencent.tencentmap.mapsdk.maps.TencentMapOptions) null).b().getPath() + "/tile/");
        if (!file.exists() || (listFiles = file.listFiles()) == null || listFiles.length == 0) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        for (java.io.File file2 : listFiles) {
            if (currentTimeMillis - file2.lastModified() > java.util.concurrent.TimeUnit.DAYS.toMillis(7L)) {
                com.tencent.mapsdk.internal.ks.b(file2);
            }
        }
    }
}
