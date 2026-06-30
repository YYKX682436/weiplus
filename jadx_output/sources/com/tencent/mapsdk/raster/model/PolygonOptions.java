package com.tencent.mapsdk.raster.model;

/* loaded from: classes13.dex */
public final class PolygonOptions {
    private java.util.List<java.lang.Integer> pattern;
    private int strokeColor = -16777216;
    private int fillColor = -16777216;
    private float strokeWidth = 10.0f;
    private boolean isVisible = true;
    private float zIndex = 0.0f;
    private int iLevel = com.tencent.mapsdk.raster.model.OverlayLevel.OverlayLevelAboveLabels;
    private final java.util.List<com.tencent.mapsdk.raster.model.LatLng> points = new java.util.ArrayList();

    public com.tencent.mapsdk.raster.model.PolygonOptions add(com.tencent.mapsdk.raster.model.LatLng latLng) {
        if (latLng == null) {
            return this;
        }
        this.points.add(latLng);
        return this;
    }

    public com.tencent.mapsdk.raster.model.PolygonOptions addAll(java.lang.Iterable<com.tencent.mapsdk.raster.model.LatLng> iterable) {
        if (iterable == null) {
            return this;
        }
        java.util.Iterator<com.tencent.mapsdk.raster.model.LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            this.points.add(it.next());
        }
        return this;
    }

    public com.tencent.mapsdk.raster.model.PolygonOptions fillColor(int i17) {
        this.fillColor = i17;
        return this;
    }

    public int getFillColor() {
        return this.fillColor;
    }

    public int getLevel() {
        return this.iLevel;
    }

    public java.util.List<java.lang.Integer> getPattern() {
        return this.pattern;
    }

    public java.util.List<com.tencent.mapsdk.raster.model.LatLng> getPoints() {
        return this.points;
    }

    public int getStrokeColor() {
        return this.strokeColor;
    }

    public float getStrokeWidth() {
        return this.strokeWidth;
    }

    public float getZIndex() {
        return this.zIndex;
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    public com.tencent.mapsdk.raster.model.PolygonOptions level(int i17) {
        if (i17 >= com.tencent.mapsdk.raster.model.OverlayLevel.OverlayLevelAboveRoads && i17 <= com.tencent.mapsdk.raster.model.OverlayLevel.OverlayLevelAboveLabels) {
            this.iLevel = i17;
        }
        return this;
    }

    public com.tencent.mapsdk.raster.model.PolygonOptions pattern(java.util.List<java.lang.Integer> list) {
        this.pattern = list;
        return this;
    }

    public com.tencent.mapsdk.raster.model.PolygonOptions strokeColor(int i17) {
        this.strokeColor = i17;
        return this;
    }

    public com.tencent.mapsdk.raster.model.PolygonOptions strokeWidth(float f17) {
        if (f17 < 0.0f) {
            f17 = 0.0f;
        }
        this.strokeWidth = f17;
        return this;
    }

    public com.tencent.mapsdk.raster.model.PolygonOptions visible(boolean z17) {
        this.isVisible = z17;
        return this;
    }

    public com.tencent.mapsdk.raster.model.PolygonOptions zIndex(float f17) {
        this.zIndex = f17;
        return this;
    }

    public com.tencent.mapsdk.raster.model.PolygonOptions add(com.tencent.mapsdk.raster.model.LatLng... latLngArr) {
        if (latLngArr == null) {
            return this;
        }
        this.points.addAll(java.util.Arrays.asList(latLngArr));
        return this;
    }
}
