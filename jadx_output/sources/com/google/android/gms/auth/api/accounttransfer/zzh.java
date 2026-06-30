package com.google.android.gms.auth.api.accounttransfer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzh extends com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zze<byte[]> {
    private final /* synthetic */ com.google.android.gms.internal.auth.zzag zzba;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzh(com.google.android.gms.auth.api.accounttransfer.AccountTransferClient accountTransferClient, com.google.android.gms.internal.auth.zzag zzagVar) {
        super(null);
        this.zzba = zzagVar;
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zze
    public final void zzd(com.google.android.gms.internal.auth.zzac zzacVar) {
        zzacVar.zzd(new com.google.android.gms.auth.api.accounttransfer.zzi(this, this), this.zzba);
    }
}
