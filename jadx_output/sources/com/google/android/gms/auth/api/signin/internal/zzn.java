package com.google.android.gms.auth.api.signin.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzn extends com.google.android.gms.auth.api.signin.internal.zzp<com.google.android.gms.common.api.Status> {
    public zzn(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.auth.api.signin.internal.zzh zzhVar) {
        com.google.android.gms.auth.api.signin.internal.zzh zzhVar2 = zzhVar;
        ((com.google.android.gms.auth.api.signin.internal.zzv) zzhVar2.getService()).zzf(new com.google.android.gms.auth.api.signin.internal.zzo(this), zzhVar2.zzn());
    }
}
