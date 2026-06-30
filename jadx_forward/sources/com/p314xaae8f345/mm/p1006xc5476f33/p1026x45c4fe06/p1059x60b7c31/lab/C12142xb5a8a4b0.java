package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lab;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lab.JsApiGetLabInfo$GetLabInfoResult */
/* loaded from: classes7.dex */
final class C12142xb5a8a4b0 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lab.C12142xb5a8a4b0> f34386x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lab.b();

    /* renamed from: d, reason: collision with root package name */
    public boolean f162907d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f162908e;

    public C12142xb5a8a4b0() {
        this.f162907d = false;
        this.f162908e = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeByte(this.f162907d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f162908e ? (byte) 1 : (byte) 0);
    }

    public C12142xb5a8a4b0(android.os.Parcel parcel) {
        this.f162907d = false;
        this.f162908e = false;
        this.f162907d = parcel.readByte() != 0;
        this.f162908e = parcel.readByte() != 0;
    }
}
