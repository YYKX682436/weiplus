package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* renamed from: androidx.camera.core.UseCase */
/* loaded from: classes14.dex */
public abstract class AbstractC0580x5a5e3137 {

    /* renamed from: mAttachedStreamSpec */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b f1254xe9d0f36c;

    /* renamed from: mCamera */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 f1255xfde5e9f2;

    /* renamed from: mCameraConfig */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> f1256x445b9bd4;

    /* renamed from: mCurrentConfig */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> f1258xc52e76ae;

    /* renamed from: mEffect */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0468xb9790d36 f1259x192e05e;

    /* renamed from: mExtendedConfig */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> f1260x2c0c57a8;

    /* renamed from: mPhysicalCameraId */
    private java.lang.String f1261x11acdfa4;

    /* renamed from: mSecondaryCamera */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 f1262x2c4b698c;

    /* renamed from: mUseCaseConfig */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> f1266xaebf740c;

    /* renamed from: mViewPortCropRect */
    private android.graphics.Rect f1267x664f3607;

    /* renamed from: mStateChangeCallbacks */
    private final java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137.StateChangeCallback> f1265x2551f63a = new java.util.HashSet();

    /* renamed from: mCameraLock */
    private final java.lang.Object f1257x643fda3d = new java.lang.Object();

    /* renamed from: mState */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137.State f1264xbec81024 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137.State.INACTIVE;

    /* renamed from: mSensorToBufferTransformMatrix */
    private android.graphics.Matrix f1263x9449ebab = new android.graphics.Matrix();

    /* renamed from: mAttachedSessionConfig */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 f1253xaa4eebc7 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.m5587xcb957d4c();

    /* renamed from: mAttachedSecondarySessionConfig */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 f1252xcd34af5 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.m5587xcb957d4c();

    /* renamed from: androidx.camera.core.UseCase$State */
    /* loaded from: classes6.dex */
    public enum State {
        ACTIVE,
        INACTIVE
    }

    /* renamed from: androidx.camera.core.UseCase$StateChangeCallback */
    /* loaded from: classes14.dex */
    public interface StateChangeCallback {
        /* renamed from: onUseCaseActive */
        void mo3097x82b04b9e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137);

        /* renamed from: onUseCaseInactive */
        void mo3098xfbf86303(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137);

        /* renamed from: onUseCaseReset */
        void mo3099xdbdd5db7(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137);

        /* renamed from: onUseCaseUpdated */
        void mo3100xa9fa723(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137);
    }

    public AbstractC0580x5a5e3137(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b59) {
        this.f1266xaebf740c = interfaceC0768x83509b59;
        this.f1258xc52e76ae = interfaceC0768x83509b59;
    }

    /* renamed from: addStateChangeCallback */
    private void m4803x2ffc8a5(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137.StateChangeCallback stateChangeCallback) {
        this.f1265x2551f63a.add(stateChangeCallback);
    }

    /* renamed from: removeStateChangeCallback */
    private void m4804x9f0ffe2(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137.StateChangeCallback stateChangeCallback) {
        this.f1265x2551f63a.remove(stateChangeCallback);
    }

    /* renamed from: snapToSurfaceRotation */
    public static int m4805x6ac184a6(int i17) {
        m3.h.c(i17, 0, 359, "orientation");
        if (i17 >= 315 || i17 < 45) {
            return 0;
        }
        if (i17 >= 225) {
            return 1;
        }
        return i17 >= 135 ? 2 : 3;
    }

    /* renamed from: bindToCamera */
    public final void m4806x63adb0dd(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc5222, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b59, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b592) {
        synchronized (this.f1257x643fda3d) {
            this.f1255xfde5e9f2 = interfaceC0677x9e0bc522;
            this.f1262x2c4b698c = interfaceC0677x9e0bc5222;
            m4803x2ffc8a5(interfaceC0677x9e0bc522);
            if (interfaceC0677x9e0bc5222 != null) {
                m4803x2ffc8a5(interfaceC0677x9e0bc5222);
            }
        }
        this.f1260x2c0c57a8 = interfaceC0768x83509b59;
        this.f1256x445b9bd4 = interfaceC0768x83509b592;
        this.f1258xc52e76ae = m4833xcdb2a19(interfaceC0677x9e0bc522.mo3091xbefeb46(), this.f1260x2c0c57a8, this.f1256x445b9bd4);
        mo4429xc3979ebc();
    }

    /* renamed from: getAppConfig */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> m4807x3d3d7e0d() {
        return this.f1266xaebf740c;
    }

    /* renamed from: getAppTargetRotation */
    public int m4808x465bc3fa() {
        return ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e) this.f1258xc52e76ae).m5479x465bc3fa(-1);
    }

    /* renamed from: getAttachedStreamSpec */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b m4809xfdddfa15() {
        return this.f1254xe9d0f36c;
    }

    /* renamed from: getAttachedSurfaceResolution */
    public android.util.Size m4810x59ee93f() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b = this.f1254xe9d0f36c;
        if (abstractC0756x2f9ad77b != null) {
            return abstractC0756x2f9ad77b.mo5191x8ee230a2();
        }
        return null;
    }

    /* renamed from: getCamera */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 m4811x1390e61b() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522;
        synchronized (this.f1257x643fda3d) {
            interfaceC0677x9e0bc522 = this.f1255xfde5e9f2;
        }
        return interfaceC0677x9e0bc522;
    }

    /* renamed from: getCameraControl */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0669xec29d935 m4812xa97012c2() {
        synchronized (this.f1257x643fda3d) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522 = this.f1255xfde5e9f2;
            if (interfaceC0677x9e0bc522 == null) {
                return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0669xec29d935.f1556x65d31145;
            }
            return interfaceC0677x9e0bc522.mo3090x8af45b9f();
        }
    }

    /* renamed from: getCameraId */
    public java.lang.String m4813x72efd496() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 m4811x1390e61b = m4811x1390e61b();
        m3.h.d(m4811x1390e61b, "No camera attached to use case: " + this);
        return m4811x1390e61b.mo3091xbefeb46().mo3161x72efd496();
    }

    /* renamed from: getCurrentConfig */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> m4814x27802a65() {
        return this.f1258xc52e76ae;
    }

    /* renamed from: getDefaultConfig */
    public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> mo4420xdbd48d2d(boolean z17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771 interfaceC0769xb8476771);

    /* renamed from: getEffect */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0468xb9790d36 m4815x173ddc87() {
        return this.f1259x192e05e;
    }

    /* renamed from: getImageFormat */
    public int m4816x450a23fc() {
        return this.f1258xc52e76ae.mo5446xb124032b();
    }

    /* renamed from: getMirrorModeInternal */
    public int m4817x68758cd5() {
        return ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e) this.f1258xc52e76ae).m5486x5638d9f8(-1);
    }

    /* renamed from: getName */
    public java.lang.String m4818xfb82e301() {
        java.lang.String m6139xb3ee7b2 = this.f1258xc52e76ae.m6139xb3ee7b2("<UnknownUseCase-" + hashCode() + ">");
        java.util.Objects.requireNonNull(m6139xb3ee7b2);
        return m6139xb3ee7b2;
    }

    /* renamed from: getPhysicalCameraId */
    public java.lang.String m4819x936d7c8d() {
        return this.f1261x11acdfa4;
    }

    /* renamed from: getRelativeRotation */
    public int m4820xe02e49e0(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522) {
        return m4821xe02e49e0(interfaceC0677x9e0bc522, false);
    }

    /* renamed from: getResolutionInfoInternal */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0558xd106e79a mo4534xbcbaa34d() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 m4811x1390e61b = m4811x1390e61b();
        android.util.Size m4810x59ee93f = m4810x59ee93f();
        if (m4811x1390e61b == null || m4810x59ee93f == null) {
            return null;
        }
        android.graphics.Rect m4829xe80fd2f0 = m4829xe80fd2f0();
        if (m4829xe80fd2f0 == null) {
            m4829xe80fd2f0 = new android.graphics.Rect(0, 0, m4810x59ee93f.getWidth(), m4810x59ee93f.getHeight());
        }
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0558xd106e79a(m4810x59ee93f, m4829xe80fd2f0, m4820xe02e49e0(m4811x1390e61b));
    }

    /* renamed from: getSecondaryCamera */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 m4822x40ff0b83() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522;
        synchronized (this.f1257x643fda3d) {
            interfaceC0677x9e0bc522 = this.f1262x2c4b698c;
        }
        return interfaceC0677x9e0bc522;
    }

    /* renamed from: getSecondaryCameraId */
    public java.lang.String m4823xfd6a3ffe() {
        if (m4822x40ff0b83() == null) {
            return null;
        }
        return m4822x40ff0b83().mo3091xbefeb46().mo3161x72efd496();
    }

    /* renamed from: getSecondarySessionConfig */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 m4824xd31a5b5a() {
        return this.f1252xcd34af5;
    }

    /* renamed from: getSensorToBufferTransformMatrix */
    public android.graphics.Matrix m4825xa4435162() {
        return this.f1263x9449ebab;
    }

    /* renamed from: getSessionConfig */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 m4826x9951e5c2() {
        return this.f1253xaa4eebc7;
    }

    /* renamed from: getSupportedEffectTargets */
    public java.util.Set<java.lang.Integer> mo4537x748d4719() {
        return java.util.Collections.emptySet();
    }

    /* renamed from: getTargetFrameRateInternal */
    public android.util.Range<java.lang.Integer> m4827x760e4403() {
        return this.f1258xc52e76ae.m5754x871a9f26(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b.f1796xf5f0b888);
    }

    /* renamed from: getTargetRotationInternal */
    public int m4828x68e8c702() {
        return ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e) this.f1258xc52e76ae).m5495x8d4b9125(0);
    }

    /* renamed from: getUseCaseConfigBuilder */
    public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder<?, ?, ?> mo4427xa926ae58(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62);

    /* renamed from: getViewPortCropRect */
    public android.graphics.Rect m4829xe80fd2f0() {
        return this.f1267x664f3607;
    }

    /* renamed from: isCurrentCamera */
    public boolean m4830xea9a04f4(java.lang.String str) {
        if (m4811x1390e61b() == null) {
            return false;
        }
        return java.util.Objects.equals(str, m4813x72efd496());
    }

    /* renamed from: isEffectTargetsSupported */
    public boolean m4831x47740f47(int i17) {
        java.util.Iterator<java.lang.Integer> it = mo4537x748d4719().iterator();
        while (it.hasNext()) {
            if (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0927xe69ca980.m6386x6cfb7e51(i17, it.next().intValue())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: isMirroringRequired */
    public boolean m4832x7e0b2878(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522) {
        int m4817x68758cd5 = m4817x68758cd5();
        if (m4817x68758cd5 == -1 || m4817x68758cd5 == 0) {
            return false;
        }
        if (m4817x68758cd5 == 1) {
            return true;
        }
        if (m4817x68758cd5 == 2) {
            return interfaceC0677x9e0bc522.m5290x298133d9();
        }
        throw new java.lang.AssertionError("Unknown mirrorMode: " + m4817x68758cd5);
    }

    /* renamed from: mergeConfigs */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> m4833xcdb2a19(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570 interfaceC0675x66574570, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b59, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b592) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a m5524xaf65a0fc;
        if (interfaceC0768x83509b592 != null) {
            m5524xaf65a0fc = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a.m5525x3017aa((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62) interfaceC0768x83509b592);
            m5524xaf65a0fc.mo5522xc616fa19(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0840xcdfd0453.f2095xc1a56baf);
        } else {
            m5524xaf65a0fc = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a.m5524xaf65a0fc();
        }
        if (this.f1266xaebf740c.mo5374xdccd9774(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1696x64f6b668) || this.f1266xaebf740c.mo5374xdccd9774(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1697xbf0df2d0)) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb> option = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1694xa42c6f48;
            if (m5524xaf65a0fc.mo5374xdccd9774(option)) {
                m5524xaf65a0fc.mo5522xc616fa19(option);
            }
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b593 = this.f1266xaebf740c;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb> option2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1694xa42c6f48;
        if (interfaceC0768x83509b593.mo5374xdccd9774(option2)) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<android.util.Size> option3 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1692xe906b791;
            if (m5524xaf65a0fc.mo5374xdccd9774(option3) && ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb) this.f1266xaebf740c.mo5379x77ba97d1(option2)).m6499xa36a7635() != null) {
                m5524xaf65a0fc.mo5522xc616fa19(option3);
            }
        }
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<?>> it = this.f1266xaebf740c.mo5378xc8202020().iterator();
        while (it.hasNext()) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.m5373x60c2caa4(m5524xaf65a0fc, m5524xaf65a0fc, this.f1266xaebf740c, it.next());
        }
        if (interfaceC0768x83509b59 != null) {
            for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<?> option4 : interfaceC0768x83509b59.mo5378xc8202020()) {
                if (!option4.mo5110x5db1b11().equals(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0840xcdfd0453.f2095xc1a56baf.mo5110x5db1b11())) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.m5373x60c2caa4(m5524xaf65a0fc, m5524xaf65a0fc, interfaceC0768x83509b59, option4);
                }
            }
        }
        if (m5524xaf65a0fc.mo5374xdccd9774(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1697xbf0df2d0)) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Integer> option5 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1696x64f6b668;
            if (m5524xaf65a0fc.mo5374xdccd9774(option5)) {
                m5524xaf65a0fc.mo5522xc616fa19(option5);
            }
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb> option6 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1694xa42c6f48;
        if (m5524xaf65a0fc.mo5374xdccd9774(option6) && ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb) m5524xaf65a0fc.mo5379x77ba97d1(option6)).m6496xf14a8a81() != 0) {
            m5524xaf65a0fc.mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1838x83019c92, java.lang.Boolean.TRUE);
        }
        return mo4430xc74923b(interfaceC0675x66574570, mo4427xa926ae58(m5524xaf65a0fc));
    }

    /* renamed from: notifyActive */
    public final void m4834x37f5a7af() {
        this.f1264xbec81024 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137.State.ACTIVE;
        m4837x977862c8();
    }

    /* renamed from: notifyInactive */
    public final void m4835x7556fed4() {
        this.f1264xbec81024 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137.State.INACTIVE;
        m4837x977862c8();
    }

    /* renamed from: notifyReset */
    public final void m4836x9763bb86() {
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137.StateChangeCallback> it = this.f1265x2551f63a.iterator();
        while (it.hasNext()) {
            it.next().mo3099xdbdd5db7(this);
        }
    }

    /* renamed from: notifyState */
    public final void m4837x977862c8() {
        int ordinal = this.f1264xbec81024.ordinal();
        if (ordinal == 0) {
            java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137.StateChangeCallback> it = this.f1265x2551f63a.iterator();
            while (it.hasNext()) {
                it.next().mo3097x82b04b9e(this);
            }
        } else {
            if (ordinal != 1) {
                return;
            }
            java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137.StateChangeCallback> it6 = this.f1265x2551f63a.iterator();
            while (it6.hasNext()) {
                it6.next().mo3098xfbf86303(this);
            }
        }
    }

    /* renamed from: notifyUpdated */
    public final void m4838xfe05cd32() {
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137.StateChangeCallback> it = this.f1265x2551f63a.iterator();
        while (it.hasNext()) {
            it.next().mo3100xa9fa723(this);
        }
    }

    /* renamed from: onBind */
    public void mo4429xc3979ebc() {
    }

    /* renamed from: onCameraControlReady */
    public void mo4543xec538e4a() {
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    /* renamed from: onMergeConfig */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> mo4430xc74923b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570 interfaceC0675x66574570, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder<?, ?, ?> builder) {
        return builder.mo4446x111127c3();
    }

    /* renamed from: onStateAttached */
    public void mo4839x934f69b6() {
    }

    /* renamed from: onStateDetached */
    public void mo4544xb1757784() {
    }

    /* renamed from: onSuggestedStreamSpecImplementationOptionsUpdated */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b mo4431x6f6af6ae(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b = this.f1254xe9d0f36c;
        if (abstractC0756x2f9ad77b != null) {
            return abstractC0756x2f9ad77b.mo5194xaaa148a0().mo5199x9a12cb4a(interfaceC0692x78a46f62).mo5196x59bc66e();
        }
        throw new java.lang.UnsupportedOperationException("Attempt to update the implementation options for a use case without attached stream specifications.");
    }

    /* renamed from: onSuggestedStreamSpecUpdated */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b mo4432x35ddf13c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b2) {
        return abstractC0756x2f9ad77b;
    }

    /* renamed from: onUnbind */
    public void mo4433x5cd81515() {
    }

    /* renamed from: setEffect */
    public void m4840xa731093(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0468xb9790d36 abstractC0468xb9790d36) {
        m3.h.a(abstractC0468xb9790d36 == null || m4831x47740f47(abstractC0468xb9790d36.m4264xe21cfccc()));
        this.f1259x192e05e = abstractC0468xb9790d36;
    }

    /* renamed from: setPhysicalCameraId */
    public void m4841x376a1199(java.lang.String str) {
        this.f1261x11acdfa4 = str;
    }

    /* renamed from: setSensorToBufferTransformMatrix */
    public void mo4435x6864fd6(android.graphics.Matrix matrix) {
        this.f1263x9449ebab = new android.graphics.Matrix(matrix);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    /* renamed from: setTargetRotationInternal */
    public boolean m4842x9b2c630e(int i17) {
        int m5495x8d4b9125 = ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e) m4814x27802a65()).m5495x8d4b9125(-1);
        if (m5495x8d4b9125 != -1 && m5495x8d4b9125 == i17) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder<?, ?, ?> mo4427xa926ae58 = mo4427xa926ae58(this.f1266xaebf740c);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0872xe899aafb.m6243x54571205(mo4427xa926ae58, i17);
        this.f1266xaebf740c = mo4427xa926ae58.mo4446x111127c3();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 m4811x1390e61b = m4811x1390e61b();
        if (m4811x1390e61b == null) {
            this.f1258xc52e76ae = this.f1266xaebf740c;
            return true;
        }
        this.f1258xc52e76ae = m4833xcdb2a19(m4811x1390e61b.mo3091xbefeb46(), this.f1260x2c0c57a8, this.f1256x445b9bd4);
        return true;
    }

    /* renamed from: setViewPortCropRect */
    public void mo4437x8c0c67fc(android.graphics.Rect rect) {
        this.f1267x664f3607 = rect;
    }

    /* renamed from: unbindFromCamera */
    public final void m4843x51588665(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522) {
        mo4433x5cd81515();
        synchronized (this.f1257x643fda3d) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc5222 = this.f1255xfde5e9f2;
            if (interfaceC0677x9e0bc522 == interfaceC0677x9e0bc5222) {
                m4804x9f0ffe2(interfaceC0677x9e0bc5222);
                this.f1255xfde5e9f2 = null;
            }
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc5223 = this.f1262x2c4b698c;
            if (interfaceC0677x9e0bc522 == interfaceC0677x9e0bc5223) {
                m4804x9f0ffe2(interfaceC0677x9e0bc5223);
                this.f1262x2c4b698c = null;
            }
        }
        this.f1254xe9d0f36c = null;
        this.f1267x664f3607 = null;
        this.f1258xc52e76ae = this.f1266xaebf740c;
        this.f1260x2c0c57a8 = null;
        this.f1256x445b9bd4 = null;
    }

    /* renamed from: updateSessionConfig */
    public void m4844xd8cf6f2f(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958> list) {
        if (list.isEmpty()) {
            return;
        }
        this.f1253xaa4eebc7 = list.get(0);
        if (list.size() > 1) {
            this.f1252xcd34af5 = list.get(1);
        }
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958> it = list.iterator();
        while (it.hasNext()) {
            for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 abstractC0697x654a0293 : it.next().m5601x1b8de6dc()) {
                if (abstractC0697x654a0293.m5404x2009e26d() == null) {
                    abstractC0697x654a0293.m5412xe8004a79(getClass());
                }
            }
        }
    }

    /* renamed from: updateSuggestedStreamSpec */
    public void m4845xd1811355(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b2) {
        this.f1254xe9d0f36c = mo4432x35ddf13c(abstractC0756x2f9ad77b, abstractC0756x2f9ad77b2);
    }

    /* renamed from: updateSuggestedStreamSpecImplementationOptions */
    public void m4846x9b955a37(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62) {
        this.f1254xe9d0f36c = mo4431x6f6af6ae(interfaceC0692x78a46f62);
    }

    /* renamed from: getRelativeRotation */
    public int m4821xe02e49e0(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522, boolean z17) {
        int mo3173x3b4734f9 = interfaceC0677x9e0bc522.mo3091xbefeb46().mo3173x3b4734f9(m4828x68e8c702());
        return !interfaceC0677x9e0bc522.mo5289x5ef3d868() && z17 ? p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0801x6002c4c5.m5974x36f045e2(-mo3173x3b4734f9) : mo3173x3b4734f9;
    }
}
