package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29;

/* renamed from: com.tencent.tencentmap.mapsdk.maps.model.LatLngSpan */
/* loaded from: classes13.dex */
public class C26045x3ba58590 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26045x3ba58590> f49516x681a0c0c = new android.os.Parcelable.Creator<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26045x3ba58590>() { // from class: com.tencent.tencentmap.mapsdk.maps.model.LatLngSpan.1
        private static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26045x3ba58590 a(android.os.Parcel parcel) {
            return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26045x3ba58590(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26045x3ba58590 createFromParcel(android.os.Parcel parcel) {
            return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26045x3ba58590(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26045x3ba58590[] newArray(int i17) {
            return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26045x3ba58590[i17];
        }

        private static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26045x3ba58590[] a(int i17) {
            return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26045x3ba58590[i17];
        }
    };

    /* renamed from: mLatitudeSpan */
    private double f49517xb2241ae3;

    /* renamed from: mLongitudeSpan */
    private double f49518x53db0e2c;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m99567xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26045x3ba58590) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26045x3ba58590 c26045x3ba58590 = (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26045x3ba58590) obj;
            if (this.f49518x53db0e2c == c26045x3ba58590.m99569xb62cc1e3() && this.f49517xb2241ae3 == c26045x3ba58590.m99568x7b81944c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: getLatitudeSpan */
    public double m99568x7b81944c() {
        return this.f49517xb2241ae3;
    }

    /* renamed from: getLongitudeSpan */
    public double m99569xb62cc1e3() {
        return this.f49518x53db0e2c;
    }

    /* renamed from: hashCode */
    public int m99570x8cdac1b() {
        long doubleToLongBits = java.lang.Double.doubleToLongBits(this.f49517xb2241ae3);
        int i17 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = java.lang.Double.doubleToLongBits(this.f49518x53db0e2c);
        return (i17 * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2));
    }

    /* renamed from: setLatitudeSpan */
    public void m99571xb1ca8f58(double d17) {
        this.f49517xb2241ae3 = d17;
    }

    /* renamed from: setLongitudeSpan */
    public void m99572x49032857(double d17) {
        this.f49518x53db0e2c = d17;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeDouble(this.f49517xb2241ae3);
        parcel.writeDouble(this.f49518x53db0e2c);
    }

    private C26045x3ba58590(android.os.Parcel parcel) {
        this.f49517xb2241ae3 = parcel.readDouble();
        this.f49518x53db0e2c = parcel.readDouble();
    }

    public C26045x3ba58590(double d17, double d18) {
        this.f49517xb2241ae3 = d17;
        this.f49518x53db0e2c = d18;
    }
}
