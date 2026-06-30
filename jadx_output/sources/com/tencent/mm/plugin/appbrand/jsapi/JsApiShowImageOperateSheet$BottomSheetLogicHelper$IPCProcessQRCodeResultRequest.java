package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
final class JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.de();

    /* renamed from: d, reason: collision with root package name */
    private com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult f78620d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f78621e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.String f78622f;

    /* renamed from: g, reason: collision with root package name */
    private int f78623g;

    /* renamed from: h, reason: collision with root package name */
    private java.lang.String f78624h;

    /* renamed from: i, reason: collision with root package name */
    private java.lang.String f78625i;

    /* renamed from: m, reason: collision with root package name */
    private int f78626m;

    /* renamed from: n, reason: collision with root package name */
    private java.lang.String f78627n;

    /* renamed from: o, reason: collision with root package name */
    private int f78628o;

    /* renamed from: p, reason: collision with root package name */
    private java.lang.String f78629p;

    /* renamed from: q, reason: collision with root package name */
    private java.lang.String f78630q;

    public JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest() {
        this.f78624h = "";
        this.f78625i = "";
        this.f78626m = 0;
        this.f78627n = "";
        this.f78628o = 0;
        this.f78629p = "";
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public java.lang.Class<? extends com.tencent.mm.plugin.appbrand.ipc.v> getTaskClass() {
        return com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultTask.class;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public boolean oneShotForeground() {
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeParcelable(this.f78620d, i17);
        parcel.writeString(this.f78621e);
        parcel.writeString(this.f78622f);
        parcel.writeInt(this.f78623g);
        parcel.writeInt(this.f78626m);
        parcel.writeString(this.f78624h);
        parcel.writeString(this.f78625i);
        parcel.writeString(this.f78627n);
        parcel.writeInt(this.f78628o);
        parcel.writeString(this.f78629p);
        parcel.writeString(this.f78630q);
    }

    public JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest(android.os.Parcel parcel) {
        this.f78624h = "";
        this.f78625i = "";
        this.f78626m = 0;
        this.f78627n = "";
        this.f78628o = 0;
        this.f78629p = "";
        this.f78620d = (com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult) parcel.readParcelable(com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest.class.getClassLoader());
        this.f78621e = parcel.readString();
        this.f78622f = parcel.readString();
        this.f78623g = parcel.readInt();
        this.f78626m = parcel.readInt();
        this.f78624h = parcel.readString();
        this.f78625i = parcel.readString();
        this.f78627n = parcel.readString();
        this.f78628o = parcel.readInt();
        this.f78629p = parcel.readString();
        this.f78630q = parcel.readString();
    }
}
