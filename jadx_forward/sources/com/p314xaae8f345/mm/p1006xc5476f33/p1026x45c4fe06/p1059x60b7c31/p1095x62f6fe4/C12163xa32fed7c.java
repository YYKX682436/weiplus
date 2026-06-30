package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult */
/* loaded from: classes7.dex */
public final class C12163xa32fed7c extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c> f34465x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.o3();

    /* renamed from: d, reason: collision with root package name */
    public int f163180d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f163181e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f163182f;

    public C12163xa32fed7c(android.os.Parcel parcel) {
        mo50320xdc053d3f(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600
    /* renamed from: readParcel */
    public void mo50320xdc053d3f(android.os.Parcel parcel) {
        this.f163180d = parcel.readInt();
        this.f163181e = parcel.readString();
        this.f163182f = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f163180d);
        parcel.writeString(this.f163181e);
        parcel.writeString(this.f163182f);
    }
}
