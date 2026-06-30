package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* renamed from: com.tencent.mm.plugin.downloader.model.DownloadState */
/* loaded from: classes.dex */
public class C13218x30dc50c9 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13218x30dc50c9> f35452x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f178483d;

    /* renamed from: e, reason: collision with root package name */
    public final long f178484e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f178485f;

    /* renamed from: g, reason: collision with root package name */
    public final long f178486g;

    /* renamed from: h, reason: collision with root package name */
    public final long f178487h;

    /* renamed from: i, reason: collision with root package name */
    public final float f178488i;

    public C13218x30dc50c9(android.os.Parcel parcel, com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r rVar) {
        this.f178483d = parcel.readString();
        this.f178484e = parcel.readLong();
        this.f178485f = parcel.readString();
        this.f178486g = parcel.readLong();
        this.f178487h = parcel.readLong();
        this.f178488i = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f178483d);
        parcel.writeLong(this.f178484e);
        parcel.writeString(this.f178485f);
        parcel.writeLong(this.f178486g);
        parcel.writeLong(this.f178487h);
        parcel.writeFloat(this.f178488i);
    }
}
