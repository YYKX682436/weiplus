package com.tencent.mm.plugin.appbrand.jsapi.fakenative;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class WxaOpenLiteAppBusinessViewRequest extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.fakenative.WxaOpenLiteAppBusinessViewRequest> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.fakenative.l0();

    /* renamed from: d, reason: collision with root package name */
    public int f80901d = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f80902e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f80903f = false;

    /* renamed from: g, reason: collision with root package name */
    public int f80904g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f80905h = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f80906i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f80907m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f80908n = false;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f80909o = null;

    /* renamed from: p, reason: collision with root package name */
    public boolean f80910p = false;

    /* renamed from: q, reason: collision with root package name */
    public int f80911q = 0;

    /* renamed from: r, reason: collision with root package name */
    public float f80912r = 0.0f;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f80913s = "";

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f80914t = "";

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f80915u = "";

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f80916v = "";

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f80917w;

    public WxaOpenLiteAppBusinessViewRequest() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public java.lang.Class<? extends com.tencent.mm.plugin.appbrand.ipc.v> getTaskClass() {
        return com.tencent.mm.plugin.appbrand.jsapi.fakenative.WxaOpenLiteAppBusinessViewTask.class;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public void readParcel(android.os.Parcel parcel) {
        this.f80901d = parcel.readInt();
        this.f80902e = parcel.readInt() == 1;
        this.f80903f = parcel.readInt() == 1;
        this.f80904g = parcel.readInt();
        this.f80905h = parcel.readInt();
        this.f80906i = parcel.readInt() == 1;
        this.f80907m = parcel.readInt() == 1;
        this.f80908n = parcel.readInt() == 1;
        this.f80909o = parcel.readString();
        this.f80910p = parcel.readInt() == 1;
        this.f80911q = parcel.readInt();
        this.f80912r = parcel.readFloat();
        this.f80913s = parcel.readString();
        this.f80914t = parcel.readString();
        this.f80915u = parcel.readString();
        this.f80916v = parcel.readString();
        this.f80917w = parcel.readString();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f80901d);
        parcel.writeInt(this.f80902e ? 1 : 0);
        parcel.writeInt(this.f80903f ? 1 : 0);
        parcel.writeInt(this.f80904g);
        parcel.writeInt(this.f80905h);
        parcel.writeInt(this.f80906i ? 1 : 0);
        parcel.writeInt(this.f80907m ? 1 : 0);
        parcel.writeInt(this.f80908n ? 1 : 0);
        parcel.writeString(this.f80909o);
        parcel.writeInt(this.f80910p ? 1 : 0);
        parcel.writeInt(this.f80911q);
        parcel.writeFloat(this.f80912r);
        parcel.writeString(this.f80913s);
        parcel.writeString(this.f80914t);
        parcel.writeString(this.f80915u);
        parcel.writeString(this.f80916v);
        parcel.writeString(this.f80917w);
    }

    public WxaOpenLiteAppBusinessViewRequest(android.os.Parcel parcel) {
        readParcel(parcel);
    }
}
