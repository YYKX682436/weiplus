package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzaa extends com.google.android.gms.wearable.CapabilityClient {
    private final com.google.android.gms.wearable.CapabilityApi zzbw;

    public zzaa(android.app.Activity activity, com.google.android.gms.common.api.GoogleApi.Settings settings) {
        super(activity, settings);
        this.zzbw = new com.google.android.gms.wearable.internal.zzo();
    }

    private final com.google.android.gms.tasks.Task<java.lang.Void> zza(com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.wearable.CapabilityClient.OnCapabilityChangedListener> listenerHolder, com.google.android.gms.wearable.CapabilityClient.OnCapabilityChangedListener onCapabilityChangedListener, android.content.IntentFilter[] intentFilterArr) {
        return doRegisterEventListener(new com.google.android.gms.wearable.internal.zzaf(onCapabilityChangedListener, intentFilterArr, listenerHolder), new com.google.android.gms.wearable.internal.zzag(onCapabilityChangedListener, listenerHolder.getListenerKey()));
    }

    @Override // com.google.android.gms.wearable.CapabilityClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> addListener(com.google.android.gms.wearable.CapabilityClient.OnCapabilityChangedListener onCapabilityChangedListener, android.net.Uri uri, int i17) {
        com.google.android.gms.common.internal.Asserts.checkNotNull(onCapabilityChangedListener, "listener must not be null");
        com.google.android.gms.common.internal.Asserts.checkNotNull(uri, "uri must not be null");
        com.google.android.gms.common.internal.Preconditions.checkArgument(i17 == 0 || i17 == 1, "invalid filter type");
        return zza(com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(onCapabilityChangedListener, getLooper(), "CapabilityListener"), onCapabilityChangedListener, new android.content.IntentFilter[]{com.google.android.gms.wearable.internal.zzgj.zza("com.google.android.gms.wearable.CAPABILITY_CHANGED", uri, i17)});
    }

    @Override // com.google.android.gms.wearable.CapabilityClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> addLocalCapability(java.lang.String str) {
        com.google.android.gms.common.internal.Asserts.checkNotNull(str, "capability must not be null");
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(this.zzbw.addLocalCapability(asGoogleApiClient(), str));
    }

    @Override // com.google.android.gms.wearable.CapabilityClient
    public final com.google.android.gms.tasks.Task<java.util.Map<java.lang.String, com.google.android.gms.wearable.CapabilityInfo>> getAllCapabilities(int i17) {
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(this.zzbw.getAllCapabilities(asGoogleApiClient(), i17), com.google.android.gms.wearable.internal.zzac.zzbx);
    }

    @Override // com.google.android.gms.wearable.CapabilityClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.wearable.CapabilityInfo> getCapability(java.lang.String str, int i17) {
        com.google.android.gms.common.internal.Asserts.checkNotNull(str, "capability must not be null");
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(this.zzbw.getCapability(asGoogleApiClient(), str, i17), com.google.android.gms.wearable.internal.zzab.zzbx);
    }

    @Override // com.google.android.gms.wearable.CapabilityClient
    public final com.google.android.gms.tasks.Task<java.lang.Boolean> removeListener(com.google.android.gms.wearable.CapabilityClient.OnCapabilityChangedListener onCapabilityChangedListener) {
        com.google.android.gms.common.internal.Asserts.checkNotNull(onCapabilityChangedListener, "listener must not be null");
        return doUnregisterEventListener(com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(onCapabilityChangedListener, getLooper(), "CapabilityListener").getListenerKey());
    }

    @Override // com.google.android.gms.wearable.CapabilityClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> removeLocalCapability(java.lang.String str) {
        com.google.android.gms.common.internal.Asserts.checkNotNull(str, "capability must not be null");
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(this.zzbw.removeLocalCapability(asGoogleApiClient(), str));
    }

    public zzaa(android.content.Context context, com.google.android.gms.common.api.GoogleApi.Settings settings) {
        super(context, settings);
        this.zzbw = new com.google.android.gms.wearable.internal.zzo();
    }

    @Override // com.google.android.gms.wearable.CapabilityClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> addListener(com.google.android.gms.wearable.CapabilityClient.OnCapabilityChangedListener onCapabilityChangedListener, java.lang.String str) {
        com.google.android.gms.common.internal.Asserts.checkNotNull(onCapabilityChangedListener, "listener must not be null");
        com.google.android.gms.common.internal.Asserts.checkNotNull(str, "capability must not be null");
        android.content.IntentFilter zzc = com.google.android.gms.wearable.internal.zzgj.zzc("com.google.android.gms.wearable.CAPABILITY_CHANGED");
        if (!str.startsWith("/")) {
            str = str.length() != 0 ? "/".concat(str) : new java.lang.String("/");
        }
        zzc.addDataPath(str, 0);
        android.content.IntentFilter[] intentFilterArr = {zzc};
        android.os.Looper looper = getLooper();
        java.lang.String valueOf = java.lang.String.valueOf(str);
        return zza(com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(onCapabilityChangedListener, looper, valueOf.length() != 0 ? "CapabilityListener:".concat(valueOf) : new java.lang.String("CapabilityListener:")), new com.google.android.gms.wearable.internal.zzae(onCapabilityChangedListener, str), intentFilterArr);
    }

    @Override // com.google.android.gms.wearable.CapabilityClient
    public final com.google.android.gms.tasks.Task<java.lang.Boolean> removeListener(com.google.android.gms.wearable.CapabilityClient.OnCapabilityChangedListener onCapabilityChangedListener, java.lang.String str) {
        com.google.android.gms.common.internal.Asserts.checkNotNull(onCapabilityChangedListener, "listener must not be null");
        com.google.android.gms.common.internal.Asserts.checkNotNull(str, "capability must not be null");
        if (!str.startsWith("/")) {
            str = str.length() != 0 ? "/".concat(str) : new java.lang.String("/");
        }
        android.os.Looper looper = getLooper();
        java.lang.String valueOf = java.lang.String.valueOf(str);
        return doUnregisterEventListener(com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(onCapabilityChangedListener, looper, valueOf.length() != 0 ? "CapabilityListener:".concat(valueOf) : new java.lang.String("CapabilityListener:")).getListenerKey());
    }
}
