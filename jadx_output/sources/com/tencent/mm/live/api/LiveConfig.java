package com.tencent.mm.live.api;

/* loaded from: classes3.dex */
public class LiveConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.live.api.LiveConfig> CREATOR = new en0.f();
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;
    public long D;
    public long E;
    public java.lang.String F;
    public java.lang.String G;
    public boolean H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public int f68535J;
    public int K;
    public java.lang.String L;
    public java.lang.String M;
    public long N;
    public byte[] P;
    public byte[] Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public java.lang.String W;
    public int X;
    public boolean Y;
    public int Z;

    /* renamed from: d, reason: collision with root package name */
    public int f68536d;

    /* renamed from: e, reason: collision with root package name */
    public long f68537e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f68538f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f68539g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f68540h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f68541i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f68542m;

    /* renamed from: n, reason: collision with root package name */
    public int f68543n;

    /* renamed from: o, reason: collision with root package name */
    public int f68544o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f68545p;

    /* renamed from: p0, reason: collision with root package name */
    public r45.v74 f68546p0;

    /* renamed from: q, reason: collision with root package name */
    public int f68547q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f68548r;

    /* renamed from: s, reason: collision with root package name */
    public long f68549s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f68550t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f68551u;

    /* renamed from: v, reason: collision with root package name */
    public int f68552v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f68553w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f68554x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f68555y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f68556z;

    public LiveConfig(en0.f fVar) {
        this.f68536d = 0;
        this.f68537e = 0L;
        this.f68538f = "";
        this.f68539g = "";
        this.f68540h = new java.util.HashMap();
        this.f68541i = "";
        this.f68542m = "";
        this.f68543n = 0;
        this.f68544o = 0;
        this.f68545p = "";
        this.f68547q = 0;
        this.f68548r = "";
        this.f68549s = 0L;
        this.f68550t = "";
        this.f68551u = "";
        this.f68552v = 0;
        this.f68553w = "";
        this.f68554x = "";
        this.f68555y = "";
        this.f68556z = "";
        this.A = "";
        this.B = "";
        this.C = "";
        this.D = 0L;
        this.E = 0L;
        this.F = "";
        this.G = "";
        this.H = false;
        this.I = "";
        this.f68535J = 0;
        this.K = 0;
        this.L = "";
        this.M = "";
        this.N = 0L;
        this.P = null;
        this.Q = null;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 0;
        this.W = "";
        this.X = 0;
        this.Y = false;
        this.Z = 0;
        this.f68546p0 = null;
    }

    public static com.tencent.mm.live.api.LiveConfig a(java.lang.String str, int i17) {
        en0.g gVar = new en0.g();
        gVar.f255246a = 0;
        gVar.f255247b = str;
        gVar.f255251f = c01.z1.r();
        gVar.f255252g = i17;
        return gVar.a();
    }

    public java.lang.String b() {
        java.lang.Object[] objArr = new java.lang.Object[23];
        objArr[0] = java.lang.Integer.valueOf(this.f68536d);
        objArr[1] = this.f68538f;
        objArr[2] = java.lang.Long.valueOf(this.f68537e);
        objArr[3] = this.f68539g;
        objArr[4] = this.f68542m;
        objArr[5] = java.lang.Integer.valueOf(this.f68543n);
        objArr[6] = java.lang.Integer.valueOf(this.f68544o);
        objArr[7] = java.lang.Long.valueOf(this.f68549s);
        objArr[8] = this.A;
        objArr[9] = this.B;
        objArr[10] = java.lang.Long.valueOf(this.D);
        objArr[11] = java.lang.Long.valueOf(this.E);
        objArr[12] = this.f68551u;
        objArr[13] = this.M;
        java.lang.String str = this.F;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = "";
        } else if (str.length() > 0 && 8 < str.length()) {
            str = str.substring(0, 8);
        }
        objArr[14] = str;
        objArr[15] = java.lang.Integer.valueOf(this.f68552v);
        objArr[16] = this.f68553w;
        objArr[17] = this.f68554x;
        objArr[18] = java.lang.Integer.valueOf(this.R);
        objArr[19] = java.lang.Integer.valueOf(this.S);
        objArr[20] = java.lang.Integer.valueOf(this.T);
        objArr[21] = java.lang.Integer.valueOf(this.U);
        objArr[22] = java.lang.Integer.valueOf(this.V);
        return java.lang.String.format("toWhere:%s,hostRoomId:%s,liveId:%s,liveName:%s,anchorUsername:%s,scene:%s,fromScene:%s, finderObjectId:%s, linkAnchorUsername:%s, linkAnchorNickname:%s,linkFinderObjectId:%s, linkFinderLiveId:%s, desc:%s, nicknameOption:%s sessionBuffer:%s,bindType:%s,bizUsername:%s,bizNickname:%s, vrLiveType:%s, eventid:%s, partid:%s, eventStatus:%s, streamStatus:%s", objArr);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f68536d);
        parcel.writeSerializable(this.f68540h);
        parcel.writeString(this.f68538f);
        parcel.writeLong(this.f68537e);
        parcel.writeString(this.f68539g);
        parcel.writeString(this.f68541i);
        parcel.writeString(this.f68542m);
        parcel.writeInt(this.f68543n);
        parcel.writeInt(this.f68544o);
        parcel.writeString(this.f68545p);
        parcel.writeInt(this.f68547q);
        parcel.writeLong(this.f68549s);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str = this.f68550t;
        if (str == null) {
            str = "";
        }
        parcel.writeString(str);
        parcel.writeString(this.f68556z);
        parcel.writeString(this.A);
        parcel.writeString(this.B);
        parcel.writeString(this.C);
        parcel.writeLong(this.D);
        parcel.writeLong(this.E);
        parcel.writeString(this.f68551u);
        parcel.writeString(this.F);
        parcel.writeString(this.G);
        parcel.writeByte(this.H ? (byte) 1 : (byte) 0);
        parcel.writeString(this.I);
        parcel.writeInt(this.f68535J);
        parcel.writeInt(this.K);
        parcel.writeString(this.L);
        parcel.writeString(this.f68548r);
        java.lang.String str2 = this.M;
        if (str2 == null) {
            str2 = "";
        }
        parcel.writeString(str2);
        parcel.writeLong(this.N);
        parcel.writeByteArray(this.P);
        parcel.writeByteArray(this.Q);
        parcel.writeInt(this.f68552v);
        java.lang.String str3 = this.f68553w;
        if (str3 == null) {
            str3 = "";
        }
        parcel.writeString(str3);
        java.lang.String str4 = this.f68554x;
        if (str4 == null) {
            str4 = "";
        }
        parcel.writeString(str4);
        java.lang.String str5 = this.f68555y;
        parcel.writeString(str5 != null ? str5 : "");
        parcel.writeInt(this.R);
        parcel.writeInt(this.S);
        parcel.writeInt(this.T);
        parcel.writeInt(this.U);
        parcel.writeInt(this.V);
        parcel.writeString(this.W);
        parcel.writeInt(this.X);
        parcel.writeByte(this.Y ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.Z);
        r45.v74 v74Var = this.f68546p0;
        if (v74Var == null) {
            parcel.writeInt(0);
            return;
        }
        try {
            byte[] byteArray = v74Var.toByteArray();
            parcel.writeInt(byteArray.length);
            parcel.writeByteArray(byteArray);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("LiveConfig", th6, "writeToParcel", new java.lang.Object[0]);
        }
    }

    public LiveConfig(android.os.Parcel parcel) {
        this.f68536d = 0;
        this.f68537e = 0L;
        this.f68538f = "";
        this.f68539g = "";
        this.f68540h = new java.util.HashMap();
        this.f68541i = "";
        this.f68542m = "";
        this.f68543n = 0;
        this.f68544o = 0;
        this.f68545p = "";
        this.f68547q = 0;
        this.f68548r = "";
        this.f68549s = 0L;
        this.f68550t = "";
        this.f68551u = "";
        this.f68552v = 0;
        this.f68553w = "";
        this.f68554x = "";
        this.f68555y = "";
        this.f68556z = "";
        this.A = "";
        this.B = "";
        this.C = "";
        this.D = 0L;
        this.E = 0L;
        this.F = "";
        this.G = "";
        this.H = false;
        this.I = "";
        this.f68535J = 0;
        this.K = 0;
        this.L = "";
        this.M = "";
        this.N = 0L;
        this.P = null;
        this.Q = null;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 0;
        this.W = "";
        this.X = 0;
        this.Y = false;
        this.Z = 0;
        this.f68546p0 = null;
        this.f68536d = parcel.readInt();
        this.f68540h = (java.util.HashMap) parcel.readSerializable();
        this.f68538f = parcel.readString();
        this.f68537e = parcel.readLong();
        this.f68539g = parcel.readString();
        this.f68541i = parcel.readString();
        this.f68542m = parcel.readString();
        this.f68543n = parcel.readInt();
        this.f68544o = parcel.readInt();
        this.f68545p = parcel.readString();
        this.f68547q = parcel.readInt();
        this.f68549s = parcel.readLong();
        this.f68550t = parcel.readString();
        this.f68556z = parcel.readString();
        this.A = parcel.readString();
        this.B = parcel.readString();
        this.C = parcel.readString();
        this.D = parcel.readLong();
        this.E = parcel.readLong();
        this.f68551u = parcel.readString();
        this.F = parcel.readString();
        this.G = parcel.readString();
        boolean z17 = true;
        this.H = parcel.readByte() == 1;
        this.I = parcel.readString();
        this.f68535J = parcel.readInt();
        this.K = parcel.readInt();
        this.L = parcel.readString();
        this.f68548r = parcel.readString();
        this.M = parcel.readString();
        this.N = parcel.readLong();
        this.P = parcel.createByteArray();
        this.Q = parcel.createByteArray();
        this.f68552v = parcel.readInt();
        this.f68553w = parcel.readString();
        this.f68554x = parcel.readString();
        this.f68555y = parcel.readString();
        this.R = parcel.readInt();
        try {
            this.S = parcel.readInt();
            this.T = parcel.readInt();
            this.U = parcel.readInt();
            this.V = parcel.readInt();
            this.W = parcel.readString();
            this.X = parcel.readInt();
            if (parcel.readByte() != 1) {
                z17 = false;
            }
            this.Y = z17;
            this.Z = parcel.readInt();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("LiveConfig", th6, "read error", new java.lang.Object[0]);
            this.S = 0;
        }
        int readInt = parcel.readInt();
        if (readInt <= 0) {
            this.f68546p0 = null;
            return;
        }
        byte[] bArr = new byte[readInt];
        parcel.readByteArray(bArr);
        try {
            com.tencent.mm.protobuf.f parseFrom = new r45.v74().parseFrom(bArr);
            if (parseFrom instanceof r45.v74) {
                this.f68546p0 = (r45.v74) parseFrom;
            }
        } catch (java.lang.Throwable th7) {
            com.tencent.mars.xlog.Log.printErrStackTrace("LiveConfig", th7, "constructor", new java.lang.Object[0]);
        }
    }
}
