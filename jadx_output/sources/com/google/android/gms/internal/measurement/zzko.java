package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzko extends com.google.android.gms.internal.measurement.zzaby<com.google.android.gms.internal.measurement.zzko> {
    private static volatile com.google.android.gms.internal.measurement.zzko[] zzatd;
    public java.lang.String name = null;
    public java.lang.String zzajf = null;
    public java.lang.Long zzate = null;
    private java.lang.Float zzarb = null;
    public java.lang.Double zzarc = null;

    public zzko() {
        this.zzbww = null;
        this.zzbxh = -1;
    }

    public static com.google.android.gms.internal.measurement.zzko[] zzlm() {
        if (zzatd == null) {
            synchronized (com.google.android.gms.internal.measurement.zzacc.zzbxg) {
                if (zzatd == null) {
                    zzatd = new com.google.android.gms.internal.measurement.zzko[0];
                }
            }
        }
        return zzatd;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzko)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzko zzkoVar = (com.google.android.gms.internal.measurement.zzko) obj;
        java.lang.String str = this.name;
        if (str == null) {
            if (zzkoVar.name != null) {
                return false;
            }
        } else if (!str.equals(zzkoVar.name)) {
            return false;
        }
        java.lang.String str2 = this.zzajf;
        if (str2 == null) {
            if (zzkoVar.zzajf != null) {
                return false;
            }
        } else if (!str2.equals(zzkoVar.zzajf)) {
            return false;
        }
        java.lang.Long l17 = this.zzate;
        if (l17 == null) {
            if (zzkoVar.zzate != null) {
                return false;
            }
        } else if (!l17.equals(zzkoVar.zzate)) {
            return false;
        }
        java.lang.Float f17 = this.zzarb;
        if (f17 == null) {
            if (zzkoVar.zzarb != null) {
                return false;
            }
        } else if (!f17.equals(zzkoVar.zzarb)) {
            return false;
        }
        java.lang.Double d17 = this.zzarc;
        if (d17 == null) {
            if (zzkoVar.zzarc != null) {
                return false;
            }
        } else if (!d17.equals(zzkoVar.zzarc)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzaca zzacaVar = this.zzbww;
        if (zzacaVar != null && !zzacaVar.isEmpty()) {
            return this.zzbww.equals(zzkoVar.zzbww);
        }
        com.google.android.gms.internal.measurement.zzaca zzacaVar2 = zzkoVar.zzbww;
        return zzacaVar2 == null || zzacaVar2.isEmpty();
    }

    public final int hashCode() {
        java.lang.String str = this.name;
        int i17 = 0;
        int hashCode = ((-1033079982) + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.zzajf;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.Long l17 = this.zzate;
        int hashCode3 = (hashCode2 + (l17 == null ? 0 : l17.hashCode())) * 31;
        java.lang.Float f17 = this.zzarb;
        int hashCode4 = (hashCode3 + (f17 == null ? 0 : f17.hashCode())) * 31;
        java.lang.Double d17 = this.zzarc;
        int hashCode5 = (hashCode4 + (d17 == null ? 0 : d17.hashCode())) * 31;
        com.google.android.gms.internal.measurement.zzaca zzacaVar = this.zzbww;
        if (zzacaVar != null && !zzacaVar.isEmpty()) {
            i17 = this.zzbww.hashCode();
        }
        return hashCode5 + i17;
    }

    @Override // com.google.android.gms.internal.measurement.zzaby, com.google.android.gms.internal.measurement.zzace
    public final int zza() {
        int zza = super.zza();
        java.lang.String str = this.name;
        if (str != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzc(1, str);
        }
        java.lang.String str2 = this.zzajf;
        if (str2 != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzc(2, str2);
        }
        java.lang.Long l17 = this.zzate;
        if (l17 != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzc(3, l17.longValue());
        }
        java.lang.Float f17 = this.zzarb;
        if (f17 != null) {
            f17.floatValue();
            zza += com.google.android.gms.internal.measurement.zzabw.zzaq(4) + 4;
        }
        java.lang.Double d17 = this.zzarc;
        if (d17 == null) {
            return zza;
        }
        d17.doubleValue();
        return zza + com.google.android.gms.internal.measurement.zzabw.zzaq(5) + 8;
    }

    @Override // com.google.android.gms.internal.measurement.zzace
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzace zzb(com.google.android.gms.internal.measurement.zzabv zzabvVar) {
        while (true) {
            int zzuw = zzabvVar.zzuw();
            if (zzuw == 0) {
                return this;
            }
            if (zzuw == 10) {
                this.name = zzabvVar.readString();
            } else if (zzuw == 18) {
                this.zzajf = zzabvVar.readString();
            } else if (zzuw == 24) {
                this.zzate = java.lang.Long.valueOf(zzabvVar.zzuz());
            } else if (zzuw == 37) {
                this.zzarb = java.lang.Float.valueOf(java.lang.Float.intBitsToFloat(zzabvVar.zzva()));
            } else if (zzuw == 41) {
                this.zzarc = java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(zzabvVar.zzvb()));
            } else if (!super.zza(zzabvVar, zzuw)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaby, com.google.android.gms.internal.measurement.zzace
    public final void zza(com.google.android.gms.internal.measurement.zzabw zzabwVar) {
        java.lang.String str = this.name;
        if (str != null) {
            zzabwVar.zzb(1, str);
        }
        java.lang.String str2 = this.zzajf;
        if (str2 != null) {
            zzabwVar.zzb(2, str2);
        }
        java.lang.Long l17 = this.zzate;
        if (l17 != null) {
            zzabwVar.zzb(3, l17.longValue());
        }
        java.lang.Float f17 = this.zzarb;
        if (f17 != null) {
            zzabwVar.zza(4, f17.floatValue());
        }
        java.lang.Double d17 = this.zzarc;
        if (d17 != null) {
            zzabwVar.zza(5, d17.doubleValue());
        }
        super.zza(zzabwVar);
    }
}
