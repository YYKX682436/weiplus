package com.google.android.gms.wearable;

/* loaded from: classes13.dex */
final class zzp implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.wearable.WearableListenerService.zzd zzao;
    private final /* synthetic */ java.util.List zzar;

    public zzp(com.google.android.gms.wearable.WearableListenerService.zzd zzdVar, java.util.List list) {
        this.zzao = zzdVar;
        this.zzar = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.wearable.WearableListenerService.this.onConnectedNodes(this.zzar);
    }
}
