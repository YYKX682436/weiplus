package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29;

/* renamed from: com.tencent.tencentmap.mapsdk.maps.model.LatLng */
/* loaded from: classes13.dex */
public class C26041x873d1d26 implements android.os.Parcelable, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> f49499x681a0c0c = new android.os.Parcelable.Creator<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26>() { // from class: com.tencent.tencentmap.mapsdk.maps.model.LatLng.1
        private static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 a(android.os.Parcel parcel) {
            return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 createFromParcel(android.os.Parcel parcel) {
            return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26[] newArray(int i17) {
            return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26[i17];
        }

        private static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26[] a(int i17) {
            return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26[i17];
        }
    };

    /* renamed from: altitude */
    public double f49500x79634aa2;

    /* renamed from: latitude */
    public double f49501xaa2bac6c;

    /* renamed from: longitude */
    public double f49502x83009af;

    /* renamed from: throwException */
    private boolean f49503x97e4ac09;

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.model.LatLng$Builder */
    /* loaded from: classes13.dex */
    public static class Builder {

        /* renamed from: mAltitude */
        private double f49504x9e60f22f;

        /* renamed from: mLatitude */
        private double f49505xcf2953f9;

        /* renamed from: mLongitude */
        private double f49506x82e753c2;

        /* renamed from: mThrowException */
        private final boolean f49507x9e97b5d6;

        public Builder(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, boolean z17) {
            if (c26041x873d1d26 != null) {
                this.f49506x82e753c2 = c26041x873d1d26.m99510x79d7af9();
                this.f49505xcf2953f9 = c26041x873d1d26.m99509x2605e9e2();
                this.f49504x9e60f22f = c26041x873d1d26.m99508xf53d8818();
            }
            this.f49507x9e97b5d6 = z17;
        }

        /* renamed from: build */
        public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 m99520x59bc66e() {
            return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(this.f49505xcf2953f9, this.f49506x82e753c2, this.f49504x9e60f22f, this.f49507x9e97b5d6);
        }

        /* renamed from: setAltitude */
        public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26.Builder m99521xeff5e924(double d17) {
            this.f49504x9e60f22f = d17;
            return this;
        }

        /* renamed from: setLatitude */
        public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26.Builder m99522x20be4aee(double d17) {
            this.f49505xcf2953f9 = d17;
            return this;
        }

        /* renamed from: setLongitude */
        public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26.Builder m99523x63f13b6d(double d17) {
            this.f49506x82e753c2 = d17;
            return this;
        }
    }

    public C26041x873d1d26() {
        this.f49500x79634aa2 = 0.0d;
        this.f49503x97e4ac09 = false;
        this.f49501xaa2bac6c = 0.0d;
        this.f49502x83009af = 0.0d;
    }

    /* renamed from: doThrowException */
    private void m99501x6f493574(double d17, double d18, double d19, boolean z17) {
        this.f49503x97e4ac09 = z17;
        if (z17) {
            m99515x4f1d0a97(d17);
            m99517x5a45b0d6(d18);
        } else {
            m99514x20be4aee(d17);
            m99516x63f13b6d(d18);
        }
        m99513xeff5e924(d19);
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26.Builder m99502x3136c9db() {
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26.Builder(null, false);
    }

    /* renamed from: newBuilderThrowException */
    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26.Builder m99504x5c0266c4() {
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26.Builder(null, true);
    }

    /* renamed from: wrap */
    public static double m99506x37d04a(double d17, double d18, double d19) {
        double d27 = d19 - d18;
        double d28 = (((d17 - d18) % d27) + d27) % d27;
        return (d17 < d19 || d28 != 0.0d) ? d28 + d18 : d19;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m99507xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26 = (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26) obj;
            if (java.lang.Double.compare(c26041x873d1d26.f49500x79634aa2, this.f49500x79634aa2) == 0 && java.lang.Double.compare(c26041x873d1d26.f49501xaa2bac6c, this.f49501xaa2bac6c) == 0 && java.lang.Double.compare(c26041x873d1d26.f49502x83009af, this.f49502x83009af) == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: getAltitude */
    public double m99508xf53d8818() {
        return this.f49500x79634aa2;
    }

    /* renamed from: getLatitude */
    public double m99509x2605e9e2() {
        return this.f49501xaa2bac6c;
    }

    /* renamed from: getLongitude */
    public double m99510x79d7af9() {
        return this.f49502x83009af;
    }

    /* renamed from: hashCode */
    public int m99511x8cdac1b() {
        long doubleToLongBits = java.lang.Double.doubleToLongBits(this.f49501xaa2bac6c);
        long doubleToLongBits2 = java.lang.Double.doubleToLongBits(this.f49502x83009af);
        int i17 = (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        long doubleToLongBits3 = java.lang.Double.doubleToLongBits(this.f49500x79634aa2);
        return (i17 * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3));
    }

    /* renamed from: isThrowException */
    public boolean m99512x3e9033d3() {
        return this.f49503x97e4ac09;
    }

    /* renamed from: setAltitude */
    public void m99513xeff5e924(double d17) {
        this.f49500x79634aa2 = d17;
    }

    /* renamed from: setLatitude */
    public void m99514x20be4aee(double d17) {
        if (java.lang.Double.isNaN(d17)) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d("latitude must not be NaN");
        } else if (java.lang.Math.abs(d17) > 90.0d) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d("latitude must be between -90 and 90");
        } else {
            this.f49501xaa2bac6c = d17;
        }
    }

    /* renamed from: setLatitudeThrowException */
    public void m99515x4f1d0a97(double d17) {
        if (java.lang.Double.isNaN(d17)) {
            throw new java.lang.IllegalArgumentException("latitude must not be NaN");
        }
        if (java.lang.Math.abs(d17) > 90.0d) {
            throw new java.lang.IllegalArgumentException("latitude must be between -90 and 90");
        }
        this.f49501xaa2bac6c = d17;
    }

    /* renamed from: setLongitude */
    public void m99516x63f13b6d(double d17) {
        if (java.lang.Double.isNaN(d17)) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d("longitude must not be NaN");
        } else if (java.lang.Double.isInfinite(d17)) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d("longitude must not be infinite");
        } else {
            this.f49502x83009af = d17;
        }
    }

    /* renamed from: setLongitudeThrowException */
    public void m99517x5a45b0d6(double d17) {
        if (java.lang.Double.isNaN(d17)) {
            throw new java.lang.IllegalArgumentException("longitude must not be NaN");
        }
        if (java.lang.Double.isInfinite(d17)) {
            throw new java.lang.IllegalArgumentException("longitude must not be infinite");
        }
        this.f49502x83009af = d17;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198
    /* renamed from: setX */
    public void mo36732x35d036(double d17) {
        this.f49501xaa2bac6c = d17;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198
    /* renamed from: setY */
    public void mo36733x35d037(double d17) {
        this.f49502x83009af = d17;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198
    /* renamed from: setZ */
    public void mo36734x35d038(double d17) {
        this.f49500x79634aa2 = d17;
    }

    /* renamed from: toString */
    public java.lang.String m99518x9616526c() {
        return "LatLng [latitude=" + this.f49501xaa2bac6c + ", longitude=" + this.f49502x83009af + ", altitude=" + this.f49500x79634aa2 + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeDouble(this.f49501xaa2bac6c);
        parcel.writeDouble(this.f49502x83009af);
        parcel.writeDouble(this.f49500x79634aa2);
        parcel.writeByte(this.f49503x97e4ac09 ? (byte) 1 : (byte) 0);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198
    public double x() {
        return this.f49501xaa2bac6c;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198
    public double y() {
        return this.f49502x83009af;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198
    public double z() {
        return this.f49500x79634aa2;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26.Builder m99503x3136c9db(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26.Builder(c26041x873d1d26, false);
    }

    /* renamed from: newBuilderThrowException */
    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26.Builder m99505x5c0266c4(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26.Builder(c26041x873d1d26, true);
    }

    /* renamed from: wrap */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 m99519x37d04a() {
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(this.f49501xaa2bac6c, m99506x37d04a(this.f49502x83009af, -180.0d, 180.0d));
    }

    public C26041x873d1d26(double d17, double d18) {
        this.f49500x79634aa2 = 0.0d;
        this.f49503x97e4ac09 = false;
        m99514x20be4aee(d17);
        m99516x63f13b6d(d18);
    }

    public C26041x873d1d26(double d17, double d18, double d19) {
        this.f49500x79634aa2 = 0.0d;
        this.f49503x97e4ac09 = false;
        m99514x20be4aee(d17);
        m99516x63f13b6d(d18);
        m99513xeff5e924(d19);
    }

    public C26041x873d1d26(double d17, double d18, double d19, boolean z17) {
        this.f49500x79634aa2 = 0.0d;
        this.f49503x97e4ac09 = false;
        m99501x6f493574(d17, d18, d19, z17);
    }

    public C26041x873d1d26(android.location.Location location) {
        this(location.getLatitude(), location.getLongitude(), location.getAltitude());
    }

    public C26041x873d1d26(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        this.f49500x79634aa2 = 0.0d;
        this.f49503x97e4ac09 = false;
        this.f49501xaa2bac6c = c26041x873d1d26.f49501xaa2bac6c;
        this.f49502x83009af = c26041x873d1d26.f49502x83009af;
        this.f49500x79634aa2 = c26041x873d1d26.f49500x79634aa2;
        this.f49503x97e4ac09 = c26041x873d1d26.f49503x97e4ac09;
    }

    public C26041x873d1d26(android.os.Parcel parcel) {
        this.f49500x79634aa2 = 0.0d;
        this.f49503x97e4ac09 = false;
        m99501x6f493574(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readByte() != 0);
    }
}
