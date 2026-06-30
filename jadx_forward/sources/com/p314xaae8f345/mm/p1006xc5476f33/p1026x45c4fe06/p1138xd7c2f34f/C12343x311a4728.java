package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.ILaunchWxaAppInfoNotify$LaunchInfoIpcWrapper */
/* loaded from: classes7.dex */
public class C12343x311a4728 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12343x311a4728> f35057x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.e7();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f165963d;

    /* renamed from: e, reason: collision with root package name */
    public int f165964e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3900x5df21f9b f165965f;

    public C12343x311a4728(android.os.Parcel parcel) {
        this.f165963d = parcel.readString();
        this.f165964e = parcel.readInt();
        this.f165965f = (com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3900x5df21f9b) parcel.readParcelable(com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3900x5df21f9b.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f165963d);
        parcel.writeInt(this.f165964e);
        parcel.writeParcelable(this.f165965f, i17);
    }
}
