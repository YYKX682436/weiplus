package com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29;

/* renamed from: com.tencent.mapsdk.raster.model.VisibleRegion */
/* loaded from: classes13.dex */
public final class C4421x627095e6 {

    /* renamed from: farLeft */
    private final com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 f17530xbfac3bbe;

    /* renamed from: farRight */
    private final com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 f17531x36319d45;

    /* renamed from: latLngBounds */
    private final com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4407xcb530b7b f17532xc187b75b;

    /* renamed from: mVersionCode */
    private final int f17533xd3182438;

    /* renamed from: nearLeft */
    private final com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 f17534x2d87484f;

    /* renamed from: nearRight */
    private final com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 f17535x83b822d4;

    public C4421x627095e6(int i17, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d26, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d262, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d263, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d264, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4407xcb530b7b c4407xcb530b7b) {
        this.f17533xd3182438 = i17;
        this.f17534x2d87484f = c4406x873d1d26;
        this.f17535x83b822d4 = c4406x873d1d262;
        this.f17530xbfac3bbe = c4406x873d1d263;
        this.f17531x36319d45 = c4406x873d1d264;
        this.f17532xc187b75b = c4407xcb530b7b;
    }

    /* renamed from: equals */
    public boolean m37432xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4421x627095e6)) {
            return false;
        }
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4421x627095e6 c4421x627095e6 = (com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4421x627095e6) obj;
        return m37436xa96185c5().m37194xb2c87fbf(c4421x627095e6.m37436xa96185c5()) && m37437x8325941e().m37194xb2c87fbf(c4421x627095e6.m37437x8325941e()) && m37433xfd797788().m37194xb2c87fbf(c4421x627095e6.m37433xfd797788()) && m37434xb20bdabb().m37194xb2c87fbf(c4421x627095e6.m37434xb20bdabb()) && m37435x227a49d1().m37209xb2c87fbf(c4421x627095e6.m37435x227a49d1());
    }

    /* renamed from: getFarLeft */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 m37433xfd797788() {
        return this.f17530xbfac3bbe;
    }

    /* renamed from: getFarRight */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 m37434xb20bdabb() {
        return this.f17531x36319d45;
    }

    /* renamed from: getLatLngBounds */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4407xcb530b7b m37435x227a49d1() {
        return this.f17532xc187b75b;
    }

    /* renamed from: getNearLeft */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 m37436xa96185c5() {
        return this.f17534x2d87484f;
    }

    /* renamed from: getNearRight */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 m37437x8325941e() {
        return this.f17535x83b822d4;
    }

    /* renamed from: getVersionCode */
    public int m37438x2e159af() {
        return this.f17533xd3182438;
    }

    /* renamed from: hashCode */
    public int m37439x8cdac1b() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{m37436xa96185c5(), m37437x8325941e(), m37433xfd797788(), m37434xb20bdabb(), m37435x227a49d1()});
    }

    /* renamed from: toString */
    public java.lang.String m37440x9616526c() {
        return "nearLeft" + this.f17534x2d87484f + "nearRight" + this.f17535x83b822d4 + "farLeft" + this.f17530xbfac3bbe + "farRight" + this.f17531x36319d45 + "latLngBounds" + this.f17532xc187b75b;
    }

    public C4421x627095e6(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d26, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d262, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d263, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d264, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4407xcb530b7b c4407xcb530b7b) {
        this(1, c4406x873d1d26, c4406x873d1d262, c4406x873d1d263, c4406x873d1d264, c4407xcb530b7b);
    }
}
