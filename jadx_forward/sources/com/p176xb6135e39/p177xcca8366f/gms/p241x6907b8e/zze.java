package com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e;

/* loaded from: classes13.dex */
final class zze implements java.lang.Runnable {
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5 zza;
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzf zzb;

    public zze(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzf zzfVar, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5 abstractC2439x27a9a5) {
        this.zzb = zzfVar;
        this.zza = abstractC2439x27a9a5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzw zzwVar;
        com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzw zzwVar2;
        com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzw zzwVar3;
        com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2429xdcb5ca57 interfaceC2429xdcb5ca57;
        try {
            interfaceC2429xdcb5ca57 = this.zzb.zzb;
            com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5 abstractC2439x27a9a5 = (com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5) interfaceC2429xdcb5ca57.mo14585x364e1d(this.zza);
            if (abstractC2439x27a9a5 == null) {
                this.zzb.mo19575xee232ab(new java.lang.NullPointerException("Continuation returned null"));
                return;
            }
            com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzf zzfVar = this.zzb;
            java.util.concurrent.Executor executor = com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2441x6127a1db.zza;
            abstractC2439x27a9a5.mo19589xb1e20357(executor, zzfVar);
            abstractC2439x27a9a5.mo19586x96fe7dde(executor, this.zzb);
            abstractC2439x27a9a5.mo19580xc26366ed(executor, this.zzb);
        } catch (com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2437x9e6085ef e17) {
            if (e17.getCause() instanceof java.lang.Exception) {
                zzwVar3 = this.zzb.zzc;
                zzwVar3.zza((java.lang.Exception) e17.getCause());
            } else {
                zzwVar2 = this.zzb.zzc;
                zzwVar2.zza(e17);
            }
        } catch (java.lang.Exception e18) {
            zzwVar = this.zzb.zzc;
            zzwVar.zza(e18);
        }
    }
}
