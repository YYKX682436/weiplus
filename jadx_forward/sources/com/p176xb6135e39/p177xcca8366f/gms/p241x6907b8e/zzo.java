package com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e;

/* loaded from: classes13.dex */
final class zzo implements java.lang.Runnable {
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5 zza;
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzp zzb;

    public zzo(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzp zzpVar, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5 abstractC2439x27a9a5) {
        this.zzb = zzpVar;
        this.zza = abstractC2439x27a9a5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2438xddc7e5ba interfaceC2438xddc7e5ba;
        try {
            interfaceC2438xddc7e5ba = this.zzb.zzb;
            com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5 mo18451x364e1d = interfaceC2438xddc7e5ba.mo18451x364e1d(this.zza.mo19595x2d64eb13());
            if (mo18451x364e1d == null) {
                this.zzb.mo19575xee232ab(new java.lang.NullPointerException("Continuation returned null"));
                return;
            }
            com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzp zzpVar = this.zzb;
            java.util.concurrent.Executor executor = com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2441x6127a1db.zza;
            mo18451x364e1d.mo19589xb1e20357(executor, zzpVar);
            mo18451x364e1d.mo19586x96fe7dde(executor, this.zzb);
            mo18451x364e1d.mo19580xc26366ed(executor, this.zzb);
        } catch (com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2437x9e6085ef e17) {
            if (e17.getCause() instanceof java.lang.Exception) {
                this.zzb.mo19575xee232ab((java.lang.Exception) e17.getCause());
            } else {
                this.zzb.mo19575xee232ab(e17);
            }
        } catch (java.util.concurrent.CancellationException unused) {
            this.zzb.mo19574x9dc2a798();
        } catch (java.lang.Exception e18) {
            this.zzb.mo19575xee232ab(e18);
        }
    }
}
