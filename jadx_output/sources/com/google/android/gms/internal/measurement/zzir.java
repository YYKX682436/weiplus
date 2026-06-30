package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class zzir implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzdz zzane;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzii zzape;
    private final /* synthetic */ boolean zzapg = true;
    private final /* synthetic */ boolean zzaph;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzed zzapi;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzed zzapj;

    public zzir(com.google.android.gms.internal.measurement.zzii zziiVar, boolean z17, boolean z18, com.google.android.gms.internal.measurement.zzed zzedVar, com.google.android.gms.internal.measurement.zzdz zzdzVar, com.google.android.gms.internal.measurement.zzed zzedVar2) {
        this.zzape = zziiVar;
        this.zzaph = z18;
        this.zzapi = zzedVar;
        this.zzane = zzdzVar;
        this.zzapj = zzedVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.measurement.zzey zzeyVar;
        zzeyVar = this.zzape.zzaoy;
        if (zzeyVar == null) {
            this.zzape.zzge().zzim().log("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.zzapg) {
            this.zzape.zza(zzeyVar, this.zzaph ? null : this.zzapi, this.zzane);
        } else {
            try {
                if (android.text.TextUtils.isEmpty(this.zzapj.packageName)) {
                    zzeyVar.zza(this.zzapi, this.zzane);
                } else {
                    zzeyVar.zzb(this.zzapi);
                }
            } catch (android.os.RemoteException e17) {
                this.zzape.zzge().zzim().zzg("Failed to send conditional user property to the service", e17);
            }
        }
        this.zzape.zzcu();
    }
}
