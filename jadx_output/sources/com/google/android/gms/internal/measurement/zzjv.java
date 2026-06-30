package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class zzjv implements com.google.android.gms.internal.measurement.zzek {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzjr zzaqu;
    com.google.android.gms.internal.measurement.zzkq zzaqv;
    java.util.List<java.lang.Long> zzaqw;
    java.util.List<com.google.android.gms.internal.measurement.zzkn> zzaqx;
    private long zzaqy;

    private zzjv(com.google.android.gms.internal.measurement.zzjr zzjrVar) {
        this.zzaqu = zzjrVar;
    }

    private static long zza(com.google.android.gms.internal.measurement.zzkn zzknVar) {
        return ((zzknVar.zzatb.longValue() / 1000) / 60) / 60;
    }

    @Override // com.google.android.gms.internal.measurement.zzek
    public final void zzb(com.google.android.gms.internal.measurement.zzkq zzkqVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzkqVar);
        this.zzaqv = zzkqVar;
    }

    public /* synthetic */ zzjv(com.google.android.gms.internal.measurement.zzjr zzjrVar, com.google.android.gms.internal.measurement.zzjs zzjsVar) {
        this(zzjrVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzek
    public final boolean zza(long j17, com.google.android.gms.internal.measurement.zzkn zzknVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzknVar);
        if (this.zzaqx == null) {
            this.zzaqx = new java.util.ArrayList();
        }
        if (this.zzaqw == null) {
            this.zzaqw = new java.util.ArrayList();
        }
        if (this.zzaqx.size() > 0 && zza(this.zzaqx.get(0)) != zza(zzknVar)) {
            return false;
        }
        long zzvm = this.zzaqy + zzknVar.zzvm();
        if (zzvm >= java.lang.Math.max(0, com.google.android.gms.internal.measurement.zzew.zzagq.get().intValue())) {
            return false;
        }
        this.zzaqy = zzvm;
        this.zzaqx.add(zzknVar);
        this.zzaqw.add(java.lang.Long.valueOf(j17));
        return this.zzaqx.size() < java.lang.Math.max(1, com.google.android.gms.internal.measurement.zzew.zzagr.get().intValue());
    }
}
