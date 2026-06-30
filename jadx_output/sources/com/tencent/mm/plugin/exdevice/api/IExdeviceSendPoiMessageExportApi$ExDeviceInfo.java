package com.tencent.mm.plugin.exdevice.api;

/* loaded from: classes8.dex */
public class IExdeviceSendPoiMessageExportApi$ExDeviceInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.exdevice.api.IExdeviceSendPoiMessageExportApi$ExDeviceInfo> CREATOR = new g32.a0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f98797d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f98798e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f98799f;

    public IExdeviceSendPoiMessageExportApi$ExDeviceInfo(android.os.Parcel parcel) {
        this.f98797d = parcel.readString();
        this.f98798e = parcel.readString();
        this.f98799f = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f98797d);
        parcel.writeString(this.f98798e);
        parcel.writeString(this.f98799f);
    }
}
