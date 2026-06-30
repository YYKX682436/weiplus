package com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e;

/* loaded from: classes13.dex */
final class zzv extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1779x5cd4a1af {
    private final java.util.List zza;

    private zzv(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1780x4bb63ba interfaceC1780x4bb63ba) {
        super(interfaceC1780x4bb63ba);
        this.zza = new java.util.ArrayList();
        this.f5910xb6d8aaed.mo17915xbba9cc06("TaskOnStopCallback", this);
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzv zza(android.app.Activity activity) {
        com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzv zzvVar;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1780x4bb63ba m17903x197d1fc6 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1779x5cd4a1af.m17903x197d1fc6(activity);
        synchronized (m17903x197d1fc6) {
            zzvVar = (com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzv) m17903x197d1fc6.mo17916x3e046fa5("TaskOnStopCallback", com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzv.class);
            if (zzvVar == null) {
                zzvVar = new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzv(m17903x197d1fc6);
            }
        }
        return zzvVar;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1779x5cd4a1af
    /* renamed from: onStop */
    public final void mo17914xc39f8281() {
        synchronized (this.zza) {
            java.util.Iterator it = this.zza.iterator();
            while (it.hasNext()) {
                com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzq zzqVar = (com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzq) ((java.lang.ref.WeakReference) it.next()).get();
                if (zzqVar != null) {
                    zzqVar.zzc();
                }
            }
            this.zza.clear();
        }
    }

    public final void zzb(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzq zzqVar) {
        synchronized (this.zza) {
            this.zza.add(new java.lang.ref.WeakReference(zzqVar));
        }
    }
}
