package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class ro extends com.tencent.tencentmap.mapsdk.maps.model.UrlTileProvider {

    /* renamed from: a, reason: collision with root package name */
    static int f51242a = 0;

    /* renamed from: c, reason: collision with root package name */
    private static final int f51243c = 256;

    /* renamed from: b, reason: collision with root package name */
    com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions f51244b;

    public ro(com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions tileOverlayOptions) {
        super(256, 256);
        this.f51244b = tileOverlayOptions;
        int a17 = com.tencent.mapsdk.internal.rm.a();
        f51242a = a17;
        com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions tileOverlayOptions2 = this.f51244b;
        if (tileOverlayOptions2 != null) {
            tileOverlayOptions2.versionInfo(java.lang.Integer.toString(a17));
        }
    }

    public static java.lang.String a() {
        return java.lang.Integer.toString(f51242a);
    }

    private void b() {
        int a17 = com.tencent.mapsdk.internal.rm.a();
        f51242a = a17;
        com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions tileOverlayOptions = this.f51244b;
        if (tileOverlayOptions != null) {
            tileOverlayOptions.versionInfo(java.lang.Integer.toString(a17));
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.UrlTileProvider
    public final java.net.URL getTileUrl(int i17, int i18, int i19) {
        java.lang.String sketchTileUrl = ((com.tencent.mapsdk.internal.dh) ((com.tencent.mapsdk.internal.dw) com.tencent.mapsdk.internal.cp.a(com.tencent.mapsdk.internal.dw.class)).i()).sketchTileUrl(i17, (int) ((java.lang.Math.pow(2.0d, i19) - 1.0d) - i18), i19, f51242a);
        try {
            if (android.text.TextUtils.isEmpty(sketchTileUrl)) {
                return null;
            }
            return new java.net.URL(sketchTileUrl);
        } catch (java.net.MalformedURLException unused) {
            return null;
        }
    }
}
