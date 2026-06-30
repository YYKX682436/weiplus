package com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29;

/* renamed from: com.tencent.mapsdk.raster.model.IndoorBuilding */
/* loaded from: classes13.dex */
public final class C4401x15ff5647 {

    /* renamed from: mActiveLevelIndex */
    private int f17425x5681c5e1;

    /* renamed from: mBuidlingId */
    private java.lang.String f17426x2727222c;

    /* renamed from: mBuildingName */
    private java.lang.String f17427x5d03a06c;

    /* renamed from: mLevels */
    private java.util.List<com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4403x18de38d1> f17428xd7dfc3c;

    public C4401x15ff5647(java.lang.String str, java.lang.String str2, java.util.List<com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4403x18de38d1> list, int i17) {
        this.f17426x2727222c = str;
        this.f17427x5d03a06c = str2;
        this.f17428xd7dfc3c = list;
        this.f17425x5681c5e1 = i17;
    }

    /* renamed from: getActiveLevelIndex */
    public int m37174xd84262ca() {
        return this.f17425x5681c5e1;
    }

    /* renamed from: getBuidlingId */
    public java.lang.String m37175x3935e1d5() {
        return this.f17426x2727222c;
    }

    /* renamed from: getBuildingName */
    public java.lang.String m37176x266119d5() {
        return this.f17427x5d03a06c;
    }

    /* renamed from: getLevels */
    public java.util.List<com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4403x18de38d1> m37177x2328f865() {
        return this.f17428xd7dfc3c;
    }

    /* renamed from: toString */
    public java.lang.String m37178x9616526c() {
        java.util.List<com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4403x18de38d1> list;
        if (this.f17426x2727222c == null || (list = this.f17428xd7dfc3c) == null || list.size() <= this.f17425x5681c5e1) {
            return null;
        }
        return this.f17426x2727222c + "_" + this.f17428xd7dfc3c.get(this.f17425x5681c5e1).m37182xfb82e301();
    }
}
