package com.google.android.gms.tasks;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzs implements com.google.android.gms.tasks.OnTokenCanceledListener {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    public zzs(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnTokenCanceledListener
    public final void onCanceled() {
        com.google.android.gms.tasks.zzw zzwVar;
        zzwVar = this.zza.zza;
        zzwVar.zzc();
    }
}
