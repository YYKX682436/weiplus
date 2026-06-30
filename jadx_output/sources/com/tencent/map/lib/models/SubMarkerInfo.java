package com.tencent.map.lib.models;

/* loaded from: classes13.dex */
public class SubMarkerInfo {
    private int mIconHeight;
    private java.lang.String mIconName;
    private int mIconWidth;
    private boolean mInteractive = false;
    private boolean mIsAvoidAnnotation = false;
    private boolean mAvoidOtherMarker = false;

    public com.tencent.map.lib.models.SubMarkerInfo avoidAnnotation(boolean z17) {
        this.mIsAvoidAnnotation = z17;
        return this;
    }

    public com.tencent.map.lib.models.SubMarkerInfo avoidOtherMarker(boolean z17) {
        this.mAvoidOtherMarker = z17;
        return this;
    }

    public com.tencent.map.lib.models.SubMarkerInfo iconHeight(int i17) {
        this.mIconHeight = i17;
        return this;
    }

    public com.tencent.map.lib.models.SubMarkerInfo iconName(java.lang.String str) {
        this.mIconName = str;
        return this;
    }

    public com.tencent.map.lib.models.SubMarkerInfo iconWidth(int i17) {
        this.mIconWidth = i17;
        return this;
    }

    public com.tencent.map.lib.models.SubMarkerInfo interactive(boolean z17) {
        this.mInteractive = z17;
        return this;
    }

    public java.lang.String toString() {
        return "SubMarkerInfo{mIconName='" + this.mIconName + "', mIconWidth=" + this.mIconWidth + ", mIconHeight=" + this.mIconHeight + ", mInteractive=" + this.mInteractive + ", mIsAvoidAnnotation=" + this.mIsAvoidAnnotation + ", mAvoidOtherMarker=" + this.mAvoidOtherMarker + '}';
    }
}
