package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public class ILaunchWxaAppInfoNotify$AppidABTestIpcWrapper implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.launching.ILaunchWxaAppInfoNotify$AppidABTestIpcWrapper> CREATOR = new com.tencent.mm.plugin.appbrand.launching.d7();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f84427d;

    /* renamed from: e, reason: collision with root package name */
    public int f84428e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.HashMap f84429f;

    public ILaunchWxaAppInfoNotify$AppidABTestIpcWrapper(android.os.Parcel parcel) {
        this.f84427d = parcel.readString();
        this.f84428e = parcel.readInt();
        this.f84429f = parcel.readHashMap(com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f84427d);
        parcel.writeInt(this.f84428e);
        parcel.writeMap(this.f84429f);
    }
}
