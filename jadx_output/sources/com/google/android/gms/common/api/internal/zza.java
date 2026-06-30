package com.google.android.gms.common.api.internal;

/* loaded from: classes13.dex */
final class zza implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.api.internal.LifecycleCallback zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ com.google.android.gms.common.api.internal.zzb zzc;

    public zza(com.google.android.gms.common.api.internal.zzb zzbVar, com.google.android.gms.common.api.internal.LifecycleCallback lifecycleCallback, java.lang.String str) {
        this.zzc = zzbVar;
        this.zza = lifecycleCallback;
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        int i18;
        int i19;
        int i27;
        int i28;
        android.os.Bundle bundle;
        android.os.Bundle bundle2;
        android.os.Bundle bundle3;
        com.google.android.gms.common.api.internal.zzb zzbVar = this.zzc;
        i17 = zzbVar.zzc;
        if (i17 > 0) {
            com.google.android.gms.common.api.internal.LifecycleCallback lifecycleCallback = this.zza;
            bundle = zzbVar.zzd;
            if (bundle != null) {
                java.lang.String str = this.zzb;
                bundle3 = zzbVar.zzd;
                bundle2 = bundle3.getBundle(str);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.onCreate(bundle2);
        }
        i18 = this.zzc.zzc;
        if (i18 >= 2) {
            this.zza.onStart();
        }
        i19 = this.zzc.zzc;
        if (i19 >= 3) {
            this.zza.onResume();
        }
        i27 = this.zzc.zzc;
        if (i27 >= 4) {
            this.zza.onStop();
        }
        i28 = this.zzc.zzc;
        if (i28 >= 5) {
            this.zza.onDestroy();
        }
    }
}
