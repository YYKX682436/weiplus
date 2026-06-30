package com.google.android.gms.iid;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzj implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.iid.zzg zzbj;
    private final /* synthetic */ com.google.android.gms.iid.zzi zzbk;

    public zzj(com.google.android.gms.iid.zzi zziVar, com.google.android.gms.iid.zzg zzgVar) {
        this.zzbk = zziVar;
        this.zzbj = zzgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.iid.zze zzeVar;
        android.util.Log.isLoggable("EnhancedIntentService", 3);
        zzeVar = this.zzbk.zzbi;
        zzeVar.handleIntent(this.zzbj.intent);
        this.zzbj.finish();
    }
}
