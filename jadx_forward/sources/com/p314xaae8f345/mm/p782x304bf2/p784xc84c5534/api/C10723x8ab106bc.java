package com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api;

/* renamed from: com.tencent.mm.game.report.api.GameWebPerformanceInfo */
/* loaded from: classes8.dex */
public class C10723x8ab106bc implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc> f28968x681a0c0c = new jj0.c();
    public static final java.util.Map Q = new java.util.HashMap();
    public long A;
    public long B;
    public long C;
    public long D;
    public long E;
    public long F;
    public long G;
    public long H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public long f149706J;
    public final long K;
    public final long L;
    public java.lang.String M;
    public java.lang.String N;
    public java.lang.String P;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f149707d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f149708e;

    /* renamed from: f, reason: collision with root package name */
    public int f149709f;

    /* renamed from: g, reason: collision with root package name */
    public int f149710g;

    /* renamed from: h, reason: collision with root package name */
    public int f149711h;

    /* renamed from: i, reason: collision with root package name */
    public int f149712i;

    /* renamed from: m, reason: collision with root package name */
    public final int f149713m;

    /* renamed from: n, reason: collision with root package name */
    public final int f149714n;

    /* renamed from: o, reason: collision with root package name */
    public int f149715o;

    /* renamed from: p, reason: collision with root package name */
    public int f149716p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f149717q;

    /* renamed from: r, reason: collision with root package name */
    public long f149718r;

    /* renamed from: s, reason: collision with root package name */
    public long f149719s;

    /* renamed from: t, reason: collision with root package name */
    public long f149720t;

    /* renamed from: u, reason: collision with root package name */
    public long f149721u;

    /* renamed from: v, reason: collision with root package name */
    public long f149722v;

    /* renamed from: w, reason: collision with root package name */
    public long f149723w;

    /* renamed from: x, reason: collision with root package name */
    public long f149724x;

    /* renamed from: y, reason: collision with root package name */
    public long f149725y;

    /* renamed from: z, reason: collision with root package name */
    public long f149726z;

    public C10723x8ab106bc(android.os.Parcel parcel, jj0.c cVar) {
        this.f149707d = parcel.readString();
        this.f149708e = parcel.readString();
        this.f149709f = parcel.readInt();
        this.f149710g = parcel.readInt();
        this.f149711h = parcel.readInt();
        this.f149712i = parcel.readInt();
        this.f149713m = parcel.readInt();
        this.f149714n = parcel.readInt();
        this.f149715o = parcel.readInt();
        this.f149716p = parcel.readInt();
        this.f149717q = parcel.readString();
        this.f149718r = parcel.readLong();
        this.f149719s = parcel.readLong();
        this.f149720t = parcel.readLong();
        this.f149721u = parcel.readLong();
        this.f149722v = parcel.readLong();
        this.f149723w = parcel.readLong();
        this.f149724x = parcel.readLong();
        this.f149725y = parcel.readLong();
        this.f149726z = parcel.readLong();
        this.A = parcel.readLong();
        this.B = parcel.readLong();
        this.C = parcel.readLong();
        this.D = parcel.readLong();
        this.E = parcel.readLong();
        this.F = parcel.readLong();
        this.G = parcel.readLong();
        this.H = parcel.readLong();
        this.I = parcel.readLong();
        this.f149706J = parcel.readLong();
        this.K = parcel.readLong();
        this.L = parcel.readLong();
        this.M = parcel.readString();
        this.N = parcel.readString();
        this.P = parcel.readString();
    }

    public static synchronized com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc a(java.lang.String str) {
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc c10723x8ab106bc;
        synchronized (com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc.class) {
            java.util.Map map = Q;
            if (((java.util.HashMap) map).containsKey(str)) {
                ((java.util.HashMap) map).remove(str);
            }
            c10723x8ab106bc = new com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc();
            ((java.util.HashMap) map).put(str, c10723x8ab106bc);
        }
        return c10723x8ab106bc;
    }

    public static synchronized com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc b(java.lang.String str) {
        synchronized (com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc.class) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                return new com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc();
            }
            java.util.Map map = Q;
            if (((java.util.HashMap) map).containsKey(str)) {
                return (com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc) ((java.util.HashMap) map).get(str);
            }
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc c10723x8ab106bc = new com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc();
            ((java.util.HashMap) map).put(str, c10723x8ab106bc);
            return c10723x8ab106bc;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m45675x9616526c() {
        return java.lang.String.format("url: %s, isLuggage: %d, isWePkg: %d, isPreloadWebCore: %d, isFirstPage: %d, usedCacheUinKey: %d, jsapiCanUsed: %d, hasFloatLayer: %d, pkgId: %s,startTime: %d, gameCenterUICreate: %d, startWebUI: %d, preloadWePkgBgn: %d,preloadWePkgEnd: %d, preloadWebCoreBgn: %d, preloadWebCoreEnd: %d, webUICreate: %d, webUIOnShowBgn: %d, createViewBgn: %d,createViewEnd: %d, jsbridgeInject: %d, loadUrlBgn: %d, onPageStarted: %d,onPageFinished: %d, getA8keyBgn: %d, getA8keyEnd: %d, webUIInFront: %d, webUIDestroy: %d, commJsVersion: %s, pkgVersion: %s, jsBridgeErrMsg: %s", this.f149707d, java.lang.Integer.valueOf(this.f149709f), java.lang.Integer.valueOf(this.f149710g), java.lang.Integer.valueOf(this.f149711h), java.lang.Integer.valueOf(this.f149712i), java.lang.Integer.valueOf(this.f149713m), java.lang.Integer.valueOf(this.f149715o), java.lang.Integer.valueOf(this.f149716p), this.f149717q, java.lang.Long.valueOf(this.f149718r), java.lang.Long.valueOf(this.f149719s), java.lang.Long.valueOf(this.f149720t), java.lang.Long.valueOf(this.f149723w), java.lang.Long.valueOf(this.f149722v), java.lang.Long.valueOf(this.f149723w), java.lang.Long.valueOf(this.f149724x), java.lang.Long.valueOf(this.f149725y), java.lang.Long.valueOf(this.f149726z), java.lang.Long.valueOf(this.A), java.lang.Long.valueOf(this.B), java.lang.Long.valueOf(this.C), java.lang.Long.valueOf(this.D), java.lang.Long.valueOf(this.E), java.lang.Long.valueOf(this.F), java.lang.Long.valueOf(this.G), java.lang.Long.valueOf(this.H), java.lang.Long.valueOf(this.I), java.lang.Long.valueOf(this.f149706J), this.M, this.N, this.P);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f149707d);
        parcel.writeString(this.f149708e);
        parcel.writeInt(this.f149709f);
        parcel.writeInt(this.f149710g);
        parcel.writeInt(this.f149711h);
        parcel.writeInt(this.f149712i);
        parcel.writeInt(this.f149713m);
        parcel.writeInt(this.f149714n);
        parcel.writeInt(this.f149715o);
        parcel.writeInt(this.f149716p);
        parcel.writeString(this.f149717q);
        parcel.writeLong(this.f149718r);
        parcel.writeLong(this.f149719s);
        parcel.writeLong(this.f149720t);
        parcel.writeLong(this.f149721u);
        parcel.writeLong(this.f149722v);
        parcel.writeLong(this.f149723w);
        parcel.writeLong(this.f149724x);
        parcel.writeLong(this.f149725y);
        parcel.writeLong(this.f149726z);
        parcel.writeLong(this.A);
        parcel.writeLong(this.B);
        parcel.writeLong(this.C);
        parcel.writeLong(this.D);
        parcel.writeLong(this.E);
        parcel.writeLong(this.F);
        parcel.writeLong(this.G);
        parcel.writeLong(this.H);
        parcel.writeLong(this.I);
        parcel.writeLong(this.f149706J);
        parcel.writeLong(this.K);
        parcel.writeLong(this.L);
        parcel.writeString(this.M);
        parcel.writeString(this.N);
        parcel.writeString(this.P);
    }
}
