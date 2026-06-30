package com.tencent.mm.plugin.appbrand.jsapi.finder;

/* loaded from: classes7.dex */
final class JsApiShareCurrentLive$ShareCurrentLiveRequest extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareCurrentLive$ShareCurrentLiveRequest> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.finder.j0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f81169d = null;

    public JsApiShareCurrentLive$ShareCurrentLiveRequest() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public java.lang.Class<? extends com.tencent.mm.plugin.appbrand.ipc.v> getTaskClass() {
        return com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareCurrentLive$ShareCurrentLiveTask.class;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public void readParcel(android.os.Parcel parcel) {
        this.f81169d = parcel.readString();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f81169d);
    }

    public JsApiShareCurrentLive$ShareCurrentLiveRequest(android.os.Parcel parcel) {
        readParcel(parcel);
    }
}
