package com.tencent.mm.plugin.appbrand.backgroundfetch;

/* loaded from: classes7.dex */
class AppBrandBackgroundFetchDataStorageIPC$WxappParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataStorageIPC$WxappParams> CREATOR = new com.tencent.mm.plugin.appbrand.backgroundfetch.r();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f76787d;

    /* renamed from: e, reason: collision with root package name */
    public final int f76788e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f76789f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f76790g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f76791h;

    /* renamed from: i, reason: collision with root package name */
    public final int f76792i;

    /* renamed from: m, reason: collision with root package name */
    public final long f76793m;

    /* renamed from: n, reason: collision with root package name */
    public final int f76794n;

    public AppBrandBackgroundFetchDataStorageIPC$WxappParams(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18, long j17, int i19) {
        this.f76787d = str;
        this.f76788e = i17;
        this.f76789f = str2;
        this.f76790g = str3;
        this.f76791h = str4;
        this.f76792i = i18;
        this.f76793m = j17;
        this.f76794n = i19;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f76787d);
        parcel.writeInt(this.f76788e);
        parcel.writeString(this.f76789f);
        parcel.writeString(this.f76790g);
        parcel.writeString(this.f76791h);
        parcel.writeInt(this.f76792i);
        parcel.writeLong(this.f76793m);
        parcel.writeInt(this.f76794n);
    }

    public AppBrandBackgroundFetchDataStorageIPC$WxappParams(android.os.Parcel parcel) {
        this.f76787d = parcel.readString();
        this.f76788e = parcel.readInt();
        this.f76789f = parcel.readString();
        this.f76790g = parcel.readString();
        this.f76791h = parcel.readString();
        this.f76792i = parcel.readInt();
        this.f76793m = parcel.readLong();
        this.f76794n = parcel.readInt();
    }
}
