package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.FocusMeteringControl */
/* loaded from: classes14.dex */
public class C0233x9691038c {

    /* renamed from: AUTO_FOCUS_TIMEOUT_DURATION */
    static final long f427xa8209009 = 5000;

    /* renamed from: EMPTY_RECTANGLES */
    private static final android.hardware.camera2.params.MeteringRectangle[] f428xce07a736 = new android.hardware.camera2.params.MeteringRectangle[0];
    private static final java.lang.String TAG = "FocusMeteringControl";

    /* renamed from: mAeRects */
    private android.hardware.camera2.params.MeteringRectangle[] f429x5a61901e;

    /* renamed from: mAfRects */
    private android.hardware.camera2.params.MeteringRectangle[] f430x5c1668bd;

    /* renamed from: mAutoCancelHandle */
    private java.util.concurrent.ScheduledFuture<?> f431xfc7e331e;

    /* renamed from: mAutoFocusTimeoutHandle */
    private java.util.concurrent.ScheduledFuture<?> f432x8d91edcd;

    /* renamed from: mAwbRects */
    private android.hardware.camera2.params.MeteringRectangle[] f433xc4431310;

    /* renamed from: mCameraControl */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab f434x471e5f0b;

    /* renamed from: mExecutor */
    final java.util.concurrent.Executor f436x9ec3a060;

    /* renamed from: mIsExternalFlashAeModeEnabled */
    private boolean f440x5e55ca4c;

    /* renamed from: mMeteringRegionCorrection */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0419xdf392b6b f443x27c9f4d8;

    /* renamed from: mRunningActionCompleter */
    t2.k f445x7061add1;

    /* renamed from: mRunningCancelCompleter */
    t2.k f446xe19f0a0d;

    /* renamed from: mScheduler */
    private final java.util.concurrent.ScheduledExecutorService f447x71230ace;

    /* renamed from: mSessionListenerForAeMode */
    private p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.CaptureResultListener f448xb322d553;

    /* renamed from: mIsActive */
    private volatile boolean f438xf85a185d = false;

    /* renamed from: mPreviewAspectRatio */
    private volatile android.util.Rational f444x4a36b4f8 = null;

    /* renamed from: mIsInAfAutoMode */
    private boolean f442x6ef61253 = false;

    /* renamed from: mCurrentAfState */
    java.lang.Integer f435x66021180 = 0;

    /* renamed from: mFocusTimeoutCounter */
    long f437x1184d6a6 = 0;

    /* renamed from: mIsAutoFocusCompleted */
    boolean f439xd5378eb9 = false;

    /* renamed from: mIsFocusSuccessful */
    boolean f441x76eda61b = false;

    /* renamed from: mTemplate */
    private int f451xd6387407 = 1;

    /* renamed from: mSessionListenerForFocus */
    private p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.CaptureResultListener f450x482329ec = null;

    /* renamed from: mSessionListenerForCancel */
    private p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.CaptureResultListener f449xb662fbe6 = null;

    public C0233x9691038c(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab c0116xda12e2ab, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, java.util.concurrent.Executor executor, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0744x90dabc95 c0744x90dabc95) {
        android.hardware.camera2.params.MeteringRectangle[] meteringRectangleArr = f428xce07a736;
        this.f430x5c1668bd = meteringRectangleArr;
        this.f429x5a61901e = meteringRectangleArr;
        this.f433xc4431310 = meteringRectangleArr;
        this.f445x7061add1 = null;
        this.f446xe19f0a0d = null;
        this.f440x5e55ca4c = false;
        this.f448xb322d553 = null;
        this.f434x471e5f0b = c0116xda12e2ab;
        this.f436x9ec3a060 = executor;
        this.f447x71230ace = scheduledExecutorService;
        this.f443x27c9f4d8 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0419xdf392b6b(c0744x90dabc95);
    }

    /* renamed from: clearAutoFocusTimeoutHandle */
    private void m3413x9637fbad() {
        java.util.concurrent.ScheduledFuture<?> scheduledFuture = this.f432x8d91edcd;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f432x8d91edcd = null;
        }
    }

    /* renamed from: completeCancelFuture */
    private void m3414x536ddcb6() {
        t2.k kVar = this.f446xe19f0a0d;
        if (kVar != null) {
            kVar.a(null);
            this.f446xe19f0a0d = null;
        }
    }

    /* renamed from: disableAutoCancel */
    private void m3415x88c53611() {
        java.util.concurrent.ScheduledFuture<?> scheduledFuture = this.f431xfc7e331e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f431xfc7e331e = null;
        }
    }

    /* renamed from: executeMeteringAction */
    private void m3417x79026224(android.hardware.camera2.params.MeteringRectangle[] meteringRectangleArr, android.hardware.camera2.params.MeteringRectangle[] meteringRectangleArr2, android.hardware.camera2.params.MeteringRectangle[] meteringRectangleArr3, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0502x5ba1de27 c0502x5ba1de27, long j17) {
        final long m3007x34db709a;
        this.f434x471e5f0b.m2990x7b0076b3(this.f450x482329ec);
        m3415x88c53611();
        m3413x9637fbad();
        this.f430x5c1668bd = meteringRectangleArr;
        this.f429x5a61901e = meteringRectangleArr2;
        this.f433xc4431310 = meteringRectangleArr3;
        if (m3442x9c9d936a()) {
            this.f442x6ef61253 = true;
            this.f439xd5378eb9 = false;
            this.f441x76eda61b = false;
            m3007x34db709a = this.f434x471e5f0b.m3007x34db709a();
            m3461xd954cffd(null, true);
        } else {
            this.f442x6ef61253 = false;
            this.f439xd5378eb9 = true;
            this.f441x76eda61b = false;
            m3007x34db709a = this.f434x471e5f0b.m3007x34db709a();
        }
        this.f435x66021180 = 0;
        final boolean m3424x4d4a1b9c = m3424x4d4a1b9c();
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.CaptureResultListener captureResultListener = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.CaptureResultListener() { // from class: androidx.camera.camera2.internal.FocusMeteringControl$$b
            @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.CaptureResultListener
            /* renamed from: onCaptureResult */
            public final boolean mo3009xa5745364(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
                boolean m3434xeb82b3da;
                m3434xeb82b3da = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0233x9691038c.this.m3434xeb82b3da(m3424x4d4a1b9c, m3007x34db709a, totalCaptureResult);
                return m3434xeb82b3da;
            }
        };
        this.f450x482329ec = captureResultListener;
        this.f434x471e5f0b.m2954x6b801ab6(captureResultListener);
        final long j18 = this.f437x1184d6a6 + 1;
        this.f437x1184d6a6 = j18;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.FocusMeteringControl$$c
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0233x9691038c.this.m3436xeb82b3dc(j18);
            }
        };
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.f447x71230ace;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        this.f432x8d91edcd = scheduledExecutorService.schedule(runnable, j17, timeUnit);
        if (c0502x5ba1de27.m4395x59c9ee()) {
            this.f431xfc7e331e = this.f447x71230ace.schedule(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.FocusMeteringControl$$d
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0233x9691038c.this.m3433x84d3c6dd(j18);
                }
            }, c0502x5ba1de27.m4391x7ce9189e(), timeUnit);
        }
    }

    /* renamed from: failActionFuture */
    private void m3418x7d0f65d7(java.lang.String str) {
        this.f434x471e5f0b.m2990x7b0076b3(this.f450x482329ec);
        t2.k kVar = this.f445x7061add1;
        if (kVar != null) {
            kVar.b(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658.OperationCanceledException(str));
            this.f445x7061add1 = null;
        }
    }

    /* renamed from: failCancelFuture */
    private void m3419xb6bdd31b(java.lang.String str) {
        this.f434x471e5f0b.m2990x7b0076b3(this.f449xb662fbe6);
        t2.k kVar = this.f446xe19f0a0d;
        if (kVar != null) {
            kVar.b(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658.OperationCanceledException(str));
            this.f446xe19f0a0d = null;
        }
    }

    /* renamed from: getDefaultAspectRatio */
    private android.util.Rational m3420x9644b388() {
        if (this.f444x4a36b4f8 != null) {
            return this.f444x4a36b4f8;
        }
        android.graphics.Rect m2966x29695174 = this.f434x471e5f0b.m2966x29695174();
        return new android.util.Rational(m2966x29695174.width(), m2966x29695174.height());
    }

    /* renamed from: getFovAdjustedPoint */
    private static android.graphics.PointF m3421xb21c5d6b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0548xb03aad37 c0548xb03aad37, android.util.Rational rational, android.util.Rational rational2, int i17, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0419xdf392b6b c0419xdf392b6b) {
        if (c0548xb03aad37.m4692xfe36a19c() != null) {
            rational2 = c0548xb03aad37.m4692xfe36a19c();
        }
        android.graphics.PointF m4084xc4ae1d7d = c0419xdf392b6b.m4084xc4ae1d7d(c0548xb03aad37, i17);
        if (!rational2.equals(rational)) {
            if (rational2.compareTo(rational) > 0) {
                float doubleValue = (float) (rational2.doubleValue() / rational.doubleValue());
                m4084xc4ae1d7d.y = (((float) ((doubleValue - 1.0d) / 2.0d)) + m4084xc4ae1d7d.y) * (1.0f / doubleValue);
            } else {
                float doubleValue2 = (float) (rational.doubleValue() / rational2.doubleValue());
                m4084xc4ae1d7d.x = (((float) ((doubleValue2 - 1.0d) / 2.0d)) + m4084xc4ae1d7d.x) * (1.0f / doubleValue2);
            }
        }
        return m4084xc4ae1d7d;
    }

    /* renamed from: getMeteringRect */
    private static android.hardware.camera2.params.MeteringRectangle m3422x4c532fb3(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0548xb03aad37 c0548xb03aad37, android.graphics.PointF pointF, android.graphics.Rect rect) {
        int width = (int) (rect.left + (pointF.x * rect.width()));
        int height = (int) (rect.top + (pointF.y * rect.height()));
        int m4691xfb854877 = ((int) (c0548xb03aad37.m4691xfb854877() * rect.width())) / 2;
        int m4691xfb8548772 = ((int) (c0548xb03aad37.m4691xfb854877() * rect.height())) / 2;
        android.graphics.Rect rect2 = new android.graphics.Rect(width - m4691xfb854877, height - m4691xfb8548772, width + m4691xfb854877, height + m4691xfb8548772);
        rect2.left = m3441x92bf607e(rect2.left, rect.right, rect.left);
        rect2.right = m3441x92bf607e(rect2.right, rect.right, rect.left);
        rect2.top = m3441x92bf607e(rect2.top, rect.bottom, rect.top);
        rect2.bottom = m3441x92bf607e(rect2.bottom, rect.bottom, rect.top);
        return new android.hardware.camera2.params.MeteringRectangle(rect2, 1000);
    }

    /* renamed from: getMeteringRectangles */
    private java.util.List<android.hardware.camera2.params.MeteringRectangle> m3423x6fb3ff73(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0548xb03aad37> list, int i17, android.util.Rational rational, android.graphics.Rect rect, int i18) {
        if (list.isEmpty() || i17 == 0) {
            return java.util.Collections.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.util.Rational rational2 = new android.util.Rational(rect.width(), rect.height());
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0548xb03aad37 c0548xb03aad37 : list) {
            if (arrayList.size() == i17) {
                break;
            }
            if (m3425x7b953cf2(c0548xb03aad37)) {
                android.hardware.camera2.params.MeteringRectangle m3422x4c532fb3 = m3422x4c532fb3(c0548xb03aad37, m3421xb21c5d6b(c0548xb03aad37, rational2, rational, i18, this.f443x27c9f4d8), rect);
                if (m3422x4c532fb3.getWidth() != 0 && m3422x4c532fb3.getHeight() != 0) {
                    arrayList.add(m3422x4c532fb3);
                }
            }
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    /* renamed from: isAfModeSupported */
    private boolean m3424x4d4a1b9c() {
        return this.f434x471e5f0b.m2980xd4adf780(1) == 1;
    }

    /* renamed from: isValid */
    private static boolean m3425x7b953cf2(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0548xb03aad37 c0548xb03aad37) {
        return c0548xb03aad37.m4693x305bc2() >= 0.0f && c0548xb03aad37.m4693x305bc2() <= 1.0f && c0548xb03aad37.m4694x305bc3() >= 0.0f && c0548xb03aad37.m4694x305bc3() <= 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$cancelFocusAndMetering$13 */
    public /* synthetic */ java.lang.Object m3427x4bd4f817(final t2.k kVar) {
        this.f436x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.FocusMeteringControl$$n
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0233x9691038c.this.m3426x4bd4f816(kVar);
            }
        });
        return "cancelFocusAndMetering";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$cancelFocusAndMeteringInternal$14 */
    public /* synthetic */ boolean m3428x810ba31b(int i17, long j17, android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
        if (((java.lang.Integer) totalCaptureResult.get(android.hardware.camera2.CaptureResult.CONTROL_AF_MODE)).intValue() != i17 || !p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.m2942x254890f(totalCaptureResult, j17)) {
            return false;
        }
        m3414x536ddcb6();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$enableExternalFlashAeMode$4 */
    public /* synthetic */ void m3429x1da6e79c(boolean z17, t2.k kVar) {
        this.f434x471e5f0b.m2990x7b0076b3(this.f448xb322d553);
        this.f440x5e55ca4c = z17;
        m3416x1d44eca9(kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$enableExternalFlashAeMode$5 */
    public /* synthetic */ java.lang.Object m3430x1da6e79d(final boolean z17, final t2.k kVar) {
        this.f436x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.FocusMeteringControl$$a
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0233x9691038c.this.m3429x1da6e79c(z17, kVar);
            }
        });
        return "enableExternalFlashAeMode";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$enableExternalFlashAeMode$6 */
    public /* synthetic */ boolean m3431x1da6e79e(long j17, t2.k kVar, android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
        boolean z17 = ((java.lang.Integer) totalCaptureResult.get(android.hardware.camera2.CaptureResult.CONTROL_AE_MODE)).intValue() == 5;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "enableExternalFlashAeMode: isAeModeExternalFlash = " + z17);
        if (z17 != this.f440x5e55ca4c || !p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.m2942x254890f(totalCaptureResult, j17)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "enableExternalFlashAeMode: session updated with isAeModeExternalFlash = " + z17);
        if (kVar != null) {
            kVar.a(null);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$executeMeteringAction$10 */
    public /* synthetic */ void m3432x84d3c6dc(long j17) {
        if (j17 == this.f437x1184d6a6) {
            m3447x845594c3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$executeMeteringAction$11 */
    public /* synthetic */ void m3433x84d3c6dd(final long j17) {
        this.f436x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.FocusMeteringControl$$g
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0233x9691038c.this.m3432x84d3c6dc(j17);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$executeMeteringAction$7 */
    public /* synthetic */ boolean m3434xeb82b3da(boolean z17, long j17, android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
        java.lang.Integer num = (java.lang.Integer) totalCaptureResult.get(android.hardware.camera2.CaptureResult.CONTROL_AF_STATE);
        if (m3442x9c9d936a()) {
            if (!z17 || num == null) {
                this.f441x76eda61b = true;
                this.f439xd5378eb9 = true;
            } else if (this.f435x66021180.intValue() == 3) {
                if (num.intValue() == 4) {
                    this.f441x76eda61b = true;
                    this.f439xd5378eb9 = true;
                } else if (num.intValue() == 5) {
                    this.f441x76eda61b = false;
                    this.f439xd5378eb9 = true;
                }
            }
        }
        if (this.f439xd5378eb9 && p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.m2942x254890f(totalCaptureResult, j17)) {
            m3448x19bf6f72(this.f441x76eda61b);
            return true;
        }
        if (!this.f435x66021180.equals(num) && num != null) {
            this.f435x66021180 = num;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$executeMeteringAction$8 */
    public /* synthetic */ void m3435xeb82b3db(long j17) {
        if (j17 == this.f437x1184d6a6) {
            this.f441x76eda61b = false;
            m3448x19bf6f72(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$executeMeteringAction$9 */
    public /* synthetic */ void m3436xeb82b3dc(final long j17) {
        this.f436x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.FocusMeteringControl$$f
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0233x9691038c.this.m3435xeb82b3db(j17);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$startFocusAndMetering$1 */
    public /* synthetic */ java.lang.Object m3438x45f02f6a(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0502x5ba1de27 c0502x5ba1de27, final long j17, final t2.k kVar) {
        this.f436x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.FocusMeteringControl$$j
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0233x9691038c.this.m3437x45f02f69(kVar, c0502x5ba1de27, j17);
            }
        });
        return "startFocusAndMetering";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$triggerAePrecapture$3 */
    public /* synthetic */ java.lang.Object m3440x1d222411(final t2.k kVar) {
        this.f436x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.FocusMeteringControl$$m
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0233x9691038c.this.m3439x1d222410(kVar);
            }
        });
        return "triggerAePrecapture";
    }

    /* renamed from: rangeLimit */
    private static int m3441x92bf607e(int i17, int i18, int i19) {
        return java.lang.Math.min(java.lang.Math.max(i17, i19), i18);
    }

    /* renamed from: shouldTriggerAF */
    private boolean m3442x9c9d936a() {
        return this.f430x5c1668bd.length > 0;
    }

    /* renamed from: addFocusMeteringOptions */
    public void m3443xa82802ee(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.Builder builder) {
        int m3450xd7dd2953 = this.f442x6ef61253 ? 1 : m3450xd7dd2953();
        android.hardware.camera2.CaptureRequest.Key key = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f434x471e5f0b.m2980xd4adf780(m3450xd7dd2953));
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority optionPriority = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority.REQUIRED;
        builder.m2893x3c7bf26a(key, valueOf, optionPriority);
        android.hardware.camera2.params.MeteringRectangle[] meteringRectangleArr = this.f430x5c1668bd;
        if (meteringRectangleArr.length != 0) {
            builder.m2893x3c7bf26a(android.hardware.camera2.CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr, optionPriority);
        }
        android.hardware.camera2.params.MeteringRectangle[] meteringRectangleArr2 = this.f429x5a61901e;
        if (meteringRectangleArr2.length != 0) {
            builder.m2893x3c7bf26a(android.hardware.camera2.CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2, optionPriority);
        }
        android.hardware.camera2.params.MeteringRectangle[] meteringRectangleArr3 = this.f433xc4431310;
        if (meteringRectangleArr3.length != 0) {
            builder.m2893x3c7bf26a(android.hardware.camera2.CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3, optionPriority);
        }
    }

    /* renamed from: cancelAfAeTrigger */
    public void m3444xe03d2775(boolean z17, boolean z18) {
        if (this.f438xf85a185d) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.Builder builder = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.Builder();
            builder.m5367x6eb78a2b(true);
            builder.m5366x5d0f9056(this.f451xd6387407);
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.Builder builder2 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.Builder();
            if (z17) {
                builder2.m2892xea2ad5c0(android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER, 2);
            }
            if (z18) {
                builder2.m2892xea2ad5c0(android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
            }
            builder.m5347x2f697c6b(builder2.mo2888x59bc66e());
            this.f434x471e5f0b.m3003xbf0642cf(java.util.Collections.singletonList(builder.m5350x59bc66e()));
        }
    }

    /* renamed from: cancelFocusAndMetering */
    public wa.a m3445x7e6e0552() {
        return t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.FocusMeteringControl$$l
            @Override // t2.m
            /* renamed from: attachCompleter */
            public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                java.lang.Object m3427x4bd4f817;
                m3427x4bd4f817 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0233x9691038c.this.m3427x4bd4f817(kVar);
                return m3427x4bd4f817;
            }
        });
    }

    /* renamed from: cancelFocusAndMeteringInternal, reason: merged with bridge method [inline-methods] */
    public void m3426x4bd4f816(t2.k kVar) {
        m3419xb6bdd31b("Cancelled by another cancelFocusAndMetering()");
        m3418x7d0f65d7("Cancelled by cancelFocusAndMetering()");
        this.f446xe19f0a0d = kVar;
        m3415x88c53611();
        m3413x9637fbad();
        if (m3442x9c9d936a()) {
            m3444xe03d2775(true, false);
        }
        android.hardware.camera2.params.MeteringRectangle[] meteringRectangleArr = f428xce07a736;
        this.f430x5c1668bd = meteringRectangleArr;
        this.f429x5a61901e = meteringRectangleArr;
        this.f433xc4431310 = meteringRectangleArr;
        this.f442x6ef61253 = false;
        final long m3007x34db709a = this.f434x471e5f0b.m3007x34db709a();
        if (this.f446xe19f0a0d != null) {
            final int m2980xd4adf780 = this.f434x471e5f0b.m2980xd4adf780(m3450xd7dd2953());
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.CaptureResultListener captureResultListener = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.CaptureResultListener() { // from class: androidx.camera.camera2.internal.FocusMeteringControl$$e
                @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.CaptureResultListener
                /* renamed from: onCaptureResult */
                public final boolean mo3009xa5745364(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
                    boolean m3428x810ba31b;
                    m3428x810ba31b = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0233x9691038c.this.m3428x810ba31b(m2980xd4adf780, m3007x34db709a, totalCaptureResult);
                    return m3428x810ba31b;
                }
            };
            this.f449xb662fbe6 = captureResultListener;
            this.f434x471e5f0b.m2954x6b801ab6(captureResultListener);
        }
    }

    /* renamed from: cancelFocusAndMeteringWithoutAsyncResult */
    public void m3447x845594c3() {
        m3426x4bd4f816(null);
    }

    /* renamed from: completeActionFuture */
    public void m3448x19bf6f72(boolean z17) {
        m3413x9637fbad();
        t2.k kVar = this.f445x7061add1;
        if (kVar != null) {
            kVar.a(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0503x78c0280e.m4402xaf65a0fc(z17));
            this.f445x7061add1 = null;
        }
    }

    /* renamed from: enableExternalFlashAeMode */
    public wa.a m3449x1d44eca9(final boolean z17) {
        if (android.os.Build.VERSION.SDK_INT < 28) {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6013x95a8e8d4(null);
        }
        if (this.f434x471e5f0b.m2979xd49fdfff(5) != 5) {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6013x95a8e8d4(null);
        }
        return t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.FocusMeteringControl$$k
            @Override // t2.m
            /* renamed from: attachCompleter */
            public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                java.lang.Object m3430x1da6e79d;
                m3430x1da6e79d = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0233x9691038c.this.m3430x1da6e79d(z17, kVar);
                return m3430x1da6e79d;
            }
        });
    }

    /* renamed from: getDefaultAfMode */
    public int m3450xd7dd2953() {
        return this.f451xd6387407 != 3 ? 4 : 3;
    }

    /* renamed from: isExternalFlashAeModeEnabled */
    public boolean m3451xe1726b3f() {
        return this.f440x5e55ca4c;
    }

    /* renamed from: isFocusMeteringSupported */
    public boolean m3452xfda814c7(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0502x5ba1de27 c0502x5ba1de27) {
        android.graphics.Rect m2966x29695174 = this.f434x471e5f0b.m2966x29695174();
        android.util.Rational m3420x9644b388 = m3420x9644b388();
        return (m3423x6fb3ff73(c0502x5ba1de27.m4393xd6590eb7(), this.f434x471e5f0b.m2973x43a64988(), m3420x9644b388, m2966x29695174, 1).isEmpty() && m3423x6fb3ff73(c0502x5ba1de27.m4392xd6590eb6(), this.f434x471e5f0b.m2972x3bf4a429(), m3420x9644b388, m2966x29695174, 2).isEmpty() && m3423x6fb3ff73(c0502x5ba1de27.m4394xf4c8ca9a(), this.f434x471e5f0b.m2974x716c8dbd(), m3420x9644b388, m2966x29695174, 4).isEmpty()) ? false : true;
    }

    /* renamed from: setActive */
    public void m3453x37bd608(boolean z17) {
        if (z17 == this.f438xf85a185d) {
            return;
        }
        this.f438xf85a185d = z17;
        if (this.f438xf85a185d) {
            return;
        }
        m3447x845594c3();
    }

    /* renamed from: setPreviewAspectRatio */
    public void m3454xf56f3dad(android.util.Rational rational) {
        this.f444x4a36b4f8 = rational;
    }

    /* renamed from: setTemplate */
    public void m3455x27cd6afc(int i17) {
        this.f451xd6387407 = i17;
    }

    /* renamed from: startFocusAndMetering */
    public wa.a m3456xaea5cb3a(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0502x5ba1de27 c0502x5ba1de27) {
        return m3457xaea5cb3a(c0502x5ba1de27, f427xa8209009);
    }

    /* renamed from: startFocusAndMeteringInternal, reason: merged with bridge method [inline-methods] */
    public void m3437x45f02f69(t2.k kVar, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0502x5ba1de27 c0502x5ba1de27, long j17) {
        if (!this.f438xf85a185d) {
            kVar.b(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658.OperationCanceledException("Camera is not active."));
            return;
        }
        android.graphics.Rect m2966x29695174 = this.f434x471e5f0b.m2966x29695174();
        android.util.Rational m3420x9644b388 = m3420x9644b388();
        java.util.List<android.hardware.camera2.params.MeteringRectangle> m3423x6fb3ff73 = m3423x6fb3ff73(c0502x5ba1de27.m4393xd6590eb7(), this.f434x471e5f0b.m2973x43a64988(), m3420x9644b388, m2966x29695174, 1);
        java.util.List<android.hardware.camera2.params.MeteringRectangle> m3423x6fb3ff732 = m3423x6fb3ff73(c0502x5ba1de27.m4392xd6590eb6(), this.f434x471e5f0b.m2972x3bf4a429(), m3420x9644b388, m2966x29695174, 2);
        java.util.List<android.hardware.camera2.params.MeteringRectangle> m3423x6fb3ff733 = m3423x6fb3ff73(c0502x5ba1de27.m4394xf4c8ca9a(), this.f434x471e5f0b.m2974x716c8dbd(), m3420x9644b388, m2966x29695174, 4);
        if (m3423x6fb3ff73.isEmpty() && m3423x6fb3ff732.isEmpty() && m3423x6fb3ff733.isEmpty()) {
            kVar.b(new java.lang.IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints is supported on this camera."));
            return;
        }
        m3418x7d0f65d7("Cancelled by another startFocusAndMetering()");
        m3419xb6bdd31b("Cancelled by another startFocusAndMetering()");
        m3415x88c53611();
        this.f445x7061add1 = kVar;
        android.hardware.camera2.params.MeteringRectangle[] meteringRectangleArr = f428xce07a736;
        m3417x79026224((android.hardware.camera2.params.MeteringRectangle[]) m3423x6fb3ff73.toArray(meteringRectangleArr), (android.hardware.camera2.params.MeteringRectangle[]) m3423x6fb3ff732.toArray(meteringRectangleArr), (android.hardware.camera2.params.MeteringRectangle[]) m3423x6fb3ff733.toArray(meteringRectangleArr), c0502x5ba1de27, j17);
    }

    /* renamed from: triggerAePrecapture */
    public wa.a m3459x3831485f() {
        return t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.FocusMeteringControl$$h
            @Override // t2.m
            /* renamed from: attachCompleter */
            public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                java.lang.Object m3440x1d222411;
                m3440x1d222411 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0233x9691038c.this.m3440x1d222411(kVar);
                return m3440x1d222411;
            }
        });
    }

    /* renamed from: triggerAf */
    public void m3461xd954cffd(final t2.k kVar, boolean z17) {
        if (!this.f438xf85a185d) {
            if (kVar != null) {
                kVar.b(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658.OperationCanceledException("Camera is not active."));
                return;
            }
            return;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.Builder builder = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.Builder();
        builder.m5366x5d0f9056(this.f451xd6387407);
        builder.m5367x6eb78a2b(true);
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.Builder builder2 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.Builder();
        builder2.m2892xea2ad5c0(android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER, 1);
        if (z17) {
            builder2.m2893x3c7bf26a(android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE, java.lang.Integer.valueOf(this.f434x471e5f0b.m2979xd49fdfff(1)), p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority.HIGH_PRIORITY_REQUIRED);
        }
        builder.m5347x2f697c6b(builder2.mo2888x59bc66e());
        builder.m5345xd4aa81a5(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6() { // from class: androidx.camera.camera2.internal.FocusMeteringControl.1
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6
            /* renamed from: onCaptureCancelled */
            public void mo3015xa4d204aa(int i17) {
                t2.k kVar2 = kVar;
                if (kVar2 != null) {
                    kVar2.b(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658.OperationCanceledException("Camera is closed"));
                }
            }

            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6
            /* renamed from: onCaptureCompleted */
            public void mo3016x34cad1a4(int i17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be interfaceC0663xe081a7be) {
                t2.k kVar2 = kVar;
                if (kVar2 != null) {
                    kVar2.a(interfaceC0663xe081a7be);
                }
            }

            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6
            /* renamed from: onCaptureFailed */
            public void mo3017x90bd1f84(int i17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0661xad844609 c0661xad844609) {
                t2.k kVar2 = kVar;
                if (kVar2 != null) {
                    kVar2.b(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0669xec29d935.CameraControlException(c0661xad844609));
                }
            }
        });
        this.f434x471e5f0b.m3003xbf0642cf(java.util.Collections.singletonList(builder.m5350x59bc66e()));
    }

    /* renamed from: startFocusAndMetering */
    public wa.a m3457xaea5cb3a(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0502x5ba1de27 c0502x5ba1de27, final long j17) {
        return t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.FocusMeteringControl$$i
            @Override // t2.m
            /* renamed from: attachCompleter */
            public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                java.lang.Object m3438x45f02f6a;
                m3438x45f02f6a = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0233x9691038c.this.m3438x45f02f6a(c0502x5ba1de27, j17, kVar);
                return m3438x45f02f6a;
            }
        });
    }

    /* renamed from: triggerAePrecapture, reason: merged with bridge method [inline-methods] */
    public void m3439x1d222410(final t2.k kVar) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "triggerAePrecapture");
        if (!this.f438xf85a185d) {
            if (kVar != null) {
                kVar.b(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658.OperationCanceledException("Camera is not active."));
                return;
            }
            return;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.Builder builder = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.Builder();
        builder.m5366x5d0f9056(this.f451xd6387407);
        builder.m5367x6eb78a2b(true);
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.Builder builder2 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.Builder();
        builder2.m2892xea2ad5c0(android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        builder.m5347x2f697c6b(builder2.mo2888x59bc66e());
        builder.m5345xd4aa81a5(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6() { // from class: androidx.camera.camera2.internal.FocusMeteringControl.2
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6
            /* renamed from: onCaptureCancelled */
            public void mo3015xa4d204aa(int i17) {
                t2.k kVar2 = kVar;
                if (kVar2 != null) {
                    kVar2.b(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658.OperationCanceledException("Camera is closed"));
                }
            }

            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6
            /* renamed from: onCaptureCompleted */
            public void mo3016x34cad1a4(int i17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be interfaceC0663xe081a7be) {
                if (kVar != null) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0233x9691038c.TAG, "triggerAePrecapture: triggering capture request completed");
                    kVar.a(null);
                }
            }

            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6
            /* renamed from: onCaptureFailed */
            public void mo3017x90bd1f84(int i17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0661xad844609 c0661xad844609) {
                t2.k kVar2 = kVar;
                if (kVar2 != null) {
                    kVar2.b(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0669xec29d935.CameraControlException(c0661xad844609));
                }
            }
        });
        this.f434x471e5f0b.m3003xbf0642cf(java.util.Collections.singletonList(builder.m5350x59bc66e()));
    }

    /* renamed from: enableExternalFlashAeMode */
    private void m3416x1d44eca9(final t2.k kVar) {
        if (!this.f438xf85a185d) {
            if (kVar != null) {
                kVar.b(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658.OperationCanceledException("Camera is not active."));
            }
        } else {
            final long m3007x34db709a = this.f434x471e5f0b.m3007x34db709a();
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.CaptureResultListener captureResultListener = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.CaptureResultListener() { // from class: androidx.camera.camera2.internal.FocusMeteringControl$$o
                @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab.CaptureResultListener
                /* renamed from: onCaptureResult */
                public final boolean mo3009xa5745364(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
                    boolean m3431x1da6e79e;
                    m3431x1da6e79e = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0233x9691038c.this.m3431x1da6e79e(m3007x34db709a, kVar, totalCaptureResult);
                    return m3431x1da6e79e;
                }
            };
            this.f448xb322d553 = captureResultListener;
            this.f434x471e5f0b.m2954x6b801ab6(captureResultListener);
        }
    }
}
