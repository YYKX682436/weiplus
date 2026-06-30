package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.processing.SurfaceOutputImpl */
/* loaded from: classes14.dex */
public final class C0916x83435b2e implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee {
    private static final java.lang.String TAG = "SurfaceOutputImpl";

    /* renamed from: mAdditionalTransform */
    private final float[] f2195xecb2dd58;

    /* renamed from: mCameraInputInfo */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee.CameraInputInfo f2196x764881c6;

    /* renamed from: mCloseFuture */
    private final wa.a f2197x9e3d0f2e;

    /* renamed from: mCloseFutureCompleter */
    private t2.k f2198x6d093acb;

    /* renamed from: mEventListener */
    private m3.a f2199x39846a01;

    /* renamed from: mExecutor */
    private java.util.concurrent.Executor f2200x9ec3a060;

    /* renamed from: mFormat */
    private final int f2201x3cc1ec4;

    /* renamed from: mInvertedTextureTransform */
    private final float[] f2203xbb737b33;

    /* renamed from: mSecondaryAdditionalTransform */
    private final float[] f2206xf0df07fe;

    /* renamed from: mSecondaryCameraInputInfo */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee.CameraInputInfo f2207xccfef6c;

    /* renamed from: mSecondaryInvertedTextureTransform */
    private final float[] f2208x3996084d;

    /* renamed from: mSensorToBufferTransform */
    private android.graphics.Matrix f2209x9bcb874a;

    /* renamed from: mSize */
    private final android.util.Size f2210x627560e;

    /* renamed from: mSurface */
    private final android.view.Surface f2211x2fa29f80;

    /* renamed from: mTargets */
    private final int f2212x426873d5;

    /* renamed from: mLock */
    private final java.lang.Object f2205x6243b38 = new java.lang.Object();

    /* renamed from: mHasPendingCloseRequest */
    private boolean f2202xb3189081 = false;

    /* renamed from: mIsClosed */
    private boolean f2204xfc407ac3 = false;

    public C0916x83435b2e(android.view.Surface surface, int i17, int i18, android.util.Size size, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee.CameraInputInfo cameraInputInfo, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee.CameraInputInfo cameraInputInfo2, android.graphics.Matrix matrix) {
        float[] fArr = new float[16];
        this.f2195xecb2dd58 = fArr;
        float[] fArr2 = new float[16];
        this.f2206xf0df07fe = fArr2;
        float[] fArr3 = new float[16];
        this.f2203xbb737b33 = fArr3;
        float[] fArr4 = new float[16];
        this.f2208x3996084d = fArr4;
        this.f2211x2fa29f80 = surface;
        this.f2212x426873d5 = i17;
        this.f2201x3cc1ec4 = i18;
        this.f2210x627560e = size;
        this.f2196x764881c6 = cameraInputInfo;
        this.f2207xccfef6c = cameraInputInfo2;
        this.f2209x9bcb874a = matrix;
        m6357x962c1dbf(fArr, fArr3, cameraInputInfo);
        m6357x962c1dbf(fArr2, fArr4, cameraInputInfo2);
        this.f2197x9e3d0f2e = t2.p.a(new t2.m() { // from class: androidx.camera.core.processing.SurfaceOutputImpl$$a
            @Override // t2.m
            /* renamed from: attachCompleter */
            public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                java.lang.Object m6359x51ef5f0f;
                m6359x51ef5f0f = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0916x83435b2e.this.m6359x51ef5f0f(kVar);
                return m6359x51ef5f0f;
            }
        });
    }

    /* renamed from: calculateAdditionalTransform */
    private static void m6357x962c1dbf(float[] fArr, float[] fArr2, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee.CameraInputInfo cameraInputInfo) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        if (cameraInputInfo == null) {
            return;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0793xb5c1f680.m5927x6105b46(fArr, 0.5f);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0793xb5c1f680.m5926x914bb5de(fArr, cameraInputInfo.mo4230x2a7ffb93(), 0.5f, 0.5f);
        if (cameraInputInfo.mo4229x134c910d()) {
            android.opengl.Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        android.graphics.Matrix m5952xeff629f9 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0801x6002c4c5.m5952xeff629f9(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0801x6002c4c5.m5969xd6f79de6(cameraInputInfo.mo4228x652b2835()), p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0801x6002c4c5.m5969xd6f79de6(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0801x6002c4c5.m5966xfb4e0bfc(cameraInputInfo.mo4228x652b2835(), cameraInputInfo.mo4230x2a7ffb93())), cameraInputInfo.mo4230x2a7ffb93(), cameraInputInfo.mo4229x134c910d());
        android.graphics.RectF rectF = new android.graphics.RectF(cameraInputInfo.mo4227x5a43cec8());
        m5952xeff629f9.mapRect(rectF);
        float width = rectF.left / r1.getWidth();
        float height = ((r1.getHeight() - rectF.height()) - rectF.top) / r1.getHeight();
        float width2 = rectF.width() / r1.getWidth();
        float height2 = rectF.height() / r1.getHeight();
        android.opengl.Matrix.translateM(fArr, 0, width, height, 0.0f);
        android.opengl.Matrix.scaleM(fArr, 0, width2, height2, 1.0f);
        m6358xfb85632c(fArr2, cameraInputInfo.mo4226xc85cc5f8());
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    /* renamed from: calculateInvertedTextureTransform */
    private static void m6358xfb85632c(float[] fArr, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0793xb5c1f680.m5927x6105b46(fArr, 0.5f);
        if (interfaceC0677x9e0bc522 != null) {
            m3.h.e(interfaceC0677x9e0bc522.mo5289x5ef3d868(), "Camera has no transform.");
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0793xb5c1f680.m5926x914bb5de(fArr, interfaceC0677x9e0bc522.mo4253x764d3969().mo3172x3b4734f9(), 0.5f, 0.5f);
            if (interfaceC0677x9e0bc522.m5290x298133d9()) {
                android.opengl.Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
                android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        android.opengl.Matrix.invertM(fArr, 0, fArr, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$new$0 */
    public /* synthetic */ java.lang.Object m6359x51ef5f0f(t2.k kVar) {
        this.f2198x6d093acb = kVar;
        return "SurfaceOutputImpl close future complete";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$requestClose$1 */
    public /* synthetic */ void m6360x48bc7173(java.util.concurrent.atomic.AtomicReference atomicReference) {
        ((m3.a) atomicReference.get()).mo3938xab27b508(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee.Event.of(0, this));
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f2205x6243b38) {
            if (!this.f2204xfc407ac3) {
                this.f2204xfc407ac3 = true;
            }
        }
        this.f2198x6d093acb.a(null);
    }

    /* renamed from: getCamera */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 m6361x1390e61b() {
        return this.f2196x764881c6.mo4226xc85cc5f8();
    }

    /* renamed from: getCloseFuture */
    public wa.a m6362xce0644a5() {
        return this.f2197x9e3d0f2e;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee
    /* renamed from: getFormat */
    public int mo4767x19771aed() {
        return this.f2201x3cc1ec4;
    }

    /* renamed from: getInputCropRect */
    public android.graphics.Rect m6363x5a43cec8() {
        return this.f2196x764881c6.mo4227x5a43cec8();
    }

    /* renamed from: getInputSize */
    public android.util.Size m6364x652b2835() {
        return this.f2196x764881c6.mo4228x652b2835();
    }

    /* renamed from: getRotationDegrees */
    public int m6365x2a7ffb93() {
        return this.f2196x764881c6.mo4230x2a7ffb93();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee
    /* renamed from: getSensorToBufferTransform */
    public android.graphics.Matrix mo4768x65554241() {
        return new android.graphics.Matrix(this.f2209x9bcb874a);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee
    /* renamed from: getSize */
    public android.util.Size mo4769xfb854877() {
        return this.f2210x627560e;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee
    /* renamed from: getSurface */
    public android.view.Surface mo4770xcf572877(java.util.concurrent.Executor executor, m3.a aVar) {
        boolean z17;
        synchronized (this.f2205x6243b38) {
            this.f2200x9ec3a060 = executor;
            this.f2199x39846a01 = aVar;
            z17 = this.f2202xb3189081;
        }
        if (z17) {
            m6368x4c203ca9();
        }
        return this.f2211x2fa29f80;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee
    /* renamed from: getTargets */
    public int mo4771xe21cfccc() {
        return this.f2212x426873d5;
    }

    /* renamed from: isClosed */
    public boolean m6366xd742d336() {
        boolean z17;
        synchronized (this.f2205x6243b38) {
            z17 = this.f2204xfc407ac3;
        }
        return z17;
    }

    /* renamed from: isMirroring */
    public boolean m6367x5a1c61b9() {
        return this.f2196x764881c6.mo4229x134c910d();
    }

    /* renamed from: requestClose */
    public void m6368x4c203ca9() {
        java.util.concurrent.Executor executor;
        m3.a aVar;
        final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        synchronized (this.f2205x6243b38) {
            if (this.f2200x9ec3a060 != null && (aVar = this.f2199x39846a01) != null) {
                if (!this.f2204xfc407ac3) {
                    atomicReference.set(aVar);
                    executor = this.f2200x9ec3a060;
                    this.f2202xb3189081 = false;
                }
                executor = null;
            }
            this.f2202xb3189081 = true;
            executor = null;
        }
        if (executor != null) {
            try {
                executor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.processing.SurfaceOutputImpl$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0916x83435b2e.this.m6360x48bc7173(atomicReference);
                    }
                });
            } catch (java.util.concurrent.RejectedExecutionException e17) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "Processor executor closed. Close request not posted.", e17);
            }
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee
    /* renamed from: updateTransformMatrix */
    public void mo4772x7b86244(float[] fArr, float[] fArr2) {
        mo4773x7b86244(fArr, fArr2, true);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee
    /* renamed from: updateTransformMatrix */
    public void mo4773x7b86244(float[] fArr, float[] fArr2, boolean z17) {
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, z17 ? this.f2195xecb2dd58 : this.f2206xf0df07fe, 0);
    }
}
