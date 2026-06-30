package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final /* synthetic */ class zzap implements com.google.android.gms.common.internal.PendingResultUtil.ResultConverter {
    static final com.google.android.gms.common.internal.PendingResultUtil.ResultConverter zzbx = new com.google.android.gms.wearable.internal.zzap();

    private zzap() {
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final java.lang.Object convert(com.google.android.gms.common.api.Result result) {
        com.google.android.gms.wearable.ChannelClient.Channel zza;
        zza = com.google.android.gms.wearable.internal.zzao.zza(((com.google.android.gms.wearable.ChannelApi.OpenChannelResult) result).getChannel());
        return zza;
    }
}
