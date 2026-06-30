package com.google.android.gms.wearable.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzev extends com.google.android.gms.wearable.internal.zzn<com.google.android.gms.wearable.MessageApi.SendMessageResult> {
    private final /* synthetic */ java.lang.String val$action;
    private final /* synthetic */ java.lang.String zzcb;
    private final /* synthetic */ byte[] zzee;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzev(com.google.android.gms.wearable.internal.zzeu zzeuVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str, java.lang.String str2, byte[] bArr) {
        super(googleApiClient);
        this.zzcb = str;
        this.val$action = str2;
        this.zzee = bArr;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.wearable.internal.zzey(status, -1);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.wearable.internal.zzhg zzhgVar) {
        ((com.google.android.gms.wearable.internal.zzep) zzhgVar.getService()).zza(new com.google.android.gms.wearable.internal.zzhe(this), this.zzcb, this.val$action, this.zzee);
    }
}
