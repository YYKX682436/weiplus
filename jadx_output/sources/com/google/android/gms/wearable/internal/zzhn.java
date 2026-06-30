package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final class zzhn implements com.google.android.gms.common.api.internal.ListenerHolder.Notifier<com.google.android.gms.wearable.ChannelApi.ChannelListener> {
    private final /* synthetic */ com.google.android.gms.wearable.internal.zzaw zzav;

    public zzhn(com.google.android.gms.wearable.internal.zzaw zzawVar) {
        this.zzav = zzawVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(com.google.android.gms.wearable.ChannelApi.ChannelListener channelListener) {
        this.zzav.zza(channelListener);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}
