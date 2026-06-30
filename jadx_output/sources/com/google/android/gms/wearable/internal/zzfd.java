package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final class zzfd extends com.google.android.gms.common.api.internal.UnregisterListenerMethod<com.google.android.gms.wearable.internal.zzhg, com.google.android.gms.wearable.MessageClient.OnMessageReceivedListener> {
    private final com.google.android.gms.wearable.MessageClient.OnMessageReceivedListener zzej;

    private zzfd(com.google.android.gms.wearable.MessageClient.OnMessageReceivedListener onMessageReceivedListener, com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<com.google.android.gms.wearable.MessageClient.OnMessageReceivedListener> listenerKey) {
        super(listenerKey);
        this.zzej = onMessageReceivedListener;
    }

    @Override // com.google.android.gms.common.api.internal.UnregisterListenerMethod
    public final /* synthetic */ void unregisterListener(com.google.android.gms.wearable.internal.zzhg zzhgVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        zzhgVar.zza(new com.google.android.gms.wearable.internal.zzgg(taskCompletionSource), this.zzej);
    }
}
