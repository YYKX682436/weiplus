package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class zzhw implements java.lang.Runnable {
    private final /* synthetic */ java.util.concurrent.atomic.AtomicReference zzanv;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzhk zzanw;

    public zzhw(com.google.android.gms.internal.measurement.zzhk zzhkVar, java.util.concurrent.atomic.AtomicReference atomicReference) {
        this.zzanw = zzhkVar;
        this.zzanv = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzanv) {
            try {
                java.util.concurrent.atomic.AtomicReference atomicReference = this.zzanv;
                com.google.android.gms.internal.measurement.zzef zzgg = this.zzanw.zzgg();
                atomicReference.set(java.lang.Long.valueOf(zzgg.zza(zzgg.zzfv().zzah(), com.google.android.gms.internal.measurement.zzew.zzahr)));
            } finally {
                this.zzanv.notify();
            }
        }
    }
}
