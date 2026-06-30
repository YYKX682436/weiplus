package com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch;

/* loaded from: classes.dex */
class JsApiSetBackgroundFetchToken$SetBackgroundFetchTokenParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch.JsApiSetBackgroundFetchToken$SetBackgroundFetchTokenParcel> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch.e();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f79836d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f79837e;

    public JsApiSetBackgroundFetchToken$SetBackgroundFetchTokenParcel(java.lang.String str, java.lang.String str2) {
        this.f79836d = str;
        this.f79837e = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f79836d);
        parcel.writeString(this.f79837e);
    }

    public JsApiSetBackgroundFetchToken$SetBackgroundFetchTokenParcel(android.os.Parcel parcel) {
        this.f79836d = parcel.readString();
        this.f79837e = parcel.readString();
    }
}
