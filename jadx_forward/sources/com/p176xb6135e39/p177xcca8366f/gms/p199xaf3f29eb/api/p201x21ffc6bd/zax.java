package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zax implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1848x38edbf {
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1797x38ed87 zaa;

    public /* synthetic */ zax(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1797x38ed87 c1797x38ed87, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zaw zawVar) {
        this.zaa = c1797x38ed87;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1848x38edbf
    public final void zaa(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb) {
        java.util.concurrent.locks.Lock lock;
        java.util.concurrent.locks.Lock lock2;
        lock = this.zaa.zam;
        lock.lock();
        try {
            this.zaa.zaj = c1700xff0c58bb;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1797x38ed87.zap(this.zaa);
        } finally {
            lock2 = this.zaa.zam;
            lock2.unlock();
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1848x38edbf
    public final void zab(android.os.Bundle bundle) {
        java.util.concurrent.locks.Lock lock;
        java.util.concurrent.locks.Lock lock2;
        lock = this.zaa.zam;
        lock.lock();
        try {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1797x38ed87.zao(this.zaa, bundle);
            this.zaa.zaj = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb.f5810x535c1c1;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1797x38ed87.zap(this.zaa);
        } finally {
            lock2 = this.zaa.zam;
            lock2.unlock();
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1848x38edbf
    public final void zac(int i17, boolean z17) {
        java.util.concurrent.locks.Lock lock;
        java.util.concurrent.locks.Lock lock2;
        boolean z18;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb2;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1831x38edae c1831x38edae;
        lock = this.zaa.zam;
        lock.lock();
        try {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1797x38ed87 c1797x38ed87 = this.zaa;
            z18 = c1797x38ed87.zal;
            if (!z18) {
                c1700xff0c58bb = c1797x38ed87.zak;
                if (c1700xff0c58bb != null) {
                    c1700xff0c58bb2 = c1797x38ed87.zak;
                    if (c1700xff0c58bb2.m17605x6e268779()) {
                        this.zaa.zal = true;
                        c1831x38edae = this.zaa.zae;
                        c1831x38edae.mo17885x4511603e(i17);
                    }
                }
            }
            this.zaa.zal = false;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1797x38ed87.zan(this.zaa, i17, z17);
        } finally {
            lock2 = this.zaa.zam;
            lock2.unlock();
        }
    }
}
