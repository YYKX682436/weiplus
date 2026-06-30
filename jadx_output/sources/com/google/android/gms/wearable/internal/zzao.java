package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzao extends com.google.android.gms.wearable.ChannelClient {
    private final com.google.android.gms.wearable.internal.zzaj zzcg;

    public zzao(android.app.Activity activity, com.google.android.gms.common.api.GoogleApi.Settings settings) {
        super(activity, settings);
        this.zzcg = new com.google.android.gms.wearable.internal.zzaj();
    }

    public static /* synthetic */ com.google.android.gms.wearable.internal.zzay zzb(com.google.android.gms.wearable.Channel channel) {
        return zza(channel);
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> close(com.google.android.gms.wearable.ChannelClient.Channel channel) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zza(channel).close(asGoogleApiClient()));
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final com.google.android.gms.tasks.Task<java.io.InputStream> getInputStream(com.google.android.gms.wearable.ChannelClient.Channel channel) {
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(zza(channel).getInputStream(asGoogleApiClient()), com.google.android.gms.wearable.internal.zzaq.zzbx);
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final com.google.android.gms.tasks.Task<java.io.OutputStream> getOutputStream(com.google.android.gms.wearable.ChannelClient.Channel channel) {
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(zza(channel).getOutputStream(asGoogleApiClient()), com.google.android.gms.wearable.internal.zzar.zzbx);
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.wearable.ChannelClient.Channel> openChannel(java.lang.String str, java.lang.String str2) {
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(this.zzcg.openChannel(asGoogleApiClient(), str, str2), com.google.android.gms.wearable.internal.zzap.zzbx);
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> receiveFile(com.google.android.gms.wearable.ChannelClient.Channel channel, android.net.Uri uri, boolean z17) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zza(channel).receiveFile(asGoogleApiClient(), uri, z17));
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> registerChannelCallback(com.google.android.gms.wearable.ChannelClient.Channel channel, com.google.android.gms.wearable.ChannelClient.ChannelCallback channelCallback) {
        java.lang.String zzc = ((com.google.android.gms.wearable.internal.zzay) channel).zzc();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(channelCallback, "listener is null");
        android.os.Looper looper = getLooper();
        java.lang.String valueOf = java.lang.String.valueOf(zzc);
        com.google.android.gms.common.api.internal.ListenerHolder createListenerHolder = com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(channelCallback, looper, valueOf.length() != 0 ? "ChannelListener:".concat(valueOf) : new java.lang.String("ChannelListener:"));
        android.content.IntentFilter[] intentFilterArr = {com.google.android.gms.wearable.internal.zzgj.zzc("com.google.android.gms.wearable.CHANNEL_EVENT")};
        com.google.android.gms.wearable.internal.zzas zzasVar = new com.google.android.gms.wearable.internal.zzas(channelCallback);
        return doRegisterEventListener(new com.google.android.gms.wearable.internal.zzat(zzasVar, zzc, intentFilterArr, createListenerHolder, com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(zzasVar, getLooper(), "ChannelListener")), new com.google.android.gms.wearable.internal.zzau(zzasVar, zzc, createListenerHolder.getListenerKey()));
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> sendFile(com.google.android.gms.wearable.ChannelClient.Channel channel, android.net.Uri uri) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zza(channel).sendFile(asGoogleApiClient(), uri));
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final com.google.android.gms.tasks.Task<java.lang.Boolean> unregisterChannelCallback(com.google.android.gms.wearable.ChannelClient.Channel channel, com.google.android.gms.wearable.ChannelClient.ChannelCallback channelCallback) {
        java.lang.String zzc = zza(channel).zzc();
        android.os.Looper looper = getLooper();
        java.lang.String valueOf = java.lang.String.valueOf(zzc);
        return doUnregisterEventListener(com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(channelCallback, looper, valueOf.length() != 0 ? "ChannelListener:".concat(valueOf) : new java.lang.String("ChannelListener:")).getListenerKey());
    }

    public zzao(android.content.Context context, com.google.android.gms.common.api.GoogleApi.Settings settings) {
        super(context, settings);
        this.zzcg = new com.google.android.gms.wearable.internal.zzaj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.gms.wearable.internal.zzay zza(com.google.android.gms.wearable.Channel channel) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(channel, "channel must not be null");
        return (com.google.android.gms.wearable.internal.zzay) channel;
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> close(com.google.android.gms.wearable.ChannelClient.Channel channel, int i17) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zza(channel).close(asGoogleApiClient(), i17));
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> registerChannelCallback(com.google.android.gms.wearable.ChannelClient.ChannelCallback channelCallback) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(channelCallback, "listener is null");
        com.google.android.gms.common.api.internal.ListenerHolder createListenerHolder = com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(channelCallback, getLooper(), "ChannelListener");
        android.content.IntentFilter[] intentFilterArr = {com.google.android.gms.wearable.internal.zzgj.zzc("com.google.android.gms.wearable.CHANNEL_EVENT")};
        com.google.android.gms.wearable.internal.zzas zzasVar = new com.google.android.gms.wearable.internal.zzas(channelCallback);
        return doRegisterEventListener(new com.google.android.gms.wearable.internal.zzat(zzasVar, null, intentFilterArr, createListenerHolder, com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(zzasVar, getLooper(), "ChannelListener")), new com.google.android.gms.wearable.internal.zzau(zzasVar, null, createListenerHolder.getListenerKey()));
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> sendFile(com.google.android.gms.wearable.ChannelClient.Channel channel, android.net.Uri uri, long j17, long j18) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zza(channel).sendFile(asGoogleApiClient(), uri, j17, j18));
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final com.google.android.gms.tasks.Task<java.lang.Boolean> unregisterChannelCallback(com.google.android.gms.wearable.ChannelClient.ChannelCallback channelCallback) {
        return doUnregisterEventListener(com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(channelCallback, getLooper(), "ChannelListener").getListenerKey());
    }

    private static com.google.android.gms.wearable.internal.zzay zza(com.google.android.gms.wearable.ChannelClient.Channel channel) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(channel, "channel must not be null");
        return (com.google.android.gms.wearable.internal.zzay) channel;
    }
}
