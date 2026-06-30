package com.tencent.mm.plugin.appbrand.jsapi.media;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class JsApiChooseMultiMedia$ChooseRequest extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$ChooseRequest> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.media.h4();

    /* renamed from: d, reason: collision with root package name */
    java.lang.String f81650d;

    /* renamed from: e, reason: collision with root package name */
    int f81651e;

    /* renamed from: f, reason: collision with root package name */
    double f81652f;

    /* renamed from: g, reason: collision with root package name */
    double f81653g;

    /* renamed from: h, reason: collision with root package name */
    java.lang.String f81654h;

    /* renamed from: i, reason: collision with root package name */
    double f81655i;

    /* renamed from: m, reason: collision with root package name */
    boolean f81656m;

    /* renamed from: n, reason: collision with root package name */
    boolean f81657n;

    /* renamed from: o, reason: collision with root package name */
    int f81658o;

    /* renamed from: p, reason: collision with root package name */
    boolean f81659p;

    /* renamed from: q, reason: collision with root package name */
    boolean f81660q;

    /* renamed from: r, reason: collision with root package name */
    int f81661r;

    /* renamed from: s, reason: collision with root package name */
    boolean f81662s;

    public JsApiChooseMultiMedia$ChooseRequest() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public java.lang.Class<? extends com.tencent.mm.plugin.appbrand.ipc.v> getTaskClass() {
        return com.tencent.mm.plugin.appbrand.jsapi.media.o4.class;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public java.lang.String getUIAlias() {
        return "GalleryChooseMultiMedia";
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public boolean oneShotForeground() {
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public void readParcel(android.os.Parcel parcel) {
        this.f81650d = parcel.readString();
        this.f81651e = parcel.readInt();
        this.f81652f = parcel.readDouble();
        this.f81653g = parcel.readDouble();
        this.f81654h = parcel.readString();
        this.f81655i = parcel.readDouble();
        this.f81656m = parcel.readByte() != 0;
        this.f81657n = parcel.readByte() != 0;
        this.f81658o = parcel.readInt();
        this.f81659p = parcel.readByte() != 0;
        this.f81660q = parcel.readByte() != 0;
        this.f81661r = parcel.readInt();
        this.f81662s = parcel.readByte() != 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f81650d);
        parcel.writeInt(this.f81651e);
        parcel.writeDouble(this.f81652f);
        parcel.writeDouble(this.f81653g);
        parcel.writeString(this.f81654h);
        parcel.writeDouble(this.f81655i);
        parcel.writeByte(this.f81656m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f81657n ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f81658o);
        parcel.writeByte(this.f81659p ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f81660q ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f81661r);
        parcel.writeByte(this.f81662s ? (byte) 1 : (byte) 0);
    }

    public JsApiChooseMultiMedia$ChooseRequest(android.os.Parcel parcel) {
        readParcel(parcel);
    }
}
