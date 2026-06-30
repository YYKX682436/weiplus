package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.ZslControlImpl */
/* loaded from: classes14.dex */
public final class C0294xc8ee7eea implements p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0293xeb7e8daa {

    /* renamed from: MAX_IMAGES */
    static final int f584xf73c15d3 = 9;

    /* renamed from: RING_BUFFER_CAPACITY */
    static final int f585xdce44dca = 3;
    private static final java.lang.String TAG = "ZslControlImpl";

    /* renamed from: mCameraCharacteristicsCompat */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 f586x9aefb908;

    /* renamed from: mImageRingBuffer */
    final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0874x91945f23 f587x7eb0861e;

    /* renamed from: mIsPrivateReprocessingSupported */
    private boolean f588x624daa1c;

    /* renamed from: mMetadataMatchingCaptureCallback */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6 f591x62e2f992;

    /* renamed from: mReprocessingImageDeferrableSurface */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 f592x4f09790b;

    /* renamed from: mReprocessingImageReader */
    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0561xf076f77b f593x9df4296b;

    /* renamed from: mReprocessingImageWriter */
    android.media.ImageWriter f594xa737751b;

    /* renamed from: mShouldZslDisabledByQuirks */
    private boolean f595x1f3ba01b;

    /* renamed from: mIsZslDisabledByUseCaseConfig */
    private boolean f590xb255244a = false;

    /* renamed from: mIsZslDisabledByFlashMode */
    private boolean f589xf255ef04 = false;

    public C0294xc8ee7eea(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595) {
        this.f588x624daa1c = false;
        this.f595x1f3ba01b = false;
        this.f586x9aefb908 = c0322x11ef9595;
        this.f588x624daa1c = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0299x634872d5.m3688x7f99d0ec(c0322x11ef9595, 4);
        this.f595x1f3ba01b = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0370xcf1a968b.get(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0407x24dffde1.class) != null;
        this.f587x7eb0861e = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0874x91945f23(3, new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0297xa203acb9());
    }

    /* renamed from: cleanup */
    private void m3681x331156a4() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0874x91945f23 c0874x91945f23 = this.f587x7eb0861e;
        while (!c0874x91945f23.mo6208x7aab3243()) {
            c0874x91945f23.mo6205x5cb7b530().close();
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 abstractC0697x654a0293 = this.f592x4f09790b;
        if (abstractC0697x654a0293 != null) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0561xf076f77b c0561xf076f77b = this.f593x9df4296b;
            if (c0561xf076f77b != null) {
                abstractC0697x654a0293.m5408x5f9b7531().mo606x162a7075(new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.RunnableC0296xa203acb8(c0561xf076f77b), p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5982x891c9b16());
                this.f593x9df4296b = null;
            }
            abstractC0697x654a0293.mo5401x5a5ddf8();
            this.f592x4f09790b = null;
        }
        android.media.ImageWriter imageWriter = this.f594xa737751b;
        if (imageWriter != null) {
            imageWriter.close();
            this.f594xa737751b = null;
        }
    }

    /* renamed from: createReprocessingInputSizeMap */
    private java.util.Map<java.lang.Integer, android.util.Size> m3682x8c4db033(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595) {
        android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap;
        try {
            streamConfigurationMap = (android.hardware.camera2.params.StreamConfigurationMap) c0322x11ef9595.get(android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (java.lang.AssertionError e17) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Failed to retrieve StreamConfigurationMap, error = " + e17.getMessage());
            streamConfigurationMap = null;
        }
        if (streamConfigurationMap == null || streamConfigurationMap.getInputFormats() == null) {
            return new java.util.HashMap();
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i17 : streamConfigurationMap.getInputFormats()) {
            android.util.Size[] inputSizes = streamConfigurationMap.getInputSizes(i17);
            if (inputSizes != null) {
                java.util.Arrays.sort(inputSizes, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0783xf2f5bab1(true));
                hashMap.put(java.lang.Integer.valueOf(i17), inputSizes[0]);
            }
        }
        return hashMap;
    }

    /* renamed from: isJpegValidOutputForInputFormat */
    private boolean m3683x4df39cc3(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595, int i17) {
        int[] validOutputFormatsForInput;
        android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap = (android.hardware.camera2.params.StreamConfigurationMap) c0322x11ef9595.get(android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null || (validOutputFormatsForInput = streamConfigurationMap.getValidOutputFormatsForInput(i17)) == null) {
            return false;
        }
        for (int i18 : validOutputFormatsForInput) {
            if (i18 == 256) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$addZslConfig$1 */
    public /* synthetic */ void m3684xc8dedfde(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30 interfaceC0719xa3f4ef30) {
        try {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 mo4183xaf314b5e = interfaceC0719xa3f4ef30.mo4183xaf314b5e();
            if (mo4183xaf314b5e != null) {
                this.f587x7eb0861e.mo6206xa0f98e08(mo4183xaf314b5e);
            }
        } catch (java.lang.IllegalStateException e17) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Failed to acquire latest image IllegalStateException = " + e17.getMessage());
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0293xeb7e8daa
    /* renamed from: addZslConfig */
    public void mo3674x145149d4(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder builder) {
        m3681x331156a4();
        if (this.f590xb255244a) {
            builder.m5631x5d0f9056(1);
            return;
        }
        if (this.f595x1f3ba01b) {
            builder.m5631x5d0f9056(1);
            return;
        }
        java.util.Map<java.lang.Integer, android.util.Size> m3682x8c4db033 = m3682x8c4db033(this.f586x9aefb908);
        if (!this.f588x624daa1c || m3682x8c4db033.isEmpty() || !m3682x8c4db033.containsKey(34) || !m3683x4df39cc3(this.f586x9aefb908, 34)) {
            builder.m5631x5d0f9056(1);
            return;
        }
        android.util.Size size = m3682x8c4db033.get(34);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0545xfdfbaf2f c0545xfdfbaf2f = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0545xfdfbaf2f(size.getWidth(), size.getHeight(), 34, 9);
        this.f591x62e2f992 = c0545xfdfbaf2f.m4688x6f411e10();
        this.f593x9df4296b = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0561xf076f77b(c0545xfdfbaf2f);
        c0545xfdfbaf2f.mo4192x6034c5c3(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30.OnImageAvailableListener() { // from class: androidx.camera.camera2.internal.ZslControlImpl$$a
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30.OnImageAvailableListener
            /* renamed from: onImageAvailable */
            public final void mo3686xdf8fff6d(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30 interfaceC0719xa3f4ef30) {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0294xc8ee7eea.this.m3684xc8dedfde(interfaceC0719xa3f4ef30);
            }
        }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5980xf96be419());
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0720x9cc637dc c0720x9cc637dc = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0720x9cc637dc(this.f593x9df4296b.mo4190xcf572877(), new android.util.Size(this.f593x9df4296b.mo4191x755bd410(), this.f593x9df4296b.mo4187x1c4fb41d()), 34);
        this.f592x4f09790b = c0720x9cc637dc;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0561xf076f77b c0561xf076f77b = this.f593x9df4296b;
        wa.a m5408x5f9b7531 = c0720x9cc637dc.m5408x5f9b7531();
        java.util.Objects.requireNonNull(c0561xf076f77b);
        m5408x5f9b7531.mo606x162a7075(new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.RunnableC0296xa203acb8(c0561xf076f77b), p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5982x891c9b16());
        builder.m5616x34744cc(this.f592x4f09790b);
        builder.m5608xd4aa81a5(this.f591x62e2f992);
        builder.m5615x4a134b41(new android.hardware.camera2.CameraCaptureSession.StateCallback() { // from class: androidx.camera.camera2.internal.ZslControlImpl.1
            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onConfigureFailed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onConfigured(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
                android.view.Surface inputSurface = cameraCaptureSession.getInputSurface();
                if (inputSurface != null) {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0294xc8ee7eea.this.f594xa737751b = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.C0843x60f66eb0.m6153x6bff0255(inputSurface, 1);
                }
            }
        });
        builder.m5627xafc5a94e(new android.hardware.camera2.params.InputConfiguration(this.f593x9df4296b.mo4191x755bd410(), this.f593x9df4296b.mo4187x1c4fb41d(), this.f593x9df4296b.mo4188x450a23fc()));
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0293xeb7e8daa
    /* renamed from: dequeueImageFromBuffer */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 mo3675x7737cf5() {
        try {
            return this.f587x7eb0861e.mo6205x5cb7b530();
        } catch (java.util.NoSuchElementException unused) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "dequeueImageFromBuffer no such element");
            return null;
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0293xeb7e8daa
    /* renamed from: enqueueImageToImageWriter */
    public boolean mo3676x4b0a82c0(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3) {
        android.media.Image mo4172x74984fa5 = interfaceC0536x1ffeadf3.mo4172x74984fa5();
        android.media.ImageWriter imageWriter = this.f594xa737751b;
        if (imageWriter != null && mo4172x74984fa5 != null) {
            try {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.C0843x60f66eb0.m6155x89343a2(imageWriter, mo4172x74984fa5);
                return true;
            } catch (java.lang.IllegalStateException e17) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "enqueueImageToImageWriter throws IllegalStateException = " + e17.getMessage());
            }
        }
        return false;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0293xeb7e8daa
    /* renamed from: isZslDisabledByFlashMode */
    public boolean mo3677x29f70177() {
        return this.f589xf255ef04;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0293xeb7e8daa
    /* renamed from: isZslDisabledByUserCaseConfig */
    public boolean mo3678x2b396b79() {
        return this.f590xb255244a;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0293xeb7e8daa
    /* renamed from: setZslDisabledByFlashMode */
    public void mo3679xe5d4f6af(boolean z17) {
        this.f589xf255ef04 = z17;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0293xeb7e8daa
    /* renamed from: setZslDisabledByUserCaseConfig */
    public void mo3680xc45bf941(boolean z17) {
        this.f590xb255244a = z17;
    }
}
