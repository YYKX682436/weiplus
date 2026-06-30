package com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9;

/* renamed from: com.tencent.mm.pluginsdk.wallet.PayInfo */
/* loaded from: classes9.dex */
public class C19760x34448d56 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56> f38857x681a0c0c = new h45.t();
    public java.lang.String A;
    public java.lang.String B;
    public int C;
    public int D;
    public int E;
    public long F;
    public java.lang.String G;
    public int H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f273640J;
    public int K;
    public int L;
    public final double M;
    public java.lang.String N;
    public boolean P;
    public java.lang.String Q;

    /* renamed from: d, reason: collision with root package name */
    public int f273641d;

    /* renamed from: e, reason: collision with root package name */
    public int f273642e;

    /* renamed from: f, reason: collision with root package name */
    public int f273643f;

    /* renamed from: g, reason: collision with root package name */
    public int f273644g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f273645h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f273646i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f273647m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f273648n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f273649o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f273650p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f273651q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f273652r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f273653s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f273654t;

    /* renamed from: u, reason: collision with root package name */
    public android.os.Bundle f273655u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f273656v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f273657w;

    /* renamed from: x, reason: collision with root package name */
    public int f273658x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f273659y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f273660z;

    public C19760x34448d56() {
        this.f273641d = -1;
        this.f273642e = 0;
        this.f273643f = 0;
        this.f273645h = false;
        this.f273646i = true;
        this.f273658x = 0;
        this.D = 0;
        this.F = 0L;
        this.G = "";
        this.H = -1;
        this.K = 1;
        this.L = 0;
        this.M = 0.0d;
        this.N = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m75921x9616526c() {
        return java.lang.String.format("sense : %d, reqKey : %s, uuid : %s, appId : %s, appSource : %s, partnerId : %s, paySign : %s, productId : %s, soterAuth: %s", java.lang.Integer.valueOf(this.f273642e), this.f273647m, this.f273648n, this.f273649o, this.f273650p, this.f273651q, this.f273652r, this.f273653s, this.G);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f273642e);
        parcel.writeInt(this.f273643f);
        parcel.writeString(this.f273647m);
        parcel.writeString(this.f273648n);
        parcel.writeString(this.f273649o);
        parcel.writeString(this.f273650p);
        parcel.writeString(this.f273651q);
        parcel.writeString(this.f273652r);
        parcel.writeString(this.f273653s);
        parcel.writeString(this.f273654t);
        parcel.writeInt(this.f273644g);
        parcel.writeInt(this.f273641d);
        parcel.writeInt(this.f273645h ? 1 : 0);
        parcel.writeInt(this.f273646i ? 1 : 0);
        parcel.writeBundle(this.f273655u);
        parcel.writeInt(this.f273658x);
        parcel.writeString(this.A);
        parcel.writeString(this.B);
        parcel.writeInt(this.C);
        parcel.writeLong(this.F);
        parcel.writeString(this.G);
        parcel.writeString(this.I);
        parcel.writeString(this.f273640J);
        parcel.writeInt(this.K);
        parcel.writeString(this.f273656v);
        parcel.writeString(this.f273657w);
        parcel.writeInt(this.L);
        parcel.writeDouble(this.M);
        parcel.writeString(this.N);
        parcel.writeInt(this.P ? 1 : 0);
        parcel.writeString(this.Q);
        parcel.writeString(this.f273659y);
        parcel.writeInt(this.f273660z ? 1 : 0);
    }

    public C19760x34448d56(android.os.Parcel parcel) {
        this.f273641d = -1;
        this.f273642e = 0;
        this.f273643f = 0;
        this.f273645h = false;
        this.f273646i = true;
        this.f273658x = 0;
        this.D = 0;
        this.F = 0L;
        this.G = "";
        this.H = -1;
        this.K = 1;
        this.L = 0;
        this.M = 0.0d;
        this.N = "";
        this.f273642e = parcel.readInt();
        this.f273643f = parcel.readInt();
        this.f273647m = parcel.readString();
        this.f273648n = parcel.readString();
        this.f273649o = parcel.readString();
        this.f273650p = parcel.readString();
        this.f273651q = parcel.readString();
        this.f273652r = parcel.readString();
        this.f273653s = parcel.readString();
        this.f273654t = parcel.readString();
        this.f273644g = parcel.readInt();
        this.f273641d = parcel.readInt();
        this.f273645h = parcel.readInt() == 1;
        this.f273646i = parcel.readInt() == 1;
        this.f273655u = parcel.readBundle();
        this.f273658x = parcel.readInt();
        this.A = parcel.readString();
        this.B = parcel.readString();
        this.C = parcel.readInt();
        this.F = parcel.readLong();
        this.G = parcel.readString();
        this.I = parcel.readString();
        this.f273640J = parcel.readString();
        this.K = parcel.readInt();
        this.f273656v = parcel.readString();
        this.f273657w = parcel.readString();
        this.L = parcel.readInt();
        this.M = parcel.readDouble();
        java.lang.String readString = parcel.readString();
        this.N = readString;
        if (readString == null) {
            this.N = "";
        }
        this.P = parcel.readInt() == 1;
        this.Q = parcel.readString();
        this.f273659y = parcel.readString();
        this.f273660z = parcel.readInt() == 1;
    }
}
