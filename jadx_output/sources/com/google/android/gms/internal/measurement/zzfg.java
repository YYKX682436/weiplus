package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzfg extends com.google.android.gms.internal.measurement.zzhh {
    private long zzadu;
    private char zzaim;
    private java.lang.String zzain;
    private final com.google.android.gms.internal.measurement.zzfi zzaio;
    private final com.google.android.gms.internal.measurement.zzfi zzaip;
    private final com.google.android.gms.internal.measurement.zzfi zzaiq;
    private final com.google.android.gms.internal.measurement.zzfi zzair;
    private final com.google.android.gms.internal.measurement.zzfi zzais;
    private final com.google.android.gms.internal.measurement.zzfi zzait;
    private final com.google.android.gms.internal.measurement.zzfi zzaiu;
    private final com.google.android.gms.internal.measurement.zzfi zzaiv;
    private final com.google.android.gms.internal.measurement.zzfi zzaiw;

    public zzfg(com.google.android.gms.internal.measurement.zzgl zzglVar) {
        super(zzglVar);
        this.zzaim = (char) 0;
        this.zzadu = -1L;
        this.zzaio = new com.google.android.gms.internal.measurement.zzfi(this, 6, false, false);
        this.zzaip = new com.google.android.gms.internal.measurement.zzfi(this, 6, true, false);
        this.zzaiq = new com.google.android.gms.internal.measurement.zzfi(this, 6, false, true);
        this.zzair = new com.google.android.gms.internal.measurement.zzfi(this, 5, false, false);
        this.zzais = new com.google.android.gms.internal.measurement.zzfi(this, 5, true, false);
        this.zzait = new com.google.android.gms.internal.measurement.zzfi(this, 5, false, true);
        this.zzaiu = new com.google.android.gms.internal.measurement.zzfi(this, 4, false, false);
        this.zzaiv = new com.google.android.gms.internal.measurement.zzfi(this, 3, false, false);
        this.zzaiw = new com.google.android.gms.internal.measurement.zzfi(this, 2, false, false);
    }

    public static java.lang.Object zzbm(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return new com.google.android.gms.internal.measurement.zzfj(str);
    }

    private static java.lang.String zzbn(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    private final java.lang.String zziu() {
        java.lang.String str;
        synchronized (this) {
            if (this.zzain == null) {
                this.zzain = com.google.android.gms.internal.measurement.zzew.zzagi.get();
            }
            str = this.zzain;
        }
        return str;
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, com.google.android.gms.internal.measurement.zzec
    public final /* bridge */ /* synthetic */ android.content.Context getContext() {
        return super.getContext();
    }

    public final boolean isLoggable(int i17) {
        return android.util.Log.isLoggable(zziu(), i17);
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ void zzab() {
        super.zzab();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, com.google.android.gms.internal.measurement.zzec
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.Clock zzbt() {
        return super.zzbt();
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

    @Override // com.google.android.gms.internal.measurement.zzhh
    public final boolean zzhf() {
        return false;
    }

    public final com.google.android.gms.internal.measurement.zzfi zzim() {
        return this.zzaio;
    }

    public final com.google.android.gms.internal.measurement.zzfi zzin() {
        return this.zzaip;
    }

    public final com.google.android.gms.internal.measurement.zzfi zzio() {
        return this.zzaiq;
    }

    public final com.google.android.gms.internal.measurement.zzfi zzip() {
        return this.zzair;
    }

    public final com.google.android.gms.internal.measurement.zzfi zziq() {
        return this.zzait;
    }

    public final com.google.android.gms.internal.measurement.zzfi zzir() {
        return this.zzaiu;
    }

    public final com.google.android.gms.internal.measurement.zzfi zzis() {
        return this.zzaiv;
    }

    public final com.google.android.gms.internal.measurement.zzfi zzit() {
        return this.zzaiw;
    }

    public final java.lang.String zziv() {
        android.util.Pair<java.lang.String, java.lang.Long> zzfi = zzgf().zzajt.zzfi();
        if (zzfi == null || zzfi == com.google.android.gms.internal.measurement.zzfr.zzajs) {
            return null;
        }
        java.lang.String valueOf = java.lang.String.valueOf(zzfi.second);
        java.lang.String str = (java.lang.String) zzfi.first;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(valueOf.length() + 1 + java.lang.String.valueOf(str).length());
        sb6.append(valueOf);
        sb6.append(":");
        sb6.append(str);
        return sb6.toString();
    }

    public static /* synthetic */ long zza(com.google.android.gms.internal.measurement.zzfg zzfgVar, long j17) {
        zzfgVar.zzadu = 12451L;
        return 12451L;
    }

    private static java.lang.String zza(boolean z17, java.lang.Object obj) {
        java.lang.String str;
        java.lang.String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof java.lang.Integer) {
            obj = java.lang.Long.valueOf(((java.lang.Integer) obj).intValue());
        }
        if (obj instanceof java.lang.Long) {
            if (!z17) {
                return java.lang.String.valueOf(obj);
            }
            java.lang.Long l17 = (java.lang.Long) obj;
            if (java.lang.Math.abs(l17.longValue()) < 100) {
                return java.lang.String.valueOf(obj);
            }
            java.lang.String str2 = java.lang.String.valueOf(obj).charAt(0) == '-' ? "-" : "";
            java.lang.String valueOf = java.lang.String.valueOf(java.lang.Math.abs(l17.longValue()));
            long round = java.lang.Math.round(java.lang.Math.pow(10.0d, valueOf.length() - 1));
            long round2 = java.lang.Math.round(java.lang.Math.pow(10.0d, valueOf.length()) - 1.0d);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str2.length() + 43 + str2.length());
            sb6.append(str2);
            sb6.append(round);
            sb6.append("...");
            sb6.append(str2);
            sb6.append(round2);
            return sb6.toString();
        }
        if (obj instanceof java.lang.Boolean) {
            return java.lang.String.valueOf(obj);
        }
        if (!(obj instanceof java.lang.Throwable)) {
            if (!(obj instanceof com.google.android.gms.internal.measurement.zzfj)) {
                return z17 ? "-" : java.lang.String.valueOf(obj);
            }
            str = ((com.google.android.gms.internal.measurement.zzfj) obj).zzajf;
            return str;
        }
        java.lang.Throwable th6 = (java.lang.Throwable) obj;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(z17 ? th6.getClass().getName() : th6.toString());
        java.lang.String zzbn = zzbn(com.google.android.gms.measurement.AppMeasurement.class.getCanonicalName());
        java.lang.String zzbn2 = zzbn(com.google.android.gms.internal.measurement.zzgl.class.getCanonicalName());
        for (java.lang.StackTraceElement stackTraceElement : th6.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                java.lang.String zzbn3 = zzbn(className);
                if (zzbn3.equals(zzbn) || zzbn3.equals(zzbn2)) {
                    sb7.append(": ");
                    sb7.append(stackTraceElement);
                    break;
                }
            }
        }
        return sb7.toString();
    }

    public static java.lang.String zza(boolean z17, java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String str2 = "";
        if (str == null) {
            str = "";
        }
        java.lang.String zza = zza(z17, obj);
        java.lang.String zza2 = zza(z17, obj2);
        java.lang.String zza3 = zza(z17, obj3);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (!android.text.TextUtils.isEmpty(str)) {
            sb6.append(str);
            str2 = ": ";
        }
        java.lang.String str3 = ", ";
        if (!android.text.TextUtils.isEmpty(zza)) {
            sb6.append(str2);
            sb6.append(zza);
            str2 = ", ";
        }
        if (android.text.TextUtils.isEmpty(zza2)) {
            str3 = str2;
        } else {
            sb6.append(str2);
            sb6.append(zza2);
        }
        if (!android.text.TextUtils.isEmpty(zza3)) {
            sb6.append(str3);
            sb6.append(zza3);
        }
        return sb6.toString();
    }

    public final void zza(int i17, java.lang.String str) {
        android.util.Log.println(i17, zziu(), str);
    }

    public final void zza(int i17, boolean z17, boolean z18, java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String str2;
        if (!z17 && isLoggable(i17)) {
            zza(i17, zza(false, str, obj, obj2, obj3));
        }
        if (z18 || i17 < 5) {
            return;
        }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        com.google.android.gms.internal.measurement.zzgg zzjq = this.zzacw.zzjq();
        if (zzjq == null) {
            str2 = "Scheduler not set. Not logging error/warn";
        } else {
            if (zzjq.isInitialized()) {
                if (i17 < 0) {
                    i17 = 0;
                }
                if (i17 >= 9) {
                    i17 = 8;
                }
                zzjq.zzc(new com.google.android.gms.internal.measurement.zzfh(this, i17, str, obj, obj2, obj3));
                return;
            }
            str2 = "Scheduler not initialized. Not logging error/warn";
        }
        zza(6, str2);
    }
}
