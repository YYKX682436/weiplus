package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class zzju implements java.util.concurrent.Callable<java.lang.String> {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzdz zzane;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzjr zzaqu;

    public zzju(com.google.android.gms.internal.measurement.zzjr zzjrVar, com.google.android.gms.internal.measurement.zzdz zzdzVar) {
        this.zzaqu = zzjrVar;
        this.zzane = zzdzVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ java.lang.String call() {
        com.google.android.gms.internal.measurement.zzdy zzg = this.zzaqu.zzgg().zzaz(this.zzane.packageName) ? this.zzaqu.zzg(this.zzane) : this.zzaqu.zzix().zzbc(this.zzane.packageName);
        if (zzg != null) {
            return zzg.getAppInstanceId();
        }
        this.zzaqu.zzge().zzip().log("App info was null when attempting to get app instance id");
        return null;
    }
}
