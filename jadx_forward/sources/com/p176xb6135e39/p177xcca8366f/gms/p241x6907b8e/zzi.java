package com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e;

/* loaded from: classes13.dex */
final class zzi implements java.lang.Runnable {
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5 zza;
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzj zzb;

    public zzi(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzj zzjVar, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5 abstractC2439x27a9a5) {
        this.zzb = zzjVar;
        this.zza = abstractC2439x27a9a5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj;
        com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2433x579e812c interfaceC2433x579e812c;
        com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2433x579e812c interfaceC2433x579e812c2;
        obj = this.zzb.zzb;
        synchronized (obj) {
            com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzj zzjVar = this.zzb;
            interfaceC2433x579e812c = zzjVar.zzc;
            if (interfaceC2433x579e812c != null) {
                interfaceC2433x579e812c2 = zzjVar.zzc;
                interfaceC2433x579e812c2.mo17960x815f5438(this.zza);
            }
        }
    }
}
