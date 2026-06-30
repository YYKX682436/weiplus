package com.tencent.mm.plugin.appbrand.backgroundfetch;

/* loaded from: classes.dex */
public class AppBrandBackgroundFetchDataTokenParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataTokenParcel> CREATOR = new com.tencent.mm.plugin.appbrand.backgroundfetch.z();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f76795d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f76796e;

    public AppBrandBackgroundFetchDataTokenParcel(android.os.Parcel parcel) {
        this.f76795d = parcel.readString();
        this.f76796e = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f76795d);
        parcel.writeString(this.f76796e);
    }
}
