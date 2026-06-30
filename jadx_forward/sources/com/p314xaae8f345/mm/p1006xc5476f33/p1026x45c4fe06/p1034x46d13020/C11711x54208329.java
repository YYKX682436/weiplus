package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.AppBrandLocationInfo */
/* loaded from: classes7.dex */
public class C11711x54208329 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11711x54208329> f33504x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b2();

    /* renamed from: d, reason: collision with root package name */
    public double f157880d;

    /* renamed from: e, reason: collision with root package name */
    public double f157881e;

    /* renamed from: f, reason: collision with root package name */
    public int f157882f;

    /* renamed from: g, reason: collision with root package name */
    public double f157883g;

    /* renamed from: h, reason: collision with root package name */
    public double f157884h;

    /* renamed from: i, reason: collision with root package name */
    public double f157885i;

    /* renamed from: m, reason: collision with root package name */
    public long f157886m;

    public C11711x54208329() {
        this.f157880d = 0.0d;
        this.f157881e = 0.0d;
        this.f157882f = 0;
        this.f157883g = 0.0d;
        this.f157884h = 0.0d;
        this.f157885i = 0.0d;
        this.f157886m = 0L;
    }

    public boolean a() {
        return this.f157886m > 0 && java.lang.System.currentTimeMillis() - this.f157886m < 600000;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeDouble(this.f157880d);
        parcel.writeDouble(this.f157881e);
        parcel.writeInt(this.f157882f);
        parcel.writeDouble(this.f157883g);
        parcel.writeDouble(this.f157884h);
        parcel.writeDouble(this.f157885i);
        parcel.writeLong(this.f157886m);
    }

    public C11711x54208329(android.os.Parcel parcel) {
        this.f157880d = 0.0d;
        this.f157881e = 0.0d;
        this.f157882f = 0;
        this.f157883g = 0.0d;
        this.f157884h = 0.0d;
        this.f157885i = 0.0d;
        this.f157886m = 0L;
        this.f157880d = parcel.readDouble();
        this.f157881e = parcel.readDouble();
        this.f157882f = parcel.readInt();
        this.f157883g = parcel.readDouble();
        this.f157884h = parcel.readDouble();
        this.f157885i = parcel.readDouble();
        this.f157886m = parcel.readLong();
    }
}
