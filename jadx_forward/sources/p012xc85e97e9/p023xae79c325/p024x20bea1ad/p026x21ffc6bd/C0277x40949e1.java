package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.TorchControl */
/* loaded from: classes14.dex */
public final class C0277x40949e1 {

    /* renamed from: DEFAULT_TORCH_STATE */
    static final int f560x65d14d30 = 0;
    private static final java.lang.String TAG = "TorchControl";

    /* renamed from: mCamera2CameraControlImpl */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab f561x22a3ac18;

    /* renamed from: mEnableTorchCompleter */
    t2.k f562xf294a2d;

    /* renamed from: mExecutor */
    private final java.util.concurrent.Executor f563x9ec3a060;

    /* renamed from: mHasFlashUnit */
    private final boolean f564x1276b927;

    /* renamed from: mIsActive */
    private boolean f565xf85a185d;

    /* renamed from: mTargetTorchEnabled */
    boolean f566xd7446b23;

    /* renamed from: mTorchState */
    private final p012xc85e97e9.p093xedfae76a.j0 f567x44b41642;

    public C0277x40949e1(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab c0116xda12e2ab, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595, java.util.concurrent.Executor executor) {
        this.f561x22a3ac18 = c0116xda12e2ab;
        this.f563x9ec3a060 = executor;
        java.util.Objects.requireNonNull(c0322x11ef9595);
        this.f564x1276b927 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0414xa74f3bea.m4074x9ae63083(new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0161x3d9a46c1(c0322x11ef9595));
        this.f567x44b41642 = new p012xc85e97e9.p093xedfae76a.j0(0);
        c0116xda12e2ab.m2954x6b801ab6(new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.CaptureResultListener() { // from class: androidx.camera.camera2.internal.TorchControl$$c
            @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.CaptureResultListener
            /* renamed from: onCaptureResult */
            public final boolean mo3009xa5745364(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
                boolean m3635x51ef5f0f;
                m3635x51ef5f0f = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0277x40949e1.this.m3635x51ef5f0f(totalCaptureResult);
                return m3635x51ef5f0f;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$enableTorch$2 */
    public /* synthetic */ java.lang.Object m3634x2433986a(final boolean z17, final t2.k kVar) {
        this.f563x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.TorchControl$$a
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0277x40949e1.this.m3633x24339869(kVar, z17);
            }
        });
        return "enableTorch: " + z17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$new$0 */
    public /* synthetic */ boolean m3635x51ef5f0f(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
        if (this.f562xf294a2d != null) {
            java.lang.Integer num = (java.lang.Integer) totalCaptureResult.getRequest().get(android.hardware.camera2.CaptureRequest.FLASH_MODE);
            if ((num != null && num.intValue() == 2) == this.f566xd7446b23) {
                this.f562xf294a2d.a(null);
                this.f562xf294a2d = null;
            }
        }
        return false;
    }

    /* renamed from: setLiveDataValue */
    private <T> void m3636x7affc719(p012xc85e97e9.p093xedfae76a.j0 j0Var, T t17) {
        if (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5942x9e2d0ded()) {
            j0Var.mo523x53d8522f(t17);
        } else {
            j0Var.mo7808x76db6cb1(t17);
        }
    }

    /* renamed from: enableTorch */
    public wa.a m3637xaa38b839(final boolean z17) {
        if (this.f564x1276b927) {
            m3636x7affc719(this.f567x44b41642, java.lang.Integer.valueOf(z17 ? 1 : 0));
            return t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.TorchControl$$b
                @Override // t2.m
                /* renamed from: attachCompleter */
                public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                    java.lang.Object m3634x2433986a;
                    m3634x2433986a = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0277x40949e1.this.m3634x2433986a(z17, kVar);
                    return m3634x2433986a;
                }
            });
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "Unable to enableTorch due to there is no flash unit.");
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6011xd75b36b1(new java.lang.IllegalStateException("No flash unit"));
    }

    /* renamed from: enableTorchInternal, reason: merged with bridge method [inline-methods] */
    public void m3633x24339869(t2.k kVar, boolean z17) {
        if (!this.f564x1276b927) {
            if (kVar != null) {
                kVar.b(new java.lang.IllegalStateException("No flash unit"));
            }
        } else {
            if (!this.f565xf85a185d) {
                m3636x7affc719(this.f567x44b41642, 0);
                if (kVar != null) {
                    kVar.b(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658.OperationCanceledException("Camera is not active."));
                    return;
                }
                return;
            }
            this.f566xd7446b23 = z17;
            this.f561x22a3ac18.m2963x4b179a16(z17);
            m3636x7affc719(this.f567x44b41642, java.lang.Integer.valueOf(z17 ? 1 : 0));
            t2.k kVar2 = this.f562xf294a2d;
            if (kVar2 != null) {
                kVar2.b(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658.OperationCanceledException("There is a new enableTorch being set"));
            }
            this.f562xf294a2d = kVar;
        }
    }

    /* renamed from: getTorchState */
    public p012xc85e97e9.p093xedfae76a.g0 m3639x56c2d5eb() {
        return this.f567x44b41642;
    }

    /* renamed from: setActive */
    public void m3640x37bd608(boolean z17) {
        if (this.f565xf85a185d == z17) {
            return;
        }
        this.f565xf85a185d = z17;
        if (z17) {
            return;
        }
        if (this.f566xd7446b23) {
            this.f566xd7446b23 = false;
            this.f561x22a3ac18.m2963x4b179a16(false);
            m3636x7affc719(this.f567x44b41642, 0);
        }
        t2.k kVar = this.f562xf294a2d;
        if (kVar != null) {
            kVar.b(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658.OperationCanceledException("Camera is not active."));
            this.f562xf294a2d = null;
        }
    }
}
