package com.tencent.mapsdk.raster.model;

/* loaded from: classes13.dex */
public interface TileProvider {
    public static final com.tencent.mapsdk.raster.model.Tile NO_TILE = new com.tencent.mapsdk.raster.model.Tile(-1, -1, null);

    com.tencent.mapsdk.raster.model.Tile getTile(int i17, int i18, int i19);
}
