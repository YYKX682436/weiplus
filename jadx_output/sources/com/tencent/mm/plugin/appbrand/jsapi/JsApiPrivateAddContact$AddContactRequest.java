package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
final class JsApiPrivateAddContact$AddContactRequest extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.JsApiPrivateAddContact$AddContactRequest> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.ib();

    /* renamed from: d, reason: collision with root package name */
    java.lang.String f78594d;

    /* renamed from: e, reason: collision with root package name */
    int f78595e;

    /* renamed from: f, reason: collision with root package name */
    int f78596f;

    public JsApiPrivateAddContact$AddContactRequest() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public java.lang.Class<? extends com.tencent.mm.plugin.appbrand.ipc.v> getTaskClass() {
        return com.tencent.mm.plugin.appbrand.jsapi.lb.class;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public void readParcel(android.os.Parcel parcel) {
        this.f78594d = parcel.readString();
        this.f78595e = parcel.readInt();
        this.f78596f = parcel.readInt();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f78594d);
        parcel.writeInt(this.f78595e);
        parcel.writeInt(this.f78596f);
    }

    public JsApiPrivateAddContact$AddContactRequest(android.os.Parcel parcel) {
        readParcel(parcel);
    }
}
