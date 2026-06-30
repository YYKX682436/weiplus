package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class zzji extends com.google.android.gms.internal.measurement.zzem {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzjh zzapx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzji(com.google.android.gms.internal.measurement.zzjh zzjhVar, com.google.android.gms.internal.measurement.zzhi zzhiVar) {
        super(zzhiVar);
        this.zzapx = zzjhVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzem
    public final void run() {
        com.google.android.gms.internal.measurement.zzjh zzjhVar = this.zzapx;
        zzjhVar.zzab();
        zzjhVar.zzge().zzit().zzg("Session started, time", java.lang.Long.valueOf(zzjhVar.zzbt().elapsedRealtime()));
        zzjhVar.zzgf().zzakk.set(false);
        zzjhVar.zzfu().zza("auto", "_s", new android.os.Bundle());
        zzjhVar.zzgf().zzakl.set(zzjhVar.zzbt().currentTimeMillis());
    }
}
