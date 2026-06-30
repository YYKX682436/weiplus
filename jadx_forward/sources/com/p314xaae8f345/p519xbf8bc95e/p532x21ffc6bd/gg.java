package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public class gg {

    /* renamed from: d, reason: collision with root package name */
    final double f131112d;

    public gg(double d17) {
        this.f131112d = d17;
    }

    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu fuVar) {
        double d17 = fuVar.f131000a;
        double d18 = this.f131112d;
        double d19 = ((d17 / d18) - 0.5d) * 360.0d;
        double degrees = 90.0d - java.lang.Math.toDegrees(java.lang.Math.atan(java.lang.Math.exp(((-(0.5d - (fuVar.f131001b / d18))) * 2.0d) * 3.141592653589793d)) * 2.0d);
        if (java.lang.Double.isNaN(degrees)) {
            degrees = 0.0d;
        }
        if (java.lang.Double.isNaN(d19)) {
            d19 = 0.0d;
        }
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(degrees, d19);
    }

    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu d(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        double d17 = (c26041x873d1d26.f49502x83009af / 360.0d) + 0.5d;
        double sin = java.lang.Math.sin(java.lang.Math.toRadians(c26041x873d1d26.f49501xaa2bac6c));
        double log = ((java.lang.Math.log((sin + 1.0d) / (1.0d - sin)) * 0.5d) / (-6.283185307179586d)) + 0.5d;
        double d18 = this.f131112d;
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu(d17 * d18, log * d18);
    }
}
