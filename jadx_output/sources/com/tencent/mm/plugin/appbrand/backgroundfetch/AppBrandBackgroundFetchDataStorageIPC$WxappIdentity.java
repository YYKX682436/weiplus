package com.tencent.mm.plugin.appbrand.backgroundfetch;

/* loaded from: classes7.dex */
class AppBrandBackgroundFetchDataStorageIPC$WxappIdentity implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataStorageIPC$WxappIdentity> CREATOR = new com.tencent.mm.plugin.appbrand.backgroundfetch.q();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f76785d;

    /* renamed from: e, reason: collision with root package name */
    public final int f76786e;

    public AppBrandBackgroundFetchDataStorageIPC$WxappIdentity(java.lang.String str, int i17) {
        this.f76785d = str;
        this.f76786e = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataStorageIPC$WxappIdentity appBrandBackgroundFetchDataStorageIPC$WxappIdentity = (com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataStorageIPC$WxappIdentity) obj;
        return this.f76786e == appBrandBackgroundFetchDataStorageIPC$WxappIdentity.f76786e && java.util.Objects.equals(this.f76785d, appBrandBackgroundFetchDataStorageIPC$WxappIdentity.f76785d);
    }

    public int hashCode() {
        return java.util.Objects.hash(this.f76785d, java.lang.Integer.valueOf(this.f76786e));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f76785d);
        parcel.writeInt(this.f76786e);
    }

    public AppBrandBackgroundFetchDataStorageIPC$WxappIdentity(android.os.Parcel parcel) {
        this.f76785d = parcel.readString();
        this.f76786e = parcel.readInt();
    }
}
