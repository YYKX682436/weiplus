package com.tencent.mm.plugin.appbrand.jsapi.lab;

/* loaded from: classes7.dex */
final class JsApiGetLabInfo$GetLabInfoResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.lab.JsApiGetLabInfo$GetLabInfoResult> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.lab.b();

    /* renamed from: d, reason: collision with root package name */
    public boolean f81374d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f81375e;

    public JsApiGetLabInfo$GetLabInfoResult() {
        this.f81374d = false;
        this.f81375e = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeByte(this.f81374d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f81375e ? (byte) 1 : (byte) 0);
    }

    public JsApiGetLabInfo$GetLabInfoResult(android.os.Parcel parcel) {
        this.f81374d = false;
        this.f81375e = false;
        this.f81374d = parcel.readByte() != 0;
        this.f81375e = parcel.readByte() != 0;
    }
}
