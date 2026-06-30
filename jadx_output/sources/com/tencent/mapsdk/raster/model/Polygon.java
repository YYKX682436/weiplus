package com.tencent.mapsdk.raster.model;

/* loaded from: classes13.dex */
public interface Polygon extends com.tencent.mapsdk.raster.model.IOverlay {
    boolean contains(com.tencent.mapsdk.raster.model.LatLng latLng);

    boolean equals(java.lang.Object obj);

    int getFillColor();

    @Override // com.tencent.mapsdk.raster.model.IOverlay
    java.lang.String getId();

    int getLevel();

    java.util.List<com.tencent.mapsdk.raster.model.LatLng> getPoints();

    int getStrokeColor();

    float getStrokeWidth();

    float getZIndex();

    int hashCode();

    @Override // com.tencent.mapsdk.raster.model.IOverlay
    boolean isVisible();

    @Override // com.tencent.mapsdk.raster.model.IOverlay
    void remove();

    void setFillColor(int i17);

    void setLevel(int i17);

    void setPoints(java.util.List<com.tencent.mapsdk.raster.model.LatLng> list);

    void setStrokeColor(int i17);

    void setStrokeWidth(float f17);

    @Override // com.tencent.mapsdk.raster.model.IOverlay
    void setVisible(boolean z17);

    void setZIndex(float f17);
}
