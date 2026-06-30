package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.ImageAnalysisAbstractAnalyzer */
/* loaded from: classes14.dex */
public abstract class AbstractC0510x4c133a3f implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30.OnImageAvailableListener {
    private static final java.lang.String TAG = "ImageAnalysisAnalyzer";

    /* renamed from: mOnePixelShiftEnabled */
    private volatile boolean f1003xaf95b44c;

    /* renamed from: mOutputImageRotationEnabled */
    private volatile boolean f1007x15f197f6;

    /* renamed from: mPrevBufferRotationDegrees */
    private volatile int f1008x499b2509;

    /* renamed from: mProcessedImageReaderProxy */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0561xf076f77b f1009x9ffea291;

    /* renamed from: mProcessedImageWriter */
    private android.media.ImageWriter f1010x9c20258d;

    /* renamed from: mRGBConvertedBuffer */
    java.nio.ByteBuffer f1011x5dbb9f32;

    /* renamed from: mRelativeRotation */
    private volatile int f1012x5e6dacf7;

    /* renamed from: mSubscribedAnalyzer */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Analyzer f1013xaae8de6d;

    /* renamed from: mURotatedBuffer */
    java.nio.ByteBuffer f1014x508c7b61;

    /* renamed from: mUserExecutor */
    private java.util.concurrent.Executor f1017xe39566cb;

    /* renamed from: mVRotatedBuffer */
    java.nio.ByteBuffer f1018x326a4500;

    /* renamed from: mYRotatedBuffer */
    java.nio.ByteBuffer f1019xd803a1dd;

    /* renamed from: mOutputImageFormat */
    private volatile int f1006x83a5f884 = 1;

    /* renamed from: mOriginalViewPortCropRect */
    private android.graphics.Rect f1005x470964f8 = new android.graphics.Rect();

    /* renamed from: mUpdatedViewPortCropRect */
    private android.graphics.Rect f1016xc8ce6728 = new android.graphics.Rect();

    /* renamed from: mOriginalSensorToBufferTransformMatrix */
    private android.graphics.Matrix f1004xadd54c5a = new android.graphics.Matrix();

    /* renamed from: mUpdatedSensorToBufferTransformMatrix */
    private android.graphics.Matrix f1015x959582a = new android.graphics.Matrix();

    /* renamed from: mAnalyzerLock */
    private final java.lang.Object f1001x9ac6dbfe = new java.lang.Object();

    /* renamed from: mIsAttached */
    protected boolean f1002xcd061d3b = true;

    /* renamed from: createHelperBuffer */
    private void m4474x43aaf0aa(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3) {
        if (this.f1006x83a5f884 != 1) {
            if (this.f1006x83a5f884 == 2 && this.f1011x5dbb9f32 == null) {
                this.f1011x5dbb9f32 = java.nio.ByteBuffer.allocateDirect(interfaceC0536x1ffeadf3.mo4175x755bd410() * interfaceC0536x1ffeadf3.mo4171x1c4fb41d() * 4);
                return;
            }
            return;
        }
        if (this.f1019xd803a1dd == null) {
            this.f1019xd803a1dd = java.nio.ByteBuffer.allocateDirect(interfaceC0536x1ffeadf3.mo4175x755bd410() * interfaceC0536x1ffeadf3.mo4171x1c4fb41d());
        }
        this.f1019xd803a1dd.position(0);
        if (this.f1014x508c7b61 == null) {
            this.f1014x508c7b61 = java.nio.ByteBuffer.allocateDirect((interfaceC0536x1ffeadf3.mo4175x755bd410() * interfaceC0536x1ffeadf3.mo4171x1c4fb41d()) / 4);
        }
        this.f1014x508c7b61.position(0);
        if (this.f1018x326a4500 == null) {
            this.f1018x326a4500 = java.nio.ByteBuffer.allocateDirect((interfaceC0536x1ffeadf3.mo4175x755bd410() * interfaceC0536x1ffeadf3.mo4171x1c4fb41d()) / 4);
        }
        this.f1018x326a4500.position(0);
    }

    /* renamed from: createImageReaderProxy */
    private static p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0561xf076f77b m4475x7b51182c(int i17, int i18, int i19, int i27, int i28) {
        boolean z17 = i19 == 90 || i19 == 270;
        int i29 = z17 ? i18 : i17;
        if (!z17) {
            i17 = i18;
        }
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0561xf076f77b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0540xdaa8f743.m4657x9aed0758(i29, i17, i27, i28));
    }

    /* renamed from: getAdditionalTransformMatrixAppliedByProcessor */
    public static android.graphics.Matrix m4476xca4e1ce(int i17, int i18, int i19, int i27, int i28) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        if (i28 > 0) {
            matrix.setRectToRect(new android.graphics.RectF(0.0f, 0.0f, i17, i18), p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0801x6002c4c5.f1976xa6b75e2c, android.graphics.Matrix.ScaleToFit.FILL);
            matrix.postRotate(i28);
            matrix.postConcat(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0801x6002c4c5.m5950x52e9e8a8(new android.graphics.RectF(0.0f, 0.0f, i19, i27)));
        }
        return matrix;
    }

    /* renamed from: getUpdatedCropRect */
    public static android.graphics.Rect m4477x21b5ec39(android.graphics.Rect rect, android.graphics.Matrix matrix) {
        android.graphics.RectF rectF = new android.graphics.RectF(rect);
        matrix.mapRect(rectF);
        android.graphics.Rect rect2 = new android.graphics.Rect();
        rectF.round(rect2);
        return rect2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$analyzeImage$0 */
    public /* synthetic */ void m4478x403266b8(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3, android.graphics.Matrix matrix, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf32, android.graphics.Rect rect, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Analyzer analyzer, t2.k kVar) {
        if (!this.f1002xcd061d3b) {
            kVar.b(new j3.q("ImageAnalysis is detached"));
            return;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0564x7c326fbf c0564x7c326fbf = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0564x7c326fbf(interfaceC0536x1ffeadf32, p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0541xa100b167.m4658xaf65a0fc(interfaceC0536x1ffeadf3.mo4173xcb10cdf3().mo4211x4aa7b206(), interfaceC0536x1ffeadf3.mo4173xcb10cdf3().mo4212x2b69a60(), this.f1007x15f197f6 ? 0 : this.f1012x5e6dacf7, matrix));
        if (!rect.isEmpty()) {
            c0564x7c326fbf.mo4176xf4e85f16(rect);
        }
        analyzer.mo4440xcc7b5d4c(c0564x7c326fbf);
        kVar.a(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$analyzeImage$1 */
    public /* synthetic */ java.lang.Object m4479x403266b9(java.util.concurrent.Executor executor, final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3, final android.graphics.Matrix matrix, final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf32, final android.graphics.Rect rect, final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Analyzer analyzer, final t2.k kVar) {
        executor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.ImageAnalysisAbstractAnalyzer$$b
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0510x4c133a3f.this.m4478x403266b8(interfaceC0536x1ffeadf3, matrix, interfaceC0536x1ffeadf32, rect, analyzer, kVar);
            }
        });
        return "analyzeImage";
    }

    /* renamed from: recalculateTransformMatrixAndCropRect */
    private void m4480x326ac7f1(int i17, int i18, int i19, int i27) {
        android.graphics.Matrix m4476xca4e1ce = m4476xca4e1ce(i17, i18, i19, i27, this.f1012x5e6dacf7);
        this.f1016xc8ce6728 = m4477x21b5ec39(this.f1005x470964f8, m4476xca4e1ce);
        this.f1015x959582a.setConcat(this.f1004xadd54c5a, m4476xca4e1ce);
    }

    /* renamed from: recreateImageReaderProxy */
    private void m4481xf9942e1f(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3, int i17) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0561xf076f77b c0561xf076f77b = this.f1009x9ffea291;
        if (c0561xf076f77b == null) {
            return;
        }
        c0561xf076f77b.m4764xbb07de6b();
        this.f1009x9ffea291 = m4475x7b51182c(interfaceC0536x1ffeadf3.mo4175x755bd410(), interfaceC0536x1ffeadf3.mo4171x1c4fb41d(), i17, this.f1009x9ffea291.mo4188x450a23fc(), this.f1009x9ffea291.mo4189xcb8dea46());
        if (this.f1006x83a5f884 == 1) {
            android.media.ImageWriter imageWriter = this.f1010x9c20258d;
            if (imageWriter != null) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.C0843x60f66eb0.m6151x5a5ddf8(imageWriter);
            }
            this.f1010x9c20258d = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.C0843x60f66eb0.m6153x6bff0255(this.f1009x9ffea291.mo4190xcf572877(), this.f1009x9ffea291.mo4189xcb8dea46());
        }
    }

    /* renamed from: acquireImage */
    public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 mo4482xf0e56e25(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30 interfaceC0719xa3f4ef30);

    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0070  */
    /* renamed from: analyzeImage */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public wa.a m4483xfecb6f(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 r15) {
        /*
            Method dump skipped, instructions count: 195
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0510x4c133a3f.m4483xfecb6f(androidx.camera.core.ImageProxy):wa.a");
    }

    /* renamed from: attach */
    public void m4484xac1eee45() {
        this.f1002xcd061d3b = true;
    }

    /* renamed from: clearCache */
    public abstract void mo4485xd2bef135();

    /* renamed from: detach */
    public void m4486xb06a1793() {
        this.f1002xcd061d3b = false;
        mo4485xd2bef135();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30.OnImageAvailableListener
    /* renamed from: onImageAvailable */
    public void mo3686xdf8fff6d(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30 interfaceC0719xa3f4ef30) {
        try {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 mo4482xf0e56e25 = mo4482xf0e56e25(interfaceC0719xa3f4ef30);
            if (mo4482xf0e56e25 != null) {
                mo4487xab9c626b(mo4482xf0e56e25);
            }
        } catch (java.lang.IllegalStateException e17) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Failed to acquire image.", e17);
        }
    }

    /* renamed from: onValidImageAvailable */
    public abstract void mo4487xab9c626b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3);

    /* renamed from: setAnalyzer */
    public void m4488x3982eb28(java.util.concurrent.Executor executor, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Analyzer analyzer) {
        if (analyzer == null) {
            mo4485xd2bef135();
        }
        synchronized (this.f1001x9ac6dbfe) {
            this.f1013xaae8de6d = analyzer;
            this.f1017xe39566cb = executor;
        }
    }

    /* renamed from: setOnePixelShiftEnabled */
    public void m4489x6ecee3c1(boolean z17) {
        this.f1003xaf95b44c = z17;
    }

    /* renamed from: setOutputImageFormat */
    public void m4490x158f052f(int i17) {
        this.f1006x83a5f884 = i17;
    }

    /* renamed from: setOutputImageRotationEnabled */
    public void m4491x38849bab(boolean z17) {
        this.f1007x15f197f6 = z17;
    }

    /* renamed from: setProcessedImageReaderProxy */
    public void m4492x77d1d43c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0561xf076f77b c0561xf076f77b) {
        synchronized (this.f1001x9ac6dbfe) {
            this.f1009x9ffea291 = c0561xf076f77b;
        }
    }

    /* renamed from: setRelativeRotation */
    public void m4493x842adeec(int i17) {
        this.f1012x5e6dacf7 = i17;
    }

    /* renamed from: setSensorToBufferTransformMatrix */
    public void m4494x6864fd6(android.graphics.Matrix matrix) {
        synchronized (this.f1001x9ac6dbfe) {
            this.f1004xadd54c5a = matrix;
            this.f1015x959582a = new android.graphics.Matrix(this.f1004xadd54c5a);
        }
    }

    /* renamed from: setViewPortCropRect */
    public void m4495x8c0c67fc(android.graphics.Rect rect) {
        synchronized (this.f1001x9ac6dbfe) {
            this.f1005x470964f8 = rect;
            this.f1016xc8ce6728 = new android.graphics.Rect(this.f1005x470964f8);
        }
    }
}
