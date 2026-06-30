package com.tencent.mapsdk.raster.model;

/* loaded from: classes13.dex */
public class MapPoi {
    private java.lang.String mName;
    private com.tencent.mapsdk.raster.model.LatLng mPosition;

    public MapPoi(java.lang.String str, com.tencent.mapsdk.raster.model.LatLng latLng) {
        this.mName = str;
        this.mPosition = latLng;
    }

    public java.lang.String getName() {
        return this.mName;
    }

    public com.tencent.mapsdk.raster.model.LatLng getPosition() {
        return this.mPosition;
    }
}
