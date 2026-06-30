package com.google.android.gms.common.api.internal;

/* loaded from: classes13.dex */
abstract class zabg {
    private final com.google.android.gms.common.api.internal.zabf zaa;

    public zabg(com.google.android.gms.common.api.internal.zabf zabfVar) {
        this.zaa = zabfVar;
    }

    public abstract void zaa();

    public final void zab(com.google.android.gms.common.api.internal.zabi zabiVar) {
        java.util.concurrent.locks.Lock lock;
        java.util.concurrent.locks.Lock lock2;
        com.google.android.gms.common.api.internal.zabf zabfVar;
        lock = zabiVar.zai;
        lock.lock();
        try {
            zabfVar = zabiVar.zan;
            if (zabfVar == this.zaa) {
                zaa();
            }
        } finally {
            lock2 = zabiVar.zai;
            lock2.unlock();
        }
    }
}
