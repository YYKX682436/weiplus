package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final /* synthetic */ class zzfn implements com.google.android.gms.common.internal.PendingResultUtil.ResultConverter {
    static final com.google.android.gms.common.internal.PendingResultUtil.ResultConverter zzbx = new com.google.android.gms.wearable.internal.zzfn();

    private zzfn() {
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final java.lang.Object convert(com.google.android.gms.common.api.Result result) {
        return ((com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult) result).getNodes();
    }
}
