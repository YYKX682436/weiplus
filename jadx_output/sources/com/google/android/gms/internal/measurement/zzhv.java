package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class zzhv implements java.lang.Runnable {
    private final /* synthetic */ java.util.concurrent.atomic.AtomicReference zzanv;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzhk zzanw;

    public zzhv(com.google.android.gms.internal.measurement.zzhk zzhkVar, java.util.concurrent.atomic.AtomicReference atomicReference) {
        this.zzanw = zzhkVar;
        this.zzanv = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzanv) {
            try {
                this.zzanv.set(this.zzanw.zzgg().zzhm());
            } finally {
                this.zzanv.notify();
            }
        }
    }
}
