package com.google.android.gms.common.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzr implements android.os.Handler.Callback {
    final /* synthetic */ com.google.android.gms.common.internal.zzs zza;

    public /* synthetic */ zzr(com.google.android.gms.common.internal.zzs zzsVar, com.google.android.gms.common.internal.zzq zzqVar) {
        this.zza = zzsVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        java.util.HashMap hashMap;
        java.util.HashMap hashMap2;
        java.util.HashMap hashMap3;
        java.util.HashMap hashMap4;
        java.util.HashMap hashMap5;
        int i17 = message.what;
        if (i17 == 0) {
            hashMap = this.zza.zzb;
            synchronized (hashMap) {
                com.google.android.gms.common.internal.zzo zzoVar = (com.google.android.gms.common.internal.zzo) message.obj;
                hashMap2 = this.zza.zzb;
                com.google.android.gms.common.internal.zzp zzpVar = (com.google.android.gms.common.internal.zzp) hashMap2.get(zzoVar);
                if (zzpVar != null && zzpVar.zzi()) {
                    if (zzpVar.zzj()) {
                        zzpVar.zzg("GmsClientSupervisor");
                    }
                    hashMap3 = this.zza.zzb;
                    hashMap3.remove(zzoVar);
                }
            }
            return true;
        }
        if (i17 != 1) {
            return false;
        }
        hashMap4 = this.zza.zzb;
        synchronized (hashMap4) {
            com.google.android.gms.common.internal.zzo zzoVar2 = (com.google.android.gms.common.internal.zzo) message.obj;
            hashMap5 = this.zza.zzb;
            com.google.android.gms.common.internal.zzp zzpVar2 = (com.google.android.gms.common.internal.zzp) hashMap5.get(zzoVar2);
            if (zzpVar2 != null && zzpVar2.zza() == 3) {
                java.lang.String.valueOf(zzoVar2);
                new java.lang.Exception();
                android.content.ComponentName zzb = zzpVar2.zzb();
                if (zzb == null) {
                    zzb = zzoVar2.zza();
                }
                if (zzb == null) {
                    java.lang.String zzc = zzoVar2.zzc();
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(zzc);
                    zzb = new android.content.ComponentName(zzc, com.eclipsesource.mmv8.Platform.UNKNOWN);
                }
                zzpVar2.onServiceDisconnected(zzb);
            }
        }
        return true;
    }
}
