package com.google.android.gms.internal.measurement;

/* loaded from: classes13.dex */
final class zzzw<K> implements java.util.Map.Entry<K, java.lang.Object> {
    private java.util.Map.Entry<K, com.google.android.gms.internal.measurement.zzzu> zzbsu;

    private zzzw(java.util.Map.Entry<K, com.google.android.gms.internal.measurement.zzzu> entry) {
        this.zzbsu = entry;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.zzbsu.getKey();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        if (this.zzbsu.getValue() == null) {
            return null;
        }
        return com.google.android.gms.internal.measurement.zzzu.zzto();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.measurement.zzaal) {
            return this.zzbsu.getValue().zzc((com.google.android.gms.internal.measurement.zzaal) obj);
        }
        throw new java.lang.IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
