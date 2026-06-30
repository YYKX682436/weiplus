package com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch;

/* loaded from: classes7.dex */
class JsApiTriggerBackgroundFetch$TriggerBackgroundFetchParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch.JsApiTriggerBackgroundFetch$TriggerBackgroundFetchParcel> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch.i();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f79838d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f79839e;

    public JsApiTriggerBackgroundFetch$TriggerBackgroundFetchParcel(java.lang.String str, java.lang.String str2) {
        this.f79838d = str;
        this.f79839e = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f79838d);
        parcel.writeString(this.f79839e);
    }

    public JsApiTriggerBackgroundFetch$TriggerBackgroundFetchParcel(android.os.Parcel parcel) {
        this.f79838d = parcel.readString();
        this.f79839e = parcel.readString();
    }
}
