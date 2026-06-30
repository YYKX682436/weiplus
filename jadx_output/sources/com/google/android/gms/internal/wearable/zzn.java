package com.google.android.gms.internal.wearable;

/* loaded from: classes16.dex */
public abstract class zzn<M extends com.google.android.gms.internal.wearable.zzn<M>> extends com.google.android.gms.internal.wearable.zzt {
    protected com.google.android.gms.internal.wearable.zzp zzhc;

    @Override // com.google.android.gms.internal.wearable.zzt
    public /* synthetic */ java.lang.Object clone() {
        com.google.android.gms.internal.wearable.zzn zznVar = (com.google.android.gms.internal.wearable.zzn) super.clone();
        com.google.android.gms.internal.wearable.zzr.zza(this, zznVar);
        return zznVar;
    }

    @Override // com.google.android.gms.internal.wearable.zzt
    public void zza(com.google.android.gms.internal.wearable.zzl zzlVar) {
        if (this.zzhc == null) {
            return;
        }
        for (int i17 = 0; i17 < this.zzhc.size(); i17++) {
            this.zzhc.zzp(i17).zza(zzlVar);
        }
    }

    @Override // com.google.android.gms.internal.wearable.zzt
    public int zzg() {
        if (this.zzhc == null) {
            return 0;
        }
        int i17 = 0;
        for (int i18 = 0; i18 < this.zzhc.size(); i18++) {
            i17 += this.zzhc.zzp(i18).zzg();
        }
        return i17;
    }

    @Override // com.google.android.gms.internal.wearable.zzt
    /* renamed from: zzs */
    public final /* synthetic */ com.google.android.gms.internal.wearable.zzt clone() {
        return (com.google.android.gms.internal.wearable.zzn) clone();
    }

    public final boolean zza(com.google.android.gms.internal.wearable.zzk zzkVar, int i17) {
        com.google.android.gms.internal.wearable.zzq zzo;
        int position = zzkVar.getPosition();
        if (!zzkVar.zzd(i17)) {
            return false;
        }
        int i18 = i17 >>> 3;
        com.google.android.gms.internal.wearable.zzv zzvVar = new com.google.android.gms.internal.wearable.zzv(i17, zzkVar.zzb(position, zzkVar.getPosition() - position));
        com.google.android.gms.internal.wearable.zzp zzpVar = this.zzhc;
        if (zzpVar == null) {
            this.zzhc = new com.google.android.gms.internal.wearable.zzp();
            zzo = null;
        } else {
            zzo = zzpVar.zzo(i18);
        }
        if (zzo == null) {
            zzo = new com.google.android.gms.internal.wearable.zzq();
            this.zzhc.zza(i18, zzo);
        }
        zzo.zza(zzvVar);
        return true;
    }
}
