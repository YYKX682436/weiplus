package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiAddToFavorites$IPCFavResult */
/* loaded from: classes7.dex */
final class C11915xd8f50f14 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11915xd8f50f14> f33650x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d3();

    /* renamed from: d, reason: collision with root package name */
    public int f160044d;

    public C11915xd8f50f14(android.os.Parcel parcel) {
        this.f160044d = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600
    /* renamed from: readParcel */
    public void mo50320xdc053d3f(android.os.Parcel parcel) {
        this.f160044d = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f160044d);
    }
}
