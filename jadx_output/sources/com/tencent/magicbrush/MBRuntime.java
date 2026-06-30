package com.tencent.magicbrush;

/* loaded from: classes7.dex */
public abstract class MBRuntime {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f48576j = 0;

    /* renamed from: a, reason: collision with root package name */
    public volatile long f48577a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.magicbrush.MBRuntime.MBParams f48578b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.magicbrush.MBRuntime f48579c;

    /* renamed from: g, reason: collision with root package name */
    public volatile ch.g f48583g;

    /* renamed from: h, reason: collision with root package name */
    public gh.c f48584h;

    /* renamed from: d, reason: collision with root package name */
    public yg.w f48580d = null;

    /* renamed from: e, reason: collision with root package name */
    public com.github.henryye.nativeiv.BaseImageDecodeService f48581e = null;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.magicbrush.ext_texture.MBExternalTexturePlugin f48582f = null;

    /* renamed from: i, reason: collision with root package name */
    public final yg.h f48585i = new yg.h(this);

    /* loaded from: classes7.dex */
    public static class MBParams {
        public java.lang.String program_binary_path;
        public java.lang.String render_thread_name;
        public java.lang.String sdcard_path;
        public boolean allow_antialias_ = false;
        public float device_pixel_ratio_ = -1.0f;
        public int screen_width_ = -1;
        public int screen_height_ = -1;
        public boolean enable_gfx = true;
        public float gc_factor = 0.0f;
        public boolean enable_window_attributes_alpha = false;
        public boolean render_thread_profiler = false;
        public gh.b animationFrameHandlerStrategy = gh.b.ChoreographerInJsThread;
        public com.tencent.magicbrush.handler.fs.IMBFileSystemInner file_system_ = null;
        public ah.j resDelegate = null;
        public boolean sync_surface_destroy = true;
        public boolean enable_gpu_unwrap = false;
        public long app_brand_runtime = 0;
        public boolean enable_angle_translator = false;
        public float max_available_fps = 60.0f;
        public boolean enable_program_binary = false;
        public boolean suspend_raf_when_no_window = true;
        public boolean fetch_fps_by_period = true;
        public int enable_parallel_shader_compile = 0;
        public boolean enable_window_refactor = false;
        public boolean enable_cmdbuffer_canvas2d = false;
        public boolean enable_cmdbuffer_canvas = false;
        public boolean enable_unified_cmdbuffer = false;
    }

    static {
        ah.i.b("MicroMsg.MagicBrush.MBRuntime", "enter static block", new java.lang.Object[0]);
        ah.d.a();
    }

    private native int[] nativeGetCanvasSize(long j17, int i17);

    private native int nativeGetGLThreadTid(long j17);

    private native int nativeGetJsThreadTid(long j17);

    private native void nativeMarkNeedCallbackBeforeSwapThisFrame(long j17);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeNotifyLoadDataFromURL(long j17, java.lang.String str, byte[] bArr);

    private native void nativeNotifyScreenSizeChanged(long j17, int i17, int i18);

    private native void nativeSetupFrameCapture(long j17, int i17);

    private native void nativeStartCaptureFrames(long j17, int i17, int i18);

    private native void nativeStopCaptureFrames(long j17, int i17);

    public void applyWindowAttributes(int i17, boolean z17) {
        hh.i.b(new yg.n(this, i17, z17));
    }

    /* renamed from: b */
    public abstract yg.b getF48591o();

    public void beforeSwap(boolean z17) {
        ah.i.b("MicroMsg.MagicBrush.MBRuntime", "hy: beforeSwap! %b", java.lang.Boolean.valueOf(z17));
        yg.w wVar = this.f48580d;
        if (wVar != null) {
            yg.c$$a c__a = (yg.c$$a) wVar;
            yg.b this$0 = c__a.f462034a;
            kotlin.jvm.internal.o.g(this$0, "this$0");
            yg.c this$1 = c__a.f462038e;
            kotlin.jvm.internal.o.g(this$1, "this$1");
            ah.i.b("MagicBrush.MBCanvasHandler", "hy: is swap all window: " + z17, new java.lang.Object[0]);
            this$1.b(this$0.c(c__a.f462035b, c__a.f462036c, c__a.f462037d));
        }
    }

    public final int c(float f17, float f18, float f19, float f27, int i17, int i18) {
        yg.b0 f48592p = getF48592p();
        java.util.Objects.requireNonNull(f48592p);
        com.tencent.magicbrush.ui.MagicBrushView Z = f48592p.Z();
        float f28 = this.f48578b.device_pixel_ratio_;
        if (f28 <= 0.0f) {
            throw new java.lang.IllegalStateException("device pixel ratio is null");
        }
        float f29 = f17 * f28;
        float f37 = f18 * f28;
        float f38 = f19 * f28;
        float f39 = f27 * f28;
        Z.setCanvasId(i18);
        yg.b0 f48592p2 = getF48592p();
        java.util.Objects.requireNonNull(f48592p2);
        f48592p2.a0(Z, java.lang.Math.round(f29), java.lang.Math.round(f37), java.lang.Math.round(f38), java.lang.Math.round(f39), i17);
        return Z.getVirtualElementId();
    }

    public android.graphics.Bitmap captureScreen(int i17, int i18, int i19, android.graphics.Bitmap bitmap) {
        yg.b f48591o = getF48591o();
        f48591o.getClass();
        if (!(i18 > 0 && i19 > 0)) {
            java.lang.String format = java.lang.String.format("captureScreenCanvas of [%d] [%d, %d]", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19)}, 3));
            kotlin.jvm.internal.o.f(format, "format(...)");
            throw new java.lang.IllegalStateException(format.toString());
        }
        com.tencent.magicbrush.ui.MagicBrushView f17 = f48591o.f(i17);
        if (f17 == null) {
            return null;
        }
        android.os.Handler handler = hh.i.f281443a;
        hh.h hVar = new hh.h(new hh.i$$a(new yg.d(f17, i18, i19, bitmap)));
        hh.i.b(hVar);
        return (android.graphics.Bitmap) hVar.b();
    }

    public synchronized boolean d() {
        return this.f48577a == 0;
    }

    public boolean doInnerLoopTask() {
        if (this.f48583g != null) {
            return this.f48583g.j();
        }
        return true;
    }

    public void e() {
        com.tencent.magicbrush.MBRuntime mBRuntime = this.f48579c;
        if (mBRuntime != null) {
            mBRuntime.e();
        }
        ah.i.b("MicroMsg.MagicBrush.MBRuntime", "MBRuntime.pause ", new java.lang.Object[0]);
        yg.h hVar = this.f48585i;
        android.os.Handler handler = hVar.f462067d;
        if (handler != null) {
            handler.removeCallbacks(hVar.f462068e);
            hVar.f462067d = null;
        }
        o(new yg.p(this));
    }

    public void f() {
        com.tencent.magicbrush.MBRuntime mBRuntime = this.f48579c;
        if (mBRuntime != null) {
            mBRuntime.f();
        }
        ah.i.b("MicroMsg.MagicBrush.MBRuntime", "MBRuntime.resume ", new java.lang.Object[0]);
        if (this.f48578b.fetch_fps_by_period) {
            yg.h hVar = this.f48585i;
            if (hVar.f462067d == null) {
                android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
                hVar.f462067d = handler;
                handler.post(hVar.f462068e);
            }
        }
        o(new yg.o(this));
    }

    public void g(int i17, int i18, long j17, ch.b bVar) {
        com.tencent.magicbrush.MBRuntime mBRuntime = this.f48579c;
        if (mBRuntime != null) {
            mBRuntime.g(i17, i18, j17, bVar);
            return;
        }
        if (this.f48577a == 0) {
            com.tencent.magicbrush.handler.JsTouchEventHandler jsTouchEventHandler = (com.tencent.magicbrush.handler.JsTouchEventHandler) ((ch.d) bVar).f41179a.get();
            if (jsTouchEventHandler != null) {
                jsTouchEventHandler.nativeFreeTouchEvent(j17);
                return;
            }
            return;
        }
        ch.g gVar = this.f48583g;
        if (gVar != null) {
            gVar.k(new yg.l(this, bVar, j17, i18, i17), false);
            return;
        }
        com.tencent.magicbrush.handler.JsTouchEventHandler jsTouchEventHandler2 = (com.tencent.magicbrush.handler.JsTouchEventHandler) ((ch.d) bVar).f41179a.get();
        if (jsTouchEventHandler2 != null) {
            jsTouchEventHandler2.nativeFreeTouchEvent(j17);
        }
    }

    public void h(int i17, int i18, android.graphics.SurfaceTexture surfaceTexture, int i19, int i27, boolean z17) {
        ah.i.b("MicroMsg.MagicBrush.MBRuntime", "MBRuntime.notifyWindowAvailable windowId:%d canvasId:%d %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), surfaceTexture);
        if (this.f48578b.enable_window_refactor) {
            i(i17, i18, new android.view.Surface(surfaceTexture), i19, i27, z17);
        } else {
            if (i18 < 0) {
                throw new java.lang.IllegalArgumentException("windowId < 0");
            }
            o(new yg.s(this, surfaceTexture, i18, i19, i27, z17));
        }
    }

    public void i(int i17, int i18, android.view.Surface surface, int i19, int i27, boolean z17) {
        ah.i.b("MicroMsg.MagicBrush.MBRuntime", "hy: notifyWindowAvailable: %d, %d, %d, %d %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), surface);
        if (this.f48578b.enable_window_refactor) {
            synchronized (this) {
                nativeNotifyWindowAvailableForSurface(this.f48577a, i18, i17, surface, i19, i27, z17);
            }
        } else {
            if (surface == null) {
                throw new java.lang.RuntimeException("surface == null");
            }
            o(new yg.t(this, i18, i17, surface, i19, i27, z17));
        }
    }

    public int insertElement(float f17, float f18, float f19, float f27, int i17, int i18) {
        int i19;
        try {
            i19 = c(f17, f18, f19, f27, i17, i18);
        } catch (java.lang.Exception e17) {
            e = e17;
            i19 = -1;
        }
        try {
            ah.i.b("MicroMsg.MagicBrush.MBRuntime", "dl: ScreenCanvas: insertElement a ScreenCanvas [%f, %f, %f, %f, %d]...done", java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18), java.lang.Float.valueOf(f19), java.lang.Float.valueOf(f27), java.lang.Integer.valueOf(i17));
        } catch (java.lang.Exception e18) {
            e = e18;
            ah.i.c("MicroMsg.MagicBrush.MBRuntime", e, "dl: ScreenCanvas: insertElement failed", new java.lang.Object[0]);
            ah.i.b("MicroMsg.MagicBrush.MBRuntime", "dl: ScreenCanvas: insertElement a ScreenCanvas, result = [%d]", java.lang.Integer.valueOf(i19));
            return i19;
        }
        ah.i.b("MicroMsg.MagicBrush.MBRuntime", "dl: ScreenCanvas: insertElement a ScreenCanvas, result = [%d]", java.lang.Integer.valueOf(i19));
        return i19;
    }

    public void j(int i17, android.view.Surface surface, int i18, int i19) {
        ah.i.b("MicroMsg.MagicBrush.MBRuntime", "MBRuntime.notifyWindowChanged Surface[%s] %d, %d", surface, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        if (this.f48578b.enable_window_refactor) {
            synchronized (this) {
                nativeNotifyWindowChangedForSurface(this.f48577a, i17, surface, i18, i19);
            }
        } else {
            if (i17 < 0) {
                throw new java.lang.IllegalArgumentException("windowId < 0");
            }
            o(new yg.v(this, surface, i17, i18, i19));
        }
    }

    public void k(int i17, android.graphics.SurfaceTexture surfaceTexture, boolean z17) {
        ah.i.b("MicroMsg.MagicBrush.MBRuntime", "MBRuntime.notifyWindowDestroyed shouldDestroySync: %b", java.lang.Boolean.valueOf(z17));
        if (this.f48577a == 0) {
            return;
        }
        com.tencent.magicbrush.MBRuntime.MBParams mBParams = this.f48578b;
        if (mBParams.enable_window_refactor) {
            synchronized (this) {
                nativeNotifyWindowDestroyed(this.f48577a, i17);
            }
            return;
        }
        if (i17 < 0) {
            throw new java.lang.IllegalArgumentException("windowId < 0");
        }
        java.lang.Runnable jVar = new yg.j(this, i17, surfaceTexture);
        if (!z17) {
            ah.i.b("MicroMsg.MagicBrush.MBRuntime", "[surface] destroy window(surfacetexture) runOnJsThreadIgnorePause windowId:%d %s", java.lang.Integer.valueOf(i17), surfaceTexture);
            o(jVar);
            return;
        }
        boolean z18 = mBParams.sync_surface_destroy;
        ah.i.b("MicroMsg.MagicBrush.MBRuntime", "[surface] destroy window(surfacetexture) param:true windowId:%d sync?%b %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z18), surfaceTexture);
        if (z18) {
            hh.h hVar = new hh.h(jVar);
            if (o(hVar)) {
                hVar.a(3000L);
                hVar.f281442d.isDone();
            }
        } else {
            o(jVar);
        }
        ah.i.b("MicroMsg.MagicBrush.MBRuntime", "[surface] destroy window(surfacetexture) done. windowId:%d", java.lang.Integer.valueOf(i17));
    }

    public void l(int i17, android.view.Surface surface, boolean z17) {
        boolean isDone;
        ah.i.b("MicroMsg.MagicBrush.MBRuntime", "hy: notifyWindowDestroyed: %d", java.lang.Integer.valueOf(i17));
        if (this.f48577a == 0) {
            return;
        }
        if (this.f48578b.enable_window_refactor) {
            synchronized (this) {
                nativeNotifyWindowDestroyed(this.f48577a, i17);
            }
            return;
        }
        if (i17 < 0) {
            throw new java.lang.IllegalArgumentException("windowId < 0");
        }
        synchronized (this) {
            if (this.f48577a != 0) {
                nativeNotifyBeforeWindowDestroyed(this.f48577a, i17);
            }
        }
        boolean z18 = this.f48578b.sync_surface_destroy || z17;
        java.lang.Runnable kVar = new yg.k(this, i17);
        ah.i.b("MicroMsg.MagicBrush.MBRuntime", "[surface] destroy window(surface) windowId:%d sync?%b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z18));
        if (!z18) {
            o(kVar);
            return;
        }
        ch.g gVar = this.f48583g;
        hh.h hVar = new hh.h(kVar);
        if (o(hVar)) {
            hVar.a(3000L);
            isDone = hVar.f281442d.isDone();
        } else {
            isDone = false;
        }
        if (isDone) {
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = gVar != null ? gVar.a() : com.eclipsesource.mmv8.Platform.UNKNOWN;
        ah.i.a("MicroMsg.MagicBrush.MBRuntime", "notifyWindowDestroyed, but await fail. [deadlock]:    %s", objArr);
    }

    public void m(yg.w wVar) {
        this.f48580d = wVar;
        nativeMarkNeedCallbackBeforeSwapThisFrame(this.f48577a);
    }

    public boolean n(java.lang.Runnable runnable) {
        ch.g gVar;
        if (runnable == null || this.f48577a == 0 || (gVar = this.f48583g) == null) {
            return false;
        }
        gVar.k(new yg.q(this, runnable), false);
        return true;
    }

    public native void nativeBindTo(long j17, long j18, long j19, long j27);

    public native android.graphics.Bitmap nativeCaptureCanvas(long j17, int i17);

    public native android.graphics.Bitmap nativeCaptureScreen(long j17, int i17);

    public native long nativeCreate(com.tencent.magicbrush.MBRuntime.MBParams mBParams, com.github.henryye.nativeiv.api.IImageDecodeService iImageDecodeService, com.tencent.magicbrush.internal.EventDispatcher eventDispatcher);

    public native void nativeDestroy(long j17);

    public native float[] nativeGetCurrentFps(long j17);

    public native float nativeGetCurrentFpsVariance(long j17);

    public native int nativeGetDrawCalls(long j17);

    public native int nativeGetFrameCounter(long j17);

    public native boolean nativeGetIsMali(long j17);

    public native int nativeGetTriangles(long j17);

    public native int nativeGetVertexes(long j17);

    public native void nativeInit(long j17, com.tencent.magicbrush.ext_texture.MBExternalTexturePlugin mBExternalTexturePlugin);

    public native void nativeLazyLoadBox2D(long j17, java.lang.String str);

    public native void nativeLazyLoadPhysx(long j17, java.lang.String str);

    public native void nativeNotifyAnimationFrame(long j17, double d17);

    public native void nativeNotifyAnimationFrameLooper(long j17);

    public native void nativeNotifyBeforeWindowDestroyed(long j17, int i17);

    public native void nativeNotifyImageDecoded(long j17, java.lang.String str, java.lang.Object obj, com.github.henryye.nativeiv.ImageDecodeConfig imageDecodeConfig);

    public native void nativeNotifyTouchEvent(long j17, int i17, int i18, long j18);

    public native void nativeNotifyWindowAvailable(long j17, int i17, android.graphics.SurfaceTexture surfaceTexture, int i18, int i19, boolean z17);

    public native void nativeNotifyWindowAvailableForSurface(long j17, int i17, int i18, android.view.Surface surface, int i19, int i27, boolean z17);

    public native void nativeNotifyWindowChanged(long j17, int i17, android.graphics.SurfaceTexture surfaceTexture, int i18, int i19);

    public native void nativeNotifyWindowChangedForSurface(long j17, int i17, android.view.Surface surface, int i18, int i19);

    public native void nativeNotifyWindowDestroyed(long j17, int i17);

    public native void nativePause(long j17);

    public native void nativeRegisterExtSurface(long j17, int i17, java.lang.String str, int i18, int i19, android.view.Surface surface, boolean z17);

    public native void nativeResume(long j17);

    public native void nativeSetEnableInspectFpsVariance(long j17, boolean z17);

    public native void nativeSetUserPreferredFps(long j17, double d17);

    public native void nativeStopAnimationFrameLooper(long j17);

    public native void nativeUnregisterExtSurface(long j17, int i17, java.lang.String str);

    public boolean o(java.lang.Runnable runnable) {
        ch.g gVar;
        if (runnable == null || this.f48577a == 0 || (gVar = this.f48583g) == null) {
            return false;
        }
        gVar.k(new yg.r(this, runnable), true);
        return true;
    }

    public void onFrameCaptureGenerated(java.lang.String str) {
        ah.i.b("MicroMsg.MagicBrush.MBRuntime", "frame capture file generated %s", str);
        ah.j jVar = this.f48578b.resDelegate;
        if (jVar != null) {
            jVar.a(str);
        }
    }

    /* renamed from: p */
    public abstract yg.b0 getF48592p();

    /* renamed from: q */
    public abstract com.tencent.magicbrush.ui.MBViewManager getF48590n();

    public void removeElement(int i17) {
        try {
            com.tencent.magicbrush.ui.MagicBrushView findOrNull = getF48590n().findOrNull(i17);
            if (findOrNull == null) {
                ah.i.a("MicroMsg.MagicBrush.MBRuntime", "dl: ScreenCanvas: removeElement window_id = [%d] not found!", java.lang.Integer.valueOf(i17));
                return;
            }
            yg.b0 f48592p = getF48592p();
            java.util.Objects.requireNonNull(f48592p);
            f48592p.w0(findOrNull);
            ah.i.b("MicroMsg.MagicBrush.MBRuntime", "dl: ScreenCanvas: removeElement a ScreenCanvas window_id = [%d]...done", java.lang.Integer.valueOf(i17));
        } catch (java.lang.Exception e17) {
            ah.i.c("MicroMsg.MagicBrush.MBRuntime", e17, "dl: ScreenCanvas: removeElement failed", new java.lang.Object[0]);
        }
    }

    public void resumeLoopTasks() {
        if (this.f48583g != null) {
            this.f48583g.e();
        }
    }

    public void setTouchableRectList(int i17, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        try {
            com.tencent.magicbrush.ui.MagicBrushView findOrNull = getF48590n().findOrNull(i17);
            if (findOrNull == null) {
                ah.i.a("MicroMsg.MagicBrush.MBRuntime", "ScreenCanvas: setTouchableRectList window_id = [%d] not found!", java.lang.Integer.valueOf(i17));
                return;
            }
            float f17 = this.f48578b.device_pixel_ratio_;
            for (int i18 = 0; i18 < fArr.length; i18++) {
                fArr[i18] = fArr[i18] * f17;
                fArr2[i18] = fArr2[i18] * f17;
                fArr3[i18] = fArr3[i18] * f17;
                fArr4[i18] = fArr4[i18] * f17;
            }
            yg.b0 f48592p = getF48592p();
            java.util.Objects.requireNonNull(f48592p);
            f48592p.M(findOrNull, fArr, fArr2, fArr3, fArr4);
            ah.i.b("MicroMsg.MagicBrush.MBRuntime", "ScreenCanvas: setTouchableRectList for window_id = [%d]...done", java.lang.Integer.valueOf(i17));
        } catch (java.lang.Exception e17) {
            ah.i.c("MicroMsg.MagicBrush.MBRuntime", e17, "ScreenCanvas: setTouchableRect failed", new java.lang.Object[0]);
        }
    }

    public void updateElement(int i17, float f17, float f18, float f19, float f27, int i18) {
        try {
            com.tencent.magicbrush.ui.MagicBrushView findOrNull = getF48590n().findOrNull(i17);
            if (findOrNull == null) {
                ah.i.a("MicroMsg.MagicBrush.MBRuntime", "dl: ScreenCanvas: updateElement window_id = [%d] not found!", java.lang.Integer.valueOf(i17));
                return;
            }
            try {
                float f28 = this.f48578b.device_pixel_ratio_;
                if (f28 <= 0.0f) {
                    throw new java.lang.IllegalStateException("device pixel ratio is null");
                }
                yg.b0 f48592p = getF48592p();
                java.util.Objects.requireNonNull(f48592p);
                f48592p.q0(findOrNull, java.lang.Math.round(f17 * f28), java.lang.Math.round(f18 * f28), java.lang.Math.round(f19 * f28), java.lang.Math.round(f28 * f27), i18);
            } catch (java.lang.Exception e17) {
                e = e17;
                ah.i.c("MicroMsg.MagicBrush.MBRuntime", e, "dl: ScreenCanvas: updateElement failed", new java.lang.Object[0]);
            }
        } catch (java.lang.Exception e18) {
            e = e18;
        }
    }
}
