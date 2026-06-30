package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final class zzgr extends com.google.android.gms.wearable.internal.zzgm<com.google.android.gms.wearable.CapabilityApi.GetCapabilityResult> {
    public zzgr(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.wearable.CapabilityApi.GetCapabilityResult> resultHolder) {
        super(resultHolder);
    }

    @Override // com.google.android.gms.wearable.internal.zza, com.google.android.gms.wearable.internal.zzek
    public final void zza(com.google.android.gms.wearable.internal.zzdk zzdkVar) {
        com.google.android.gms.common.api.Status zzb = com.google.android.gms.wearable.internal.zzgd.zzb(zzdkVar.statusCode);
        com.google.android.gms.wearable.internal.zzah zzahVar = zzdkVar.zzdq;
        zza((com.google.android.gms.wearable.internal.zzgr) new com.google.android.gms.wearable.internal.zzy(zzb, zzahVar == null ? null : new com.google.android.gms.wearable.internal.zzw(zzahVar)));
    }
}
