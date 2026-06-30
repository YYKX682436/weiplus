package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final class zzgu extends com.google.android.gms.wearable.internal.zzgm<com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult> {
    public zzgu(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult> resultHolder) {
        super(resultHolder);
    }

    @Override // com.google.android.gms.wearable.internal.zza, com.google.android.gms.wearable.internal.zzek
    public final void zza(com.google.android.gms.wearable.internal.zzea zzeaVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<com.google.android.gms.wearable.internal.zzfo> list = zzeaVar.zzdx;
        if (list != null) {
            arrayList.addAll(list);
        }
        zza((com.google.android.gms.wearable.internal.zzgu) new com.google.android.gms.wearable.internal.zzfj(com.google.android.gms.wearable.internal.zzgd.zzb(zzeaVar.statusCode), arrayList));
    }
}
