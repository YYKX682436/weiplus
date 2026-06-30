package com.tencent.mm.plugin.appbrand.jsapi;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class JsApiAddToFavorites$IPCFavRequest extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.JsApiAddToFavorites$IPCFavRequest> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.c3();

    /* renamed from: d, reason: collision with root package name */
    java.lang.String f78496d;

    /* renamed from: e, reason: collision with root package name */
    java.lang.String f78497e;

    /* renamed from: f, reason: collision with root package name */
    java.lang.String f78498f;

    /* renamed from: g, reason: collision with root package name */
    java.lang.String f78499g;

    /* renamed from: h, reason: collision with root package name */
    int f78500h;

    /* renamed from: i, reason: collision with root package name */
    int f78501i;

    /* renamed from: m, reason: collision with root package name */
    java.lang.String f78502m;

    /* renamed from: n, reason: collision with root package name */
    java.lang.String f78503n;

    /* renamed from: o, reason: collision with root package name */
    int f78504o;

    /* renamed from: p, reason: collision with root package name */
    int f78505p;

    /* renamed from: q, reason: collision with root package name */
    int f78506q;

    /* renamed from: r, reason: collision with root package name */
    java.lang.String f78507r;

    /* renamed from: s, reason: collision with root package name */
    int f78508s;

    /* renamed from: t, reason: collision with root package name */
    boolean f78509t;

    /* renamed from: u, reason: collision with root package name */
    boolean f78510u;

    public JsApiAddToFavorites$IPCFavRequest() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public java.lang.Class<? extends com.tencent.mm.plugin.appbrand.ipc.v> getTaskClass() {
        return com.tencent.mm.plugin.appbrand.jsapi.g3.class;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public boolean useLandscape() {
        return this.f78509t;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f78496d);
        parcel.writeString(this.f78497e);
        parcel.writeString(this.f78498f);
        parcel.writeString(this.f78499g);
        parcel.writeInt(this.f78500h);
        parcel.writeInt(this.f78501i);
        parcel.writeString(this.f78502m);
        parcel.writeString(this.f78503n);
        parcel.writeInt(this.f78504o);
        parcel.writeInt(this.f78505p);
        parcel.writeInt(this.f78506q);
        parcel.writeString(this.f78507r);
        parcel.writeInt(this.f78508s);
        parcel.writeInt(this.f78509t ? 1 : 0);
        parcel.writeByte(this.f78510u ? (byte) 1 : (byte) 0);
    }

    public JsApiAddToFavorites$IPCFavRequest(android.os.Parcel parcel) {
        this.f78496d = parcel.readString();
        this.f78497e = parcel.readString();
        this.f78498f = parcel.readString();
        this.f78499g = parcel.readString();
        this.f78500h = parcel.readInt();
        this.f78501i = parcel.readInt();
        this.f78502m = parcel.readString();
        this.f78503n = parcel.readString();
        this.f78504o = parcel.readInt();
        this.f78505p = parcel.readInt();
        this.f78506q = parcel.readInt();
        this.f78507r = parcel.readString();
        this.f78508s = parcel.readInt();
        this.f78509t = parcel.readInt() == 1;
        this.f78510u = parcel.readByte() == 1;
    }
}
