package com.tencent.mm.plugin.appbrand.config;

/* loaded from: classes7.dex */
public class AppBrandCustomLoadingConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.config.AppBrandCustomLoadingConfig> CREATOR = new k91.w();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f77203d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f77204e;

    public AppBrandCustomLoadingConfig(android.os.Parcel parcel) {
        this.f77203d = parcel.readString();
        this.f77204e = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f77203d);
        parcel.writeString(this.f77204e);
    }
}
