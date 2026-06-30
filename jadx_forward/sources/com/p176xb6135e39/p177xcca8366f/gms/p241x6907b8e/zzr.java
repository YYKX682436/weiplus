package com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzr {
    private final java.lang.Object zza = new java.lang.Object();
    private java.util.Queue zzb;
    private boolean zzc;

    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzq zzqVar) {
        synchronized (this.zza) {
            if (this.zzb == null) {
                this.zzb = new java.util.ArrayDeque();
            }
            this.zzb.add(zzqVar);
        }
    }

    public final void zzb(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5 abstractC2439x27a9a5) {
        com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzq zzqVar;
        synchronized (this.zza) {
            if (this.zzb != null && !this.zzc) {
                this.zzc = true;
                while (true) {
                    synchronized (this.zza) {
                        zzqVar = (com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzq) this.zzb.poll();
                        if (zzqVar == null) {
                            this.zzc = false;
                            return;
                        }
                    }
                    zzqVar.zzd(abstractC2439x27a9a5);
                }
            }
        }
    }
}
