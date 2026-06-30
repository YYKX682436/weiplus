package com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da;

/* renamed from: com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJni */
/* loaded from: classes7.dex */
public class C5128x72a3f151 {
    private static final java.lang.String TAG = "MicroMsg.AppBrandCommonBindingJni";

    /* renamed from: mAppBrandDelegate */
    private bl.a f21462x2be8d418;

    /* renamed from: mNativeHandle */
    private long f21463x12f2162c = 0;

    /* renamed from: isolatePtr */
    public long f21461xd4b89643 = 0;

    /* renamed from: contextPtr */
    public long f21460x105172bf = 0;

    /* renamed from: uvPtr */
    public long f21464x6a79c8d = 0;

    static {
        bl.d.f103207a.mo10716xeb57c8f5("wxa-runtime-binding");
    }

    public C5128x72a3f151(bl.a aVar) {
        java.util.Objects.requireNonNull(aVar);
        this.f21462x2be8d418 = aVar;
    }

    /* renamed from: nativeBindConsoleTo */
    private native void m43107xde8b639e(long j17, long j18, long j19, long j27);

    /* renamed from: nativeBindTo */
    private native void m43108x7190a28f(long j17, long j18, long j19, long j27);

    /* renamed from: nativeBrotliDecompress */
    public static native boolean m43109xf47fd2c(java.lang.String str, java.lang.String str2);

    /* renamed from: nativeCreate */
    private native long m43110x73c02ff3(com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5129xb513d637 c5129xb513d637);

    /* renamed from: nativeDestroy */
    private native void m43111x23caefe3(long j17);

    /* renamed from: nativeEvaluateScript */
    private native void m43112xed4b7abb(long j17, java.lang.String str, android.webkit.ValueCallback<java.lang.String> valueCallback);

    /* renamed from: nativeEvaluateScriptInWorker */
    private native void m43113x521910de(long j17, int i17, java.lang.String str, android.webkit.ValueCallback<java.lang.String> valueCallback);

    /* renamed from: nativeGenerateBufferId */
    private native int m43114x2d154847(long j17, int i17);

    /* renamed from: nativeGetJSByteDataAndRemove */
    private native java.lang.Object m43115x2768f421(long j17, int i17, int i18, boolean z17);

    /* renamed from: nativeInvokeCallbackHandler */
    private native void m43116x8df99fd6(long j17, int i17, java.lang.String str, java.lang.String str2);

    /* renamed from: nativeIsJsThreadCurrent */
    private native boolean m43117x2a0abb65(long j17, int i17);

    /* renamed from: nativeNotifyContextCreated */
    private native void m43118x9cf0f099(long j17, long j18, long j19, java.lang.String str);

    /* renamed from: nativePause */
    private native void m43119x67845c1f(long j17);

    /* renamed from: nativePostRuntimeReady */
    private native void m43120xcc0ac3a2(long j17, long j18, java.lang.Class cls);

    /* renamed from: nativePostToJsThread */
    private native void m43121xc7c8c905(long j17, int i17, java.lang.Runnable runnable, boolean z17, boolean z18);

    /* renamed from: nativePutByteData */
    private native void m43122x66adcc6a(long j17, int i17, int i18, java.lang.Object obj, boolean z17, int i19, int i27);

    /* renamed from: nativeReleaseDirectBuffer */
    private native void m43123x572d2d99(java.nio.ByteBuffer byteBuffer);

    /* renamed from: nativeRequestV8GarbageCollectionForTest */
    private native void m43124xb8a1c202(long j17);

    /* renamed from: nativeRequestV8StackTrace */
    private native void m43125x7bab6657(long j17);

    /* renamed from: nativeResume */
    private native void m43126x8ca85724(long j17);

    /* renamed from: nativeRuntimeReady */
    private native void m43127xca7c7a62(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3);

    /* renamed from: nativeSendInspectorMsg */
    private native void m43128x243a9ae9(long j17, int i17, java.lang.String str);

    /* renamed from: nativeSetInstanceId */
    private native void m43129xf5b4cfbb(long j17, java.lang.String str);

    /* renamed from: nativeStartInspector */
    private native void m43130xb3f10cac(long j17, int i17);

    /* renamed from: nativeStartInspectorOnJS */
    private native void m43131x6286634(long j17, int i17);

    /* renamed from: nativeStopInspector */
    private native void m43132x26c0323e(long j17, int i17);

    /* renamed from: nativeSubscribeHandler */
    private native void m43133xe571f0d7(long j17, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3);

    /* renamed from: nativeSuspend */
    private native void m43134x5893f025(long j17);

    /* renamed from: batchRequestWxaFileDescriptors */
    public com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5131x1c4cfc5e m43135x197f44dd(java.lang.String[] strArr, java.lang.Object obj) {
        return this.f21462x2be8d418.A(strArr, obj != null ? (java.util.Map) obj : null);
    }

    /* renamed from: doInnerLoopTask */
    public boolean m43136x46b297f4() {
        return this.f21462x2be8d418.j();
    }

    /* renamed from: evaluateScript */
    public synchronized void m43137x1f57d2c4(java.lang.String str, android.webkit.ValueCallback<java.lang.String> valueCallback) {
        long j17 = this.f21463x12f2162c;
        if (j17 != 0) {
            m43112xed4b7abb(j17, str, valueCallback);
        }
    }

    /* renamed from: evaluateScriptInWorker */
    public synchronized void m43138x74b54fe7(java.lang.String str, int i17, android.webkit.ValueCallback<java.lang.String> valueCallback) {
        long j17 = this.f21463x12f2162c;
        if (j17 != 0) {
            m43113x521910de(j17, i17, str, valueCallback);
        }
    }

    /* renamed from: generateBufferId */
    public synchronized int m43139xd6bc210(int i17) {
        long j17 = this.f21463x12f2162c;
        if (j17 == 0) {
            return 0;
        }
        return m43114x2d154847(j17, i17);
    }

    /* renamed from: getAsyncableJsApis */
    public java.lang.String[] m43140x8e6ffdc2() {
        return this.f21462x2be8d418.T();
    }

    /* renamed from: getJSByteBufferAndRemove */
    public synchronized java.nio.ByteBuffer m43141x5f7a9d14(int i17, int i18, boolean z17) {
        long j17 = this.f21463x12f2162c;
        if (j17 == 0) {
            return null;
        }
        java.lang.Object m43115x2768f421 = m43115x2768f421(j17, i17, i18, z17);
        if (m43115x2768f421 == null) {
            return null;
        }
        if (z17) {
            return (java.nio.ByteBuffer) m43115x2768f421;
        }
        return java.nio.ByteBuffer.wrap((byte[]) m43115x2768f421);
    }

    /* renamed from: getNativeHandle */
    public long m43142xdc4f8f95() {
        return this.f21463x12f2162c;
    }

    /* renamed from: invokeCallbackHandler */
    public void m43143x44c4dbad(int i17, java.lang.String str) {
        m43144x44c4dbad(i17, str, "");
    }

    /* renamed from: isJsThreadCurrent */
    public synchronized boolean m43145x54837abc(int i17) {
        long j17 = this.f21463x12f2162c;
        if (j17 == 0) {
            return false;
        }
        return m43117x2a0abb65(j17, i17);
    }

    /* renamed from: nativeInvokeHandler */
    public java.lang.String m43146xd3d630db(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, boolean z17, int i18, int i19) {
        return this.f21462x2be8d418.c0(str, str2, str3, i17, z17, i18, i19);
    }

    /* renamed from: notifyBindConsoleTo */
    public void m43147xa622ddac(long j17, long j18, long j19) {
        long j27 = this.f21463x12f2162c;
        if (j27 != 0) {
            m43107xde8b639e(j27, j17, j18, j19);
        }
    }

    /* renamed from: notifyBindTo */
    public void m43148x39fc3c41(long j17, long j18, long j19) {
        long j27 = this.f21463x12f2162c;
        if (j27 != 0) {
            m43108x7190a28f(j27, j17, j18, j19);
        }
    }

    /* renamed from: notifyContextCreated */
    public void m43149x16735de2(long j17, long j18, java.lang.String str) {
        synchronized (this) {
            long j19 = this.f21463x12f2162c;
            if (j19 != 0) {
                m43118x9cf0f099(j19, j17, j18, str);
            }
        }
    }

    /* renamed from: notifyCreate */
    public void m43150x3c2bc9a5(com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5129xb513d637 c5129xb513d637) {
        long m43110x73c02ff3 = m43110x73c02ff3(c5129xb513d637);
        this.f21463x12f2162c = m43110x73c02ff3;
        bl.h.a(TAG, "hy: created with %d", java.lang.Long.valueOf(m43110x73c02ff3));
    }

    /* renamed from: notifyDestroy */
    public void m43151x68d28c71() {
        long j17;
        synchronized (this) {
            j17 = this.f21463x12f2162c;
            this.f21463x12f2162c = 0L;
        }
        if (j17 != 0) {
            m43111x23caefe3(j17);
        }
        this.f21462x2be8d418 = null;
    }

    /* renamed from: notifyPause */
    public void m43152x9745c42d() {
        long j17 = this.f21463x12f2162c;
        if (j17 != 0) {
            m43119x67845c1f(j17);
        }
    }

    /* renamed from: notifyPostRuntimeReady */
    public void m43153x808f66d4(long j17, java.lang.Class cls) {
        long j18 = this.f21463x12f2162c;
        if (j18 != 0) {
            m43120xcc0ac3a2(j18, j17, cls);
        }
    }

    /* renamed from: notifyResume */
    public void m43154x5513f0d6() {
        long j17 = this.f21463x12f2162c;
        if (j17 != 0) {
            m43126x8ca85724(j17);
        }
    }

    /* renamed from: notifyRuntimeReady */
    public void m43155xb8268694(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        long j17 = this.f21463x12f2162c;
        if (j17 != 0) {
            m43127xca7c7a62(j17, str, str2, str3);
        }
    }

    /* renamed from: notifySetInstanceId */
    public void m43156xbd4c49c9(java.lang.String str) {
        long j17 = this.f21463x12f2162c;
        if (j17 != 0) {
            m43129xf5b4cfbb(j17, str);
        }
    }

    /* renamed from: notifySuspend */
    public void m43157x9d9b8cb3() {
        long j17 = this.f21463x12f2162c;
        if (j17 != 0) {
            m43134x5893f025(j17);
        }
    }

    /* renamed from: onInspectorMsg */
    public void m43158x6f758889(int i17, java.lang.String str) {
        this.f21462x2be8d418.r0(i17, str);
    }

    /* renamed from: onJSRuntimeReady */
    public void m43159x858ad433(long j17, long j18, long j19) {
        this.f21461xd4b89643 = j17;
        this.f21460x105172bf = j18;
        this.f21464x6a79c8d = j19;
    }

    /* renamed from: onWorkerCreated */
    public java.lang.String m43160x32545deb(int i17, long j17, long j18, long j19) {
        return this.f21462x2be8d418.k(i17, j17, j18, j19);
    }

    /* renamed from: onWorkerDestroyed */
    public void m43161x4175c05c(int i17) {
        this.f21462x2be8d418.W(i17);
    }

    /* renamed from: postCleanupJob */
    public synchronized void m43162x6dcac739(java.lang.Runnable runnable) {
        long j17 = this.f21463x12f2162c;
        if (j17 != 0) {
            m43121xc7c8c905(j17, 0, runnable, true, false);
        }
    }

    /* renamed from: postCleanupJobInWorker */
    public synchronized void m43163x2e3aff5c(int i17, java.lang.Runnable runnable) {
        long j17 = this.f21463x12f2162c;
        if (j17 != 0) {
            m43121xc7c8c905(j17, i17, runnable, true, false);
        }
    }

    /* renamed from: postToJsThread */
    public synchronized void m43164xf9d5210e(java.lang.Runnable runnable, boolean z17) {
        long j17 = this.f21463x12f2162c;
        if (j17 != 0) {
            m43121xc7c8c905(j17, 0, runnable, false, z17);
        }
    }

    /* renamed from: postToJsThreadInWorker */
    public synchronized void m43165x37ccb431(int i17, java.lang.Runnable runnable, boolean z17) {
        long j17 = this.f21463x12f2162c;
        if (j17 != 0) {
            m43121xc7c8c905(j17, i17, runnable, false, z17);
        }
    }

    /* renamed from: putJavaByteBuffer */
    public synchronized void m43166x31193819(int i17, int i18, java.nio.ByteBuffer byteBuffer) {
        if (this.f21463x12f2162c == 0) {
            return;
        }
        if (byteBuffer.isDirect()) {
            m43122x66adcc6a(this.f21463x12f2162c, i17, i18, byteBuffer, true, 0, byteBuffer.capacity());
        } else if (byteBuffer.hasArray()) {
            m43122x66adcc6a(this.f21463x12f2162c, i17, i18, byteBuffer.array(), false, byteBuffer.arrayOffset(), byteBuffer.capacity());
        }
    }

    /* renamed from: readCommLibFile */
    public java.nio.ByteBuffer m43167x2e02f97f(java.lang.String str) {
        return this.f21462x2be8d418.p(str);
    }

    /* renamed from: readCommLibFileScript */
    public java.lang.String m43168xe5a65b2a(java.lang.String str) {
        return this.f21462x2be8d418.o0(str);
    }

    /* renamed from: readWeAppFile */
    public java.nio.ByteBuffer m43169xa9beff99(java.lang.String str) {
        return this.f21462x2be8d418.l0(str);
    }

    /* renamed from: releaseDirectBuffer */
    public void m43170xc6737330(java.nio.ByteBuffer byteBuffer) {
        m43123x572d2d99(byteBuffer);
    }

    /* renamed from: reportIDKey */
    public void m43171xf0018e90(int i17, int i18, int i19) {
        this.f21462x2be8d418.g(i17, i18, i19);
    }

    /* renamed from: reportKV */
    public void m43172xe68be19f(int i17, java.lang.String str) {
        this.f21462x2be8d418.mo10303xe68be19f(i17, str);
    }

    /* renamed from: requestV8GarbageCollectionForTest */
    public void m43173x1976f359() {
        long j17 = this.f21463x12f2162c;
        if (j17 != 0) {
            m43124xb8a1c202(j17);
        }
    }

    /* renamed from: requestV8StackTrace */
    public void m43174xeaf1abee() {
        long j17 = this.f21463x12f2162c;
        if (j17 != 0) {
            m43125x7bab6657(j17);
        }
    }

    /* renamed from: resumeLoopTasks */
    public void m43175x524f859d() {
        this.f21462x2be8d418.e();
    }

    /* renamed from: sendInspectorMsg */
    public void m43176x49114b2(int i17, java.lang.String str) {
        synchronized (this) {
            long j17 = this.f21463x12f2162c;
            if (j17 != 0) {
                m43128x243a9ae9(j17, i17, str);
            }
        }
    }

    /* renamed from: startInspector */
    public void m43177xe5fd64b5(int i17) {
        synchronized (this) {
            long j17 = this.f21463x12f2162c;
            if (j17 != 0) {
                m43130xb3f10cac(j17, i17);
            }
        }
    }

    /* renamed from: startInspectorOnJS */
    public void m43178x2ac791bd(int i17) {
        synchronized (this) {
            long j17 = this.f21463x12f2162c;
            if (j17 != 0) {
                m43131x6286634(j17, i17);
            }
        }
    }

    /* renamed from: stopInspector */
    public void m43179x83343515(int i17) {
        synchronized (this) {
            long j17 = this.f21463x12f2162c;
            if (j17 != 0) {
                m43132x26c0323e(j17, i17);
            }
        }
    }

    /* renamed from: subscribeHandler */
    public synchronized void m43180xc5c86aa0(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3) {
        long j17 = this.f21463x12f2162c;
        if (j17 == 0) {
            return;
        }
        m43133xe571f0d7(j17, str, str2, i17, str3);
    }

    /* renamed from: syncInitModule */
    public boolean m43181x910d9c97(int i17, java.lang.String str, java.lang.String str2) {
        bl.h.a(TAG, "hy: request init %s with params %s", str, str2);
        try {
            return this.f21462x2be8d418.h0(i17, str, str2);
        } catch (java.lang.Throwable th6) {
            java.lang.String format = java.lang.String.format("hy: syncInitModule %s crashed!!", str);
            bl.h.f103208a.mo10718x6e0e6e2a(TAG, th6, format, new java.lang.Object[0]);
            this.f21462x2be8d418.d(format);
            return false;
        }
    }

    /* renamed from: invokeCallbackHandler */
    public synchronized void m43144x44c4dbad(int i17, java.lang.String str, java.lang.String str2) {
        long j17 = this.f21463x12f2162c;
        if (j17 == 0) {
            return;
        }
        m43116x8df99fd6(j17, i17, str, str2);
    }
}
