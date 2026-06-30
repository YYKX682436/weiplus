package com.google.android.gms.tasks;

/* loaded from: classes13.dex */
final class zzc implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.tasks.Task zza;
    final /* synthetic */ com.google.android.gms.tasks.zzd zzb;

    public zzc(com.google.android.gms.tasks.zzd zzdVar, com.google.android.gms.tasks.Task task) {
        this.zzb = zzdVar;
        this.zza = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.tasks.zzw zzwVar;
        com.google.android.gms.tasks.zzw zzwVar2;
        com.google.android.gms.tasks.zzw zzwVar3;
        com.google.android.gms.tasks.Continuation continuation;
        com.google.android.gms.tasks.zzw zzwVar4;
        com.google.android.gms.tasks.zzw zzwVar5;
        if (this.zza.isCanceled()) {
            zzwVar5 = this.zzb.zzc;
            zzwVar5.zzc();
            return;
        }
        try {
            continuation = this.zzb.zzb;
            java.lang.Object then = continuation.then(this.zza);
            zzwVar4 = this.zzb.zzc;
            zzwVar4.zzb(then);
        } catch (com.google.android.gms.tasks.RuntimeExecutionException e17) {
            if (e17.getCause() instanceof java.lang.Exception) {
                zzwVar3 = this.zzb.zzc;
                zzwVar3.zza((java.lang.Exception) e17.getCause());
            } else {
                zzwVar2 = this.zzb.zzc;
                zzwVar2.zza(e17);
            }
        } catch (java.lang.Exception e18) {
            zzwVar = this.zzb.zzc;
            zzwVar.zza(e18);
        }
    }
}
