package com.tencent.mm.plugin.appbrand.jsapi.finder;

/* loaded from: classes7.dex */
final class JsApiShareCurrentLive$ShareCurrentLiveResult extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareCurrentLive$ShareCurrentLiveResult> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.finder.k0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f81170d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult
    public void readParcel(android.os.Parcel parcel) {
        this.f81170d = parcel.readString();
        com.tencent.mars.xlog.Log.i("JsApiShareCurrentLive", "readParcel, data = " + this.f81170d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f81170d);
    }
}
