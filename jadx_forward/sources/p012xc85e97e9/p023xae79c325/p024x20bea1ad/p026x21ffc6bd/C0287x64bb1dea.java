package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.ZoomControl */
/* loaded from: classes14.dex */
public final class C0287x64bb1dea {

    /* renamed from: DEFAULT_ZOOM_RATIO */
    public static final float f571x493f715d = 1.0f;
    private static final java.lang.String TAG = "ZoomControl";

    /* renamed from: mCamera2CameraControlImpl */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab f572x22a3ac18;

    /* renamed from: mCurrentZoomState */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0292xbd9eb39e f574xcbd46192;

    /* renamed from: mExecutor */
    private final java.util.concurrent.Executor f575x9ec3a060;

    /* renamed from: mZoomImpl */
    final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0287x64bb1dea.ZoomImpl f577x59ad8020;

    /* renamed from: mZoomStateLiveData */
    private final p012xc85e97e9.p093xedfae76a.j0 f578xc1e26867;

    /* renamed from: mIsActive */
    private boolean f576xf85a185d = false;

    /* renamed from: mCaptureResultListener */
    private p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.CaptureResultListener f573xae3caa6a = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.CaptureResultListener() { // from class: androidx.camera.camera2.internal.ZoomControl.1
        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.CaptureResultListener
        /* renamed from: onCaptureResult */
        public boolean mo3009xa5745364(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0287x64bb1dea.this.f577x59ad8020.mo2898xa5745364(totalCaptureResult);
            return false;
        }
    };

    /* renamed from: androidx.camera.camera2.internal.ZoomControl$ZoomImpl */
    /* loaded from: classes14.dex */
    public interface ZoomImpl {
        /* renamed from: addRequestOption */
        void mo2894x48d884c3(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.Builder builder);

        /* renamed from: getCropSensorRegion */
        android.graphics.Rect mo2895x29695174();

        /* renamed from: getMaxZoom */
        float mo2896x70202721();

        /* renamed from: getMinZoom */
        float mo2897x7d3a010f();

        /* renamed from: onCaptureResult */
        void mo2898xa5745364(android.hardware.camera2.TotalCaptureResult totalCaptureResult);

        /* renamed from: resetZoom */
        void mo2899x78a375c2();

        /* renamed from: setZoomRatio */
        void mo2900xbd85d9b6(float f17, t2.k kVar);
    }

    public C0287x64bb1dea(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab c0116xda12e2ab, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595, java.util.concurrent.Executor executor) {
        this.f572x22a3ac18 = c0116xda12e2ab;
        this.f575x9ec3a060 = executor;
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0287x64bb1dea.ZoomImpl m3650x6bad21af = m3650x6bad21af(c0322x11ef9595);
        this.f577x59ad8020 = m3650x6bad21af;
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0292xbd9eb39e c0292xbd9eb39e = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0292xbd9eb39e(m3650x6bad21af.mo2896x70202721(), m3650x6bad21af.mo2897x7d3a010f());
        this.f574xcbd46192 = c0292xbd9eb39e;
        c0292xbd9eb39e.m3673xbd85d9b6(1.0f);
        this.f578xc1e26867 = new p012xc85e97e9.p093xedfae76a.j0(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.AbstractC0834x3738713c.m6100xaf65a0fc(c0292xbd9eb39e));
        c0116xda12e2ab.m2954x6b801ab6(this.f573xae3caa6a);
    }

    /* renamed from: createZoomImpl */
    private static p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0287x64bb1dea.ZoomImpl m3650x6bad21af(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595) {
        return m3653xa054fc0e(c0322x11ef9595) ? new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0109xde46a596(c0322x11ef9595) : new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0225xf2ddb677(c0322x11ef9595);
    }

    /* renamed from: getDefaultZoomState */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0583xd94d3c5e m3651x75a846b3(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595) {
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0287x64bb1dea.ZoomImpl m3650x6bad21af = m3650x6bad21af(c0322x11ef9595);
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0292xbd9eb39e c0292xbd9eb39e = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0292xbd9eb39e(m3650x6bad21af.mo2896x70202721(), m3650x6bad21af.mo2897x7d3a010f());
        c0292xbd9eb39e.m3673xbd85d9b6(1.0f);
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.AbstractC0834x3738713c.m6100xaf65a0fc(c0292xbd9eb39e);
    }

    /* renamed from: getZoomRatioRange */
    private static android.util.Range<java.lang.Float> m3652xac86a91b(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595) {
        try {
            return (android.util.Range) c0322x11ef9595.get(android.hardware.camera2.CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        } catch (java.lang.AssertionError e17) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "AssertionError, fail to get camera characteristic.", e17);
            return null;
        }
    }

    /* renamed from: isAndroidRZoomSupported */
    public static boolean m3653xa054fc0e(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595) {
        return android.os.Build.VERSION.SDK_INT >= 30 && m3652xac86a91b(c0322x11ef9595) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setLinearZoom$3 */
    public /* synthetic */ java.lang.Object m3655xdca3f1cc(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0583xd94d3c5e interfaceC0583xd94d3c5e, final t2.k kVar) {
        this.f575x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.ZoomControl$$b
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0287x64bb1dea.this.m3654xdca3f1cb(kVar, interfaceC0583xd94d3c5e);
            }
        });
        return "setLinearZoom";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setZoomRatio$1 */
    public /* synthetic */ java.lang.Object m3657xf72eff40(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0583xd94d3c5e interfaceC0583xd94d3c5e, final t2.k kVar) {
        this.f575x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.ZoomControl$$c
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0287x64bb1dea.this.m3656xf72eff3f(kVar, interfaceC0583xd94d3c5e);
            }
        });
        return "setZoomRatio";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: submitCameraZoomRatio, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m3656xf72eff3f(t2.k kVar, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0583xd94d3c5e interfaceC0583xd94d3c5e) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0583xd94d3c5e m6100xaf65a0fc;
        if (this.f576xf85a185d) {
            this.f577x59ad8020.mo2900xbd85d9b6(interfaceC0583xd94d3c5e.mo3671x61321942(), kVar);
            this.f572x22a3ac18.m3007x34db709a();
            return;
        }
        synchronized (this.f574xcbd46192) {
            this.f574xcbd46192.m3673xbd85d9b6(1.0f);
            m6100xaf65a0fc = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.AbstractC0834x3738713c.m6100xaf65a0fc(this.f574xcbd46192);
        }
        m3659x8856829f(m6100xaf65a0fc);
        kVar.b(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658.OperationCanceledException("Camera is not active."));
    }

    /* renamed from: updateLiveData */
    private void m3659x8856829f(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0583xd94d3c5e interfaceC0583xd94d3c5e) {
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            this.f578xc1e26867.mo523x53d8522f(interfaceC0583xd94d3c5e);
        } else {
            this.f578xc1e26867.mo7808x76db6cb1(interfaceC0583xd94d3c5e);
        }
    }

    /* renamed from: addZoomOption */
    public void m3660xd3b6eda9(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.Builder builder) {
        this.f577x59ad8020.mo2894x48d884c3(builder);
    }

    /* renamed from: getCropSensorRegion */
    public android.graphics.Rect m3661x29695174() {
        return this.f577x59ad8020.mo2895x29695174();
    }

    /* renamed from: getZoomState */
    public p012xc85e97e9.p093xedfae76a.g0 m3662x61488dc8() {
        return this.f578xc1e26867;
    }

    /* renamed from: setActive */
    public void m3663x37bd608(boolean z17) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0583xd94d3c5e m6100xaf65a0fc;
        if (this.f576xf85a185d == z17) {
            return;
        }
        this.f576xf85a185d = z17;
        if (z17) {
            return;
        }
        synchronized (this.f574xcbd46192) {
            this.f574xcbd46192.m3673xbd85d9b6(1.0f);
            m6100xaf65a0fc = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.AbstractC0834x3738713c.m6100xaf65a0fc(this.f574xcbd46192);
        }
        m3659x8856829f(m6100xaf65a0fc);
        this.f577x59ad8020.mo2899x78a375c2();
        this.f572x22a3ac18.m3007x34db709a();
    }

    /* renamed from: setLinearZoom */
    public wa.a m3664x2900129a(float f17) {
        final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0583xd94d3c5e m6100xaf65a0fc;
        synchronized (this.f574xcbd46192) {
            try {
                this.f574xcbd46192.m3672x2900129a(f17);
                m6100xaf65a0fc = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.AbstractC0834x3738713c.m6100xaf65a0fc(this.f574xcbd46192);
            } catch (java.lang.IllegalArgumentException e17) {
                return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6011xd75b36b1(e17);
            }
        }
        m3659x8856829f(m6100xaf65a0fc);
        return t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.ZoomControl$$d
            @Override // t2.m
            /* renamed from: attachCompleter */
            public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                java.lang.Object m3655xdca3f1cc;
                m3655xdca3f1cc = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0287x64bb1dea.this.m3655xdca3f1cc(m6100xaf65a0fc, kVar);
                return m3655xdca3f1cc;
            }
        });
    }

    /* renamed from: setZoomRatio */
    public wa.a m3665xbd85d9b6(float f17) {
        final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0583xd94d3c5e m6100xaf65a0fc;
        synchronized (this.f574xcbd46192) {
            try {
                this.f574xcbd46192.m3673xbd85d9b6(f17);
                m6100xaf65a0fc = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.AbstractC0834x3738713c.m6100xaf65a0fc(this.f574xcbd46192);
            } catch (java.lang.IllegalArgumentException e17) {
                return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6011xd75b36b1(e17);
            }
        }
        m3659x8856829f(m6100xaf65a0fc);
        return t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.ZoomControl$$a
            @Override // t2.m
            /* renamed from: attachCompleter */
            public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                java.lang.Object m3657xf72eff40;
                m3657xf72eff40 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0287x64bb1dea.this.m3657xf72eff40(m6100xaf65a0fc, kVar);
                return m3657xf72eff40;
            }
        });
    }
}
