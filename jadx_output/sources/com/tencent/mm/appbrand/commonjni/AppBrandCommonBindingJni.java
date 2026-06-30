package com.tencent.mm.appbrand.commonjni;

/* loaded from: classes7.dex */
public class AppBrandCommonBindingJni {
    private static final java.lang.String TAG = "MicroMsg.AppBrandCommonBindingJni";
    private bl.a mAppBrandDelegate;
    private long mNativeHandle = 0;
    public long isolatePtr = 0;
    public long contextPtr = 0;
    public long uvPtr = 0;

    static {
        bl.d.f21674a.loadLibrary("wxa-runtime-binding");
    }

    public AppBrandCommonBindingJni(bl.a aVar) {
        java.util.Objects.requireNonNull(aVar);
        this.mAppBrandDelegate = aVar;
    }

    private native void nativeBindConsoleTo(long j17, long j18, long j19, long j27);

    private native void nativeBindTo(long j17, long j18, long j19, long j27);

    public static native boolean nativeBrotliDecompress(java.lang.String str, java.lang.String str2);

    private native long nativeCreate(com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJniParams appBrandCommonBindingJniParams);

    private native void nativeDestroy(long j17);

    private native void nativeEvaluateScript(long j17, java.lang.String str, android.webkit.ValueCallback<java.lang.String> valueCallback);

    private native void nativeEvaluateScriptInWorker(long j17, int i17, java.lang.String str, android.webkit.ValueCallback<java.lang.String> valueCallback);

    private native int nativeGenerateBufferId(long j17, int i17);

    private native java.lang.Object nativeGetJSByteDataAndRemove(long j17, int i17, int i18, boolean z17);

    private native void nativeInvokeCallbackHandler(long j17, int i17, java.lang.String str, java.lang.String str2);

    private native boolean nativeIsJsThreadCurrent(long j17, int i17);

    private native void nativeNotifyContextCreated(long j17, long j18, long j19, java.lang.String str);

    private native void nativePause(long j17);

    private native void nativePostRuntimeReady(long j17, long j18, java.lang.Class cls);

    private native void nativePostToJsThread(long j17, int i17, java.lang.Runnable runnable, boolean z17, boolean z18);

    private native void nativePutByteData(long j17, int i17, int i18, java.lang.Object obj, boolean z17, int i19, int i27);

    private native void nativeReleaseDirectBuffer(java.nio.ByteBuffer byteBuffer);

    private native void nativeRequestV8GarbageCollectionForTest(long j17);

    private native void nativeRequestV8StackTrace(long j17);

    private native void nativeResume(long j17);

    private native void nativeRuntimeReady(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3);

    private native void nativeSendInspectorMsg(long j17, int i17, java.lang.String str);

    private native void nativeSetInstanceId(long j17, java.lang.String str);

    private native void nativeStartInspector(long j17, int i17);

    private native void nativeStartInspectorOnJS(long j17, int i17);

    private native void nativeStopInspector(long j17, int i17);

    private native void nativeSubscribeHandler(long j17, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3);

    private native void nativeSuspend(long j17);

    public com.tencent.mm.appbrand.commonjni.BatchRequestWxaFileDescriptorsResponse batchRequestWxaFileDescriptors(java.lang.String[] strArr, java.lang.Object obj) {
        return this.mAppBrandDelegate.A(strArr, obj != null ? (java.util.Map) obj : null);
    }

    public boolean doInnerLoopTask() {
        return this.mAppBrandDelegate.j();
    }

    public synchronized void evaluateScript(java.lang.String str, android.webkit.ValueCallback<java.lang.String> valueCallback) {
        long j17 = this.mNativeHandle;
        if (j17 != 0) {
            nativeEvaluateScript(j17, str, valueCallback);
        }
    }

    public synchronized void evaluateScriptInWorker(java.lang.String str, int i17, android.webkit.ValueCallback<java.lang.String> valueCallback) {
        long j17 = this.mNativeHandle;
        if (j17 != 0) {
            nativeEvaluateScriptInWorker(j17, i17, str, valueCallback);
        }
    }

    public synchronized int generateBufferId(int i17) {
        long j17 = this.mNativeHandle;
        if (j17 == 0) {
            return 0;
        }
        return nativeGenerateBufferId(j17, i17);
    }

    public java.lang.String[] getAsyncableJsApis() {
        return this.mAppBrandDelegate.T();
    }

    public synchronized java.nio.ByteBuffer getJSByteBufferAndRemove(int i17, int i18, boolean z17) {
        long j17 = this.mNativeHandle;
        if (j17 == 0) {
            return null;
        }
        java.lang.Object nativeGetJSByteDataAndRemove = nativeGetJSByteDataAndRemove(j17, i17, i18, z17);
        if (nativeGetJSByteDataAndRemove == null) {
            return null;
        }
        if (z17) {
            return (java.nio.ByteBuffer) nativeGetJSByteDataAndRemove;
        }
        return java.nio.ByteBuffer.wrap((byte[]) nativeGetJSByteDataAndRemove);
    }

    public long getNativeHandle() {
        return this.mNativeHandle;
    }

    public void invokeCallbackHandler(int i17, java.lang.String str) {
        invokeCallbackHandler(i17, str, "");
    }

    public synchronized boolean isJsThreadCurrent(int i17) {
        long j17 = this.mNativeHandle;
        if (j17 == 0) {
            return false;
        }
        return nativeIsJsThreadCurrent(j17, i17);
    }

    public java.lang.String nativeInvokeHandler(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, boolean z17, int i18, int i19) {
        return this.mAppBrandDelegate.c0(str, str2, str3, i17, z17, i18, i19);
    }

    public void notifyBindConsoleTo(long j17, long j18, long j19) {
        long j27 = this.mNativeHandle;
        if (j27 != 0) {
            nativeBindConsoleTo(j27, j17, j18, j19);
        }
    }

    public void notifyBindTo(long j17, long j18, long j19) {
        long j27 = this.mNativeHandle;
        if (j27 != 0) {
            nativeBindTo(j27, j17, j18, j19);
        }
    }

    public void notifyContextCreated(long j17, long j18, java.lang.String str) {
        synchronized (this) {
            long j19 = this.mNativeHandle;
            if (j19 != 0) {
                nativeNotifyContextCreated(j19, j17, j18, str);
            }
        }
    }

    public void notifyCreate(com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJniParams appBrandCommonBindingJniParams) {
        long nativeCreate = nativeCreate(appBrandCommonBindingJniParams);
        this.mNativeHandle = nativeCreate;
        bl.h.a(TAG, "hy: created with %d", java.lang.Long.valueOf(nativeCreate));
    }

    public void notifyDestroy() {
        long j17;
        synchronized (this) {
            j17 = this.mNativeHandle;
            this.mNativeHandle = 0L;
        }
        if (j17 != 0) {
            nativeDestroy(j17);
        }
        this.mAppBrandDelegate = null;
    }

    public void notifyPause() {
        long j17 = this.mNativeHandle;
        if (j17 != 0) {
            nativePause(j17);
        }
    }

    public void notifyPostRuntimeReady(long j17, java.lang.Class cls) {
        long j18 = this.mNativeHandle;
        if (j18 != 0) {
            nativePostRuntimeReady(j18, j17, cls);
        }
    }

    public void notifyResume() {
        long j17 = this.mNativeHandle;
        if (j17 != 0) {
            nativeResume(j17);
        }
    }

    public void notifyRuntimeReady(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        long j17 = this.mNativeHandle;
        if (j17 != 0) {
            nativeRuntimeReady(j17, str, str2, str3);
        }
    }

    public void notifySetInstanceId(java.lang.String str) {
        long j17 = this.mNativeHandle;
        if (j17 != 0) {
            nativeSetInstanceId(j17, str);
        }
    }

    public void notifySuspend() {
        long j17 = this.mNativeHandle;
        if (j17 != 0) {
            nativeSuspend(j17);
        }
    }

    public void onInspectorMsg(int i17, java.lang.String str) {
        this.mAppBrandDelegate.r0(i17, str);
    }

    public void onJSRuntimeReady(long j17, long j18, long j19) {
        this.isolatePtr = j17;
        this.contextPtr = j18;
        this.uvPtr = j19;
    }

    public java.lang.String onWorkerCreated(int i17, long j17, long j18, long j19) {
        return this.mAppBrandDelegate.k(i17, j17, j18, j19);
    }

    public void onWorkerDestroyed(int i17) {
        this.mAppBrandDelegate.W(i17);
    }

    public synchronized void postCleanupJob(java.lang.Runnable runnable) {
        long j17 = this.mNativeHandle;
        if (j17 != 0) {
            nativePostToJsThread(j17, 0, runnable, true, false);
        }
    }

    public synchronized void postCleanupJobInWorker(int i17, java.lang.Runnable runnable) {
        long j17 = this.mNativeHandle;
        if (j17 != 0) {
            nativePostToJsThread(j17, i17, runnable, true, false);
        }
    }

    public synchronized void postToJsThread(java.lang.Runnable runnable, boolean z17) {
        long j17 = this.mNativeHandle;
        if (j17 != 0) {
            nativePostToJsThread(j17, 0, runnable, false, z17);
        }
    }

    public synchronized void postToJsThreadInWorker(int i17, java.lang.Runnable runnable, boolean z17) {
        long j17 = this.mNativeHandle;
        if (j17 != 0) {
            nativePostToJsThread(j17, i17, runnable, false, z17);
        }
    }

    public synchronized void putJavaByteBuffer(int i17, int i18, java.nio.ByteBuffer byteBuffer) {
        if (this.mNativeHandle == 0) {
            return;
        }
        if (byteBuffer.isDirect()) {
            nativePutByteData(this.mNativeHandle, i17, i18, byteBuffer, true, 0, byteBuffer.capacity());
        } else if (byteBuffer.hasArray()) {
            nativePutByteData(this.mNativeHandle, i17, i18, byteBuffer.array(), false, byteBuffer.arrayOffset(), byteBuffer.capacity());
        }
    }

    public java.nio.ByteBuffer readCommLibFile(java.lang.String str) {
        return this.mAppBrandDelegate.p(str);
    }

    public java.lang.String readCommLibFileScript(java.lang.String str) {
        return this.mAppBrandDelegate.o0(str);
    }

    public java.nio.ByteBuffer readWeAppFile(java.lang.String str) {
        return this.mAppBrandDelegate.l0(str);
    }

    public void releaseDirectBuffer(java.nio.ByteBuffer byteBuffer) {
        nativeReleaseDirectBuffer(byteBuffer);
    }

    public void reportIDKey(int i17, int i18, int i19) {
        this.mAppBrandDelegate.g(i17, i18, i19);
    }

    public void reportKV(int i17, java.lang.String str) {
        this.mAppBrandDelegate.reportKV(i17, str);
    }

    public void requestV8GarbageCollectionForTest() {
        long j17 = this.mNativeHandle;
        if (j17 != 0) {
            nativeRequestV8GarbageCollectionForTest(j17);
        }
    }

    public void requestV8StackTrace() {
        long j17 = this.mNativeHandle;
        if (j17 != 0) {
            nativeRequestV8StackTrace(j17);
        }
    }

    public void resumeLoopTasks() {
        this.mAppBrandDelegate.e();
    }

    public void sendInspectorMsg(int i17, java.lang.String str) {
        synchronized (this) {
            long j17 = this.mNativeHandle;
            if (j17 != 0) {
                nativeSendInspectorMsg(j17, i17, str);
            }
        }
    }

    public void startInspector(int i17) {
        synchronized (this) {
            long j17 = this.mNativeHandle;
            if (j17 != 0) {
                nativeStartInspector(j17, i17);
            }
        }
    }

    public void startInspectorOnJS(int i17) {
        synchronized (this) {
            long j17 = this.mNativeHandle;
            if (j17 != 0) {
                nativeStartInspectorOnJS(j17, i17);
            }
        }
    }

    public void stopInspector(int i17) {
        synchronized (this) {
            long j17 = this.mNativeHandle;
            if (j17 != 0) {
                nativeStopInspector(j17, i17);
            }
        }
    }

    public synchronized void subscribeHandler(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3) {
        long j17 = this.mNativeHandle;
        if (j17 == 0) {
            return;
        }
        nativeSubscribeHandler(j17, str, str2, i17, str3);
    }

    public boolean syncInitModule(int i17, java.lang.String str, java.lang.String str2) {
        bl.h.a(TAG, "hy: request init %s with params %s", str, str2);
        try {
            return this.mAppBrandDelegate.h0(i17, str, str2);
        } catch (java.lang.Throwable th6) {
            java.lang.String format = java.lang.String.format("hy: syncInitModule %s crashed!!", str);
            bl.h.f21675a.printStackTrace(TAG, th6, format, new java.lang.Object[0]);
            this.mAppBrandDelegate.d(format);
            return false;
        }
    }

    public synchronized void invokeCallbackHandler(int i17, java.lang.String str, java.lang.String str2) {
        long j17 = this.mNativeHandle;
        if (j17 == 0) {
            return;
        }
        nativeInvokeCallbackHandler(j17, i17, str, str2);
    }
}
