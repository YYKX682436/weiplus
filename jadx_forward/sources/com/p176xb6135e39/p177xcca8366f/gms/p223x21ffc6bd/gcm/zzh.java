package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.gcm;

/* loaded from: classes13.dex */
final class zzh {

    /* renamed from: zzdf */
    private final java.util.concurrent.ConcurrentHashMap<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.gcm.zzi, java.util.List<java.lang.Throwable>> f6268x394bc2 = new java.util.concurrent.ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: zzdg */
    private final java.lang.ref.ReferenceQueue<java.lang.Throwable> f6269x394bc3 = new java.lang.ref.ReferenceQueue<>();

    public final java.util.List<java.lang.Throwable> zzd(java.lang.Throwable th6, boolean z17) {
        while (true) {
            java.lang.ref.Reference<? extends java.lang.Throwable> poll = this.f6269x394bc3.poll();
            if (poll == null) {
                break;
            }
            this.f6268x394bc2.remove(poll);
        }
        java.util.List<java.lang.Throwable> list = this.f6268x394bc2.get(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.gcm.zzi(th6, null));
        if (list != null) {
            return list;
        }
        java.util.Vector vector = new java.util.Vector(2);
        java.util.List<java.lang.Throwable> putIfAbsent = this.f6268x394bc2.putIfAbsent(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.gcm.zzi(th6, this.f6269x394bc3), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
