package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff;

/* renamed from: com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime */
/* loaded from: classes7.dex */
public class C12567x34ba321 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7 {
    public boolean A;
    public final java.util.concurrent.atomic.AtomicInteger B;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.q1 C;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o0 D;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o0 E;
    public volatile int F;
    public long G;
    public long H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7089xa20baf8d f169676J;
    public volatile boolean K;
    public volatile boolean L;
    public volatile boolean M;
    public volatile boolean N;
    public java.lang.Boolean P;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f169677p;

    /* renamed from: q, reason: collision with root package name */
    public long f169678q;

    /* renamed from: r, reason: collision with root package name */
    public long f169679r;

    /* renamed from: s, reason: collision with root package name */
    public long f169680s;

    /* renamed from: t, reason: collision with root package name */
    public long f169681t;

    /* renamed from: u, reason: collision with root package name */
    public long f169682u;

    /* renamed from: v, reason: collision with root package name */
    public long f169683v;

    /* renamed from: w, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12340xb447464a f169684w;

    /* renamed from: x, reason: collision with root package name */
    public int f169685x;

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.h f169686y;

    /* renamed from: z, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t f169687z;

    public C12567x34ba321(android.os.Parcel parcel) {
        super(parcel);
        this.f169686y = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.h();
        this.f169687z = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t();
        this.B = new java.util.concurrent.atomic.AtomicInteger(0);
        this.C = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.q1();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o0 o0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o0.CreateOnRuntimeInit;
        this.D = o0Var;
        this.E = o0Var;
        this.F = 4;
        this.G = 0L;
        this.K = false;
        this.L = false;
        this.M = false;
        this.N = false;
        this.f169676J = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7089xa20baf8d();
        this.f169676J.f143989q = 2L;
        this.f169676J.f143986n = 2L;
        this.f169676J.f143990r = 2L;
    }

    public final long a() {
        int i17;
        int i18 = 2;
        int i19 = this.f169677p.a2() ? 2 : 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o0 o0Var = this.D;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o0 o0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o0.PreloadOnProcessCreated;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o0 o0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o0.PreloadBeforeRuntimeInit;
        int i27 = o0Var == o0Var2 ? 1 : o0Var == o0Var3 ? 2 : 0;
        if (this.A) {
            i17 = (i19 * 100) + (i27 * 10) + 0;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o0 o0Var4 = this.E;
            if (o0Var4 == o0Var2) {
                i18 = 1;
            } else if (o0Var4 != o0Var3) {
                i18 = 0;
            }
            i17 = (i19 * 100) + (i27 * 10) + i18;
        }
        return i17;
    }

    public long b() {
        int ordinal = this.f169677p.N.b().ordinal();
        if (ordinal != 1) {
            return (ordinal == 2 || ordinal == 3) ? 2L : 0L;
        }
        return 1L;
    }

    public synchronized boolean c() {
        java.lang.Boolean bool = this.P;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
