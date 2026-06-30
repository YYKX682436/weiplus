package com.tencent.mapsdk.raster.model;

/* loaded from: classes13.dex */
public abstract class UrlTileProvider implements com.tencent.mapsdk.raster.model.TileProvider {
    private static final boolean PRINT_URL = false;
    public final int mHeight;
    public final int mWidth;

    public UrlTileProvider(int i17, int i18) {
        this.mWidth = i17;
        this.mHeight = i18;
    }

    @Override // com.tencent.mapsdk.raster.model.TileProvider
    public com.tencent.mapsdk.raster.model.Tile getTile(int i17, int i18, int i19) {
        return null;
    }

    public abstract java.net.URL getTileUrl(int i17, int i18, int i19);
}
