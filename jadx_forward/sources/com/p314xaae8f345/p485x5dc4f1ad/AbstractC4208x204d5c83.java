package com.p314xaae8f345.p485x5dc4f1ad;

/* renamed from: com.tencent.magicbrush.MBRuntime */
/* loaded from: classes7.dex */
public abstract class AbstractC4208x204d5c83 {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f130109j = 0;

    /* renamed from: a, reason: collision with root package name */
    public volatile long f130110a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83.MBParams f130111b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 f130112c;

    /* renamed from: g, reason: collision with root package name */
    public volatile ch.g f130116g;

    /* renamed from: h, reason: collision with root package name */
    public gh.c f130117h;

    /* renamed from: d, reason: collision with root package name */
    public yg.w f130113d = null;

    /* renamed from: e, reason: collision with root package name */
    public com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1591x6c90f41d f130114e = null;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p485x5dc4f1ad.p486xa7b754fd.C4211x20e2c38e f130115f = null;

    /* renamed from: i, reason: collision with root package name */
    public final yg.h f130118i = new yg.h(this);

    /* renamed from: com.tencent.magicbrush.MBRuntime$MBParams */
    /* loaded from: classes7.dex */
    public static class MBParams {

        /* renamed from: program_binary_path */
        public java.lang.String f16204xe6234068;

        /* renamed from: render_thread_name */
        public java.lang.String f16205x33a4a77;

        /* renamed from: sdcard_path */
        public java.lang.String f16210x40cf88c3;

        /* renamed from: allow_antialias_ */
        public boolean f16186x9f0460a7 = false;

        /* renamed from: device_pixel_ratio_ */
        public float f16189xa3ade0d6 = -1.0f;

        /* renamed from: screen_width_ */
        public int f16209x6198b68c = -1;

        /* renamed from: screen_height_ */
        public int f16208xb16dcf45 = -1;

        /* renamed from: enable_gfx */
        public boolean f16193x70dd6abd = true;

        /* renamed from: gc_factor */
        public float f16202x28a0fa12 = 0.0f;

        /* renamed from: enable_window_attributes_alpha */
        public boolean f16198xd4039629 = false;

        /* renamed from: render_thread_profiler */
        public boolean f16206x4647a5d5 = false;

        /* renamed from: animationFrameHandlerStrategy */
        public gh.b f16187x9cfe4154 = gh.b.ChoreographerInJsThread;

        /* renamed from: file_system_ */
        public com.p314xaae8f345.p485x5dc4f1ad.p487x294b574a.fs.InterfaceC4213x5d50cacd f16201xd592344d = null;

        /* renamed from: resDelegate */
        public ah.j f16207x7e3f5a45 = null;

        /* renamed from: sync_surface_destroy */
        public boolean f16212xcb3d10c4 = true;

        /* renamed from: enable_gpu_unwrap */
        public boolean f16194x3cbb2d92 = false;

        /* renamed from: app_brand_runtime */
        public long f16188x52b1c982 = 0;

        /* renamed from: enable_angle_translator */
        public boolean f16190x3ccaf842 = false;

        /* renamed from: max_available_fps */
        public float f16203x3069f2d8 = 60.0f;

        /* renamed from: enable_program_binary */
        public boolean f16196xd1818058 = false;

        /* renamed from: suspend_raf_when_no_window */
        public boolean f16211x455bef74 = true;

        /* renamed from: fetch_fps_by_period */
        public boolean f16200xcc21ea0e = true;

        /* renamed from: enable_parallel_shader_compile */
        public int f16195x1962e655 = 0;

        /* renamed from: enable_window_refactor */
        public boolean f16199x4fc22df5 = false;

        /* renamed from: enable_cmdbuffer_canvas2d */
        public boolean f16192xca6942ab = false;

        /* renamed from: enable_cmdbuffer_canvas */
        public boolean f16191x9ccf679 = false;

        /* renamed from: enable_unified_cmdbuffer */
        public boolean f16197x220203d1 = false;
    }

    static {
        ah.i.b("MicroMsg.MagicBrush.MBRuntime", "enter static block", new java.lang.Object[0]);
        ah.d.a();
    }

    /* renamed from: nativeGetCanvasSize */
    private native int[] m34745xe9041298(long j17, int i17);

    /* renamed from: nativeGetGLThreadTid */
    private native int m34746x2fef95a1(long j17);

    /* renamed from: nativeGetJsThreadTid */
    private native int m34747x25cde99d(long j17);

    /* renamed from: nativeMarkNeedCallbackBeforeSwapThisFrame */
    private native void m34748x6fa798be(long j17);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeNotifyLoadDataFromURL */
    public native void m34749x99cfef35(long j17, java.lang.String str, byte[] bArr);

    /* renamed from: nativeNotifyScreenSizeChanged */
    private native void m34750x2c9c5507(long j17, int i17, int i18);

    /* renamed from: nativeSetupFrameCapture */
    private native void m34751xf4dfacdf(long j17, int i17);

    /* renamed from: nativeStartCaptureFrames */
    private native void m34752x18951ac1(long j17, int i17, int i18);

    /* renamed from: nativeStopCaptureFrames */
    private native void m34753x9d532753(long j17, int i17);

    /* renamed from: applyWindowAttributes */
    public void m34754xfc8460f5(int i17, boolean z17) {
        hh.i.b(new yg.n(this, i17, z17));
    }

    /* renamed from: b */
    public abstract yg.b getF130124o();

    /* renamed from: beforeSwap */
    public void m34755x1ee7edb2(boolean z17) {
        ah.i.b("MicroMsg.MagicBrush.MBRuntime", "hy: beforeSwap! %b", java.lang.Boolean.valueOf(z17));
        yg.w wVar = this.f130113d;
        if (wVar != null) {
            yg.C30784x2d8c9e c30784x2d8c9e = (yg.C30784x2d8c9e) wVar;
            yg.b this$0 = c30784x2d8c9e.f543567a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(this$0, "this$0");
            yg.c this$1 = c30784x2d8c9e.f543571e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(this$1, "this$1");
            ah.i.b("MagicBrush.MBCanvasHandler", "hy: is swap all window: " + z17, new java.lang.Object[0]);
            this$1.b(this$0.c(c30784x2d8c9e.f543568b, c30784x2d8c9e.f543569c, c30784x2d8c9e.f543570d));
        }
    }

    public final int c(float f17, float f18, float f19, float f27, int i17, int i18) {
        yg.b0 f130125p = getF130125p();
        java.util.Objects.requireNonNull(f130125p);
        com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 Z = f130125p.Z();
        float f28 = this.f130111b.f16189xa3ade0d6;
        if (f28 <= 0.0f) {
            throw new java.lang.IllegalStateException("device pixel ratio is null");
        }
        float f29 = f17 * f28;
        float f37 = f18 * f28;
        float f38 = f19 * f28;
        float f39 = f27 * f28;
        Z.m34865x70452715(i18);
        yg.b0 f130125p2 = getF130125p();
        java.util.Objects.requireNonNull(f130125p2);
        f130125p2.a0(Z, java.lang.Math.round(f29), java.lang.Math.round(f37), java.lang.Math.round(f38), java.lang.Math.round(f39), i17);
        return Z.getVirtualElementId();
    }

    /* renamed from: captureScreen */
    public android.graphics.Bitmap m34756x73fd6752(int i17, int i18, int i19, android.graphics.Bitmap bitmap) {
        yg.b f130124o = getF130124o();
        f130124o.getClass();
        if (!(i18 > 0 && i19 > 0)) {
            java.lang.String format = java.lang.String.format("captureScreenCanvas of [%d] [%d, %d]", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19)}, 3));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            throw new java.lang.IllegalStateException(format.toString());
        }
        com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 f17 = f130124o.f(i17);
        if (f17 == null) {
            return null;
        }
        android.os.Handler handler = hh.i.f362976a;
        hh.h hVar = new hh.h(new hh.CallableC28453x3046d8(new yg.d(f17, i18, i19, bitmap)));
        hh.i.b(hVar);
        return (android.graphics.Bitmap) hVar.b();
    }

    public synchronized boolean d() {
        return this.f130110a == 0;
    }

    /* renamed from: doInnerLoopTask */
    public boolean m34757x46b297f4() {
        if (this.f130116g != null) {
            return this.f130116g.j();
        }
        return true;
    }

    public void e() {
        com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 abstractC4208x204d5c83 = this.f130112c;
        if (abstractC4208x204d5c83 != null) {
            abstractC4208x204d5c83.e();
        }
        ah.i.b("MicroMsg.MagicBrush.MBRuntime", "MBRuntime.pause ", new java.lang.Object[0]);
        yg.h hVar = this.f130118i;
        android.os.Handler handler = hVar.f543600d;
        if (handler != null) {
            handler.removeCallbacks(hVar.f543601e);
            hVar.f543600d = null;
        }
        o(new yg.p(this));
    }

    public void f() {
        com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 abstractC4208x204d5c83 = this.f130112c;
        if (abstractC4208x204d5c83 != null) {
            abstractC4208x204d5c83.f();
        }
        ah.i.b("MicroMsg.MagicBrush.MBRuntime", "MBRuntime.resume ", new java.lang.Object[0]);
        if (this.f130111b.f16200xcc21ea0e) {
            yg.h hVar = this.f130118i;
            if (hVar.f543600d == null) {
                android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
                hVar.f543600d = handler;
                handler.post(hVar.f543601e);
            }
        }
        o(new yg.o(this));
    }

    public void g(int i17, int i18, long j17, ch.b bVar) {
        com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 abstractC4208x204d5c83 = this.f130112c;
        if (abstractC4208x204d5c83 != null) {
            abstractC4208x204d5c83.g(i17, i18, j17, bVar);
            return;
        }
        if (this.f130110a == 0) {
            com.p314xaae8f345.p485x5dc4f1ad.p487x294b574a.C4212xbf459dc6 c4212xbf459dc6 = (com.p314xaae8f345.p485x5dc4f1ad.p487x294b574a.C4212xbf459dc6) ((ch.d) bVar).f122712a.get();
            if (c4212xbf459dc6 != null) {
                c4212xbf459dc6.m34825xe02ed61e(j17);
                return;
            }
            return;
        }
        ch.g gVar = this.f130116g;
        if (gVar != null) {
            gVar.k(new yg.l(this, bVar, j17, i18, i17), false);
            return;
        }
        com.p314xaae8f345.p485x5dc4f1ad.p487x294b574a.C4212xbf459dc6 c4212xbf459dc62 = (com.p314xaae8f345.p485x5dc4f1ad.p487x294b574a.C4212xbf459dc6) ((ch.d) bVar).f122712a.get();
        if (c4212xbf459dc62 != null) {
            c4212xbf459dc62.m34825xe02ed61e(j17);
        }
    }

    public void h(int i17, int i18, android.graphics.SurfaceTexture surfaceTexture, int i19, int i27, boolean z17) {
        ah.i.b("MicroMsg.MagicBrush.MBRuntime", "MBRuntime.notifyWindowAvailable windowId:%d canvasId:%d %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), surfaceTexture);
        if (this.f130111b.f16199x4fc22df5) {
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
        if (this.f130111b.f16199x4fc22df5) {
            synchronized (this) {
                m34780x9c1bbadd(this.f130110a, i18, i17, surface, i19, i27, z17);
            }
        } else {
            if (surface == null) {
                throw new java.lang.RuntimeException("surface == null");
            }
            o(new yg.t(this, i18, i17, surface, i19, i27, z17));
        }
    }

    /* renamed from: insertElement */
    public int m34758x7e662203(float f17, float f18, float f19, float f27, int i17, int i18) {
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
        if (this.f130111b.f16199x4fc22df5) {
            synchronized (this) {
                m34782xcb618d08(this.f130110a, i17, surface, i18, i19);
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
        if (this.f130110a == 0) {
            return;
        }
        com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83.MBParams mBParams = this.f130111b;
        if (mBParams.f16199x4fc22df5) {
            synchronized (this) {
                m34783x6b2991a9(this.f130110a, i17);
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
        boolean z18 = mBParams.f16212xcb3d10c4;
        ah.i.b("MicroMsg.MagicBrush.MBRuntime", "[surface] destroy window(surfacetexture) param:true windowId:%d sync?%b %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z18), surfaceTexture);
        if (z18) {
            hh.h hVar = new hh.h(jVar);
            if (o(hVar)) {
                hVar.a(3000L);
                hVar.f362975d.isDone();
            }
        } else {
            o(jVar);
        }
        ah.i.b("MicroMsg.MagicBrush.MBRuntime", "[surface] destroy window(surfacetexture) done. windowId:%d", java.lang.Integer.valueOf(i17));
    }

    public void l(int i17, android.view.Surface surface, boolean z17) {
        boolean isDone;
        ah.i.b("MicroMsg.MagicBrush.MBRuntime", "hy: notifyWindowDestroyed: %d", java.lang.Integer.valueOf(i17));
        if (this.f130110a == 0) {
            return;
        }
        if (this.f130111b.f16199x4fc22df5) {
            synchronized (this) {
                m34783x6b2991a9(this.f130110a, i17);
            }
            return;
        }
        if (i17 < 0) {
            throw new java.lang.IllegalArgumentException("windowId < 0");
        }
        synchronized (this) {
            if (this.f130110a != 0) {
                m34776x9603842a(this.f130110a, i17);
            }
        }
        boolean z18 = this.f130111b.f16212xcb3d10c4 || z17;
        java.lang.Runnable kVar = new yg.k(this, i17);
        ah.i.b("MicroMsg.MagicBrush.MBRuntime", "[surface] destroy window(surface) windowId:%d sync?%b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z18));
        if (!z18) {
            o(kVar);
            return;
        }
        ch.g gVar = this.f130116g;
        hh.h hVar = new hh.h(kVar);
        if (o(hVar)) {
            hVar.a(3000L);
            isDone = hVar.f362975d.isDone();
        } else {
            isDone = false;
        }
        if (isDone) {
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = gVar != null ? gVar.a() : com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
        ah.i.a("MicroMsg.MagicBrush.MBRuntime", "notifyWindowDestroyed, but await fail. [deadlock]:    %s", objArr);
    }

    public void m(yg.w wVar) {
        this.f130113d = wVar;
        m34748x6fa798be(this.f130110a);
    }

    public boolean n(java.lang.Runnable runnable) {
        ch.g gVar;
        if (runnable == null || this.f130110a == 0 || (gVar = this.f130116g) == null) {
            return false;
        }
        gVar.k(new yg.q(this, runnable), false);
        return true;
    }

    /* renamed from: nativeBindTo */
    public native void m34759x7190a28f(long j17, long j18, long j19, long j27);

    /* renamed from: nativeCaptureCanvas */
    public native android.graphics.Bitmap m34760xfc1e1967(long j17, int i17);

    /* renamed from: nativeCaptureScreen */
    public native android.graphics.Bitmap m34761x1789647b(long j17, int i17);

    /* renamed from: nativeCreate */
    public native long m34762x73c02ff3(com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83.MBParams mBParams, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.api.InterfaceC1594x6bcbd375 interfaceC1594x6bcbd375, com.p314xaae8f345.p485x5dc4f1ad.p488x21ffc6bd.C4214x629228c1 c4214x629228c1);

    /* renamed from: nativeDestroy */
    public native void m34763x23caefe3(long j17);

    /* renamed from: nativeGetCurrentFps */
    public native float[] m34764x50e3edcf(long j17);

    /* renamed from: nativeGetCurrentFpsVariance */
    public native float m34765xb55c1160(long j17);

    /* renamed from: nativeGetDrawCalls */
    public native int m34766x5e7509f2(long j17);

    /* renamed from: nativeGetFrameCounter */
    public native int m34767xf931292e(long j17);

    /* renamed from: nativeGetIsMali */
    public native boolean m34768x51ffefa(long j17);

    /* renamed from: nativeGetTriangles */
    public native int m34769x26c3e26c(long j17);

    /* renamed from: nativeGetVertexes */
    public native int m34770xdf205631(long j17);

    /* renamed from: nativeInit */
    public native void m34771xb90145c7(long j17, com.p314xaae8f345.p485x5dc4f1ad.p486xa7b754fd.C4211x20e2c38e c4211x20e2c38e);

    /* renamed from: nativeLazyLoadBox2D */
    public native void m34772x6180d42c(long j17, java.lang.String str);

    /* renamed from: nativeLazyLoadPhysx */
    public native void m34773x6242fa75(long j17, java.lang.String str);

    /* renamed from: nativeNotifyAnimationFrame */
    public native void m34774x282632a9(long j17, double d17);

    /* renamed from: nativeNotifyAnimationFrameLooper */
    public native void m34775x5f36765a(long j17);

    /* renamed from: nativeNotifyBeforeWindowDestroyed */
    public native void m34776x9603842a(long j17, int i17);

    /* renamed from: nativeNotifyImageDecoded */
    public native void m34777xa07e88bb(long j17, java.lang.String str, java.lang.Object obj, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab c1592x888963ab);

    /* renamed from: nativeNotifyTouchEvent */
    public native void m34778xb5ca84fb(long j17, int i17, int i18, long j18);

    /* renamed from: nativeNotifyWindowAvailable */
    public native void m34779xc8ff8659(long j17, int i17, android.graphics.SurfaceTexture surfaceTexture, int i18, int i19, boolean z17);

    /* renamed from: nativeNotifyWindowAvailableForSurface */
    public native void m34780x9c1bbadd(long j17, int i17, int i18, android.view.Surface surface, int i19, int i27, boolean z17);

    /* renamed from: nativeNotifyWindowChanged */
    public native void m34781x8c330244(long j17, int i17, android.graphics.SurfaceTexture surfaceTexture, int i18, int i19);

    /* renamed from: nativeNotifyWindowChangedForSurface */
    public native void m34782xcb618d08(long j17, int i17, android.view.Surface surface, int i18, int i19);

    /* renamed from: nativeNotifyWindowDestroyed */
    public native void m34783x6b2991a9(long j17, int i17);

    /* renamed from: nativePause */
    public native void m34784x67845c1f(long j17);

    /* renamed from: nativeRegisterExtSurface */
    public native void m34785x13a3b2c6(long j17, int i17, java.lang.String str, int i18, int i19, android.view.Surface surface, boolean z17);

    /* renamed from: nativeResume */
    public native void m34786x8ca85724(long j17);

    /* renamed from: nativeSetEnableInspectFpsVariance */
    public native void m34787x417f2a94(long j17, boolean z17);

    /* renamed from: nativeSetUserPreferredFps */
    public native void m34788x20dfcafe(long j17, double d17);

    /* renamed from: nativeStopAnimationFrameLooper */
    public native void m34789xc0b14253(long j17);

    /* renamed from: nativeUnregisterExtSurface */
    public native void m34790xfaed6b5f(long j17, int i17, java.lang.String str);

    public boolean o(java.lang.Runnable runnable) {
        ch.g gVar;
        if (runnable == null || this.f130110a == 0 || (gVar = this.f130116g) == null) {
            return false;
        }
        gVar.k(new yg.r(this, runnable), true);
        return true;
    }

    /* renamed from: onFrameCaptureGenerated */
    public void m34791xb8d327d7(java.lang.String str) {
        ah.i.b("MicroMsg.MagicBrush.MBRuntime", "frame capture file generated %s", str);
        ah.j jVar = this.f130111b.f16207x7e3f5a45;
        if (jVar != null) {
            jVar.a(str);
        }
    }

    /* renamed from: p */
    public abstract yg.b0 getF130125p();

    /* renamed from: q */
    public abstract com.p314xaae8f345.p485x5dc4f1ad.ui.C4215x4dd65873 getF130123n();

    /* renamed from: removeElement */
    public void m34792xe424e1d8(int i17) {
        try {
            com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 m34847xff3f9123 = getF130123n().m34847xff3f9123(i17);
            if (m34847xff3f9123 == null) {
                ah.i.a("MicroMsg.MagicBrush.MBRuntime", "dl: ScreenCanvas: removeElement window_id = [%d] not found!", java.lang.Integer.valueOf(i17));
                return;
            }
            yg.b0 f130125p = getF130125p();
            java.util.Objects.requireNonNull(f130125p);
            f130125p.w0(m34847xff3f9123);
            ah.i.b("MicroMsg.MagicBrush.MBRuntime", "dl: ScreenCanvas: removeElement a ScreenCanvas window_id = [%d]...done", java.lang.Integer.valueOf(i17));
        } catch (java.lang.Exception e17) {
            ah.i.c("MicroMsg.MagicBrush.MBRuntime", e17, "dl: ScreenCanvas: removeElement failed", new java.lang.Object[0]);
        }
    }

    /* renamed from: resumeLoopTasks */
    public void m34793x524f859d() {
        if (this.f130116g != null) {
            this.f130116g.e();
        }
    }

    /* renamed from: setTouchableRectList */
    public void m34794x258d7899(int i17, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        try {
            com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 m34847xff3f9123 = getF130123n().m34847xff3f9123(i17);
            if (m34847xff3f9123 == null) {
                ah.i.a("MicroMsg.MagicBrush.MBRuntime", "ScreenCanvas: setTouchableRectList window_id = [%d] not found!", java.lang.Integer.valueOf(i17));
                return;
            }
            float f17 = this.f130111b.f16189xa3ade0d6;
            for (int i18 = 0; i18 < fArr.length; i18++) {
                fArr[i18] = fArr[i18] * f17;
                fArr2[i18] = fArr2[i18] * f17;
                fArr3[i18] = fArr3[i18] * f17;
                fArr4[i18] = fArr4[i18] * f17;
            }
            yg.b0 f130125p = getF130125p();
            java.util.Objects.requireNonNull(f130125p);
            f130125p.M(m34847xff3f9123, fArr, fArr2, fArr3, fArr4);
            ah.i.b("MicroMsg.MagicBrush.MBRuntime", "ScreenCanvas: setTouchableRectList for window_id = [%d]...done", java.lang.Integer.valueOf(i17));
        } catch (java.lang.Exception e17) {
            ah.i.c("MicroMsg.MagicBrush.MBRuntime", e17, "ScreenCanvas: setTouchableRect failed", new java.lang.Object[0]);
        }
    }

    /* renamed from: updateElement */
    public void m34795x43b8b9f3(int i17, float f17, float f18, float f19, float f27, int i18) {
        try {
            com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 m34847xff3f9123 = getF130123n().m34847xff3f9123(i17);
            if (m34847xff3f9123 == null) {
                ah.i.a("MicroMsg.MagicBrush.MBRuntime", "dl: ScreenCanvas: updateElement window_id = [%d] not found!", java.lang.Integer.valueOf(i17));
                return;
            }
            try {
                float f28 = this.f130111b.f16189xa3ade0d6;
                if (f28 <= 0.0f) {
                    throw new java.lang.IllegalStateException("device pixel ratio is null");
                }
                yg.b0 f130125p = getF130125p();
                java.util.Objects.requireNonNull(f130125p);
                f130125p.q0(m34847xff3f9123, java.lang.Math.round(f17 * f28), java.lang.Math.round(f18 * f28), java.lang.Math.round(f19 * f28), java.lang.Math.round(f28 * f27), i18);
            } catch (java.lang.Exception e17) {
                e = e17;
                ah.i.c("MicroMsg.MagicBrush.MBRuntime", e, "dl: ScreenCanvas: updateElement failed", new java.lang.Object[0]);
            }
        } catch (java.lang.Exception e18) {
            e = e18;
        }
    }
}
