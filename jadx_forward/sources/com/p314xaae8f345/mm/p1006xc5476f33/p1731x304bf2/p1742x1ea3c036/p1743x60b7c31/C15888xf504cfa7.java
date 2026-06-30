package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.JsApiOpenLiteApp$OpenLiteAppData */
/* loaded from: classes8.dex */
class C15888xf504cfa7 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.C15888xf504cfa7> f36930x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.y2();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f221111d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f221112e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f221113f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Boolean f221114g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Boolean f221115h;

    public C15888xf504cfa7(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Boolean bool, java.lang.Boolean bool2) {
        this.f221111d = str;
        this.f221112e = str2;
        this.f221113f = str3;
        this.f221114g = bool;
        this.f221115h = bool2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f221111d);
        parcel.writeString(this.f221112e);
        parcel.writeString(this.f221113f);
        parcel.writeByte(this.f221114g.booleanValue() ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f221115h.booleanValue() ? (byte) 1 : (byte) 0);
    }

    public C15888xf504cfa7(android.os.Parcel parcel) {
        this.f221111d = parcel.readString();
        this.f221112e = parcel.readString();
        this.f221113f = parcel.readString();
        this.f221114g = java.lang.Boolean.valueOf(parcel.readByte() != 0);
        this.f221115h = java.lang.Boolean.valueOf(parcel.readByte() != 0);
    }
}
