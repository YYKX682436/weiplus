package com.tencent.mm.plugin.appbrand.jsapi.finder;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class JsApiShareFinderProduct$ShareFinderProductResult extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareFinderProduct$ShareFinderProductResult> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.finder.t0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f81178d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult
    public void readParcel(android.os.Parcel parcel) {
        this.f81178d = parcel.readString();
        com.tencent.mars.xlog.Log.i("MicroMsg.Finder.JsApiShareFinderProduct", "readParcel, data = " + this.f81178d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f81178d);
    }
}
