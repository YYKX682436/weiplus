package com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc;

/* renamed from: com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskState */
/* loaded from: classes8.dex */
public class C13092x802fa47f implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13092x802fa47f> f35400x681a0c0c = new jv1.b();

    /* renamed from: d, reason: collision with root package name */
    public int f177044d = -100;

    /* renamed from: e, reason: collision with root package name */
    public long f177045e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f177046f = 0;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f177044d);
        parcel.writeLong(this.f177045e);
        parcel.writeLong(this.f177046f);
    }
}
