package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public abstract class zzem {
    private static volatile android.os.Handler handler;
    private final com.google.android.gms.internal.measurement.zzhi zzafj;
    private final java.lang.Runnable zzyd;
    private volatile long zzye;

    public zzem(com.google.android.gms.internal.measurement.zzhi zzhiVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzhiVar);
        this.zzafj = zzhiVar;
        this.zzyd = new com.google.android.gms.internal.measurement.zzen(this, zzhiVar);
    }

    private final android.os.Handler getHandler() {
        android.os.Handler handler2;
        if (handler != null) {
            return handler;
        }
        synchronized (com.google.android.gms.internal.measurement.zzem.class) {
            if (handler == null) {
                handler = new android.os.Handler(this.zzafj.getContext().getMainLooper());
            }
            handler2 = handler;
        }
        return handler2;
    }

    public static /* synthetic */ long zza(com.google.android.gms.internal.measurement.zzem zzemVar, long j17) {
        zzemVar.zzye = 0L;
        return 0L;
    }

    public final void cancel() {
        this.zzye = 0L;
        getHandler().removeCallbacks(this.zzyd);
    }

    public abstract void run();

    public final boolean zzef() {
        return this.zzye != 0;
    }

    public final void zzh(long j17) {
        cancel();
        if (j17 >= 0) {
            this.zzye = this.zzafj.zzbt().currentTimeMillis();
            if (getHandler().postDelayed(this.zzyd, j17)) {
                return;
            }
            this.zzafj.zzge().zzim().zzg("Failed to schedule delayed post. time", java.lang.Long.valueOf(j17));
        }
    }
}
