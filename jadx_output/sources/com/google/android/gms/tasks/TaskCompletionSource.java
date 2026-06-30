package com.google.android.gms.tasks;

/* loaded from: classes13.dex */
public class TaskCompletionSource<TResult> {
    private final com.google.android.gms.tasks.zzw zza = new com.google.android.gms.tasks.zzw();

    public TaskCompletionSource() {
    }

    public com.google.android.gms.tasks.Task<TResult> getTask() {
        return this.zza;
    }

    public void setException(java.lang.Exception exc) {
        this.zza.zza(exc);
    }

    public void setResult(TResult tresult) {
        this.zza.zzb(tresult);
    }

    public boolean trySetException(java.lang.Exception exc) {
        return this.zza.zzd(exc);
    }

    public boolean trySetResult(TResult tresult) {
        return this.zza.zze(tresult);
    }

    public TaskCompletionSource(com.google.android.gms.tasks.CancellationToken cancellationToken) {
        cancellationToken.onCanceledRequested(new com.google.android.gms.tasks.zzs(this));
    }
}
