package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5;

/* renamed from: com.tencent.mm.plugin.appbrand.location.AppBrandLocationReport$LocationInfoData */
/* loaded from: classes7.dex */
public class C12398x24351782 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.C12398x24351782> f35081x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.c();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f167021d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f167022e;

    /* renamed from: f, reason: collision with root package name */
    public int f167023f;

    /* renamed from: g, reason: collision with root package name */
    public double f167024g;

    /* renamed from: h, reason: collision with root package name */
    public double f167025h;

    /* renamed from: i, reason: collision with root package name */
    public int f167026i;

    /* renamed from: m, reason: collision with root package name */
    public double f167027m;

    /* renamed from: n, reason: collision with root package name */
    public double f167028n;

    /* renamed from: o, reason: collision with root package name */
    public double f167029o;

    /* renamed from: p, reason: collision with root package name */
    public long f167030p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f167031q;

    public C12398x24351782() {
        this.f167021d = "";
        this.f167022e = "";
        this.f167023f = 0;
        this.f167024g = 0.0d;
        this.f167025h = 0.0d;
        this.f167026i = 0;
        this.f167027m = 0.0d;
        this.f167028n = 0.0d;
        this.f167029o = 0.0d;
        this.f167030p = 0L;
        this.f167031q = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f167021d);
        parcel.writeString(this.f167022e);
        parcel.writeInt(this.f167023f);
        parcel.writeDouble(this.f167024g);
        parcel.writeDouble(this.f167025h);
        parcel.writeInt(this.f167026i);
        parcel.writeDouble(this.f167027m);
        parcel.writeDouble(this.f167028n);
        parcel.writeDouble(this.f167029o);
        parcel.writeLong(this.f167030p);
        parcel.writeInt(this.f167031q ? 1 : 0);
    }

    public C12398x24351782(android.os.Parcel parcel) {
        this.f167021d = "";
        this.f167022e = "";
        this.f167023f = 0;
        this.f167024g = 0.0d;
        this.f167025h = 0.0d;
        this.f167026i = 0;
        this.f167027m = 0.0d;
        this.f167028n = 0.0d;
        this.f167029o = 0.0d;
        this.f167030p = 0L;
        this.f167031q = false;
        this.f167021d = parcel.readString();
        this.f167022e = parcel.readString();
        this.f167023f = parcel.readInt();
        this.f167024g = parcel.readDouble();
        this.f167025h = parcel.readDouble();
        this.f167026i = parcel.readInt();
        this.f167027m = parcel.readDouble();
        this.f167028n = parcel.readDouble();
        this.f167029o = parcel.readDouble();
        this.f167030p = parcel.readLong();
        this.f167031q = parcel.readInt() == 1;
    }
}
