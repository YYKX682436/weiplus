package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class ob extends com.tencent.map.lib.models.IntersectionOverlayInfo implements com.tencent.mapsdk.internal.ni {
    public ob(com.tencent.tencentmap.mapsdk.maps.model.IntersectionOverlayOptions intersectionOverlayOptions) {
        this.mBounds = intersectionOverlayOptions.getBounds();
        if (intersectionOverlayOptions.getData() != null) {
            this.mData = java.util.Arrays.copyOf(intersectionOverlayOptions.getData(), intersectionOverlayOptions.getData().length);
        } else {
            this.mData = new byte[0];
        }
        this.mVisibility = intersectionOverlayOptions.isVisibility();
        this.mDistance = intersectionOverlayOptions.getDistance();
        this.mIsDarkMode = intersectionOverlayOptions.isDarkMode();
        this.mRoundedCorner = intersectionOverlayOptions.isRoundedCorner();
        this.mDayStyleFilePath = intersectionOverlayOptions.getDayStyleFilePath();
        this.mNightStyleFilePath = intersectionOverlayOptions.getNightStyleFilePath();
    }
}
