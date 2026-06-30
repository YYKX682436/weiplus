package com.google.android.gms.common.internal;

/* loaded from: classes13.dex */
final class zaq implements com.google.android.gms.common.internal.PendingResultUtil.ResultConverter {
    final /* synthetic */ com.google.android.gms.common.api.Response zaa;

    public zaq(com.google.android.gms.common.api.Response response) {
        this.zaa = response;
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final /* bridge */ /* synthetic */ java.lang.Object convert(com.google.android.gms.common.api.Result result) {
        this.zaa.setResult(result);
        return this.zaa;
    }
}
