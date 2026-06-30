package com.google.android.gms.tasks;

/* loaded from: classes13.dex */
final class zzg implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.tasks.zzh zza;

    public zzg(com.google.android.gms.tasks.zzh zzhVar) {
        this.zza = zzhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj;
        com.google.android.gms.tasks.OnCanceledListener onCanceledListener;
        com.google.android.gms.tasks.OnCanceledListener onCanceledListener2;
        obj = this.zza.zzb;
        synchronized (obj) {
            com.google.android.gms.tasks.zzh zzhVar = this.zza;
            onCanceledListener = zzhVar.zzc;
            if (onCanceledListener != null) {
                onCanceledListener2 = zzhVar.zzc;
                onCanceledListener2.onCanceled();
            }
        }
    }
}
