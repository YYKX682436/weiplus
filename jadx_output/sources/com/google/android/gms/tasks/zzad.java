package com.google.android.gms.tasks;

/* loaded from: classes13.dex */
final class zzad<T> implements com.google.android.gms.tasks.zzae<T> {
    private final java.util.concurrent.CountDownLatch zza = new java.util.concurrent.CountDownLatch(1);

    private zzad() {
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        this.zza.countDown();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(java.lang.Exception exc) {
        this.zza.countDown();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(T t17) {
        this.zza.countDown();
    }

    public final void zza() {
        this.zza.await();
    }

    public final boolean zzb(long j17, java.util.concurrent.TimeUnit timeUnit) {
        return this.zza.await(j17, timeUnit);
    }

    public /* synthetic */ zzad(com.google.android.gms.tasks.zzac zzacVar) {
    }
}
