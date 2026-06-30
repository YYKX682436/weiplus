package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class kq {
    public static double a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d262) {
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
        return java.lang.Math.asin(java.lang.Math.sqrt(d48 + ((d49 - sin4) * (d49 - sin4))) / 2.0d) * 1.27420015798544E7d;
    }

    private static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 b(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d262) {
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26((c26041x873d1d26.f49501xaa2bac6c * 2.0d) - c26041x873d1d262.f49501xaa2bac6c, (c26041x873d1d26.f49502x83009af * 2.0d) - c26041x873d1d262.f49502x83009af);
    }
}
