package com.google.android.gms.iid;

/* loaded from: classes13.dex */
public final class zzi extends android.os.Binder {
    private final com.google.android.gms.iid.zze zzbi;

    public zzi(com.google.android.gms.iid.zze zzeVar) {
        this.zzbi = zzeVar;
    }

    public final void zzd(com.google.android.gms.iid.zzg zzgVar) {
        if (android.os.Binder.getCallingUid() != android.os.Process.myUid()) {
            throw new java.lang.SecurityException("Binding only allowed within app");
        }
        android.util.Log.isLoggable("EnhancedIntentService", 3);
        android.util.Log.isLoggable("EnhancedIntentService", 3);
        this.zzbi.zzax.execute(new com.google.android.gms.iid.zzj(this, zzgVar));
    }
}
