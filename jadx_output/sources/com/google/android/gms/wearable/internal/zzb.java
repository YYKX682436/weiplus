package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final class zzb<T> extends com.google.android.gms.wearable.internal.zzn<com.google.android.gms.common.api.Status> {
    private T zzaw;
    private com.google.android.gms.common.api.internal.ListenerHolder<T> zzax;
    private com.google.android.gms.wearable.internal.zzc<T> zzay;

    private zzb(com.google.android.gms.common.api.GoogleApiClient googleApiClient, T t17, com.google.android.gms.common.api.internal.ListenerHolder<T> listenerHolder, com.google.android.gms.wearable.internal.zzc<T> zzcVar) {
        super(googleApiClient);
        this.zzaw = (T) com.google.android.gms.common.internal.Preconditions.checkNotNull(t17);
        this.zzax = (com.google.android.gms.common.api.internal.ListenerHolder) com.google.android.gms.common.internal.Preconditions.checkNotNull(listenerHolder);
        this.zzay = (com.google.android.gms.wearable.internal.zzc) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzcVar);
    }

    public static <T> com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> zza(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.wearable.internal.zzc<T> zzcVar, T t17) {
        return googleApiClient.enqueue(new com.google.android.gms.wearable.internal.zzb(googleApiClient, t17, googleApiClient.registerListener(t17), zzcVar));
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        this.zzaw = null;
        this.zzax = null;
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.wearable.internal.zzhg zzhgVar) {
        this.zzay.zza(zzhgVar, this, this.zzaw, this.zzax);
        this.zzaw = null;
        this.zzax = null;
    }
}
