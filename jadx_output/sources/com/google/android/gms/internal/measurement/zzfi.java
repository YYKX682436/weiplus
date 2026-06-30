package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzfi {
    private final int priority;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzfg zzajc;
    private final boolean zzajd;
    private final boolean zzaje;

    public zzfi(com.google.android.gms.internal.measurement.zzfg zzfgVar, int i17, boolean z17, boolean z18) {
        this.zzajc = zzfgVar;
        this.priority = i17;
        this.zzajd = z17;
        this.zzaje = z18;
    }

    public final void log(java.lang.String str) {
        this.zzajc.zza(this.priority, this.zzajd, this.zzaje, str, null, null, null);
    }

    public final void zzd(java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        this.zzajc.zza(this.priority, this.zzajd, this.zzaje, str, obj, obj2, obj3);
    }

    public final void zze(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        this.zzajc.zza(this.priority, this.zzajd, this.zzaje, str, obj, obj2, null);
    }

    public final void zzg(java.lang.String str, java.lang.Object obj) {
        this.zzajc.zza(this.priority, this.zzajd, this.zzaje, str, obj, null, null);
    }
}
