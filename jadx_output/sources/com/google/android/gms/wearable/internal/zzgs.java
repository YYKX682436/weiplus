package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final class zzgs extends com.google.android.gms.wearable.internal.zzgm<com.google.android.gms.wearable.Channel.GetInputStreamResult> {
    private final com.google.android.gms.wearable.internal.zzbr zzeu;

    public zzgs(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.wearable.Channel.GetInputStreamResult> resultHolder, com.google.android.gms.wearable.internal.zzbr zzbrVar) {
        super(resultHolder);
        this.zzeu = (com.google.android.gms.wearable.internal.zzbr) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzbrVar);
    }

    @Override // com.google.android.gms.wearable.internal.zza, com.google.android.gms.wearable.internal.zzek
    public final void zza(com.google.android.gms.wearable.internal.zzdm zzdmVar) {
        com.google.android.gms.wearable.internal.zzbj zzbjVar;
        if (zzdmVar.zzdr != null) {
            zzbjVar = new com.google.android.gms.wearable.internal.zzbj(new android.os.ParcelFileDescriptor.AutoCloseInputStream(zzdmVar.zzdr));
            this.zzeu.zza(new com.google.android.gms.wearable.internal.zzbk(zzbjVar));
        } else {
            zzbjVar = null;
        }
        zza((com.google.android.gms.wearable.internal.zzgs) new com.google.android.gms.wearable.internal.zzbg(new com.google.android.gms.common.api.Status(zzdmVar.statusCode), zzbjVar));
    }
}
