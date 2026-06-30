package com.google.android.gms.wearable;

/* loaded from: classes13.dex */
final class zzl implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.common.data.DataHolder zzan;
    private final /* synthetic */ com.google.android.gms.wearable.WearableListenerService.zzd zzao;

    public zzl(com.google.android.gms.wearable.WearableListenerService.zzd zzdVar, com.google.android.gms.common.data.DataHolder dataHolder) {
        this.zzao = zzdVar;
        this.zzan = dataHolder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.wearable.DataEventBuffer dataEventBuffer = new com.google.android.gms.wearable.DataEventBuffer(this.zzan);
        try {
            com.google.android.gms.wearable.WearableListenerService.this.onDataChanged(dataEventBuffer);
        } finally {
            dataEventBuffer.release();
        }
    }
}
