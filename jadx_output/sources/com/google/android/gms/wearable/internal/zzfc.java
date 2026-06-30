package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final class zzfc extends com.google.android.gms.common.api.internal.RegisterListenerMethod<com.google.android.gms.wearable.internal.zzhg, com.google.android.gms.wearable.MessageClient.OnMessageReceivedListener> {
    private final android.content.IntentFilter[] zzba;
    private final com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.wearable.MessageApi.MessageListener> zzbz;
    private final com.google.android.gms.wearable.MessageClient.OnMessageReceivedListener zzej;

    private zzfc(com.google.android.gms.wearable.MessageClient.OnMessageReceivedListener onMessageReceivedListener, android.content.IntentFilter[] intentFilterArr, com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.wearable.MessageClient.OnMessageReceivedListener> listenerHolder) {
        super(listenerHolder);
        this.zzej = onMessageReceivedListener;
        this.zzba = intentFilterArr;
        this.zzbz = listenerHolder;
    }

    @Override // com.google.android.gms.common.api.internal.RegisterListenerMethod
    public final /* synthetic */ void registerListener(com.google.android.gms.wearable.internal.zzhg zzhgVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        zzhgVar.zza(new com.google.android.gms.wearable.internal.zzgh(taskCompletionSource), this.zzej, this.zzbz, this.zzba);
    }
}
