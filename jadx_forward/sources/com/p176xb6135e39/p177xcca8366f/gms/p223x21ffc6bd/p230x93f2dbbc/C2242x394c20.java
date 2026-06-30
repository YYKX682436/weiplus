package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzgg */
/* loaded from: classes16.dex */
public final class C2242x394c20 extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2269x394c40 {

    /* renamed from: zzalx */
    private static final java.util.concurrent.atomic.AtomicLong f6710x6f0226d = new java.util.concurrent.atomic.AtomicLong(Long.MIN_VALUE);

    /* renamed from: zzaln */
    private java.util.concurrent.ExecutorService f6711x6f02263;

    /* renamed from: zzalo */
    private com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2246x394c24 f6712x6f02264;

    /* renamed from: zzalp */
    private com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2246x394c24 f6713x6f02265;

    /* renamed from: zzalq */
    private final java.util.concurrent.PriorityBlockingQueue<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2245x394c23<?>> f6714x6f02266;

    /* renamed from: zzalr */
    private final java.util.concurrent.BlockingQueue<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2245x394c23<?>> f6715x6f02267;

    /* renamed from: zzals */
    private final java.lang.Thread.UncaughtExceptionHandler f6716x6f02268;

    /* renamed from: zzalt */
    private final java.lang.Thread.UncaughtExceptionHandler f6717x6f02269;

    /* renamed from: zzalu */
    private final java.lang.Object f6718x6f0226a;

    /* renamed from: zzalv */
    private final java.util.concurrent.Semaphore f6719x6f0226b;

    /* renamed from: zzalw */
    private volatile boolean f6720x6f0226c;

    public C2242x394c20(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2247x394c25 c2247x394c25) {
        super(c2247x394c25);
        this.f6718x6f0226a = new java.lang.Object();
        this.f6719x6f0226b = new java.util.concurrent.Semaphore(2);
        this.f6714x6f02266 = new java.util.concurrent.PriorityBlockingQueue<>();
        this.f6715x6f02267 = new java.util.concurrent.LinkedBlockingQueue();
        this.f6716x6f02268 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2244x394c22(this, "Thread death: Uncaught exception on worker thread");
        this.f6717x6f02269 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2244x394c22(this, "Thread death: Uncaught exception on network thread");
    }

    /* renamed from: isMainThread */
    public static boolean m19155x9e2d0ded() {
        return android.os.Looper.myLooper() == android.os.Looper.getMainLooper();
    }

    public static /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2246x394c24 zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2242x394c20 c2242x394c20, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2246x394c24 c2246x394c24) {
        c2242x394c20.f6712x6f02264 = null;
        return null;
    }

    public static /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2246x394c24 zzb(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2242x394c20 c2242x394c20, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2246x394c24 c2246x394c24) {
        c2242x394c20.f6713x6f02265 = null;
        return null;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2186x394bde
    /* renamed from: getContext */
    public final /* bridge */ /* synthetic */ android.content.Context mo18960x76847179() {
        return super.mo18960x76847179();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzab */
    public final void mo18961x394b61() {
        if (java.lang.Thread.currentThread() != this.f6712x6f02264) {
            throw new java.lang.IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2186x394bde
    /* renamed from: zzbt */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.InterfaceC1991x3e2ebee mo18962x394b92() {
        return super.mo18962x394b92();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfr */
    public final /* bridge */ /* synthetic */ void mo18963x394c0c() {
        super.mo18963x394c0c();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfs */
    public final void mo18964x394c0d() {
        if (java.lang.Thread.currentThread() != this.f6713x6f02265) {
            throw new java.lang.IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzft */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2178x394bd1 mo18965x394c0e() {
        return super.mo18965x394c0e();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfu */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2272x394c43 mo18966x394c0f() {
        return super.mo18966x394c0f();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfv */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2211x394bfc mo18967x394c10() {
        return super.mo18967x394c10();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfw */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2198x394bea mo18968x394c11() {
        return super.mo18968x394c11();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfx */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2296x394c60 mo18969x394c12() {
        return super.mo18969x394c12();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfy */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2293x394c5d mo18970x394c13() {
        return super.mo18970x394c13();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfz */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2212x394bfd mo18971x394c14() {
        return super.mo18971x394c14();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzga */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2214x394bff mo18972x394c1a() {
        return super.mo18972x394c1a();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzgb */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96 mo18973x394c1b() {
        return super.mo18973x394c1b();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzgc */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2321x394c7e mo18974x394c1c() {
        return super.mo18974x394c1c();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2186x394bde
    /* renamed from: zzgd */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2242x394c20 mo18975x394c1d() {
        return super.mo18975x394c1d();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2186x394bde
    /* renamed from: zzge */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01 mo18976x394c1e() {
        return super.mo18976x394c1e();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzgf */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2227x394c0c mo18977x394c1f() {
        return super.mo18977x394c1f();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzgg */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2189x394be1 mo18978x394c20() {
        return super.mo18978x394c20();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2269x394c40
    /* renamed from: zzhf */
    public final boolean mo19069x394c3e() {
        return false;
    }

    /* renamed from: zzjk */
    public final boolean m19157x394c81() {
        return java.lang.Thread.currentThread() == this.f6712x6f02264;
    }

    /* renamed from: zzjl */
    public final java.util.concurrent.ExecutorService m19158x394c82() {
        java.util.concurrent.ExecutorService executorService;
        synchronized (this.f6718x6f0226a) {
            if (this.f6711x6f02263 == null) {
                this.f6711x6f02263 = new java.util.concurrent.ThreadPoolExecutor(0, 1, 30L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.ArrayBlockingQueue(100));
            }
            executorService = this.f6711x6f02263;
        }
        return executorService;
    }

    public final <T> T zza(java.util.concurrent.atomic.AtomicReference<T> atomicReference, long j17, java.lang.String str, java.lang.Runnable runnable) {
        synchronized (atomicReference) {
            mo18975x394c1d().zzc(runnable);
            try {
                atomicReference.wait(15000L);
            } catch (java.lang.InterruptedException unused) {
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03 m19111x394c67 = mo18976x394c1e().m19111x394c67();
                java.lang.String valueOf = java.lang.String.valueOf(str);
                m19111x394c67.log(valueOf.length() != 0 ? "Interrupted waiting for ".concat(valueOf) : new java.lang.String("Interrupted waiting for "));
                return null;
            }
        }
        T t17 = atomicReference.get();
        if (t17 == null) {
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03 m19111x394c672 = mo18976x394c1e().m19111x394c67();
            java.lang.String valueOf2 = java.lang.String.valueOf(str);
            m19111x394c672.log(valueOf2.length() != 0 ? "Timed out waiting for ".concat(valueOf2) : new java.lang.String("Timed out waiting for "));
        }
        return t17;
    }

    public final <V> java.util.concurrent.Future<V> zzb(java.util.concurrent.Callable<V> callable) {
        m19186x394ba5();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(callable);
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2245x394c23<?> c2245x394c23 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2245x394c23<>(this, (java.util.concurrent.Callable<?>) callable, false, "Task exception on worker thread");
        if (java.lang.Thread.currentThread() == this.f6712x6f02264) {
            if (!this.f6714x6f02266.isEmpty()) {
                mo18976x394c1e().m19111x394c67().log("Callable skipped the worker queue.");
            }
            c2245x394c23.run();
        } else {
            zza(c2245x394c23);
        }
        return c2245x394c23;
    }

    public final <V> java.util.concurrent.Future<V> zzc(java.util.concurrent.Callable<V> callable) {
        m19186x394ba5();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(callable);
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2245x394c23<?> c2245x394c23 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2245x394c23<>(this, (java.util.concurrent.Callable<?>) callable, true, "Task exception on worker thread");
        if (java.lang.Thread.currentThread() == this.f6712x6f02264) {
            c2245x394c23.run();
        } else {
            zza(c2245x394c23);
        }
        return c2245x394c23;
    }

    public final void zzd(java.lang.Runnable runnable) {
        m19186x394ba5();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(runnable);
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2245x394c23<?> c2245x394c23 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2245x394c23<>(this, runnable, false, "Task exception on network thread");
        synchronized (this.f6718x6f0226a) {
            this.f6715x6f02267.add(c2245x394c23);
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2246x394c24 c2246x394c24 = this.f6713x6f02265;
            if (c2246x394c24 == null) {
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2246x394c24 c2246x394c242 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2246x394c24(this, "Measurement Network", this.f6715x6f02267);
                this.f6713x6f02265 = c2246x394c242;
                c2246x394c242.setUncaughtExceptionHandler(this.f6717x6f02269);
                this.f6713x6f02265.start();
            } else {
                c2246x394c24.m19159x394c84();
            }
        }
    }

    public final void zzc(java.lang.Runnable runnable) {
        m19186x394ba5();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(runnable);
        zza(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2245x394c23<>(this, runnable, false, "Task exception on worker thread"));
    }

    private final void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2245x394c23<?> c2245x394c23) {
        synchronized (this.f6718x6f0226a) {
            this.f6714x6f02266.add(c2245x394c23);
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2246x394c24 c2246x394c24 = this.f6712x6f02264;
            if (c2246x394c24 == null) {
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2246x394c24 c2246x394c242 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2246x394c24(this, "Measurement Worker", this.f6714x6f02266);
                this.f6712x6f02264 = c2246x394c242;
                c2246x394c242.setUncaughtExceptionHandler(this.f6716x6f02268);
                this.f6712x6f02264.start();
            } else {
                c2246x394c24.m19159x394c84();
            }
        }
    }
}
