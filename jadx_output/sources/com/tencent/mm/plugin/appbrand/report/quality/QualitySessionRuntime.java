package com.tencent.mm.plugin.appbrand.report.quality;

/* loaded from: classes7.dex */
public class QualitySessionRuntime extends com.tencent.mm.plugin.appbrand.report.quality.QualitySession {
    public boolean A;
    public final java.util.concurrent.atomic.AtomicInteger B;
    public final com.tencent.mm.plugin.appbrand.report.quality.q1 C;
    public com.tencent.mm.plugin.appbrand.report.quality.o0 D;
    public com.tencent.mm.plugin.appbrand.report.quality.o0 E;
    public volatile int F;
    public long G;
    public long H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public volatile com.tencent.mm.autogen.mmdata.rpt.WeAppQualityCloseBeforeReadyStruct f88143J;
    public volatile boolean K;
    public volatile boolean L;
    public volatile boolean M;
    public volatile boolean N;
    public java.lang.Boolean P;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.o6 f88144p;

    /* renamed from: q, reason: collision with root package name */
    public long f88145q;

    /* renamed from: r, reason: collision with root package name */
    public long f88146r;

    /* renamed from: s, reason: collision with root package name */
    public long f88147s;

    /* renamed from: t, reason: collision with root package name */
    public long f88148t;

    /* renamed from: u, reason: collision with root package name */
    public long f88149u;

    /* renamed from: v, reason: collision with root package name */
    public long f88150v;

    /* renamed from: w, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle f88151w;

    /* renamed from: x, reason: collision with root package name */
    public int f88152x;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.report.quality.h f88153y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.report.quality.t f88154z;

    public QualitySessionRuntime(android.os.Parcel parcel) {
        super(parcel);
        this.f88153y = new com.tencent.mm.plugin.appbrand.report.quality.h();
        this.f88154z = new com.tencent.mm.plugin.appbrand.report.quality.t();
        this.B = new java.util.concurrent.atomic.AtomicInteger(0);
        this.C = new com.tencent.mm.plugin.appbrand.report.quality.q1();
        com.tencent.mm.plugin.appbrand.report.quality.o0 o0Var = com.tencent.mm.plugin.appbrand.report.quality.o0.CreateOnRuntimeInit;
        this.D = o0Var;
        this.E = o0Var;
        this.F = 4;
        this.G = 0L;
        this.K = false;
        this.L = false;
        this.M = false;
        this.N = false;
        this.f88143J = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualityCloseBeforeReadyStruct();
        this.f88143J.f62456q = 2L;
        this.f88143J.f62453n = 2L;
        this.f88143J.f62457r = 2L;
    }

    public final long a() {
        int i17;
        int i18 = 2;
        int i19 = this.f88144p.a2() ? 2 : 1;
        com.tencent.mm.plugin.appbrand.report.quality.o0 o0Var = this.D;
        com.tencent.mm.plugin.appbrand.report.quality.o0 o0Var2 = com.tencent.mm.plugin.appbrand.report.quality.o0.PreloadOnProcessCreated;
        com.tencent.mm.plugin.appbrand.report.quality.o0 o0Var3 = com.tencent.mm.plugin.appbrand.report.quality.o0.PreloadBeforeRuntimeInit;
        int i27 = o0Var == o0Var2 ? 1 : o0Var == o0Var3 ? 2 : 0;
        if (this.A) {
            i17 = (i19 * 100) + (i27 * 10) + 0;
        } else {
            com.tencent.mm.plugin.appbrand.report.quality.o0 o0Var4 = this.E;
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
        int ordinal = this.f88144p.N.b().ordinal();
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
