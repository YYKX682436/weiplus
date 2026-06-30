package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public class WxaPkgLoadProgress implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress> CREATOR = new com.tencent.mm.plugin.appbrand.appcache.m9();

    /* renamed from: d, reason: collision with root package name */
    public final int f75394d;

    /* renamed from: e, reason: collision with root package name */
    public final long f75395e;

    /* renamed from: f, reason: collision with root package name */
    public final long f75396f;

    public WxaPkgLoadProgress(int i17, long j17, long j18) {
        this.f75394d = 0;
        this.f75395e = -1L;
        this.f75396f = -1L;
        this.f75394d = i17;
        this.f75395e = j17;
        this.f75396f = j18;
        if (i17 > 0 || j17 <= 0 || j18 <= 0) {
            return;
        }
        this.f75394d = java.lang.Math.max(java.lang.Math.round((((float) j17) / ((float) j18)) * 100.0f), 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "WxaPkgLoadProgress{progress=" + this.f75394d + ", writtenLength=" + this.f75395e + ", totalLength=" + this.f75396f + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f75394d);
        parcel.writeLong(this.f75395e);
        parcel.writeLong(this.f75396f);
    }

    public WxaPkgLoadProgress(android.os.Parcel parcel) {
        this.f75394d = 0;
        this.f75395e = -1L;
        this.f75396f = -1L;
        this.f75394d = parcel.readInt();
        this.f75395e = parcel.readLong();
        this.f75396f = parcel.readLong();
    }
}
