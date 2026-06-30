package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final class zzgq extends com.google.android.gms.wearable.internal.zzgm<com.google.android.gms.wearable.CapabilityApi.GetAllCapabilitiesResult> {
    public zzgq(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.wearable.CapabilityApi.GetAllCapabilitiesResult> resultHolder) {
        super(resultHolder);
    }

    @Override // com.google.android.gms.wearable.internal.zza, com.google.android.gms.wearable.internal.zzek
    public final void zza(com.google.android.gms.wearable.internal.zzdi zzdiVar) {
        java.util.Map zza;
        com.google.android.gms.common.api.Status zzb = com.google.android.gms.wearable.internal.zzgd.zzb(zzdiVar.statusCode);
        zza = com.google.android.gms.wearable.internal.zzgk.zza(zzdiVar.zzdp);
        zza((com.google.android.gms.wearable.internal.zzgq) new com.google.android.gms.wearable.internal.zzx(zzb, zza));
    }
}
