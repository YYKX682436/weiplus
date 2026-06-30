package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public class ILaunchWxaAppInfoNotify$PluginIpcWrapper implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.launching.ILaunchWxaAppInfoNotify$PluginIpcWrapper> CREATOR = new com.tencent.mm.plugin.appbrand.launching.f7();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f84433d;

    /* renamed from: e, reason: collision with root package name */
    public int f84434e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.HashMap f84435f;

    public ILaunchWxaAppInfoNotify$PluginIpcWrapper(android.os.Parcel parcel) {
        this.f84433d = parcel.readString();
        this.f84434e = parcel.readInt();
        this.f84435f = parcel.readHashMap(com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f84433d);
        parcel.writeInt(this.f84434e);
        parcel.writeMap(this.f84435f);
    }
}
