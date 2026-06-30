package com.google.android.gms.internal.measurement;

/* loaded from: classes13.dex */
final class zzxf {
    private final java.util.concurrent.ConcurrentHashMap<com.google.android.gms.internal.measurement.zzxg, java.util.List<java.lang.Throwable>> zzboa = new java.util.concurrent.ConcurrentHashMap<>(16, 0.75f, 10);
    private final java.lang.ref.ReferenceQueue<java.lang.Throwable> zzbob = new java.lang.ref.ReferenceQueue<>();

    public final java.util.List<java.lang.Throwable> zza(java.lang.Throwable th6, boolean z17) {
        while (true) {
            java.lang.ref.Reference<? extends java.lang.Throwable> poll = this.zzbob.poll();
            if (poll == null) {
                return this.zzboa.get(new com.google.android.gms.internal.measurement.zzxg(th6, null));
            }
            this.zzboa.remove(poll);
        }
    }
}
