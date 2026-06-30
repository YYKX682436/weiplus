package com.tencent.mm.plugin.appbrand.jsapi.h5_interact;

/* loaded from: classes7.dex */
public class SendDataToH5FromMiniProgramEvent extends com.tencent.mm.sdk.event.IEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.h5_interact.SendDataToH5FromMiniProgramEvent> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.h5_interact.f();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f81268g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f81269h;

    /* renamed from: i, reason: collision with root package name */
    public int f81270i;

    public SendDataToH5FromMiniProgramEvent() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f81268g);
        parcel.writeString(this.f81269h);
        parcel.writeInt(this.f81270i);
    }

    public SendDataToH5FromMiniProgramEvent(android.os.Parcel parcel) {
        this.f81268g = parcel.readString();
        this.f81269h = parcel.readString();
        this.f81270i = parcel.readInt();
    }
}
