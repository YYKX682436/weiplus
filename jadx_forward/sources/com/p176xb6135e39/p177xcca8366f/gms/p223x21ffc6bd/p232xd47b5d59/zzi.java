package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59;

/* loaded from: classes16.dex */
public final class zzi extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzn<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzi> {

    /* renamed from: zzgb */
    private static volatile com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzi[] f7279x394c1b;

    /* renamed from: type */
    public int f7280x368f3a = 1;

    /* renamed from: zzgc */
    public com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzj f7281x394c1c = null;

    public zzi() {
        this.f7308x394c3b = null;
        this.f7321x394c44 = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzt
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzi zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzk zzkVar) {
        while (true) {
            int zzj = zzkVar.zzj();
            if (zzj == 0) {
                return this;
            }
            if (zzj == 8) {
                int m19436xa86cd69f = zzkVar.m19436xa86cd69f();
                try {
                    int zzk = zzkVar.zzk();
                    if (zzk <= 0 || zzk > 15) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(36);
                        sb6.append(zzk);
                        sb6.append(" is not a valid enum Type");
                        throw new java.lang.IllegalArgumentException(sb6.toString());
                        break;
                    }
                    this.f7280x368f3a = zzk;
                } catch (java.lang.IllegalArgumentException unused) {
                    zzkVar.zzg(m19436xa86cd69f);
                    zza(zzkVar, zzj);
                }
            } else if (zzj == 18) {
                if (this.f7281x394c1c == null) {
                    this.f7281x394c1c = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzj();
                }
                zzkVar.zza(this.f7281x394c1c);
            } else if (!super.zza(zzkVar, zzj)) {
                return this;
            }
        }
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzi[] zzi() {
        if (f7279x394c1b == null) {
            synchronized (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzr.f7320x394c43) {
                if (f7279x394c1b == null) {
                    f7279x394c1b = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzi[0];
                }
            }
        }
        return f7279x394c1b;
    }

    /* renamed from: equals */
    public final boolean m19432xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzi)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzi zziVar = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzi) obj;
        if (this.f7280x368f3a != zziVar.f7280x368f3a) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzj zzjVar = this.f7281x394c1c;
        if (zzjVar == null) {
            if (zziVar.f7281x394c1c != null) {
                return false;
            }
        } else if (!zzjVar.m19434xb2c87fbf(zziVar.f7281x394c1c)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzp zzpVar = this.f7308x394c3b;
        if (zzpVar != null && !zzpVar.m19447x7aab3243()) {
            return this.f7308x394c3b.m19445xb2c87fbf(zziVar.f7308x394c3b);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzp zzpVar2 = zziVar.f7308x394c3b;
        return zzpVar2 == null || zzpVar2.m19447x7aab3243();
    }

    /* renamed from: hashCode */
    public final int m19433x8cdac1b() {
        int i17 = 1588755220 + this.f7280x368f3a;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzj zzjVar = this.f7281x394c1c;
        int i18 = 0;
        int m19435x8cdac1b = ((i17 * 31) + (zzjVar == null ? 0 : zzjVar.m19435x8cdac1b())) * 31;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzp zzpVar = this.f7308x394c3b;
        if (zzpVar != null && !zzpVar.m19447x7aab3243()) {
            i18 = this.f7308x394c3b.m19446x8cdac1b();
        }
        return m19435x8cdac1b + i18;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzn, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzt
    public final int zzg() {
        int zzg = super.zzg() + com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzl.zze(1, this.f7280x368f3a);
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzj zzjVar = this.f7281x394c1c;
        return zzjVar != null ? zzg + com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzl.zzb(2, zzjVar) : zzg;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzn, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzt
    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzl zzlVar) {
        zzlVar.zzd(1, this.f7280x368f3a);
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzj zzjVar = this.f7281x394c1c;
        if (zzjVar != null) {
            zzlVar.zza(2, zzjVar);
        }
        super.zza(zzlVar);
    }
}
