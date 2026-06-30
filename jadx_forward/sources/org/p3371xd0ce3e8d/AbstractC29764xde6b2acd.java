package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.EglRenderer */
/* loaded from: classes16.dex */
public abstract class AbstractC29764xde6b2acd implements org.p3371xd0ce3e8d.InterfaceC29908xc6e4d18e {

    /* renamed from: LOG_INTERVAL_SEC */
    private static final long f75332x5c656f2 = 4;
    private static final java.lang.String TAG = "EglRenderer";

    /* renamed from: _hellAccFlag_ */
    private byte f75333x7f11beae;

    /* renamed from: bitmapTextureFramebuffer */
    private final org.p3371xd0ce3e8d.C29783x806035d7 f75334xacbe3b61;

    /* renamed from: currentStats */
    private final org.p3371xd0ce3e8d.C29838x24207153 f75335x56e49aa6;

    /* renamed from: detailedPerformanceInspector */
    private final org.p3371xd0ce3e8d.C29837x46c7b4c7 f75336x8a43d177;

    /* renamed from: drawMatrix */
    private final android.graphics.Matrix f75337xef73ae25;

    /* renamed from: drawer */
    private org.p3371xd0ce3e8d.C29847x54db44ae.GlDrawer f75338xb118f8f1;

    /* renamed from: eglBase */
    private org.p3371xd0ce3e8d.InterfaceC29759xf7e285db f75339x94a9edfb;

    /* renamed from: eglSurfaceCreationRunnable */
    private final org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.EglSurfaceCreation f75340x5d7d727f;

    /* renamed from: errorCallback */
    private volatile org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.ErrorCallback f75341xc08cce6d;

    /* renamed from: fpsReductionLock */
    private final java.lang.Object f75342xc33d1fd5;

    /* renamed from: frameDrawer */
    private final org.p3371xd0ce3e8d.C29906x8db8d563 f75343xddf508be;

    /* renamed from: frameListeners */
    private final java.util.ArrayList<org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.FrameListenerAndParams> f75344x142e9352;

    /* renamed from: frameLock */
    private final java.lang.Object f75345x207a6438;

    /* renamed from: handlerLock */
    private final java.lang.Object f75346x59fedb95;

    /* renamed from: layoutAspectRatio */
    private float f75347xab23109;

    /* renamed from: layoutLock */
    private final java.lang.Object f75348x14598f75;

    /* renamed from: logStatisticsRunnable */
    private final java.lang.Runnable f75349x96c5abc4;

    /* renamed from: mFrameWithGLCallback */
    private org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.OnFrameInGLEnv f75350xc249cab0;

    /* renamed from: minRenderPeriodNs */
    private long f75351xe900be0e;

    /* renamed from: mirrorHorizontally */
    private boolean f75352xe9453a10;

    /* renamed from: mirrorVertically */
    private boolean f75353xd82754a2;

    /* renamed from: name */
    protected final java.lang.String f75354x337a8b;

    /* renamed from: nextFrameTimeNs */
    private long f75355x5ee4c44c;

    /* renamed from: pendingFrame */
    private org.p3371xd0ce3e8d.C29904x150215d2 f75356x8589616;

    /* renamed from: renderThreadHandler */
    private android.os.Handler f75357x521c93ea;

    /* renamed from: usePresentationTimeStamp */
    private boolean f75358x6273cbb5;

    /* renamed from: org.webrtc.EglRenderer$EglSurfaceCreation */
    /* loaded from: classes14.dex */
    public class EglSurfaceCreation implements java.lang.Runnable {

        /* renamed from: surface */
        private java.lang.Object f75361x9189ecad;

        private EglSurfaceCreation() {
        }

        @Override // java.lang.Runnable
        public synchronized void run() {
            if (this.f75361x9189ecad != null && org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.this.f75339x94a9edfb != null && !org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.this.f75339x94a9edfb.mo155414xaadb0b3()) {
                java.lang.Object obj = this.f75361x9189ecad;
                if (obj instanceof android.view.Surface) {
                    org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.this.f75339x94a9edfb.mo155411x17711011((android.view.Surface) this.f75361x9189ecad);
                } else {
                    if (!(obj instanceof android.graphics.SurfaceTexture)) {
                        throw new java.lang.IllegalStateException("Invalid surface: " + this.f75361x9189ecad);
                    }
                    org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.this.f75339x94a9edfb.mo155410x17711011((android.graphics.SurfaceTexture) this.f75361x9189ecad);
                }
                org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.this.f75339x94a9edfb.mo155415x900967ab();
                android.opengl.GLES20.glPixelStorei(3317, 1);
            }
        }

        /* renamed from: setSurface */
        public synchronized void m155502x42c875eb(java.lang.Object obj) {
            this.f75361x9189ecad = obj;
        }
    }

    /* renamed from: org.webrtc.EglRenderer$ErrorCallback */
    /* loaded from: classes16.dex */
    public interface ErrorCallback {
        /* renamed from: onGlOutOfMemory */
        void m155503xdb3e8d62();
    }

    /* renamed from: org.webrtc.EglRenderer$FrameListener */
    /* loaded from: classes16.dex */
    public interface FrameListener {
        /* renamed from: onFrame */
        void mo155504xaf987ece(android.graphics.Bitmap bitmap);
    }

    /* renamed from: org.webrtc.EglRenderer$FrameListenerAndParams */
    /* loaded from: classes16.dex */
    public static class FrameListenerAndParams {

        /* renamed from: applyFpsReduction */
        public final boolean f75363x824cde18;

        /* renamed from: drawer */
        public final org.p3371xd0ce3e8d.C29847x54db44ae.GlDrawer f75364xb118f8f1;

        /* renamed from: listener */
        public final org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.FrameListener f75365x503cc4b4;

        /* renamed from: scale */
        public final float f75366x683094a;

        public FrameListenerAndParams(org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.FrameListener frameListener, float f17, org.p3371xd0ce3e8d.C29847x54db44ae.GlDrawer glDrawer, boolean z17) {
            this.f75365x503cc4b4 = frameListener;
            this.f75366x683094a = f17;
            this.f75364xb118f8f1 = glDrawer;
            this.f75363x824cde18 = z17;
        }
    }

    /* renamed from: org.webrtc.EglRenderer$HandlerWithExceptionCallback */
    /* loaded from: classes13.dex */
    public static class HandlerWithExceptionCallback extends android.os.Handler {

        /* renamed from: exceptionCallback */
        private final java.lang.Runnable f75367xee3495b4;

        public HandlerWithExceptionCallback(android.os.Looper looper, java.lang.Runnable runnable) {
            super(looper);
            this.f75367xee3495b4 = runnable;
        }

        @Override // android.os.Handler
        public void dispatchMessage(android.os.Message message) {
            try {
                super.dispatchMessage(message);
            } catch (java.lang.Exception e17) {
                org.p3371xd0ce3e8d.C29806x779f633f.e(org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.TAG, "Exception on EglRenderer thread", e17);
                this.f75367xee3495b4.run();
                throw e17;
            }
        }
    }

    /* renamed from: org.webrtc.EglRenderer$OnFrameInGLEnv */
    /* loaded from: classes16.dex */
    public interface OnFrameInGLEnv {
        /* renamed from: doOnDrawFrameWithEGL */
        boolean mo51485x25b69285(org.p3371xd0ce3e8d.InterfaceC29759xf7e285db interfaceC29759xf7e285db, org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d2, org.p3371xd0ce3e8d.C29847x54db44ae.GlDrawer glDrawer, org.p3371xd0ce3e8d.C29906x8db8d563 c29906x8db8d563, android.graphics.Matrix matrix);
    }

    public AbstractC29764xde6b2acd(java.lang.String str) {
        this(str, new org.p3371xd0ce3e8d.C29906x8db8d563());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: clearSurfaceOnRenderThread, reason: merged with bridge method [inline-methods] */
    public void m155465x9b0895dd(float f17, float f18, float f19, float f27) {
        org.p3371xd0ce3e8d.InterfaceC29759xf7e285db interfaceC29759xf7e285db = this.f75339x94a9edfb;
        if (interfaceC29759xf7e285db == null || !interfaceC29759xf7e285db.mo155414xaadb0b3()) {
            return;
        }
        m155471x32c580("clearSurface");
        android.opengl.GLES20.glClearColor(f17, f18, f19, f27);
        android.opengl.GLES20.glClear(16384);
        this.f75339x94a9edfb.mo155420x82211f20();
    }

    /* renamed from: createEglSurfaceInternal */
    private void m155463x35b38b3c(java.lang.Object obj) {
        this.f75340x5d7d727f.m155502x42c875eb(obj);
        m155476xc411821b(this.f75340x5d7d727f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$addFrameListener$3 */
    public /* synthetic */ void m155464x4421c6ac(org.p3371xd0ce3e8d.C29847x54db44ae.GlDrawer glDrawer, org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.FrameListener frameListener, float f17, boolean z17) {
        if (glDrawer == null) {
            glDrawer = this.f75338xb118f8f1;
        }
        this.f75344x142e9352.add(new org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.FrameListenerAndParams(frameListener, f17, glDrawer, z17));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$init$0 */
    public /* synthetic */ void m155466xe3ede919(org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.Context context, int[] iArr) {
        if (context == null) {
            m155471x32c580("EglBase10.create context");
            this.f75339x94a9edfb = org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.EglBaseStatic.m155434xe120600d(iArr);
        } else {
            m155471x32c580("EglBase.create shared context");
            this.f75339x94a9edfb = org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.EglBaseStatic.m155431xaf65a0fc(context, iArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$release$1 */
    public /* synthetic */ void m155467x7afbb637(java.util.concurrent.CountDownLatch countDownLatch) {
        synchronized (org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.f75310x32c52b) {
            android.opengl.GLES20.glUseProgram(0);
        }
        org.p3371xd0ce3e8d.C29847x54db44ae.GlDrawer glDrawer = this.f75338xb118f8f1;
        if (glDrawer != null) {
            glDrawer.mo155542x41012807();
            this.f75338xb118f8f1 = null;
        }
        this.f75343xddf508be.m156562x41012807();
        this.f75334xacbe3b61.m155559x41012807();
        if (this.f75339x94a9edfb != null) {
            m155471x32c580("eglBase detach and release.");
            this.f75339x94a9edfb.mo155412x6c0f2266();
            this.f75339x94a9edfb.mo155416x41012807();
            this.f75339x94a9edfb = null;
        }
        this.f75344x142e9352.clear();
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$release$2 */
    public /* synthetic */ void m155468x7afbb638(android.os.Looper looper) {
        m155471x32c580("Quitting render thread.");
        looper.quit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$releaseEglSurface$5 */
    public /* synthetic */ void m155469x14c5f65e(java.lang.Runnable runnable) {
        org.p3371xd0ce3e8d.InterfaceC29759xf7e285db interfaceC29759xf7e285db = this.f75339x94a9edfb;
        if (interfaceC29759xf7e285db != null) {
            interfaceC29759xf7e285db.mo155412x6c0f2266();
            this.f75339x94a9edfb.mo155417xc6cc96a6();
        }
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$removeFrameListener$4 */
    public /* synthetic */ void m155470x5af46750(java.util.concurrent.CountDownLatch countDownLatch, org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.FrameListener frameListener) {
        countDownLatch.countDown();
        java.util.Iterator<org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.FrameListenerAndParams> it = this.f75344x142e9352.iterator();
        while (it.hasNext()) {
            if (it.next().f75365x503cc4b4 == frameListener) {
                it.remove();
            }
        }
    }

    /* renamed from: logD */
    private void m155471x32c580(java.lang.String str) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, this.f75354x337a8b + str);
    }

    /* renamed from: logE */
    private void m155472x32c581(java.lang.String str, java.lang.Throwable th6) {
        org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, this.f75354x337a8b + str, th6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: logStatistics */
    public void m155473x4e7feb87() {
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("#.0");
        long nanoTime = java.lang.System.nanoTime();
        synchronized (this.f75335x56e49aa6) {
            org.p3371xd0ce3e8d.C29838x24207153 c29838x24207153 = this.f75335x56e49aa6;
            long j17 = nanoTime - c29838x24207153.f75849xa0a2f51;
            if (j17 > 0 && (this.f75351xe900be0e != com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697 || c29838x24207153.f75842x53c4cca7 != 0)) {
                java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.NANOSECONDS;
                c29838x24207153.f75840x89444d94 = timeUnit.toMillis(j17);
                this.f75335x56e49aa6.f75846x6da66373 = ((float) (r6.f75843x667a237b * java.util.concurrent.TimeUnit.SECONDS.toNanos(1L))) / ((float) j17);
                org.p3371xd0ce3e8d.C29838x24207153 c29838x242071532 = this.f75335x56e49aa6;
                int i17 = c29838x242071532.f75843x667a237b;
                c29838x242071532.f75837x8645c780 = i17 > 0 ? timeUnit.toMicros(c29838x242071532.f75848x2d4f02a8 / i17) : 0L;
                org.p3371xd0ce3e8d.C29838x24207153 c29838x242071533 = this.f75335x56e49aa6;
                int i18 = c29838x242071533.f75843x667a237b;
                c29838x242071533.f75838xdfac09d = i18 > 0 ? timeUnit.toMicros(c29838x242071533.f75847x9d5f68bb / i18) : 0L;
                m155471x32c580("Duration: " + this.f75335x56e49aa6.f75840x89444d94 + " ms. Frames received: " + this.f75335x56e49aa6.f75842x53c4cca7 + ". Dropped: " + this.f75335x56e49aa6.f75841xe265143a + ". Rendered: " + this.f75335x56e49aa6.f75843x667a237b + ". Render fps: " + decimalFormat.format(this.f75335x56e49aa6.f75846x6da66373) + ". Average render time: " + this.f75335x56e49aa6.f75837x8645c780 + " us. Average swapBuffer time: " + this.f75335x56e49aa6.f75838xdfac09d + " us.");
                this.f75336x8a43d177.m156206x5d03b04(this.f75335x56e49aa6);
                mo155489xbae2a94a(new org.p3371xd0ce3e8d.C29838x24207153(this.f75335x56e49aa6));
                this.f75335x56e49aa6.m156209x36f793d2(nanoTime);
            }
        }
    }

    /* renamed from: logW */
    private void m155474x32c593(java.lang.String str) {
        org.p3371xd0ce3e8d.C29806x779f633f.w(TAG, this.f75354x337a8b + str);
    }

    /* renamed from: notifyCallbacks */
    private void m155475xc9bd9385(org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d2, boolean z17) {
        if (this.f75344x142e9352.isEmpty()) {
            return;
        }
        this.f75337xef73ae25.reset();
        this.f75337xef73ae25.preTranslate(0.5f, 0.5f);
        this.f75337xef73ae25.preScale(this.f75352xe9453a10 ? -1.0f : 1.0f, this.f75353xd82754a2 ? -1.0f : 1.0f);
        this.f75337xef73ae25.preScale(1.0f, -1.0f);
        this.f75337xef73ae25.preTranslate(-0.5f, -0.5f);
        java.util.Iterator<org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.FrameListenerAndParams> it = this.f75344x142e9352.iterator();
        while (it.hasNext()) {
            org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.FrameListenerAndParams next = it.next();
            if (z17 || !next.f75363x824cde18) {
                it.remove();
                int m156546xdcea9b53 = (int) (next.f75366x683094a * c29904x150215d2.m156546xdcea9b53());
                int m156545xa699d53a = (int) (next.f75366x683094a * c29904x150215d2.m156545xa699d53a());
                if (m156546xdcea9b53 == 0 || m156545xa699d53a == 0) {
                    next.f75365x503cc4b4.mo155504xaf987ece(null);
                } else {
                    this.f75334xacbe3b61.m155560x76500f83(m156546xdcea9b53, m156545xa699d53a);
                    android.opengl.GLES20.glBindFramebuffer(36160, this.f75334xacbe3b61.m155555xc8be9a52());
                    android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f75334xacbe3b61.m155557xc2ca74e0(), 0);
                    android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    android.opengl.GLES20.glClear(16384);
                    this.f75343xddf508be.m156560x75e3689(c29904x150215d2, next.f75364xb118f8f1, this.f75337xef73ae25, 0, 0, m156546xdcea9b53, m156545xa699d53a);
                    java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(m156546xdcea9b53 * m156545xa699d53a * 4);
                    android.opengl.GLES20.glViewport(0, 0, m156546xdcea9b53, m156545xa699d53a);
                    android.opengl.GLES20.glReadPixels(0, 0, m156546xdcea9b53, m156545xa699d53a, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, allocateDirect);
                    android.opengl.GLES20.glBindFramebuffer(36160, 0);
                    org.p3371xd0ce3e8d.C29784x7f4262a7.m155561x7db050b2("EglRenderer.notifyCallbacks");
                    android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(config);
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Integer.valueOf(m156545xa699d53a));
                    arrayList.add(java.lang.Integer.valueOf(m156546xdcea9b53));
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "org/webrtc/EglRenderer", "notifyCallbacks", "(Lorg/webrtc/VideoFrame;Z)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                    yj0.a.e(obj, createBitmap, "org/webrtc/EglRenderer", "notifyCallbacks", "(Lorg/webrtc/VideoFrame;Z)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    next.f75365x503cc4b4.mo155504xaf987ece(createBitmap);
                }
            }
        }
    }

    /* renamed from: postToRenderThread */
    private void m155476xc411821b(java.lang.Runnable runnable) {
        synchronized (this.f75346x59fedb95) {
            android.os.Handler handler = this.f75357x521c93ea;
            if (handler != null) {
                handler.post(runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: renderFrameOnRenderThread */
    public void m155477x117a3416() {
        boolean z17;
        float f17;
        float f18;
        float f19;
        synchronized (this.f75345x207a6438) {
            org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d2 = this.f75356x8589616;
            if (c29904x150215d2 == null) {
                return;
            }
            this.f75356x8589616 = null;
            org.p3371xd0ce3e8d.InterfaceC29759xf7e285db interfaceC29759xf7e285db = this.f75339x94a9edfb;
            if (interfaceC29759xf7e285db == null || !interfaceC29759xf7e285db.mo155414xaadb0b3()) {
                m155471x32c580("Dropping frame - No surface");
                return;
            }
            synchronized (this.f75342xc33d1fd5) {
                long j17 = this.f75351xe900be0e;
                if (j17 != com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) {
                    if (j17 > 0) {
                        long nanoTime = java.lang.System.nanoTime();
                        long j18 = this.f75355x5ee4c44c;
                        if (nanoTime < j18) {
                            m155471x32c580("Skipping frame rendering - fps reduction is active.");
                        } else {
                            long j19 = j18 + this.f75351xe900be0e;
                            this.f75355x5ee4c44c = j19;
                            this.f75355x5ee4c44c = java.lang.Math.max(j19, nanoTime);
                        }
                    }
                    z17 = true;
                }
                z17 = false;
            }
            long nanoTime2 = java.lang.System.nanoTime();
            float m156546xdcea9b53 = c29904x150215d2.m156546xdcea9b53() / c29904x150215d2.m156545xa699d53a();
            synchronized (this.f75348x14598f75) {
                f17 = this.f75347xab23109;
                if (f17 == 0.0f) {
                    f17 = m156546xdcea9b53;
                }
            }
            if (m156546xdcea9b53 > f17) {
                f19 = f17 / m156546xdcea9b53;
                f18 = 1.0f;
            } else {
                f18 = m156546xdcea9b53 / f17;
                f19 = 1.0f;
            }
            this.f75337xef73ae25.reset();
            this.f75337xef73ae25.preTranslate(0.5f, 0.5f);
            this.f75337xef73ae25.preScale(this.f75352xe9453a10 ? -1.0f : 1.0f, this.f75353xd82754a2 ? -1.0f : 1.0f);
            this.f75337xef73ae25.preScale(f19, f18);
            this.f75337xef73ae25.preTranslate(-0.5f, -0.5f);
            try {
                if (z17) {
                    try {
                        if (!this.f75350xc249cab0.mo51485x25b69285(this.f75339x94a9edfb, c29904x150215d2, this.f75338xb118f8f1, this.f75343xddf508be, this.f75337xef73ae25)) {
                            android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                            android.opengl.GLES20.glClear(16384);
                            this.f75343xddf508be.m156560x75e3689(c29904x150215d2, this.f75338xb118f8f1, this.f75337xef73ae25, 0, 0, this.f75339x94a9edfb.mo155419xdffb3519(), this.f75339x94a9edfb.mo155418x59c7434());
                        }
                        long nanoTime3 = java.lang.System.nanoTime();
                        if (this.f75358x6273cbb5) {
                            this.f75339x94a9edfb.mo155421x82211f20(c29904x150215d2.m156548x2f798c45());
                        } else {
                            this.f75339x94a9edfb.mo155420x82211f20();
                        }
                        long nanoTime4 = java.lang.System.nanoTime();
                        synchronized (this.f75335x56e49aa6) {
                            org.p3371xd0ce3e8d.C29838x24207153 c29838x24207153 = this.f75335x56e49aa6;
                            c29838x24207153.f75843x667a237b++;
                            c29838x24207153.f75848x2d4f02a8 += nanoTime4 - nanoTime2;
                            c29838x24207153.f75847x9d5f68bb += nanoTime4 - nanoTime3;
                        }
                    } catch (org.p3371xd0ce3e8d.C29784x7f4262a7.GlOutOfMemoryException e17) {
                        m155472x32c581("Error while drawing frame", e17);
                        org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.ErrorCallback errorCallback = this.f75341xc08cce6d;
                        if (errorCallback != null) {
                            errorCallback.m155503xdb3e8d62();
                        }
                        this.f75338xb118f8f1.mo155542x41012807();
                        this.f75343xddf508be.m156562x41012807();
                        this.f75334xacbe3b61.m155559x41012807();
                    }
                }
                m155475xc9bd9385(c29904x150215d2, z17);
            } finally {
                c29904x150215d2.mo155513x41012807();
            }
        }
    }

    /* renamed from: addFrameListener */
    public void m155478xb2909a20(org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.FrameListener frameListener, float f17) {
        m155480xb2909a20(frameListener, f17, null, false);
    }

    /* renamed from: clearImage */
    public void m155481xd318eb0e() {
        m155482xd318eb0e(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* renamed from: createEglSurface */
    public void m155484x3d132f5f(android.view.Surface surface) {
        m155463x35b38b3c(surface);
    }

    /* renamed from: disableFpsReduction */
    public void mo155485x60da1692() {
        mo155497x7a11490c(Float.POSITIVE_INFINITY);
    }

    /* renamed from: getFrameWithGLCallback */
    public org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.OnFrameInGLEnv m155486x2fdd9927() {
        return this.f75350xc249cab0;
    }

    /* renamed from: init */
    public void m155488x316510(final org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.Context context, final int[] iArr, org.p3371xd0ce3e8d.C29847x54db44ae.GlDrawer glDrawer, boolean z17) {
        synchronized (this.f75346x59fedb95) {
            if (this.f75357x521c93ea == null) {
                m155471x32c580("Initializing EglRenderer");
                this.f75338xb118f8f1 = glDrawer;
                this.f75358x6273cbb5 = z17;
                android.os.HandlerThread handlerThread = new android.os.HandlerThread(this.f75354x337a8b + TAG);
                handlerThread.start();
                org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.HandlerWithExceptionCallback handlerWithExceptionCallback = new org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.HandlerWithExceptionCallback(handlerThread.getLooper(), new java.lang.Runnable() { // from class: org.webrtc.EglRenderer.2
                    @Override // java.lang.Runnable
                    public void run() {
                        synchronized (org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.this.f75346x59fedb95) {
                            org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.this.f75357x521c93ea = null;
                        }
                    }
                });
                this.f75357x521c93ea = handlerWithExceptionCallback;
                org.p3371xd0ce3e8d.C29882xd5f5f0a7.m156477x29214152(handlerWithExceptionCallback, new java.lang.Runnable() { // from class: org.webrtc.EglRenderer$$h
                    @Override // java.lang.Runnable
                    public final void run() {
                        org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.this.m155466xe3ede919(context, iArr);
                    }
                });
                this.f75357x521c93ea.post(this.f75340x5d7d727f);
                this.f75335x56e49aa6.m156209x36f793d2(java.lang.System.nanoTime());
                this.f75357x521c93ea.postDelayed(this.f75349x96c5abc4, java.util.concurrent.TimeUnit.SECONDS.toMillis(4L));
            } else {
                throw new java.lang.IllegalStateException(this.f75354x337a8b + "Already initialized");
            }
        }
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29908xc6e4d18e
    /* renamed from: onFrame */
    public void mo155128xaf987ece(org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d2) {
        boolean z17;
        synchronized (this.f75335x56e49aa6) {
            this.f75336x8a43d177.m156207x1b9f5b90();
            this.f75335x56e49aa6.f75842x53c4cca7++;
        }
        synchronized (this.f75346x59fedb95) {
            if (this.f75357x521c93ea == null) {
                m155471x32c580("Dropping frame - Not initialized or already released.");
                return;
            }
            synchronized (this.f75345x207a6438) {
                org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d22 = this.f75356x8589616;
                z17 = c29904x150215d22 != null;
                if (z17) {
                    c29904x150215d22.mo155513x41012807();
                }
                this.f75356x8589616 = c29904x150215d2;
                c29904x150215d2.mo155514xc84df105();
                this.f75357x521c93ea.post(new java.lang.Runnable() { // from class: org.webrtc.EglRenderer$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.this.m155477x117a3416();
                    }
                });
            }
            if (z17) {
                synchronized (this.f75335x56e49aa6) {
                    this.f75335x56e49aa6.f75841xe265143a++;
                }
            }
        }
    }

    /* renamed from: onRenderStats */
    public abstract void mo155489xbae2a94a(org.p3371xd0ce3e8d.C29838x24207153 c29838x24207153);

    /* renamed from: onViewVisibilityChange */
    public void m155490x4fca7ea6(int i17) {
        if (i17 == 4 || i17 == 8) {
            this.f75336x8a43d177.m156208x77b5b46d();
        }
    }

    /* renamed from: pauseVideo */
    public void mo155491xfcac4825() {
        mo155497x7a11490c(0.0f);
    }

    /* renamed from: printStackTrace */
    public void m155492x6e0e6e2a() {
        synchronized (this.f75346x59fedb95) {
            android.os.Handler handler = this.f75357x521c93ea;
            java.lang.Thread thread = handler == null ? null : handler.getLooper().getThread();
            if (thread != null) {
                java.lang.StackTraceElement[] stackTrace = thread.getStackTrace();
                if (stackTrace.length > 0) {
                    m155474x32c593("EglRenderer stack trace:");
                    for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
                        m155474x32c593(stackTraceElement.toString());
                    }
                }
            }
        }
    }

    /* renamed from: release */
    public void m155493x41012807() {
        m155471x32c580("Releasing.");
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        synchronized (this.f75346x59fedb95) {
            android.os.Handler handler = this.f75357x521c93ea;
            if (handler == null) {
                m155471x32c580("Already released");
                return;
            }
            handler.removeCallbacks(this.f75349x96c5abc4);
            this.f75357x521c93ea.postAtFrontOfQueue(new java.lang.Runnable() { // from class: org.webrtc.EglRenderer$$c
                @Override // java.lang.Runnable
                public final void run() {
                    org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.this.m155467x7afbb637(countDownLatch);
                }
            });
            final android.os.Looper looper = this.f75357x521c93ea.getLooper();
            this.f75357x521c93ea.post(new java.lang.Runnable() { // from class: org.webrtc.EglRenderer$$d
                @Override // java.lang.Runnable
                public final void run() {
                    org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.this.m155468x7afbb638(looper);
                }
            });
            this.f75357x521c93ea = null;
            org.p3371xd0ce3e8d.C29882xd5f5f0a7.m156471x3f10571a(countDownLatch);
            synchronized (this.f75345x207a6438) {
                org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d2 = this.f75356x8589616;
                if (c29904x150215d2 != null) {
                    c29904x150215d2.mo155513x41012807();
                    this.f75356x8589616 = null;
                }
            }
            m155471x32c580("Releasing done.");
        }
    }

    /* renamed from: releaseEglSurface */
    public void m155494xc905a4aa(final java.lang.Runnable runnable) {
        this.f75340x5d7d727f.m155502x42c875eb(null);
        synchronized (this.f75346x59fedb95) {
            android.os.Handler handler = this.f75357x521c93ea;
            if (handler == null) {
                runnable.run();
            } else {
                handler.removeCallbacks(this.f75340x5d7d727f);
                this.f75357x521c93ea.postAtFrontOfQueue(new java.lang.Runnable() { // from class: org.webrtc.EglRenderer$$f
                    @Override // java.lang.Runnable
                    public final void run() {
                        org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.this.m155469x14c5f65e(runnable);
                    }
                });
            }
        }
    }

    /* renamed from: removeFrameListener */
    public void m155495xb797431d(final org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.FrameListener frameListener) {
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        synchronized (this.f75346x59fedb95) {
            if (this.f75357x521c93ea == null) {
                return;
            }
            if (java.lang.Thread.currentThread() == this.f75357x521c93ea.getLooper().getThread()) {
                throw new java.lang.RuntimeException("removeFrameListener must not be called on the render thread.");
            }
            m155476xc411821b(new java.lang.Runnable() { // from class: org.webrtc.EglRenderer$$b
                @Override // java.lang.Runnable
                public final void run() {
                    org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.this.m155470x5af46750(countDownLatch, frameListener);
                }
            });
            org.p3371xd0ce3e8d.C29882xd5f5f0a7.m156471x3f10571a(countDownLatch);
        }
    }

    /* renamed from: setErrorCallback */
    public void m155496x10c2f12b(org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.ErrorCallback errorCallback) {
        this.f75341xc08cce6d = errorCallback;
    }

    /* renamed from: setFpsReduction */
    public void mo155497x7a11490c(float f17) {
        m155471x32c580("setFpsReduction: " + f17);
        synchronized (this.f75342xc33d1fd5) {
            long j17 = this.f75351xe900be0e;
            if (f17 <= 0.0f) {
                this.f75351xe900be0e = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
            } else {
                this.f75351xe900be0e = ((float) java.util.concurrent.TimeUnit.SECONDS.toNanos(1L)) / f17;
            }
            if (this.f75351xe900be0e != j17) {
                this.f75355x5ee4c44c = java.lang.System.nanoTime();
            }
        }
    }

    /* renamed from: setFrameWithGLCallback */
    public void m155498x7e22589b(org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.OnFrameInGLEnv onFrameInGLEnv) {
        this.f75350xc249cab0 = onFrameInGLEnv;
    }

    /* renamed from: setLayoutAspectRatio */
    public void m155499x397cc4c7(float f17) {
        m155471x32c580("setLayoutAspectRatio: " + f17);
        synchronized (this.f75348x14598f75) {
            this.f75347xab23109 = f17;
        }
    }

    /* renamed from: setMirror */
    public void m155500x1849c2c1(boolean z17) {
        m155471x32c580("setMirrorHorizontally: " + z17);
        synchronized (this.f75348x14598f75) {
            this.f75352xe9453a10 = z17;
        }
    }

    /* renamed from: setMirrorVertically */
    public void m155501x23fc5124(boolean z17) {
        m155471x32c580("setMirrorVertically: " + z17);
        synchronized (this.f75348x14598f75) {
            this.f75353xd82754a2 = z17;
        }
    }

    public AbstractC29764xde6b2acd(java.lang.String str, org.p3371xd0ce3e8d.C29906x8db8d563 c29906x8db8d563) {
        this.f75350xc249cab0 = null;
        this.f75346x59fedb95 = new java.lang.Object();
        this.f75344x142e9352 = new java.util.ArrayList<>();
        this.f75342xc33d1fd5 = new java.lang.Object();
        this.f75337xef73ae25 = new android.graphics.Matrix();
        this.f75345x207a6438 = new java.lang.Object();
        this.f75348x14598f75 = new java.lang.Object();
        this.f75335x56e49aa6 = new org.p3371xd0ce3e8d.C29838x24207153();
        this.f75336x8a43d177 = new org.p3371xd0ce3e8d.C29837x46c7b4c7();
        this.f75334xacbe3b61 = new org.p3371xd0ce3e8d.C29783x806035d7(com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e);
        this.f75349x96c5abc4 = new java.lang.Runnable() { // from class: org.webrtc.EglRenderer.1
            @Override // java.lang.Runnable
            public void run() {
                org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.this.m155473x4e7feb87();
                synchronized (org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.this.f75346x59fedb95) {
                    if (org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.this.f75357x521c93ea != null) {
                        org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.this.f75357x521c93ea.removeCallbacks(org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.this.f75349x96c5abc4);
                        org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.this.f75357x521c93ea.postDelayed(org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.this.f75349x96c5abc4, java.util.concurrent.TimeUnit.SECONDS.toMillis(4L));
                    }
                }
            }
        };
        this.f75340x5d7d727f = new org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.EglSurfaceCreation();
        this.f75354x337a8b = str;
        this.f75343xddf508be = c29906x8db8d563;
    }

    /* renamed from: addFrameListener */
    public void m155479xb2909a20(org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.FrameListener frameListener, float f17, org.p3371xd0ce3e8d.C29847x54db44ae.GlDrawer glDrawer) {
        m155480xb2909a20(frameListener, f17, glDrawer, false);
    }

    /* renamed from: clearImage */
    public void m155482xd318eb0e(final float f17, final float f18, final float f19, final float f27) {
        synchronized (this.f75346x59fedb95) {
            android.os.Handler handler = this.f75357x521c93ea;
            if (handler == null) {
                return;
            }
            handler.postAtFrontOfQueue(new java.lang.Runnable() { // from class: org.webrtc.EglRenderer$$g
                @Override // java.lang.Runnable
                public final void run() {
                    org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.this.m155465x9b0895dd(f17, f18, f19, f27);
                }
            });
        }
    }

    /* renamed from: createEglSurface */
    public void m155483x3d132f5f(android.graphics.SurfaceTexture surfaceTexture) {
        m155463x35b38b3c(surfaceTexture);
    }

    /* renamed from: addFrameListener */
    public void m155480xb2909a20(final org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.FrameListener frameListener, final float f17, final org.p3371xd0ce3e8d.C29847x54db44ae.GlDrawer glDrawer, final boolean z17) {
        m155476xc411821b(new java.lang.Runnable() { // from class: org.webrtc.EglRenderer$$e
            @Override // java.lang.Runnable
            public final void run() {
                org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.this.m155464x4421c6ac(glDrawer, frameListener, f17, z17);
            }
        });
    }

    /* renamed from: init */
    public void mo155487x316510(org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.Context context, int[] iArr, org.p3371xd0ce3e8d.C29847x54db44ae.GlDrawer glDrawer) {
        m155488x316510(context, iArr, glDrawer, false);
    }
}
