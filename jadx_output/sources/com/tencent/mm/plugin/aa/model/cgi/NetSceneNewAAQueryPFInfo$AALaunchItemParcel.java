package com.tencent.mm.plugin.aa.model.cgi;

/* loaded from: classes9.dex */
public class NetSceneNewAAQueryPFInfo$AALaunchItemParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$AALaunchItemParcel> CREATOR = new i61.l();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f72406d;

    /* renamed from: e, reason: collision with root package name */
    public long f72407e;

    public NetSceneNewAAQueryPFInfo$AALaunchItemParcel(android.os.Parcel parcel) {
        this.f72406d = parcel.readString();
        this.f72407e = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "AALaunchItemParcel{username='" + this.f72406d + "', amount=" + this.f72407e + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f72406d);
        parcel.writeLong(this.f72407e);
    }
}
