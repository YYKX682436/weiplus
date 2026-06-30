package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final class zzhl implements com.google.android.gms.common.api.internal.ListenerHolder.Notifier<com.google.android.gms.wearable.DataApi.DataListener> {
    private final /* synthetic */ com.google.android.gms.common.data.DataHolder zzan;

    public zzhl(com.google.android.gms.common.data.DataHolder dataHolder) {
        this.zzan = dataHolder;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(com.google.android.gms.wearable.DataApi.DataListener dataListener) {
        try {
            dataListener.onDataChanged(new com.google.android.gms.wearable.DataEventBuffer(this.zzan));
        } finally {
            this.zzan.close();
        }
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
        this.zzan.close();
    }
}
