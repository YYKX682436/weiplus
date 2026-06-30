package com.google.android.gms.internal.auth;

/* loaded from: classes13.dex */
abstract class zzbm extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<com.google.android.gms.auth.api.proxy.ProxyApi.ProxyResult, com.google.android.gms.internal.auth.zzbh> {
    public zzbm(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(com.google.android.gms.auth.api.zzf.API, googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.internal.auth.zzbq(status);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public /* synthetic */ void doExecute(com.google.android.gms.internal.auth.zzbh zzbhVar) {
        com.google.android.gms.internal.auth.zzbh zzbhVar2 = zzbhVar;
        zzd(zzbhVar2.getContext(), (com.google.android.gms.internal.auth.zzbk) zzbhVar2.getService());
    }

    public abstract void zzd(android.content.Context context, com.google.android.gms.internal.auth.zzbk zzbkVar);
}
