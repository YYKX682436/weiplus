package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class zzit implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzdz zzane;
    private final /* synthetic */ java.lang.String zzanh;
    private final /* synthetic */ java.lang.String zzani;
    private final /* synthetic */ java.lang.String zzanj;
    private final /* synthetic */ boolean zzanz;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzii zzape;
    private final /* synthetic */ java.util.concurrent.atomic.AtomicReference zzapf;

    public zzit(com.google.android.gms.internal.measurement.zzii zziiVar, java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, com.google.android.gms.internal.measurement.zzdz zzdzVar) {
        this.zzape = zziiVar;
        this.zzapf = atomicReference;
        this.zzanj = str;
        this.zzanh = str2;
        this.zzani = str3;
        this.zzanz = z17;
        this.zzane = zzdzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.atomic.AtomicReference atomicReference;
        com.google.android.gms.internal.measurement.zzey zzeyVar;
        java.util.concurrent.atomic.AtomicReference atomicReference2;
        java.util.List<com.google.android.gms.internal.measurement.zzjx> zza;
        synchronized (this.zzapf) {
            try {
                try {
                    zzeyVar = this.zzape.zzaoy;
                } catch (android.os.RemoteException e17) {
                    this.zzape.zzge().zzim().zzd("Failed to get user properties", com.google.android.gms.internal.measurement.zzfg.zzbm(this.zzanj), this.zzanh, e17);
                    this.zzapf.set(java.util.Collections.emptyList());
                    atomicReference = this.zzapf;
                }
                if (zzeyVar == null) {
                    this.zzape.zzge().zzim().zzd("Failed to get user properties", com.google.android.gms.internal.measurement.zzfg.zzbm(this.zzanj), this.zzanh, this.zzani);
                    this.zzapf.set(java.util.Collections.emptyList());
                    return;
                }
                if (android.text.TextUtils.isEmpty(this.zzanj)) {
                    atomicReference2 = this.zzapf;
                    zza = zzeyVar.zza(this.zzanh, this.zzani, this.zzanz, this.zzane);
                } else {
                    atomicReference2 = this.zzapf;
                    zza = zzeyVar.zza(this.zzanj, this.zzanh, this.zzani, this.zzanz);
                }
                atomicReference2.set(zza);
                this.zzape.zzcu();
                atomicReference = this.zzapf;
                atomicReference.notify();
            } finally {
                this.zzapf.notify();
            }
        }
    }
}
