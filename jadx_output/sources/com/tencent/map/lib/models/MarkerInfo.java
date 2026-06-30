package com.tencent.map.lib.models;

/* loaded from: classes13.dex */
public class MarkerInfo {
    public static final int TYPE_2D_GEO_ANGLE = 0;
    public static final int TYPE_2D_SCREEN_ANGLE = 1;
    public static final int TYPE_2D_UI = 2;
    public static final int TYPE_3D = 3;
    private int[] candidatePositions;
    private int iconHeight;
    private java.lang.String iconName;
    private int iconWidth;
    private double latitude;
    private double longitude;
    private com.tencent.map.lib.models.SubMarkerInfo mSubMarkerInfo;
    private int priority;
    private java.lang.String text;
    private int type = 1;
    private float anchorX = 0.5f;
    private float anchorY = 0.5f;
    private float angle = 0.0f;
    private float alpha = 1.0f;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private boolean avoidAnnotation = false;
    private boolean interactive = true;
    private int displayLevel = 0;
    private boolean forceLoad = true;
    private int minScaleLevel = 0;
    private int maxScaleLevel = 30;
    private boolean visibility = true;
    private boolean avoidOtherMarker = false;
    private int markerType = 0;
    private int textColor = -13421773;
    private int haloColor = -1;
    private float fontSize = 12.0f;
    private float haloSize = 1.0f;
    private float iconSpace = 2.0f;
    private int textEffect = 0;
    private boolean hideWhenAvoidFailed = true;

    private MarkerInfo() {
    }

    public com.tencent.map.lib.models.MarkerInfo alpha(float f17) {
        this.alpha = f17;
        return this;
    }

    public com.tencent.map.lib.models.MarkerInfo anchor(float f17, float f18) {
        this.anchorX = f17;
        this.anchorY = f18;
        return this;
    }

    public com.tencent.map.lib.models.MarkerInfo avoidAnnotation(boolean z17) {
        this.avoidAnnotation = z17;
        return this;
    }

    public com.tencent.map.lib.models.MarkerInfo avoidOtherMarker(boolean z17) {
        this.avoidOtherMarker = z17;
        return this;
    }

    public com.tencent.map.lib.models.MarkerInfo candidatePositions(int[] iArr) {
        this.candidatePositions = iArr;
        return this;
    }

    public com.tencent.map.lib.models.MarkerInfo displayLevel(int i17) {
        this.displayLevel = i17;
        return this;
    }

    public com.tencent.map.lib.models.MarkerInfo fontSize(float f17) {
        this.fontSize = f17;
        return this;
    }

    public com.tencent.map.lib.models.MarkerInfo forceLoad(boolean z17) {
        this.forceLoad = z17;
        return this;
    }

    public com.tencent.map.lib.models.MarkerInfo haloColor(int i17) {
        this.haloColor = i17;
        return this;
    }

    public com.tencent.map.lib.models.MarkerInfo haloSize(float f17) {
        this.haloSize = f17;
        return this;
    }

    public com.tencent.map.lib.models.MarkerInfo hideWhenAvoidFailed(boolean z17) {
        this.hideWhenAvoidFailed = z17;
        return this;
    }

    public com.tencent.map.lib.models.MarkerInfo iconHeight(int i17) {
        this.iconHeight = i17;
        return this;
    }

    public com.tencent.map.lib.models.MarkerInfo iconName(java.lang.String str) {
        this.iconName = str;
        return this;
    }

    public com.tencent.map.lib.models.MarkerInfo iconSpace(float f17) {
        this.iconSpace = f17;
        return this;
    }

    public com.tencent.map.lib.models.MarkerInfo iconWidth(int i17) {
        this.iconWidth = i17;
        return this;
    }

    public com.tencent.map.lib.models.MarkerInfo interactive(boolean z17) {
        this.interactive = z17;
        return this;
    }

    public com.tencent.map.lib.models.MarkerInfo markerType(int i17) {
        this.markerType = i17;
        return this;
    }

    public com.tencent.map.lib.models.MarkerInfo maxScaleLevel(int i17) {
        this.maxScaleLevel = i17;
        return this;
    }

    public com.tencent.map.lib.models.MarkerInfo minScaleLevel(int i17) {
        this.minScaleLevel = i17;
        return this;
    }

    public com.tencent.map.lib.models.MarkerInfo position(double d17, double d18) {
        this.latitude = d17;
        this.longitude = d18;
        return this;
    }

    public com.tencent.map.lib.models.MarkerInfo priority(int i17) {
        this.priority = i17;
        return this;
    }

    public com.tencent.map.lib.models.MarkerInfo rotation(float f17) {
        this.angle = f17;
        return this;
    }

    public com.tencent.map.lib.models.MarkerInfo scale(float f17, float f18) {
        this.scaleX = f17;
        this.scaleY = f18;
        return this;
    }

    public com.tencent.map.lib.models.MarkerInfo subMarkerInfo(com.tencent.map.lib.models.SubMarkerInfo subMarkerInfo) {
        this.mSubMarkerInfo = subMarkerInfo;
        return this;
    }

    public com.tencent.map.lib.models.MarkerInfo text(java.lang.String str) {
        this.text = str;
        return this;
    }

    public com.tencent.map.lib.models.MarkerInfo textColor(int i17) {
        this.textColor = i17;
        return this;
    }

    public com.tencent.map.lib.models.MarkerInfo textEffect(int i17) {
        this.textEffect = i17;
        return this;
    }

    public java.lang.String toString() {
        return "MarkerInfo{type=" + this.type + ", iconName='" + this.iconName + "', latitude=" + this.latitude + ", longitude=" + this.longitude + ", anchorX=" + this.anchorX + ", anchorY=" + this.anchorY + ", angle=" + this.angle + ", alpha=" + this.alpha + ", scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", avoidAnnotation=" + this.avoidAnnotation + ", interactive=" + this.interactive + ", displayLevel=" + this.displayLevel + ", priority=" + this.priority + ", forceLoad=" + this.forceLoad + ", minScaleLevel=" + this.minScaleLevel + ", maxScaleLevel=" + this.maxScaleLevel + ", visibility=" + this.visibility + ", avoidOtherMarker=" + this.avoidOtherMarker + ", iconWidth=" + this.iconWidth + ", iconHeight=" + this.iconHeight + ", mSubMarkerInfo=" + this.mSubMarkerInfo + ", markerType=" + this.markerType + ", text='" + this.text + "', candidatePositions=" + java.util.Arrays.toString(this.candidatePositions) + ", textColor=" + this.textColor + ", haloColor=" + this.haloColor + ", fontSize=" + this.fontSize + ", haloSize=" + this.haloSize + ", iconSpace=" + this.iconSpace + ", textEffect=" + this.textEffect + ", hideWhenAvoidFailed=" + this.hideWhenAvoidFailed + '}';
    }

    public com.tencent.map.lib.models.MarkerInfo type(int i17) {
        this.type = i17;
        return this;
    }

    public com.tencent.map.lib.models.MarkerInfo visible(boolean z17) {
        this.visibility = z17;
        return this;
    }

    public MarkerInfo(double d17, double d18, java.lang.String str) {
        this.latitude = d17;
        this.longitude = d18;
        this.iconName = str;
    }
}
