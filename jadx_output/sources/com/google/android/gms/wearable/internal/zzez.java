package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzez extends com.google.android.gms.wearable.MessageClient {
    private final com.google.android.gms.wearable.MessageApi zzei;

    public zzez(android.app.Activity activity, com.google.android.gms.common.api.GoogleApi.Settings settings) {
        super(activity, settings);
        this.zzei = new com.google.android.gms.wearable.internal.zzeu();
    }

    private final com.google.android.gms.tasks.Task<java.lang.Void> zza(com.google.android.gms.wearable.MessageClient.OnMessageReceivedListener onMessageReceivedListener, android.content.IntentFilter[] intentFilterArr) {
        com.google.android.gms.common.api.internal.ListenerHolder createListenerHolder = com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(onMessageReceivedListener, getLooper(), "MessageListener");
        return doRegisterEventListener(new com.google.android.gms.wearable.internal.zzfc(onMessageReceivedListener, intentFilterArr, createListenerHolder), new com.google.android.gms.wearable.internal.zzfd(onMessageReceivedListener, createListenerHolder.getListenerKey()));
    }

    @Override // com.google.android.gms.wearable.MessageClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> addListener(com.google.android.gms.wearable.MessageClient.OnMessageReceivedListener onMessageReceivedListener) {
        return zza(onMessageReceivedListener, new android.content.IntentFilter[]{com.google.android.gms.wearable.internal.zzgj.zzc("com.google.android.gms.wearable.MESSAGE_RECEIVED")});
    }

    @Override // com.google.android.gms.wearable.MessageClient
    public final com.google.android.gms.tasks.Task<java.lang.Boolean> removeListener(com.google.android.gms.wearable.MessageClient.OnMessageReceivedListener onMessageReceivedListener) {
        return doUnregisterEventListener(com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(onMessageReceivedListener, getLooper(), "MessageListener").getListenerKey());
    }

    @Override // com.google.android.gms.wearable.MessageClient
    public final com.google.android.gms.tasks.Task<java.lang.Integer> sendMessage(java.lang.String str, java.lang.String str2, byte[] bArr) {
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(this.zzei.sendMessage(asGoogleApiClient(), str, str2, bArr), com.google.android.gms.wearable.internal.zzfa.zzbx);
    }

    public zzez(android.content.Context context, com.google.android.gms.common.api.GoogleApi.Settings settings) {
        super(context, settings);
        this.zzei = new com.google.android.gms.wearable.internal.zzeu();
    }

    @Override // com.google.android.gms.wearable.MessageClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> addListener(com.google.android.gms.wearable.MessageClient.OnMessageReceivedListener onMessageReceivedListener, android.net.Uri uri, int i17) {
        m3.h.d(uri, "uri must not be null");
        com.google.android.gms.common.internal.Preconditions.checkArgument(i17 == 0 || i17 == 1, "invalid filter type");
        return zza(onMessageReceivedListener, new android.content.IntentFilter[]{com.google.android.gms.wearable.internal.zzgj.zza("com.google.android.gms.wearable.MESSAGE_RECEIVED", uri, i17)});
    }
}
