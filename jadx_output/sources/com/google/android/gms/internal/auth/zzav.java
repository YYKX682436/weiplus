package com.google.android.gms.internal.auth;

/* loaded from: classes13.dex */
abstract class zzav<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<R, com.google.android.gms.internal.auth.zzax> {
    public zzav(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(com.google.android.gms.auth.api.Auth.CREDENTIALS_API, googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public /* synthetic */ void doExecute(com.google.android.gms.internal.auth.zzax zzaxVar) {
        com.google.android.gms.internal.auth.zzax zzaxVar2 = zzaxVar;
        zzd(zzaxVar2.getContext(), (com.google.android.gms.internal.auth.zzbc) zzaxVar2.getService());
    }

    public abstract void zzd(android.content.Context context, com.google.android.gms.internal.auth.zzbc zzbcVar);
}
