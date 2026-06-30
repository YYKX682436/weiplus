package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final class zzgt extends com.google.android.gms.wearable.internal.zzgm<com.google.android.gms.wearable.Channel.GetOutputStreamResult> {
    private final com.google.android.gms.wearable.internal.zzbr zzeu;

    public zzgt(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.wearable.Channel.GetOutputStreamResult> resultHolder, com.google.android.gms.wearable.internal.zzbr zzbrVar) {
        super(resultHolder);
        this.zzeu = (com.google.android.gms.wearable.internal.zzbr) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzbrVar);
    }

    @Override // com.google.android.gms.wearable.internal.zza, com.google.android.gms.wearable.internal.zzek
    public final void zza(com.google.android.gms.wearable.internal.zzdo zzdoVar) {
        com.google.android.gms.wearable.internal.zzbl zzblVar;
        if (zzdoVar.zzdr != null) {
            zzblVar = new com.google.android.gms.wearable.internal.zzbl(new android.os.ParcelFileDescriptor.AutoCloseOutputStream(zzdoVar.zzdr));
            this.zzeu.zza(new com.google.android.gms.wearable.internal.zzbm(zzblVar));
        } else {
            zzblVar = null;
        }
        zza((com.google.android.gms.wearable.internal.zzgt) new com.google.android.gms.wearable.internal.zzbh(new com.google.android.gms.common.api.Status(zzdoVar.statusCode), zzblVar));
    }
}
