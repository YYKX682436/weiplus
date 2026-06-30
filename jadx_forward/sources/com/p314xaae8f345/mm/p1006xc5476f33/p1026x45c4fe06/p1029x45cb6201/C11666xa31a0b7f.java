package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress */
/* loaded from: classes7.dex */
public class C11666xa31a0b7f implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11666xa31a0b7f> f33465x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.m9();

    /* renamed from: d, reason: collision with root package name */
    public final int f156927d;

    /* renamed from: e, reason: collision with root package name */
    public final long f156928e;

    /* renamed from: f, reason: collision with root package name */
    public final long f156929f;

    public C11666xa31a0b7f(int i17, long j17, long j18) {
        this.f156927d = 0;
        this.f156928e = -1L;
        this.f156929f = -1L;
        this.f156927d = i17;
        this.f156928e = j17;
        this.f156929f = j18;
        if (i17 > 0 || j17 <= 0 || j18 <= 0) {
            return;
        }
        this.f156927d = java.lang.Math.max(java.lang.Math.round((((float) j17) / ((float) j18)) * 100.0f), 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m49226x9616526c() {
        return "WxaPkgLoadProgress{progress=" + this.f156927d + ", writtenLength=" + this.f156928e + ", totalLength=" + this.f156929f + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f156927d);
        parcel.writeLong(this.f156928e);
        parcel.writeLong(this.f156929f);
    }

    public C11666xa31a0b7f(android.os.Parcel parcel) {
        this.f156927d = 0;
        this.f156928e = -1L;
        this.f156929f = -1L;
        this.f156927d = parcel.readInt();
        this.f156928e = parcel.readLong();
        this.f156929f = parcel.readLong();
    }
}
