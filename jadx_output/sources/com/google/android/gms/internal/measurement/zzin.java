package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class zzin implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzie zzaow;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzii zzape;

    public zzin(com.google.android.gms.internal.measurement.zzii zziiVar, com.google.android.gms.internal.measurement.zzie zzieVar) {
        this.zzape = zziiVar;
        this.zzaow = zzieVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.measurement.zzey zzeyVar;
        long j17;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String packageName;
        zzeyVar = this.zzape.zzaoy;
        if (zzeyVar == null) {
            this.zzape.zzge().zzim().log("Failed to send current screen to service");
            return;
        }
        try {
            com.google.android.gms.internal.measurement.zzie zzieVar = this.zzaow;
            if (zzieVar == null) {
                j17 = 0;
                str = null;
                str2 = null;
                packageName = this.zzape.getContext().getPackageName();
            } else {
                j17 = zzieVar.zzaoj;
                str = zzieVar.zzul;
                str2 = zzieVar.zzaoi;
                packageName = this.zzape.getContext().getPackageName();
            }
            zzeyVar.zza(j17, str, str2, packageName);
            this.zzape.zzcu();
        } catch (android.os.RemoteException e17) {
            this.zzape.zzge().zzim().zzg("Failed to send current screen to the service", e17);
        }
    }
}
