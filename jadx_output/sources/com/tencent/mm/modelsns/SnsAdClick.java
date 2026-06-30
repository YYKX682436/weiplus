package com.tencent.mm.modelsns;

/* loaded from: classes4.dex */
public class SnsAdClick implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.modelsns.SnsAdClick> CREATOR = new m21.c();

    /* renamed from: d, reason: collision with root package name */
    public int f71466d;

    /* renamed from: e, reason: collision with root package name */
    public int f71467e;

    /* renamed from: f, reason: collision with root package name */
    public long f71468f;

    /* renamed from: g, reason: collision with root package name */
    public int f71469g;

    /* renamed from: h, reason: collision with root package name */
    public int f71470h;

    /* renamed from: i, reason: collision with root package name */
    public long f71471i;

    /* renamed from: m, reason: collision with root package name */
    public int f71472m;

    /* renamed from: n, reason: collision with root package name */
    public int f71473n;

    /* renamed from: o, reason: collision with root package name */
    public long f71474o;

    /* renamed from: p, reason: collision with root package name */
    public long f71475p;

    /* renamed from: q, reason: collision with root package name */
    public final int f71476q;

    /* renamed from: r, reason: collision with root package name */
    public long f71477r;

    /* renamed from: s, reason: collision with root package name */
    public long f71478s;

    /* renamed from: t, reason: collision with root package name */
    public int f71479t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f71480u;

    public SnsAdClick() {
        this.f71467e = 0;
        this.f71469g = 0;
        this.f71470h = 0;
        this.f71471i = 0L;
        this.f71472m = 0;
        this.f71473n = 0;
        this.f71474o = 0L;
        this.f71475p = 0L;
        this.f71476q = 0;
        this.f71477r = 0L;
        this.f71478s = 0L;
        this.f71479t = 0;
        this.f71480u = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f71466d);
        parcel.writeInt(this.f71467e);
        parcel.writeLong(this.f71468f);
        parcel.writeInt(this.f71469g);
        parcel.writeInt(this.f71470h);
        parcel.writeInt(this.f71472m);
        parcel.writeInt(this.f71473n);
        parcel.writeLong(this.f71471i);
        parcel.writeLong(this.f71475p);
        parcel.writeLong(this.f71477r);
        parcel.writeLong(this.f71478s);
        parcel.writeInt(this.f71479t);
        parcel.writeString(this.f71480u);
    }

    public SnsAdClick(int i17, int i18, long j17, int i19, int i27) {
        this(i17, i18, j17, i19, i27, 0, 0, 0);
    }

    public SnsAdClick(int i17, int i18, long j17, int i19, int i27, int i28) {
        this(i17, i18, j17, i19, i27, 0, 0, i28);
    }

    public SnsAdClick(int i17, int i18, long j17, int i19, int i27, int i28, int i29, int i37) {
        this.f71471i = 0L;
        this.f71474o = 0L;
        this.f71475p = 0L;
        this.f71476q = 0;
        this.f71477r = 0L;
        this.f71478s = 0L;
        this.f71479t = 0;
        this.f71480u = "";
        this.f71466d = i17;
        this.f71467e = i18;
        this.f71468f = j17;
        this.f71469g = i19;
        this.f71470h = i27;
        this.f71472m = i28;
        this.f71473n = i29;
        this.f71476q = i37;
        this.f71471i = java.lang.System.currentTimeMillis();
    }
}
