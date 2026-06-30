package com.tencent.map.lib.models;

/* loaded from: classes13.dex */
public abstract class AccessibleTouchItem implements java.lang.Comparable<com.tencent.map.lib.models.AccessibleTouchItem> {
    public static final java.lang.String MAP_DEFAULT_CONTENT_DESCRIPTION = "地图";
    public static final int MIN_TOUCH_RADIUS = 20;
    public static final java.lang.String MY_LOCATION_PREFIX = "我的位置";

    public abstract android.graphics.Rect getBounds();

    public abstract java.lang.String getContentDescription();

    public abstract void onClick();

    @Override // java.lang.Comparable
    public int compareTo(com.tencent.map.lib.models.AccessibleTouchItem accessibleTouchItem) {
        android.graphics.Rect bounds = getBounds();
        android.graphics.Rect bounds2 = accessibleTouchItem.getBounds();
        int i17 = bounds.top;
        int i18 = bounds2.top;
        return i17 != i18 ? i17 - i18 : bounds.left - bounds2.left;
    }
}
