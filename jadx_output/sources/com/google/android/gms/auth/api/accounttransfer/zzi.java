package com.google.android.gms.auth.api.accounttransfer;

/* loaded from: classes13.dex */
final class zzi extends com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zzd<byte[]> {
    private final /* synthetic */ com.google.android.gms.auth.api.accounttransfer.zzh zzbb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzi(com.google.android.gms.auth.api.accounttransfer.zzh zzhVar, com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zze zzeVar) {
        super(zzeVar);
        this.zzbb = zzhVar;
    }

    @Override // com.google.android.gms.internal.auth.zzv, com.google.android.gms.internal.auth.zzaa
    public final void zzd(byte[] bArr) {
        this.zzbb.setResult(bArr);
    }
}
