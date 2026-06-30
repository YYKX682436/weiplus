package com.tencent.mm.plugin.appbrand.config;

/* loaded from: classes7.dex */
public class WxaAttributes$WxaDynamicInfo$Setting implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaDynamicInfo$Setting> CREATOR = new k91.n5();
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
    public long f77408J;
    public long K;
    public long L;
    public byte[] M;
    public long N;
    public java.lang.String P;

    /* renamed from: d, reason: collision with root package name */
    public int f77409d;

    /* renamed from: e, reason: collision with root package name */
    public int f77410e;

    /* renamed from: f, reason: collision with root package name */
    public int f77411f;

    /* renamed from: g, reason: collision with root package name */
    public int f77412g;

    /* renamed from: h, reason: collision with root package name */
    public int f77413h;

    /* renamed from: i, reason: collision with root package name */
    public int f77414i;

    /* renamed from: m, reason: collision with root package name */
    public int f77415m;

    /* renamed from: n, reason: collision with root package name */
    public int f77416n;

    /* renamed from: o, reason: collision with root package name */
    public int f77417o;

    /* renamed from: p, reason: collision with root package name */
    public int f77418p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f77419q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f77420r;

    /* renamed from: s, reason: collision with root package name */
    public int f77421s;

    /* renamed from: t, reason: collision with root package name */
    public int f77422t;

    /* renamed from: u, reason: collision with root package name */
    public int f77423u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f77424v;

    /* renamed from: w, reason: collision with root package name */
    public int f77425w;

    /* renamed from: x, reason: collision with root package name */
    public int f77426x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f77427y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f77428z;

    public WxaAttributes$WxaDynamicInfo$Setting(android.os.Parcel parcel) {
        this.f77409d = parcel.readInt();
        this.f77410e = parcel.readInt();
        this.f77411f = parcel.readInt();
        this.f77412g = parcel.readInt();
        this.f77413h = parcel.readInt();
        this.f77414i = parcel.readInt();
        this.f77415m = parcel.readInt();
        this.f77416n = parcel.readInt();
        this.f77417o = parcel.readInt();
        this.f77418p = parcel.readInt();
        this.f77419q = parcel.readByte() != 0;
        this.f77420r = parcel.readByte() != 0;
        this.f77421s = parcel.readInt();
        this.f77422t = parcel.readInt();
        this.f77423u = parcel.readInt();
        this.f77424v = parcel.readByte() != 0;
        this.f77425w = parcel.readInt();
        this.f77426x = parcel.readInt();
        this.f77427y = parcel.readByte() != 0;
        this.f77428z = parcel.readByte() != 0;
        this.B = parcel.readByte() != 0;
        this.C = parcel.readInt();
        this.D = parcel.readInt();
        this.E = parcel.readInt();
        this.F = parcel.readByte() != 0;
        this.G = parcel.readByte() != 0;
        this.H = parcel.readInt();
        this.I = parcel.readLong();
        this.f77408J = parcel.readLong();
        this.K = parcel.readLong();
        this.L = parcel.readLong();
        this.M = parcel.createByteArray();
        this.N = parcel.readLong();
        this.P = parcel.readString();
        this.A = parcel.readByte() != 0;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaDynamicInfo$Setting clone() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.setDataPosition(0);
        writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        try {
            return CREATOR.createFromParcel(obtain);
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
        parcel.writeInt(this.f77409d);
        parcel.writeInt(this.f77410e);
        parcel.writeInt(this.f77411f);
        parcel.writeInt(this.f77412g);
        parcel.writeInt(this.f77413h);
        parcel.writeInt(this.f77414i);
        parcel.writeInt(this.f77415m);
        parcel.writeInt(this.f77416n);
        parcel.writeInt(this.f77417o);
        parcel.writeInt(this.f77418p);
        parcel.writeByte(this.f77419q ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f77420r ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f77421s);
        parcel.writeInt(this.f77422t);
        parcel.writeInt(this.f77423u);
        parcel.writeByte(this.f77424v ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f77425w);
        parcel.writeInt(this.f77426x);
        parcel.writeByte(this.f77427y ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f77428z ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.B ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.C);
        parcel.writeInt(this.D);
        parcel.writeInt(this.E);
        parcel.writeByte(this.F ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.G ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.H);
        parcel.writeLong(this.I);
        parcel.writeLong(this.f77408J);
        parcel.writeLong(this.K);
        parcel.writeLong(this.L);
        parcel.writeByteArray(this.M);
        parcel.writeLong(this.N);
        parcel.writeString(this.P);
        parcel.writeByte(this.A ? (byte) 1 : (byte) 0);
    }
}
