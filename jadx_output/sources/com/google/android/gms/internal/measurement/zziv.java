package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class zziv implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzdz zzane;
    private final /* synthetic */ boolean zzanz;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzii zzape;
    private final /* synthetic */ java.util.concurrent.atomic.AtomicReference zzapf;

    public zziv(com.google.android.gms.internal.measurement.zzii zziiVar, java.util.concurrent.atomic.AtomicReference atomicReference, com.google.android.gms.internal.measurement.zzdz zzdzVar, boolean z17) {
        this.zzape = zziiVar;
        this.zzapf = atomicReference;
        this.zzane = zzdzVar;
        this.zzanz = z17;
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
                    this.zzape.zzge().zzim().zzg("Failed to get user properties", e17);
                    atomicReference = this.zzapf;
                }
                if (zzeyVar == null) {
                    this.zzape.zzge().zzim().log("Failed to get user properties");
                    return;
                }
                this.zzapf.set(zzeyVar.zza(this.zzane, this.zzanz));
                this.zzape.zzcu();
                atomicReference = this.zzapf;
                atomicReference.notify();
            } finally {
                this.zzapf.notify();
            }
        }
    }
}
