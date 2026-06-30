package com.google.android.gms.common.api.internal;

/* loaded from: classes13.dex */
abstract class zaav implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.api.internal.zaaw zab;

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.locks.Lock lock;
        java.util.concurrent.locks.Lock lock2;
        com.google.android.gms.common.api.internal.zabi zabiVar;
        lock = this.zab.zab;
        lock.lock();
        try {
            try {
                if (!java.lang.Thread.interrupted()) {
                    zaa();
                }
            } catch (java.lang.RuntimeException e17) {
                zabiVar = this.zab.zaa;
                zabiVar.zam(e17);
            }
        } finally {
            lock2 = this.zab.zab;
            lock2.unlock();
        }
    }

    public abstract void zaa();
}
