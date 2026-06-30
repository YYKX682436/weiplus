package com.google.android.gms.wearable.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzex extends com.google.android.gms.wearable.internal.zzn<com.google.android.gms.common.api.Status> {
    private com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.wearable.MessageApi.MessageListener> zzax;
    private android.content.IntentFilter[] zzba;
    private com.google.android.gms.wearable.MessageApi.MessageListener zzeg;

    private zzex(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.wearable.MessageApi.MessageListener messageListener, com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.wearable.MessageApi.MessageListener> listenerHolder, android.content.IntentFilter[] intentFilterArr) {
        super(googleApiClient);
        this.zzeg = (com.google.android.gms.wearable.MessageApi.MessageListener) com.google.android.gms.common.internal.Preconditions.checkNotNull(messageListener);
        this.zzax = (com.google.android.gms.common.api.internal.ListenerHolder) com.google.android.gms.common.internal.Preconditions.checkNotNull(listenerHolder);
        this.zzba = (android.content.IntentFilter[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(intentFilterArr);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        this.zzeg = null;
        this.zzax = null;
        this.zzba = null;
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.wearable.internal.zzhg zzhgVar) {
        zzhgVar.zza(this, this.zzeg, this.zzax, this.zzba);
        this.zzeg = null;
        this.zzax = null;
        this.zzba = null;
    }

    public /* synthetic */ zzex(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.wearable.MessageApi.MessageListener messageListener, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder, android.content.IntentFilter[] intentFilterArr, com.google.android.gms.wearable.internal.zzev zzevVar) {
        this(googleApiClient, messageListener, listenerHolder, intentFilterArr);
    }
}
