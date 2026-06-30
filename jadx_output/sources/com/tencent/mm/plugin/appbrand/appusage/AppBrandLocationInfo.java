package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public class AppBrandLocationInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.appusage.AppBrandLocationInfo> CREATOR = new com.tencent.mm.plugin.appbrand.appusage.b2();

    /* renamed from: d, reason: collision with root package name */
    public double f76347d;

    /* renamed from: e, reason: collision with root package name */
    public double f76348e;

    /* renamed from: f, reason: collision with root package name */
    public int f76349f;

    /* renamed from: g, reason: collision with root package name */
    public double f76350g;

    /* renamed from: h, reason: collision with root package name */
    public double f76351h;

    /* renamed from: i, reason: collision with root package name */
    public double f76352i;

    /* renamed from: m, reason: collision with root package name */
    public long f76353m;

    public AppBrandLocationInfo() {
        this.f76347d = 0.0d;
        this.f76348e = 0.0d;
        this.f76349f = 0;
        this.f76350g = 0.0d;
        this.f76351h = 0.0d;
        this.f76352i = 0.0d;
        this.f76353m = 0L;
    }

    public boolean a() {
        return this.f76353m > 0 && java.lang.System.currentTimeMillis() - this.f76353m < 600000;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeDouble(this.f76347d);
        parcel.writeDouble(this.f76348e);
        parcel.writeInt(this.f76349f);
        parcel.writeDouble(this.f76350g);
        parcel.writeDouble(this.f76351h);
        parcel.writeDouble(this.f76352i);
        parcel.writeLong(this.f76353m);
    }

    public AppBrandLocationInfo(android.os.Parcel parcel) {
        this.f76347d = 0.0d;
        this.f76348e = 0.0d;
        this.f76349f = 0;
        this.f76350g = 0.0d;
        this.f76351h = 0.0d;
        this.f76352i = 0.0d;
        this.f76353m = 0L;
        this.f76347d = parcel.readDouble();
        this.f76348e = parcel.readDouble();
        this.f76349f = parcel.readInt();
        this.f76350g = parcel.readDouble();
        this.f76351h = parcel.readDouble();
        this.f76352i = parcel.readDouble();
        this.f76353m = parcel.readLong();
    }
}
