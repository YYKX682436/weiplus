package com.tencent.mm.plugin.appbrand.jsapi.lab;

/* loaded from: classes7.dex */
final class JsApiSetLabInfo$IPCSetLabInfoRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.lab.JsApiSetLabInfo$IPCSetLabInfoRequest> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.lab.g();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f81376d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f81377e;

    public JsApiSetLabInfo$IPCSetLabInfoRequest(java.lang.String str, boolean z17) {
        this.f81376d = str;
        this.f81377e = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f81376d);
        parcel.writeByte(this.f81377e ? (byte) 1 : (byte) 0);
    }

    public JsApiSetLabInfo$IPCSetLabInfoRequest(android.os.Parcel parcel) {
        this.f81376d = parcel.readString();
        this.f81377e = parcel.readByte() != 0;
    }
}
