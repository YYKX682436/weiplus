package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* renamed from: androidx.camera.camera2.internal.ExposureControl */
/* loaded from: classes14.dex */
public class C0228xee00d236 {

    /* renamed from: DEFAULT_EXPOSURE_COMPENSATION */
    private static final int f417x9e5e50f4 = 0;

    /* renamed from: mCameraControl */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab f418x471e5f0b;

    /* renamed from: mExecutor */
    private final java.util.concurrent.Executor f419x9ec3a060;

    /* renamed from: mExposureStateImpl */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0232xc4884ea f420xbe65cc1d;

    /* renamed from: mIsActive */
    private boolean f421xf85a185d = false;

    /* renamed from: mRunningCaptureResultListener */
    private p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.CaptureResultListener f422x4935db65;

    /* renamed from: mRunningCompleter */
    private t2.k f423xc36ed1e7;

    public C0228xee00d236(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab c0116xda12e2ab, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595, java.util.concurrent.Executor executor) {
        this.f418x471e5f0b = c0116xda12e2ab;
        this.f420xbe65cc1d = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0232xc4884ea(c0322x11ef9595, 0);
        this.f419x9ec3a060 = executor;
    }

    /* renamed from: clearRunningTask */
    private void m3398x302cb757() {
        t2.k kVar = this.f423xc36ed1e7;
        if (kVar != null) {
            kVar.b(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658.OperationCanceledException("Cancelled by another setExposureCompensationIndex()"));
            this.f423xc36ed1e7 = null;
        }
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.CaptureResultListener captureResultListener = this.f422x4935db65;
        if (captureResultListener != null) {
            this.f418x471e5f0b.m2990x7b0076b3(captureResultListener);
            this.f422x4935db65 = null;
        }
    }

    /* renamed from: getDefaultExposureState */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0500x48cb93aa m3399xd13f6b7f(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595) {
        return new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0232xc4884ea(c0322x11ef9595, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setExposureCompensationIndex$0 */
    public static /* synthetic */ boolean m3400x4070dd58(int i17, t2.k kVar, android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
        java.lang.Integer num = (java.lang.Integer) totalCaptureResult.get(android.hardware.camera2.CaptureResult.CONTROL_AE_STATE);
        java.lang.Integer num2 = (java.lang.Integer) totalCaptureResult.get(android.hardware.camera2.CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION);
        if (num == null || num2 == null) {
            if (num2 == null || num2.intValue() != i17) {
                return false;
            }
            kVar.a(java.lang.Integer.valueOf(i17));
            return true;
        }
        int intValue = num.intValue();
        if ((intValue != 2 && intValue != 3 && intValue != 4) || num2.intValue() != i17) {
            return false;
        }
        kVar.a(java.lang.Integer.valueOf(i17));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setExposureCompensationIndex$1 */
    public /* synthetic */ void m3401x4070dd59(final t2.k kVar, final int i17) {
        if (!this.f421xf85a185d) {
            this.f420xbe65cc1d.m3411x28c3840f(0);
            kVar.b(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658.OperationCanceledException("Camera is not active."));
            return;
        }
        m3398x302cb757();
        m3.h.e(this.f423xc36ed1e7 == null, "mRunningCompleter should be null when starting set a new exposure compensation value");
        m3.h.e(this.f422x4935db65 == null, "mRunningCaptureResultListener should be null when starting set a new exposure compensation value");
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.CaptureResultListener captureResultListener = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.CaptureResultListener() { // from class: androidx.camera.camera2.internal.ExposureControl$$c
            @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.CaptureResultListener
            /* renamed from: onCaptureResult */
            public final boolean mo3009xa5745364(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
                boolean m3400x4070dd58;
                m3400x4070dd58 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0228xee00d236.m3400x4070dd58(i17, kVar, totalCaptureResult);
                return m3400x4070dd58;
            }
        };
        this.f422x4935db65 = captureResultListener;
        this.f423xc36ed1e7 = kVar;
        this.f418x471e5f0b.m2954x6b801ab6(captureResultListener);
        this.f418x471e5f0b.m3007x34db709a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setExposureCompensationIndex$2 */
    public /* synthetic */ java.lang.Object m3402x4070dd5a(final int i17, final t2.k kVar) {
        this.f419x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.ExposureControl$$a
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0228xee00d236.this.m3401x4070dd59(kVar, i17);
            }
        });
        return "setExposureCompensationIndex[" + i17 + "]";
    }

    /* renamed from: getExposureState */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0500x48cb93aa m3403xd68c2014() {
        return this.f420xbe65cc1d;
    }

    /* renamed from: setActive */
    public void m3404x37bd608(boolean z17) {
        if (z17 == this.f421xf85a185d) {
            return;
        }
        this.f421xf85a185d = z17;
        if (z17) {
            return;
        }
        this.f420xbe65cc1d.m3411x28c3840f(0);
        m3398x302cb757();
    }

    /* renamed from: setCaptureRequestOption */
    public void m3405xea2ad5c0(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.Builder builder) {
        builder.m2893x3c7bf26a(android.hardware.camera2.CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, java.lang.Integer.valueOf(this.f420xbe65cc1d.mo3407xdef72b9b()), p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority.REQUIRED);
    }

    /* renamed from: setExposureCompensationIndex */
    public wa.a m3406x28c3840f(final int i17) {
        if (!this.f420xbe65cc1d.mo3410xa89a0da3()) {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6011xd75b36b1(new java.lang.IllegalArgumentException("ExposureCompensation is not supported"));
        }
        android.util.Range<java.lang.Integer> mo3408xdf703c06 = this.f420xbe65cc1d.mo3408xdf703c06();
        if (mo3408xdf703c06.contains((android.util.Range<java.lang.Integer>) java.lang.Integer.valueOf(i17))) {
            this.f420xbe65cc1d.m3411x28c3840f(i17);
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6025x3918f316(t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.ExposureControl$$b
                @Override // t2.m
                /* renamed from: attachCompleter */
                public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                    java.lang.Object m3402x4070dd5a;
                    m3402x4070dd5a = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0228xee00d236.this.m3402x4070dd5a(i17, kVar);
                    return m3402x4070dd5a;
                }
            }));
        }
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6011xd75b36b1(new java.lang.IllegalArgumentException("Requested ExposureCompensation " + i17 + " is not within valid range [" + mo3408xdf703c06.getUpper() + ".." + mo3408xdf703c06.getLower() + "]"));
    }
}
