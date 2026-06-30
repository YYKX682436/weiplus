package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59;

/* loaded from: classes16.dex */
public abstract class zzn<M extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzn<M>> extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzt {

    /* renamed from: zzhc */
    protected com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzp f7308x394c3b;

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzt
    /* renamed from: clone */
    public /* synthetic */ java.lang.Object mo19439x5a5dd5d() {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzn zznVar = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzn) super.mo19439x5a5dd5d();
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzr.zza(this, zznVar);
        return zznVar;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzt
    public void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzl zzlVar) {
        if (this.f7308x394c3b == null) {
            return;
        }
        for (int i17 = 0; i17 < this.f7308x394c3b.m19448x35e001(); i17++) {
            this.f7308x394c3b.zzp(i17).zza(zzlVar);
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzt
    public int zzg() {
        if (this.f7308x394c3b == null) {
            return 0;
        }
        int i17 = 0;
        for (int i18 = 0; i18 < this.f7308x394c3b.m19448x35e001(); i18++) {
            i17 += this.f7308x394c3b.zzp(i18).zzg();
        }
        return i17;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzt
    /* renamed from: zzs */
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzt mo19439x5a5dd5d() {
        return (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzn) mo19439x5a5dd5d();
    }

    public final boolean zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzk zzkVar, int i17) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzq zzo;
        int m19436xa86cd69f = zzkVar.m19436xa86cd69f();
        if (!zzkVar.zzd(i17)) {
            return false;
        }
        int i18 = i17 >>> 3;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzv zzvVar = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzv(i17, zzkVar.zzb(m19436xa86cd69f, zzkVar.m19436xa86cd69f() - m19436xa86cd69f));
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzp zzpVar = this.f7308x394c3b;
        if (zzpVar == null) {
            this.f7308x394c3b = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzp();
            zzo = null;
        } else {
            zzo = zzpVar.zzo(i18);
        }
        if (zzo == null) {
            zzo = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzq();
            this.f7308x394c3b.zza(i18, zzo);
        }
        zzo.zza(zzvVar);
        return true;
    }
}
