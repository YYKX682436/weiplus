package com.tencent.mm.plugin.appbrand.jsapi.media;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class JsApiChooseImage$ChooseRequest extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$ChooseRequest> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.media.u2();

    /* renamed from: d, reason: collision with root package name */
    java.lang.String f81625d;

    /* renamed from: e, reason: collision with root package name */
    int f81626e;

    /* renamed from: f, reason: collision with root package name */
    boolean f81627f;

    /* renamed from: g, reason: collision with root package name */
    boolean f81628g;

    /* renamed from: h, reason: collision with root package name */
    boolean f81629h;

    /* renamed from: i, reason: collision with root package name */
    boolean f81630i;

    /* renamed from: m, reason: collision with root package name */
    boolean f81631m = true;

    public JsApiChooseImage$ChooseRequest() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public java.lang.Class<? extends com.tencent.mm.plugin.appbrand.ipc.v> getTaskClass() {
        return com.tencent.mm.plugin.appbrand.jsapi.media.d3.class;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public java.lang.String getUIAlias() {
        return "GalleryChooseImage";
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public boolean oneShotForeground() {
        if (this.f81631m) {
            return true;
        }
        this.f81631m = true;
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public void readParcel(android.os.Parcel parcel) {
        this.f81625d = parcel.readString();
        this.f81626e = parcel.readInt();
        this.f81627f = parcel.readByte() != 0;
        this.f81628g = parcel.readByte() != 0;
        this.f81629h = parcel.readByte() != 0;
        this.f81630i = parcel.readByte() != 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f81625d);
        parcel.writeInt(this.f81626e);
        parcel.writeByte(this.f81627f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f81628g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f81629h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f81630i ? (byte) 1 : (byte) 0);
    }

    public JsApiChooseImage$ChooseRequest(android.os.Parcel parcel) {
        readParcel(parcel);
    }
}
