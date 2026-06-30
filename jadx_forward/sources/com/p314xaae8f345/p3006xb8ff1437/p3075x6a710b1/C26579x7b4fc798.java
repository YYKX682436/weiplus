package com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1;

/* renamed from: com.tencent.thumbplayer.utils.TPReadWriteLock */
/* loaded from: classes13.dex */
public class C26579x7b4fc798 extends java.util.concurrent.locks.ReentrantReadWriteLock {

    /* renamed from: INTERRUPTED_TIMES */
    private static final int f55361x159592c9 = 3;
    private static final java.lang.String TAG = "TPReadWriteLock";

    /* renamed from: mWriteLockCond */
    private java.util.concurrent.locks.Condition f55362x5ec6d07f = writeLock().newCondition();

    /* renamed from: read */
    public void m104380x355996() {
        readLock().lock();
    }

    /* renamed from: readTryLock */
    public boolean m104381x95960f10(long j17) {
        int i17 = 3;
        while (true) {
            i17--;
            if (i17 < 0) {
                throw new java.lang.InterruptedException("tryLock interrupted.");
            }
            try {
                return readLock().tryLock(j17, java.util.concurrent.TimeUnit.MICROSECONDS);
            } catch (java.lang.InterruptedException e17) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
            }
        }
    }

    /* renamed from: unReadLock */
    public void m104382x2b19a19a() {
        readLock().unlock();
    }

    /* renamed from: unWriteLock */
    public void m104383x27aff711() {
        writeLock().unlock();
    }

    /* renamed from: write */
    public void m104384x6c257df() {
        writeLock().lock();
    }

    /* renamed from: writeLockCondSignal */
    public void m104385xa9a081b4() {
        this.f55362x5ec6d07f.signal();
    }

    /* renamed from: writeLockCondSignalAll */
    public void m104386xad56b34d() {
        this.f55362x5ec6d07f.signalAll();
    }

    /* renamed from: writeLockCondWait */
    public boolean m104387x6923f781(long j17) {
        int i17 = 3;
        while (true) {
            i17--;
            if (i17 < 0) {
                return false;
            }
            try {
                return this.f55362x5ec6d07f.await(j17, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.lang.InterruptedException e17) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
            }
        }
    }

    /* renamed from: writeTryLock */
    public boolean m104388x63451ca7(long j17) {
        int i17 = 3;
        while (true) {
            i17--;
            if (i17 < 0) {
                throw new java.lang.InterruptedException("tryLock interrupted.");
            }
            try {
                return writeLock().tryLock(j17, java.util.concurrent.TimeUnit.MICROSECONDS);
            } catch (java.lang.InterruptedException e17) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
            }
        }
    }
}
