package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* loaded from: classes13.dex */
public abstract class zap extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1779x5cd4a1af implements android.content.DialogInterface.OnCancelListener {
    protected volatile boolean zaa;
    protected final java.util.concurrent.atomic.AtomicReference zab;
    protected final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1705x2db7dcfc zac;
    private final android.os.Handler zad;

    public zap(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1780x4bb63ba interfaceC1780x4bb63ba, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1705x2db7dcfc c1705x2db7dcfc) {
        super(interfaceC1780x4bb63ba);
        this.zab = new java.util.concurrent.atomic.AtomicReference(null);
        this.zad = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zau(android.os.Looper.getMainLooper());
        this.zac = c1705x2db7dcfc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaa(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb, int i17) {
        this.zab.set(null);
        zab(c1700xff0c58bb, i17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zad() {
        this.zab.set(null);
        zac();
    }

    private static final int zae(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zam zamVar) {
        if (zamVar == null) {
            return -1;
        }
        return zamVar.zaa();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1779x5cd4a1af
    /* renamed from: onActivityResult */
    public final void mo17908x9d4787cb(int i17, int i18, android.content.Intent intent) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zam zamVar = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zam) this.zab.get();
        if (i17 != 1) {
            if (i17 == 2) {
                int mo17630x402556f4 = this.zac.mo17630x402556f4(m17907x19263085());
                if (mo17630x402556f4 == 0) {
                    zad();
                    return;
                } else {
                    if (zamVar == null) {
                        return;
                    }
                    if (zamVar.zab().m17600x130a215f() == 18 && mo17630x402556f4 == 18) {
                        return;
                    }
                }
            }
        } else if (i18 == -1) {
            zad();
            return;
        } else if (i18 == 0) {
            if (zamVar != null) {
                zaa(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, zamVar.zab().m17607x9616526c()), zae(zamVar));
                return;
            }
            return;
        }
        if (zamVar != null) {
            zaa(zamVar.zab(), zamVar.zaa());
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        zaa(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb(13, null), zae((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zam) this.zab.get()));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1779x5cd4a1af
    /* renamed from: onCreate */
    public final void mo17909x3e5a77bb(android.os.Bundle bundle) {
        super.mo17909x3e5a77bb(bundle);
        if (bundle != null) {
            this.zab.set(bundle.getBoolean("resolving_error", false) ? new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zam(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb(bundle.getInt("failed_status"), (android.app.PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1779x5cd4a1af
    /* renamed from: onSaveInstanceState */
    public final void mo17912xa71a2260(android.os.Bundle bundle) {
        super.mo17912xa71a2260(bundle);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zam zamVar = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zam) this.zab.get();
        if (zamVar == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", zamVar.zaa());
        bundle.putInt("failed_status", zamVar.zab().m17600x130a215f());
        bundle.putParcelable("failed_resolution", zamVar.zab().m17602x8ee230a2());
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1779x5cd4a1af
    /* renamed from: onStart */
    public void mo17913xb05099c3() {
        super.mo17913xb05099c3();
        this.zaa = true;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1779x5cd4a1af
    /* renamed from: onStop */
    public void mo17914xc39f8281() {
        super.mo17914xc39f8281();
        this.zaa = false;
    }

    public abstract void zab(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb, int i17);

    public abstract void zac();

    public final void zah(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb, int i17) {
        java.util.concurrent.atomic.AtomicReference atomicReference;
        boolean z17;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zam zamVar = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zam(c1700xff0c58bb, i17);
        do {
            atomicReference = this.zab;
            while (true) {
                if (atomicReference.compareAndSet(null, zamVar)) {
                    z17 = true;
                    break;
                } else if (atomicReference.get() != null) {
                    z17 = false;
                    break;
                }
            }
            if (z17) {
                this.zad.post(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zao(this, zamVar));
                return;
            }
        } while (atomicReference.get() == null);
    }
}
