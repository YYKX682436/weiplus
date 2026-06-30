package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29;

/* renamed from: com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds */
/* loaded from: classes13.dex */
public class C26042xcb530b7b implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b> f49508x681a0c0c = new android.os.Parcelable.Creator<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b>() { // from class: com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds.1
        private static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b a(android.os.Parcel parcel) {
            return com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b.m99535xb362ce89(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b createFromParcel(android.os.Parcel parcel) {
            return com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b.m99535xb362ce89(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b[] newArray(int i17) {
            return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b[i17];
        }

        private static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b[] a(int i17) {
            return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b[i17];
        }
    };

    /* renamed from: latitudeNorth */
    private final double f49509x370a8ff9;

    /* renamed from: latitudeSouth */
    private final double f49510x375110c1;

    /* renamed from: longitudeEast */
    private final double f49511xf8c6724c;

    /* renamed from: longitudeWest */
    private final double f49512xf8ceaffe;

    /* renamed from: northeast */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 f49513x1a6ba282;

    /* renamed from: southwest */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 f49514x9e7cbcfc;

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds$Builder */
    /* loaded from: classes13.dex */
    public static final class Builder {

        /* renamed from: latLngList */
        private final java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> f49515xc4d062c4 = new java.util.ArrayList();

        /* renamed from: build */
        public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b m99563x59bc66e() {
            if (this.f49515xc4d062c4.size() >= 2) {
                return com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b.m99531xc65d23(this.f49515xc4d062c4);
            }
            throw new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2987x584fd04f.C25973x211b719d(this.f49515xc4d062c4.size());
        }

        /* renamed from: include */
        public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b.Builder m99565x73c954a8(java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> list) {
            this.f49515xc4d062c4.addAll(list);
            return this;
        }

        /* renamed from: include */
        public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b.Builder m99564x73c954a8(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
            this.f49515xc4d062c4.add(c26041x873d1d26);
            return this;
        }
    }

    public C26042xcb530b7b(double d17, double d18, double d19, double d27) {
        this.f49509x370a8ff9 = d17;
        this.f49511xf8c6724c = d18;
        this.f49510x375110c1 = d19;
        this.f49512xf8ceaffe = d27;
        this.f49513x1a6ba282 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(d17, d18);
        this.f49514x9e7cbcfc = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(d19, d27);
    }

    /* renamed from: builder */
    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b.Builder m99525xdc3ef9b() {
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b.Builder();
    }

    /* renamed from: checkParams */
    private static void m99526x27a5e4ae(double d17, double d18, double d19, double d27) {
        if (java.lang.Double.isNaN(d17) || java.lang.Double.isNaN(d19)) {
            throw new java.lang.IllegalArgumentException("latitude must not be NaN");
        }
        if (java.lang.Double.isNaN(d18) || java.lang.Double.isNaN(d27)) {
            throw new java.lang.IllegalArgumentException("longitude must not be NaN");
        }
        if (java.lang.Double.isInfinite(d18) || java.lang.Double.isInfinite(d27)) {
            throw new java.lang.IllegalArgumentException("longitude must not be infinite");
        }
        if (d17 > 90.0d || d17 < -90.0d || d19 > 90.0d || d19 < -90.0d) {
            throw new java.lang.IllegalArgumentException("latitude must be between -90 and 90");
        }
        if (d17 < d19) {
            throw new java.lang.IllegalArgumentException("latNorth cannot be less than latSouth");
        }
        if (d18 < d27) {
            throw new java.lang.IllegalArgumentException("lonEast cannot be less than lonWest");
        }
    }

    /* renamed from: containsLatitude */
    private boolean m99527x8ea6f7ab(double d17) {
        return d17 <= this.f49509x370a8ff9 && d17 >= this.f49510x375110c1;
    }

    /* renamed from: containsLongitude */
    private boolean m99528xb31e2650(double d17) {
        return d17 <= this.f49511xf8c6724c && d17 >= this.f49512xf8ceaffe;
    }

    /* renamed from: from */
    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b m99529x3017aa(double d17, double d18, double d19, double d27) {
        m99526x27a5e4ae(d17, d18, d19, d27);
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b(d17, d18, d19, d27);
    }

    /* renamed from: fromLatLngs */
    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b m99531xc65d23(java.util.List<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> list) {
        double d17 = Double.MAX_VALUE;
        double d18 = 90.0d;
        double d19 = -90.0d;
        double d27 = -1.7976931348623157E308d;
        for (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26 : list) {
            if (c26041x873d1d26 != null) {
                double m99509x2605e9e2 = c26041x873d1d26.m99509x2605e9e2();
                double m99510x79d7af9 = c26041x873d1d26.m99510x79d7af9();
                d18 = java.lang.Math.min(d18, m99509x2605e9e2);
                d17 = java.lang.Math.min(d17, m99510x79d7af9);
                d19 = java.lang.Math.max(d19, m99509x2605e9e2);
                d27 = java.lang.Math.max(d27, m99510x79d7af9);
            }
        }
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b(d19, d27, d18, d17);
    }

    /* renamed from: intersectNoParamCheck */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b m99532x8789bdb(double d17, double d18, double d19, double d27) {
        double max = java.lang.Math.max(this.f49512xf8ceaffe, d27);
        double min = java.lang.Math.min(this.f49511xf8c6724c, d18);
        if (min < max) {
            return null;
        }
        double max2 = java.lang.Math.max(this.f49510x375110c1, d19);
        double min2 = java.lang.Math.min(this.f49509x370a8ff9, d17);
        if (min2 >= max2) {
            return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b(min2, min, max2, max);
        }
        return null;
    }

    /* renamed from: lat_ */
    private static double m99533x3292a0(int i17, int i18) {
        double pow = 3.141592653589793d - ((i18 * 6.283185307179586d) / java.lang.Math.pow(2.0d, i17));
        return java.lang.Math.toDegrees(java.lang.Math.atan((java.lang.Math.exp(pow) - java.lang.Math.exp(-pow)) * 0.5d));
    }

    /* renamed from: lon_ */
    private static double m99534x32c674(int i17, int i18) {
        return ((i18 / java.lang.Math.pow(2.0d, i17)) * 360.0d) - 180.0d;
    }

    /* renamed from: readFromParcel */
    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b m99535xb362ce89(android.os.Parcel parcel) {
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
    }

    /* renamed from: unionNoParamCheck */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b m99536x8854858b(double d17, double d18, double d19, double d27) {
        double d28 = this.f49509x370a8ff9;
        double d29 = d28 < d17 ? d17 : d28;
        double d37 = this.f49511xf8c6724c;
        if (d37 < d18) {
            d37 = d18;
        }
        double d38 = this.f49510x375110c1;
        if (d38 > d19) {
            d38 = d19;
        }
        double d39 = this.f49512xf8ceaffe;
        if (d39 > d27) {
            d39 = d27;
        }
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b(d29, d37, d38, d39);
    }

    /* renamed from: world */
    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b m99537x6c11b92() {
        return m99529x3017aa(90.0d, 180.0d, -90.0d, -180.0d);
    }

    /* renamed from: contains */
    public boolean m99538xde2d761f(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        return m99527x8ea6f7ab(c26041x873d1d26.m99509x2605e9e2()) && m99528xb31e2650(c26041x873d1d26.m99510x79d7af9());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m99540xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b c26042xcb530b7b = (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b) obj;
            if (this.f49509x370a8ff9 == c26042xcb530b7b.m99542x2487201c() && this.f49510x375110c1 == c26042xcb530b7b.m99543x24cda0e4() && this.f49511xf8c6724c == c26042xcb530b7b.m99545x528719b2() && this.f49512xf8ceaffe == c26042xcb530b7b.m99546x528f5764()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: getCenter */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 m99541x13c9ef4b() {
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26((this.f49509x370a8ff9 + this.f49510x375110c1) / 2.0d, (this.f49511xf8c6724c + this.f49512xf8ceaffe) / 2.0d);
    }

    /* renamed from: getLatNorth */
    public double m99542x2487201c() {
        return this.f49509x370a8ff9;
    }

    /* renamed from: getLatSouth */
    public double m99543x24cda0e4() {
        return this.f49510x375110c1;
    }

    /* renamed from: getLatitudeSpan */
    public double m99544x7b81944c() {
        return java.lang.Math.abs(this.f49509x370a8ff9 - this.f49510x375110c1);
    }

    /* renamed from: getLonEast */
    public double m99545x528719b2() {
        return this.f49511xf8c6724c;
    }

    /* renamed from: getLonWest */
    public double m99546x528f5764() {
        return this.f49512xf8ceaffe;
    }

    /* renamed from: getLongitudeSpan */
    public double m99547xb62cc1e3() {
        return java.lang.Math.abs(this.f49511xf8c6724c - this.f49512xf8ceaffe);
    }

    /* renamed from: getNorthEast */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 m99548x19ca87ec() {
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(this.f49509x370a8ff9, this.f49511xf8c6724c);
    }

    /* renamed from: getNorthWest */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 m99549x19d2c59e() {
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(this.f49509x370a8ff9, this.f49512xf8ceaffe);
    }

    /* renamed from: getSouthEast */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 m99550x9dd364b4() {
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(this.f49510x375110c1, this.f49511xf8c6724c);
    }

    /* renamed from: getSouthWest */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 m99551x9ddba266() {
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(this.f49510x375110c1, this.f49512xf8ceaffe);
    }

    /* renamed from: getSpan */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26045x3ba58590 m99552xfb855fc0() {
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26045x3ba58590(m99544x7b81944c(), m99547xb62cc1e3());
    }

    /* renamed from: hashCode */
    public int m99553x8cdac1b() {
        return (int) (this.f49509x370a8ff9 + 90.0d + ((this.f49510x375110c1 + 90.0d) * 1000.0d) + ((this.f49511xf8c6724c + 180.0d) * 1000000.0d) + ((this.f49512xf8ceaffe + 180.0d) * 1.0E9d));
    }

    /* renamed from: include */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b m99554x73c954a8(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b.Builder().m99564x73c954a8(m99548x19ca87ec()).m99564x73c954a8(m99551x9ddba266()).m99564x73c954a8(c26041x873d1d26).m99563x59bc66e();
    }

    /* renamed from: including */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b m99555xa6c6e765(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        return m99554x73c954a8(c26041x873d1d26);
    }

    /* renamed from: intersect */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b m99557x1dfb651f(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b c26042xcb530b7b) {
        return m99532x8789bdb(c26042xcb530b7b.m99542x2487201c(), c26042xcb530b7b.m99545x528719b2(), c26042xcb530b7b.m99543x24cda0e4(), c26042xcb530b7b.m99546x528f5764());
    }

    /* renamed from: isEmptySpan */
    public boolean m99558xf199c42d() {
        return m99547xb62cc1e3() == 0.0d || m99544x7b81944c() == 0.0d;
    }

    /* renamed from: toLatLngs */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26[] m99559x9a0b4932() {
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26[]{m99548x19ca87ec(), m99551x9ddba266()};
    }

    /* renamed from: toString */
    public java.lang.String m99560x9616526c() {
        return "N:" + this.f49509x370a8ff9 + "; E:" + this.f49511xf8c6724c + "; S:" + this.f49510x375110c1 + "; W:" + this.f49512xf8ceaffe;
    }

    /* renamed from: union */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b m99562x6a456cf(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b c26042xcb530b7b) {
        return m99536x8854858b(c26042xcb530b7b.m99542x2487201c(), c26042xcb530b7b.m99545x528719b2(), c26042xcb530b7b.m99543x24cda0e4(), c26042xcb530b7b.m99546x528f5764());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeDouble(this.f49509x370a8ff9);
        parcel.writeDouble(this.f49511xf8c6724c);
        parcel.writeDouble(this.f49510x375110c1);
        parcel.writeDouble(this.f49512xf8ceaffe);
    }

    /* renamed from: intersect */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b m99556x1dfb651f(double d17, double d18, double d19, double d27) {
        m99526x27a5e4ae(d17, d18, d19, d27);
        return m99532x8789bdb(d17, d18, d19, d27);
    }

    /* renamed from: from */
    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b m99530x3017aa(int i17, int i18, int i19) {
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b(m99533x3292a0(i17, i19), m99534x32c674(i17, i18 + 1), m99533x3292a0(i17, i19 + 1), m99534x32c674(i17, i18));
    }

    /* renamed from: contains */
    public boolean m99539xde2d761f(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b c26042xcb530b7b) {
        return m99538xde2d761f(c26042xcb530b7b.m99548x19ca87ec()) && m99538xde2d761f(c26042xcb530b7b.m99551x9ddba266());
    }

    /* renamed from: union */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b m99561x6a456cf(double d17, double d18, double d19, double d27) {
        m99526x27a5e4ae(d17, d18, d19, d27);
        return m99536x8854858b(d17, d18, d19, d27);
    }

    public C26042xcb530b7b(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d262) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b m99563x59bc66e = m99525xdc3ef9b().m99564x73c954a8(c26041x873d1d26).m99564x73c954a8(c26041x873d1d262).m99563x59bc66e();
        this.f49509x370a8ff9 = m99563x59bc66e.f49509x370a8ff9;
        this.f49510x375110c1 = m99563x59bc66e.f49510x375110c1;
        this.f49511xf8c6724c = m99563x59bc66e.f49511xf8c6724c;
        this.f49512xf8ceaffe = m99563x59bc66e.f49512xf8ceaffe;
        this.f49513x1a6ba282 = m99563x59bc66e.f49513x1a6ba282;
        this.f49514x9e7cbcfc = m99563x59bc66e.f49514x9e7cbcfc;
    }
}
