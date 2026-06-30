package com.google.android.gms.auth.api.accounttransfer;

/* loaded from: classes13.dex */
final class zzk extends com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zzd<com.google.android.gms.auth.api.accounttransfer.DeviceMetaData> {
    private final /* synthetic */ com.google.android.gms.auth.api.accounttransfer.zzj zzbd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzk(com.google.android.gms.auth.api.accounttransfer.zzj zzjVar, com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zze zzeVar) {
        super(zzeVar);
        this.zzbd = zzjVar;
    }

    @Override // com.google.android.gms.internal.auth.zzv, com.google.android.gms.internal.auth.zzaa
    public final void zzd(com.google.android.gms.auth.api.accounttransfer.DeviceMetaData deviceMetaData) {
        this.zzbd.setResult(deviceMetaData);
    }
}
