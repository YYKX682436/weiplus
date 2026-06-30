package com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29;

/* renamed from: com.tencent.mapsdk.raster.model.LatLngBounds */
/* loaded from: classes13.dex */
public class C4407xcb530b7b {

    /* renamed from: mVersionCode */
    private int f17438xd3182438;

    /* renamed from: northeast */
    private com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 f17439x1a6ba282;

    /* renamed from: southwest */
    private com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 f17440x9e7cbcfc;

    public C4407xcb530b7b(int i17, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d26, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d262) {
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4407xcb530b7b.Builder m37223x73c954a8 = new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4407xcb530b7b.Builder().m37223x73c954a8(c4406x873d1d26).m37223x73c954a8(c4406x873d1d262);
        this.f17440x9e7cbcfc = new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26(m37223x73c954a8.f17443xbec61560, m37223x73c954a8.f17444x62917bc);
        this.f17439x1a6ba282 = new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26(m37223x73c954a8.f17442xbe7f9498, m37223x73c954a8.f17441x620da0a);
        this.f17438xd3182438 = i17;
    }

    /* renamed from: builder */
    public static com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4407xcb530b7b.Builder m37201xdc3ef9b() {
        return new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4407xcb530b7b.Builder();
    }

    /* renamed from: containsLatitude */
    private boolean m37202x8ea6f7ab(double d17) {
        return this.f17440x9e7cbcfc.m37195x2605e9e2() <= d17 && d17 <= this.f17439x1a6ba282.m37195x2605e9e2();
    }

    /* renamed from: containsLongitude */
    private boolean m37203xb31e2650(double d17) {
        return this.f17440x9e7cbcfc.m37196x79d7af9() <= this.f17439x1a6ba282.m37196x79d7af9() ? this.f17440x9e7cbcfc.m37196x79d7af9() <= d17 && d17 <= this.f17439x1a6ba282.m37196x79d7af9() : this.f17440x9e7cbcfc.m37196x79d7af9() <= d17 || d17 <= this.f17439x1a6ba282.m37196x79d7af9();
    }

    /* renamed from: intersect */
    private boolean m37204x1dfb651f(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4407xcb530b7b c4407xcb530b7b) {
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d26;
        if (c4407xcb530b7b == null || (c4406x873d1d26 = c4407xcb530b7b.f17439x1a6ba282) == null || c4407xcb530b7b.f17440x9e7cbcfc == null || this.f17439x1a6ba282 == null || this.f17440x9e7cbcfc == null) {
            return false;
        }
        return java.lang.Math.abs(((c4406x873d1d26.m37196x79d7af9() + c4407xcb530b7b.f17440x9e7cbcfc.m37196x79d7af9()) - this.f17439x1a6ba282.m37196x79d7af9()) - this.f17440x9e7cbcfc.m37196x79d7af9()) < ((this.f17439x1a6ba282.m37196x79d7af9() - this.f17440x9e7cbcfc.m37196x79d7af9()) + c4407xcb530b7b.f17439x1a6ba282.m37196x79d7af9()) - c4407xcb530b7b.f17440x9e7cbcfc.m37196x79d7af9() && java.lang.Math.abs(((c4407xcb530b7b.f17439x1a6ba282.m37195x2605e9e2() + c4407xcb530b7b.f17440x9e7cbcfc.m37195x2605e9e2()) - this.f17439x1a6ba282.m37195x2605e9e2()) - this.f17440x9e7cbcfc.m37195x2605e9e2()) < ((this.f17439x1a6ba282.m37195x2605e9e2() - this.f17440x9e7cbcfc.m37195x2605e9e2()) + c4407xcb530b7b.f17439x1a6ba282.m37195x2605e9e2()) - c4407xcb530b7b.f17440x9e7cbcfc.m37195x2605e9e2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: longitudeDistanceHeadingEast */
    public static double m37205xbbcaafbb(double d17, double d18) {
        return ((d18 - d17) + 360.0d) % 360.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: longitudeDistanceHeadingWest */
    public static double m37206xbbd2ed6d(double d17, double d18) {
        return ((d17 - d18) + 360.0d) % 360.0d;
    }

    /* renamed from: contains */
    public boolean m37207xde2d761f(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d26) {
        return m37202x8ea6f7ab(c4406x873d1d26.m37195x2605e9e2()) && m37203xb31e2650(c4406x873d1d26.m37196x79d7af9());
    }

    /* renamed from: equals */
    public boolean m37209xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4407xcb530b7b)) {
            return false;
        }
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4407xcb530b7b c4407xcb530b7b = (com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4407xcb530b7b) obj;
        return this.f17440x9e7cbcfc.m37194xb2c87fbf(c4407xcb530b7b.f17440x9e7cbcfc) && this.f17439x1a6ba282.m37194xb2c87fbf(c4407xcb530b7b.f17439x1a6ba282);
    }

    /* renamed from: getNortheast */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 m37210x19d913cc() {
        return this.f17439x1a6ba282;
    }

    /* renamed from: getSouthwest */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 m37211x9dea2e46() {
        return this.f17440x9e7cbcfc;
    }

    /* renamed from: getVersionCode */
    public int m37212x2e159af() {
        return this.f17438xd3182438;
    }

    /* renamed from: hashCode */
    public int m37213x8cdac1b() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.f17440x9e7cbcfc, this.f17439x1a6ba282});
    }

    /* renamed from: including */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4407xcb530b7b m37214xa6c6e765(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d26) {
        double min = java.lang.Math.min(this.f17440x9e7cbcfc.m37195x2605e9e2(), c4406x873d1d26.m37195x2605e9e2());
        double max = java.lang.Math.max(this.f17439x1a6ba282.m37195x2605e9e2(), c4406x873d1d26.m37195x2605e9e2());
        double m37196x79d7af9 = this.f17439x1a6ba282.m37196x79d7af9();
        double m37196x79d7af92 = this.f17440x9e7cbcfc.m37196x79d7af9();
        double m37196x79d7af93 = c4406x873d1d26.m37196x79d7af9();
        if (!m37203xb31e2650(m37196x79d7af93)) {
            if (m37206xbbd2ed6d(m37196x79d7af92, m37196x79d7af93) < m37205xbbcaafbb(m37196x79d7af9, m37196x79d7af93)) {
                m37196x79d7af92 = m37196x79d7af93;
            } else {
                m37196x79d7af9 = m37196x79d7af93;
            }
        }
        return new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4407xcb530b7b(new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26(min, m37196x79d7af92), new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26(max, m37196x79d7af9));
    }

    /* renamed from: intersects */
    public boolean m37215xa1713f34(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4407xcb530b7b c4407xcb530b7b) {
        if (c4407xcb530b7b == null) {
            return false;
        }
        return m37204x1dfb651f(c4407xcb530b7b) || c4407xcb530b7b.m37204x1dfb651f(this);
    }

    /* renamed from: toString */
    public java.lang.String m37216x9616526c() {
        return "southwest" + this.f17440x9e7cbcfc + "northeast" + this.f17439x1a6ba282;
    }

    /* renamed from: contains */
    public boolean m37208xde2d761f(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4407xcb530b7b c4407xcb530b7b) {
        return c4407xcb530b7b != null && m37207xde2d761f(c4407xcb530b7b.f17440x9e7cbcfc) && m37207xde2d761f(c4407xcb530b7b.f17439x1a6ba282);
    }

    public C4407xcb530b7b(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d26, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d262) {
        this(1, c4406x873d1d26, c4406x873d1d262);
    }

    /* renamed from: com.tencent.mapsdk.raster.model.LatLngBounds$Builder */
    /* loaded from: classes13.dex */
    public static final class Builder {

        /* renamed from: mSouth */
        private double f17443xbec61560 = Double.POSITIVE_INFINITY;

        /* renamed from: mNorth */
        private double f17442xbe7f9498 = Double.NEGATIVE_INFINITY;

        /* renamed from: mWest */
        private double f17444x62917bc = Double.NaN;

        /* renamed from: mEast */
        private double f17441x620da0a = Double.NaN;

        /* renamed from: containsLongitude */
        private boolean m37221xb31e2650(double d17) {
            double d18 = this.f17444x62917bc;
            double d19 = this.f17441x620da0a;
            return d18 <= d19 ? d18 <= d17 && d17 <= d19 : d18 <= d17 || d17 <= d19;
        }

        /* renamed from: build */
        public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4407xcb530b7b m37222x59bc66e() {
            return new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4407xcb530b7b(new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26(this.f17443xbec61560, this.f17444x62917bc), new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26(this.f17442xbe7f9498, this.f17441x620da0a));
        }

        /* renamed from: include */
        public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4407xcb530b7b.Builder m37223x73c954a8(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d26) {
            this.f17443xbec61560 = java.lang.Math.min(this.f17443xbec61560, c4406x873d1d26.m37195x2605e9e2());
            this.f17442xbe7f9498 = java.lang.Math.max(this.f17442xbe7f9498, c4406x873d1d26.m37195x2605e9e2());
            double m37196x79d7af9 = c4406x873d1d26.m37196x79d7af9();
            if (java.lang.Double.isNaN(this.f17444x62917bc)) {
                this.f17444x62917bc = m37196x79d7af9;
                this.f17441x620da0a = m37196x79d7af9;
            } else if (!m37221xb31e2650(m37196x79d7af9)) {
                if (com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4407xcb530b7b.m37206xbbd2ed6d(this.f17444x62917bc, m37196x79d7af9) < com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4407xcb530b7b.m37205xbbcaafbb(this.f17441x620da0a, m37196x79d7af9)) {
                    this.f17444x62917bc = m37196x79d7af9;
                } else {
                    this.f17441x620da0a = m37196x79d7af9;
                }
            }
            return this;
        }

        /* renamed from: include */
        public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4407xcb530b7b.Builder m37224x73c954a8(java.lang.Iterable<com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26> iterable) {
            if (iterable != null) {
                java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26> it = iterable.iterator();
                while (it.hasNext()) {
                    m37223x73c954a8(it.next());
                }
            }
            return this;
        }
    }
}
