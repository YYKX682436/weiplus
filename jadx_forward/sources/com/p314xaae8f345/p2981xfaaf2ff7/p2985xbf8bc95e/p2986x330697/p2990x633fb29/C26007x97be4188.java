package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29;

/* renamed from: com.tencent.tencentmap.mapsdk.maps.model.AoiLayerOptions */
/* loaded from: classes13.dex */
public class C26007x97be4188 {

    /* renamed from: mMinLevel */
    private int f49325xd25fcfdf = -1;

    /* renamed from: mMaxLevel */
    private int f49324x3c3e6c0d = -1;

    /* renamed from: getMaxLevel */
    public int m99298x931b01f6() {
        return this.f49324x3c3e6c0d;
    }

    /* renamed from: getMinLevel */
    public int m99299x293c65c8() {
        return this.f49325xd25fcfdf;
    }

    /* renamed from: setDisplayLevel */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26007x97be4188 m99300xf6704964(int i17, int i18) {
        if (i17 >= 0 && i18 >= 0 && i17 <= i18) {
            if (i17 < 3) {
                i17 = 3;
            }
            if (i18 > 20) {
                i18 = 20;
            }
            this.f49325xd25fcfdf = i17;
            this.f49324x3c3e6c0d = i18;
        }
        return this;
    }
}
