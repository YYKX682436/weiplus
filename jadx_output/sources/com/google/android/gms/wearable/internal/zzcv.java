package com.google.android.gms.wearable.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzcv extends com.google.android.gms.common.api.internal.RegisterListenerMethod<com.google.android.gms.wearable.internal.zzhg, com.google.android.gms.wearable.DataClient.OnDataChangedListener> {
    private final android.content.IntentFilter[] zzba;
    private final com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.wearable.DataApi.DataListener> zzbz;
    private final com.google.android.gms.wearable.DataClient.OnDataChangedListener zzdk;

    private zzcv(com.google.android.gms.wearable.DataClient.OnDataChangedListener onDataChangedListener, android.content.IntentFilter[] intentFilterArr, com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.wearable.DataClient.OnDataChangedListener> listenerHolder) {
        super(listenerHolder);
        this.zzdk = onDataChangedListener;
        this.zzba = intentFilterArr;
        this.zzbz = listenerHolder;
    }

    @Override // com.google.android.gms.common.api.internal.RegisterListenerMethod
    public final /* synthetic */ void registerListener(com.google.android.gms.wearable.internal.zzhg zzhgVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        zzhgVar.zza(new com.google.android.gms.wearable.internal.zzgh(taskCompletionSource), this.zzdk, this.zzbz, this.zzba);
    }
}
