package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class zziq implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzdz zzane;
    private final /* synthetic */ java.lang.String zzanj;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzeu zzank;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzii zzape;
    private final /* synthetic */ boolean zzapg = true;
    private final /* synthetic */ boolean zzaph;

    public zziq(com.google.android.gms.internal.measurement.zzii zziiVar, boolean z17, boolean z18, com.google.android.gms.internal.measurement.zzeu zzeuVar, com.google.android.gms.internal.measurement.zzdz zzdzVar, java.lang.String str) {
        this.zzape = zziiVar;
        this.zzaph = z18;
        this.zzank = zzeuVar;
        this.zzane = zzdzVar;
        this.zzanj = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.measurement.zzey zzeyVar;
        zzeyVar = this.zzape.zzaoy;
        if (zzeyVar == null) {
            this.zzape.zzge().zzim().log("Discarding data. Failed to send event to service");
            return;
        }
        if (this.zzapg) {
            this.zzape.zza(zzeyVar, this.zzaph ? null : this.zzank, this.zzane);
        } else {
            try {
                if (android.text.TextUtils.isEmpty(this.zzanj)) {
                    zzeyVar.zza(this.zzank, this.zzane);
                } else {
                    zzeyVar.zza(this.zzank, this.zzanj, this.zzape.zzge().zziv());
                }
            } catch (android.os.RemoteException e17) {
                this.zzape.zzge().zzim().zzg("Failed to send event to the service", e17);
            }
        }
        this.zzape.zzcu();
    }
}
