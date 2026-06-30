package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1237xfa7dc33e.p1238x6b0147b;

/* renamed from: com.tencent.mm.plugin.appbrand.xweb_ext.video.AppBrandWeishiVideoOperation */
/* loaded from: classes7.dex */
public class C12820x9ba6562b implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1237xfa7dc33e.p1238x6b0147b.C12820x9ba6562b> f35346x681a0c0c = new lm1.d();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f173929d;

    /* renamed from: e, reason: collision with root package name */
    public final long f173930e;

    /* renamed from: f, reason: collision with root package name */
    public final long f173931f;

    public C12820x9ba6562b(java.lang.String str, long j17, long j18) {
        this.f173929d = str;
        this.f173930e = j17;
        this.f173931f = j18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f173929d);
        parcel.writeLong(this.f173930e);
        parcel.writeLong(this.f173931f);
    }

    public C12820x9ba6562b(android.os.Parcel parcel) {
        this.f173929d = parcel.readString();
        this.f173930e = parcel.readLong();
        this.f173931f = parcel.readLong();
    }
}
