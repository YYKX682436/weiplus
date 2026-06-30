package com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e;

/* renamed from: com.google.android.gms.tasks.zzad */
/* loaded from: classes13.dex */
final class C2446x394b63<T> implements com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2447x394b64<T> {
    private final java.util.concurrent.CountDownLatch zza = new java.util.concurrent.CountDownLatch(1);

    private C2446x394b63() {
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2432x2aa8748c
    /* renamed from: onCanceled */
    public final void mo19574x9dc2a798() {
        this.zza.countDown();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2434xb321c05f
    /* renamed from: onFailure */
    public final void mo19575xee232ab(java.lang.Exception exc) {
        this.zza.countDown();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2435xce0545d8
    /* renamed from: onSuccess */
    public final void mo19576xe05b4124(T t17) {
        this.zza.countDown();
    }

    public final void zza() {
        this.zza.await();
    }

    public final boolean zzb(long j17, java.util.concurrent.TimeUnit timeUnit) {
        return this.zza.await(j17, timeUnit);
    }

    public /* synthetic */ C2446x394b63(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2445x394b62 c2445x394b62) {
    }
}
