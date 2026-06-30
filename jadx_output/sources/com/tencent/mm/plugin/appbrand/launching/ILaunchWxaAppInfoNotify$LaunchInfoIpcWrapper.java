package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public class ILaunchWxaAppInfoNotify$LaunchInfoIpcWrapper implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.launching.ILaunchWxaAppInfoNotify$LaunchInfoIpcWrapper> CREATOR = new com.tencent.mm.plugin.appbrand.launching.e7();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f84430d;

    /* renamed from: e, reason: collision with root package name */
    public int f84431e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.luggage.sdk.config.LaunchWxaAppInfoParcelized f84432f;

    public ILaunchWxaAppInfoNotify$LaunchInfoIpcWrapper(android.os.Parcel parcel) {
        this.f84430d = parcel.readString();
        this.f84431e = parcel.readInt();
        this.f84432f = (com.tencent.luggage.sdk.config.LaunchWxaAppInfoParcelized) parcel.readParcelable(com.tencent.luggage.sdk.config.LaunchWxaAppInfoParcelized.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f84430d);
        parcel.writeInt(this.f84431e);
        parcel.writeParcelable(this.f84432f, i17);
    }
}
