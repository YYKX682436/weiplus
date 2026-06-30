package com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294;

/* renamed from: com.tencent.map.sdk.utilities.visualization.datamodels.FromToLatLng */
/* loaded from: classes13.dex */
public class C4288x259a94b implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4288x259a94b> f16774x681a0c0c = new android.os.Parcelable.Creator<com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4288x259a94b>() { // from class: com.tencent.map.sdk.utilities.visualization.datamodels.FromToLatLng.1
        private static com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4288x259a94b a(android.os.Parcel parcel) {
            return new com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4288x259a94b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4288x259a94b createFromParcel(android.os.Parcel parcel) {
            return new com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4288x259a94b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4288x259a94b[] newArray(int i17) {
            return new com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4288x259a94b[i17];
        }

        private static com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4288x259a94b[] a(int i17) {
            return new com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4288x259a94b[i17];
        }
    };

    /* renamed from: DEFAULT_ARC */
    private static final double f16775x665b9714 = 45.0d;

    /* renamed from: mArc */
    private double f16776x328ea5;

    /* renamed from: mEndPoint */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 f16777x8b01d502;

    /* renamed from: mStartPoint */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 f16778x7d98069b;

    public C4288x259a94b(android.os.Parcel parcel) {
        this.f16778x7d98069b = (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26) parcel.readParcelable(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26.class.getClassLoader());
        this.f16777x8b01d502 = (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26) parcel.readParcelable(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26.class.getClassLoader());
        this.f16776x328ea5 = parcel.readDouble();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m35637xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4288x259a94b)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26 = this.f16778x7d98069b;
        if (c26041x873d1d26 == null || this.f16777x8b01d502 == null) {
            com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4288x259a94b c4288x259a94b = (com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4288x259a94b) obj;
            return c4288x259a94b.f16778x7d98069b == null && this.f16776x328ea5 == c4288x259a94b.f16776x328ea5;
        }
        com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4288x259a94b c4288x259a94b2 = (com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4288x259a94b) obj;
        return c26041x873d1d26.m99507xb2c87fbf(c4288x259a94b2.f16778x7d98069b) && this.f16777x8b01d502.m99507xb2c87fbf(c4288x259a94b2.f16777x8b01d502) && this.f16776x328ea5 == c4288x259a94b2.f16776x328ea5;
    }

    /* renamed from: getArc */
    public double m35638xb5882b1c() {
        return this.f16776x328ea5;
    }

    /* renamed from: getEndPoint */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 m35639xe1de6aeb() {
        return this.f16777x8b01d502;
    }

    /* renamed from: getStartPoint */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 m35640x8fa6c644() {
        return this.f16778x7d98069b;
    }

    /* renamed from: hashCode */
    public int m35641x8cdac1b() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26 = this.f16778x7d98069b;
        return (c26041x873d1d26 == null || this.f16777x8b01d502 == null) ? (int) (this.f16776x328ea5 * 1000000.0d) : c26041x873d1d26.m99511x8cdac1b() + this.f16777x8b01d502.m99511x8cdac1b() + ((int) (this.f16776x328ea5 * 1000000.0d));
    }

    /* renamed from: setArc */
    public void m35642xca025290(double d17) {
        if (d17 <= 0.0d || d17 > 90.0d) {
            this.f16776x328ea5 = f16775x665b9714;
        } else {
            this.f16776x328ea5 = d17;
        }
    }

    /* renamed from: setPoint */
    public void m35643x538a164e(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d262) {
        this.f16778x7d98069b = c26041x873d1d26;
        this.f16777x8b01d502 = c26041x873d1d262;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeParcelable(this.f16778x7d98069b, i17);
        parcel.writeParcelable(this.f16777x8b01d502, i17);
        parcel.writeDouble(this.f16776x328ea5);
    }

    private C4288x259a94b(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d262, double d17) {
        m35643x538a164e(c26041x873d1d26, c26041x873d1d262);
        m35642xca025290(d17);
    }

    public C4288x259a94b(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d262) {
        this(c26041x873d1d26, c26041x873d1d262, f16775x665b9714);
    }
}
