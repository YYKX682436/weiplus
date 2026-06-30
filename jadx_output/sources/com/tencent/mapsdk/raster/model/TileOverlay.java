package com.tencent.mapsdk.raster.model;

/* loaded from: classes6.dex */
public interface TileOverlay {
    void clearTileCache();

    boolean equals(java.lang.Object obj);

    java.lang.String getId();

    int hashCode();

    void reload();

    void remove();

    void setDiskCacheDir(java.lang.String str);

    void setZindex(int i17);
}
