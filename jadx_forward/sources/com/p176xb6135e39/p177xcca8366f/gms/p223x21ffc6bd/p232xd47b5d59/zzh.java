package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59;

/* loaded from: classes16.dex */
public final class zzh extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzn<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzh> {

    /* renamed from: zzfz */
    private static volatile com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzh[] f7276x394c14;

    /* renamed from: name */
    public java.lang.String f7277x337a8b = "";

    /* renamed from: zzga */
    public com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzi f7278x394c1a = null;

    public zzh() {
        this.f7308x394c3b = null;
        this.f7321x394c44 = -1;
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzh[] zzh() {
        if (f7276x394c14 == null) {
            synchronized (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzr.f7320x394c43) {
                if (f7276x394c14 == null) {
                    f7276x394c14 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzh[0];
                }
            }
        }
        return f7276x394c14;
    }

    /* renamed from: equals */
    public final boolean m19430xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzh)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzh zzhVar = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzh) obj;
        java.lang.String str = this.f7277x337a8b;
        if (str == null) {
            if (zzhVar.f7277x337a8b != null) {
                return false;
            }
        } else if (!str.equals(zzhVar.f7277x337a8b)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzi zziVar = this.f7278x394c1a;
        if (zziVar == null) {
            if (zzhVar.f7278x394c1a != null) {
                return false;
            }
        } else if (!zziVar.m19432xb2c87fbf(zzhVar.f7278x394c1a)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzp zzpVar = this.f7308x394c3b;
        if (zzpVar != null && !zzpVar.m19447x7aab3243()) {
            return this.f7308x394c3b.m19445xb2c87fbf(zzhVar.f7308x394c3b);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzp zzpVar2 = zzhVar.f7308x394c3b;
        return zzpVar2 == null || zzpVar2.m19447x7aab3243();
    }

    /* renamed from: hashCode */
    public final int m19431x8cdac1b() {
        java.lang.String str = this.f7277x337a8b;
        int i17 = 0;
        int hashCode = 1588755189 + (str == null ? 0 : str.hashCode());
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzi zziVar = this.f7278x394c1a;
        int m19433x8cdac1b = ((hashCode * 31) + (zziVar == null ? 0 : zziVar.m19433x8cdac1b())) * 31;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzp zzpVar = this.f7308x394c3b;
        if (zzpVar != null && !zzpVar.m19447x7aab3243()) {
            i17 = this.f7308x394c3b.m19446x8cdac1b();
        }
        return m19433x8cdac1b + i17;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzt
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzt zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzk zzkVar) {
        while (true) {
            int zzj = zzkVar.zzj();
            if (zzj == 0) {
                return this;
            }
            if (zzj == 10) {
                this.f7277x337a8b = zzkVar.m19438xe22f9d47();
            } else if (zzj == 18) {
                if (this.f7278x394c1a == null) {
                    this.f7278x394c1a = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzi();
                }
                zzkVar.zza(this.f7278x394c1a);
            } else if (!super.zza(zzkVar, zzj)) {
                return this;
            }
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzn, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzt
    public final int zzg() {
        int zzg = super.zzg() + com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzl.zzb(1, this.f7277x337a8b);
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzi zziVar = this.f7278x394c1a;
        return zziVar != null ? zzg + com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzl.zzb(2, zziVar) : zzg;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzn, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzt
    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzl zzlVar) {
        zzlVar.zza(1, this.f7277x337a8b);
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzi zziVar = this.f7278x394c1a;
        if (zziVar != null) {
            zzlVar.zza(2, zziVar);
        }
        super.zza(zzlVar);
    }
}
