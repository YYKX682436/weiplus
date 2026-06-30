package com.google.android.gms.auth.api.accounttransfer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzj extends com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zze<com.google.android.gms.auth.api.accounttransfer.DeviceMetaData> {
    private final /* synthetic */ com.google.android.gms.internal.auth.zzy zzbc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzj(com.google.android.gms.auth.api.accounttransfer.AccountTransferClient accountTransferClient, com.google.android.gms.internal.auth.zzy zzyVar) {
        super(null);
        this.zzbc = zzyVar;
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zze
    public final void zzd(com.google.android.gms.internal.auth.zzac zzacVar) {
        zzacVar.zzd(new com.google.android.gms.auth.api.accounttransfer.zzk(this, this), this.zzbc);
    }
}
