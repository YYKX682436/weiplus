package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzgg extends com.google.android.gms.internal.measurement.zzhh {
    private static final java.util.concurrent.atomic.AtomicLong zzalx = new java.util.concurrent.atomic.AtomicLong(Long.MIN_VALUE);
    private java.util.concurrent.ExecutorService zzaln;
    private com.google.android.gms.internal.measurement.zzgk zzalo;
    private com.google.android.gms.internal.measurement.zzgk zzalp;
    private final java.util.concurrent.PriorityBlockingQueue<com.google.android.gms.internal.measurement.zzgj<?>> zzalq;
    private final java.util.concurrent.BlockingQueue<com.google.android.gms.internal.measurement.zzgj<?>> zzalr;
    private final java.lang.Thread.UncaughtExceptionHandler zzals;
    private final java.lang.Thread.UncaughtExceptionHandler zzalt;
    private final java.lang.Object zzalu;
    private final java.util.concurrent.Semaphore zzalv;
    private volatile boolean zzalw;

    public zzgg(com.google.android.gms.internal.measurement.zzgl zzglVar) {
        super(zzglVar);
        this.zzalu = new java.lang.Object();
        this.zzalv = new java.util.concurrent.Semaphore(2);
        this.zzalq = new java.util.concurrent.PriorityBlockingQueue<>();
        this.zzalr = new java.util.concurrent.LinkedBlockingQueue();
        this.zzals = new com.google.android.gms.internal.measurement.zzgi(this, "Thread death: Uncaught exception on worker thread");
        this.zzalt = new com.google.android.gms.internal.measurement.zzgi(this, "Thread death: Uncaught exception on network thread");
    }

    public static boolean isMainThread() {
        return android.os.Looper.myLooper() == android.os.Looper.getMainLooper();
    }

    public static /* synthetic */ com.google.android.gms.internal.measurement.zzgk zza(com.google.android.gms.internal.measurement.zzgg zzggVar, com.google.android.gms.internal.measurement.zzgk zzgkVar) {
        zzggVar.zzalo = null;
        return null;
    }

    public static /* synthetic */ com.google.android.gms.internal.measurement.zzgk zzb(com.google.android.gms.internal.measurement.zzgg zzggVar, com.google.android.gms.internal.measurement.zzgk zzgkVar) {
        zzggVar.zzalp = null;
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, com.google.android.gms.internal.measurement.zzec
    public final /* bridge */ /* synthetic */ android.content.Context getContext() {
        return super.getContext();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final void zzab() {
        if (java.lang.Thread.currentThread() != this.zzalo) {
            throw new java.lang.IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, com.google.android.gms.internal.measurement.zzec
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.Clock zzbt() {
        return super.zzbt();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ void zzfr() {
        super.zzfr();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final void zzfs() {
        if (java.lang.Thread.currentThread() != this.zzalp) {
            throw new java.lang.IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzdu zzft() {
        return super.zzft();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzhk zzfu() {
        return super.zzfu();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzfb zzfv() {
        return super.zzfv();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzeo zzfw() {
        return super.zzfw();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzii zzfx() {
        return super.zzfx();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzif zzfy() {
        return super.zzfy();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzfc zzfz() {
        return super.zzfz();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzfe zzga() {
        return super.zzga();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzka zzgb() {
        return super.zzgb();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzjh zzgc() {
        return super.zzgc();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, com.google.android.gms.internal.measurement.zzec
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzgg zzgd() {
        return super.zzgd();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, com.google.android.gms.internal.measurement.zzec
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzfg zzge() {
        return super.zzge();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzfr zzgf() {
        return super.zzgf();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzef zzgg() {
        return super.zzgg();
    }

    @Override // com.google.android.gms.internal.measurement.zzhh
    public final boolean zzhf() {
        return false;
    }

    public final boolean zzjk() {
        return java.lang.Thread.currentThread() == this.zzalo;
    }

    public final java.util.concurrent.ExecutorService zzjl() {
        java.util.concurrent.ExecutorService executorService;
        synchronized (this.zzalu) {
            if (this.zzaln == null) {
                this.zzaln = new java.util.concurrent.ThreadPoolExecutor(0, 1, 30L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.ArrayBlockingQueue(100));
            }
            executorService = this.zzaln;
        }
        return executorService;
    }

    public final <T> T zza(java.util.concurrent.atomic.AtomicReference<T> atomicReference, long j17, java.lang.String str, java.lang.Runnable runnable) {
        synchronized (atomicReference) {
            zzgd().zzc(runnable);
            try {
                atomicReference.wait(15000L);
            } catch (java.lang.InterruptedException unused) {
                com.google.android.gms.internal.measurement.zzfi zzip = zzge().zzip();
                java.lang.String valueOf = java.lang.String.valueOf(str);
                zzip.log(valueOf.length() != 0 ? "Interrupted waiting for ".concat(valueOf) : new java.lang.String("Interrupted waiting for "));
                return null;
            }
        }
        T t17 = atomicReference.get();
        if (t17 == null) {
            com.google.android.gms.internal.measurement.zzfi zzip2 = zzge().zzip();
            java.lang.String valueOf2 = java.lang.String.valueOf(str);
            zzip2.log(valueOf2.length() != 0 ? "Timed out waiting for ".concat(valueOf2) : new java.lang.String("Timed out waiting for "));
        }
        return t17;
    }

    public final <V> java.util.concurrent.Future<V> zzb(java.util.concurrent.Callable<V> callable) {
        zzch();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(callable);
        com.google.android.gms.internal.measurement.zzgj<?> zzgjVar = new com.google.android.gms.internal.measurement.zzgj<>(this, (java.util.concurrent.Callable<?>) callable, false, "Task exception on worker thread");
        if (java.lang.Thread.currentThread() == this.zzalo) {
            if (!this.zzalq.isEmpty()) {
                zzge().zzip().log("Callable skipped the worker queue.");
            }
            zzgjVar.run();
        } else {
            zza(zzgjVar);
        }
        return zzgjVar;
    }

    public final <V> java.util.concurrent.Future<V> zzc(java.util.concurrent.Callable<V> callable) {
        zzch();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(callable);
        com.google.android.gms.internal.measurement.zzgj<?> zzgjVar = new com.google.android.gms.internal.measurement.zzgj<>(this, (java.util.concurrent.Callable<?>) callable, true, "Task exception on worker thread");
        if (java.lang.Thread.currentThread() == this.zzalo) {
            zzgjVar.run();
        } else {
            zza(zzgjVar);
        }
        return zzgjVar;
    }

    public final void zzd(java.lang.Runnable runnable) {
        zzch();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(runnable);
        com.google.android.gms.internal.measurement.zzgj<?> zzgjVar = new com.google.android.gms.internal.measurement.zzgj<>(this, runnable, false, "Task exception on network thread");
        synchronized (this.zzalu) {
            this.zzalr.add(zzgjVar);
            com.google.android.gms.internal.measurement.zzgk zzgkVar = this.zzalp;
            if (zzgkVar == null) {
                com.google.android.gms.internal.measurement.zzgk zzgkVar2 = new com.google.android.gms.internal.measurement.zzgk(this, "Measurement Network", this.zzalr);
                this.zzalp = zzgkVar2;
                zzgkVar2.setUncaughtExceptionHandler(this.zzalt);
                this.zzalp.start();
            } else {
                zzgkVar.zzjn();
            }
        }
    }

    public final void zzc(java.lang.Runnable runnable) {
        zzch();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(runnable);
        zza(new com.google.android.gms.internal.measurement.zzgj<>(this, runnable, false, "Task exception on worker thread"));
    }

    private final void zza(com.google.android.gms.internal.measurement.zzgj<?> zzgjVar) {
        synchronized (this.zzalu) {
            this.zzalq.add(zzgjVar);
            com.google.android.gms.internal.measurement.zzgk zzgkVar = this.zzalo;
            if (zzgkVar == null) {
                com.google.android.gms.internal.measurement.zzgk zzgkVar2 = new com.google.android.gms.internal.measurement.zzgk(this, "Measurement Worker", this.zzalq);
                this.zzalo = zzgkVar2;
                zzgkVar2.setUncaughtExceptionHandler(this.zzals);
                this.zzalo.start();
            } else {
                zzgkVar.zzjn();
            }
        }
    }
}
