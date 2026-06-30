package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class zziu implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzdz zzane;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzjx zzanl;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzii zzape;
    private final /* synthetic */ boolean zzaph;

    public zziu(com.google.android.gms.internal.measurement.zzii zziiVar, boolean z17, com.google.android.gms.internal.measurement.zzjx zzjxVar, com.google.android.gms.internal.measurement.zzdz zzdzVar) {
        this.zzape = zziiVar;
        this.zzaph = z17;
        this.zzanl = zzjxVar;
        this.zzane = zzdzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.measurement.zzey zzeyVar;
        zzeyVar = this.zzape.zzaoy;
        if (zzeyVar == null) {
            this.zzape.zzge().zzim().log("Discarding data. Failed to set user attribute");
        } else {
            this.zzape.zza(zzeyVar, this.zzaph ? null : this.zzanl, this.zzane);
            this.zzape.zzcu();
        }
    }
}
