package com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e;

/* loaded from: classes13.dex */
final class zzm implements java.lang.Runnable {
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5 zza;
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzn zzb;

    public zzm(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzn zznVar, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5 abstractC2439x27a9a5) {
        this.zzb = zznVar;
        this.zza = abstractC2439x27a9a5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj;
        com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2435xce0545d8 interfaceC2435xce0545d8;
        com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2435xce0545d8 interfaceC2435xce0545d82;
        obj = this.zzb.zzb;
        synchronized (obj) {
            com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzn zznVar = this.zzb;
            interfaceC2435xce0545d8 = zznVar.zzc;
            if (interfaceC2435xce0545d8 != null) {
                interfaceC2435xce0545d82 = zznVar.zzc;
                interfaceC2435xce0545d82.mo19576xe05b4124(this.zza.mo19595x2d64eb13());
            }
        }
    }
}
