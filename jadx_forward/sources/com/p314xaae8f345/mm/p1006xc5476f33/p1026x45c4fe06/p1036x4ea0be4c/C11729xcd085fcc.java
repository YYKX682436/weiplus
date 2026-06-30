package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c;

/* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataTokenStorageIPC$WxappParams */
/* loaded from: classes.dex */
class C11729xcd085fcc implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11729xcd085fcc> f33515x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.f0();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f158330d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f158331e;

    public C11729xcd085fcc(java.lang.String str, java.lang.String str2) {
        this.f158330d = str;
        this.f158331e = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f158330d);
        parcel.writeString(this.f158331e);
    }

    public C11729xcd085fcc(android.os.Parcel parcel) {
        this.f158330d = parcel.readString();
        this.f158331e = parcel.readString();
    }
}
