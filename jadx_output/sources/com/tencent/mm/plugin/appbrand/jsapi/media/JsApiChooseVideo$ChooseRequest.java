package com.tencent.mm.plugin.appbrand.jsapi.media;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class JsApiChooseVideo$ChooseRequest extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo$ChooseRequest> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.media.u4();

    /* renamed from: d, reason: collision with root package name */
    java.lang.String f81665d;

    /* renamed from: e, reason: collision with root package name */
    int f81666e;

    /* renamed from: f, reason: collision with root package name */
    boolean f81667f;

    /* renamed from: g, reason: collision with root package name */
    boolean f81668g;

    /* renamed from: h, reason: collision with root package name */
    boolean f81669h;

    public JsApiChooseVideo$ChooseRequest() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public java.lang.Class<? extends com.tencent.mm.plugin.appbrand.ipc.v> getTaskClass() {
        return com.tencent.mm.plugin.appbrand.jsapi.media.z4.class;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public java.lang.String getUIAlias() {
        return "GalleryChooseVideo";
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public boolean oneShotForeground() {
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public void readParcel(android.os.Parcel parcel) {
        this.f81665d = parcel.readString();
        this.f81666e = parcel.readInt();
        this.f81667f = parcel.readByte() != 0;
        this.f81668g = parcel.readByte() != 0;
        this.f81669h = parcel.readByte() != 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f81665d);
        parcel.writeInt(this.f81666e);
        parcel.writeByte(this.f81667f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f81668g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f81669h ? (byte) 1 : (byte) 0);
    }

    public JsApiChooseVideo$ChooseRequest(android.os.Parcel parcel) {
        readParcel(parcel);
    }
}
