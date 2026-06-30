package com.tencent.mm.plugin.appbrand.xweb_ext.video;

/* loaded from: classes7.dex */
public class AppBrandWeishiVideoOperation implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.xweb_ext.video.AppBrandWeishiVideoOperation> CREATOR = new lm1.d();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f92396d;

    /* renamed from: e, reason: collision with root package name */
    public final long f92397e;

    /* renamed from: f, reason: collision with root package name */
    public final long f92398f;

    public AppBrandWeishiVideoOperation(java.lang.String str, long j17, long j18) {
        this.f92396d = str;
        this.f92397e = j17;
        this.f92398f = j18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f92396d);
        parcel.writeLong(this.f92397e);
        parcel.writeLong(this.f92398f);
    }

    public AppBrandWeishiVideoOperation(android.os.Parcel parcel) {
        this.f92396d = parcel.readString();
        this.f92397e = parcel.readLong();
        this.f92398f = parcel.readLong();
    }
}
