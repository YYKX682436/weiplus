package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final class zzhb extends com.google.android.gms.wearable.internal.zzgm<com.google.android.gms.wearable.DataApi.DataItemResult> {
    private final java.util.List<java.util.concurrent.FutureTask<java.lang.Boolean>> zzev;

    public zzhb(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.wearable.DataApi.DataItemResult> resultHolder, java.util.List<java.util.concurrent.FutureTask<java.lang.Boolean>> list) {
        super(resultHolder);
        this.zzev = list;
    }

    @Override // com.google.android.gms.wearable.internal.zza, com.google.android.gms.wearable.internal.zzek
    public final void zza(com.google.android.gms.wearable.internal.zzfu zzfuVar) {
        zza((com.google.android.gms.wearable.internal.zzhb) new com.google.android.gms.wearable.internal.zzcg(com.google.android.gms.wearable.internal.zzgd.zzb(zzfuVar.statusCode), zzfuVar.zzdy));
        if (zzfuVar.statusCode != 0) {
            java.util.Iterator<java.util.concurrent.FutureTask<java.lang.Boolean>> it = this.zzev.iterator();
            while (it.hasNext()) {
                it.next().cancel(true);
            }
        }
    }
}
