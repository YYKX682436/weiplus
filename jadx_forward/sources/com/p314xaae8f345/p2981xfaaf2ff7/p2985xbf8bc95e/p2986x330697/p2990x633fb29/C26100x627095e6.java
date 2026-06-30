package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29;

/* renamed from: com.tencent.tencentmap.mapsdk.maps.model.VisibleRegion */
/* loaded from: classes13.dex */
public final class C26100x627095e6 {

    /* renamed from: farLeft */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 f49841xbfac3bbe;

    /* renamed from: farRight */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 f49842x36319d45;

    /* renamed from: latLngBounds */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b f49843xc187b75b;

    /* renamed from: nearLeft */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 f49844x2d87484f;

    /* renamed from: nearRight */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 f49845x83b822d4;

    public C26100x627095e6(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d262, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d263, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d264, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b c26042xcb530b7b) {
        this.f49844x2d87484f = c26041x873d1d26;
        this.f49845x83b822d4 = c26041x873d1d262;
        this.f49841xbfac3bbe = c26041x873d1d263;
        this.f49842x36319d45 = c26041x873d1d264;
        this.f49843xc187b75b = c26042xcb530b7b;
    }

    /* renamed from: equals */
    public final boolean m100061xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26100x627095e6)) {
            return false;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26100x627095e6 c26100x627095e6 = (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26100x627095e6) obj;
        return this.f49844x2d87484f.m99507xb2c87fbf(c26100x627095e6.f49844x2d87484f) && this.f49845x83b822d4.m99507xb2c87fbf(c26100x627095e6.f49845x83b822d4) && this.f49841xbfac3bbe.m99507xb2c87fbf(c26100x627095e6.f49841xbfac3bbe) && this.f49842x36319d45.m99507xb2c87fbf(c26100x627095e6.f49842x36319d45) && this.f49843xc187b75b.m99540xb2c87fbf(c26100x627095e6.f49843xc187b75b);
    }

    /* renamed from: toString */
    public final java.lang.String m100062x9616526c() {
        return "nearLeft" + this.f49844x2d87484f + "nearRight" + this.f49845x83b822d4 + "farLeft" + this.f49841xbfac3bbe + "farRight" + this.f49842x36319d45 + "latLngBounds" + this.f49843xc187b75b;
    }
}
