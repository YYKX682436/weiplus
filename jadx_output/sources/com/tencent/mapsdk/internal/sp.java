package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class sp {

    /* renamed from: f, reason: collision with root package name */
    private static final int f51512f = 7;

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mapsdk.internal.tr f51513a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mapsdk.internal.so f51514b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.maps.model.OverSeaTileProvider f51515c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f51517e;

    /* renamed from: h, reason: collision with root package name */
    private com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions f51519h;

    /* renamed from: g, reason: collision with root package name */
    private com.tencent.tencentmap.mapsdk.maps.model.TileOverlay f51518g = null;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f51516d = false;

    public sp(com.tencent.mapsdk.internal.tr trVar) {
        this.f51513a = null;
        this.f51513a = trVar;
        if (com.tencent.mapsdk.internal.kk.a("5.10.0", "4.0.9")) {
            com.tencent.mapsdk.internal.kt.c(com.tencent.mapsdk.internal.mz.a(this.f51513a.I(), (com.tencent.tencentmap.mapsdk.maps.TencentMapOptions) null).a() + "/tencentmapsdk/rastermap/unmainland");
            com.tencent.mapsdk.internal.kt.c(com.tencent.mapsdk.internal.mz.a(this.f51513a.I(), (com.tencent.tencentmap.mapsdk.maps.TencentMapOptions) null).b().getPath() + "/rastermap/taiwan");
        }
    }

    private void a(android.content.Context context, com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource overSeaSource) {
        com.tencent.mapsdk.internal.so soVar = new com.tencent.mapsdk.internal.so();
        this.f51514b = soVar;
        if (context != null) {
            soVar.f51502i = overSeaSource;
            com.tencent.mapsdk.internal.ko.a((com.tencent.mapsdk.internal.ko.g) new com.tencent.mapsdk.internal.so.AnonymousClass1(context, overSeaSource)).a((com.tencent.mapsdk.internal.ko.b.a) java.lang.Boolean.FALSE, (com.tencent.mapsdk.internal.ko.a<com.tencent.mapsdk.internal.ko.b.a>) null);
        }
    }

    private boolean c() {
        return this.f51516d;
    }

    private void d() {
        this.f51516d = true;
    }

    private void e() {
        com.tencent.tencentmap.mapsdk.maps.model.TileOverlay tileOverlay = this.f51518g;
        if (tileOverlay == null) {
            return;
        }
        tileOverlay.clearTileCache();
    }

    private void f() {
        if (com.tencent.mapsdk.internal.kk.a("5.10.0", "4.0.9")) {
            com.tencent.mapsdk.internal.kt.c(com.tencent.mapsdk.internal.mz.a(this.f51513a.I(), (com.tencent.tencentmap.mapsdk.maps.TencentMapOptions) null).a() + "/tencentmapsdk/rastermap/unmainland");
            com.tencent.mapsdk.internal.kt.c(com.tencent.mapsdk.internal.mz.a(this.f51513a.I(), (com.tencent.tencentmap.mapsdk.maps.TencentMapOptions) null).b().getPath() + "/rastermap/taiwan");
        }
    }

    private void g() {
        M m17;
        com.tencent.mapsdk.internal.ne neVar;
        com.tencent.mapsdk.internal.tr trVar = this.f51513a;
        com.tencent.tencentmap.mapsdk.maps.model.TileOverlay tileOverlay = this.f51518g;
        if (trVar == null || (m17 = trVar.e_) == 0 || (neVar = trVar.f52273as) == null || tileOverlay == null) {
            return;
        }
        neVar.j(((com.tencent.mapsdk.vector.VectorMap) m17).f52513p);
        neVar.k(true);
        tileOverlay.remove();
        this.f51518g = null;
        this.f51519h = null;
    }

    private void h() {
        com.tencent.mapsdk.internal.tr trVar;
        com.tencent.mapsdk.internal.sx b17;
        if (this.f51518g != null || (trVar = this.f51513a) == null || trVar.e_ == 0 || trVar.f52273as == null || (b17 = this.f51514b.b()) == null) {
            return;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "获取海外图图源：".concat(java.lang.String.valueOf(b17)));
        com.tencent.mapsdk.internal.ne neVar = this.f51513a.f52273as;
        neVar.j(false);
        neVar.k(false);
        this.f51515c = new com.tencent.mapsdk.internal.sq(b17, this.f51514b.f51502i, neVar.f49000c);
        java.lang.String d17 = this.f51514b.d();
        java.lang.String a17 = this.f51514b.a();
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "海外瓦片缓存目录：".concat(java.lang.String.valueOf(a17)));
        com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions dataLevelRange = new com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions().tileProvider(this.f51515c).displayHD(false).levelOffset(0).versionInfo(d17).zIndex(1).diskCacheDir(a17).dataLevelRange(3, 18);
        this.f51519h = dataLevelRange;
        this.f51518g = neVar.H.b(dataLevelRange);
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "开启海外图");
    }

    private com.tencent.mapsdk.internal.so i() {
        return this.f51514b;
    }

    private boolean j() {
        return this.f51514b.f51498e;
    }

    private boolean k() {
        return this.f51518g != null;
    }

    public final void b() {
        M m17;
        C c17;
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "检查海外图状态");
        com.tencent.mapsdk.internal.tr trVar = this.f51513a;
        if (trVar == null || (m17 = trVar.e_) == 0 || (c17 = trVar.d_) == 0) {
            return;
        }
        if (((com.tencent.mapsdk.vector.VectorMap) m17).s() < 7) {
            g();
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "级别无效");
            return;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "级别有效");
        if (!this.f51514b.f51498e || !c17.f49002e) {
            if (this.f51518g != null) {
                g();
            }
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "权限无效");
            return;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "权限有效");
        if (!c17.f49001d) {
            if (this.f51518g != null) {
                g();
            }
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "边界线无效");
            return;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "边界线有效");
        boolean z17 = this.f51514b.f51501h;
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "数据配置模式：".concat(z17 ? "暗色" : "亮色"));
        boolean o17 = ((com.tencent.mapsdk.internal.ne) this.f51513a.d_).o();
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "当前地图模式：".concat(o17 ? "暗色" : "亮色"));
        if (o17 != z17) {
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "更新暗色模式：".concat(java.lang.String.valueOf(o17)));
            this.f51514b.a(o17);
            g();
            com.tencent.tencentmap.mapsdk.maps.model.OverSeaTileProvider overSeaTileProvider = this.f51515c;
            if (overSeaTileProvider != null) {
                overSeaTileProvider.onDayNightChange(z17);
            }
        }
        if (this.f51517e) {
            this.f51517e = false;
            g();
        }
        if (this.f51518g == null) {
            h();
        }
    }

    public final void a() {
        b();
        com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions tileOverlayOptions = this.f51519h;
        if (tileOverlayOptions != null) {
            tileOverlayOptions.versionInfo(this.f51514b.d()).diskCacheDir(this.f51514b.a());
        }
        com.tencent.tencentmap.mapsdk.maps.model.TileOverlay tileOverlay = this.f51518g;
        if (tileOverlay != null) {
            tileOverlay.reload();
        }
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.model.Language language) {
        if (language == null) {
            return;
        }
        com.tencent.mapsdk.internal.so soVar = this.f51514b;
        if (soVar.f51503j != language) {
            soVar.f51503j = language;
            com.tencent.tencentmap.mapsdk.maps.model.OverSeaTileProvider overSeaTileProvider = this.f51515c;
            if (overSeaTileProvider != null) {
                overSeaTileProvider.onLanguageChange(language);
            }
            a();
        }
    }

    private boolean a(com.tencent.mapsdk.internal.gc[] gcVarArr) {
        com.tencent.mapsdk.internal.tr trVar = this.f51513a;
        if (trVar == null) {
            return true;
        }
        com.tencent.mapsdk.internal.gc[] ah6 = trVar.ah();
        if (gcVarArr == null) {
            return true;
        }
        return com.tencent.mapsdk.internal.sm.a(ah6, gcVarArr);
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.model.OverSeaTileProvider overSeaTileProvider) {
        if (this.f51515c != overSeaTileProvider) {
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "设置自定义海外图源，old[" + this.f51515c + "] to new[" + overSeaTileProvider + "]");
            this.f51515c = overSeaTileProvider;
            this.f51517e = true;
            com.tencent.mapsdk.internal.so soVar = this.f51514b;
            soVar.f51504k = overSeaTileProvider;
            java.util.List<com.tencent.mapsdk.internal.ss> c17 = soVar.c();
            com.tencent.mapsdk.internal.tr trVar = this.f51513a;
            if (trVar != null) {
                trVar.a(false, c17);
            }
            a();
        }
    }
}
