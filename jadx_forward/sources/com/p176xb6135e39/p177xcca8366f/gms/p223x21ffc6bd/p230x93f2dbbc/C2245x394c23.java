package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zzgj */
/* loaded from: classes16.dex */
public final class C2245x394c23<V> extends java.util.concurrent.FutureTask<V> implements java.lang.Comparable<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2245x394c23> {

    /* renamed from: zzaly */
    private final java.lang.String f6723x6f0226e;

    /* renamed from: zzalz */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2242x394c20 f6724x6f0226f;

    /* renamed from: zzama */
    private final long f6725x6f02275;

    /* renamed from: zzamb */
    final boolean f6726x6f02276;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2245x394c23(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2242x394c20 c2242x394c20, java.lang.Runnable runnable, boolean z17, java.lang.String str) {
        super(runnable, null);
        java.util.concurrent.atomic.AtomicLong atomicLong;
        this.f6724x6f0226f = c2242x394c20;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(str);
        atomicLong = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2242x394c20.f6710x6f0226d;
        long andIncrement = atomicLong.getAndIncrement();
        this.f6725x6f02275 = andIncrement;
        this.f6723x6f0226e = str;
        this.f6726x6f02276 = false;
        if (andIncrement == com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) {
            c2242x394c20.mo18976x394c1e().m19108x394c64().log("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2245x394c23 c2245x394c23) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2245x394c23 c2245x394c232 = c2245x394c23;
        boolean z17 = this.f6726x6f02276;
        if (z17 != c2245x394c232.f6726x6f02276) {
            return z17 ? -1 : 1;
        }
        long j17 = this.f6725x6f02275;
        long j18 = c2245x394c232.f6725x6f02275;
        if (j17 < j18) {
            return -1;
        }
        if (j17 > j18) {
            return 1;
        }
        this.f6724x6f0226f.mo18976x394c1e().m19109x394c65().zzg("Two tasks share the same index. index", java.lang.Long.valueOf(this.f6725x6f02275));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(java.lang.Throwable th6) {
        this.f6724x6f0226f.mo18976x394c1e().m19108x394c64().zzg(this.f6723x6f0226e, th6);
        if (th6 instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2243x394c21) {
            java.lang.Thread.getDefaultUncaughtExceptionHandler().uncaughtException(java.lang.Thread.currentThread(), th6);
        }
        super.setException(th6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2245x394c23(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2242x394c20 c2242x394c20, java.util.concurrent.Callable<V> callable, boolean z17, java.lang.String str) {
        super(callable);
        java.util.concurrent.atomic.AtomicLong atomicLong;
        this.f6724x6f0226f = c2242x394c20;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(str);
        atomicLong = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2242x394c20.f6710x6f0226d;
        long andIncrement = atomicLong.getAndIncrement();
        this.f6725x6f02275 = andIncrement;
        this.f6723x6f0226e = str;
        this.f6726x6f02276 = z17;
        if (andIncrement == com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) {
            c2242x394c20.mo18976x394c1e().m19108x394c64().log("Tasks index overflow");
        }
    }
}
