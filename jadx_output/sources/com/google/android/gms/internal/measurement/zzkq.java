package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzkq extends com.google.android.gms.internal.measurement.zzaby<com.google.android.gms.internal.measurement.zzkq> {
    private static volatile com.google.android.gms.internal.measurement.zzkq[] zzatg;
    public java.lang.Integer zzath = null;
    public com.google.android.gms.internal.measurement.zzkn[] zzati = com.google.android.gms.internal.measurement.zzkn.zzll();
    public com.google.android.gms.internal.measurement.zzks[] zzatj = com.google.android.gms.internal.measurement.zzks.zzlo();
    public java.lang.Long zzatk = null;
    public java.lang.Long zzatl = null;
    public java.lang.Long zzatm = null;
    public java.lang.Long zzatn = null;
    public java.lang.Long zzato = null;
    public java.lang.String zzatp = null;
    public java.lang.String zzatq = null;
    public java.lang.String zzatr = null;
    public java.lang.String zzafn = null;
    public java.lang.Integer zzats = null;
    public java.lang.String zzadt = null;
    public java.lang.String zzti = null;
    public java.lang.String zzth = null;
    public java.lang.Long zzatt = null;
    public java.lang.Long zzatu = null;
    public java.lang.String zzatv = null;
    public java.lang.Boolean zzatw = null;
    public java.lang.String zzadl = null;
    public java.lang.Long zzatx = null;
    public java.lang.Integer zzaty = null;
    public java.lang.String zzaek = null;
    public java.lang.String zzadm = null;
    public java.lang.Boolean zzatz = null;
    public com.google.android.gms.internal.measurement.zzkm[] zzaua = com.google.android.gms.internal.measurement.zzkm.zzlk();
    public java.lang.String zzado = null;
    public java.lang.Integer zzaub = null;
    private java.lang.Integer zzauc = null;
    private java.lang.Integer zzaud = null;
    public java.lang.String zzaue = null;
    public java.lang.Long zzauf = null;
    public java.lang.Long zzaug = null;
    public java.lang.String zzauh = null;
    private java.lang.String zzaui = null;
    public java.lang.Integer zzauj = null;

    public zzkq() {
        this.zzbww = null;
        this.zzbxh = -1;
    }

    public static com.google.android.gms.internal.measurement.zzkq[] zzln() {
        if (zzatg == null) {
            synchronized (com.google.android.gms.internal.measurement.zzacc.zzbxg) {
                if (zzatg == null) {
                    zzatg = new com.google.android.gms.internal.measurement.zzkq[0];
                }
            }
        }
        return zzatg;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzkq)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzkq zzkqVar = (com.google.android.gms.internal.measurement.zzkq) obj;
        java.lang.Integer num = this.zzath;
        if (num == null) {
            if (zzkqVar.zzath != null) {
                return false;
            }
        } else if (!num.equals(zzkqVar.zzath)) {
            return false;
        }
        if (!com.google.android.gms.internal.measurement.zzacc.equals(this.zzati, zzkqVar.zzati) || !com.google.android.gms.internal.measurement.zzacc.equals(this.zzatj, zzkqVar.zzatj)) {
            return false;
        }
        java.lang.Long l17 = this.zzatk;
        if (l17 == null) {
            if (zzkqVar.zzatk != null) {
                return false;
            }
        } else if (!l17.equals(zzkqVar.zzatk)) {
            return false;
        }
        java.lang.Long l18 = this.zzatl;
        if (l18 == null) {
            if (zzkqVar.zzatl != null) {
                return false;
            }
        } else if (!l18.equals(zzkqVar.zzatl)) {
            return false;
        }
        java.lang.Long l19 = this.zzatm;
        if (l19 == null) {
            if (zzkqVar.zzatm != null) {
                return false;
            }
        } else if (!l19.equals(zzkqVar.zzatm)) {
            return false;
        }
        java.lang.Long l27 = this.zzatn;
        if (l27 == null) {
            if (zzkqVar.zzatn != null) {
                return false;
            }
        } else if (!l27.equals(zzkqVar.zzatn)) {
            return false;
        }
        java.lang.Long l28 = this.zzato;
        if (l28 == null) {
            if (zzkqVar.zzato != null) {
                return false;
            }
        } else if (!l28.equals(zzkqVar.zzato)) {
            return false;
        }
        java.lang.String str = this.zzatp;
        if (str == null) {
            if (zzkqVar.zzatp != null) {
                return false;
            }
        } else if (!str.equals(zzkqVar.zzatp)) {
            return false;
        }
        java.lang.String str2 = this.zzatq;
        if (str2 == null) {
            if (zzkqVar.zzatq != null) {
                return false;
            }
        } else if (!str2.equals(zzkqVar.zzatq)) {
            return false;
        }
        java.lang.String str3 = this.zzatr;
        if (str3 == null) {
            if (zzkqVar.zzatr != null) {
                return false;
            }
        } else if (!str3.equals(zzkqVar.zzatr)) {
            return false;
        }
        java.lang.String str4 = this.zzafn;
        if (str4 == null) {
            if (zzkqVar.zzafn != null) {
                return false;
            }
        } else if (!str4.equals(zzkqVar.zzafn)) {
            return false;
        }
        java.lang.Integer num2 = this.zzats;
        if (num2 == null) {
            if (zzkqVar.zzats != null) {
                return false;
            }
        } else if (!num2.equals(zzkqVar.zzats)) {
            return false;
        }
        java.lang.String str5 = this.zzadt;
        if (str5 == null) {
            if (zzkqVar.zzadt != null) {
                return false;
            }
        } else if (!str5.equals(zzkqVar.zzadt)) {
            return false;
        }
        java.lang.String str6 = this.zzti;
        if (str6 == null) {
            if (zzkqVar.zzti != null) {
                return false;
            }
        } else if (!str6.equals(zzkqVar.zzti)) {
            return false;
        }
        java.lang.String str7 = this.zzth;
        if (str7 == null) {
            if (zzkqVar.zzth != null) {
                return false;
            }
        } else if (!str7.equals(zzkqVar.zzth)) {
            return false;
        }
        java.lang.Long l29 = this.zzatt;
        if (l29 == null) {
            if (zzkqVar.zzatt != null) {
                return false;
            }
        } else if (!l29.equals(zzkqVar.zzatt)) {
            return false;
        }
        java.lang.Long l37 = this.zzatu;
        if (l37 == null) {
            if (zzkqVar.zzatu != null) {
                return false;
            }
        } else if (!l37.equals(zzkqVar.zzatu)) {
            return false;
        }
        java.lang.String str8 = this.zzatv;
        if (str8 == null) {
            if (zzkqVar.zzatv != null) {
                return false;
            }
        } else if (!str8.equals(zzkqVar.zzatv)) {
            return false;
        }
        java.lang.Boolean bool = this.zzatw;
        if (bool == null) {
            if (zzkqVar.zzatw != null) {
                return false;
            }
        } else if (!bool.equals(zzkqVar.zzatw)) {
            return false;
        }
        java.lang.String str9 = this.zzadl;
        if (str9 == null) {
            if (zzkqVar.zzadl != null) {
                return false;
            }
        } else if (!str9.equals(zzkqVar.zzadl)) {
            return false;
        }
        java.lang.Long l38 = this.zzatx;
        if (l38 == null) {
            if (zzkqVar.zzatx != null) {
                return false;
            }
        } else if (!l38.equals(zzkqVar.zzatx)) {
            return false;
        }
        java.lang.Integer num3 = this.zzaty;
        if (num3 == null) {
            if (zzkqVar.zzaty != null) {
                return false;
            }
        } else if (!num3.equals(zzkqVar.zzaty)) {
            return false;
        }
        java.lang.String str10 = this.zzaek;
        if (str10 == null) {
            if (zzkqVar.zzaek != null) {
                return false;
            }
        } else if (!str10.equals(zzkqVar.zzaek)) {
            return false;
        }
        java.lang.String str11 = this.zzadm;
        if (str11 == null) {
            if (zzkqVar.zzadm != null) {
                return false;
            }
        } else if (!str11.equals(zzkqVar.zzadm)) {
            return false;
        }
        java.lang.Boolean bool2 = this.zzatz;
        if (bool2 == null) {
            if (zzkqVar.zzatz != null) {
                return false;
            }
        } else if (!bool2.equals(zzkqVar.zzatz)) {
            return false;
        }
        if (!com.google.android.gms.internal.measurement.zzacc.equals(this.zzaua, zzkqVar.zzaua)) {
            return false;
        }
        java.lang.String str12 = this.zzado;
        if (str12 == null) {
            if (zzkqVar.zzado != null) {
                return false;
            }
        } else if (!str12.equals(zzkqVar.zzado)) {
            return false;
        }
        java.lang.Integer num4 = this.zzaub;
        if (num4 == null) {
            if (zzkqVar.zzaub != null) {
                return false;
            }
        } else if (!num4.equals(zzkqVar.zzaub)) {
            return false;
        }
        java.lang.Integer num5 = this.zzauc;
        if (num5 == null) {
            if (zzkqVar.zzauc != null) {
                return false;
            }
        } else if (!num5.equals(zzkqVar.zzauc)) {
            return false;
        }
        java.lang.Integer num6 = this.zzaud;
        if (num6 == null) {
            if (zzkqVar.zzaud != null) {
                return false;
            }
        } else if (!num6.equals(zzkqVar.zzaud)) {
            return false;
        }
        java.lang.String str13 = this.zzaue;
        if (str13 == null) {
            if (zzkqVar.zzaue != null) {
                return false;
            }
        } else if (!str13.equals(zzkqVar.zzaue)) {
            return false;
        }
        java.lang.Long l39 = this.zzauf;
        if (l39 == null) {
            if (zzkqVar.zzauf != null) {
                return false;
            }
        } else if (!l39.equals(zzkqVar.zzauf)) {
            return false;
        }
        java.lang.Long l47 = this.zzaug;
        if (l47 == null) {
            if (zzkqVar.zzaug != null) {
                return false;
            }
        } else if (!l47.equals(zzkqVar.zzaug)) {
            return false;
        }
        java.lang.String str14 = this.zzauh;
        if (str14 == null) {
            if (zzkqVar.zzauh != null) {
                return false;
            }
        } else if (!str14.equals(zzkqVar.zzauh)) {
            return false;
        }
        java.lang.String str15 = this.zzaui;
        if (str15 == null) {
            if (zzkqVar.zzaui != null) {
                return false;
            }
        } else if (!str15.equals(zzkqVar.zzaui)) {
            return false;
        }
        java.lang.Integer num7 = this.zzauj;
        if (num7 == null) {
            if (zzkqVar.zzauj != null) {
                return false;
            }
        } else if (!num7.equals(zzkqVar.zzauj)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzaca zzacaVar = this.zzbww;
        if (zzacaVar != null && !zzacaVar.isEmpty()) {
            return this.zzbww.equals(zzkqVar.zzbww);
        }
        com.google.android.gms.internal.measurement.zzaca zzacaVar2 = zzkqVar.zzbww;
        return zzacaVar2 == null || zzacaVar2.isEmpty();
    }

    public final int hashCode() {
        java.lang.Integer num = this.zzath;
        int i17 = 0;
        int hashCode = ((((((-1033079920) + (num == null ? 0 : num.hashCode())) * 31) + com.google.android.gms.internal.measurement.zzacc.hashCode(this.zzati)) * 31) + com.google.android.gms.internal.measurement.zzacc.hashCode(this.zzatj)) * 31;
        java.lang.Long l17 = this.zzatk;
        int hashCode2 = (hashCode + (l17 == null ? 0 : l17.hashCode())) * 31;
        java.lang.Long l18 = this.zzatl;
        int hashCode3 = (hashCode2 + (l18 == null ? 0 : l18.hashCode())) * 31;
        java.lang.Long l19 = this.zzatm;
        int hashCode4 = (hashCode3 + (l19 == null ? 0 : l19.hashCode())) * 31;
        java.lang.Long l27 = this.zzatn;
        int hashCode5 = (hashCode4 + (l27 == null ? 0 : l27.hashCode())) * 31;
        java.lang.Long l28 = this.zzato;
        int hashCode6 = (hashCode5 + (l28 == null ? 0 : l28.hashCode())) * 31;
        java.lang.String str = this.zzatp;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.zzatq;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.zzatr;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.zzafn;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.Integer num2 = this.zzats;
        int hashCode11 = (hashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.lang.String str5 = this.zzadt;
        int hashCode12 = (hashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.zzti;
        int hashCode13 = (hashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        java.lang.String str7 = this.zzth;
        int hashCode14 = (hashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        java.lang.Long l29 = this.zzatt;
        int hashCode15 = (hashCode14 + (l29 == null ? 0 : l29.hashCode())) * 31;
        java.lang.Long l37 = this.zzatu;
        int hashCode16 = (hashCode15 + (l37 == null ? 0 : l37.hashCode())) * 31;
        java.lang.String str8 = this.zzatv;
        int hashCode17 = (hashCode16 + (str8 == null ? 0 : str8.hashCode())) * 31;
        java.lang.Boolean bool = this.zzatw;
        int hashCode18 = (hashCode17 + (bool == null ? 0 : bool.hashCode())) * 31;
        java.lang.String str9 = this.zzadl;
        int hashCode19 = (hashCode18 + (str9 == null ? 0 : str9.hashCode())) * 31;
        java.lang.Long l38 = this.zzatx;
        int hashCode20 = (hashCode19 + (l38 == null ? 0 : l38.hashCode())) * 31;
        java.lang.Integer num3 = this.zzaty;
        int hashCode21 = (hashCode20 + (num3 == null ? 0 : num3.hashCode())) * 31;
        java.lang.String str10 = this.zzaek;
        int hashCode22 = (hashCode21 + (str10 == null ? 0 : str10.hashCode())) * 31;
        java.lang.String str11 = this.zzadm;
        int hashCode23 = (hashCode22 + (str11 == null ? 0 : str11.hashCode())) * 31;
        java.lang.Boolean bool2 = this.zzatz;
        int hashCode24 = (((hashCode23 + (bool2 == null ? 0 : bool2.hashCode())) * 31) + com.google.android.gms.internal.measurement.zzacc.hashCode(this.zzaua)) * 31;
        java.lang.String str12 = this.zzado;
        int hashCode25 = (hashCode24 + (str12 == null ? 0 : str12.hashCode())) * 31;
        java.lang.Integer num4 = this.zzaub;
        int hashCode26 = (hashCode25 + (num4 == null ? 0 : num4.hashCode())) * 31;
        java.lang.Integer num5 = this.zzauc;
        int hashCode27 = (hashCode26 + (num5 == null ? 0 : num5.hashCode())) * 31;
        java.lang.Integer num6 = this.zzaud;
        int hashCode28 = (hashCode27 + (num6 == null ? 0 : num6.hashCode())) * 31;
        java.lang.String str13 = this.zzaue;
        int hashCode29 = (hashCode28 + (str13 == null ? 0 : str13.hashCode())) * 31;
        java.lang.Long l39 = this.zzauf;
        int hashCode30 = (hashCode29 + (l39 == null ? 0 : l39.hashCode())) * 31;
        java.lang.Long l47 = this.zzaug;
        int hashCode31 = (hashCode30 + (l47 == null ? 0 : l47.hashCode())) * 31;
        java.lang.String str14 = this.zzauh;
        int hashCode32 = (hashCode31 + (str14 == null ? 0 : str14.hashCode())) * 31;
        java.lang.String str15 = this.zzaui;
        int hashCode33 = (hashCode32 + (str15 == null ? 0 : str15.hashCode())) * 31;
        java.lang.Integer num7 = this.zzauj;
        int hashCode34 = (hashCode33 + (num7 == null ? 0 : num7.hashCode())) * 31;
        com.google.android.gms.internal.measurement.zzaca zzacaVar = this.zzbww;
        if (zzacaVar != null && !zzacaVar.isEmpty()) {
            i17 = this.zzbww.hashCode();
        }
        return hashCode34 + i17;
    }

    @Override // com.google.android.gms.internal.measurement.zzaby, com.google.android.gms.internal.measurement.zzace
    public final int zza() {
        int zza = super.zza();
        java.lang.Integer num = this.zzath;
        if (num != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzf(1, num.intValue());
        }
        com.google.android.gms.internal.measurement.zzkn[] zzknVarArr = this.zzati;
        int i17 = 0;
        if (zzknVarArr != null && zzknVarArr.length > 0) {
            int i18 = 0;
            while (true) {
                com.google.android.gms.internal.measurement.zzkn[] zzknVarArr2 = this.zzati;
                if (i18 >= zzknVarArr2.length) {
                    break;
                }
                com.google.android.gms.internal.measurement.zzkn zzknVar = zzknVarArr2[i18];
                if (zzknVar != null) {
                    zza += com.google.android.gms.internal.measurement.zzabw.zzb(2, zzknVar);
                }
                i18++;
            }
        }
        com.google.android.gms.internal.measurement.zzks[] zzksVarArr = this.zzatj;
        if (zzksVarArr != null && zzksVarArr.length > 0) {
            int i19 = 0;
            while (true) {
                com.google.android.gms.internal.measurement.zzks[] zzksVarArr2 = this.zzatj;
                if (i19 >= zzksVarArr2.length) {
                    break;
                }
                com.google.android.gms.internal.measurement.zzks zzksVar = zzksVarArr2[i19];
                if (zzksVar != null) {
                    zza += com.google.android.gms.internal.measurement.zzabw.zzb(3, zzksVar);
                }
                i19++;
            }
        }
        java.lang.Long l17 = this.zzatk;
        if (l17 != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzc(4, l17.longValue());
        }
        java.lang.Long l18 = this.zzatl;
        if (l18 != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzc(5, l18.longValue());
        }
        java.lang.Long l19 = this.zzatm;
        if (l19 != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzc(6, l19.longValue());
        }
        java.lang.Long l27 = this.zzato;
        if (l27 != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzc(7, l27.longValue());
        }
        java.lang.String str = this.zzatp;
        if (str != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzc(8, str);
        }
        java.lang.String str2 = this.zzatq;
        if (str2 != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzc(9, str2);
        }
        java.lang.String str3 = this.zzatr;
        if (str3 != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzc(10, str3);
        }
        java.lang.String str4 = this.zzafn;
        if (str4 != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzc(11, str4);
        }
        java.lang.Integer num2 = this.zzats;
        if (num2 != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzf(12, num2.intValue());
        }
        java.lang.String str5 = this.zzadt;
        if (str5 != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzc(13, str5);
        }
        java.lang.String str6 = this.zzti;
        if (str6 != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzc(14, str6);
        }
        java.lang.String str7 = this.zzth;
        if (str7 != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzc(16, str7);
        }
        java.lang.Long l28 = this.zzatt;
        if (l28 != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzc(17, l28.longValue());
        }
        java.lang.Long l29 = this.zzatu;
        if (l29 != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzc(18, l29.longValue());
        }
        java.lang.String str8 = this.zzatv;
        if (str8 != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzc(19, str8);
        }
        java.lang.Boolean bool = this.zzatw;
        if (bool != null) {
            bool.booleanValue();
            zza += com.google.android.gms.internal.measurement.zzabw.zzaq(20) + 1;
        }
        java.lang.String str9 = this.zzadl;
        if (str9 != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzc(21, str9);
        }
        java.lang.Long l37 = this.zzatx;
        if (l37 != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzc(22, l37.longValue());
        }
        java.lang.Integer num3 = this.zzaty;
        if (num3 != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzf(23, num3.intValue());
        }
        java.lang.String str10 = this.zzaek;
        if (str10 != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzc(24, str10);
        }
        java.lang.String str11 = this.zzadm;
        if (str11 != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzc(25, str11);
        }
        java.lang.Long l38 = this.zzatn;
        if (l38 != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzc(26, l38.longValue());
        }
        java.lang.Boolean bool2 = this.zzatz;
        if (bool2 != null) {
            bool2.booleanValue();
            zza += com.google.android.gms.internal.measurement.zzabw.zzaq(28) + 1;
        }
        com.google.android.gms.internal.measurement.zzkm[] zzkmVarArr = this.zzaua;
        if (zzkmVarArr != null && zzkmVarArr.length > 0) {
            while (true) {
                com.google.android.gms.internal.measurement.zzkm[] zzkmVarArr2 = this.zzaua;
                if (i17 >= zzkmVarArr2.length) {
                    break;
                }
                com.google.android.gms.internal.measurement.zzkm zzkmVar = zzkmVarArr2[i17];
                if (zzkmVar != null) {
                    zza += com.google.android.gms.internal.measurement.zzabw.zzb(29, zzkmVar);
                }
                i17++;
            }
        }
        java.lang.String str12 = this.zzado;
        if (str12 != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzc(30, str12);
        }
        java.lang.Integer num4 = this.zzaub;
        if (num4 != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzf(31, num4.intValue());
        }
        java.lang.Integer num5 = this.zzauc;
        if (num5 != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzf(32, num5.intValue());
        }
        java.lang.Integer num6 = this.zzaud;
        if (num6 != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzf(33, num6.intValue());
        }
        java.lang.String str13 = this.zzaue;
        if (str13 != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzc(34, str13);
        }
        java.lang.Long l39 = this.zzauf;
        if (l39 != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzc(35, l39.longValue());
        }
        java.lang.Long l47 = this.zzaug;
        if (l47 != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzc(36, l47.longValue());
        }
        java.lang.String str14 = this.zzauh;
        if (str14 != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzc(37, str14);
        }
        java.lang.String str15 = this.zzaui;
        if (str15 != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzc(38, str15);
        }
        java.lang.Integer num7 = this.zzauj;
        return num7 != null ? zza + com.google.android.gms.internal.measurement.zzabw.zzf(39, num7.intValue()) : zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzace
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzace zzb(com.google.android.gms.internal.measurement.zzabv zzabvVar) {
        while (true) {
            int zzuw = zzabvVar.zzuw();
            switch (zzuw) {
                case 0:
                    return this;
                case 8:
                    this.zzath = java.lang.Integer.valueOf(zzabvVar.zzuy());
                    break;
                case 18:
                    int zzb = com.google.android.gms.internal.measurement.zzach.zzb(zzabvVar, 18);
                    com.google.android.gms.internal.measurement.zzkn[] zzknVarArr = this.zzati;
                    int length = zzknVarArr == null ? 0 : zzknVarArr.length;
                    int i17 = zzb + length;
                    com.google.android.gms.internal.measurement.zzkn[] zzknVarArr2 = new com.google.android.gms.internal.measurement.zzkn[i17];
                    if (length != 0) {
                        java.lang.System.arraycopy(zzknVarArr, 0, zzknVarArr2, 0, length);
                    }
                    while (length < i17 - 1) {
                        com.google.android.gms.internal.measurement.zzkn zzknVar = new com.google.android.gms.internal.measurement.zzkn();
                        zzknVarArr2[length] = zzknVar;
                        zzabvVar.zza(zzknVar);
                        zzabvVar.zzuw();
                        length++;
                    }
                    com.google.android.gms.internal.measurement.zzkn zzknVar2 = new com.google.android.gms.internal.measurement.zzkn();
                    zzknVarArr2[length] = zzknVar2;
                    zzabvVar.zza(zzknVar2);
                    this.zzati = zzknVarArr2;
                    break;
                case 26:
                    int zzb2 = com.google.android.gms.internal.measurement.zzach.zzb(zzabvVar, 26);
                    com.google.android.gms.internal.measurement.zzks[] zzksVarArr = this.zzatj;
                    int length2 = zzksVarArr == null ? 0 : zzksVarArr.length;
                    int i18 = zzb2 + length2;
                    com.google.android.gms.internal.measurement.zzks[] zzksVarArr2 = new com.google.android.gms.internal.measurement.zzks[i18];
                    if (length2 != 0) {
                        java.lang.System.arraycopy(zzksVarArr, 0, zzksVarArr2, 0, length2);
                    }
                    while (length2 < i18 - 1) {
                        com.google.android.gms.internal.measurement.zzks zzksVar = new com.google.android.gms.internal.measurement.zzks();
                        zzksVarArr2[length2] = zzksVar;
                        zzabvVar.zza(zzksVar);
                        zzabvVar.zzuw();
                        length2++;
                    }
                    com.google.android.gms.internal.measurement.zzks zzksVar2 = new com.google.android.gms.internal.measurement.zzks();
                    zzksVarArr2[length2] = zzksVar2;
                    zzabvVar.zza(zzksVar2);
                    this.zzatj = zzksVarArr2;
                    break;
                case 32:
                    this.zzatk = java.lang.Long.valueOf(zzabvVar.zzuz());
                    break;
                case 40:
                    this.zzatl = java.lang.Long.valueOf(zzabvVar.zzuz());
                    break;
                case 48:
                    this.zzatm = java.lang.Long.valueOf(zzabvVar.zzuz());
                    break;
                case 56:
                    this.zzato = java.lang.Long.valueOf(zzabvVar.zzuz());
                    break;
                case 66:
                    this.zzatp = zzabvVar.readString();
                    break;
                case 74:
                    this.zzatq = zzabvVar.readString();
                    break;
                case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_ERROR_CREATE_JAVA_DATASOURCE /* 82 */:
                    this.zzatr = zzabvVar.readString();
                    break;
                case 90:
                    this.zzafn = zzabvVar.readString();
                    break;
                case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_IN_SETAUDIOEFFECT /* 96 */:
                    this.zzats = java.lang.Integer.valueOf(zzabvVar.zzuy());
                    break;
                case 106:
                    this.zzadt = zzabvVar.readString();
                    break;
                case 114:
                    this.zzti = zzabvVar.readString();
                    break;
                case 130:
                    this.zzth = zzabvVar.readString();
                    break;
                case 136:
                    this.zzatt = java.lang.Long.valueOf(zzabvVar.zzuz());
                    break;
                case 144:
                    this.zzatu = java.lang.Long.valueOf(zzabvVar.zzuz());
                    break;
                case 154:
                    this.zzatv = zzabvVar.readString();
                    break;
                case 160:
                    this.zzatw = java.lang.Boolean.valueOf(zzabvVar.zzux());
                    break;
                case 170:
                    this.zzadl = zzabvVar.readString();
                    break;
                case 176:
                    this.zzatx = java.lang.Long.valueOf(zzabvVar.zzuz());
                    break;
                case 184:
                    this.zzaty = java.lang.Integer.valueOf(zzabvVar.zzuy());
                    break;
                case 194:
                    this.zzaek = zzabvVar.readString();
                    break;
                case 202:
                    this.zzadm = zzabvVar.readString();
                    break;
                case 208:
                    this.zzatn = java.lang.Long.valueOf(zzabvVar.zzuz());
                    break;
                case 224:
                    this.zzatz = java.lang.Boolean.valueOf(zzabvVar.zzux());
                    break;
                case 234:
                    int zzb3 = com.google.android.gms.internal.measurement.zzach.zzb(zzabvVar, 234);
                    com.google.android.gms.internal.measurement.zzkm[] zzkmVarArr = this.zzaua;
                    int length3 = zzkmVarArr == null ? 0 : zzkmVarArr.length;
                    int i19 = zzb3 + length3;
                    com.google.android.gms.internal.measurement.zzkm[] zzkmVarArr2 = new com.google.android.gms.internal.measurement.zzkm[i19];
                    if (length3 != 0) {
                        java.lang.System.arraycopy(zzkmVarArr, 0, zzkmVarArr2, 0, length3);
                    }
                    while (length3 < i19 - 1) {
                        com.google.android.gms.internal.measurement.zzkm zzkmVar = new com.google.android.gms.internal.measurement.zzkm();
                        zzkmVarArr2[length3] = zzkmVar;
                        zzabvVar.zza(zzkmVar);
                        zzabvVar.zzuw();
                        length3++;
                    }
                    com.google.android.gms.internal.measurement.zzkm zzkmVar2 = new com.google.android.gms.internal.measurement.zzkm();
                    zzkmVarArr2[length3] = zzkmVar2;
                    zzabvVar.zza(zzkmVar2);
                    this.zzaua = zzkmVarArr2;
                    break;
                case 242:
                    this.zzado = zzabvVar.readString();
                    break;
                case 248:
                    this.zzaub = java.lang.Integer.valueOf(zzabvVar.zzuy());
                    break;
                case 256:
                    this.zzauc = java.lang.Integer.valueOf(zzabvVar.zzuy());
                    break;
                case 264:
                    this.zzaud = java.lang.Integer.valueOf(zzabvVar.zzuy());
                    break;
                case 274:
                    this.zzaue = zzabvVar.readString();
                    break;
                case 280:
                    this.zzauf = java.lang.Long.valueOf(zzabvVar.zzuz());
                    break;
                case 288:
                    this.zzaug = java.lang.Long.valueOf(zzabvVar.zzuz());
                    break;
                case com.tencent.mm.plugin.appbrand.jsapi.webview.u.CTRL_INDEX /* 298 */:
                    this.zzauh = zzabvVar.readString();
                    break;
                case com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_RESET /* 306 */:
                    this.zzaui = zzabvVar.readString();
                    break;
                case 312:
                    this.zzauj = java.lang.Integer.valueOf(zzabvVar.zzuy());
                    break;
                default:
                    if (!super.zza(zzabvVar, zzuw)) {
                        return this;
                    }
                    break;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaby, com.google.android.gms.internal.measurement.zzace
    public final void zza(com.google.android.gms.internal.measurement.zzabw zzabwVar) {
        java.lang.Integer num = this.zzath;
        if (num != null) {
            zzabwVar.zze(1, num.intValue());
        }
        com.google.android.gms.internal.measurement.zzkn[] zzknVarArr = this.zzati;
        int i17 = 0;
        if (zzknVarArr != null && zzknVarArr.length > 0) {
            int i18 = 0;
            while (true) {
                com.google.android.gms.internal.measurement.zzkn[] zzknVarArr2 = this.zzati;
                if (i18 >= zzknVarArr2.length) {
                    break;
                }
                com.google.android.gms.internal.measurement.zzkn zzknVar = zzknVarArr2[i18];
                if (zzknVar != null) {
                    zzabwVar.zza(2, zzknVar);
                }
                i18++;
            }
        }
        com.google.android.gms.internal.measurement.zzks[] zzksVarArr = this.zzatj;
        if (zzksVarArr != null && zzksVarArr.length > 0) {
            int i19 = 0;
            while (true) {
                com.google.android.gms.internal.measurement.zzks[] zzksVarArr2 = this.zzatj;
                if (i19 >= zzksVarArr2.length) {
                    break;
                }
                com.google.android.gms.internal.measurement.zzks zzksVar = zzksVarArr2[i19];
                if (zzksVar != null) {
                    zzabwVar.zza(3, zzksVar);
                }
                i19++;
            }
        }
        java.lang.Long l17 = this.zzatk;
        if (l17 != null) {
            zzabwVar.zzb(4, l17.longValue());
        }
        java.lang.Long l18 = this.zzatl;
        if (l18 != null) {
            zzabwVar.zzb(5, l18.longValue());
        }
        java.lang.Long l19 = this.zzatm;
        if (l19 != null) {
            zzabwVar.zzb(6, l19.longValue());
        }
        java.lang.Long l27 = this.zzato;
        if (l27 != null) {
            zzabwVar.zzb(7, l27.longValue());
        }
        java.lang.String str = this.zzatp;
        if (str != null) {
            zzabwVar.zzb(8, str);
        }
        java.lang.String str2 = this.zzatq;
        if (str2 != null) {
            zzabwVar.zzb(9, str2);
        }
        java.lang.String str3 = this.zzatr;
        if (str3 != null) {
            zzabwVar.zzb(10, str3);
        }
        java.lang.String str4 = this.zzafn;
        if (str4 != null) {
            zzabwVar.zzb(11, str4);
        }
        java.lang.Integer num2 = this.zzats;
        if (num2 != null) {
            zzabwVar.zze(12, num2.intValue());
        }
        java.lang.String str5 = this.zzadt;
        if (str5 != null) {
            zzabwVar.zzb(13, str5);
        }
        java.lang.String str6 = this.zzti;
        if (str6 != null) {
            zzabwVar.zzb(14, str6);
        }
        java.lang.String str7 = this.zzth;
        if (str7 != null) {
            zzabwVar.zzb(16, str7);
        }
        java.lang.Long l28 = this.zzatt;
        if (l28 != null) {
            zzabwVar.zzb(17, l28.longValue());
        }
        java.lang.Long l29 = this.zzatu;
        if (l29 != null) {
            zzabwVar.zzb(18, l29.longValue());
        }
        java.lang.String str8 = this.zzatv;
        if (str8 != null) {
            zzabwVar.zzb(19, str8);
        }
        java.lang.Boolean bool = this.zzatw;
        if (bool != null) {
            zzabwVar.zza(20, bool.booleanValue());
        }
        java.lang.String str9 = this.zzadl;
        if (str9 != null) {
            zzabwVar.zzb(21, str9);
        }
        java.lang.Long l37 = this.zzatx;
        if (l37 != null) {
            zzabwVar.zzb(22, l37.longValue());
        }
        java.lang.Integer num3 = this.zzaty;
        if (num3 != null) {
            zzabwVar.zze(23, num3.intValue());
        }
        java.lang.String str10 = this.zzaek;
        if (str10 != null) {
            zzabwVar.zzb(24, str10);
        }
        java.lang.String str11 = this.zzadm;
        if (str11 != null) {
            zzabwVar.zzb(25, str11);
        }
        java.lang.Long l38 = this.zzatn;
        if (l38 != null) {
            zzabwVar.zzb(26, l38.longValue());
        }
        java.lang.Boolean bool2 = this.zzatz;
        if (bool2 != null) {
            zzabwVar.zza(28, bool2.booleanValue());
        }
        com.google.android.gms.internal.measurement.zzkm[] zzkmVarArr = this.zzaua;
        if (zzkmVarArr != null && zzkmVarArr.length > 0) {
            while (true) {
                com.google.android.gms.internal.measurement.zzkm[] zzkmVarArr2 = this.zzaua;
                if (i17 >= zzkmVarArr2.length) {
                    break;
                }
                com.google.android.gms.internal.measurement.zzkm zzkmVar = zzkmVarArr2[i17];
                if (zzkmVar != null) {
                    zzabwVar.zza(29, zzkmVar);
                }
                i17++;
            }
        }
        java.lang.String str12 = this.zzado;
        if (str12 != null) {
            zzabwVar.zzb(30, str12);
        }
        java.lang.Integer num4 = this.zzaub;
        if (num4 != null) {
            zzabwVar.zze(31, num4.intValue());
        }
        java.lang.Integer num5 = this.zzauc;
        if (num5 != null) {
            zzabwVar.zze(32, num5.intValue());
        }
        java.lang.Integer num6 = this.zzaud;
        if (num6 != null) {
            zzabwVar.zze(33, num6.intValue());
        }
        java.lang.String str13 = this.zzaue;
        if (str13 != null) {
            zzabwVar.zzb(34, str13);
        }
        java.lang.Long l39 = this.zzauf;
        if (l39 != null) {
            zzabwVar.zzb(35, l39.longValue());
        }
        java.lang.Long l47 = this.zzaug;
        if (l47 != null) {
            zzabwVar.zzb(36, l47.longValue());
        }
        java.lang.String str14 = this.zzauh;
        if (str14 != null) {
            zzabwVar.zzb(37, str14);
        }
        java.lang.String str15 = this.zzaui;
        if (str15 != null) {
            zzabwVar.zzb(38, str15);
        }
        java.lang.Integer num7 = this.zzauj;
        if (num7 != null) {
            zzabwVar.zze(39, num7.intValue());
        }
        super.zza(zzabwVar);
    }
}
