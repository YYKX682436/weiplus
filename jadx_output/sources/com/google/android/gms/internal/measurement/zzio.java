package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class zzio extends com.google.android.gms.internal.measurement.zzem {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzii zzape;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzio(com.google.android.gms.internal.measurement.zzii zziiVar, com.google.android.gms.internal.measurement.zzhi zzhiVar) {
        super(zzhiVar);
        this.zzape = zziiVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzem
    public final void run() {
        this.zzape.zzge().zzip().log("Tasks have been queued for a long time");
    }
}
