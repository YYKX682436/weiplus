package com.tencent.maas.internal;

/* loaded from: classes15.dex */
public class NativeCallbackManager {
    public static final int INVALID_CALLBACK_ID = -1;
    private static final int MSG_INVOKE_CALLBACK = 1000001;
    private static final java.lang.String TAG = "NativeCallbackManager";
    private final android.os.HandlerThread mCallbackHandlerThread;
    private final android.util.SparseArray<com.tencent.maas.internal.a> mCallbackMap;
    private final java.util.concurrent.locks.ReentrantReadWriteLock mCallbackMapLock;
    private final android.util.SparseArray<com.tencent.maas.internal.b> mCallbackWithReturnReturnValueMap;
    private final java.util.concurrent.atomic.AtomicInteger mCurrentID;
    private final android.util.SparseIntArray mProgressCallbackMap;
    private final com.tencent.maas.internal.c myHandler;

    /* loaded from: classes5.dex */
    public static abstract class CallbackArgs {
    }

    public NativeCallbackManager() {
        this.mCurrentID = new java.util.concurrent.atomic.AtomicInteger(0);
        this.mCallbackMapLock = new java.util.concurrent.locks.ReentrantReadWriteLock();
        this.mCallbackMap = new android.util.SparseArray<>();
        this.mProgressCallbackMap = new android.util.SparseIntArray();
        this.mCallbackWithReturnReturnValueMap = new android.util.SparseArray<>();
        android.os.HandlerThread handlerThread = new android.os.HandlerThread(TAG);
        this.mCallbackHandlerThread = handlerThread;
        handlerThread.start();
        this.myHandler = new com.tencent.maas.internal.c(this, handlerThread.getLooper());
    }

    private java.lang.Object invokeWithReturnValue(int i17, com.tencent.maas.internal.NativeCallbackManager.CallbackArgs callbackArgs, android.util.SparseArray<com.tencent.maas.internal.b> sparseArray) {
        com.tencent.maas.internal.b bVar;
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.mCallbackMapLock.readLock();
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
        java.lang.Object invoke = bVar.invoke(callbackArgs);
        if (bVar.callOnce) {
            java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = this.mCallbackMapLock.writeLock();
            writeLock.lock();
            try {
                this.mCallbackMap.remove(i17);
            } catch (java.lang.Exception unused2) {
            } catch (java.lang.Throwable th7) {
                writeLock.unlock();
                throw th7;
            }
            writeLock.unlock();
        }
        return invoke;
    }

    private void notifyInvokeCallback(int i17) {
        notifyInvokeCallbackArg(i17, null);
    }

    private void notifyInvokeCallbackArg(int i17, com.tencent.maas.internal.NativeCallbackManager.CallbackArgs callbackArgs) {
        this.myHandler.obtainMessage(1000001, i17, 0, callbackArgs).sendToTarget();
    }

    private java.lang.Object notifyInvokeCallbackArgWithReturnValue(int i17, com.tencent.maas.internal.NativeCallbackManager.CallbackArgs callbackArgs) {
        return invokeWithReturnValue(i17, callbackArgs, this.mCallbackWithReturnReturnValueMap);
    }

    public int registerCallback(com.tencent.maas.internal.a aVar) {
        int incrementAndGet = this.mCurrentID.incrementAndGet();
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = this.mCallbackMapLock.writeLock();
        writeLock.lock();
        try {
            this.mCallbackMap.put(incrementAndGet, aVar);
        } catch (java.lang.Exception unused) {
        } catch (java.lang.Throwable th6) {
            writeLock.unlock();
            throw th6;
        }
        writeLock.unlock();
        return incrementAndGet;
    }

    public int registerCallbackWithReturnValue(com.tencent.maas.internal.b bVar) {
        int incrementAndGet = this.mCurrentID.incrementAndGet();
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = this.mCallbackMapLock.writeLock();
        writeLock.lock();
        try {
            this.mCallbackWithReturnReturnValueMap.put(incrementAndGet, bVar);
        } catch (java.lang.Exception unused) {
        } catch (java.lang.Throwable th6) {
            writeLock.unlock();
            throw th6;
        }
        writeLock.unlock();
        return incrementAndGet;
    }

    public int[] registerProgressWithComplete(com.tencent.maas.internal.a aVar, com.tencent.maas.internal.a aVar2) {
        if (aVar == null || aVar2 == null) {
            return new int[]{-1, -1};
        }
        int registerCallback = registerCallback(aVar);
        int registerCallback2 = registerCallback(aVar2);
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = this.mCallbackMapLock.writeLock();
        writeLock.lock();
        try {
            this.mProgressCallbackMap.put(registerCallback2, registerCallback);
        } catch (java.lang.Exception unused) {
        } catch (java.lang.Throwable th6) {
            writeLock.unlock();
            throw th6;
        }
        writeLock.unlock();
        return new int[]{registerCallback, registerCallback2};
    }

    public void removeAllCallback() {
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = this.mCallbackMapLock.writeLock();
        writeLock.lock();
        try {
            this.mCallbackMap.clear();
        } catch (java.lang.Exception unused) {
        } catch (java.lang.Throwable th6) {
            writeLock.unlock();
            throw th6;
        }
        writeLock.unlock();
    }

    public void removeAllCallbackWithReturnValue() {
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = this.mCallbackMapLock.writeLock();
        writeLock.lock();
        try {
            this.mCallbackWithReturnReturnValueMap.clear();
        } catch (java.lang.Exception unused) {
        } catch (java.lang.Throwable th6) {
            writeLock.unlock();
            throw th6;
        }
        writeLock.unlock();
    }

    public NativeCallbackManager(android.os.Looper looper) {
        this.mCurrentID = new java.util.concurrent.atomic.AtomicInteger(0);
        this.mCallbackMapLock = new java.util.concurrent.locks.ReentrantReadWriteLock();
        this.mCallbackMap = new android.util.SparseArray<>();
        this.mProgressCallbackMap = new android.util.SparseIntArray();
        this.mCallbackWithReturnReturnValueMap = new android.util.SparseArray<>();
        this.myHandler = new com.tencent.maas.internal.c(this, looper);
        this.mCallbackHandlerThread = null;
    }
}
