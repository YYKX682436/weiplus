package com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzz implements java.lang.Runnable {
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzw zza;
    final /* synthetic */ java.util.concurrent.Callable zzb;

    public zzz(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzw zzwVar, java.util.concurrent.Callable callable) {
        this.zza = zzwVar;
        this.zzb = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.zzb(this.zzb.call());
        } catch (java.lang.Exception e17) {
            this.zza.zza(e17);
        } catch (java.lang.Throwable th6) {
            this.zza.zza(new java.lang.RuntimeException(th6));
        }
    }
}
