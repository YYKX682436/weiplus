package com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294;

/* renamed from: com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng */
/* loaded from: classes13.dex */
public class C4292x85cd0d1d implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d> f16790x681a0c0c = new android.os.Parcelable.Creator<com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d>() { // from class: com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng.1
        private static com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d a(android.os.Parcel parcel) {
            return new com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d createFromParcel(android.os.Parcel parcel) {
            return new com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d[] newArray(int i17) {
            return new com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d[i17];
        }

        private static com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d[] a(int i17) {
            return new com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d[i17];
        }
    };

    /* renamed from: DEFAULT_INTENSITY */
    private static final double f16791xe5240f75 = 1.0d;

    /* renamed from: mIntensity */
    private double f16792x987a6246;

    /* renamed from: mPoint */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 f16793xbe9ba123;

    public C4292x85cd0d1d(android.os.Parcel parcel) {
        this.f16793xbe9ba123 = (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26) parcel.readParcelable(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26.class.getClassLoader());
        this.f16792x987a6246 = parcel.readDouble();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean mo35582xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26 = this.f16793xbe9ba123;
        if (c26041x873d1d26 != null) {
            com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d c4292x85cd0d1d = (com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d) obj;
            return c26041x873d1d26.m99507xb2c87fbf(c4292x85cd0d1d.f16793xbe9ba123) && this.f16792x987a6246 == c4292x85cd0d1d.f16792x987a6246;
        }
        com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d c4292x85cd0d1d2 = (com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d) obj;
        return c4292x85cd0d1d2.f16793xbe9ba123 == null && this.f16792x987a6246 == c4292x85cd0d1d2.f16792x987a6246;
    }

    /* renamed from: getIntensity */
    public double m35662x1d30897d() {
        return this.f16792x987a6246;
    }

    /* renamed from: getPoint */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 m35663x74fbfbda() {
        return this.f16793xbe9ba123;
    }

    /* renamed from: hashCode */
    public int m35664x8cdac1b() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26 = this.f16793xbe9ba123;
        return c26041x873d1d26 != null ? c26041x873d1d26.m99511x8cdac1b() + ((int) (this.f16792x987a6246 * 1000000.0d)) : (int) (this.f16792x987a6246 * 1000000.0d);
    }

    /* renamed from: setIntensity */
    public void m35665x798449f1(double d17) {
        if (d17 >= 0.0d) {
            this.f16792x987a6246 = d17;
        } else {
            this.f16792x987a6246 = 1.0d;
        }
    }

    /* renamed from: setPoint */
    public void m35666x538a164e(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        this.f16793xbe9ba123 = c26041x873d1d26;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeParcelable(this.f16793xbe9ba123, i17);
        parcel.writeDouble(this.f16792x987a6246);
    }

    public C4292x85cd0d1d(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, double d17) {
        m35666x538a164e(c26041x873d1d26);
        m35665x798449f1(d17);
    }

    public C4292x85cd0d1d(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        this(c26041x873d1d26, 1.0d);
    }
}
