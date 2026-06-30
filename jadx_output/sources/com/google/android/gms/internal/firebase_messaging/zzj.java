package com.google.android.gms.internal.firebase_messaging;

/* loaded from: classes13.dex */
final class zzj {
    private final java.util.concurrent.ConcurrentHashMap<com.google.android.gms.internal.firebase_messaging.zzk, java.util.List<java.lang.Throwable>> zzh = new java.util.concurrent.ConcurrentHashMap<>(16, 0.75f, 10);
    private final java.lang.ref.ReferenceQueue<java.lang.Throwable> zzi = new java.lang.ref.ReferenceQueue<>();

    public final java.util.List<java.lang.Throwable> zza(java.lang.Throwable th6, boolean z17) {
        while (true) {
            java.lang.ref.Reference<? extends java.lang.Throwable> poll = this.zzi.poll();
            if (poll == null) {
                break;
            }
            this.zzh.remove(poll);
        }
        java.util.List<java.lang.Throwable> list = this.zzh.get(new com.google.android.gms.internal.firebase_messaging.zzk(th6, null));
        if (list != null) {
            return list;
        }
        java.util.Vector vector = new java.util.Vector(2);
        java.util.List<java.lang.Throwable> putIfAbsent = this.zzh.putIfAbsent(new com.google.android.gms.internal.firebase_messaging.zzk(th6, this.zzi), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
