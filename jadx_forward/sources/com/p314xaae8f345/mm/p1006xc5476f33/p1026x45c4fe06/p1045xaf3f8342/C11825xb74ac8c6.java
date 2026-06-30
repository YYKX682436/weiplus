package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342;

/* renamed from: com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaDynamicInfo$Setting */
/* loaded from: classes7.dex */
public class C11825xb74ac8c6 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11825xb74ac8c6> f33602x681a0c0c = new k91.n5();
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public int H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public long f158941J;
    public long K;
    public long L;
    public byte[] M;
    public long N;
    public java.lang.String P;

    /* renamed from: d, reason: collision with root package name */
    public int f158942d;

    /* renamed from: e, reason: collision with root package name */
    public int f158943e;

    /* renamed from: f, reason: collision with root package name */
    public int f158944f;

    /* renamed from: g, reason: collision with root package name */
    public int f158945g;

    /* renamed from: h, reason: collision with root package name */
    public int f158946h;

    /* renamed from: i, reason: collision with root package name */
    public int f158947i;

    /* renamed from: m, reason: collision with root package name */
    public int f158948m;

    /* renamed from: n, reason: collision with root package name */
    public int f158949n;

    /* renamed from: o, reason: collision with root package name */
    public int f158950o;

    /* renamed from: p, reason: collision with root package name */
    public int f158951p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f158952q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f158953r;

    /* renamed from: s, reason: collision with root package name */
    public int f158954s;

    /* renamed from: t, reason: collision with root package name */
    public int f158955t;

    /* renamed from: u, reason: collision with root package name */
    public int f158956u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f158957v;

    /* renamed from: w, reason: collision with root package name */
    public int f158958w;

    /* renamed from: x, reason: collision with root package name */
    public int f158959x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f158960y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f158961z;

    public C11825xb74ac8c6(android.os.Parcel parcel) {
        this.f158942d = parcel.readInt();
        this.f158943e = parcel.readInt();
        this.f158944f = parcel.readInt();
        this.f158945g = parcel.readInt();
        this.f158946h = parcel.readInt();
        this.f158947i = parcel.readInt();
        this.f158948m = parcel.readInt();
        this.f158949n = parcel.readInt();
        this.f158950o = parcel.readInt();
        this.f158951p = parcel.readInt();
        this.f158952q = parcel.readByte() != 0;
        this.f158953r = parcel.readByte() != 0;
        this.f158954s = parcel.readInt();
        this.f158955t = parcel.readInt();
        this.f158956u = parcel.readInt();
        this.f158957v = parcel.readByte() != 0;
        this.f158958w = parcel.readInt();
        this.f158959x = parcel.readInt();
        this.f158960y = parcel.readByte() != 0;
        this.f158961z = parcel.readByte() != 0;
        this.B = parcel.readByte() != 0;
        this.C = parcel.readInt();
        this.D = parcel.readInt();
        this.E = parcel.readInt();
        this.F = parcel.readByte() != 0;
        this.G = parcel.readByte() != 0;
        this.H = parcel.readInt();
        this.I = parcel.readLong();
        this.f158941J = parcel.readLong();
        this.K = parcel.readLong();
        this.L = parcel.readLong();
        this.M = parcel.createByteArray();
        this.N = parcel.readLong();
        this.P = parcel.readString();
        this.A = parcel.readByte() != 0;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11825xb74ac8c6 m50136x5a5dd5d() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.setDataPosition(0);
        writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        try {
            return f33602x681a0c0c.createFromParcel(obtain);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f158942d);
        parcel.writeInt(this.f158943e);
        parcel.writeInt(this.f158944f);
        parcel.writeInt(this.f158945g);
        parcel.writeInt(this.f158946h);
        parcel.writeInt(this.f158947i);
        parcel.writeInt(this.f158948m);
        parcel.writeInt(this.f158949n);
        parcel.writeInt(this.f158950o);
        parcel.writeInt(this.f158951p);
        parcel.writeByte(this.f158952q ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f158953r ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f158954s);
        parcel.writeInt(this.f158955t);
        parcel.writeInt(this.f158956u);
        parcel.writeByte(this.f158957v ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f158958w);
        parcel.writeInt(this.f158959x);
        parcel.writeByte(this.f158960y ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f158961z ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.B ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.C);
        parcel.writeInt(this.D);
        parcel.writeInt(this.E);
        parcel.writeByte(this.F ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.G ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.H);
        parcel.writeLong(this.I);
        parcel.writeLong(this.f158941J);
        parcel.writeLong(this.K);
        parcel.writeLong(this.L);
        parcel.writeByteArray(this.M);
        parcel.writeLong(this.N);
        parcel.writeString(this.P);
        parcel.writeByte(this.A ? (byte) 1 : (byte) 0);
    }
}
