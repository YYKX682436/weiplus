package com.tencent.mm.plugin.appbrand.location;

/* loaded from: classes7.dex */
public class AppBrandLocationReport$LocationInfoData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.location.AppBrandLocationReport$LocationInfoData> CREATOR = new com.tencent.mm.plugin.appbrand.location.c();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f85488d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f85489e;

    /* renamed from: f, reason: collision with root package name */
    public int f85490f;

    /* renamed from: g, reason: collision with root package name */
    public double f85491g;

    /* renamed from: h, reason: collision with root package name */
    public double f85492h;

    /* renamed from: i, reason: collision with root package name */
    public int f85493i;

    /* renamed from: m, reason: collision with root package name */
    public double f85494m;

    /* renamed from: n, reason: collision with root package name */
    public double f85495n;

    /* renamed from: o, reason: collision with root package name */
    public double f85496o;

    /* renamed from: p, reason: collision with root package name */
    public long f85497p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f85498q;

    public AppBrandLocationReport$LocationInfoData() {
        this.f85488d = "";
        this.f85489e = "";
        this.f85490f = 0;
        this.f85491g = 0.0d;
        this.f85492h = 0.0d;
        this.f85493i = 0;
        this.f85494m = 0.0d;
        this.f85495n = 0.0d;
        this.f85496o = 0.0d;
        this.f85497p = 0L;
        this.f85498q = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f85488d);
        parcel.writeString(this.f85489e);
        parcel.writeInt(this.f85490f);
        parcel.writeDouble(this.f85491g);
        parcel.writeDouble(this.f85492h);
        parcel.writeInt(this.f85493i);
        parcel.writeDouble(this.f85494m);
        parcel.writeDouble(this.f85495n);
        parcel.writeDouble(this.f85496o);
        parcel.writeLong(this.f85497p);
        parcel.writeInt(this.f85498q ? 1 : 0);
    }

    public AppBrandLocationReport$LocationInfoData(android.os.Parcel parcel) {
        this.f85488d = "";
        this.f85489e = "";
        this.f85490f = 0;
        this.f85491g = 0.0d;
        this.f85492h = 0.0d;
        this.f85493i = 0;
        this.f85494m = 0.0d;
        this.f85495n = 0.0d;
        this.f85496o = 0.0d;
        this.f85497p = 0L;
        this.f85498q = false;
        this.f85488d = parcel.readString();
        this.f85489e = parcel.readString();
        this.f85490f = parcel.readInt();
        this.f85491g = parcel.readDouble();
        this.f85492h = parcel.readDouble();
        this.f85493i = parcel.readInt();
        this.f85494m = parcel.readDouble();
        this.f85495n = parcel.readDouble();
        this.f85496o = parcel.readDouble();
        this.f85497p = parcel.readLong();
        this.f85498q = parcel.readInt() == 1;
    }
}
