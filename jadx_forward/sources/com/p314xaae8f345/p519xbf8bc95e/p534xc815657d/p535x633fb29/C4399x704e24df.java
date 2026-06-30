package com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29;

/* renamed from: com.tencent.mapsdk.raster.model.GeoPoint */
/* loaded from: classes13.dex */
public class C4399x704e24df implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4399x704e24df> f17422x681a0c0c = new android.os.Parcelable.Creator<com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4399x704e24df>() { // from class: com.tencent.mapsdk.raster.model.GeoPoint.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4399x704e24df createFromParcel(android.os.Parcel parcel) {
            return new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4399x704e24df(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4399x704e24df[] newArray(int i17) {
            return new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4399x704e24df[i17];
        }
    };

    /* renamed from: e6Lat */
    private int f17423x5a8fb6e;

    /* renamed from: e6Lon */
    private int f17424x5a8fd1a;

    public static com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 g2l(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4399x704e24df c4399x704e24df) {
        return new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26((c4399x704e24df.m37168xbc3301f3() * 1.0d) / 1000000.0d, (c4399x704e24df.m37169x962aa94a() * 1.0d) / 1000000.0d);
    }

    /* renamed from: Copy */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4399x704e24df m37166x202395() {
        return new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4399x704e24df(this.f17423x5a8fb6e, this.f17424x5a8fd1a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m37167xb2c87fbf(java.lang.Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4399x704e24df c4399x704e24df = (com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4399x704e24df) obj;
        return this.f17423x5a8fb6e == c4399x704e24df.f17423x5a8fb6e && this.f17424x5a8fd1a == c4399x704e24df.f17424x5a8fd1a;
    }

    /* renamed from: getLatitudeE6 */
    public int m37168xbc3301f3() {
        return this.f17423x5a8fb6e;
    }

    /* renamed from: getLongitudeE6 */
    public int m37169x962aa94a() {
        return this.f17424x5a8fd1a;
    }

    /* renamed from: hashCode */
    public int m37170x8cdac1b() {
        return (this.f17424x5a8fd1a * 7) + (this.f17423x5a8fb6e * 11);
    }

    /* renamed from: setLatitudeE6 */
    public void m37171xea574fff(int i17) {
        this.f17423x5a8fb6e = i17;
    }

    /* renamed from: setLongitudeE6 */
    public void m37172x2c901cbe(int i17) {
        this.f17424x5a8fd1a = i17;
    }

    /* renamed from: toString */
    public java.lang.String m37173x9616526c() {
        return this.f17423x5a8fb6e + "," + this.f17424x5a8fd1a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f17423x5a8fb6e);
        parcel.writeInt(this.f17424x5a8fd1a);
    }

    public C4399x704e24df(int i17, int i18) {
        this.f17423x5a8fb6e = i17;
        this.f17424x5a8fd1a = i18;
    }

    private C4399x704e24df(android.os.Parcel parcel) {
        this.f17423x5a8fb6e = 0;
        this.f17424x5a8fd1a = 0;
        this.f17423x5a8fb6e = parcel.readInt();
        this.f17424x5a8fd1a = parcel.readInt();
    }
}
