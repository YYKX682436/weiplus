package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lbs.JsApiGetLastLocationCacheWC$LocationData */
/* loaded from: classes7.dex */
class C12144x8fa3af05 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.C12144x8fa3af05> f34392x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.b0();

    /* renamed from: d, reason: collision with root package name */
    public double f162917d;

    /* renamed from: e, reason: collision with root package name */
    public double f162918e;

    public C12144x8fa3af05() {
        this.f162917d = 0.0d;
        this.f162918e = 0.0d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeDouble(this.f162917d);
        parcel.writeDouble(this.f162918e);
    }

    public C12144x8fa3af05(android.os.Parcel parcel) {
        this.f162917d = 0.0d;
        this.f162918e = 0.0d;
        this.f162917d = parcel.readDouble();
        this.f162918e = parcel.readDouble();
    }
}
