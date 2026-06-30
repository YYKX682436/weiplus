package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public abstract class zzaby<M extends com.google.android.gms.internal.measurement.zzaby<M>> extends com.google.android.gms.internal.measurement.zzace {
    protected com.google.android.gms.internal.measurement.zzaca zzbww;

    @Override // com.google.android.gms.internal.measurement.zzace
    public /* synthetic */ java.lang.Object clone() {
        com.google.android.gms.internal.measurement.zzaby zzabyVar = (com.google.android.gms.internal.measurement.zzaby) super.clone();
        com.google.android.gms.internal.measurement.zzacc.zza(this, zzabyVar);
        return zzabyVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzace
    public int zza() {
        if (this.zzbww == null) {
            return 0;
        }
        int i17 = 0;
        for (int i18 = 0; i18 < this.zzbww.size(); i18++) {
            i17 += this.zzbww.zzau(i18).zza();
        }
        return i17;
    }

    @Override // com.google.android.gms.internal.measurement.zzace
    /* renamed from: zzvf */
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzace clone() {
        return (com.google.android.gms.internal.measurement.zzaby) clone();
    }

    public final <T> T zza(com.google.android.gms.internal.measurement.zzabz<M, T> zzabzVar) {
        com.google.android.gms.internal.measurement.zzacb zzat;
        com.google.android.gms.internal.measurement.zzaca zzacaVar = this.zzbww;
        if (zzacaVar == null || (zzat = zzacaVar.zzat(zzabzVar.tag >>> 3)) == null) {
            return null;
        }
        return (T) zzat.zzb(zzabzVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzace
    public void zza(com.google.android.gms.internal.measurement.zzabw zzabwVar) {
        if (this.zzbww == null) {
            return;
        }
        for (int i17 = 0; i17 < this.zzbww.size(); i17++) {
            this.zzbww.zzau(i17).zza(zzabwVar);
        }
    }

    public final boolean zza(com.google.android.gms.internal.measurement.zzabv zzabvVar, int i17) {
        com.google.android.gms.internal.measurement.zzacb zzat;
        int position = zzabvVar.getPosition();
        if (!zzabvVar.zzak(i17)) {
            return false;
        }
        int i18 = i17 >>> 3;
        com.google.android.gms.internal.measurement.zzacg zzacgVar = new com.google.android.gms.internal.measurement.zzacg(i17, zzabvVar.zzc(position, zzabvVar.getPosition() - position));
        com.google.android.gms.internal.measurement.zzaca zzacaVar = this.zzbww;
        if (zzacaVar == null) {
            this.zzbww = new com.google.android.gms.internal.measurement.zzaca();
            zzat = null;
        } else {
            zzat = zzacaVar.zzat(i18);
        }
        if (zzat == null) {
            zzat = new com.google.android.gms.internal.measurement.zzacb();
            this.zzbww.zza(i18, zzat);
        }
        zzat.zza(zzacgVar);
        return true;
    }
}
