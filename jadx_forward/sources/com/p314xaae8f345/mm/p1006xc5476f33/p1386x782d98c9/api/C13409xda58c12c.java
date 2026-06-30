package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.api;

/* renamed from: com.tencent.mm.plugin.exdevice.api.IExdeviceSendPoiMessageExportApi$ExDeviceInfo */
/* loaded from: classes8.dex */
public class C13409xda58c12c implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.api.C13409xda58c12c> f35460x681a0c0c = new g32.a0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f180330d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f180331e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f180332f;

    public C13409xda58c12c(android.os.Parcel parcel) {
        this.f180330d = parcel.readString();
        this.f180331e = parcel.readString();
        this.f180332f = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f180330d);
        parcel.writeString(this.f180331e);
        parcel.writeString(this.f180332f);
    }
}
