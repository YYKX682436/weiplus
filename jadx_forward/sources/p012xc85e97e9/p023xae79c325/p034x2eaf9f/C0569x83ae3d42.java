package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* renamed from: androidx.camera.core.SurfaceRequest */
/* loaded from: classes14.dex */
public final class C0569x83ae3d42 {

    /* renamed from: FRAME_RATE_RANGE_UNSPECIFIED */
    public static final android.util.Range<java.lang.Integer> f1218xf5f0b888 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b.f1796xf5f0b888;

    /* renamed from: mCamera */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 f1219xfde5e9f2;

    /* renamed from: mDynamicRange */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e f1220xb97e514b;

    /* renamed from: mExpectedFrameRate */
    private final android.util.Range<java.lang.Integer> f1221x14c95b28;

    /* renamed from: mInternalDeferrableSurface */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 f1222xd941b189;

    /* renamed from: mIsPrimary */
    private final boolean f1223x45659f8b;

    /* renamed from: mLock */
    private final java.lang.Object f1224x6243b38;

    /* renamed from: mRequestCancellationCompleter */
    private final t2.k f1225x1b5d3c54;

    /* renamed from: mResolution */
    private final android.util.Size f1226x7cd370f9;

    /* renamed from: mSessionStatusFuture */
    private final wa.a f1227x237fc05e;

    /* renamed from: mSurfaceCompleter */
    private final t2.k f1228x2c6be6b9;

    /* renamed from: mSurfaceFuture */
    final wa.a f1229x5e277963;

    /* renamed from: mSurfaceRecreationCompleter */
    private final t2.k f1230x6f56a8c7;

    /* renamed from: mTransformationInfo */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.TransformationInfo f1231xed949aa4;

    /* renamed from: mTransformationInfoExecutor */
    private java.util.concurrent.Executor f1232xbdd21397;

    /* renamed from: mTransformationInfoListener */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.TransformationInfoListener f1233x9448df78;

    /* renamed from: androidx.camera.core.SurfaceRequest$RequestCancelledException */
    /* loaded from: classes14.dex */
    public static final class RequestCancelledException extends java.lang.RuntimeException {
        public RequestCancelledException(java.lang.String str, java.lang.Throwable th6) {
            super(str, th6);
        }
    }

    /* renamed from: androidx.camera.core.SurfaceRequest$Result */
    /* loaded from: classes14.dex */
    public static abstract class Result {

        /* renamed from: RESULT_INVALID_SURFACE */
        public static final int f1247x74750e03 = 2;

        /* renamed from: RESULT_REQUEST_CANCELLED */
        public static final int f1248xd2996bbf = 1;

        /* renamed from: RESULT_SURFACE_ALREADY_PROVIDED */
        public static final int f1249x537c615e = 3;

        /* renamed from: RESULT_SURFACE_USED_SUCCESSFULLY */
        public static final int f1250x7de75615 = 0;

        /* renamed from: RESULT_WILL_NOT_PROVIDE_SURFACE */
        public static final int f1251xd220138 = 4;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        /* renamed from: androidx.camera.core.SurfaceRequest$Result$ResultCode */
        /* loaded from: classes6.dex */
        public @interface ResultCode {
        }

        public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.Result of(int i17, android.view.Surface surface) {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0463x172b0a3d(i17, surface);
        }

        /* renamed from: getResultCode */
        public abstract int mo4239xcc234ba0();

        /* renamed from: getSurface */
        public abstract android.view.Surface mo4240xcf572877();
    }

    /* renamed from: androidx.camera.core.SurfaceRequest$TransformationInfo */
    /* loaded from: classes14.dex */
    public static abstract class TransformationInfo {
        public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.TransformationInfo of(android.graphics.Rect rect, int i17, int i18, boolean z17, android.graphics.Matrix matrix, boolean z18) {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0464x71b05177(rect, i17, i18, z17, matrix, z18);
        }

        /* renamed from: getCropRect */
        public abstract android.graphics.Rect mo4244xfa2ffe0a();

        /* renamed from: getRotationDegrees */
        public abstract int mo4245x2a7ffb93();

        /* renamed from: getSensorToBufferTransform */
        public abstract android.graphics.Matrix mo4246x65554241();

        /* renamed from: getTargetRotation */
        public abstract int mo4247x8d4b9125();

        /* renamed from: hasCameraTransform */
        public abstract boolean mo4248x459dfcd();

        /* renamed from: isMirroring */
        public abstract boolean mo4250x5a1c61b9();
    }

    /* renamed from: androidx.camera.core.SurfaceRequest$TransformationInfoListener */
    /* loaded from: classes14.dex */
    public interface TransformationInfoListener {
        /* renamed from: onTransformationInfoUpdate */
        void mo4802xba878bff(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.TransformationInfo transformationInfo);
    }

    public C0569x83ae3d42(android.util.Size size, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522, java.lang.Runnable runnable) {
        this(size, interfaceC0677x9e0bc522, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e.SDR, f1218xf5f0b888, runnable);
    }

    /* renamed from: initialSurfaceRecreationCompleter */
    private t2.k m4777x6aed90de(java.util.concurrent.Executor executor, final java.lang.Runnable runnable) {
        final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference(null);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6007xbba9cc06(t2.p.a(new t2.m() { // from class: androidx.camera.core.SurfaceRequest$$a
            @Override // t2.m
            /* renamed from: attachCompleter */
            public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                java.lang.Object m4778xa70dff93;
                m4778xa70dff93 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.this.m4778xa70dff93(atomicReference, kVar);
                return m4778xa70dff93;
            }
        }), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48<java.lang.Void>() { // from class: androidx.camera.core.SurfaceRequest.5
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48
            /* renamed from: onFailure */
            public void mo3120xee232ab(java.lang.Throwable th6) {
            }

            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48
            /* renamed from: onSuccess, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public void mo3121xe05b4124(java.lang.Void r17) {
                runnable.run();
            }
        }, executor);
        t2.k kVar = (t2.k) atomicReference.get();
        kVar.getClass();
        return kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$initialSurfaceRecreationCompleter$6 */
    public /* synthetic */ java.lang.Object m4778xa70dff93(java.util.concurrent.atomic.AtomicReference atomicReference, t2.k kVar) {
        atomicReference.set(kVar);
        return "SurfaceRequest-surface-recreation(" + hashCode() + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$new$0 */
    public static /* synthetic */ java.lang.Object m4779x51ef5f0f(java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.String str, t2.k kVar) {
        atomicReference.set(kVar);
        return str + "-cancellation";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$new$1 */
    public static /* synthetic */ java.lang.Object m4780x51ef5f10(java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.String str, t2.k kVar) {
        atomicReference.set(kVar);
        return str + "-status";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$new$2 */
    public static /* synthetic */ java.lang.Object m4781x51ef5f11(java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.String str, t2.k kVar) {
        atomicReference.set(kVar);
        return str + "-Surface";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$new$3 */
    public /* synthetic */ void m4782x51ef5f12() {
        this.f1229x5e277963.cancel(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$provideSurface$4 */
    public static /* synthetic */ void m4783x8bdabb99(m3.a aVar, android.view.Surface surface) {
        aVar.mo3938xab27b508(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.Result.of(3, surface));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$provideSurface$5 */
    public static /* synthetic */ void m4784x8bdabb9a(m3.a aVar, android.view.Surface surface) {
        aVar.mo3938xab27b508(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.Result.of(4, surface));
    }

    /* renamed from: addRequestCancellationListener */
    public void m4787xc53b5aa5(java.util.concurrent.Executor executor, java.lang.Runnable runnable) {
        t2.t tVar = this.f1225x1b5d3c54.f496187c;
        if (tVar != null) {
            tVar.mo606x162a7075(runnable, executor);
        }
    }

    /* renamed from: clearTransformationInfoListener */
    public void m4788x9d74fd58() {
        synchronized (this.f1224x6243b38) {
            this.f1233x9448df78 = null;
            this.f1232xbdd21397 = null;
        }
    }

    /* renamed from: getCamera */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 m4789x1390e61b() {
        return this.f1219xfde5e9f2;
    }

    /* renamed from: getDeferrableSurface */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 m4790xcdba49fd() {
        return this.f1222xd941b189;
    }

    /* renamed from: getDynamicRange */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e m4791x82dbcab4() {
        return this.f1220xb97e514b;
    }

    /* renamed from: getExpectedFrameRate */
    public android.util.Range<java.lang.Integer> m4792xcb1c5b5f() {
        return this.f1221x14c95b28;
    }

    /* renamed from: getResolution */
    public android.util.Size m4793x8ee230a2() {
        return this.f1226x7cd370f9;
    }

    /* renamed from: invalidate */
    public boolean m4794x92d0313b() {
        m4800x77e1a6cd();
        return this.f1230x6f56a8c7.a(null);
    }

    /* renamed from: isPrimary */
    public boolean m4795xcaae5578() {
        return this.f1223x45659f8b;
    }

    /* renamed from: isServiced */
    public boolean m4796x22ecb799() {
        return this.f1229x5e277963.isDone();
    }

    /* renamed from: provideSurface */
    public void m4797xc462ecc(final android.view.Surface surface, java.util.concurrent.Executor executor, final m3.a aVar) {
        if (this.f1228x2c6be6b9.a(surface) || this.f1229x5e277963.isCancelled()) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6007xbba9cc06(this.f1227x237fc05e, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48<java.lang.Void>() { // from class: androidx.camera.core.SurfaceRequest.4
                @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48
                /* renamed from: onFailure */
                public void mo3120xee232ab(java.lang.Throwable th6) {
                    m3.h.e(th6 instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.RequestCancelledException, "Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th6);
                    aVar.mo3938xab27b508(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.Result.of(1, surface));
                }

                @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48
                /* renamed from: onSuccess, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public void mo3121xe05b4124(java.lang.Void r37) {
                    aVar.mo3938xab27b508(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.Result.of(0, surface));
                }
            }, executor);
            return;
        }
        m3.h.e(this.f1229x5e277963.isDone(), null);
        try {
            this.f1229x5e277963.get();
            executor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.SurfaceRequest$$b
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.m4783x8bdabb99(m3.a.this, surface);
                }
            });
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
            executor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.SurfaceRequest$$c
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.m4784x8bdabb9a(m3.a.this, surface);
                }
            });
        }
    }

    /* renamed from: setTransformationInfoListener */
    public void m4798xb6dbe32d(java.util.concurrent.Executor executor, final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.TransformationInfoListener transformationInfoListener) {
        final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.TransformationInfo transformationInfo;
        synchronized (this.f1224x6243b38) {
            this.f1233x9448df78 = transformationInfoListener;
            this.f1232xbdd21397 = executor;
            transformationInfo = this.f1231xed949aa4;
        }
        if (transformationInfo != null) {
            executor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.SurfaceRequest$$h
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.TransformationInfoListener.this.mo4802xba878bff(transformationInfo);
                }
            });
        }
    }

    /* renamed from: updateTransformationInfo */
    public void m4799x6a31f400(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.TransformationInfo transformationInfo) {
        final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.TransformationInfoListener transformationInfoListener;
        java.util.concurrent.Executor executor;
        synchronized (this.f1224x6243b38) {
            this.f1231xed949aa4 = transformationInfo;
            transformationInfoListener = this.f1233x9448df78;
            executor = this.f1232xbdd21397;
        }
        if (transformationInfoListener == null || executor == null) {
            return;
        }
        executor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.SurfaceRequest$$i
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.TransformationInfoListener.this.mo4802xba878bff(transformationInfo);
            }
        });
    }

    /* renamed from: willNotProvideSurface */
    public boolean m4800x77e1a6cd() {
        return this.f1228x2c6be6b9.b(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293.SurfaceUnavailableException("Surface request will not complete."));
    }

    public C0569x83ae3d42(android.util.Size size, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e, android.util.Range<java.lang.Integer> range, java.lang.Runnable runnable) {
        this(size, interfaceC0677x9e0bc522, true, c0491x2bb48c5e, range, runnable);
    }

    public C0569x83ae3d42(android.util.Size size, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522, boolean z17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e, android.util.Range<java.lang.Integer> range, java.lang.Runnable runnable) {
        this.f1224x6243b38 = new java.lang.Object();
        this.f1226x7cd370f9 = size;
        this.f1219xfde5e9f2 = interfaceC0677x9e0bc522;
        this.f1223x45659f8b = z17;
        this.f1220xb97e514b = c0491x2bb48c5e;
        this.f1221x14c95b28 = range;
        final java.lang.String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference(null);
        final wa.a a17 = t2.p.a(new t2.m() { // from class: androidx.camera.core.SurfaceRequest$$d
            @Override // t2.m
            /* renamed from: attachCompleter */
            public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                java.lang.Object m4779x51ef5f0f;
                m4779x51ef5f0f = p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.m4779x51ef5f0f(atomicReference, str, kVar);
                return m4779x51ef5f0f;
            }
        });
        final t2.k kVar = (t2.k) atomicReference.get();
        kVar.getClass();
        this.f1225x1b5d3c54 = kVar;
        final java.util.concurrent.atomic.AtomicReference atomicReference2 = new java.util.concurrent.atomic.AtomicReference(null);
        wa.a a18 = t2.p.a(new t2.m() { // from class: androidx.camera.core.SurfaceRequest$$e
            @Override // t2.m
            /* renamed from: attachCompleter */
            public final java.lang.Object mo3008x586b6594(t2.k kVar2) {
                java.lang.Object m4780x51ef5f10;
                m4780x51ef5f10 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.m4780x51ef5f10(atomicReference2, str, kVar2);
                return m4780x51ef5f10;
            }
        });
        this.f1227x237fc05e = a18;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6007xbba9cc06(a18, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48<java.lang.Void>() { // from class: androidx.camera.core.SurfaceRequest.1
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48
            /* renamed from: onFailure */
            public void mo3120xee232ab(java.lang.Throwable th6) {
                if (th6 instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.RequestCancelledException) {
                    m3.h.e(a17.cancel(false), null);
                } else {
                    m3.h.e(kVar.a(null), null);
                }
            }

            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48
            /* renamed from: onSuccess, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public void mo3121xe05b4124(java.lang.Void r27) {
                m3.h.e(kVar.a(null), null);
            }
        }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc());
        final t2.k kVar2 = (t2.k) atomicReference2.get();
        kVar2.getClass();
        final java.util.concurrent.atomic.AtomicReference atomicReference3 = new java.util.concurrent.atomic.AtomicReference(null);
        wa.a a19 = t2.p.a(new t2.m() { // from class: androidx.camera.core.SurfaceRequest$$f
            @Override // t2.m
            /* renamed from: attachCompleter */
            public final java.lang.Object mo3008x586b6594(t2.k kVar3) {
                java.lang.Object m4781x51ef5f11;
                m4781x51ef5f11 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.m4781x51ef5f11(atomicReference3, str, kVar3);
                return m4781x51ef5f11;
            }
        });
        this.f1229x5e277963 = a19;
        t2.k kVar3 = (t2.k) atomicReference3.get();
        kVar3.getClass();
        this.f1228x2c6be6b9 = kVar3;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 abstractC0697x654a0293 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293(size, 34) { // from class: androidx.camera.core.SurfaceRequest.2
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293
            /* renamed from: provideSurface */
            public wa.a mo4801xc462ecc() {
                return p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.this.f1229x5e277963;
            }
        };
        this.f1222xd941b189 = abstractC0697x654a0293;
        final wa.a m5408x5f9b7531 = abstractC0697x654a0293.m5408x5f9b7531();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6007xbba9cc06(a19, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48<android.view.Surface>() { // from class: androidx.camera.core.SurfaceRequest.3
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48
            /* renamed from: onFailure */
            public void mo3120xee232ab(java.lang.Throwable th6) {
                if (!(th6 instanceof java.util.concurrent.CancellationException)) {
                    kVar2.a(null);
                    return;
                }
                m3.h.e(kVar2.b(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.RequestCancelledException(str + " cancelled.", th6)), null);
            }

            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48
            /* renamed from: onSuccess, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public void mo3121xe05b4124(android.view.Surface surface) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6026xd4b03729(m5408x5f9b7531, kVar2);
            }
        }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc());
        m5408x5f9b7531.mo606x162a7075(new java.lang.Runnable() { // from class: androidx.camera.core.SurfaceRequest$$g
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.this.m4782x51ef5f12();
            }
        }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc());
        this.f1230x6f56a8c7 = m4777x6aed90de(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc(), runnable);
    }
}
