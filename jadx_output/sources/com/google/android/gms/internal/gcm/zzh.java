package com.google.android.gms.internal.gcm;

/* loaded from: classes13.dex */
final class zzh {
    private final java.util.concurrent.ConcurrentHashMap<com.google.android.gms.internal.gcm.zzi, java.util.List<java.lang.Throwable>> zzdf = new java.util.concurrent.ConcurrentHashMap<>(16, 0.75f, 10);
    private final java.lang.ref.ReferenceQueue<java.lang.Throwable> zzdg = new java.lang.ref.ReferenceQueue<>();

    public final java.util.List<java.lang.Throwable> zzd(java.lang.Throwable th6, boolean z17) {
        while (true) {
            java.lang.ref.Reference<? extends java.lang.Throwable> poll = this.zzdg.poll();
            if (poll == null) {
                break;
            }
            this.zzdf.remove(poll);
        }
        java.util.List<java.lang.Throwable> list = this.zzdf.get(new com.google.android.gms.internal.gcm.zzi(th6, null));
        if (list != null) {
            return list;
        }
        java.util.Vector vector = new java.util.Vector(2);
        java.util.List<java.lang.Throwable> putIfAbsent = this.zzdf.putIfAbsent(new com.google.android.gms.internal.gcm.zzi(th6, this.zzdg), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
