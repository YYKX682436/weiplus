package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7;

/* renamed from: androidx.camera.core.processing.concurrent.DualSurfaceProcessor */
/* loaded from: classes14.dex */
public class C0932xef42ab21 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0919xe4c88c62, android.graphics.SurfaceTexture.OnFrameAvailableListener {
    private static final java.lang.String TAG = "DualSurfaceProcessor";

    /* renamed from: mGlExecutor */
    private final java.util.concurrent.Executor f2231x303dad25;

    /* renamed from: mGlHandler */
    final android.os.Handler f2232x81c2d0b8;

    /* renamed from: mGlRenderer */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.C0930xb8f0626e f2233x98f8f515;

    /* renamed from: mGlThread */
    final android.os.HandlerThread f2234xd6fdaedc;

    /* renamed from: mInputSurfaceCount */
    private int f2235x25a52c5f;

    /* renamed from: mIsReleaseRequested */
    private final java.util.concurrent.atomic.AtomicBoolean f2236xc1d4bfbe;

    /* renamed from: mIsReleased */
    private boolean f2237x8c0d78d4;

    /* renamed from: mOutputSurfaces */
    final java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee, android.view.Surface> f2238x106d9f54;

    /* renamed from: mPrimarySurfaceTexture */
    private android.graphics.SurfaceTexture f2239xd3b247e3;

    /* renamed from: mSecondarySurfaceTexture */
    private android.graphics.SurfaceTexture f2240x4deaa315;

    /* renamed from: androidx.camera.core.processing.concurrent.DualSurfaceProcessor$Factory */
    /* loaded from: classes14.dex */
    public static class Factory {

        /* renamed from: sSupplier */
        private static yz5.q f2241x3b743b5f = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.C0942xcd560c1a();

        private Factory() {
        }

        /* renamed from: newInstance */
        public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0919xe4c88c62 m6416x6bff0255(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0543xcd8e1d8d c0543xcd8e1d8d, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0543xcd8e1d8d c0543xcd8e1d8d2) {
            return (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0919xe4c88c62) f2241x3b743b5f.mo147xb9724478(c0491x2bb48c5e, c0543xcd8e1d8d, c0543xcd8e1d8d2);
        }

        /* renamed from: setSupplier */
        public static void m6417x136e984e(yz5.q qVar) {
            f2241x3b743b5f = qVar;
        }
    }

    public C0932xef42ab21(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0543xcd8e1d8d c0543xcd8e1d8d, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0543xcd8e1d8d c0543xcd8e1d8d2) {
        this(c0491x2bb48c5e, java.util.Collections.emptyMap(), c0543xcd8e1d8d, c0543xcd8e1d8d2);
    }

    /* renamed from: checkReadyToRelease */
    private void m6402x53b331d1() {
        if (this.f2237x8c0d78d4 && this.f2235x25a52c5f == 0) {
            java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee> it = this.f2238x106d9f54.keySet().iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            this.f2238x106d9f54.clear();
            this.f2233x98f8f515.mo6311x41012807();
            this.f2234xd6fdaedc.quit();
        }
    }

    /* renamed from: executeSafely */
    private void m6403x32e5d5af(java.lang.Runnable runnable) {
        m6404x32e5d5af(runnable, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.RunnableC0940xff490127());
    }

    /* renamed from: initGlRenderer */
    private void m6405xf35b29f8(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e, final java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.InputFormat, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0904x6439f916> map) {
        try {
            ((t2.o) t2.p.a(new t2.m() { // from class: androidx.camera.core.processing.concurrent.DualSurfaceProcessor$$g
                @Override // t2.m
                /* renamed from: attachCompleter */
                public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                    java.lang.Object m6409x19d9bc7;
                    m6409x19d9bc7 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.C0932xef42ab21.this.m6409x19d9bc7(c0491x2bb48c5e, map, kVar);
                    return m6409x19d9bc7;
                }
            })).get();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e17) {
            e = e17;
            if (e instanceof java.util.concurrent.ExecutionException) {
                e = e.getCause();
            }
            if (!(e instanceof java.lang.RuntimeException)) {
                throw new java.lang.IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
            }
            throw ((java.lang.RuntimeException) e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$executeSafely$7 */
    public static /* synthetic */ void m6406x42543a5() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$executeSafely$8 */
    public /* synthetic */ void m6407x42543a6(java.lang.Runnable runnable, java.lang.Runnable runnable2) {
        if (this.f2237x8c0d78d4) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$initGlRenderer$5 */
    public /* synthetic */ void m6408x19d9bc6(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e, java.util.Map map, t2.k kVar) {
        try {
            this.f2233x98f8f515.mo6308x316510(c0491x2bb48c5e, map);
            kVar.a(null);
        } catch (java.lang.RuntimeException e17) {
            kVar.b(e17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$initGlRenderer$6 */
    public /* synthetic */ java.lang.Object m6409x19d9bc7(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e, final java.util.Map map, final t2.k kVar) {
        m6403x32e5d5af(new java.lang.Runnable() { // from class: androidx.camera.core.processing.concurrent.DualSurfaceProcessor$$a
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.C0932xef42ab21.this.m6408x19d9bc6(c0491x2bb48c5e, map, kVar);
            }
        });
        return "Init GlRenderer";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onInputSurface$0 */
    public /* synthetic */ void m6410xb130184b(android.graphics.SurfaceTexture surfaceTexture, android.view.Surface surface, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.Result result) {
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        this.f2235x25a52c5f--;
        m6402x53b331d1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onInputSurface$1 */
    public /* synthetic */ void m6411xb130184c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42 c0569x83ae3d42) {
        this.f2235x25a52c5f++;
        final android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(this.f2233x98f8f515.m6400x3a030510(c0569x83ae3d42.m4795xcaae5578()));
        surfaceTexture.setDefaultBufferSize(c0569x83ae3d42.m4793x8ee230a2().getWidth(), c0569x83ae3d42.m4793x8ee230a2().getHeight());
        final android.view.Surface surface = new android.view.Surface(surfaceTexture);
        c0569x83ae3d42.m4797xc462ecc(surface, this.f2231x303dad25, new m3.a() { // from class: androidx.camera.core.processing.concurrent.DualSurfaceProcessor$$e
            @Override // m3.a
            /* renamed from: accept */
            public final void mo3938xab27b508(java.lang.Object obj) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.C0932xef42ab21.this.m6410xb130184b(surfaceTexture, surface, (p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.Result) obj);
            }
        });
        if (c0569x83ae3d42.m4795xcaae5578()) {
            this.f2239xd3b247e3 = surfaceTexture;
        } else {
            this.f2240x4deaa315 = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(this, this.f2232x81c2d0b8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onOutputSurface$2 */
    public /* synthetic */ void m6412x6cbbbe7e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee interfaceC0567x42142bee, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee.Event event) {
        interfaceC0567x42142bee.close();
        android.view.Surface remove = this.f2238x106d9f54.remove(interfaceC0567x42142bee);
        if (remove != null) {
            this.f2233x98f8f515.m6316xcfaad590(remove);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onOutputSurface$3 */
    public /* synthetic */ void m6413x6cbbbe7f(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee interfaceC0567x42142bee) {
        android.view.Surface mo4770xcf572877 = interfaceC0567x42142bee.mo4770xcf572877(this.f2231x303dad25, new m3.a() { // from class: androidx.camera.core.processing.concurrent.DualSurfaceProcessor$$c
            @Override // m3.a
            /* renamed from: accept */
            public final void mo3938xab27b508(java.lang.Object obj) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.C0932xef42ab21.this.m6412x6cbbbe7e(interfaceC0567x42142bee, (p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee.Event) obj);
            }
        });
        this.f2233x98f8f515.m6310x19899a89(mo4770xcf572877);
        this.f2238x106d9f54.put(interfaceC0567x42142bee, mo4770xcf572877);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$release$4 */
    public /* synthetic */ void m6414x7afbb63a() {
        this.f2237x8c0d78d4 = true;
        m6402x53b331d1();
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        android.graphics.SurfaceTexture surfaceTexture2;
        if (this.f2236xc1d4bfbe.get() || (surfaceTexture2 = this.f2239xd3b247e3) == null || this.f2240x4deaa315 == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.f2240x4deaa315.updateTexImage();
        for (java.util.Map.Entry<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee, android.view.Surface> entry : this.f2238x106d9f54.entrySet()) {
            android.view.Surface value = entry.getValue();
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee key = entry.getKey();
            if (key.mo4767x19771aed() == 34) {
                try {
                    this.f2233x98f8f515.m6401xc84b4196(surfaceTexture.getTimestamp(), value, key, this.f2239xd3b247e3, this.f2240x4deaa315);
                } catch (java.lang.RuntimeException e17) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Failed to render with OpenGL.", e17);
                }
            }
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0568xe676b685
    /* renamed from: onInputSurface */
    public void mo4774x41974102(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42 c0569x83ae3d42) {
        if (this.f2236xc1d4bfbe.get()) {
            c0569x83ae3d42.m4800x77e1a6cd();
            return;
        }
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.camera.core.processing.concurrent.DualSurfaceProcessor$$f
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.C0932xef42ab21.this.m6411xb130184c(c0569x83ae3d42);
            }
        };
        java.util.Objects.requireNonNull(c0569x83ae3d42);
        m6404x32e5d5af(runnable, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.RunnableC0889x3befff85(c0569x83ae3d42));
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0568xe676b685
    /* renamed from: onOutputSurface */
    public void mo4775x43e35ccd(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee interfaceC0567x42142bee) {
        if (this.f2236xc1d4bfbe.get()) {
            interfaceC0567x42142bee.close();
            return;
        }
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.camera.core.processing.concurrent.DualSurfaceProcessor$$d
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.C0932xef42ab21.this.m6413x6cbbbe7f(interfaceC0567x42142bee);
            }
        };
        java.util.Objects.requireNonNull(interfaceC0567x42142bee);
        m6404x32e5d5af(runnable, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.RunnableC0886x3befff82(interfaceC0567x42142bee));
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0919xe4c88c62
    /* renamed from: release */
    public void mo6289x41012807() {
        if (this.f2236xc1d4bfbe.getAndSet(true)) {
            return;
        }
        m6403x32e5d5af(new java.lang.Runnable() { // from class: androidx.camera.core.processing.concurrent.DualSurfaceProcessor$$b
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.C0932xef42ab21.this.m6414x7afbb63a();
            }
        });
    }

    public C0932xef42ab21(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e, java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.InputFormat, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0904x6439f916> map, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0543xcd8e1d8d c0543xcd8e1d8d, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0543xcd8e1d8d c0543xcd8e1d8d2) {
        this.f2235x25a52c5f = 0;
        this.f2237x8c0d78d4 = false;
        this.f2236xc1d4bfbe = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f2238x106d9f54 = new java.util.LinkedHashMap();
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("GL Thread");
        this.f2234xd6fdaedc = handlerThread;
        handlerThread.start();
        android.os.Handler handler = new android.os.Handler(handlerThread.getLooper());
        this.f2232x81c2d0b8 = handler;
        this.f2231x303dad25 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5984x3281647d(handler);
        this.f2233x98f8f515 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.C0930xb8f0626e(c0543xcd8e1d8d, c0543xcd8e1d8d2);
        try {
            m6405xf35b29f8(c0491x2bb48c5e, map);
        } catch (java.lang.RuntimeException e17) {
            mo6289x41012807();
            throw e17;
        }
    }

    /* renamed from: executeSafely */
    private void m6404x32e5d5af(final java.lang.Runnable runnable, final java.lang.Runnable runnable2) {
        try {
            this.f2231x303dad25.execute(new java.lang.Runnable() { // from class: androidx.camera.core.processing.concurrent.DualSurfaceProcessor$$i
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.C0932xef42ab21.this.m6407x42543a6(runnable2, runnable);
                }
            });
        } catch (java.util.concurrent.RejectedExecutionException e17) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "Unable to executor runnable", e17);
            runnable2.run();
        }
    }
}
