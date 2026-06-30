package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class zzil implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzdz zzane;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzii zzape;
    private final /* synthetic */ java.util.concurrent.atomic.AtomicReference zzapf;

    public zzil(com.google.android.gms.internal.measurement.zzii zziiVar, java.util.concurrent.atomic.AtomicReference atomicReference, com.google.android.gms.internal.measurement.zzdz zzdzVar) {
        this.zzape = zziiVar;
        this.zzapf = atomicReference;
        this.zzane = zzdzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.atomic.AtomicReference atomicReference;
        com.google.android.gms.internal.measurement.zzey zzeyVar;
        synchronized (this.zzapf) {
            try {
                try {
                    zzeyVar = this.zzape.zzaoy;
                } catch (android.os.RemoteException e17) {
                    this.zzape.zzge().zzim().zzg("Failed to get app instance id", e17);
                    atomicReference = this.zzapf;
                }
                if (zzeyVar == null) {
                    this.zzape.zzge().zzim().log("Failed to get app instance id");
                    return;
                }
                this.zzapf.set(zzeyVar.zzc(this.zzane));
                java.lang.String str = (java.lang.String) this.zzapf.get();
                if (str != null) {
                    this.zzape.zzfu().zzbr(str);
                    this.zzape.zzgf().zzakb.zzbs(str);
                }
                this.zzape.zzcu();
                atomicReference = this.zzapf;
                atomicReference.notify();
            } finally {
                this.zzapf.notify();
            }
        }
    }
}
