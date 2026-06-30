package com.google.android.gms.internal.p000authapiphone;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public abstract class zzm extends com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.internal.p000authapiphone.zzi, java.lang.Void> {
    private com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> zzf;

    private zzm() {
    }

    public /* synthetic */ zzm(com.google.android.gms.internal.p000authapiphone.zzk zzkVar) {
        this();
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    public /* synthetic */ void doExecute(com.google.android.gms.internal.p000authapiphone.zzi zziVar, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> taskCompletionSource) {
        this.zzf = taskCompletionSource;
        zza((com.google.android.gms.internal.p000authapiphone.zze) zziVar.getService());
    }

    public abstract void zza(com.google.android.gms.internal.p000authapiphone.zze zzeVar);

    public final void zzb(com.google.android.gms.common.api.Status status) {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(status, this.zzf);
    }
}
