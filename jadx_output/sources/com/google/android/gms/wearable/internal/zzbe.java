package com.google.android.gms.wearable.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzbe extends com.google.android.gms.wearable.internal.zzn<com.google.android.gms.common.api.Status> {
    private final /* synthetic */ com.google.android.gms.wearable.internal.zzay zzcm;
    private final /* synthetic */ android.net.Uri zzco;
    private final /* synthetic */ long zzcq;
    private final /* synthetic */ long zzcr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbe(com.google.android.gms.wearable.internal.zzay zzayVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.net.Uri uri, long j17, long j18) {
        super(googleApiClient);
        this.zzcm = zzayVar;
        this.zzco = uri;
        this.zzcq = j17;
        this.zzcr = j18;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.wearable.internal.zzhg zzhgVar) {
        java.lang.String str;
        str = this.zzcm.zzce;
        zzhgVar.zza(this, str, this.zzco, this.zzcq, this.zzcr);
    }
}
