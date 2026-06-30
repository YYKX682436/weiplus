package com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294;

/* renamed from: com.tencent.map.sdk.utilities.visualization.datamodels.ScatterLatLng */
/* loaded from: classes13.dex */
public class C4289xaab98d44 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4289xaab98d44> f16779x681a0c0c = new android.os.Parcelable.Creator<com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4289xaab98d44>() { // from class: com.tencent.map.sdk.utilities.visualization.datamodels.ScatterLatLng.1
        private static com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4289xaab98d44 a(android.os.Parcel parcel) {
            return new com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4289xaab98d44(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4289xaab98d44 createFromParcel(android.os.Parcel parcel) {
            return new com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4289xaab98d44(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4289xaab98d44[] newArray(int i17) {
            return new com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4289xaab98d44[i17];
        }

        private static com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4289xaab98d44[] a(int i17) {
            return new com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4289xaab98d44[i17];
        }
    };

    /* renamed from: DEFAULT_INTENSITY */
    private static final double f16780xe5240f75 = 1.0d;

    /* renamed from: DEFAULT_TYPE */
    private static final int f16781x65200a98 = 0;

    /* renamed from: mIntensity */
    private double f16782x987a6246;

    /* renamed from: mPoint */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 f16783xbe9ba123;

    /* renamed from: mType */
    private int f16784x6280547;

    public C4289xaab98d44(android.os.Parcel parcel) {
        this.f16783xbe9ba123 = (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26) parcel.readParcelable(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26.class.getClassLoader());
        this.f16784x6280547 = parcel.readInt();
        this.f16782x987a6246 = parcel.readDouble();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m35645xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4289xaab98d44)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26 = this.f16783xbe9ba123;
        if (c26041x873d1d26 != null) {
            com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4289xaab98d44 c4289xaab98d44 = (com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4289xaab98d44) obj;
            return c26041x873d1d26.m99507xb2c87fbf(c4289xaab98d44.f16783xbe9ba123) && this.f16784x6280547 == c4289xaab98d44.f16784x6280547 && this.f16782x987a6246 == c4289xaab98d44.f16782x987a6246;
        }
        com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4289xaab98d44 c4289xaab98d442 = (com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4289xaab98d44) obj;
        return c4289xaab98d442.f16783xbe9ba123 == null && this.f16784x6280547 == c4289xaab98d442.f16784x6280547 && this.f16782x987a6246 == c4289xaab98d442.f16782x987a6246;
    }

    /* renamed from: getIntensity */
    public double m35646x1d30897d() {
        return this.f16782x987a6246;
    }

    /* renamed from: getPoint */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 m35647x74fbfbda() {
        return this.f16783xbe9ba123;
    }

    /* renamed from: getType */
    public int m35648xfb85f7b0() {
        return this.f16784x6280547;
    }

    /* renamed from: hashCode */
    public int m35649x8cdac1b() {
        int i17;
        double d17;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26 = this.f16783xbe9ba123;
        if (c26041x873d1d26 != null) {
            i17 = c26041x873d1d26.m99511x8cdac1b() + ((int) (this.f16784x6280547 * 1000000.0d));
            d17 = this.f16782x987a6246;
        } else {
            i17 = (int) (this.f16784x6280547 * 1000000.0d);
            d17 = this.f16782x987a6246;
        }
        return i17 + ((int) (d17 * 1000000.0d));
    }

    /* renamed from: setIntensity */
    public void m35650x798449f1(double d17) {
        this.f16782x987a6246 = d17;
    }

    /* renamed from: setPoint */
    public void m35651x538a164e(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        this.f16783xbe9ba123 = c26041x873d1d26;
    }

    /* renamed from: setType */
    public void m35652x7650bebc(int i17) {
        this.f16784x6280547 = i17;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeParcelable(this.f16783xbe9ba123, i17);
        parcel.writeInt(this.f16784x6280547);
        parcel.writeDouble(this.f16782x987a6246);
    }

    public C4289xaab98d44(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, int i17) {
        m35651x538a164e(c26041x873d1d26);
        m35652x7650bebc(i17);
        m35650x798449f1(1.0d);
    }

    public C4289xaab98d44(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, double d17) {
        m35651x538a164e(c26041x873d1d26);
        m35652x7650bebc(0);
        m35650x798449f1(d17);
    }

    public C4289xaab98d44(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, int i17, double d17) {
        m35651x538a164e(c26041x873d1d26);
        m35652x7650bebc(i17);
        m35650x798449f1(d17);
    }

    public C4289xaab98d44(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        this(c26041x873d1d26, 0, 1.0d);
    }
}
