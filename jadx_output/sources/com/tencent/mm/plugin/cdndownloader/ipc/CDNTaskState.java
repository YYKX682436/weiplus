package com.tencent.mm.plugin.cdndownloader.ipc;

/* loaded from: classes8.dex */
public class CDNTaskState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskState> CREATOR = new jv1.b();

    /* renamed from: d, reason: collision with root package name */
    public int f95511d = -100;

    /* renamed from: e, reason: collision with root package name */
    public long f95512e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f95513f = 0;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f95511d);
        parcel.writeLong(this.f95512e);
        parcel.writeLong(this.f95513f);
    }
}
