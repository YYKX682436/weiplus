package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
final class JsApiPrivateAddContact$AddContactResult extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.JsApiPrivateAddContact$AddContactResult> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.jb();

    /* renamed from: d, reason: collision with root package name */
    public int f78597d;

    public JsApiPrivateAddContact$AddContactResult(android.os.Parcel parcel) {
        this.f78597d = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult
    public void readParcel(android.os.Parcel parcel) {
        this.f78597d = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f78597d);
    }
}
