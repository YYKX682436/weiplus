package com.tencent.maas.internal;

/* loaded from: classes15.dex */
public class c extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.internal.NativeCallbackManager f48212a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.maas.internal.NativeCallbackManager nativeCallbackManager, android.os.Looper looper) {
        super(looper);
        this.f48212a = nativeCallbackManager;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock;
        com.tencent.maas.internal.a aVar;
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock2;
        android.util.SparseArray sparseArray;
        android.util.SparseIntArray sparseIntArray;
        android.util.SparseArray sparseArray2;
        android.util.SparseArray sparseArray3;
        if (message.what == 1000001) {
            int i17 = message.arg1;
            com.tencent.maas.internal.NativeCallbackManager nativeCallbackManager = this.f48212a;
            reentrantReadWriteLock = nativeCallbackManager.mCallbackMapLock;
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            readLock.lock();
            try {
                sparseArray3 = nativeCallbackManager.mCallbackMap;
                aVar = (com.tencent.maas.internal.a) sparseArray3.get(i17);
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
            aVar.invoke((com.tencent.maas.internal.NativeCallbackManager.CallbackArgs) message.obj);
            if (aVar.callOnce) {
                reentrantReadWriteLock2 = nativeCallbackManager.mCallbackMapLock;
                java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock2.writeLock();
                writeLock.lock();
                try {
                    sparseArray = nativeCallbackManager.mCallbackMap;
                    sparseArray.remove(i17);
                    sparseIntArray = nativeCallbackManager.mProgressCallbackMap;
                    int i18 = sparseIntArray.get(i17, -1);
                    if (i18 != -1) {
                        sparseArray2 = nativeCallbackManager.mCallbackMap;
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
