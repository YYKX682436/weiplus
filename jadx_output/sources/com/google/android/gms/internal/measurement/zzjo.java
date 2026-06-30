package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class zzjo extends com.google.android.gms.internal.measurement.zzem {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzjr zzapt;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzjn zzapz;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjo(com.google.android.gms.internal.measurement.zzjn zzjnVar, com.google.android.gms.internal.measurement.zzhi zzhiVar, com.google.android.gms.internal.measurement.zzjr zzjrVar) {
        super(zzhiVar);
        this.zzapz = zzjnVar;
        this.zzapt = zzjrVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzem
    public final void run() {
        this.zzapz.cancel();
        this.zzapz.zzge().zzit().log("Starting upload from DelayedRunnable");
        this.zzapt.zzks();
    }
}
