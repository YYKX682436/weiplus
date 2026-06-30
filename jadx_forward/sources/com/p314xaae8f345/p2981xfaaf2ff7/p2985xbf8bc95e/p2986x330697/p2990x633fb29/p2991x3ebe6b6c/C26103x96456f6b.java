package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.p2991x3ebe6b6c;

/* renamed from: com.tencent.tencentmap.mapsdk.maps.model.transform.SphericalMercatorProjection */
/* loaded from: classes13.dex */
public class C26103x96456f6b {

    /* renamed from: EARTH_RADIUS */
    public static double f49850x2f539a47 = 6378137.0d;

    /* renamed from: mWorldWidth */
    final double f49851xf70885a1;

    public C26103x96456f6b() {
        this.f49851xf70885a1 = f49850x2f539a47 * 6.283185307179586d;
    }

    /* renamed from: distanceBetween */
    public double m100074x69db0a53(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d262) {
        double d17 = c26041x873d1d26.f49502x83009af;
        double d18 = d17 * 0.01745329251994329d;
        double d19 = c26041x873d1d26.f49501xaa2bac6c * 0.01745329251994329d;
        double d27 = c26041x873d1d262.f49502x83009af * 0.01745329251994329d;
        double d28 = c26041x873d1d262.f49501xaa2bac6c * 0.01745329251994329d;
        double sin = java.lang.Math.sin(d18);
        double sin2 = java.lang.Math.sin(d19);
        double cos = java.lang.Math.cos(d18);
        double cos2 = java.lang.Math.cos(d19);
        double sin3 = java.lang.Math.sin(d27);
        double sin4 = java.lang.Math.sin(d28);
        double cos3 = java.lang.Math.cos(d27);
        double cos4 = java.lang.Math.cos(d28);
        double[] dArr = {cos * cos2, cos2 * sin, sin2};
        double d29 = cos3 * cos4;
        double d37 = cos4 * sin3;
        double d38 = dArr[0];
        double d39 = (d38 - d29) * (d38 - d29);
        double d47 = dArr[1];
        double d48 = d39 + ((d47 - d37) * (d47 - d37));
        double d49 = dArr[2];
        return java.lang.Math.asin(java.lang.Math.sqrt(d48 + ((d49 - sin4) * (d49 - sin4))) / 2.0d) * this.f49851xf70885a1 * 3.141592653589793d;
    }

    /* renamed from: toLatLng */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 m100075x89192361(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.p2991x3ebe6b6c.C26102x49b6570 c26102x49b6570) {
        double d17 = c26102x49b6570.f296904x;
        double d18 = this.f49851xf70885a1;
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(90.0d - java.lang.Math.toDegrees(java.lang.Math.atan(java.lang.Math.exp(((-(0.5d - (c26102x49b6570.f296905y / d18))) * 2.0d) * 3.141592653589793d)) * 2.0d), ((d17 / d18) - 0.5d) * 360.0d);
    }

    /* renamed from: toPoint */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.p2991x3ebe6b6c.C26102x49b6570 m100076xba582bd5(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        double d17 = (c26041x873d1d26.f49502x83009af / 360.0d) + 0.5d;
        double sin = java.lang.Math.sin(java.lang.Math.toRadians(c26041x873d1d26.f49501xaa2bac6c));
        double log = ((java.lang.Math.log((sin + 1.0d) / (1.0d - sin)) * 0.5d) / (-6.283185307179586d)) + 0.5d;
        double d18 = this.f49851xf70885a1;
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.p2991x3ebe6b6c.C26102x49b6570(d17 * d18, log * d18);
    }

    public C26103x96456f6b(double d17) {
        this.f49851xf70885a1 = d17;
    }
}
