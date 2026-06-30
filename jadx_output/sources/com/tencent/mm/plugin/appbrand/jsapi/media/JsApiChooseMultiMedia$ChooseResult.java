package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
final class JsApiChooseMultiMedia$ChooseResult extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$ChooseResult> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.media.i4();

    /* renamed from: d, reason: collision with root package name */
    public int f81663d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f81664e;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult
    public void readParcel(android.os.Parcel parcel) {
        this.f81663d = parcel.readInt();
        this.f81664e = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f81663d);
        parcel.writeString(this.f81664e);
    }
}
