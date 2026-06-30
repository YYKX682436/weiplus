package com.google.android.gms.tasks;

/* loaded from: classes13.dex */
final class zze implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.tasks.Task zza;
    final /* synthetic */ com.google.android.gms.tasks.zzf zzb;

    public zze(com.google.android.gms.tasks.zzf zzfVar, com.google.android.gms.tasks.Task task) {
        this.zzb = zzfVar;
        this.zza = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.tasks.zzw zzwVar;
        com.google.android.gms.tasks.zzw zzwVar2;
        com.google.android.gms.tasks.zzw zzwVar3;
        com.google.android.gms.tasks.Continuation continuation;
        try {
            continuation = this.zzb.zzb;
            com.google.android.gms.tasks.Task task = (com.google.android.gms.tasks.Task) continuation.then(this.zza);
            if (task == null) {
                this.zzb.onFailure(new java.lang.NullPointerException("Continuation returned null"));
                return;
            }
            com.google.android.gms.tasks.zzf zzfVar = this.zzb;
            java.util.concurrent.Executor executor = com.google.android.gms.tasks.TaskExecutors.zza;
            task.addOnSuccessListener(executor, zzfVar);
            task.addOnFailureListener(executor, this.zzb);
            task.addOnCanceledListener(executor, this.zzb);
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
