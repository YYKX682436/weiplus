package com.google.android.gms.tasks;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzaf<T> implements com.google.android.gms.tasks.zzae<T> {
    private final java.lang.Object zza = new java.lang.Object();
    private final int zzb;
    private final com.google.android.gms.tasks.zzw zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private java.lang.Exception zzg;
    private boolean zzh;

    public zzaf(int i17, com.google.android.gms.tasks.zzw zzwVar) {
        this.zzb = i17;
        this.zzc = zzwVar;
    }

    private final void zza() {
        if (this.zzd + this.zze + this.zzf == this.zzb) {
            if (this.zzg == null) {
                if (this.zzh) {
                    this.zzc.zzc();
                    return;
                } else {
                    this.zzc.zzb(null);
                    return;
                }
            }
            this.zzc.zza(new java.util.concurrent.ExecutionException(this.zze + " out of " + this.zzb + " underlying tasks failed", this.zzg));
        }
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        synchronized (this.zza) {
            this.zzf++;
            this.zzh = true;
            zza();
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(java.lang.Exception exc) {
        synchronized (this.zza) {
            this.zze++;
            this.zzg = exc;
            zza();
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(T t17) {
        synchronized (this.zza) {
            this.zzd++;
            zza();
        }
    }
}
