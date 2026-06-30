package com.tencent.mm.plugin.appbrand.backgroundrunning;

/* loaded from: classes7.dex */
class AppBrandBackgroundRunningMonitor$NotifyLocationBackgroundChanged implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningMonitor$NotifyLocationBackgroundChanged> CREATOR = new com.tencent.mm.plugin.appbrand.backgroundrunning.s();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f76930d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f76931e;

    public AppBrandBackgroundRunningMonitor$NotifyLocationBackgroundChanged(java.lang.String str, boolean z17) {
        this.f76930d = str;
        this.f76931e = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f76930d);
        parcel.writeByte(this.f76931e ? (byte) 1 : (byte) 0);
    }

    public AppBrandBackgroundRunningMonitor$NotifyLocationBackgroundChanged(android.os.Parcel parcel) {
        this.f76930d = parcel.readString();
        this.f76931e = parcel.readByte() != 0;
    }
}
