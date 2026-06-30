package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzhk<T> extends com.google.android.gms.wearable.internal.zzen {
    private final android.content.IntentFilter[] zzba;
    private final java.lang.String zzbb;
    private com.google.android.gms.common.api.internal.ListenerHolder<java.lang.Object> zzfj;
    private com.google.android.gms.common.api.internal.ListenerHolder<java.lang.Object> zzfk;
    private com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.wearable.DataApi.DataListener> zzfl;
    private com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.wearable.MessageApi.MessageListener> zzfm;
    private com.google.android.gms.common.api.internal.ListenerHolder<java.lang.Object> zzfn;
    private com.google.android.gms.common.api.internal.ListenerHolder<java.lang.Object> zzfo;
    private com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.wearable.ChannelApi.ChannelListener> zzfp;
    private com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.wearable.CapabilityApi.CapabilityListener> zzfq;

    private zzhk(android.content.IntentFilter[] intentFilterArr, java.lang.String str) {
        this.zzba = (android.content.IntentFilter[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(intentFilterArr);
        this.zzbb = str;
    }

    public static com.google.android.gms.wearable.internal.zzhk<com.google.android.gms.wearable.ChannelApi.ChannelListener> zza(com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.wearable.ChannelApi.ChannelListener> listenerHolder, java.lang.String str, android.content.IntentFilter[] intentFilterArr) {
        com.google.android.gms.wearable.internal.zzhk<com.google.android.gms.wearable.ChannelApi.ChannelListener> zzhkVar = new com.google.android.gms.wearable.internal.zzhk<>(intentFilterArr, (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str));
        ((com.google.android.gms.wearable.internal.zzhk) zzhkVar).zzfp = (com.google.android.gms.common.api.internal.ListenerHolder) com.google.android.gms.common.internal.Preconditions.checkNotNull(listenerHolder);
        return zzhkVar;
    }

    public static com.google.android.gms.wearable.internal.zzhk<com.google.android.gms.wearable.MessageApi.MessageListener> zzb(com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.wearable.MessageApi.MessageListener> listenerHolder, android.content.IntentFilter[] intentFilterArr) {
        com.google.android.gms.wearable.internal.zzhk<com.google.android.gms.wearable.MessageApi.MessageListener> zzhkVar = new com.google.android.gms.wearable.internal.zzhk<>(intentFilterArr, null);
        ((com.google.android.gms.wearable.internal.zzhk) zzhkVar).zzfm = (com.google.android.gms.common.api.internal.ListenerHolder) com.google.android.gms.common.internal.Preconditions.checkNotNull(listenerHolder);
        return zzhkVar;
    }

    public static com.google.android.gms.wearable.internal.zzhk<com.google.android.gms.wearable.ChannelApi.ChannelListener> zzc(com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.wearable.ChannelApi.ChannelListener> listenerHolder, android.content.IntentFilter[] intentFilterArr) {
        com.google.android.gms.wearable.internal.zzhk<com.google.android.gms.wearable.ChannelApi.ChannelListener> zzhkVar = new com.google.android.gms.wearable.internal.zzhk<>(intentFilterArr, null);
        ((com.google.android.gms.wearable.internal.zzhk) zzhkVar).zzfp = (com.google.android.gms.common.api.internal.ListenerHolder) com.google.android.gms.common.internal.Preconditions.checkNotNull(listenerHolder);
        return zzhkVar;
    }

    public static com.google.android.gms.wearable.internal.zzhk<com.google.android.gms.wearable.CapabilityApi.CapabilityListener> zzd(com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.wearable.CapabilityApi.CapabilityListener> listenerHolder, android.content.IntentFilter[] intentFilterArr) {
        com.google.android.gms.wearable.internal.zzhk<com.google.android.gms.wearable.CapabilityApi.CapabilityListener> zzhkVar = new com.google.android.gms.wearable.internal.zzhk<>(intentFilterArr, null);
        ((com.google.android.gms.wearable.internal.zzhk) zzhkVar).zzfq = (com.google.android.gms.common.api.internal.ListenerHolder) com.google.android.gms.common.internal.Preconditions.checkNotNull(listenerHolder);
        return zzhkVar;
    }

    public final void clear() {
        zza((com.google.android.gms.common.api.internal.ListenerHolder<?>) null);
        this.zzfj = null;
        zza((com.google.android.gms.common.api.internal.ListenerHolder<?>) null);
        this.zzfk = null;
        zza(this.zzfl);
        this.zzfl = null;
        zza(this.zzfm);
        this.zzfm = null;
        zza((com.google.android.gms.common.api.internal.ListenerHolder<?>) null);
        this.zzfn = null;
        zza((com.google.android.gms.common.api.internal.ListenerHolder<?>) null);
        this.zzfo = null;
        zza(this.zzfp);
        this.zzfp = null;
        zza(this.zzfq);
        this.zzfq = null;
    }

    @Override // com.google.android.gms.wearable.internal.zzem
    public final void onConnectedNodes(java.util.List<com.google.android.gms.wearable.internal.zzfo> list) {
    }

    public final android.content.IntentFilter[] zze() {
        return this.zzba;
    }

    public final java.lang.String zzf() {
        return this.zzbb;
    }

    public static com.google.android.gms.wearable.internal.zzhk<com.google.android.gms.wearable.DataApi.DataListener> zza(com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.wearable.DataApi.DataListener> listenerHolder, android.content.IntentFilter[] intentFilterArr) {
        com.google.android.gms.wearable.internal.zzhk<com.google.android.gms.wearable.DataApi.DataListener> zzhkVar = new com.google.android.gms.wearable.internal.zzhk<>(intentFilterArr, null);
        ((com.google.android.gms.wearable.internal.zzhk) zzhkVar).zzfl = (com.google.android.gms.common.api.internal.ListenerHolder) com.google.android.gms.common.internal.Preconditions.checkNotNull(listenerHolder);
        return zzhkVar;
    }

    @Override // com.google.android.gms.wearable.internal.zzem
    public final void zzb(com.google.android.gms.wearable.internal.zzfo zzfoVar) {
    }

    private static void zza(com.google.android.gms.common.api.internal.ListenerHolder<?> listenerHolder) {
        if (listenerHolder != null) {
            listenerHolder.clear();
        }
    }

    @Override // com.google.android.gms.wearable.internal.zzem
    public final void zza(com.google.android.gms.common.data.DataHolder dataHolder) {
        com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.wearable.DataApi.DataListener> listenerHolder = this.zzfl;
        if (listenerHolder != null) {
            listenerHolder.notifyListener(new com.google.android.gms.wearable.internal.zzhl(dataHolder));
        } else {
            dataHolder.close();
        }
    }

    @Override // com.google.android.gms.wearable.internal.zzem
    public final void zza(com.google.android.gms.wearable.internal.zzah zzahVar) {
        com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.wearable.CapabilityApi.CapabilityListener> listenerHolder = this.zzfq;
        if (listenerHolder != null) {
            listenerHolder.notifyListener(new com.google.android.gms.wearable.internal.zzho(zzahVar));
        }
    }

    @Override // com.google.android.gms.wearable.internal.zzem
    public final void zza(com.google.android.gms.wearable.internal.zzaw zzawVar) {
        com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.wearable.ChannelApi.ChannelListener> listenerHolder = this.zzfp;
        if (listenerHolder != null) {
            listenerHolder.notifyListener(new com.google.android.gms.wearable.internal.zzhn(zzawVar));
        }
    }

    @Override // com.google.android.gms.wearable.internal.zzem
    public final void zza(com.google.android.gms.wearable.internal.zzfe zzfeVar) {
        com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.wearable.MessageApi.MessageListener> listenerHolder = this.zzfm;
        if (listenerHolder != null) {
            listenerHolder.notifyListener(new com.google.android.gms.wearable.internal.zzhm(zzfeVar));
        }
    }

    @Override // com.google.android.gms.wearable.internal.zzem
    public final void zza(com.google.android.gms.wearable.internal.zzfo zzfoVar) {
    }

    @Override // com.google.android.gms.wearable.internal.zzem
    public final void zza(com.google.android.gms.wearable.internal.zzi zziVar) {
    }

    @Override // com.google.android.gms.wearable.internal.zzem
    public final void zza(com.google.android.gms.wearable.internal.zzl zzlVar) {
    }
}
