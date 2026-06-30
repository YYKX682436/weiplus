package com.google.android.gms.internal.auth;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzl extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<com.google.android.gms.common.api.Result, com.google.android.gms.internal.auth.zzu> {
    private final /* synthetic */ boolean zzag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzl(com.google.android.gms.internal.auth.zzk zzkVar, com.google.android.gms.common.api.Api api, com.google.android.gms.common.api.GoogleApiClient googleApiClient, boolean z17) {
        super((com.google.android.gms.common.api.Api<?>) api, googleApiClient);
        this.zzag = z17;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.internal.auth.zzs(status);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.internal.auth.zzu zzuVar) {
        ((com.google.android.gms.auth.account.zzf) zzuVar.getService()).zze(this.zzag);
        setResult((com.google.android.gms.internal.auth.zzl) new com.google.android.gms.internal.auth.zzs(com.google.android.gms.common.api.Status.RESULT_SUCCESS));
    }
}
