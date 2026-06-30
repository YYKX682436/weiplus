package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class qz extends com.tencent.mapsdk.internal.po implements com.tencent.map.lib.callbacks.TileOverlayCallback {

    /* renamed from: b, reason: collision with root package name */
    static final java.lang.String f51127b = "%s" + java.io.File.separatorChar + "%d-%d-%d";

    /* renamed from: d, reason: collision with root package name */
    static final java.lang.String f51128d = "/tile/";

    /* renamed from: u, reason: collision with root package name */
    private static final java.lang.String f51129u = "GLTileOverlay";

    /* renamed from: v, reason: collision with root package name */
    private static final boolean f51130v = false;

    /* renamed from: w, reason: collision with root package name */
    private static final long f51131w = 1024;
    private final com.tencent.mapsdk.internal.mb A;

    /* renamed from: p, reason: collision with root package name */
    public int f51132p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mapsdk.internal.re f51133q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions f51134r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mapsdk.internal.jy<com.tencent.mapsdk.internal.rb> f51135s;

    /* renamed from: t, reason: collision with root package name */
    final int f51136t;

    /* renamed from: x, reason: collision with root package name */
    private final java.util.Map<java.lang.String, java.lang.Integer> f51137x;

    /* renamed from: y, reason: collision with root package name */
    private com.tencent.mapsdk.internal.lw f51138y;

    /* renamed from: z, reason: collision with root package name */
    private java.util.concurrent.BlockingQueue<java.lang.Runnable> f51139z;

    public qz(com.tencent.mapsdk.internal.re reVar, com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions tileOverlayOptions) {
        super((com.tencent.mapsdk.internal.az) reVar.f51155h.f48999b);
        this.f51137x = new java.util.concurrent.ConcurrentHashMap();
        this.A = new com.tencent.mapsdk.internal.mb() { // from class: com.tencent.mapsdk.internal.qz.1
            @Override // com.tencent.mapsdk.internal.mb, com.tencent.mapsdk.internal.lv
            public final void a(java.lang.String str, byte[] bArr) {
                super.a(str, bArr);
                com.tencent.mapsdk.internal.ne neVar = com.tencent.mapsdk.internal.qz.this.f51133q.f51155h;
                if (neVar == null) {
                    return;
                }
                neVar.f50506f.a(str, bArr);
            }

            @Override // com.tencent.mapsdk.internal.mb, com.tencent.mapsdk.internal.lv
            public final void b(java.lang.String str) {
                com.tencent.mapsdk.internal.lw lwVar = com.tencent.mapsdk.internal.qz.this.f51138y;
                if (lwVar != null) {
                    com.tencent.mapsdk.internal.lw.a aVar = lwVar.f50379a.get(str);
                    java.lang.Runnable runnable = aVar != null ? aVar.f50393a : null;
                    if (runnable != null) {
                        com.tencent.mapsdk.internal.qz.this.f51139z.remove(runnable);
                    }
                }
            }
        };
        this.f51136t = reVar.f51155h.K;
        this.f51133q = reVar;
        this.f51134r = tileOverlayOptions;
        int i17 = -1;
        if (tileOverlayOptions == null) {
            this.f51132p = -1;
            return;
        }
        this.f51135s = f();
        boolean isDisplayHD = tileOverlayOptions.isDisplayHD();
        boolean isReuseTile = tileOverlayOptions.isReuseTile();
        int levelOffset = tileOverlayOptions.getLevelOffset();
        if (reVar.f51153f != null) {
            com.tencent.mapsdk.internal.lb.b(com.tencent.mapsdk.internal.kx.f50202c, reVar.f51155h.K);
            com.tencent.mapsdk.internal.tk tkVar = reVar.f51153f;
            i17 = ((java.lang.Integer) tkVar.a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass17>) new com.tencent.mapsdk.internal.tk.AnonymousClass17(this, isDisplayHD, isReuseTile, levelOffset), (com.tencent.mapsdk.internal.tk.AnonymousClass17) (-1))).intValue();
        }
        this.f51132p = i17;
        if (i17 > 0) {
            reVar.a(i17, tileOverlayOptions.getMinDataLevel(), tileOverlayOptions.getMaxDataLevel());
        }
        a(tileOverlayOptions.getZIndex());
    }

    private int h() {
        return this.f51132p;
    }

    private com.tencent.mapsdk.internal.re i() {
        return this.f51133q;
    }

    private com.tencent.tencentmap.mapsdk.maps.model.TileProvider j() {
        return this.f51134r.getTileProvider();
    }

    private com.tencent.mapsdk.internal.rd k() {
        return new com.tencent.mapsdk.internal.rd(this.f51133q);
    }

    private void l() {
        a(true);
    }

    private void m() {
        com.tencent.mapsdk.internal.jy<com.tencent.mapsdk.internal.rb> jyVar = this.f51135s;
        if (jyVar == null) {
            return;
        }
        if (jyVar instanceof com.tencent.mapsdk.internal.kb) {
            com.tencent.mapsdk.internal.jy a17 = ((com.tencent.mapsdk.internal.kb) jyVar).a(0);
            if (a17 instanceof com.tencent.mapsdk.core.utils.cache.MemoryCache) {
                a17.b();
            }
            com.tencent.mapsdk.internal.jy a18 = ((com.tencent.mapsdk.internal.kb) this.f51135s).a(1);
            if (a18 instanceof com.tencent.mapsdk.core.utils.cache.DiskCache) {
                ((com.tencent.mapsdk.core.utils.cache.DiskCache) a18).f();
            }
        } else if (jyVar instanceof com.tencent.mapsdk.core.utils.cache.MemoryCache) {
            jyVar.b();
        }
        this.f51137x.clear();
    }

    public int b(int i17) {
        return i17 + 100;
    }

    public final synchronized com.tencent.mapsdk.internal.lw d() {
        if (this.f51138y == null) {
            com.tencent.mapsdk.internal.lw lwVar = new com.tencent.mapsdk.internal.lw();
            this.f51138y = lwVar;
            lwVar.a(this.A);
            java.util.concurrent.ThreadPoolExecutor c17 = com.tencent.mapsdk.internal.ht.c();
            this.f51139z = c17.getQueue();
            this.f51138y.f50380b = c17;
        }
        return this.f51138y;
    }

    public final void e() {
        com.tencent.mapsdk.internal.jy<com.tencent.mapsdk.internal.rb> jyVar = this.f51135s;
        if (jyVar == null) {
            return;
        }
        jyVar.b();
        this.f51137x.clear();
    }

    public boolean equals(java.lang.Object obj) {
        return obj != null && (obj instanceof com.tencent.mapsdk.internal.qz) && this.f51132p == ((com.tencent.mapsdk.internal.qz) obj).f51132p;
    }

    public final com.tencent.mapsdk.internal.jy<com.tencent.mapsdk.internal.rb> f() {
        com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions tileOverlayOptions;
        if (this.f51133q == null) {
            return null;
        }
        com.tencent.mapsdk.core.utils.cache.MemoryCache.a aVar = new com.tencent.mapsdk.core.utils.cache.MemoryCache.a(this.f51136t);
        aVar.f48743d = false;
        aVar.f48741b = this.f51134r.getMaxMemoryCacheSize(this.f51133q.f51155h);
        aVar.f48742c = new com.tencent.mapsdk.internal.qz.a((byte) 0);
        if (android.text.TextUtils.isEmpty(this.f51133q.f51156i) || (tileOverlayOptions = this.f51134r) == null || android.text.TextUtils.isEmpty(tileOverlayOptions.getDiskCacheDir())) {
            return com.tencent.mapsdk.internal.kc.a(this.f51136t, com.tencent.mapsdk.internal.rb.class, aVar);
        }
        com.tencent.mapsdk.core.utils.cache.DiskCache.c cVar = new com.tencent.mapsdk.core.utils.cache.DiskCache.c(this.f51136t);
        if (!android.text.TextUtils.isEmpty(g())) {
            cVar.c();
        }
        java.lang.String str = g() + this.f51134r.getDiskCacheDir();
        cVar.f48727c = new java.io.File(this.f51133q.f51156i);
        cVar.f48728d = str;
        cVar.f50074k = -1;
        cVar.f50075l = new com.tencent.mapsdk.internal.ra();
        cVar.f48729e = new com.tencent.mapsdk.internal.rc(this.f51133q.f51156i + java.io.File.separator + str);
        return com.tencent.mapsdk.internal.kc.a(this.f51136t, com.tencent.mapsdk.internal.rb.class, aVar, cVar);
    }

    @Override // com.tencent.mapsdk.internal.au
    public final com.tencent.mapsdk.internal.ao f_() {
        return null;
    }

    public java.lang.String g() {
        return f51128d;
    }

    @Override // com.tencent.mapsdk.internal.po
    public final void h_() {
        if (this.f51133q == null || this.f51132p < 0) {
            return;
        }
        m();
        synchronized (this) {
            com.tencent.mapsdk.internal.lw lwVar = this.f51138y;
            if (lwVar != null) {
                lwVar.a();
                this.f51138y = null;
            }
        }
        com.tencent.mapsdk.internal.re reVar = this.f51133q;
        int i17 = this.f51132p;
        if (reVar.f51153f != null) {
            reVar.f51154g.remove(java.lang.Integer.valueOf(i17));
            reVar.f51153f.f(i17);
            com.tencent.mapsdk.internal.lb.c(com.tencent.mapsdk.internal.kx.f50202c, reVar.f51155h.K);
        }
    }

    public int hashCode() {
        return y().hashCode();
    }

    @Override // com.tencent.map.lib.callbacks.TileOverlayCallback
    public android.graphics.Bitmap onLoadTile(int i17, int i18, int i19, byte[] bArr) {
        int i27;
        com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions tileOverlayOptions = this.f51134r;
        if (tileOverlayOptions == null || tileOverlayOptions.getTileProvider() == null) {
            return null;
        }
        java.lang.String format = java.lang.String.format(f51127b, com.tencent.mapsdk.internal.ks.b(this.f51134r.getVersionInfo()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        int e17 = com.tencent.mapsdk.internal.lb.e(com.tencent.mapsdk.internal.kx.f50202c, "load-count", this.f51136t);
        int d17 = com.tencent.mapsdk.internal.lb.d(com.tencent.mapsdk.internal.kx.f50202c, "cache-count", this.f51136t);
        int d18 = com.tencent.mapsdk.internal.lb.d(com.tencent.mapsdk.internal.kx.f50202c, "data-count", this.f51136t);
        int d19 = com.tencent.mapsdk.internal.lb.d(com.tencent.mapsdk.internal.kx.f50202c, "req-count", this.f51136t);
        int d27 = com.tencent.mapsdk.internal.lb.d(com.tencent.mapsdk.internal.kx.f50202c, "cancel-count", this.f51136t);
        com.tencent.mapsdk.internal.rb rbVar = (com.tencent.mapsdk.internal.rb) com.tencent.mapsdk.internal.kc.a(this.f51135s).b(format, com.tencent.mapsdk.internal.rb.class);
        if (rbVar != null) {
            d17 = com.tencent.mapsdk.internal.lb.e(com.tencent.mapsdk.internal.kx.f50202c, "cache-count", this.f51136t);
            i27 = rbVar.f50083e;
            if (e17 == d19 + d18 + d17 + d27) {
                com.tencent.mapsdk.internal.lb.d(com.tencent.mapsdk.internal.kx.f50202c, this.f51136t);
            }
        } else {
            i27 = 0;
        }
        com.tencent.mapsdk.internal.lb.a("get from cache of cacheId:".concat(java.lang.String.valueOf(format)), "dataLength:".concat(java.lang.String.valueOf(i27)), "loadCount:".concat(java.lang.String.valueOf(e17)), "reqCount:".concat(java.lang.String.valueOf(d19)), "dataCount:".concat(java.lang.String.valueOf(d18)), "cacheCount:".concat(java.lang.String.valueOf(d17)), "cancelCount:".concat(java.lang.String.valueOf(d27)));
        if (rbVar != null) {
            this.f51137x.remove(format);
            rbVar.e();
            return rbVar.c();
        }
        java.lang.Integer num = this.f51137x.get(format);
        if (num == null || num.intValue() <= 10) {
            this.f51137x.put(format, java.lang.Integer.valueOf(num == null ? 0 : num.intValue() + 1));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(128);
            sb6.append("tileOverlay://getTile/");
            sb6.append(this.f51132p);
            sb6.append("?x=");
            sb6.append(i17);
            sb6.append("&y=");
            sb6.append(i18);
            sb6.append("&z=");
            sb6.append(i19);
            byte[] bytes = sb6.toString().getBytes();
            java.lang.System.arraycopy(bytes, 0, bArr, 0, bytes.length);
            return null;
        }
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.Integer>> it = this.f51137x.entrySet().iterator();
        int i28 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (it.next().getValue().intValue() > 10) {
                i28++;
            }
            if (i28 > 50) {
                com.tencent.mapsdk.core.utils.log.LogUtil.d("超过50个瓦片请求大于10次，重新加载TileOverlay");
                a(true);
                break;
            }
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(128);
        sb7.append("tileOverlay://getTile/");
        sb7.append(this.f51132p);
        sb7.append("?x=");
        sb7.append(i17);
        sb7.append("&y=");
        sb7.append(i18);
        sb7.append("&z=");
        sb7.append(i19);
        byte[] bytes2 = sb7.toString().getBytes();
        java.lang.System.arraycopy(bytes2, 0, bArr, 0, bytes2.length);
        return null;
    }

    @Override // com.tencent.map.lib.callbacks.TileOverlayCallback
    public void onLoadTileFinish(int i17, int i18, int i19) {
        com.tencent.mapsdk.internal.rb rbVar = (com.tencent.mapsdk.internal.rb) com.tencent.mapsdk.internal.kc.a(this.f51135s).b(java.lang.String.format(f51127b, com.tencent.mapsdk.internal.ks.b(this.f51134r.getVersionInfo()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19)), com.tencent.mapsdk.internal.rb.class);
        if (rbVar != null) {
            rbVar.d();
        }
    }

    @Override // com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Tappable
    public boolean onTap(float f17, float f18) {
        return false;
    }

    @Override // com.tencent.map.lib.callbacks.TileOverlayCallback
    public void onWriteTile(int i17, int i18, int i19, java.lang.String str, byte[] bArr) {
    }

    /* loaded from: classes13.dex */
    public static class a implements com.tencent.mapsdk.internal.jy.b<com.tencent.mapsdk.internal.rb> {
        private a() {
        }

        public /* synthetic */ a(byte b17) {
            this();
        }

        @Override // com.tencent.mapsdk.internal.jy.b
        public final /* synthetic */ boolean a(com.tencent.mapsdk.internal.rb rbVar) {
            com.tencent.mapsdk.internal.rb rbVar2 = rbVar;
            if (rbVar2 == null) {
                return true;
            }
            rbVar2.f();
            return true;
        }

        /* renamed from: a, reason: avoid collision after fix types in other method */
        private static boolean a2(com.tencent.mapsdk.internal.rb rbVar) {
            if (rbVar == null) {
                return true;
            }
            rbVar.f();
            return true;
        }
    }

    public final void a(boolean z17) {
        java.util.concurrent.BlockingQueue<java.lang.Runnable> blockingQueue;
        if (this.f51133q == null || this.f51132p < 0) {
            return;
        }
        m();
        this.f51133q.b(this.f51132p);
        if (z17 && (blockingQueue = this.f51139z) != null) {
            blockingQueue.clear();
        }
    }

    private void b(int i17, int i18) {
        int i19;
        com.tencent.mapsdk.internal.re reVar = this.f51133q;
        if (reVar == null || (i19 = this.f51132p) < 0) {
            return;
        }
        reVar.a(i19, i17, i18);
    }

    public final void a(int i17) {
        if (this.f51133q == null || this.f51132p < 0) {
            return;
        }
        if (i17 < 0) {
            i17 = 0;
        }
        this.f51133q.a(this.f51132p, b(i17));
    }

    public final void a(int i17, int i18) {
        int i19;
        com.tencent.mapsdk.internal.re reVar = this.f51133q;
        if (reVar == null || (i19 = this.f51132p) < 0) {
            return;
        }
        reVar.b(i19, i17, i18);
    }

    private void a(java.lang.String str) {
        if (this.f51134r == null || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.f51134r.diskCacheDir(str);
        this.f51135s = f();
    }

    private byte[] a(int i17, int i18, int i19) {
        com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions tileOverlayOptions = this.f51134r;
        if (tileOverlayOptions != null && tileOverlayOptions.getTileProvider() != null && i19 >= 0) {
            java.lang.String format = java.lang.String.format(f51127b, com.tencent.mapsdk.internal.ks.b(this.f51134r.getVersionInfo()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
            com.tencent.tencentmap.mapsdk.maps.model.Tile tile = this.f51134r.getTileProvider().getTile(i17, i18, i19);
            if (tile != null && tile != com.tencent.tencentmap.mapsdk.maps.model.Tile.EMPTY_TILE) {
                byte[] bArr = tile.mData;
                if (bArr != null && bArr.length > 0) {
                    com.tencent.mapsdk.internal.lb.b(com.tencent.mapsdk.internal.kx.f50202c, "cacheId", (java.lang.Object) format, this.f51136t);
                    a(format, bArr);
                }
                return bArr;
            }
            com.tencent.mapsdk.core.utils.log.LogUtil.d(com.tencent.mapsdk.internal.kx.f50202c, "Provider没有瓦片数据，返回空瓦块");
            byte[] a17 = com.tencent.mapsdk.internal.hl.a();
            a(format, a17);
            return a17;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.d(com.tencent.mapsdk.internal.kx.f50202c, "无效坐标，返回空瓦块");
        return com.tencent.mapsdk.internal.hl.a();
    }

    public final void a(java.lang.String str, byte[] bArr) {
        com.tencent.mapsdk.internal.rb rbVar = new com.tencent.mapsdk.internal.rb(bArr);
        com.tencent.mapsdk.internal.jy<com.tencent.mapsdk.internal.rb> jyVar = this.f51135s;
        if (jyVar != null) {
            com.tencent.mapsdk.internal.kf a17 = com.tencent.mapsdk.internal.kc.a(jyVar);
            if (a17 != null) {
                a17.b(str, (java.lang.String) rbVar);
            } else {
                this.f51135s.a(str, (java.lang.String) rbVar);
            }
        }
    }
}
