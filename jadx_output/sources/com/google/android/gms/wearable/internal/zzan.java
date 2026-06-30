package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final class zzan extends com.google.android.gms.wearable.internal.zzn<com.google.android.gms.common.api.Status> {
    private final java.lang.String zzce;
    private com.google.android.gms.wearable.ChannelApi.ChannelListener zzcf;

    public zzan(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.wearable.ChannelApi.ChannelListener channelListener, java.lang.String str) {
        super(googleApiClient);
        this.zzcf = (com.google.android.gms.wearable.ChannelApi.ChannelListener) com.google.android.gms.common.internal.Preconditions.checkNotNull(channelListener);
        this.zzce = str;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        this.zzcf = null;
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.wearable.internal.zzhg zzhgVar) {
        zzhgVar.zza(this, this.zzcf, this.zzce);
        this.zzcf = null;
    }
}
