package com.google.android.gms.wearable;

/* loaded from: classes13.dex */
final class zzt implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.wearable.WearableListenerService.zzd zzao;
    private final /* synthetic */ com.google.android.gms.wearable.internal.zzaw zzav;

    public zzt(com.google.android.gms.wearable.WearableListenerService.zzd zzdVar, com.google.android.gms.wearable.internal.zzaw zzawVar) {
        this.zzao = zzdVar;
        this.zzav = zzawVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.wearable.internal.zzas zzasVar;
        this.zzav.zza(com.google.android.gms.wearable.WearableListenerService.this);
        com.google.android.gms.wearable.internal.zzaw zzawVar = this.zzav;
        zzasVar = com.google.android.gms.wearable.WearableListenerService.this.zzaj;
        zzawVar.zza(zzasVar);
    }
}
