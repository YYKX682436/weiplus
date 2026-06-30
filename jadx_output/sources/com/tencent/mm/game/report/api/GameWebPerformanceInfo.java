package com.tencent.mm.game.report.api;

/* loaded from: classes8.dex */
public class GameWebPerformanceInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.game.report.api.GameWebPerformanceInfo> CREATOR = new jj0.c();
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
    public long f68173J;
    public final long K;
    public final long L;
    public java.lang.String M;
    public java.lang.String N;
    public java.lang.String P;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f68174d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f68175e;

    /* renamed from: f, reason: collision with root package name */
    public int f68176f;

    /* renamed from: g, reason: collision with root package name */
    public int f68177g;

    /* renamed from: h, reason: collision with root package name */
    public int f68178h;

    /* renamed from: i, reason: collision with root package name */
    public int f68179i;

    /* renamed from: m, reason: collision with root package name */
    public final int f68180m;

    /* renamed from: n, reason: collision with root package name */
    public final int f68181n;

    /* renamed from: o, reason: collision with root package name */
    public int f68182o;

    /* renamed from: p, reason: collision with root package name */
    public int f68183p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f68184q;

    /* renamed from: r, reason: collision with root package name */
    public long f68185r;

    /* renamed from: s, reason: collision with root package name */
    public long f68186s;

    /* renamed from: t, reason: collision with root package name */
    public long f68187t;

    /* renamed from: u, reason: collision with root package name */
    public long f68188u;

    /* renamed from: v, reason: collision with root package name */
    public long f68189v;

    /* renamed from: w, reason: collision with root package name */
    public long f68190w;

    /* renamed from: x, reason: collision with root package name */
    public long f68191x;

    /* renamed from: y, reason: collision with root package name */
    public long f68192y;

    /* renamed from: z, reason: collision with root package name */
    public long f68193z;

    public GameWebPerformanceInfo(android.os.Parcel parcel, jj0.c cVar) {
        this.f68174d = parcel.readString();
        this.f68175e = parcel.readString();
        this.f68176f = parcel.readInt();
        this.f68177g = parcel.readInt();
        this.f68178h = parcel.readInt();
        this.f68179i = parcel.readInt();
        this.f68180m = parcel.readInt();
        this.f68181n = parcel.readInt();
        this.f68182o = parcel.readInt();
        this.f68183p = parcel.readInt();
        this.f68184q = parcel.readString();
        this.f68185r = parcel.readLong();
        this.f68186s = parcel.readLong();
        this.f68187t = parcel.readLong();
        this.f68188u = parcel.readLong();
        this.f68189v = parcel.readLong();
        this.f68190w = parcel.readLong();
        this.f68191x = parcel.readLong();
        this.f68192y = parcel.readLong();
        this.f68193z = parcel.readLong();
        this.A = parcel.readLong();
        this.B = parcel.readLong();
        this.C = parcel.readLong();
        this.D = parcel.readLong();
        this.E = parcel.readLong();
        this.F = parcel.readLong();
        this.G = parcel.readLong();
        this.H = parcel.readLong();
        this.I = parcel.readLong();
        this.f68173J = parcel.readLong();
        this.K = parcel.readLong();
        this.L = parcel.readLong();
        this.M = parcel.readString();
        this.N = parcel.readString();
        this.P = parcel.readString();
    }

    public static synchronized com.tencent.mm.game.report.api.GameWebPerformanceInfo a(java.lang.String str) {
        com.tencent.mm.game.report.api.GameWebPerformanceInfo gameWebPerformanceInfo;
        synchronized (com.tencent.mm.game.report.api.GameWebPerformanceInfo.class) {
            java.util.Map map = Q;
            if (((java.util.HashMap) map).containsKey(str)) {
                ((java.util.HashMap) map).remove(str);
            }
            gameWebPerformanceInfo = new com.tencent.mm.game.report.api.GameWebPerformanceInfo();
            ((java.util.HashMap) map).put(str, gameWebPerformanceInfo);
        }
        return gameWebPerformanceInfo;
    }

    public static synchronized com.tencent.mm.game.report.api.GameWebPerformanceInfo b(java.lang.String str) {
        synchronized (com.tencent.mm.game.report.api.GameWebPerformanceInfo.class) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                return new com.tencent.mm.game.report.api.GameWebPerformanceInfo();
            }
            java.util.Map map = Q;
            if (((java.util.HashMap) map).containsKey(str)) {
                return (com.tencent.mm.game.report.api.GameWebPerformanceInfo) ((java.util.HashMap) map).get(str);
            }
            com.tencent.mm.game.report.api.GameWebPerformanceInfo gameWebPerformanceInfo = new com.tencent.mm.game.report.api.GameWebPerformanceInfo();
            ((java.util.HashMap) map).put(str, gameWebPerformanceInfo);
            return gameWebPerformanceInfo;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return java.lang.String.format("url: %s, isLuggage: %d, isWePkg: %d, isPreloadWebCore: %d, isFirstPage: %d, usedCacheUinKey: %d, jsapiCanUsed: %d, hasFloatLayer: %d, pkgId: %s,startTime: %d, gameCenterUICreate: %d, startWebUI: %d, preloadWePkgBgn: %d,preloadWePkgEnd: %d, preloadWebCoreBgn: %d, preloadWebCoreEnd: %d, webUICreate: %d, webUIOnShowBgn: %d, createViewBgn: %d,createViewEnd: %d, jsbridgeInject: %d, loadUrlBgn: %d, onPageStarted: %d,onPageFinished: %d, getA8keyBgn: %d, getA8keyEnd: %d, webUIInFront: %d, webUIDestroy: %d, commJsVersion: %s, pkgVersion: %s, jsBridgeErrMsg: %s", this.f68174d, java.lang.Integer.valueOf(this.f68176f), java.lang.Integer.valueOf(this.f68177g), java.lang.Integer.valueOf(this.f68178h), java.lang.Integer.valueOf(this.f68179i), java.lang.Integer.valueOf(this.f68180m), java.lang.Integer.valueOf(this.f68182o), java.lang.Integer.valueOf(this.f68183p), this.f68184q, java.lang.Long.valueOf(this.f68185r), java.lang.Long.valueOf(this.f68186s), java.lang.Long.valueOf(this.f68187t), java.lang.Long.valueOf(this.f68190w), java.lang.Long.valueOf(this.f68189v), java.lang.Long.valueOf(this.f68190w), java.lang.Long.valueOf(this.f68191x), java.lang.Long.valueOf(this.f68192y), java.lang.Long.valueOf(this.f68193z), java.lang.Long.valueOf(this.A), java.lang.Long.valueOf(this.B), java.lang.Long.valueOf(this.C), java.lang.Long.valueOf(this.D), java.lang.Long.valueOf(this.E), java.lang.Long.valueOf(this.F), java.lang.Long.valueOf(this.G), java.lang.Long.valueOf(this.H), java.lang.Long.valueOf(this.I), java.lang.Long.valueOf(this.f68173J), this.M, this.N, this.P);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f68174d);
        parcel.writeString(this.f68175e);
        parcel.writeInt(this.f68176f);
        parcel.writeInt(this.f68177g);
        parcel.writeInt(this.f68178h);
        parcel.writeInt(this.f68179i);
        parcel.writeInt(this.f68180m);
        parcel.writeInt(this.f68181n);
        parcel.writeInt(this.f68182o);
        parcel.writeInt(this.f68183p);
        parcel.writeString(this.f68184q);
        parcel.writeLong(this.f68185r);
        parcel.writeLong(this.f68186s);
        parcel.writeLong(this.f68187t);
        parcel.writeLong(this.f68188u);
        parcel.writeLong(this.f68189v);
        parcel.writeLong(this.f68190w);
        parcel.writeLong(this.f68191x);
        parcel.writeLong(this.f68192y);
        parcel.writeLong(this.f68193z);
        parcel.writeLong(this.A);
        parcel.writeLong(this.B);
        parcel.writeLong(this.C);
        parcel.writeLong(this.D);
        parcel.writeLong(this.E);
        parcel.writeLong(this.F);
        parcel.writeLong(this.G);
        parcel.writeLong(this.H);
        parcel.writeLong(this.I);
        parcel.writeLong(this.f68173J);
        parcel.writeLong(this.K);
        parcel.writeLong(this.L);
        parcel.writeString(this.M);
        parcel.writeString(this.N);
        parcel.writeString(this.P);
    }
}
