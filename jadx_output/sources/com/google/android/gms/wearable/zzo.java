package com.google.android.gms.wearable;

/* loaded from: classes13.dex */
final class zzo implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.wearable.WearableListenerService.zzd zzao;
    private final /* synthetic */ com.google.android.gms.wearable.internal.zzfo zzaq;

    public zzo(com.google.android.gms.wearable.WearableListenerService.zzd zzdVar, com.google.android.gms.wearable.internal.zzfo zzfoVar) {
        this.zzao = zzdVar;
        this.zzaq = zzfoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.wearable.WearableListenerService.this.onPeerDisconnected(this.zzaq);
    }
}
