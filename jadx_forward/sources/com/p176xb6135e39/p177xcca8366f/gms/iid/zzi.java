package com.p176xb6135e39.p177xcca8366f.gms.iid;

/* loaded from: classes13.dex */
public final class zzi extends android.os.Binder {

    /* renamed from: zzbi */
    private final com.p176xb6135e39.p177xcca8366f.gms.iid.zze f6141x394b87;

    public zzi(com.p176xb6135e39.p177xcca8366f.gms.iid.zze zzeVar) {
        this.f6141x394b87 = zzeVar;
    }

    public final void zzd(com.p176xb6135e39.p177xcca8366f.gms.iid.zzg zzgVar) {
        if (android.os.Binder.getCallingUid() != android.os.Process.myUid()) {
            throw new java.lang.SecurityException("Binding only allowed within app");
        }
        android.util.Log.isLoggable("EnhancedIntentService", 3);
        android.util.Log.isLoggable("EnhancedIntentService", 3);
        this.f6141x394b87.f6128x394b77.execute(new com.p176xb6135e39.p177xcca8366f.gms.iid.zzj(this, zzgVar));
    }
}
