package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

/* loaded from: classes7.dex */
final class JsApiNavigateToDevMiniProgram$DevPkgInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.JsApiNavigateToDevMiniProgram$DevPkgInfo> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.p();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f82181d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f82182e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f82183f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f82184g;

    public JsApiNavigateToDevMiniProgram$DevPkgInfo(android.os.Parcel parcel) {
        this.f82181d = parcel.readString();
        this.f82182e = parcel.readString();
        this.f82183f = parcel.readString();
        this.f82184g = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "DevPkgInfo{appId='" + this.f82181d + "', downloadURL='" + this.f82182e + "', checkSumMd5='" + this.f82183f + "', extoptions='" + this.f82184g + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f82181d);
        parcel.writeString(this.f82182e);
        parcel.writeString(this.f82183f);
        parcel.writeString(this.f82184g);
    }
}
