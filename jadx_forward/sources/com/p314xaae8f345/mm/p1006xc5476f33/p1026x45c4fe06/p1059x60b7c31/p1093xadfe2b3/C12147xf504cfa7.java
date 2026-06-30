package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.liteapp.JsApiOpenLiteApp$OpenLiteAppData */
/* loaded from: classes8.dex */
class C12147xf504cfa7 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.C12147xf504cfa7> f34434x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.t();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f163053d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f163054e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f163055f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f163056g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Boolean f163057h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Boolean f163058i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Boolean f163059m;

    public C12147xf504cfa7(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3) {
        this.f163053d = str;
        this.f163054e = str2;
        this.f163055f = str3;
        this.f163056g = str4;
        this.f163057h = bool;
        this.f163058i = bool2;
        this.f163059m = bool3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f163053d);
        parcel.writeString(this.f163054e);
        parcel.writeString(this.f163055f);
        parcel.writeString(this.f163056g);
        parcel.writeByte(this.f163057h.booleanValue() ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f163058i.booleanValue() ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f163059m.booleanValue() ? (byte) 1 : (byte) 0);
    }

    public C12147xf504cfa7(android.os.Parcel parcel) {
        this.f163053d = parcel.readString();
        this.f163054e = parcel.readString();
        this.f163055f = parcel.readString();
        this.f163056g = parcel.readString();
        this.f163057h = java.lang.Boolean.valueOf(parcel.readByte() != 0);
        this.f163058i = java.lang.Boolean.valueOf(parcel.readByte() != 0);
        this.f163059m = java.lang.Boolean.valueOf(parcel.readByte() != 0);
    }
}
