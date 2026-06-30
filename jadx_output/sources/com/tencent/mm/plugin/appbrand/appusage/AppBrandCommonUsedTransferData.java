package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public class AppBrandCommonUsedTransferData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.appusage.AppBrandCommonUsedTransferData> CREATOR = new com.tencent.mm.plugin.appbrand.appusage.q0();

    /* renamed from: d, reason: collision with root package name */
    public boolean f76341d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f76342e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f76343f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f76344g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f76345h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.appusage.AppBrandLocationInfo f76346i;

    public AppBrandCommonUsedTransferData() {
        this.f76341d = false;
        this.f76342e = false;
        this.f76343f = "";
        this.f76344g = "";
        this.f76345h = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeByte(this.f76341d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f76342e ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f76343f);
        parcel.writeString(this.f76344g);
        parcel.writeString(this.f76345h);
        parcel.writeParcelable(this.f76346i, i17);
    }

    public AppBrandCommonUsedTransferData(android.os.Parcel parcel) {
        this.f76341d = false;
        this.f76342e = false;
        this.f76343f = "";
        this.f76344g = "";
        this.f76345h = "";
        this.f76341d = parcel.readByte() != 0;
        this.f76342e = parcel.readByte() != 0;
        this.f76343f = parcel.readString();
        this.f76344g = parcel.readString();
        this.f76345h = parcel.readString();
        this.f76346i = (com.tencent.mm.plugin.appbrand.appusage.AppBrandLocationInfo) parcel.readParcelable(com.tencent.mm.plugin.appbrand.appusage.AppBrandLocationInfo.class.getClassLoader());
    }
}
