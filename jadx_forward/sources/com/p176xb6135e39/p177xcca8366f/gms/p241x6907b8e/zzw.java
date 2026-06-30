package com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzw<TResult> extends com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<TResult> {
    private final java.lang.Object zza = new java.lang.Object();
    private final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzr zzb = new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzr();
    private boolean zzc;
    private volatile boolean zzd;
    private java.lang.Object zze;
    private java.lang.Exception zzf;

    private final void zzf() {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18221xe071d469(this.zzc, "Task is not yet complete");
    }

    private final void zzg() {
        if (this.zzd) {
            throw new java.util.concurrent.CancellationException("Task is already canceled.");
        }
    }

    private final void zzh() {
        if (this.zzc) {
            throw com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2430xe27388a3.of(this);
        }
    }

    private final void zzi() {
        synchronized (this.zza) {
            if (this.zzc) {
                this.zzb.zzb(this);
            }
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5
    /* renamed from: addOnCanceledListener */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<TResult> mo19578xc26366ed(android.app.Activity activity, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2432x2aa8748c interfaceC2432x2aa8748c) {
        com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzh zzhVar = new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzh(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2441x6127a1db.f7458xf272cf50, interfaceC2432x2aa8748c);
        this.zzb.zza(zzhVar);
        com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzv.zza(activity).zzb(zzhVar);
        zzi();
        return this;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5
    /* renamed from: addOnCompleteListener */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<TResult> mo19581xef59738d(android.app.Activity activity, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2433x579e812c<TResult> interfaceC2433x579e812c) {
        com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzj zzjVar = new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzj(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2441x6127a1db.f7458xf272cf50, interfaceC2433x579e812c);
        this.zzb.zza(zzjVar);
        com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzv.zza(activity).zzb(zzjVar);
        zzi();
        return this;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5
    /* renamed from: addOnFailureListener */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<TResult> mo19584x96fe7dde(android.app.Activity activity, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2434xb321c05f interfaceC2434xb321c05f) {
        com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzl zzlVar = new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzl(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2441x6127a1db.f7458xf272cf50, interfaceC2434xb321c05f);
        this.zzb.zza(zzlVar);
        com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzv.zza(activity).zzb(zzlVar);
        zzi();
        return this;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5
    /* renamed from: addOnSuccessListener */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<TResult> mo19587xb1e20357(android.app.Activity activity, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2435xce0545d8<? super TResult> interfaceC2435xce0545d8) {
        com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzn zznVar = new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzn(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2441x6127a1db.f7458xf272cf50, interfaceC2435xce0545d8);
        this.zzb.zza(zznVar);
        com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzv.zza(activity).zzb(zznVar);
        zzi();
        return this;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5
    /* renamed from: continueWith */
    public final <TContinuationResult> com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<TContinuationResult> mo19590xd315a60d(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2429xdcb5ca57<TResult, TContinuationResult> interfaceC2429xdcb5ca57) {
        return mo19591xd315a60d(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2441x6127a1db.f7458xf272cf50, interfaceC2429xdcb5ca57);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5
    /* renamed from: continueWithTask */
    public final <TContinuationResult> com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<TContinuationResult> mo19592x64b18132(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2429xdcb5ca57<TResult, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<TContinuationResult>> interfaceC2429xdcb5ca57) {
        return mo19593x64b18132(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2441x6127a1db.f7458xf272cf50, interfaceC2429xdcb5ca57);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5
    /* renamed from: getException */
    public final java.lang.Exception mo19594x57bd4199() {
        java.lang.Exception exc;
        synchronized (this.zza) {
            exc = this.zzf;
        }
        return exc;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5
    /* renamed from: getResult */
    public final TResult mo19595x2d64eb13() {
        TResult tresult;
        synchronized (this.zza) {
            zzf();
            zzg();
            java.lang.Exception exc = this.zzf;
            if (exc == null) {
                tresult = (TResult) this.zze;
            } else {
                throw new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2437x9e6085ef(exc);
            }
        }
        return tresult;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5
    /* renamed from: isCanceled */
    public final boolean mo19597xc9602be3() {
        return this.zzd;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5
    /* renamed from: isComplete */
    public final boolean mo19598xacfcd883() {
        boolean z17;
        synchronized (this.zza) {
            z17 = this.zzc;
        }
        return z17;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5
    /* renamed from: isSuccessful */
    public final boolean mo19599x55b0a764() {
        boolean z17;
        synchronized (this.zza) {
            z17 = false;
            if (this.zzc && !this.zzd && this.zzf == null) {
                z17 = true;
            }
        }
        return z17;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5
    /* renamed from: onSuccessTask */
    public final <TContinuationResult> com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<TContinuationResult> mo19600xd0f5b8c9(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2438xddc7e5ba<TResult, TContinuationResult> interfaceC2438xddc7e5ba) {
        java.util.concurrent.Executor executor = com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2441x6127a1db.f7458xf272cf50;
        com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzw zzwVar = new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzw();
        this.zzb.zza(new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzp(executor, interfaceC2438xddc7e5ba, zzwVar));
        zzi();
        return zzwVar;
    }

    public final void zza(java.lang.Exception exc) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(exc, "Exception must not be null");
        synchronized (this.zza) {
            zzh();
            this.zzc = true;
            this.zzf = exc;
        }
        this.zzb.zzb(this);
    }

    public final void zzb(java.lang.Object obj) {
        synchronized (this.zza) {
            zzh();
            this.zzc = true;
            this.zze = obj;
        }
        this.zzb.zzb(this);
    }

    public final boolean zzc() {
        synchronized (this.zza) {
            if (this.zzc) {
                return false;
            }
            this.zzc = true;
            this.zzd = true;
            this.zzb.zzb(this);
            return true;
        }
    }

    public final boolean zzd(java.lang.Exception exc) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(exc, "Exception must not be null");
        synchronized (this.zza) {
            if (this.zzc) {
                return false;
            }
            this.zzc = true;
            this.zzf = exc;
            this.zzb.zzb(this);
            return true;
        }
    }

    public final boolean zze(java.lang.Object obj) {
        synchronized (this.zza) {
            if (this.zzc) {
                return false;
            }
            this.zzc = true;
            this.zze = obj;
            this.zzb.zzb(this);
            return true;
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5
    /* renamed from: continueWith */
    public final <TContinuationResult> com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<TContinuationResult> mo19591xd315a60d(java.util.concurrent.Executor executor, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2429xdcb5ca57<TResult, TContinuationResult> interfaceC2429xdcb5ca57) {
        com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzw zzwVar = new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzw();
        this.zzb.zza(new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzd(executor, interfaceC2429xdcb5ca57, zzwVar));
        zzi();
        return zzwVar;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5
    /* renamed from: continueWithTask */
    public final <TContinuationResult> com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<TContinuationResult> mo19593x64b18132(java.util.concurrent.Executor executor, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2429xdcb5ca57<TResult, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<TContinuationResult>> interfaceC2429xdcb5ca57) {
        com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzw zzwVar = new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzw();
        this.zzb.zza(new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzf(executor, interfaceC2429xdcb5ca57, zzwVar));
        zzi();
        return zzwVar;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5
    /* renamed from: addOnCanceledListener */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<TResult> mo19579xc26366ed(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2432x2aa8748c interfaceC2432x2aa8748c) {
        mo19580xc26366ed(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2441x6127a1db.f7458xf272cf50, interfaceC2432x2aa8748c);
        return this;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5
    /* renamed from: addOnCompleteListener */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<TResult> mo19582xef59738d(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2433x579e812c<TResult> interfaceC2433x579e812c) {
        this.zzb.zza(new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzj(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2441x6127a1db.f7458xf272cf50, interfaceC2433x579e812c));
        zzi();
        return this;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5
    /* renamed from: addOnFailureListener */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<TResult> mo19585x96fe7dde(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2434xb321c05f interfaceC2434xb321c05f) {
        mo19586x96fe7dde(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2441x6127a1db.f7458xf272cf50, interfaceC2434xb321c05f);
        return this;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5
    /* renamed from: addOnSuccessListener */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<TResult> mo19588xb1e20357(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2435xce0545d8<? super TResult> interfaceC2435xce0545d8) {
        mo19589xb1e20357(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2441x6127a1db.f7458xf272cf50, interfaceC2435xce0545d8);
        return this;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5
    /* renamed from: onSuccessTask */
    public final <TContinuationResult> com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<TContinuationResult> mo19601xd0f5b8c9(java.util.concurrent.Executor executor, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2438xddc7e5ba<TResult, TContinuationResult> interfaceC2438xddc7e5ba) {
        com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzw zzwVar = new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzw();
        this.zzb.zza(new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzp(executor, interfaceC2438xddc7e5ba, zzwVar));
        zzi();
        return zzwVar;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5
    /* renamed from: addOnCanceledListener */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<TResult> mo19580xc26366ed(java.util.concurrent.Executor executor, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2432x2aa8748c interfaceC2432x2aa8748c) {
        this.zzb.zza(new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzh(executor, interfaceC2432x2aa8748c));
        zzi();
        return this;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5
    /* renamed from: addOnFailureListener */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<TResult> mo19586x96fe7dde(java.util.concurrent.Executor executor, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2434xb321c05f interfaceC2434xb321c05f) {
        this.zzb.zza(new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzl(executor, interfaceC2434xb321c05f));
        zzi();
        return this;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5
    /* renamed from: addOnSuccessListener */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<TResult> mo19589xb1e20357(java.util.concurrent.Executor executor, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2435xce0545d8<? super TResult> interfaceC2435xce0545d8) {
        this.zzb.zza(new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzn(executor, interfaceC2435xce0545d8));
        zzi();
        return this;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5
    /* renamed from: addOnCompleteListener */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<TResult> mo19583xef59738d(java.util.concurrent.Executor executor, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2433x579e812c<TResult> interfaceC2433x579e812c) {
        this.zzb.zza(new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzj(executor, interfaceC2433x579e812c));
        zzi();
        return this;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5
    /* renamed from: getResult */
    public final <X extends java.lang.Throwable> TResult mo19596x2d64eb13(java.lang.Class<X> cls) {
        TResult tresult;
        synchronized (this.zza) {
            zzf();
            zzg();
            if (!cls.isInstance(this.zzf)) {
                java.lang.Exception exc = this.zzf;
                if (exc == null) {
                    tresult = (TResult) this.zze;
                } else {
                    throw new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2437x9e6085ef(exc);
                }
            } else {
                throw cls.cast(this.zzf);
            }
        }
        return tresult;
    }
}
