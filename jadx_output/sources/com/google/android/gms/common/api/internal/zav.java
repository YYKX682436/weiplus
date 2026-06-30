package com.google.android.gms.common.api.internal;

/* loaded from: classes13.dex */
final class zav implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.api.internal.zaaa zaa;

    public zav(com.google.android.gms.common.api.internal.zaaa zaaaVar) {
        this.zaa = zaaaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.locks.Lock lock;
        java.util.concurrent.locks.Lock lock2;
        lock = this.zaa.zam;
        lock.lock();
        try {
            com.google.android.gms.common.api.internal.zaaa.zap(this.zaa);
        } finally {
            lock2 = this.zaa.zam;
            lock2.unlock();
        }
    }
}
