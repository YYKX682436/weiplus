package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public final class AppIdentity implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.appusage.AppIdentity> CREATOR = new com.tencent.mm.plugin.appbrand.appusage.g3();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f76359d;

    /* renamed from: e, reason: collision with root package name */
    public final int f76360e;

    public AppIdentity(java.lang.String str, int i17) {
        this.f76359d = str;
        this.f76360e = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f76359d);
        parcel.writeInt(this.f76360e);
    }

    public AppIdentity(android.os.Parcel parcel) {
        this.f76359d = parcel.readString();
        this.f76360e = parcel.readInt();
    }
}
