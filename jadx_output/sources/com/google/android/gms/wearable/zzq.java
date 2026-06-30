package com.google.android.gms.wearable;

/* loaded from: classes13.dex */
final class zzq implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.wearable.WearableListenerService.zzd zzao;
    private final /* synthetic */ com.google.android.gms.wearable.internal.zzah zzas;

    public zzq(com.google.android.gms.wearable.WearableListenerService.zzd zzdVar, com.google.android.gms.wearable.internal.zzah zzahVar) {
        this.zzao = zzdVar;
        this.zzas = zzahVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.wearable.WearableListenerService.this.onCapabilityChanged(this.zzas);
    }
}
