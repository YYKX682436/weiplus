package com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29;

/* renamed from: com.tencent.mapsdk.raster.model.LatLng */
/* loaded from: classes13.dex */
public final class C4406x873d1d26 implements java.lang.Cloneable {

    /* renamed from: df, reason: collision with root package name */
    private static java.text.DecimalFormat f134023df = new java.text.DecimalFormat("0.000000", new java.text.DecimalFormatSymbols(java.util.Locale.US));

    /* renamed from: latitude */
    private final double f17436xaa2bac6c;

    /* renamed from: longitude */
    private final double f17437x83009af;

    public C4406x873d1d26(double d17, double d18) {
        if (-180.0d > d18 || d18 >= 180.0d) {
            this.f17437x83009af = m37191xbdb47064(((((d18 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d);
        } else {
            this.f17437x83009af = m37191xbdb47064(d18);
        }
        this.f17436xaa2bac6c = m37191xbdb47064(java.lang.Math.max(-85.0d, java.lang.Math.min(85.0d, d17)));
    }

    /* renamed from: parseDouble */
    private static double m37191xbdb47064(double d17) {
        return java.lang.Double.parseDouble(f134023df.format(d17));
    }

    /* renamed from: equals */
    public boolean m37194xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26)) {
            return false;
        }
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d26 = (com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26) obj;
        return java.lang.Double.doubleToLongBits(this.f17436xaa2bac6c) == java.lang.Double.doubleToLongBits(c4406x873d1d26.f17436xaa2bac6c) && java.lang.Double.doubleToLongBits(this.f17437x83009af) == java.lang.Double.doubleToLongBits(c4406x873d1d26.f17437x83009af);
    }

    /* renamed from: getLatitude */
    public double m37195x2605e9e2() {
        return this.f17436xaa2bac6c;
    }

    /* renamed from: getLongitude */
    public double m37196x79d7af9() {
        return this.f17437x83009af;
    }

    /* renamed from: hashCode */
    public int m37197x8cdac1b() {
        long doubleToLongBits = java.lang.Double.doubleToLongBits(this.f17436xaa2bac6c);
        int i17 = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31;
        long doubleToLongBits2 = java.lang.Double.doubleToLongBits(this.f17437x83009af);
        return (i17 * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2));
    }

    /* renamed from: toString */
    public java.lang.String m37198x9616526c() {
        return "lat/lng: (" + this.f17436xaa2bac6c + "," + this.f17437x83009af + ")";
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 m37193x5a5dd5d() {
        return new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26(this.f17436xaa2bac6c, this.f17437x83009af);
    }
}
