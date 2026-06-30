package com.google.android.gms.wearable;

/* loaded from: classes13.dex */
final class zzs implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.wearable.WearableListenerService.zzd zzao;
    private final /* synthetic */ com.google.android.gms.wearable.internal.zzi zzau;

    public zzs(com.google.android.gms.wearable.WearableListenerService.zzd zzdVar, com.google.android.gms.wearable.internal.zzi zziVar) {
        this.zzao = zzdVar;
        this.zzau = zziVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.wearable.internal.zzi, com.google.android.gms.wearable.zzb] */
    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.wearable.WearableListenerService.this.onEntityUpdate(this.zzau);
    }
}
