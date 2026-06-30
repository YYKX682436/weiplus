package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class zzip implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzdz zzane;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzii zzape;

    public zzip(com.google.android.gms.internal.measurement.zzii zziiVar, com.google.android.gms.internal.measurement.zzdz zzdzVar) {
        this.zzape = zziiVar;
        this.zzane = zzdzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.measurement.zzey zzeyVar;
        zzeyVar = this.zzape.zzaoy;
        if (zzeyVar == null) {
            this.zzape.zzge().zzim().log("Failed to send measurementEnabled to service");
            return;
        }
        try {
            zzeyVar.zzb(this.zzane);
            this.zzape.zzcu();
        } catch (android.os.RemoteException e17) {
            this.zzape.zzge().zzim().zzg("Failed to send measurementEnabled to the service", e17);
        }
    }
}
