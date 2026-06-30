package com.google.android.gms.iid;

/* loaded from: classes13.dex */
public final class zzr {
    private final java.util.concurrent.ScheduledExecutorService zzbz;
    private com.google.android.gms.iid.zzt zzca;
    private int zzcb;
    private final android.content.Context zzk;

    public zzr(android.content.Context context) {
        this(context, java.util.concurrent.Executors.newSingleThreadScheduledExecutor());
    }

    private final synchronized int zzq() {
        int i17;
        i17 = this.zzcb;
        this.zzcb = i17 + 1;
        return i17;
    }

    private zzr(android.content.Context context, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.zzca = new com.google.android.gms.iid.zzt(this);
        this.zzcb = 1;
        this.zzk = context.getApplicationContext();
        this.zzbz = scheduledExecutorService;
    }

    public final com.google.android.gms.tasks.Task<android.os.Bundle> zzd(int i17, android.os.Bundle bundle) {
        return zzd(new com.google.android.gms.iid.zzab(zzq(), 1, bundle));
    }

    private final synchronized <T> com.google.android.gms.tasks.Task<T> zzd(com.google.android.gms.iid.zzz<T> zzzVar) {
        if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
            new java.lang.StringBuilder(java.lang.String.valueOf(zzzVar).length() + 9);
        }
        if (!this.zzca.zze(zzzVar)) {
            com.google.android.gms.iid.zzt zztVar = new com.google.android.gms.iid.zzt(this);
            this.zzca = zztVar;
            zztVar.zze(zzzVar);
        }
        return zzzVar.zzcl.getTask();
    }
}
