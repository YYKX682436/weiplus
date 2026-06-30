package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p229xa95286cc;

/* loaded from: classes13.dex */
final class zzj {
    private final java.util.concurrent.ConcurrentHashMap<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p229xa95286cc.zzk, java.util.List<java.lang.Throwable>> zzh = new java.util.concurrent.ConcurrentHashMap<>(16, 0.75f, 10);
    private final java.lang.ref.ReferenceQueue<java.lang.Throwable> zzi = new java.lang.ref.ReferenceQueue<>();

    public final java.util.List<java.lang.Throwable> zza(java.lang.Throwable th6, boolean z17) {
        while (true) {
            java.lang.ref.Reference<? extends java.lang.Throwable> poll = this.zzi.poll();
            if (poll == null) {
                break;
            }
            this.zzh.remove(poll);
        }
        java.util.List<java.lang.Throwable> list = this.zzh.get(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p229xa95286cc.zzk(th6, null));
        if (list != null) {
            return list;
        }
        java.util.Vector vector = new java.util.Vector(2);
        java.util.List<java.lang.Throwable> putIfAbsent = this.zzh.putIfAbsent(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p229xa95286cc.zzk(th6, this.zzi), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
