package com.tencent.mapsdk.raster.model;

/* loaded from: classes13.dex */
public interface Polyline extends com.tencent.mapsdk.raster.model.IOverlay {
    boolean equals(java.lang.Object obj);

    void eraseTo(int i17, com.tencent.mapsdk.raster.model.LatLng latLng);

    int getColor();

    @Override // com.tencent.mapsdk.raster.model.IOverlay
    java.lang.String getId();

    int getLevel();

    java.util.List<com.tencent.mapsdk.raster.model.LatLng> getPoints();

    float getWidth();

    float getZIndex();

    int hashCode();

    boolean isDottedLine();

    boolean isGeodesic();

    @Override // com.tencent.mapsdk.raster.model.IOverlay
    boolean isVisible();

    @Override // com.tencent.mapsdk.raster.model.IOverlay
    void remove();

    void setColor(int i17);

    void setColorTexture(com.tencent.mapsdk.raster.model.BitmapDescriptor bitmapDescriptor);

    void setDottedLine(boolean z17);

    void setEraseable(boolean z17);

    void setGeodesic(boolean z17);

    void setLevel(int i17);

    void setPoints(java.util.List<com.tencent.mapsdk.raster.model.LatLng> list);

    @Override // com.tencent.mapsdk.raster.model.IOverlay
    void setVisible(boolean z17);

    void setWidth(float f17);

    void setZIndex(float f17);
}
