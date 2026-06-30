package com.google.android.gms.wearable.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzcw extends com.google.android.gms.common.api.internal.UnregisterListenerMethod<com.google.android.gms.wearable.internal.zzhg, com.google.android.gms.wearable.DataClient.OnDataChangedListener> {
    private final com.google.android.gms.wearable.DataClient.OnDataChangedListener zzdk;

    private zzcw(com.google.android.gms.wearable.DataClient.OnDataChangedListener onDataChangedListener, com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<com.google.android.gms.wearable.DataClient.OnDataChangedListener> listenerKey) {
        super(listenerKey);
        this.zzdk = onDataChangedListener;
    }

    @Override // com.google.android.gms.common.api.internal.UnregisterListenerMethod
    public final /* synthetic */ void unregisterListener(com.google.android.gms.wearable.internal.zzhg zzhgVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        zzhgVar.zza(new com.google.android.gms.wearable.internal.zzgg(taskCompletionSource), this.zzdk);
    }
}
