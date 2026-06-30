package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.JsApiNavigateToDevMiniProgram$DevPkgInfo */
/* loaded from: classes7.dex */
final class C12175x179bf414 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.C12175x179bf414> f34513x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.p();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f163714d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f163715e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f163716f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f163717g;

    public C12175x179bf414(android.os.Parcel parcel) {
        this.f163714d = parcel.readString();
        this.f163715e = parcel.readString();
        this.f163716f = parcel.readString();
        this.f163717g = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m51118x9616526c() {
        return "DevPkgInfo{appId='" + this.f163714d + "', downloadURL='" + this.f163715e + "', checkSumMd5='" + this.f163716f + "', extoptions='" + this.f163717g + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f163714d);
        parcel.writeString(this.f163715e);
        parcel.writeString(this.f163716f);
        parcel.writeString(this.f163717g);
    }
}
