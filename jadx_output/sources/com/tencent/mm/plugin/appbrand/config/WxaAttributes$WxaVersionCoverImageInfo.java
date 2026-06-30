package com.tencent.mm.plugin.appbrand.config;

/* loaded from: classes7.dex */
public final class WxaAttributes$WxaVersionCoverImageInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionCoverImageInfo> CREATOR = new k91.r5();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f77442d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f77443e;

    public WxaAttributes$WxaVersionCoverImageInfo(android.os.Parcel parcel) {
        this.f77442d = parcel.readString();
        this.f77443e = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f77442d);
        parcel.writeString(this.f77443e);
    }
}
