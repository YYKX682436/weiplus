package com.p314xaae8f345.map.lib.p496xc04b6a6a;

/* renamed from: com.tencent.map.lib.models.AccessibleTouchItem */
/* loaded from: classes13.dex */
public abstract class AbstractC4234xc56d2fbc implements java.lang.Comparable<com.p314xaae8f345.map.lib.p496xc04b6a6a.AbstractC4234xc56d2fbc> {

    /* renamed from: MAP_DEFAULT_CONTENT_DESCRIPTION */
    public static final java.lang.String f16298x95eb0155 = "地图";

    /* renamed from: MIN_TOUCH_RADIUS */
    public static final int f16299x9832e69f = 20;

    /* renamed from: MY_LOCATION_PREFIX */
    public static final java.lang.String f16300xbb5875c9 = "我的位置";

    /* renamed from: getBounds */
    public abstract android.graphics.Rect mo35238x12a519ab();

    /* renamed from: getContentDescription */
    public abstract java.lang.String mo35239xc77303b9();

    /* renamed from: onClick */
    public abstract void mo35240xaf6b9ae9();

    @Override // java.lang.Comparable
    public int compareTo(com.p314xaae8f345.map.lib.p496xc04b6a6a.AbstractC4234xc56d2fbc abstractC4234xc56d2fbc) {
        android.graphics.Rect mo35238x12a519ab = mo35238x12a519ab();
        android.graphics.Rect mo35238x12a519ab2 = abstractC4234xc56d2fbc.mo35238x12a519ab();
        int i17 = mo35238x12a519ab.top;
        int i18 = mo35238x12a519ab2.top;
        return i17 != i18 ? i17 - i18 : mo35238x12a519ab.left - mo35238x12a519ab2.left;
    }
}
