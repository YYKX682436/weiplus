package com.tencent.mapsdk.raster.model;

/* loaded from: classes13.dex */
public class IndoorInfo {
    private java.lang.String buildingId;
    private java.lang.String floorName;

    public IndoorInfo(java.lang.String str, java.lang.String str2) {
        this.buildingId = str;
        this.floorName = str2;
    }

    public java.lang.String getBuildingId() {
        return this.buildingId;
    }

    public java.lang.String getFloorName() {
        return this.floorName;
    }

    public java.lang.String toString() {
        return this.buildingId + "_" + this.floorName;
    }
}
