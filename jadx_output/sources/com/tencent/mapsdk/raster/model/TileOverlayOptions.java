package com.tencent.mapsdk.raster.model;

/* loaded from: classes13.dex */
public final class TileOverlayOptions {
    private volatile java.lang.String mDiskCacheDir;
    private com.tencent.mapsdk.raster.model.TileProvider mTileProvider;
    private volatile java.lang.String mVersionInfo;
    private int mZIndex = 1;
    private boolean mBetterQuality = true;

    public com.tencent.mapsdk.raster.model.TileOverlayOptions betterQuality(boolean z17) {
        this.mBetterQuality = z17;
        return this;
    }

    public com.tencent.mapsdk.raster.model.TileOverlayOptions diskCacheDir(java.lang.String str) {
        this.mDiskCacheDir = str;
        return this;
    }

    public java.lang.String getDiskCacheDir() {
        return this.mDiskCacheDir;
    }

    public com.tencent.mapsdk.raster.model.TileProvider getTileProvider() {
        return this.mTileProvider;
    }

    public java.lang.String getVersionInfo() {
        return this.mVersionInfo;
    }

    public int getZIndex() {
        return this.mZIndex;
    }

    public boolean isBetterQuality() {
        return this.mBetterQuality;
    }

    public com.tencent.mapsdk.raster.model.TileOverlayOptions tileProvider(com.tencent.mapsdk.raster.model.TileProvider tileProvider) {
        this.mTileProvider = tileProvider;
        return this;
    }

    public com.tencent.mapsdk.raster.model.TileOverlayOptions versionInfo(java.lang.String str) {
        this.mVersionInfo = str;
        return this;
    }

    public com.tencent.mapsdk.raster.model.TileOverlayOptions zIndex(int i17) {
        this.mZIndex = i17;
        return this;
    }
}
