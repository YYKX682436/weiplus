package com.tencent.mm.plugin.appbrand.backgroundfetch;

/* loaded from: classes4.dex */
public class AppBrandBackgroundFetchDataParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataParcel> CREATOR = new com.tencent.mm.plugin.appbrand.backgroundfetch.i();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f76777d;

    /* renamed from: e, reason: collision with root package name */
    public int f76778e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f76779f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f76780g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f76781h;

    /* renamed from: i, reason: collision with root package name */
    public int f76782i;

    /* renamed from: m, reason: collision with root package name */
    public long f76783m;

    /* renamed from: n, reason: collision with root package name */
    public int f76784n;

    public AppBrandBackgroundFetchDataParcel(android.os.Parcel parcel) {
        this.f76777d = parcel.readString();
        this.f76778e = parcel.readInt();
        this.f76779f = parcel.readString();
        this.f76780g = parcel.readString();
        this.f76781h = parcel.readString();
        this.f76782i = parcel.readInt();
        this.f76783m = parcel.readLong();
        this.f76784n = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f76777d);
        parcel.writeInt(this.f76778e);
        parcel.writeString(this.f76779f);
        parcel.writeString(this.f76780g);
        parcel.writeString(this.f76781h);
        parcel.writeInt(this.f76782i);
        parcel.writeLong(this.f76783m);
        parcel.writeInt(this.f76784n);
    }
}
