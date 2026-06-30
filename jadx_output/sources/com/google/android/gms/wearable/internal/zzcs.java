package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final /* synthetic */ class zzcs implements com.google.android.gms.common.internal.PendingResultUtil.ResultConverter {
    static final com.google.android.gms.common.internal.PendingResultUtil.ResultConverter zzbx = new com.google.android.gms.wearable.internal.zzcs();

    private zzcs() {
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final java.lang.Object convert(com.google.android.gms.common.api.Result result) {
        return new com.google.android.gms.wearable.internal.zzcu((com.google.android.gms.wearable.DataApi.GetFdForAssetResult) result);
    }
}
