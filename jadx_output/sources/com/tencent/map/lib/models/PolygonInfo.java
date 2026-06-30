package com.tencent.map.lib.models;

/* loaded from: classes13.dex */
public class PolygonInfo {
    public int borderColor;
    public int borderLineId;
    public float borderWidth;
    public int color;
    public int[] holeLineIds;
    public com.tencent.tencentmap.mapsdk.maps.model.LatLng[][] holePoints;
    public int minScaleLevel;
    public int[] pattern;
    public com.tencent.tencentmap.mapsdk.maps.model.LatLng[] points;
    public int polygonId;
    public java.lang.String textureName;
    public int textureSpacing;
    public float zIndex = 0.0f;
    public int level = 2;
    public int maxScaleLevel = 30;

    public java.lang.String toString() {
        return "PolygonInfo{color=" + this.color + ", borderColor=" + this.borderColor + ", borderWidth=" + this.borderWidth + ", points=" + java.util.Arrays.toString(this.points) + ", polygonId=" + this.polygonId + ", borderLineId=" + this.borderLineId + ", zIndex=" + this.zIndex + ", level=" + this.level + ", minScaleLevel=" + this.minScaleLevel + ", maxScaleLevel=" + this.maxScaleLevel + ", pattern=" + java.util.Arrays.toString(this.pattern) + ", textureName='" + this.textureName + "', textureSpacing=" + this.textureSpacing + ", holePoints=" + java.util.Arrays.toString(this.holePoints) + '}';
    }
}
