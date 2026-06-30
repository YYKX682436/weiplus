package com.tencent.mapsdk.raster.model;

/* loaded from: classes13.dex */
public interface Circle extends com.tencent.mapsdk.raster.model.IOverlay {
    boolean contains(com.tencent.mapsdk.raster.model.LatLng latLng);

    boolean equals(java.lang.Object obj);

    com.tencent.mapsdk.raster.model.LatLng getCenter();

    int getFillColor();

    @Override // com.tencent.mapsdk.raster.model.IOverlay
    java.lang.String getId();

    int getLevel();

    double getRadius();

    int getStrokeColor();

    boolean getStrokeDash();

    android.graphics.DashPathEffect getStrokeDashPathEffect();

    float getStrokeWidth();

    float getZIndex();

    int hashCode();

    @Override // com.tencent.mapsdk.raster.model.IOverlay
    boolean isVisible();

    @Override // com.tencent.mapsdk.raster.model.IOverlay
    void remove();

    void setCenter(com.tencent.mapsdk.raster.model.LatLng latLng);

    void setFillColor(int i17);

    void setLevel(int i17);

    void setRadius(double d17);

    void setStrokeColor(int i17);

    void setStrokeDash(boolean z17);

    void setStrokeWidth(float f17);

    @Override // com.tencent.mapsdk.raster.model.IOverlay
    void setVisible(boolean z17);

    void setZIndex(float f17);

    void strokeDashPathEffect(android.graphics.DashPathEffect dashPathEffect);
}
