package com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294;

/* renamed from: com.tencent.map.sdk.utilities.visualization.datamodels.TimeLatLng */
/* loaded from: classes13.dex */
public class C4290x991d3e53 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4290x991d3e53> f16785x681a0c0c = new android.os.Parcelable.Creator<com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4290x991d3e53>() { // from class: com.tencent.map.sdk.utilities.visualization.datamodels.TimeLatLng.1
        private static com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4290x991d3e53 a(android.os.Parcel parcel) {
            return new com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4290x991d3e53(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4290x991d3e53 createFromParcel(android.os.Parcel parcel) {
            return new com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4290x991d3e53(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4290x991d3e53[] newArray(int i17) {
            return new com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4290x991d3e53[i17];
        }

        private static com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4290x991d3e53[] a(int i17) {
            return new com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4290x991d3e53[i17];
        }
    };

    /* renamed from: DEFAULT_TIME */
    private static final int f16786x651fce2b = 0;

    /* renamed from: mPoint */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 f16787xbe9ba123;

    /* renamed from: mTime */
    private int f16788x627c8da;

    public C4290x991d3e53(android.os.Parcel parcel) {
        this.f16787xbe9ba123 = (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26) parcel.readParcelable(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26.class.getClassLoader());
        this.f16788x627c8da = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m35654xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4290x991d3e53)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26 = this.f16787xbe9ba123;
        if (c26041x873d1d26 != null) {
            com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4290x991d3e53 c4290x991d3e53 = (com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4290x991d3e53) obj;
            return c26041x873d1d26.m99507xb2c87fbf(c4290x991d3e53.f16787xbe9ba123) && this.f16788x627c8da == c4290x991d3e53.f16788x627c8da;
        }
        com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4290x991d3e53 c4290x991d3e532 = (com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4290x991d3e53) obj;
        return c4290x991d3e532.f16787xbe9ba123 == null && this.f16788x627c8da == c4290x991d3e532.f16788x627c8da;
    }

    /* renamed from: getPoint */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 m35655x74fbfbda() {
        return this.f16787xbe9ba123;
    }

    /* renamed from: getTime */
    public int m35656xfb85bb43() {
        return this.f16788x627c8da;
    }

    /* renamed from: hashCode */
    public int m35657x8cdac1b() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26 = this.f16787xbe9ba123;
        return c26041x873d1d26 != null ? c26041x873d1d26.m99511x8cdac1b() + ((int) (this.f16788x627c8da * 1000000.0d)) : (int) (this.f16788x627c8da * 1000000.0d);
    }

    /* renamed from: setPoint */
    public void m35658x538a164e(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        this.f16787xbe9ba123 = c26041x873d1d26;
    }

    /* renamed from: setTime */
    public void m35659x7650824f(int i17) {
        if (i17 >= 0) {
            this.f16788x627c8da = i17;
        } else {
            this.f16788x627c8da = 0;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeParcelable(this.f16787xbe9ba123, i17);
        parcel.writeInt(this.f16788x627c8da);
    }

    public C4290x991d3e53(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, int i17) {
        m35658x538a164e(c26041x873d1d26);
        m35659x7650824f(i17);
    }

    public C4290x991d3e53(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        this(c26041x873d1d26, 0);
    }
}
