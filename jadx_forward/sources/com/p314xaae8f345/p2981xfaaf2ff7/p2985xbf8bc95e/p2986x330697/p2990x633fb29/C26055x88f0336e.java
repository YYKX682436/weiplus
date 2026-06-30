package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29;

/* renamed from: com.tencent.tencentmap.mapsdk.maps.model.MapPoi */
/* loaded from: classes13.dex */
public class C26055x88f0336e {

    /* renamed from: latitude */
    private double f49550xaa2bac6c;

    /* renamed from: longitude */
    private double f49551x83009af;

    /* renamed from: name */
    public java.lang.String f49552x337a8b;

    /* renamed from: poiId */
    public java.lang.String f49553x65e5105;

    /* renamed from: position */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 f49554x2c929929;

    public C26055x88f0336e() {
    }

    /* renamed from: getLatitude */
    public double m99622x2605e9e2() {
        return this.f49550xaa2bac6c;
    }

    /* renamed from: getLongitude */
    public double m99623x79d7af9() {
        return this.f49551x83009af;
    }

    /* renamed from: getName */
    public java.lang.String m99624xfb82e301() {
        return this.f49552x337a8b;
    }

    /* renamed from: getPoiId */
    public java.lang.String m99625x74fbf74f() {
        return this.f49553x65e5105;
    }

    /* renamed from: getPosition */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 m99626xa86cd69f() {
        return this.f49554x2c929929;
    }

    /* renamed from: setName */
    public void m99627x764daa0d(java.lang.String str) {
        this.f49552x337a8b = str;
    }

    /* renamed from: setPosition */
    public void m99628xa32537ab(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        this.f49554x2c929929 = c26041x873d1d26;
        this.f49550xaa2bac6c = c26041x873d1d26.m99509x2605e9e2();
        this.f49551x83009af = c26041x873d1d26.m99510x79d7af9();
    }

    public C26055x88f0336e(double d17, double d18) {
        this.f49550xaa2bac6c = d17;
        this.f49551x83009af = d18;
        this.f49554x2c929929 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(d17, d18);
    }

    public C26055x88f0336e(double d17, double d18, java.lang.String str) {
        this(d17, d18);
        this.f49552x337a8b = str;
    }
}
