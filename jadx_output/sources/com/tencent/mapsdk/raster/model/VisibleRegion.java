package com.tencent.mapsdk.raster.model;

/* loaded from: classes13.dex */
public final class VisibleRegion {
    private final com.tencent.mapsdk.raster.model.LatLng farLeft;
    private final com.tencent.mapsdk.raster.model.LatLng farRight;
    private final com.tencent.mapsdk.raster.model.LatLngBounds latLngBounds;
    private final int mVersionCode;
    private final com.tencent.mapsdk.raster.model.LatLng nearLeft;
    private final com.tencent.mapsdk.raster.model.LatLng nearRight;

    public VisibleRegion(int i17, com.tencent.mapsdk.raster.model.LatLng latLng, com.tencent.mapsdk.raster.model.LatLng latLng2, com.tencent.mapsdk.raster.model.LatLng latLng3, com.tencent.mapsdk.raster.model.LatLng latLng4, com.tencent.mapsdk.raster.model.LatLngBounds latLngBounds) {
        this.mVersionCode = i17;
        this.nearLeft = latLng;
        this.nearRight = latLng2;
        this.farLeft = latLng3;
        this.farRight = latLng4;
        this.latLngBounds = latLngBounds;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mapsdk.raster.model.VisibleRegion)) {
            return false;
        }
        com.tencent.mapsdk.raster.model.VisibleRegion visibleRegion = (com.tencent.mapsdk.raster.model.VisibleRegion) obj;
        return getNearLeft().equals(visibleRegion.getNearLeft()) && getNearRight().equals(visibleRegion.getNearRight()) && getFarLeft().equals(visibleRegion.getFarLeft()) && getFarRight().equals(visibleRegion.getFarRight()) && getLatLngBounds().equals(visibleRegion.getLatLngBounds());
    }

    public com.tencent.mapsdk.raster.model.LatLng getFarLeft() {
        return this.farLeft;
    }

    public com.tencent.mapsdk.raster.model.LatLng getFarRight() {
        return this.farRight;
    }

    public com.tencent.mapsdk.raster.model.LatLngBounds getLatLngBounds() {
        return this.latLngBounds;
    }

    public com.tencent.mapsdk.raster.model.LatLng getNearLeft() {
        return this.nearLeft;
    }

    public com.tencent.mapsdk.raster.model.LatLng getNearRight() {
        return this.nearRight;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{getNearLeft(), getNearRight(), getFarLeft(), getFarRight(), getLatLngBounds()});
    }

    public java.lang.String toString() {
        return "nearLeft" + this.nearLeft + "nearRight" + this.nearRight + "farLeft" + this.farLeft + "farRight" + this.farRight + "latLngBounds" + this.latLngBounds;
    }

    public VisibleRegion(com.tencent.mapsdk.raster.model.LatLng latLng, com.tencent.mapsdk.raster.model.LatLng latLng2, com.tencent.mapsdk.raster.model.LatLng latLng3, com.tencent.mapsdk.raster.model.LatLng latLng4, com.tencent.mapsdk.raster.model.LatLngBounds latLngBounds) {
        this(1, latLng, latLng2, latLng3, latLng4, latLngBounds);
    }
}
