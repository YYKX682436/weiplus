package com.p314xaae8f345.p457x3304c6.p474x21ffc6bd;

/* renamed from: com.tencent.maas.internal.NativeCallbackManager */
/* loaded from: classes15.dex */
public class C4099x76754671 {

    /* renamed from: INVALID_CALLBACK_ID */
    public static final int f16071x24038ced = -1;

    /* renamed from: MSG_INVOKE_CALLBACK */
    private static final int f16072x3d57af4e = 1000001;
    private static final java.lang.String TAG = "NativeCallbackManager";

    /* renamed from: mCallbackHandlerThread */
    private final android.os.HandlerThread f16073x9c315f42;

    /* renamed from: mCallbackMap */
    private final android.util.SparseArray<com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.a> f16074x197d7c2a;

    /* renamed from: mCallbackMapLock */
    private final java.util.concurrent.locks.ReentrantReadWriteLock f16075xe8d39075;

    /* renamed from: mCallbackWithReturnReturnValueMap */
    private final android.util.SparseArray<com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.b> f16076x5f81dca3;

    /* renamed from: mCurrentID */
    private final java.util.concurrent.atomic.AtomicInteger f16077xa1e99667;

    /* renamed from: mProgressCallbackMap */
    private final android.util.SparseIntArray f16078xb62e30bd;

    /* renamed from: myHandler */
    private final com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.c f16079xc71567fe;

    /* renamed from: com.tencent.maas.internal.NativeCallbackManager$CallbackArgs */
    /* loaded from: classes5.dex */
    public static abstract class CallbackArgs {
    }

    public C4099x76754671() {
        this.f16077xa1e99667 = new java.util.concurrent.atomic.AtomicInteger(0);
        this.f16075xe8d39075 = new java.util.concurrent.locks.ReentrantReadWriteLock();
        this.f16074x197d7c2a = new android.util.SparseArray<>();
        this.f16078xb62e30bd = new android.util.SparseIntArray();
        this.f16076x5f81dca3 = new android.util.SparseArray<>();
        android.os.HandlerThread handlerThread = new android.os.HandlerThread(TAG);
        this.f16073x9c315f42 = handlerThread;
        handlerThread.start();
        this.f16079xc71567fe = new com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.c(this, handlerThread.getLooper());
    }

    /* renamed from: invokeWithReturnValue */
    private java.lang.Object m33780xdafbf5e3(int i17, com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671.CallbackArgs callbackArgs, android.util.SparseArray<com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.b> sparseArray) {
        com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.b bVar;
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f16075xe8d39075.readLock();
        readLock.lock();
        try {
            bVar = sparseArray.get(i17);
            readLock.unlock();
        } catch (java.lang.Exception unused) {
            readLock.unlock();
            bVar = null;
        } catch (java.lang.Throwable th6) {
            readLock.unlock();
            throw th6;
        }
        if (bVar == null) {
            return null;
        }
        java.lang.Object mo33193xb9724478 = bVar.mo33193xb9724478(callbackArgs);
        if (bVar.f16081xf5b3adff) {
            java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = this.f16075xe8d39075.writeLock();
            writeLock.lock();
            try {
                this.f16074x197d7c2a.remove(i17);
            } catch (java.lang.Exception unused2) {
            } catch (java.lang.Throwable th7) {
                writeLock.unlock();
                throw th7;
            }
            writeLock.unlock();
        }
        return mo33193xb9724478;
    }

    /* renamed from: notifyInvokeCallback */
    private void m33781xc7e44086(int i17) {
        m33782x9af1abf0(i17, null);
    }

    /* renamed from: notifyInvokeCallbackArg */
    private void m33782x9af1abf0(int i17, com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671.CallbackArgs callbackArgs) {
        this.f16079xc71567fe.obtainMessage(1000001, i17, 0, callbackArgs).sendToTarget();
    }

    /* renamed from: notifyInvokeCallbackArgWithReturnValue */
    private java.lang.Object m33783x5841af6b(int i17, com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671.CallbackArgs callbackArgs) {
        return m33780xdafbf5e3(i17, callbackArgs, this.f16076x5f81dca3);
    }

    /* renamed from: registerCallback */
    public int m33784xe7f76008(com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.a aVar) {
        int incrementAndGet = this.f16077xa1e99667.incrementAndGet();
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = this.f16075xe8d39075.writeLock();
        writeLock.lock();
        try {
            this.f16074x197d7c2a.put(incrementAndGet, aVar);
        } catch (java.lang.Exception unused) {
        } catch (java.lang.Throwable th6) {
            writeLock.unlock();
            throw th6;
        }
        writeLock.unlock();
        return incrementAndGet;
    }

    /* renamed from: registerCallbackWithReturnValue */
    public int m33785x764a4853(com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.b bVar) {
        int incrementAndGet = this.f16077xa1e99667.incrementAndGet();
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = this.f16075xe8d39075.writeLock();
        writeLock.lock();
        try {
            this.f16076x5f81dca3.put(incrementAndGet, bVar);
        } catch (java.lang.Exception unused) {
        } catch (java.lang.Throwable th6) {
            writeLock.unlock();
            throw th6;
        }
        writeLock.unlock();
        return incrementAndGet;
    }

    /* renamed from: registerProgressWithComplete */
    public int[] m33786xf8cd0e2f(com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.a aVar, com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.a aVar2) {
        if (aVar == null || aVar2 == null) {
            return new int[]{-1, -1};
        }
        int m33784xe7f76008 = m33784xe7f76008(aVar);
        int m33784xe7f760082 = m33784xe7f76008(aVar2);
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = this.f16075xe8d39075.writeLock();
        writeLock.lock();
        try {
            this.f16078xb62e30bd.put(m33784xe7f760082, m33784xe7f76008);
        } catch (java.lang.Exception unused) {
        } catch (java.lang.Throwable th6) {
            writeLock.unlock();
            throw th6;
        }
        writeLock.unlock();
        return new int[]{m33784xe7f76008, m33784xe7f760082};
    }

    /* renamed from: removeAllCallback */
    public void m33787x78c5c1e2() {
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = this.f16075xe8d39075.writeLock();
        writeLock.lock();
        try {
            this.f16074x197d7c2a.clear();
        } catch (java.lang.Exception unused) {
        } catch (java.lang.Throwable th6) {
            writeLock.unlock();
            throw th6;
        }
        writeLock.unlock();
    }

    /* renamed from: removeAllCallbackWithReturnValue */
    public void m33788xcb04b739() {
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = this.f16075xe8d39075.writeLock();
        writeLock.lock();
        try {
            this.f16076x5f81dca3.clear();
        } catch (java.lang.Exception unused) {
        } catch (java.lang.Throwable th6) {
            writeLock.unlock();
            throw th6;
        }
        writeLock.unlock();
    }

    public C4099x76754671(android.os.Looper looper) {
        this.f16077xa1e99667 = new java.util.concurrent.atomic.AtomicInteger(0);
        this.f16075xe8d39075 = new java.util.concurrent.locks.ReentrantReadWriteLock();
        this.f16074x197d7c2a = new android.util.SparseArray<>();
        this.f16078xb62e30bd = new android.util.SparseIntArray();
        this.f16076x5f81dca3 = new android.util.SparseArray<>();
        this.f16079xc71567fe = new com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.c(this, looper);
        this.f16073x9c315f42 = null;
    }
}
