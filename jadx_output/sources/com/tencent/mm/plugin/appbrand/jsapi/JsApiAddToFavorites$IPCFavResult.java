package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
final class JsApiAddToFavorites$IPCFavResult extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.JsApiAddToFavorites$IPCFavResult> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.d3();

    /* renamed from: d, reason: collision with root package name */
    public int f78511d;

    public JsApiAddToFavorites$IPCFavResult(android.os.Parcel parcel) {
        this.f78511d = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult
    public void readParcel(android.os.Parcel parcel) {
        this.f78511d = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f78511d);
    }
}
