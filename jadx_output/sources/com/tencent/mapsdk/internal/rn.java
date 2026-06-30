package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class rn implements com.tencent.mapsdk.internal.rp.a, com.tencent.mapsdk.internal.v.a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f51236a = "rastermap/handdraw";

    /* renamed from: c, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.tr f51238c;

    /* renamed from: e, reason: collision with root package name */
    private com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions f51240e;

    /* renamed from: b, reason: collision with root package name */
    private final java.lang.Object f51237b = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    private com.tencent.tencentmap.mapsdk.maps.model.TileOverlay f51239d = null;

    /* renamed from: f, reason: collision with root package name */
    private boolean f51241f = false;

    public rn(com.tencent.mapsdk.internal.tr trVar) {
        this.f51238c = trVar;
        if (trVar != null) {
            com.tencent.mapsdk.internal.rm.a(trVar.I());
            com.tencent.mapsdk.internal.rp rpVar = new com.tencent.mapsdk.internal.rp(trVar.I(), this);
            new com.tencent.mapsdk.internal.rp.b(rpVar, (byte) 0).execute(rpVar.f51246a);
            trVar.f52273as.f50520t.a(this);
        }
    }

    private void g() {
        com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions tileOverlayOptions = this.f51240e;
        if (tileOverlayOptions != null) {
            com.tencent.mapsdk.internal.ro roVar = (com.tencent.mapsdk.internal.ro) tileOverlayOptions.getTileProvider();
            com.tencent.mapsdk.internal.ro.f51242a = com.tencent.mapsdk.internal.rm.a();
            com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions tileOverlayOptions2 = roVar.f51244b;
            if (tileOverlayOptions2 != null) {
                tileOverlayOptions2.versionInfo(com.tencent.mapsdk.internal.ro.a());
            }
        }
        synchronized (this.f51237b) {
            com.tencent.tencentmap.mapsdk.maps.model.TileOverlay tileOverlay = this.f51239d;
            if (tileOverlay != null) {
                tileOverlay.clearTileCache();
                this.f51239d.reload();
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.v.a
    public final boolean a(float f17, float f18) {
        if (this.f51241f) {
            int i17 = this.f51238c.f52273as.N()[0];
            if (f18 <= com.tencent.mapsdk.internal.v.b.a(i17)) {
                this.f51241f = false;
                this.f51238c.f52273as.d(i17);
            }
            if (f17 > f18) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.v.a
    public final boolean b() {
        int i17 = this.f51238c.f52273as.N()[0];
        com.tencent.mapsdk.internal.ne neVar = this.f51238c.f52273as;
        if (neVar.f50520t.f52409b.f52444m < i17 && this.f51241f) {
            this.f51241f = false;
            neVar.d(i17);
        }
        return false;
    }

    public final void c() {
        com.tencent.mapsdk.internal.tr trVar;
        if (this.f51239d != null || (trVar = this.f51238c) == null || trVar.f52273as == null) {
            return;
        }
        if (this.f51240e == null) {
            com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions tileOverlayOptions = new com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions();
            this.f51240e = tileOverlayOptions;
            this.f51240e.tileProvider(new com.tencent.mapsdk.internal.ro(tileOverlayOptions)).diskCacheDir(f51236a).reuseTile(true).zIndex(2).dataLevelRange(3, 19);
        }
        this.f51239d = this.f51238c.f52273as.H.b(this.f51240e);
        int i17 = this.f51238c.f52273as.N()[0];
        com.tencent.mapsdk.internal.tr trVar2 = this.f51238c;
        if (trVar2.f52273as.f50520t.f52409b.f52444m >= i17) {
            this.f51241f = true;
        } else {
            ((com.tencent.mapsdk.internal.ne) trVar2.d_).d(i17);
        }
    }

    public final void d() {
        synchronized (this.f51237b) {
            com.tencent.tencentmap.mapsdk.maps.model.TileOverlay tileOverlay = this.f51239d;
            if (tileOverlay != null && this.f51238c != null) {
                tileOverlay.remove();
                this.f51239d = null;
                com.tencent.mapsdk.internal.ne neVar = this.f51238c.f52273as;
                neVar.d(neVar.N()[0]);
                this.f51241f = false;
            }
        }
    }

    public final boolean e() {
        return this.f51239d != null;
    }

    @Override // com.tencent.mapsdk.internal.rp.a
    public final void f() {
        com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions tileOverlayOptions = this.f51240e;
        if (tileOverlayOptions != null) {
            com.tencent.mapsdk.internal.ro roVar = (com.tencent.mapsdk.internal.ro) tileOverlayOptions.getTileProvider();
            com.tencent.mapsdk.internal.ro.f51242a = com.tencent.mapsdk.internal.rm.a();
            com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions tileOverlayOptions2 = roVar.f51244b;
            if (tileOverlayOptions2 != null) {
                tileOverlayOptions2.versionInfo(com.tencent.mapsdk.internal.ro.a());
            }
        }
        synchronized (this.f51237b) {
            com.tencent.tencentmap.mapsdk.maps.model.TileOverlay tileOverlay = this.f51239d;
            if (tileOverlay != null) {
                tileOverlay.clearTileCache();
                this.f51239d.reload();
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.v.a
    public final boolean a() {
        return this.f51241f;
    }
}
