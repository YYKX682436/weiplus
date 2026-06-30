package com.google.android.gms.wearable;

/* loaded from: classes13.dex */
final class zzr implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.wearable.WearableListenerService.zzd zzao;
    private final /* synthetic */ com.google.android.gms.wearable.internal.zzl zzat;

    public zzr(com.google.android.gms.wearable.WearableListenerService.zzd zzdVar, com.google.android.gms.wearable.internal.zzl zzlVar) {
        this.zzao = zzdVar;
        this.zzat = zzlVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.wearable.internal.zzl, com.google.android.gms.wearable.zzd] */
    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.wearable.WearableListenerService.this.onNotificationReceived(this.zzat);
    }
}
