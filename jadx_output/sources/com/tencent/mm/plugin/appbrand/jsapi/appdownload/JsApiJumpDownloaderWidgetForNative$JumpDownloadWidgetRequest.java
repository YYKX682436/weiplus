package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

/* loaded from: classes7.dex */
class JsApiJumpDownloaderWidgetForNative$JumpDownloadWidgetRequest extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiJumpDownloaderWidgetForNative$JumpDownloadWidgetRequest> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.appdownload.s0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f78875d;

    public JsApiJumpDownloaderWidgetForNative$JumpDownloadWidgetRequest() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public java.lang.Class<? extends com.tencent.mm.plugin.appbrand.ipc.v> getTaskClass() {
        return com.tencent.mm.plugin.appbrand.jsapi.appdownload.u0.class;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public boolean oneShotForeground() {
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public void readParcel(android.os.Parcel parcel) {
        this.f78875d = parcel.readString();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f78875d);
    }

    public JsApiJumpDownloaderWidgetForNative$JumpDownloadWidgetRequest(android.os.Parcel parcel) {
        readParcel(parcel);
    }
}
