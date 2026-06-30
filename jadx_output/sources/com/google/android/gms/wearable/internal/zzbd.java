package com.google.android.gms.wearable.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzbd extends com.google.android.gms.wearable.internal.zzn<com.google.android.gms.common.api.Status> {
    private final /* synthetic */ com.google.android.gms.wearable.internal.zzay zzcm;
    private final /* synthetic */ android.net.Uri zzco;
    private final /* synthetic */ boolean zzcp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbd(com.google.android.gms.wearable.internal.zzay zzayVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.net.Uri uri, boolean z17) {
        super(googleApiClient);
        this.zzcm = zzayVar;
        this.zzco = uri;
        this.zzcp = z17;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.wearable.internal.zzhg zzhgVar) {
        java.lang.String str;
        str = this.zzcm.zzce;
        zzhgVar.zza(this, str, this.zzco, this.zzcp);
    }
}
