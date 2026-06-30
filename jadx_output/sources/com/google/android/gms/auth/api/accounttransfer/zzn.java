package com.google.android.gms.auth.api.accounttransfer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzn extends com.google.android.gms.internal.auth.zzv {
    private final /* synthetic */ com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zzf zzbj;

    public zzn(com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zzf zzfVar) {
        this.zzbj = zzfVar;
    }

    @Override // com.google.android.gms.internal.auth.zzv, com.google.android.gms.internal.auth.zzaa
    public final void onFailure(com.google.android.gms.common.api.Status status) {
        this.zzbj.zzd(status);
    }

    @Override // com.google.android.gms.internal.auth.zzv, com.google.android.gms.internal.auth.zzaa
    public final void zzi() {
        this.zzbj.setResult(null);
    }
}
