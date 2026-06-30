package com.tencent.mm.plugin.appbrand.jsapi.h5_interact;

/* loaded from: classes7.dex */
public class SendDataToMiniProgramFromH5Event implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.h5_interact.SendDataToMiniProgramFromH5Event> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.h5_interact.g();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f81271d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f81272e;

    /* renamed from: f, reason: collision with root package name */
    public int f81273f;

    public SendDataToMiniProgramFromH5Event(android.os.Parcel parcel) {
        this.f81271d = parcel.readString();
        this.f81272e = parcel.readString();
        this.f81273f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f81271d);
        parcel.writeString(this.f81272e);
        parcel.writeInt(this.f81273f);
    }
}
