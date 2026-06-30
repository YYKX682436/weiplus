package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final class zzhm implements com.google.android.gms.common.api.internal.ListenerHolder.Notifier<com.google.android.gms.wearable.MessageApi.MessageListener> {
    private final /* synthetic */ com.google.android.gms.wearable.internal.zzfe zzap;

    public zzhm(com.google.android.gms.wearable.internal.zzfe zzfeVar) {
        this.zzap = zzfeVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(com.google.android.gms.wearable.MessageApi.MessageListener messageListener) {
        messageListener.onMessageReceived(this.zzap);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}
