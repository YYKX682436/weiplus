package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* renamed from: androidx.camera.camera2.internal.Camera2CameraInfoImpl */
/* loaded from: classes14.dex */
public final class C0160xa6db3120 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570 {
    private static final java.lang.String TAG = "Camera2CameraInfo";

    /* renamed from: mCamera2CameraControlImpl */
    private p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab f268x22a3ac18;

    /* renamed from: mCamera2CameraInfo */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0446x27d8cae0 f269xd9f61213;

    /* renamed from: mCamera2EncoderProfilesProvider */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0706x20a07517 f270x23921097;

    /* renamed from: mCameraCharacteristicsCompat */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 f272x9aefb908;

    /* renamed from: mCameraId */
    private final java.lang.String f273x1c133ead;

    /* renamed from: mCameraManager */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a f274x4030095b;

    /* renamed from: mCameraQuirks */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0744x90dabc95 f275x5c91e907;

    /* renamed from: mCameraStateLiveData */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0160xa6db3120.RedirectableLiveData<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c> f276xa2a14595;

    /* renamed from: mPhysicalCameraInfos */
    private java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93> f278xe483665c;

    /* renamed from: mLock */
    private final java.lang.Object f277x6243b38 = new java.lang.Object();

    /* renamed from: mRedirectTorchStateLiveData */
    private p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0160xa6db3120.RedirectableLiveData<java.lang.Integer> f279xdc7d2f14 = null;

    /* renamed from: mRedirectZoomStateLiveData */
    private p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0160xa6db3120.RedirectableLiveData<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0583xd94d3c5e> f280x5f9220eb = null;

    /* renamed from: mCameraCaptureCallbacks */
    private java.util.List<android.util.Pair<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6, java.util.concurrent.Executor>> f271xd57b1a3a = null;

    /* renamed from: androidx.camera.camera2.internal.Camera2CameraInfoImpl$RedirectableLiveData */
    /* loaded from: classes13.dex */
    public static class RedirectableLiveData<T> extends p012xc85e97e9.p093xedfae76a.i0 {

        /* renamed from: mInitialValue */
        private final T f281x7ea54d9a;

        /* renamed from: mLiveDataSource */
        private p012xc85e97e9.p093xedfae76a.g0 f282x30c8bc3e;

        public RedirectableLiveData(T t17) {
            this.f281x7ea54d9a = t17;
        }

        @Override // p012xc85e97e9.p093xedfae76a.i0
        /* renamed from: addSource */
        public <S> void mo3194xffc8101c(p012xc85e97e9.p093xedfae76a.g0 g0Var, p012xc85e97e9.p093xedfae76a.k0 k0Var) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // p012xc85e97e9.p093xedfae76a.g0
        /* renamed from: getValue */
        public T mo3195x754a37bb() {
            p012xc85e97e9.p093xedfae76a.g0 g0Var = this.f282x30c8bc3e;
            return g0Var == null ? this.f281x7ea54d9a : (T) g0Var.mo3195x754a37bb();
        }

        /* renamed from: redirectTo */
        public void m3196x565e7b77(p012xc85e97e9.p093xedfae76a.g0 g0Var) {
            p012xc85e97e9.p093xedfae76a.g0 g0Var2 = this.f282x30c8bc3e;
            if (g0Var2 != null) {
                super.m7811xccdcd9bf(g0Var2);
            }
            this.f282x30c8bc3e = g0Var;
            super.mo3194xffc8101c(g0Var, new p012xc85e97e9.p093xedfae76a.k0() { // from class: androidx.camera.camera2.internal.Camera2CameraInfoImpl$RedirectableLiveData$$a
                @Override // p012xc85e97e9.p093xedfae76a.k0
                /* renamed from: onChanged */
                public final void mo525x7bb163d5(java.lang.Object obj) {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0160xa6db3120.RedirectableLiveData.this.mo523x53d8522f(obj);
                }
            });
        }
    }

    public C0160xa6db3120(java.lang.String str, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a c0332x1ad8324a) {
        str.getClass();
        this.f273x1c133ead = str;
        this.f274x4030095b = c0332x1ad8324a;
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 m3757xc2a5207f = c0332x1ad8324a.m3757xc2a5207f(str);
        this.f272x9aefb908 = m3757xc2a5207f;
        this.f269xd9f61213 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0446x27d8cae0(this);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0744x90dabc95 c0744x90dabc95 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0362xcec8241a.get(str, m3757xc2a5207f);
        this.f275x5c91e907 = c0744x90dabc95;
        this.f270x23921097 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0200x3c74ccea(str, c0744x90dabc95);
        this.f276xa2a14595 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0160xa6db3120.RedirectableLiveData<>(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.m4290xaf65a0fc(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.Type.CLOSED));
    }

    /* renamed from: logDeviceInfo */
    private void m3154x82ae1688() {
        m3155xd33b24ea();
    }

    /* renamed from: logDeviceLevel */
    private void m3155xd33b24ea() {
        java.lang.String str;
        int m3176x37659364 = m3176x37659364();
        if (m3176x37659364 == 0) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (m3176x37659364 == 1) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (m3176x37659364 == 2) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (m3176x37659364 == 3) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        } else if (m3176x37659364 != 4) {
            str = "Unknown value: " + m3176x37659364;
        } else {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.i(TAG, "Device Level: " + str);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570
    /* renamed from: addSessionCaptureCallback */
    public void mo3156x4c7d2236(java.util.concurrent.Executor executor, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6 abstractC0659xd0769ba6) {
        synchronized (this.f277x6243b38) {
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab c0116xda12e2ab = this.f268x22a3ac18;
            if (c0116xda12e2ab != null) {
                c0116xda12e2ab.m2956x6001f411(executor, abstractC0659xd0769ba6);
                return;
            }
            if (this.f271xd57b1a3a == null) {
                this.f271xd57b1a3a = new java.util.ArrayList();
            }
            this.f271xd57b1a3a.add(new android.util.Pair<>(abstractC0659xd0769ba6, executor));
        }
    }

    /* renamed from: getCamera2CameraInfo */
    public p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0446x27d8cae0 m3157x9049124a() {
        return this.f269xd9f61213;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570
    /* renamed from: getCameraCharacteristics */
    public java.lang.Object mo3158x9b962a9d() {
        return this.f272x9aefb908.m3736xef410498();
    }

    /* renamed from: getCameraCharacteristicsCompat */
    public p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 m3159xc2a5207f() {
        return this.f272x9aefb908;
    }

    /* renamed from: getCameraCharacteristicsMap */
    public java.util.Map<java.lang.String, android.hardware.camera2.CameraCharacteristics> m3160xc80a217f() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put(this.f273x1c133ead, this.f272x9aefb908.m3736xef410498());
        for (java.lang.String str : this.f272x9aefb908.m3733xda421586()) {
            if (!java.util.Objects.equals(str, this.f273x1c133ead)) {
                try {
                    linkedHashMap.put(str, this.f274x4030095b.m3757xc2a5207f(str).m3736xef410498());
                } catch (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0302x1aaa9468 e17) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Failed to get CameraCharacteristics for cameraId " + str, e17);
                }
            }
        }
        return linkedHashMap;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570
    /* renamed from: getCameraId */
    public java.lang.String mo3161x72efd496() {
        return this.f273x1c133ead;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570
    /* renamed from: getCameraQuirks */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0744x90dabc95 mo3162x25ef6270() {
        return this.f275x5c91e907;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93
    /* renamed from: getCameraState */
    public p012xc85e97e9.p093xedfae76a.g0 mo3163x53e98736() {
        return this.f276xa2a14595;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570
    /* renamed from: getEncoderProfilesProvider */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0706x20a07517 mo3164x36d40501() {
        return this.f270x23921097;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93
    /* renamed from: getExposureState */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0500x48cb93aa mo3165xd68c2014() {
        synchronized (this.f277x6243b38) {
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab c0116xda12e2ab = this.f268x22a3ac18;
            if (c0116xda12e2ab == null) {
                return p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0228xee00d236.m3399xd13f6b7f(this.f272x9aefb908);
            }
            return c0116xda12e2ab.m2968xdcfec20().m3403xd68c2014();
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93
    /* renamed from: getImplementationType */
    public java.lang.String mo3166xb8d8e802() {
        return m3176x37659364() == 2 ? p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93.f852xfaab0633 : p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93.f851x21a6ed15;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93
    /* renamed from: getIntrinsicZoomRatio */
    public float mo3167x8e79fe69() {
        if (((java.lang.Integer) this.f272x9aefb908.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING)) == null) {
            return 1.0f;
        }
        try {
            return p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0249x3b055a4f.m3464x35fc9f8e(this.f274x4030095b, r0.intValue()) / p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0249x3b055a4f.m3462x911063bf(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0249x3b055a4f.m3463x1f7fcaa0(this.f272x9aefb908), p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0249x3b055a4f.m3465x472862fa(this.f272x9aefb908));
        } catch (java.lang.Exception e17) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "The camera is unable to provide necessary information to resolve its intrinsic zoom ratio with error: " + e17);
            return 1.0f;
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93
    /* renamed from: getLensFacing */
    public int mo3168x5f62de6e() {
        java.lang.Integer num = (java.lang.Integer) this.f272x9aefb908.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING);
        m3.h.b(num != null, "Unable to get the lens facing of the camera.");
        return p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0252xf2a95aba.m3480x37bd5d32(num.intValue());
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570
    /* renamed from: getPhysicalCameraCharacteristics */
    public java.lang.Object mo3169x89bd6c06(java.lang.String str) {
        try {
            if (this.f272x9aefb908.m3733xda421586().contains(str)) {
                return this.f274x4030095b.m3757xc2a5207f(str).m3736xef410498();
            }
            return null;
        } catch (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0302x1aaa9468 e17) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Failed to get CameraCharacteristics for cameraId " + str, e17);
            return null;
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93
    /* renamed from: getPhysicalCameraInfos */
    public java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93> mo3170x521734d3() {
        if (this.f278xe483665c == null) {
            this.f278xe483665c = new java.util.HashSet();
            for (java.lang.String str : this.f272x9aefb908.m3733xda421586()) {
                try {
                    this.f278xe483665c.add(new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0201xc91cdcd7(str, this.f274x4030095b));
                } catch (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0302x1aaa9468 e17) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Failed to get CameraCharacteristics for cameraId " + str, e17);
                    return java.util.Collections.emptySet();
                }
            }
        }
        return this.f278xe483665c;
    }

    /* renamed from: getSensorOrientation */
    public int m3171x86811900() {
        java.lang.Integer num = (java.lang.Integer) this.f272x9aefb908.get(android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION);
        num.getClass();
        return num.intValue();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93
    /* renamed from: getSensorRotationDegrees */
    public int mo3173x3b4734f9(int i17) {
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0781x213ce7ed.m5807x61e284d7(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0781x213ce7ed.m5808x82c0521(i17), m3171x86811900(), 1 == mo3168x5f62de6e());
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570
    /* renamed from: getSupportedDynamicRanges */
    public java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> mo3174x41312cdd() {
        return p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0345x87152bb7.m3798x532ddec9(this.f272x9aefb908).m3801x41312cdd();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93
    /* renamed from: getSupportedFrameRateRanges */
    public java.util.Set<android.util.Range<java.lang.Integer>> mo3175x2d0d240b() {
        android.util.Range[] rangeArr = (android.util.Range[]) this.f272x9aefb908.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        return rangeArr != null ? new java.util.HashSet(java.util.Arrays.asList(rangeArr)) : java.util.Collections.emptySet();
    }

    /* renamed from: getSupportedHardwareLevel */
    public int m3176x37659364() {
        java.lang.Integer num = (java.lang.Integer) this.f272x9aefb908.get(android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        return num.intValue();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570
    /* renamed from: getSupportedHighResolutions */
    public java.util.List<android.util.Size> mo3177x8984b12d(int i17) {
        android.util.Size[] m3782xd229248d = this.f272x9aefb908.m3734xbd9771be().m3782xd229248d(i17);
        return m3782xd229248d != null ? java.util.Arrays.asList(m3782xd229248d) : java.util.Collections.emptyList();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570
    /* renamed from: getSupportedOutputFormats */
    public java.util.Set<java.lang.Integer> mo3178x7cdcf003() {
        int[] m3783x14494f65 = this.f272x9aefb908.m3734xbd9771be().m3783x14494f65();
        if (m3783x14494f65 == null) {
            return new java.util.HashSet();
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        for (int i17 : m3783x14494f65) {
            hashSet.add(java.lang.Integer.valueOf(i17));
        }
        return hashSet;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570
    /* renamed from: getSupportedResolutions */
    public java.util.List<android.util.Size> mo3179x2103142f(int i17) {
        android.util.Size[] m3784xa804d6db = this.f272x9aefb908.m3734xbd9771be().m3784xa804d6db(i17);
        return m3784xa804d6db != null ? java.util.Arrays.asList(m3784xa804d6db) : java.util.Collections.emptyList();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570
    /* renamed from: getTimebase */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.EnumC0761x880e8f3e mo3180xe6894() {
        java.lang.Integer num = (java.lang.Integer) this.f272x9aefb908.get(android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
        num.getClass();
        return num.intValue() != 1 ? p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.EnumC0761x880e8f3e.UPTIME : p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.EnumC0761x880e8f3e.REALTIME;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93
    /* renamed from: getTorchState */
    public p012xc85e97e9.p093xedfae76a.g0 mo3181x56c2d5eb() {
        synchronized (this.f277x6243b38) {
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab c0116xda12e2ab = this.f268x22a3ac18;
            if (c0116xda12e2ab == null) {
                if (this.f279xdc7d2f14 == null) {
                    this.f279xdc7d2f14 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0160xa6db3120.RedirectableLiveData<>(0);
                }
                return this.f279xdc7d2f14;
            }
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0160xa6db3120.RedirectableLiveData<java.lang.Integer> redirectableLiveData = this.f279xdc7d2f14;
            if (redirectableLiveData != null) {
                return redirectableLiveData;
            }
            return c0116xda12e2ab.m2981x5b308837().m3639x56c2d5eb();
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93
    /* renamed from: getZoomState */
    public p012xc85e97e9.p093xedfae76a.g0 mo3182x61488dc8() {
        synchronized (this.f277x6243b38) {
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab c0116xda12e2ab = this.f268x22a3ac18;
            if (c0116xda12e2ab == null) {
                if (this.f280x5f9220eb == null) {
                    this.f280x5f9220eb = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0160xa6db3120.RedirectableLiveData<>(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0287x64bb1dea.m3651x75a846b3(this.f272x9aefb908));
                }
                return this.f280x5f9220eb;
            }
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0160xa6db3120.RedirectableLiveData<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0583xd94d3c5e> redirectableLiveData = this.f280x5f9220eb;
            if (redirectableLiveData != null) {
                return redirectableLiveData;
            }
            return c0116xda12e2ab.m2983xdb27bcd4().m3662x61488dc8();
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93
    /* renamed from: hasFlashUnit */
    public boolean mo3183x7ae1a01a() {
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595 = this.f272x9aefb908;
        java.util.Objects.requireNonNull(c0322x11ef9595);
        return p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0414xa74f3bea.m4074x9ae63083(new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0161x3d9a46c1(c0322x11ef9595));
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93
    /* renamed from: isFocusMeteringSupported */
    public boolean mo3184xfda814c7(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0502x5ba1de27 c0502x5ba1de27) {
        synchronized (this.f277x6243b38) {
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab c0116xda12e2ab = this.f268x22a3ac18;
            if (c0116xda12e2ab == null) {
                return false;
            }
            return c0116xda12e2ab.m2970x38978be2().m3452xfda814c7(c0502x5ba1de27);
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93
    /* renamed from: isLogicalMultiCameraSupported */
    public boolean mo3185x2594f6af() {
        return p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0299x634872d5.m3688x7f99d0ec(this.f272x9aefb908, 11);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570
    /* renamed from: isPreviewStabilizationSupported */
    public boolean mo3186x3e16b66d() {
        int[] iArr = (int[]) this.f272x9aefb908.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i17 : iArr) {
                if (i17 == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93
    /* renamed from: isPrivateReprocessingSupported */
    public boolean mo3187x90c5da4f() {
        return p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0299x634872d5.m3688x7f99d0ec(this.f272x9aefb908, 4);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570
    /* renamed from: isVideoStabilizationSupported */
    public boolean mo3188xfc625460() {
        int[] iArr = (int[]) this.f272x9aefb908.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i17 : iArr) {
                if (i17 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93
    /* renamed from: isZslSupported */
    public boolean mo3189xe543bbe5() {
        return mo3187x90c5da4f() && p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0370xcf1a968b.get(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0407x24dffde1.class) == null;
    }

    /* renamed from: linkWithCameraControl */
    public void m3190x5ddc0a78(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab c0116xda12e2ab) {
        synchronized (this.f277x6243b38) {
            this.f268x22a3ac18 = c0116xda12e2ab;
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0160xa6db3120.RedirectableLiveData<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0583xd94d3c5e> redirectableLiveData = this.f280x5f9220eb;
            if (redirectableLiveData != null) {
                redirectableLiveData.m3196x565e7b77(c0116xda12e2ab.m2983xdb27bcd4().m3662x61488dc8());
            }
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0160xa6db3120.RedirectableLiveData<java.lang.Integer> redirectableLiveData2 = this.f279xdc7d2f14;
            if (redirectableLiveData2 != null) {
                redirectableLiveData2.m3196x565e7b77(this.f268x22a3ac18.m2981x5b308837().m3639x56c2d5eb());
            }
            java.util.List<android.util.Pair<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6, java.util.concurrent.Executor>> list = this.f271xd57b1a3a;
            if (list != null) {
                for (android.util.Pair<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6, java.util.concurrent.Executor> pair : list) {
                    this.f268x22a3ac18.m2956x6001f411((java.util.concurrent.Executor) pair.second, (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6) pair.first);
                }
                this.f271xd57b1a3a = null;
            }
        }
        m3154x82ae1688();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93
    /* renamed from: querySupportedDynamicRanges */
    public java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> mo3191x9cf834cf(java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> set) {
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0705x4adcffd5.m5427xdb7243a(set, mo3174x41312cdd());
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570
    /* renamed from: removeSessionCaptureCallback */
    public void mo3192x2d0845d9(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6 abstractC0659xd0769ba6) {
        synchronized (this.f277x6243b38) {
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab c0116xda12e2ab = this.f268x22a3ac18;
            if (c0116xda12e2ab != null) {
                c0116xda12e2ab.m2991x94fe9174(abstractC0659xd0769ba6);
                return;
            }
            java.util.List<android.util.Pair<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6, java.util.concurrent.Executor>> list = this.f271xd57b1a3a;
            if (list == null) {
                return;
            }
            java.util.Iterator<android.util.Pair<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6, java.util.concurrent.Executor>> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().first == abstractC0659xd0769ba6) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: setCameraStateSource */
    public void m3193x2842765(p012xc85e97e9.p093xedfae76a.g0 g0Var) {
        this.f276xa2a14595.m3196x565e7b77(g0Var);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93
    /* renamed from: getSensorRotationDegrees */
    public int mo3172x3b4734f9() {
        return mo3173x3b4734f9(0);
    }
}
