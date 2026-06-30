package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* renamed from: com.google.android.gms.common.api.internal.zabg */
/* loaded from: classes13.dex */
abstract class AbstractC1829x38edac {
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1828x38edab zaa;

    public AbstractC1829x38edac(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1828x38edab interfaceC1828x38edab) {
        this.zaa = interfaceC1828x38edab;
    }

    public abstract void zaa();

    public final void zab(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1831x38edae c1831x38edae) {
        java.util.concurrent.locks.Lock lock;
        java.util.concurrent.locks.Lock lock2;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1828x38edab interfaceC1828x38edab;
        lock = c1831x38edae.zai;
        lock.lock();
        try {
            interfaceC1828x38edab = c1831x38edae.zan;
            if (interfaceC1828x38edab == this.zaa) {
                zaa();
            }
        } finally {
            lock2 = c1831x38edae.zai;
            lock2.unlock();
        }
    }
}
