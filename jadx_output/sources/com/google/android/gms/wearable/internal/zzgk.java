package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final class zzgk {
    /* JADX INFO: Access modifiers changed from: private */
    public static java.util.Map<java.lang.String, com.google.android.gms.wearable.CapabilityInfo> zza(java.util.List<com.google.android.gms.wearable.internal.zzah> list) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (list != null) {
            for (com.google.android.gms.wearable.internal.zzah zzahVar : list) {
                hashMap.put(zzahVar.getName(), new com.google.android.gms.wearable.internal.zzw(zzahVar));
            }
        }
        return hashMap;
    }
}
