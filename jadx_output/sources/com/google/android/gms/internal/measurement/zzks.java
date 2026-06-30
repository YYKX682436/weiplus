package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzks extends com.google.android.gms.internal.measurement.zzaby<com.google.android.gms.internal.measurement.zzks> {
    private static volatile com.google.android.gms.internal.measurement.zzks[] zzaum;
    public java.lang.Long zzaun = null;
    public java.lang.String name = null;
    public java.lang.String zzajf = null;
    public java.lang.Long zzate = null;
    private java.lang.Float zzarb = null;
    public java.lang.Double zzarc = null;

    public zzks() {
        this.zzbww = null;
        this.zzbxh = -1;
    }

    public static com.google.android.gms.internal.measurement.zzks[] zzlo() {
        if (zzaum == null) {
            synchronized (com.google.android.gms.internal.measurement.zzacc.zzbxg) {
                if (zzaum == null) {
                    zzaum = new com.google.android.gms.internal.measurement.zzks[0];
                }
            }
        }
        return zzaum;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzks)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzks zzksVar = (com.google.android.gms.internal.measurement.zzks) obj;
        java.lang.Long l17 = this.zzaun;
        if (l17 == null) {
            if (zzksVar.zzaun != null) {
                return false;
            }
        } else if (!l17.equals(zzksVar.zzaun)) {
            return false;
        }
        java.lang.String str = this.name;
        if (str == null) {
            if (zzksVar.name != null) {
                return false;
            }
        } else if (!str.equals(zzksVar.name)) {
            return false;
        }
        java.lang.String str2 = this.zzajf;
        if (str2 == null) {
            if (zzksVar.zzajf != null) {
                return false;
            }
        } else if (!str2.equals(zzksVar.zzajf)) {
            return false;
        }
        java.lang.Long l18 = this.zzate;
        if (l18 == null) {
            if (zzksVar.zzate != null) {
                return false;
            }
        } else if (!l18.equals(zzksVar.zzate)) {
            return false;
        }
        java.lang.Float f17 = this.zzarb;
        if (f17 == null) {
            if (zzksVar.zzarb != null) {
                return false;
            }
        } else if (!f17.equals(zzksVar.zzarb)) {
            return false;
        }
        java.lang.Double d17 = this.zzarc;
        if (d17 == null) {
            if (zzksVar.zzarc != null) {
                return false;
            }
        } else if (!d17.equals(zzksVar.zzarc)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzaca zzacaVar = this.zzbww;
        if (zzacaVar != null && !zzacaVar.isEmpty()) {
            return this.zzbww.equals(zzksVar.zzbww);
        }
        com.google.android.gms.internal.measurement.zzaca zzacaVar2 = zzksVar.zzbww;
        return zzacaVar2 == null || zzacaVar2.isEmpty();
    }

    public final int hashCode() {
        java.lang.Long l17 = this.zzaun;
        int i17 = 0;
        int hashCode = ((-1033079858) + (l17 == null ? 0 : l17.hashCode())) * 31;
        java.lang.String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.zzajf;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.Long l18 = this.zzate;
        int hashCode4 = (hashCode3 + (l18 == null ? 0 : l18.hashCode())) * 31;
        java.lang.Float f17 = this.zzarb;
        int hashCode5 = (hashCode4 + (f17 == null ? 0 : f17.hashCode())) * 31;
        java.lang.Double d17 = this.zzarc;
        int hashCode6 = (hashCode5 + (d17 == null ? 0 : d17.hashCode())) * 31;
        com.google.android.gms.internal.measurement.zzaca zzacaVar = this.zzbww;
        if (zzacaVar != null && !zzacaVar.isEmpty()) {
            i17 = this.zzbww.hashCode();
        }
        return hashCode6 + i17;
    }

    @Override // com.google.android.gms.internal.measurement.zzaby, com.google.android.gms.internal.measurement.zzace
    public final int zza() {
        int zza = super.zza();
        java.lang.Long l17 = this.zzaun;
        if (l17 != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzc(1, l17.longValue());
        }
        java.lang.String str = this.name;
        if (str != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzc(2, str);
        }
        java.lang.String str2 = this.zzajf;
        if (str2 != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzc(3, str2);
        }
        java.lang.Long l18 = this.zzate;
        if (l18 != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzc(4, l18.longValue());
        }
        java.lang.Float f17 = this.zzarb;
        if (f17 != null) {
            f17.floatValue();
            zza += com.google.android.gms.internal.measurement.zzabw.zzaq(5) + 4;
        }
        java.lang.Double d17 = this.zzarc;
        if (d17 == null) {
            return zza;
        }
        d17.doubleValue();
        return zza + com.google.android.gms.internal.measurement.zzabw.zzaq(6) + 8;
    }

    @Override // com.google.android.gms.internal.measurement.zzace
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzace zzb(com.google.android.gms.internal.measurement.zzabv zzabvVar) {
        while (true) {
            int zzuw = zzabvVar.zzuw();
            if (zzuw == 0) {
                return this;
            }
            if (zzuw == 8) {
                this.zzaun = java.lang.Long.valueOf(zzabvVar.zzuz());
            } else if (zzuw == 18) {
                this.name = zzabvVar.readString();
            } else if (zzuw == 26) {
                this.zzajf = zzabvVar.readString();
            } else if (zzuw == 32) {
                this.zzate = java.lang.Long.valueOf(zzabvVar.zzuz());
            } else if (zzuw == 45) {
                this.zzarb = java.lang.Float.valueOf(java.lang.Float.intBitsToFloat(zzabvVar.zzva()));
            } else if (zzuw == 49) {
                this.zzarc = java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(zzabvVar.zzvb()));
            } else if (!super.zza(zzabvVar, zzuw)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaby, com.google.android.gms.internal.measurement.zzace
    public final void zza(com.google.android.gms.internal.measurement.zzabw zzabwVar) {
        java.lang.Long l17 = this.zzaun;
        if (l17 != null) {
            zzabwVar.zzb(1, l17.longValue());
        }
        java.lang.String str = this.name;
        if (str != null) {
            zzabwVar.zzb(2, str);
        }
        java.lang.String str2 = this.zzajf;
        if (str2 != null) {
            zzabwVar.zzb(3, str2);
        }
        java.lang.Long l18 = this.zzate;
        if (l18 != null) {
            zzabwVar.zzb(4, l18.longValue());
        }
        java.lang.Float f17 = this.zzarb;
        if (f17 != null) {
            zzabwVar.zza(5, f17.floatValue());
        }
        java.lang.Double d17 = this.zzarc;
        if (d17 != null) {
            zzabwVar.zza(6, d17.doubleValue());
        }
        super.zza(zzabwVar);
    }
}
