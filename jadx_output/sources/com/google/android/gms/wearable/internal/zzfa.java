package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final /* synthetic */ class zzfa implements com.google.android.gms.common.internal.PendingResultUtil.ResultConverter {
    static final com.google.android.gms.common.internal.PendingResultUtil.ResultConverter zzbx = new com.google.android.gms.wearable.internal.zzfa();

    private zzfa() {
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final java.lang.Object convert(com.google.android.gms.common.api.Result result) {
        return java.lang.Integer.valueOf(((com.google.android.gms.wearable.MessageApi.SendMessageResult) result).getRequestId());
    }
}
