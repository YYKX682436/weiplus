package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c;

/* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataStorageIPC$WxappParams */
/* loaded from: classes7.dex */
class C11727xe9d3cd3 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11727xe9d3cd3> f33513x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.r();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f158320d;

    /* renamed from: e, reason: collision with root package name */
    public final int f158321e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f158322f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f158323g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f158324h;

    /* renamed from: i, reason: collision with root package name */
    public final int f158325i;

    /* renamed from: m, reason: collision with root package name */
    public final long f158326m;

    /* renamed from: n, reason: collision with root package name */
    public final int f158327n;

    public C11727xe9d3cd3(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18, long j17, int i19) {
        this.f158320d = str;
        this.f158321e = i17;
        this.f158322f = str2;
        this.f158323g = str3;
        this.f158324h = str4;
        this.f158325i = i18;
        this.f158326m = j17;
        this.f158327n = i19;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f158320d);
        parcel.writeInt(this.f158321e);
        parcel.writeString(this.f158322f);
        parcel.writeString(this.f158323g);
        parcel.writeString(this.f158324h);
        parcel.writeInt(this.f158325i);
        parcel.writeLong(this.f158326m);
        parcel.writeInt(this.f158327n);
    }

    public C11727xe9d3cd3(android.os.Parcel parcel) {
        this.f158320d = parcel.readString();
        this.f158321e = parcel.readInt();
        this.f158322f = parcel.readString();
        this.f158323g = parcel.readString();
        this.f158324h = parcel.readString();
        this.f158325i = parcel.readInt();
        this.f158326m = parcel.readLong();
        this.f158327n = parcel.readInt();
    }
}
