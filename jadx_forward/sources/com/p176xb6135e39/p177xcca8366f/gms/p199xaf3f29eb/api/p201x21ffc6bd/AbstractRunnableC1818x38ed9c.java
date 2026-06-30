package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* renamed from: com.google.android.gms.common.api.internal.zaav */
/* loaded from: classes13.dex */
abstract class AbstractRunnableC1818x38ed9c implements java.lang.Runnable {
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1819x38ed9d zab;

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.locks.Lock lock;
        java.util.concurrent.locks.Lock lock2;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1831x38edae c1831x38edae;
        lock = this.zab.zab;
        lock.lock();
        try {
            try {
                if (!java.lang.Thread.interrupted()) {
                    zaa();
                }
            } catch (java.lang.RuntimeException e17) {
                c1831x38edae = this.zab.zaa;
                c1831x38edae.zam(e17);
            }
        } finally {
            lock2 = this.zab.zab;
            lock2.unlock();
        }
    }

    public abstract void zaa();
}
