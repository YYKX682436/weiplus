package com.tencent.mm.plugin.appbrand.jsapi.media;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class JsApiChooseMedia$ChooseRequest extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.media.n3();

    /* renamed from: d, reason: collision with root package name */
    java.lang.String f81634d;

    /* renamed from: e, reason: collision with root package name */
    boolean f81635e;

    /* renamed from: f, reason: collision with root package name */
    boolean f81636f;

    /* renamed from: g, reason: collision with root package name */
    boolean f81637g;

    /* renamed from: h, reason: collision with root package name */
    boolean f81638h;

    /* renamed from: i, reason: collision with root package name */
    boolean f81639i;

    /* renamed from: m, reason: collision with root package name */
    boolean f81640m;

    /* renamed from: n, reason: collision with root package name */
    int f81641n;

    /* renamed from: o, reason: collision with root package name */
    int f81642o;

    /* renamed from: p, reason: collision with root package name */
    boolean f81643p;

    /* renamed from: q, reason: collision with root package name */
    boolean f81644q;

    /* renamed from: r, reason: collision with root package name */
    boolean f81645r;

    /* renamed from: s, reason: collision with root package name */
    int f81646s;

    public JsApiChooseMedia$ChooseRequest() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public java.lang.Class<? extends com.tencent.mm.plugin.appbrand.ipc.v> getTaskClass() {
        return com.tencent.mm.plugin.appbrand.jsapi.media.y3.class;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public java.lang.String getUIAlias() {
        return "GalleryChooseMedia";
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public boolean oneShotForeground() {
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public void readParcel(android.os.Parcel parcel) {
        this.f81634d = parcel.readString();
        this.f81635e = parcel.readByte() != 0;
        this.f81636f = parcel.readByte() != 0;
        this.f81637g = parcel.readByte() != 0;
        this.f81638h = parcel.readByte() != 0;
        this.f81639i = parcel.readByte() != 0;
        this.f81640m = parcel.readByte() != 0;
        this.f81641n = parcel.readInt();
        this.f81642o = parcel.readInt();
        this.f81643p = parcel.readByte() != 0;
        this.f81644q = parcel.readByte() != 0;
        this.f81645r = parcel.readByte() != 0;
        this.f81646s = parcel.readInt();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f81634d);
        parcel.writeByte(this.f81635e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f81636f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f81637g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f81638h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f81639i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f81640m ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f81641n);
        parcel.writeInt(this.f81642o);
        parcel.writeByte(this.f81643p ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f81644q ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f81645r ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f81646s);
    }

    public JsApiChooseMedia$ChooseRequest(android.os.Parcel parcel) {
        readParcel(parcel);
    }
}
