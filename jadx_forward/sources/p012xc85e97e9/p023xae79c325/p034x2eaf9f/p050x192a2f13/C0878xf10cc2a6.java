package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13;

/* renamed from: androidx.camera.core.processing.DefaultSurfaceProcessor */
/* loaded from: classes14.dex */
public class C0878xf10cc2a6 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0919xe4c88c62, android.graphics.SurfaceTexture.OnFrameAvailableListener {
    private static final java.lang.String TAG = "DefaultSurfaceProcessor";

    /* renamed from: mGlExecutor */
    private final java.util.concurrent.Executor f2144x303dad25;

    /* renamed from: mGlHandler */
    final android.os.Handler f2145x81c2d0b8;

    /* renamed from: mGlRenderer */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0901x43b7f6d2 f2146x98f8f515;

    /* renamed from: mGlThread */
    final android.os.HandlerThread f2147xd6fdaedc;

    /* renamed from: mInputSurfaceCount */
    private int f2148x25a52c5f;

    /* renamed from: mIsReleaseRequested */
    private final java.util.concurrent.atomic.AtomicBoolean f2149xc1d4bfbe;

    /* renamed from: mIsReleased */
    private boolean f2150x8c0d78d4;

    /* renamed from: mOutputSurfaces */
    final java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee, android.view.Surface> f2151x106d9f54;

    /* renamed from: mPendingSnapshots */
    private final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0878xf10cc2a6.PendingSnapshot> f2152x73751de5;

    /* renamed from: mSurfaceOutputMatrix */
    private final float[] f2153x65edcbc2;

    /* renamed from: mTextureMatrix */
    private final float[] f2154x6152e14f;

    /* renamed from: androidx.camera.core.processing.DefaultSurfaceProcessor$Factory */
    /* loaded from: classes14.dex */
    public static class Factory {

        /* renamed from: sSupplier */
        private static r.a f2155x3b743b5f = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0894x9e727f75();

        private Factory() {
        }

        /* renamed from: newInstance */
        public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0919xe4c88c62 m6292x6bff0255(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e) {
            return (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0919xe4c88c62) f2155x3b743b5f.mo1850x58b836e(c0491x2bb48c5e);
        }

        /* renamed from: setSupplier */
        public static void m6293x136e984e(r.a aVar) {
            f2155x3b743b5f = aVar;
        }
    }

    /* renamed from: androidx.camera.core.processing.DefaultSurfaceProcessor$PendingSnapshot */
    /* loaded from: classes14.dex */
    public static abstract class PendingSnapshot {
        public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0875x32877265 of(int i17, int i18, t2.k kVar) {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0875x32877265(i17, i18, kVar);
        }

        /* renamed from: getCompleter */
        public abstract t2.k mo6248xabce67a3();

        /* renamed from: getJpegQuality */
        public abstract int mo6249x354bfa41();

        /* renamed from: getRotationDegrees */
        public abstract int mo6250x2a7ffb93();
    }

    public C0878xf10cc2a6(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e) {
        this(c0491x2bb48c5e, java.util.Collections.emptyMap());
    }

    /* renamed from: checkReadyToRelease */
    private void m6269x53b331d1() {
        if (this.f2150x8c0d78d4 && this.f2148x25a52c5f == 0) {
            java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee> it = this.f2151x106d9f54.keySet().iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0878xf10cc2a6.PendingSnapshot> it6 = this.f2152x73751de5.iterator();
            while (it6.hasNext()) {
                it6.next().mo6248xabce67a3().b(new java.lang.Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            this.f2151x106d9f54.clear();
            this.f2146x98f8f515.mo6311x41012807();
            this.f2147xd6fdaedc.quit();
        }
    }

    /* renamed from: executeSafely */
    private void m6270x32e5d5af(java.lang.Runnable runnable) {
        m6271x32e5d5af(runnable, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.RunnableC0893x3befff89());
    }

    /* renamed from: failAllPendingSnapshots */
    private void m6272xb40b5f1b(java.lang.Throwable th6) {
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0878xf10cc2a6.PendingSnapshot> it = this.f2152x73751de5.iterator();
        while (it.hasNext()) {
            it.next().mo6248xabce67a3().b(th6);
        }
        this.f2152x73751de5.clear();
    }

    /* renamed from: getBitmap */
    private android.graphics.Bitmap m6273x12501425(android.util.Size size, float[] fArr, int i17) {
        float[] fArr2 = (float[]) fArr.clone();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0793xb5c1f680.m5926x914bb5de(fArr2, i17, 0.5f, 0.5f);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0793xb5c1f680.m5927x6105b46(fArr2, 0.5f);
        return this.f2146x98f8f515.m6315x10fad5c4(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0801x6002c4c5.m5966xfb4e0bfc(size, i17), fArr2);
    }

    /* renamed from: initGlRenderer */
    private void m6274xf35b29f8(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e, final java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.InputFormat, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0904x6439f916> map) {
        try {
            ((t2.o) t2.p.a(new t2.m() { // from class: androidx.camera.core.processing.DefaultSurfaceProcessor$$a
                @Override // t2.m
                /* renamed from: attachCompleter */
                public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                    java.lang.Object m6277x3215dcae;
                    m6277x3215dcae = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0878xf10cc2a6.this.m6277x3215dcae(c0491x2bb48c5e, map, kVar);
                    return m6277x3215dcae;
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
    /* renamed from: lambda$executeSafely$11 */
    public static /* synthetic */ void m6275x80833072() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$executeSafely$12 */
    public /* synthetic */ void m6276x80833073(java.lang.Runnable runnable, java.lang.Runnable runnable2) {
        if (this.f2150x8c0d78d4) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$initGlRenderer$10 */
    public /* synthetic */ java.lang.Object m6277x3215dcae(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e, final java.util.Map map, final t2.k kVar) {
        m6270x32e5d5af(new java.lang.Runnable() { // from class: androidx.camera.core.processing.DefaultSurfaceProcessor$$m
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0878xf10cc2a6.this.m6278x19d9bca(c0491x2bb48c5e, map, kVar);
            }
        });
        return "Init GlRenderer";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$initGlRenderer$9 */
    public /* synthetic */ void m6278x19d9bca(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e, java.util.Map map, t2.k kVar) {
        try {
            this.f2146x98f8f515.mo6308x316510(c0491x2bb48c5e, map);
            kVar.a(null);
        } catch (java.lang.RuntimeException e17) {
            kVar.b(e17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onInputSurface$0 */
    public /* synthetic */ void m6279xb130184b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42 c0569x83ae3d42, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.TransformationInfo transformationInfo) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.InputFormat inputFormat = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.InputFormat.DEFAULT;
        if (c0569x83ae3d42.m4791x82dbcab4().m4388x10bf48d2() && transformationInfo.mo4248x459dfcd()) {
            inputFormat = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.InputFormat.YUV;
        }
        this.f2146x98f8f515.m6314x4789769f(inputFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onInputSurface$1 */
    public /* synthetic */ void m6280xb130184c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42 c0569x83ae3d42, android.graphics.SurfaceTexture surfaceTexture, android.view.Surface surface, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.Result result) {
        c0569x83ae3d42.m4788x9d74fd58();
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        this.f2148x25a52c5f--;
        m6269x53b331d1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onInputSurface$2 */
    public /* synthetic */ void m6281xb130184d(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42 c0569x83ae3d42) {
        this.f2148x25a52c5f++;
        final android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(this.f2146x98f8f515.m6306x3a030510());
        surfaceTexture.setDefaultBufferSize(c0569x83ae3d42.m4793x8ee230a2().getWidth(), c0569x83ae3d42.m4793x8ee230a2().getHeight());
        final android.view.Surface surface = new android.view.Surface(surfaceTexture);
        c0569x83ae3d42.m4798xb6dbe32d(this.f2144x303dad25, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.TransformationInfoListener() { // from class: androidx.camera.core.processing.DefaultSurfaceProcessor$$b
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.TransformationInfoListener
            /* renamed from: onTransformationInfoUpdate */
            public final void mo4802xba878bff(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.TransformationInfo transformationInfo) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0878xf10cc2a6.this.m6279xb130184b(c0569x83ae3d42, transformationInfo);
            }
        });
        c0569x83ae3d42.m4797xc462ecc(surface, this.f2144x303dad25, new m3.a() { // from class: androidx.camera.core.processing.DefaultSurfaceProcessor$$c
            @Override // m3.a
            /* renamed from: accept */
            public final void mo3938xab27b508(java.lang.Object obj) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0878xf10cc2a6.this.m6280xb130184c(c0569x83ae3d42, surfaceTexture, surface, (p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.Result) obj);
            }
        });
        surfaceTexture.setOnFrameAvailableListener(this, this.f2145x81c2d0b8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onOutputSurface$3 */
    public /* synthetic */ void m6282x6cbbbe7f(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee interfaceC0567x42142bee, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee.Event event) {
        interfaceC0567x42142bee.close();
        android.view.Surface remove = this.f2151x106d9f54.remove(interfaceC0567x42142bee);
        if (remove != null) {
            this.f2146x98f8f515.m6316xcfaad590(remove);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onOutputSurface$4 */
    public /* synthetic */ void m6283x6cbbbe80(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee interfaceC0567x42142bee) {
        android.view.Surface mo4770xcf572877 = interfaceC0567x42142bee.mo4770xcf572877(this.f2144x303dad25, new m3.a() { // from class: androidx.camera.core.processing.DefaultSurfaceProcessor$$d
            @Override // m3.a
            /* renamed from: accept */
            public final void mo3938xab27b508(java.lang.Object obj) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0878xf10cc2a6.this.m6282x6cbbbe7f(interfaceC0567x42142bee, (p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee.Event) obj);
            }
        });
        this.f2146x98f8f515.m6310x19899a89(mo4770xcf572877);
        this.f2151x106d9f54.put(interfaceC0567x42142bee, mo4770xcf572877);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$release$5 */
    public /* synthetic */ void m6284x7afbb63b() {
        this.f2150x8c0d78d4 = true;
        m6269x53b331d1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$snapshot$6 */
    public /* synthetic */ void m6285xfc85f653(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0878xf10cc2a6.PendingSnapshot pendingSnapshot) {
        this.f2152x73751de5.add(pendingSnapshot);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$snapshot$7 */
    public static /* synthetic */ void m6286xfc85f654(t2.k kVar) {
        kVar.b(new java.lang.Exception("Failed to snapshot: OpenGLRenderer not ready."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$snapshot$8 */
    public /* synthetic */ java.lang.Object m6287xfc85f655(int i17, int i18, final t2.k kVar) {
        final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0875x32877265 of6 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0878xf10cc2a6.PendingSnapshot.of(i17, i18, kVar);
        m6271x32e5d5af(new java.lang.Runnable() { // from class: androidx.camera.core.processing.DefaultSurfaceProcessor$$e
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0878xf10cc2a6.this.m6285xfc85f653(of6);
            }
        }, new java.lang.Runnable() { // from class: androidx.camera.core.processing.DefaultSurfaceProcessor$$f
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0878xf10cc2a6.m6286xfc85f654(t2.k.this);
            }
        });
        return "DefaultSurfaceProcessor#snapshot";
    }

    /* renamed from: takeSnapshotAndDrawJpeg */
    private void m6288x2ce9c658(jz5.o oVar) {
        if (this.f2152x73751de5.isEmpty()) {
            return;
        }
        if (oVar == null) {
            m6272xb40b5f1b(new java.lang.Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            try {
                java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0878xf10cc2a6.PendingSnapshot> it = this.f2152x73751de5.iterator();
                int i17 = -1;
                int i18 = -1;
                android.graphics.Bitmap bitmap = null;
                byte[] bArr = null;
                while (it.hasNext()) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0878xf10cc2a6.PendingSnapshot next = it.next();
                    if (i17 != next.mo6250x2a7ffb93() || bitmap == null) {
                        i17 = next.mo6250x2a7ffb93();
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        bitmap = m6273x12501425((android.util.Size) oVar.f384375e, (float[]) oVar.f384376f, i17);
                        i18 = -1;
                    }
                    if (i18 != next.mo6249x354bfa41()) {
                        byteArrayOutputStream.reset();
                        i18 = next.mo6249x354bfa41();
                        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, i18, byteArrayOutputStream);
                        bArr = byteArrayOutputStream.toByteArray();
                    }
                    android.view.Surface surface = (android.view.Surface) oVar.f384374d;
                    java.util.Objects.requireNonNull(bArr);
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0532xed4713d0.m4636x7fe33e4e(surface, bArr);
                    next.mo6248xabce67a3().a(null);
                    it.remove();
                }
                byteArrayOutputStream.close();
            } catch (java.lang.Throwable th6) {
                try {
                    byteArrayOutputStream.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
                throw th6;
            }
        } catch (java.io.IOException e17) {
            m6272xb40b5f1b(e17);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        if (this.f2149xc1d4bfbe.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        surfaceTexture.getTransformMatrix(this.f2154x6152e14f);
        jz5.o oVar = null;
        for (java.util.Map.Entry<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee, android.view.Surface> entry : this.f2151x106d9f54.entrySet()) {
            android.view.Surface value = entry.getValue();
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee key = entry.getKey();
            key.mo4772x7b86244(this.f2153x65edcbc2, this.f2154x6152e14f);
            if (key.mo4767x19771aed() == 34) {
                try {
                    this.f2146x98f8f515.m6313xc84b4196(surfaceTexture.getTimestamp(), this.f2153x65edcbc2, value);
                } catch (java.lang.RuntimeException e17) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Failed to render with OpenGL.", e17);
                }
            } else {
                m3.h.e(key.mo4767x19771aed() == 256, "Unsupported format: " + key.mo4767x19771aed());
                m3.h.e(oVar == null, "Only one JPEG output is supported.");
                oVar = new jz5.o(value, key.mo4769xfb854877(), (float[]) this.f2153x65edcbc2.clone());
            }
        }
        try {
            m6288x2ce9c658(oVar);
        } catch (java.lang.RuntimeException e18) {
            m6272xb40b5f1b(e18);
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0568xe676b685
    /* renamed from: onInputSurface */
    public void mo4774x41974102(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42 c0569x83ae3d42) {
        if (this.f2149xc1d4bfbe.get()) {
            c0569x83ae3d42.m4800x77e1a6cd();
            return;
        }
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.camera.core.processing.DefaultSurfaceProcessor$$j
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0878xf10cc2a6.this.m6281xb130184d(c0569x83ae3d42);
            }
        };
        java.util.Objects.requireNonNull(c0569x83ae3d42);
        m6271x32e5d5af(runnable, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.RunnableC0889x3befff85(c0569x83ae3d42));
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0568xe676b685
    /* renamed from: onOutputSurface */
    public void mo4775x43e35ccd(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee interfaceC0567x42142bee) {
        if (this.f2149xc1d4bfbe.get()) {
            interfaceC0567x42142bee.close();
            return;
        }
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.camera.core.processing.DefaultSurfaceProcessor$$g
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0878xf10cc2a6.this.m6283x6cbbbe80(interfaceC0567x42142bee);
            }
        };
        java.util.Objects.requireNonNull(interfaceC0567x42142bee);
        m6271x32e5d5af(runnable, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.RunnableC0886x3befff82(interfaceC0567x42142bee));
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0919xe4c88c62
    /* renamed from: release */
    public void mo6289x41012807() {
        if (this.f2149xc1d4bfbe.getAndSet(true)) {
            return;
        }
        m6270x32e5d5af(new java.lang.Runnable() { // from class: androidx.camera.core.processing.DefaultSurfaceProcessor$$n
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0878xf10cc2a6.this.m6284x7afbb63b();
            }
        });
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0919xe4c88c62
    /* renamed from: snapshot */
    public wa.a mo6290x10fad5c4(final int i17, final int i18) {
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6025x3918f316(t2.p.a(new t2.m() { // from class: androidx.camera.core.processing.DefaultSurfaceProcessor$$l
            @Override // t2.m
            /* renamed from: attachCompleter */
            public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                java.lang.Object m6287xfc85f655;
                m6287xfc85f655 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0878xf10cc2a6.this.m6287xfc85f655(i17, i18, kVar);
                return m6287xfc85f655;
            }
        }));
    }

    public C0878xf10cc2a6(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e, java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.InputFormat, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0904x6439f916> map) {
        this.f2149xc1d4bfbe = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f2154x6152e14f = new float[16];
        this.f2153x65edcbc2 = new float[16];
        this.f2151x106d9f54 = new java.util.LinkedHashMap();
        this.f2148x25a52c5f = 0;
        this.f2150x8c0d78d4 = false;
        this.f2152x73751de5 = new java.util.ArrayList();
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("GL Thread");
        this.f2147xd6fdaedc = handlerThread;
        handlerThread.start();
        android.os.Handler handler = new android.os.Handler(handlerThread.getLooper());
        this.f2145x81c2d0b8 = handler;
        this.f2144x303dad25 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5984x3281647d(handler);
        this.f2146x98f8f515 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0901x43b7f6d2();
        try {
            m6274xf35b29f8(c0491x2bb48c5e, map);
        } catch (java.lang.RuntimeException e17) {
            mo6289x41012807();
            throw e17;
        }
    }

    /* renamed from: executeSafely */
    private void m6271x32e5d5af(final java.lang.Runnable runnable, final java.lang.Runnable runnable2) {
        try {
            this.f2144x303dad25.execute(new java.lang.Runnable() { // from class: androidx.camera.core.processing.DefaultSurfaceProcessor$$i
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0878xf10cc2a6.this.m6276x80833073(runnable2, runnable);
                }
            });
        } catch (java.util.concurrent.RejectedExecutionException e17) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "Unable to executor runnable", e17);
            runnable2.run();
        }
    }
}
