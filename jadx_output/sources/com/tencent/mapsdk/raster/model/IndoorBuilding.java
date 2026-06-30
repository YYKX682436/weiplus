package com.tencent.mapsdk.raster.model;

/* loaded from: classes13.dex */
public final class IndoorBuilding {
    private int mActiveLevelIndex;
    private java.lang.String mBuidlingId;
    private java.lang.String mBuildingName;
    private java.util.List<com.tencent.mapsdk.raster.model.IndoorLevel> mLevels;

    public IndoorBuilding(java.lang.String str, java.lang.String str2, java.util.List<com.tencent.mapsdk.raster.model.IndoorLevel> list, int i17) {
        this.mBuidlingId = str;
        this.mBuildingName = str2;
        this.mLevels = list;
        this.mActiveLevelIndex = i17;
    }

    public int getActiveLevelIndex() {
        return this.mActiveLevelIndex;
    }

    public java.lang.String getBuidlingId() {
        return this.mBuidlingId;
    }

    public java.lang.String getBuildingName() {
        return this.mBuildingName;
    }

    public java.util.List<com.tencent.mapsdk.raster.model.IndoorLevel> getLevels() {
        return this.mLevels;
    }

    public java.lang.String toString() {
        java.util.List<com.tencent.mapsdk.raster.model.IndoorLevel> list;
        if (this.mBuidlingId == null || (list = this.mLevels) == null || list.size() <= this.mActiveLevelIndex) {
            return null;
        }
        return this.mBuidlingId + "_" + this.mLevels.get(this.mActiveLevelIndex).getName();
    }
}
