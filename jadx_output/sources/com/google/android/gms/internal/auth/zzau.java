package com.google.android.gms.internal.auth;

/* loaded from: classes13.dex */
final class zzau extends com.google.android.gms.internal.auth.zzam {
    private com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> zzdu;

    public zzau(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder) {
        this.zzdu = resultHolder;
    }

    @Override // com.google.android.gms.internal.auth.zzam, com.google.android.gms.internal.auth.zzba
    public final void zze(com.google.android.gms.common.api.Status status) {
        this.zzdu.setResult(status);
    }
}
