package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final class zzho implements com.google.android.gms.common.api.internal.ListenerHolder.Notifier<com.google.android.gms.wearable.CapabilityApi.CapabilityListener> {
    private final /* synthetic */ com.google.android.gms.wearable.internal.zzah zzfr;

    public zzho(com.google.android.gms.wearable.internal.zzah zzahVar) {
        this.zzfr = zzahVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilityListener) {
        capabilityListener.onCapabilityChanged(this.zzfr);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}
