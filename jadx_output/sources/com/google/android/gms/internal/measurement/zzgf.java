package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzgf extends com.google.android.gms.internal.measurement.zzjq implements com.google.android.gms.internal.measurement.zzeh {
    private static int zzalf = 65535;
    private static int zzalg = 2;
    private final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> zzalh;
    private final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>> zzali;
    private final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>> zzalj;
    private final java.util.Map<java.lang.String, com.google.android.gms.internal.measurement.zzkk> zzalk;
    private final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>> zzall;
    private final java.util.Map<java.lang.String, java.lang.String> zzalm;

    public zzgf(com.google.android.gms.internal.measurement.zzjr zzjrVar) {
        super(zzjrVar);
        this.zzalh = new x.b();
        this.zzali = new x.b();
        this.zzalj = new x.b();
        this.zzalk = new x.b();
        this.zzalm = new x.b();
        this.zzall = new x.b();
    }

    private final com.google.android.gms.internal.measurement.zzkk zza(java.lang.String str, byte[] bArr) {
        if (bArr == null) {
            return new com.google.android.gms.internal.measurement.zzkk();
        }
        com.google.android.gms.internal.measurement.zzabv zza = com.google.android.gms.internal.measurement.zzabv.zza(bArr, 0, bArr.length);
        com.google.android.gms.internal.measurement.zzkk zzkkVar = new com.google.android.gms.internal.measurement.zzkk();
        try {
            zzkkVar.zzb(zza);
            zzge().zzit().zze("Parsed config. version, gmp_app_id", zzkkVar.zzasp, zzkkVar.zzadm);
            return zzkkVar;
        } catch (java.io.IOException e17) {
            zzge().zzip().zze("Unable to merge remote config. appId", com.google.android.gms.internal.measurement.zzfg.zzbm(str), e17);
            return new com.google.android.gms.internal.measurement.zzkk();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, com.google.android.gms.internal.measurement.zzec
    public final /* bridge */ /* synthetic */ android.content.Context getContext() {
        return super.getContext();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ void zzab() {
        super.zzab();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, com.google.android.gms.internal.measurement.zzec
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.Clock zzbt() {
        return super.zzbt();
    }

    public final com.google.android.gms.internal.measurement.zzkk zzbu(java.lang.String str) {
        zzch();
        zzab();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzbt(str);
        return this.zzalk.get(str);
    }

    public final java.lang.String zzbv(java.lang.String str) {
        zzab();
        return this.zzalm.get(str);
    }

    public final void zzbw(java.lang.String str) {
        zzab();
        this.zzalm.put(str, null);
    }

    public final void zzbx(java.lang.String str) {
        zzab();
        this.zzalk.remove(str);
    }

    public final boolean zzby(java.lang.String str) {
        return "1".equals(zze(str, "measurement.upload.blacklist_internal"));
    }

    public final boolean zzbz(java.lang.String str) {
        return "1".equals(zze(str, "measurement.upload.blacklist_public"));
    }

    @Override // com.google.android.gms.internal.measurement.zzeh
    public final java.lang.String zze(java.lang.String str, java.lang.String str2) {
        zzab();
        zzbt(str);
        java.util.Map<java.lang.String, java.lang.String> map = this.zzalh.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ void zzfr() {
        super.zzfr();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ void zzfs() {
        super.zzfs();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzdu zzft() {
        return super.zzft();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzhk zzfu() {
        return super.zzfu();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzfb zzfv() {
        return super.zzfv();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzeo zzfw() {
        return super.zzfw();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzii zzfx() {
        return super.zzfx();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzif zzfy() {
        return super.zzfy();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzfc zzfz() {
        return super.zzfz();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzfe zzga() {
        return super.zzga();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzka zzgb() {
        return super.zzgb();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzjh zzgc() {
        return super.zzgc();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, com.google.android.gms.internal.measurement.zzec
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzgg zzgd() {
        return super.zzgd();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, com.google.android.gms.internal.measurement.zzec
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzfg zzge() {
        return super.zzge();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzfr zzgf() {
        return super.zzgf();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzef zzgg() {
        return super.zzgg();
    }

    @Override // com.google.android.gms.internal.measurement.zzjq
    public final boolean zzhf() {
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzjp
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzeb zziw() {
        return super.zziw();
    }

    @Override // com.google.android.gms.internal.measurement.zzjp
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzei zzix() {
        return super.zzix();
    }

    public final boolean zzn(java.lang.String str, java.lang.String str2) {
        java.lang.Boolean bool;
        zzab();
        zzbt(str);
        if (zzby(str) && com.google.android.gms.internal.measurement.zzka.zzci(str2)) {
            return true;
        }
        if (zzbz(str) && com.google.android.gms.internal.measurement.zzka.zzcc(str2)) {
            return true;
        }
        java.util.Map<java.lang.String, java.lang.Boolean> map = this.zzali.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean zzo(java.lang.String str, java.lang.String str2) {
        java.lang.Boolean bool;
        zzab();
        zzbt(str);
        if (ya.a.ECOMMERCE_PURCHASE.equals(str2)) {
            return true;
        }
        java.util.Map<java.lang.String, java.lang.Boolean> map = this.zzalj.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final int zzp(java.lang.String str, java.lang.String str2) {
        java.lang.Integer num;
        zzab();
        zzbt(str);
        java.util.Map<java.lang.String, java.lang.Integer> map = this.zzall.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    private static java.util.Map<java.lang.String, java.lang.String> zza(com.google.android.gms.internal.measurement.zzkk zzkkVar) {
        com.google.android.gms.internal.measurement.zzkl[] zzklVarArr;
        x.b bVar = new x.b();
        if (zzkkVar != null && (zzklVarArr = zzkkVar.zzasr) != null) {
            for (com.google.android.gms.internal.measurement.zzkl zzklVar : zzklVarArr) {
                if (zzklVar != null) {
                    bVar.put(zzklVar.zzny, zzklVar.value);
                }
            }
        }
        return bVar;
    }

    private final void zzbt(java.lang.String str) {
        zzch();
        zzab();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        if (this.zzalk.get(str) == null) {
            byte[] zzbe = zzix().zzbe(str);
            if (zzbe != null) {
                com.google.android.gms.internal.measurement.zzkk zza = zza(str, zzbe);
                this.zzalh.put(str, zza(zza));
                zza(str, zza);
                this.zzalk.put(str, zza);
                this.zzalm.put(str, null);
                return;
            }
            this.zzalh.put(str, null);
            this.zzali.put(str, null);
            this.zzalj.put(str, null);
            this.zzalk.put(str, null);
            this.zzalm.put(str, null);
            this.zzall.put(str, null);
        }
    }

    private final void zza(java.lang.String str, com.google.android.gms.internal.measurement.zzkk zzkkVar) {
        com.google.android.gms.internal.measurement.zzkj[] zzkjVarArr;
        x.b bVar = new x.b();
        x.b bVar2 = new x.b();
        x.b bVar3 = new x.b();
        if (zzkkVar != null && (zzkjVarArr = zzkkVar.zzass) != null) {
            for (com.google.android.gms.internal.measurement.zzkj zzkjVar : zzkjVarArr) {
                if (android.text.TextUtils.isEmpty(zzkjVar.name)) {
                    zzge().zzip().log("EventConfig contained null event name");
                } else {
                    java.lang.String zzak = com.google.android.gms.measurement.AppMeasurement.Event.zzak(zzkjVar.name);
                    if (!android.text.TextUtils.isEmpty(zzak)) {
                        zzkjVar.name = zzak;
                    }
                    bVar.put(zzkjVar.name, zzkjVar.zzasm);
                    bVar2.put(zzkjVar.name, zzkjVar.zzasn);
                    java.lang.Integer num = zzkjVar.zzaso;
                    if (num != null) {
                        if (num.intValue() < zzalg || zzkjVar.zzaso.intValue() > zzalf) {
                            zzge().zzip().zze("Invalid sampling rate. Event name, sample rate", zzkjVar.name, zzkjVar.zzaso);
                        } else {
                            bVar3.put(zzkjVar.name, zzkjVar.zzaso);
                        }
                    }
                }
            }
        }
        this.zzali.put(str, bVar);
        this.zzalj.put(str, bVar2);
        this.zzall.put(str, bVar3);
    }

    public final boolean zza(java.lang.String str, byte[] bArr, java.lang.String str2) {
        byte[] bArr2;
        zzch();
        zzab();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.internal.measurement.zzkk zza = zza(str, bArr);
        int i17 = 0;
        if (zza == null) {
            return false;
        }
        zza(str, zza);
        this.zzalk.put(str, zza);
        this.zzalm.put(str, str2);
        this.zzalh.put(str, zza(zza));
        com.google.android.gms.internal.measurement.zzeb zziw = zziw();
        com.google.android.gms.internal.measurement.zzkd[] zzkdVarArr = zza.zzast;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzkdVarArr);
        int length = zzkdVarArr.length;
        int i18 = 0;
        while (i18 < length) {
            com.google.android.gms.internal.measurement.zzkd zzkdVar = zzkdVarArr[i18];
            com.google.android.gms.internal.measurement.zzke[] zzkeVarArr = zzkdVar.zzarn;
            int length2 = zzkeVarArr.length;
            int i19 = i17;
            while (i19 < length2) {
                com.google.android.gms.internal.measurement.zzke zzkeVar = zzkeVarArr[i19];
                java.lang.String zzak = com.google.android.gms.measurement.AppMeasurement.Event.zzak(zzkeVar.zzarq);
                if (zzak != null) {
                    zzkeVar.zzarq = zzak;
                }
                com.google.android.gms.internal.measurement.zzkf[] zzkfVarArr = zzkeVar.zzarr;
                int length3 = zzkfVarArr.length;
                for (int i27 = i17; i27 < length3; i27++) {
                    com.google.android.gms.internal.measurement.zzkf zzkfVar = zzkfVarArr[i27];
                    java.lang.String zzak2 = com.google.android.gms.measurement.AppMeasurement.Param.zzak(zzkfVar.zzary);
                    if (zzak2 != null) {
                        zzkfVar.zzary = zzak2;
                    }
                }
                i19++;
                i17 = 0;
            }
            for (com.google.android.gms.internal.measurement.zzkh zzkhVar : zzkdVar.zzarm) {
                java.lang.String zzak3 = com.google.android.gms.measurement.AppMeasurement.UserProperty.zzak(zzkhVar.zzasf);
                if (zzak3 != null) {
                    zzkhVar.zzasf = zzak3;
                }
            }
            i18++;
            i17 = 0;
        }
        zziw.zzix().zza(str, zzkdVarArr);
        try {
            zza.zzast = null;
            int zzvm = zza.zzvm();
            bArr2 = new byte[zzvm];
            zza.zza(com.google.android.gms.internal.measurement.zzabw.zzb(bArr2, 0, zzvm));
        } catch (java.io.IOException e17) {
            zzge().zzip().zze("Unable to serialize reduced-size config. Storing full config instead. appId", com.google.android.gms.internal.measurement.zzfg.zzbm(str), e17);
            bArr2 = bArr;
        }
        com.google.android.gms.internal.measurement.zzei zzix = zzix();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzix.zzab();
        zzix.zzch();
        new android.content.ContentValues().put("remote_config", bArr2);
        try {
            if (zzix.getWritableDatabase().update("apps", r0, "app_id = ?", new java.lang.String[]{str}) != 0) {
                return true;
            }
            zzix.zzge().zzim().zzg("Failed to update remote config (got 0). appId", com.google.android.gms.internal.measurement.zzfg.zzbm(str));
            return true;
        } catch (android.database.sqlite.SQLiteException e18) {
            zzix.zzge().zzim().zze("Error storing remote config. appId", com.google.android.gms.internal.measurement.zzfg.zzbm(str), e18);
            return true;
        }
    }
}
