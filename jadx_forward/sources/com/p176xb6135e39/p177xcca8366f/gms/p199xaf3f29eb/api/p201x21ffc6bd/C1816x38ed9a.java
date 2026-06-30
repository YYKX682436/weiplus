package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* renamed from: com.google.android.gms.common.api.internal.zaat */
/* loaded from: classes13.dex */
final class C1816x38ed9a implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.ConnectionCallbacks, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.OnConnectionFailedListener {
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1819x38ed9d zaa;

    public /* synthetic */ C1816x38ed9a(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1819x38ed9d c1819x38ed9d, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1815x38ed99 c1815x38ed99) {
        this.zaa = c1819x38ed9d;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1772x6c072b70
    /* renamed from: onConnected */
    public final void mo17884xdba42fea(android.os.Bundle bundle) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e c1904x2257e52e;
        com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.zae zaeVar;
        c1904x2257e52e = this.zaa.zar;
        zaeVar = this.zaa.zak;
        ((com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.zae) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(zaeVar)).zad(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.BinderC1814x38ed98(this.zaa));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1784xee64ffae
    /* renamed from: onConnectionFailed */
    public final void mo17932xce9394ba(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb) {
        java.util.concurrent.locks.Lock lock;
        java.util.concurrent.locks.Lock lock2;
        boolean zaI;
        lock = this.zaa.zab;
        lock.lock();
        try {
            zaI = this.zaa.zaI(c1700xff0c58bb);
            if (zaI) {
                this.zaa.zaA();
                this.zaa.zaF();
            } else {
                this.zaa.zaD(c1700xff0c58bb);
            }
        } finally {
            lock2 = this.zaa.zab;
            lock2.unlock();
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1772x6c072b70
    /* renamed from: onConnectionSuspended */
    public final void mo17885x4511603e(int i17) {
    }
}
