package com.p314xaae8f345.p457x3304c6.p474x21ffc6bd;

/* loaded from: classes15.dex */
public class c extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671 f129745a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671 c4099x76754671, android.os.Looper looper) {
        super(looper);
        this.f129745a = c4099x76754671;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock;
        com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.a aVar;
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock2;
        android.util.SparseArray sparseArray;
        android.util.SparseIntArray sparseIntArray;
        android.util.SparseArray sparseArray2;
        android.util.SparseArray sparseArray3;
        if (message.what == 1000001) {
            int i17 = message.arg1;
            com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671 c4099x76754671 = this.f129745a;
            reentrantReadWriteLock = c4099x76754671.f16075xe8d39075;
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            readLock.lock();
            try {
                sparseArray3 = c4099x76754671.f16074x197d7c2a;
                aVar = (com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.a) sparseArray3.get(i17);
                readLock.unlock();
            } catch (java.lang.Exception unused) {
                readLock.unlock();
                aVar = null;
            } catch (java.lang.Throwable th6) {
                readLock.unlock();
                throw th6;
            }
            if (aVar == null) {
                return;
            }
            aVar.mo32398xb9724478((com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671.CallbackArgs) message.obj);
            if (aVar.f16080xf5b3adff) {
                reentrantReadWriteLock2 = c4099x76754671.f16075xe8d39075;
                java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock2.writeLock();
                writeLock.lock();
                try {
                    sparseArray = c4099x76754671.f16074x197d7c2a;
                    sparseArray.remove(i17);
                    sparseIntArray = c4099x76754671.f16078xb62e30bd;
                    int i18 = sparseIntArray.get(i17, -1);
                    if (i18 != -1) {
                        sparseArray2 = c4099x76754671.f16074x197d7c2a;
                        sparseArray2.remove(i18);
                    }
                } catch (java.lang.Exception unused2) {
                } catch (java.lang.Throwable th7) {
                    writeLock.unlock();
                    throw th7;
                }
                writeLock.unlock();
            }
        }
    }
}
