package com.google.android.gms.wearable.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzet<T> extends com.google.android.gms.wearable.internal.zzgm<com.google.android.gms.common.api.Status> {
    private java.lang.ref.WeakReference<java.util.Map<T, com.google.android.gms.wearable.internal.zzhk<T>>> zzec;
    private java.lang.ref.WeakReference<T> zzed;

    public zzet(java.util.Map<T, com.google.android.gms.wearable.internal.zzhk<T>> map, T t17, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder) {
        super(resultHolder);
        this.zzec = new java.lang.ref.WeakReference<>(map);
        this.zzed = new java.lang.ref.WeakReference<>(t17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.wearable.internal.zza, com.google.android.gms.wearable.internal.zzek
    public final void zza(com.google.android.gms.common.api.Status status) {
        java.util.Map<T, com.google.android.gms.wearable.internal.zzhk<T>> map = this.zzec.get();
        T t17 = this.zzed.get();
        if (status.getStatus().getStatusCode() == 4002 && map != null && t17 != null) {
            synchronized (map) {
                com.google.android.gms.wearable.internal.zzhk<T> remove = map.remove(t17);
                if (remove != null) {
                    remove.clear();
                }
            }
        }
        zza((com.google.android.gms.wearable.internal.zzet<T>) status);
    }
}
