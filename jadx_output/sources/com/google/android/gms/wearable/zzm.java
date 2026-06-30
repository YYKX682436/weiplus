package com.google.android.gms.wearable;

/* loaded from: classes13.dex */
final class zzm implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.wearable.WearableListenerService.zzd zzao;
    private final /* synthetic */ com.google.android.gms.wearable.internal.zzfe zzap;

    public zzm(com.google.android.gms.wearable.WearableListenerService.zzd zzdVar, com.google.android.gms.wearable.internal.zzfe zzfeVar) {
        this.zzao = zzdVar;
        this.zzap = zzfeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.wearable.WearableListenerService.this.onMessageReceived(this.zzap);
    }
}
