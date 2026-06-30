package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.MeteringRepeatingSession */
/* loaded from: classes14.dex */
public class C0253xf8939228 {

    /* renamed from: IMAGE_FORMAT */
    private static final int f458x3d266f7b = 34;
    private static final java.lang.String TAG = "MeteringRepeating";

    /* renamed from: mDeferrableSurface */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 f461x176749c6;

    /* renamed from: mMeteringRepeatingSize */
    private final android.util.Size f462xc78dbf62;

    /* renamed from: mSessionConfig */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 f463x3700320b;

    /* renamed from: mSurfaceResetCallback */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0253xf8939228.SurfaceResetCallback f465x5219a314;

    /* renamed from: mSupportedRepeatingSurfaceSize */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0430x1ebae915 f464x683ffbc8 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0430x1ebae915();

    /* renamed from: mCloseableErrorListener */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.CloseableErrorListener f459xb6dbcd77 = null;

    /* renamed from: mConfigWithDefaults */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0253xf8939228.MeteringRepeatingConfig f460x18ac40e7 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0253xf8939228.MeteringRepeatingConfig();

    /* renamed from: androidx.camera.camera2.internal.MeteringRepeatingSession$MeteringRepeatingConfig */
    /* loaded from: classes14.dex */
    public static class MeteringRepeatingConfig implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> {

        /* renamed from: mConfig */
        private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 f469xfeabaa0f;

        public MeteringRepeatingConfig() {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a m5524xaf65a0fc = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a.m5524xaf65a0fc();
            m5524xaf65a0fc.mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1834x50776329, new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0203x2dfa7c9d());
            m5524xaf65a0fc.mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0716x5f72b371.f1687x12b109b6, 34);
            m3492x123a795e(m5524xaf65a0fc);
            this.f469xfeabaa0f = m5524xaf65a0fc;
        }

        /* renamed from: setTargetConfigs */
        private void m3492x123a795e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a c0731x74f1ef5a) {
            c0731x74f1ef5a.mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0840xcdfd0453.f2094x7271dcb4, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0253xf8939228.class);
            c0731x74f1ef5a.mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0840xcdfd0453.f2095xc1a56baf, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0253xf8939228.class.getCanonicalName() + "-" + java.util.UUID.randomUUID());
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59
        /* renamed from: getCaptureType */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType mo3493xe38cfe6a() {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType.METERING_REPEATING;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0745x2e0bb72
        /* renamed from: getConfig */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 mo3494x1456a638() {
            return this.f469xfeabaa0f;
        }
    }

    /* renamed from: androidx.camera.camera2.internal.MeteringRepeatingSession$SurfaceResetCallback */
    /* loaded from: classes14.dex */
    public interface SurfaceResetCallback {
        /* renamed from: onSurfaceReset */
        void mo3119x54f5b021();
    }

    public C0253xf8939228(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0226x5ccce11d c0226x5ccce11d, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0253xf8939228.SurfaceResetCallback surfaceResetCallback) {
        this.f465x5219a314 = surfaceResetCallback;
        android.util.Size m3482x74e5adc3 = m3482x74e5adc3(c0322x11ef9595, c0226x5ccce11d);
        this.f462xc78dbf62 = m3482x74e5adc3;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "MeteringSession SurfaceTexture size: " + m3482x74e5adc3);
        this.f463x3700320b = m3486x3ca231dc();
    }

    /* renamed from: getProperPreviewSize */
    private android.util.Size m3482x74e5adc3(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0226x5ccce11d c0226x5ccce11d) {
        android.util.Size[] m3784xa804d6db = c0322x11ef9595.m3734xbd9771be().m3784xa804d6db(34);
        if (m3784xa804d6db == null) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Can not get output size list.");
            return new android.util.Size(0, 0);
        }
        android.util.Size[] m4110x7b78e57a = this.f464x683ffbc8.m4110x7b78e57a(m3784xa804d6db);
        java.util.List asList = java.util.Arrays.asList(m4110x7b78e57a);
        java.util.Collections.sort(asList, new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0255x1cfde8ba());
        android.util.Size m3385x8cdf5ab3 = c0226x5ccce11d.m3385x8cdf5ab3();
        long min = java.lang.Math.min(m3385x8cdf5ab3.getWidth() * m3385x8cdf5ab3.getHeight(), 307200L);
        int length = m4110x7b78e57a.length;
        android.util.Size size = null;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                break;
            }
            android.util.Size size2 = m4110x7b78e57a[i17];
            long width = size2.getWidth() * size2.getHeight();
            if (width == min) {
                return size2;
            }
            if (width <= min) {
                i17++;
                size = size2;
            } else if (size != null) {
                return size;
            }
        }
        return (android.util.Size) asList.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$createSessionConfig$0 */
    public /* synthetic */ void m3483xc8fea24b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.SessionError sessionError) {
        this.f463x3700320b = m3486x3ca231dc();
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0253xf8939228.SurfaceResetCallback surfaceResetCallback = this.f465x5219a314;
        if (surfaceResetCallback != null) {
            surfaceResetCallback.mo3119x54f5b021();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getProperPreviewSize$1 */
    public static /* synthetic */ int m3484x2a3e370d(android.util.Size size, android.util.Size size2) {
        return java.lang.Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
    }

    /* renamed from: clear */
    public void m3485x5a5b64d() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "MeteringRepeating clear!");
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 abstractC0697x654a0293 = this.f461x176749c6;
        if (abstractC0697x654a0293 != null) {
            abstractC0697x654a0293.mo5401x5a5ddf8();
        }
        this.f461x176749c6 = null;
    }

    /* renamed from: createSessionConfig */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 m3486x3ca231dc() {
        final android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(this.f462xc78dbf62.getWidth(), this.f462xc78dbf62.getHeight());
        final android.view.Surface surface = new android.view.Surface(surfaceTexture);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder m5603x51964ec6 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder.m5603x51964ec6(this.f460x18ac40e7, this.f462xc78dbf62);
        m5603x51964ec6.m5631x5d0f9056(1);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0720x9cc637dc c0720x9cc637dc = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0720x9cc637dc(surface);
        this.f461x176749c6 = c0720x9cc637dc;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6007xbba9cc06(c0720x9cc637dc.m5408x5f9b7531(), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48<java.lang.Void>() { // from class: androidx.camera.camera2.internal.MeteringRepeatingSession.1
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48
            /* renamed from: onFailure */
            public void mo3120xee232ab(java.lang.Throwable th6) {
                throw new java.lang.IllegalStateException("Future should never fail. Did it get completed by GC?", th6);
            }

            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48
            /* renamed from: onSuccess, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public void mo3121xe05b4124(java.lang.Void r17) {
                surface.release();
                surfaceTexture.release();
            }
        }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc());
        m5603x51964ec6.m5616x34744cc(this.f461x176749c6);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.CloseableErrorListener closeableErrorListener = this.f459xb6dbcd77;
        if (closeableErrorListener != null) {
            closeableErrorListener.m5633x5a5ddf8();
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.CloseableErrorListener closeableErrorListener2 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.CloseableErrorListener(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.ErrorListener() { // from class: androidx.camera.camera2.internal.MeteringRepeatingSession$$a
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.ErrorListener
            /* renamed from: onError */
            public final void mo3491xaf8aa769(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.SessionError sessionError) {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0253xf8939228.this.m3483xc8fea24b(c0750xb915958, sessionError);
            }
        });
        this.f459xb6dbcd77 = closeableErrorListener2;
        m5603x51964ec6.m5624x6b43959a(closeableErrorListener2);
        return m5603x51964ec6.m5619x59bc66e();
    }

    /* renamed from: getMeteringRepeatingSize */
    public android.util.Size m3487x1f67cc19() {
        return this.f462xc78dbf62;
    }

    /* renamed from: getName */
    public java.lang.String m3488xfb82e301() {
        return TAG;
    }

    /* renamed from: getSessionConfig */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 m3489x9951e5c2() {
        return this.f463x3700320b;
    }

    /* renamed from: getUseCaseConfig */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> m3490x111127c3() {
        return this.f460x18ac40e7;
    }
}
