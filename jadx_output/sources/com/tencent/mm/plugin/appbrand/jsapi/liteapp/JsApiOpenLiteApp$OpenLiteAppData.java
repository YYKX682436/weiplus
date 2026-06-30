package com.tencent.mm.plugin.appbrand.jsapi.liteapp;

/* loaded from: classes8.dex */
class JsApiOpenLiteApp$OpenLiteAppData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.liteapp.JsApiOpenLiteApp$OpenLiteAppData> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.liteapp.t();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f81520d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f81521e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f81522f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f81523g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Boolean f81524h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Boolean f81525i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Boolean f81526m;

    public JsApiOpenLiteApp$OpenLiteAppData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3) {
        this.f81520d = str;
        this.f81521e = str2;
        this.f81522f = str3;
        this.f81523g = str4;
        this.f81524h = bool;
        this.f81525i = bool2;
        this.f81526m = bool3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f81520d);
        parcel.writeString(this.f81521e);
        parcel.writeString(this.f81522f);
        parcel.writeString(this.f81523g);
        parcel.writeByte(this.f81524h.booleanValue() ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f81525i.booleanValue() ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f81526m.booleanValue() ? (byte) 1 : (byte) 0);
    }

    public JsApiOpenLiteApp$OpenLiteAppData(android.os.Parcel parcel) {
        this.f81520d = parcel.readString();
        this.f81521e = parcel.readString();
        this.f81522f = parcel.readString();
        this.f81523g = parcel.readString();
        this.f81524h = java.lang.Boolean.valueOf(parcel.readByte() != 0);
        this.f81525i = java.lang.Boolean.valueOf(parcel.readByte() != 0);
        this.f81526m = java.lang.Boolean.valueOf(parcel.readByte() != 0);
    }
}
