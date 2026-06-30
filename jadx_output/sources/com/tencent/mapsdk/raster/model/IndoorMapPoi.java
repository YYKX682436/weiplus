package com.tencent.mapsdk.raster.model;

/* loaded from: classes13.dex */
public class IndoorMapPoi extends com.tencent.mapsdk.raster.model.MapPoi {
    private java.lang.String buildingId;
    private java.lang.String buildingName;
    private java.lang.String floorName;

    public IndoorMapPoi(java.lang.String str, com.tencent.mapsdk.raster.model.LatLng latLng, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        super(str, latLng);
        this.buildingId = str2;
        this.buildingName = str3;
        this.floorName = str4;
    }

    public java.lang.String getBuildingId() {
        return this.buildingId;
    }

    public java.lang.String getBuildingName() {
        return this.buildingName;
    }

    public java.lang.String getFloorName() {
        return this.floorName;
    }
}
