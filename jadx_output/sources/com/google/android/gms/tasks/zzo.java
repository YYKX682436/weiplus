package com.google.android.gms.tasks;

/* loaded from: classes13.dex */
final class zzo implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.tasks.Task zza;
    final /* synthetic */ com.google.android.gms.tasks.zzp zzb;

    public zzo(com.google.android.gms.tasks.zzp zzpVar, com.google.android.gms.tasks.Task task) {
        this.zzb = zzpVar;
        this.zza = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.tasks.SuccessContinuation successContinuation;
        try {
            successContinuation = this.zzb.zzb;
            com.google.android.gms.tasks.Task then = successContinuation.then(this.zza.getResult());
            if (then == null) {
                this.zzb.onFailure(new java.lang.NullPointerException("Continuation returned null"));
                return;
            }
            com.google.android.gms.tasks.zzp zzpVar = this.zzb;
            java.util.concurrent.Executor executor = com.google.android.gms.tasks.TaskExecutors.zza;
            then.addOnSuccessListener(executor, zzpVar);
            then.addOnFailureListener(executor, this.zzb);
            then.addOnCanceledListener(executor, this.zzb);
        } catch (com.google.android.gms.tasks.RuntimeExecutionException e17) {
            if (e17.getCause() instanceof java.lang.Exception) {
                this.zzb.onFailure((java.lang.Exception) e17.getCause());
            } else {
                this.zzb.onFailure(e17);
            }
        } catch (java.util.concurrent.CancellationException unused) {
            this.zzb.onCanceled();
        } catch (java.lang.Exception e18) {
            this.zzb.onFailure(e18);
        }
    }
}
