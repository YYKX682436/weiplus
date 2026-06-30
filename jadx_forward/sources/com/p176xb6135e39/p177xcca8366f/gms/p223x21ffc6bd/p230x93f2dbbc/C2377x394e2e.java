package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzxf */
/* loaded from: classes13.dex */
final class C2377x394e2e {

    /* renamed from: zzboa */
    private final java.util.concurrent.ConcurrentHashMap<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2378x394e2f, java.util.List<java.lang.Throwable>> f7200x6f02674 = new java.util.concurrent.ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: zzbob */
    private final java.lang.ref.ReferenceQueue<java.lang.Throwable> f7201x6f02675 = new java.lang.ref.ReferenceQueue<>();

    public final java.util.List<java.lang.Throwable> zza(java.lang.Throwable th6, boolean z17) {
        while (true) {
            java.lang.ref.Reference<? extends java.lang.Throwable> poll = this.f7201x6f02675.poll();
            if (poll == null) {
                return this.f7200x6f02674.get(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2378x394e2f(th6, null));
            }
            this.f7200x6f02674.remove(poll);
        }
    }
}
