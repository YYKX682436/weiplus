package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29;

/* renamed from: com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding */
/* loaded from: classes13.dex */
public final class C26034x15ff5647 implements java.lang.Cloneable {

    /* renamed from: mActiveLevelIndex */
    private int f49477x5681c5e1;

    /* renamed from: mBuidlingId */
    private java.lang.String f49478x2727222c;

    /* renamed from: mBuildingName */
    private java.lang.String f49479x5d03a06c;

    /* renamed from: mLatLng */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 f49480xd4457d3;

    /* renamed from: mLevels */
    private java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26036x18de38d1> f49481xd7dfc3c;

    public C26034x15ff5647(java.lang.String str, java.lang.String str2, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26036x18de38d1> list, int i17) {
        this.f49478x2727222c = str;
        this.f49479x5d03a06c = str2;
        this.f49480xd4457d3 = c26041x873d1d26;
        this.f49481xd7dfc3c = list;
        this.f49477x5681c5e1 = i17;
    }

    /* renamed from: clone */
    public final java.lang.Object m99464x5a5dd5d() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26034x15ff5647 c26034x15ff5647 = (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26034x15ff5647) super.clone();
        if (this.f49481xd7dfc3c != null) {
            c26034x15ff5647.f49481xd7dfc3c = new java.util.ArrayList(this.f49481xd7dfc3c.size());
            for (int i17 = 0; i17 < this.f49481xd7dfc3c.size(); i17++) {
                c26034x15ff5647.f49481xd7dfc3c.add(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26036x18de38d1(this.f49481xd7dfc3c.get(i17).m99474xfb82e301()));
            }
        }
        if (this.f49480xd4457d3 != null) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26 = this.f49480xd4457d3;
            c26034x15ff5647.f49480xd4457d3 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(c26041x873d1d26.f49501xaa2bac6c, c26041x873d1d26.f49502x83009af);
        }
        return c26034x15ff5647;
    }

    /* renamed from: getActiveLevelIndex */
    public final int m99465xd84262ca() {
        return this.f49477x5681c5e1;
    }

    /* renamed from: getBuidlingId */
    public final java.lang.String m99466x3935e1d5() {
        return this.f49478x2727222c;
    }

    /* renamed from: getBuildingLatLng */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 m99467xf1b25d0() {
        return this.f49480xd4457d3;
    }

    /* renamed from: getBuildingName */
    public final java.lang.String m99468x266119d5() {
        return this.f49479x5d03a06c;
    }

    /* renamed from: getLevels */
    public final java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26036x18de38d1> m99469x2328f865() {
        return this.f49481xd7dfc3c;
    }

    /* renamed from: toString */
    public final java.lang.String m99470x9616526c() {
        java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26036x18de38d1> list;
        if (this.f49478x2727222c == null || (list = this.f49481xd7dfc3c) == null || list.size() <= this.f49477x5681c5e1) {
            return "";
        }
        return this.f49478x2727222c + "_" + this.f49481xd7dfc3c.get(this.f49477x5681c5e1).m99474xfb82e301();
    }
}
