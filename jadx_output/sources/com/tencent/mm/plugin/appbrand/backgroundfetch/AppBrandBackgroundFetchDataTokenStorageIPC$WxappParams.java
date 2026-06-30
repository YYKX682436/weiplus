package com.tencent.mm.plugin.appbrand.backgroundfetch;

/* loaded from: classes.dex */
class AppBrandBackgroundFetchDataTokenStorageIPC$WxappParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataTokenStorageIPC$WxappParams> CREATOR = new com.tencent.mm.plugin.appbrand.backgroundfetch.f0();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f76797d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f76798e;

    public AppBrandBackgroundFetchDataTokenStorageIPC$WxappParams(java.lang.String str, java.lang.String str2) {
        this.f76797d = str;
        this.f76798e = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f76797d);
        parcel.writeString(this.f76798e);
    }

    public AppBrandBackgroundFetchDataTokenStorageIPC$WxappParams(android.os.Parcel parcel) {
        this.f76797d = parcel.readString();
        this.f76798e = parcel.readString();
    }
}
