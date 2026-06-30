package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* renamed from: androidx.camera.core.CameraXConfig */
/* loaded from: classes14.dex */
public final class C0484x278856d5 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0840xcdfd0453<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0478x83f739b3> {

    /* renamed from: DEFAULT_OPTION_CAMERA_OPEN_RETRY_MAX_TIMEOUT_IN_MILLIS_WHILE_RESUMING */
    static final long f913x3a2e682e = -1;

    /* renamed from: mConfig */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0735xc905e4a0 f924xfeabaa0f;

    /* renamed from: OPTION_CAMERA_FACTORY_PROVIDER */
    static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0671xa1e35205.Provider> f916x32f53db6 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.appConfig.cameraFactoryProvider", p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0671xa1e35205.Provider.class);

    /* renamed from: OPTION_DEVICE_SURFACE_MANAGER_PROVIDER */
    static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0670x512d391b.Provider> f919x2f2f79d4 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.appConfig.deviceSurfaceManagerProvider", p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0670x512d391b.Provider.class);

    /* renamed from: OPTION_USECASE_CONFIG_FACTORY_PROVIDER */
    static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.Provider> f923xdb32611 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.appConfig.useCaseConfigFactoryProvider", p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.Provider.class);

    /* renamed from: OPTION_CAMERA_EXECUTOR */
    static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.util.concurrent.Executor> f915x1f68e4e3 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.appConfig.cameraExecutor", java.util.concurrent.Executor.class);

    /* renamed from: OPTION_SCHEDULER_HANDLER */
    static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<android.os.Handler> f922x7041a23c = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.appConfig.schedulerHandler", android.os.Handler.class);

    /* renamed from: OPTION_MIN_LOGGING_LEVEL */
    static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Integer> f920x93a01cd = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.appConfig.minimumLoggingLevel", java.lang.Integer.TYPE);

    /* renamed from: OPTION_AVAILABLE_CAMERAS_LIMITER */
    static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244> f914xe108337 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.appConfig.availableCamerasLimiter", p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244.class);

    /* renamed from: OPTION_CAMERA_OPEN_RETRY_MAX_TIMEOUT_IN_MILLIS_WHILE_RESUMING */
    static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Long> f917xa6430dcc = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", java.lang.Long.TYPE);

    /* renamed from: OPTION_CAMERA_PROVIDER_INIT_RETRY_POLICY */
    static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda> f918xd99d86da = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.appConfig.cameraProviderInitRetryPolicy", p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.class);

    /* renamed from: OPTION_QUIRK_SETTINGS */
    static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0741x281ed9e1> f921x6d3b38ae = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.appConfig.quirksSettings", p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0741x281ed9e1.class);

    /* renamed from: androidx.camera.core.CameraXConfig$Builder */
    /* loaded from: classes14.dex */
    public static final class Builder implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0840xcdfd0453.Builder<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0478x83f739b3, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0484x278856d5.Builder> {

        /* renamed from: mMutableConfig */
        private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a f925x61287a9b;

        public Builder() {
            this(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a.m5524xaf65a0fc());
        }

        /* renamed from: fromConfig */
        public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0484x278856d5.Builder m4342x650a9f8c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0484x278856d5 c0484x278856d5) {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0484x278856d5.Builder(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a.m5525x3017aa((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62) c0484x278856d5));
        }

        /* renamed from: getMutableConfig */
        private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0730x35b9a1e8 m4343xc37a2e52() {
            return this.f925x61287a9b;
        }

        /* renamed from: build */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0484x278856d5 m4344x59bc66e() {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0484x278856d5(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0735xc905e4a0.m5538x3017aa(this.f925x61287a9b));
        }

        /* renamed from: setAvailableCamerasLimiter */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0484x278856d5.Builder m4345x194f7441(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244 c0475xc311f244) {
            m4343xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0484x278856d5.f914xe108337, c0475xc311f244);
            return this;
        }

        /* renamed from: setCameraExecutor */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0484x278856d5.Builder m4346xe819601a(java.util.concurrent.Executor executor) {
            m4343xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0484x278856d5.f915x1f68e4e3, executor);
            return this;
        }

        /* renamed from: setCameraFactoryProvider */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0484x278856d5.Builder m4347x17a31bf4(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0671xa1e35205.Provider provider) {
            m4343xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0484x278856d5.f916x32f53db6, provider);
            return this;
        }

        /* renamed from: setCameraOpenRetryMaxTimeoutInMillisWhileResuming */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0484x278856d5.Builder m4348xed96277c(long j17) {
            m4343xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0484x278856d5.f917xa6430dcc, java.lang.Long.valueOf(j17));
            return this;
        }

        /* renamed from: setCameraProviderInitRetryPolicy */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0484x278856d5.Builder m4349x134bc272(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda interfaceC0559x1327bdda) {
            m4343xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0484x278856d5.f918xd99d86da, interfaceC0559x1327bdda);
            return this;
        }

        /* renamed from: setDeviceSurfaceManagerProvider */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0484x278856d5.Builder m4350xff64c7c9(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0670x512d391b.Provider provider) {
            m4343xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0484x278856d5.f919x2f2f79d4, provider);
            return this;
        }

        /* renamed from: setMinimumLoggingLevel */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0484x278856d5.Builder m4351xe3a0fed1(int i17) {
            m4343xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0484x278856d5.f920x93a01cd, java.lang.Integer.valueOf(i17));
            return this;
        }

        /* renamed from: setQuirkSettings */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0484x278856d5.Builder m4352x48b5ccbf(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0741x281ed9e1 c0741x281ed9e1) {
            m4343xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0484x278856d5.f921x6d3b38ae, c0741x281ed9e1);
            return this;
        }

        /* renamed from: setSchedulerHandler */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0484x278856d5.Builder m4353xa6b0f291(android.os.Handler handler) {
            m4343xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0484x278856d5.f922x7041a23c, handler);
            return this;
        }

        /* renamed from: setUseCaseConfigFactoryProvider */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0484x278856d5.Builder m4356xa60905e4(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.Provider provider) {
            m4343xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0484x278856d5.f923xdb32611, provider);
            return this;
        }

        private Builder(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a c0731x74f1ef5a) {
            this.f925x61287a9b = c0731x74f1ef5a;
            java.lang.Class cls = (java.lang.Class) c0731x74f1ef5a.mo5380x77ba97d1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0840xcdfd0453.f2094x7271dcb4, null);
            if (cls != null && !cls.equals(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0478x83f739b3.class)) {
                throw new java.lang.IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            mo4354xf26d54a5(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0478x83f739b3.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0840xcdfd0453.Builder
        /* renamed from: setTargetClass */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0484x278856d5.Builder mo4354xf26d54a5(java.lang.Class<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0478x83f739b3> cls) {
            m4343xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0840xcdfd0453.f2094x7271dcb4, cls);
            if (m4343xc37a2e52().mo5380x77ba97d1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0840xcdfd0453.f2095xc1a56baf, null) == null) {
                mo4355x396335be(cls.getCanonicalName() + "-" + java.util.UUID.randomUUID());
            }
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0840xcdfd0453.Builder
        /* renamed from: setTargetName */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0484x278856d5.Builder mo4355x396335be(java.lang.String str) {
            m4343xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0840xcdfd0453.f2095xc1a56baf, str);
            return this;
        }
    }

    /* renamed from: androidx.camera.core.CameraXConfig$Provider */
    /* loaded from: classes14.dex */
    public interface Provider {
        /* renamed from: getCameraXConfig */
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0484x278856d5 mo2877xb548e33f();
    }

    public C0484x278856d5(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0735xc905e4a0 c0735xc905e4a0) {
        this.f924xfeabaa0f = c0735xc905e4a0;
    }

    /* renamed from: getAvailableCamerasLimiter */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244 m4332x31f8ecd(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244 c0475xc311f244) {
        return (p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244) this.f924xfeabaa0f.mo5380x77ba97d1(f914xe108337, c0475xc311f244);
    }

    /* renamed from: getCameraExecutor */
    public java.util.concurrent.Executor m4333x2022f80e(java.util.concurrent.Executor executor) {
        return (java.util.concurrent.Executor) this.f924xfeabaa0f.mo5380x77ba97d1(f915x1f68e4e3, executor);
    }

    /* renamed from: getCameraFactoryProvider */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0671xa1e35205.Provider m4334x47906980(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0671xa1e35205.Provider provider) {
        return (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0671xa1e35205.Provider) this.f924xfeabaa0f.mo5380x77ba97d1(f916x32f53db6, provider);
    }

    /* renamed from: getCameraOpenRetryMaxTimeoutInMillisWhileResuming */
    public long m4335xf322ef70() {
        return ((java.lang.Long) this.f924xfeabaa0f.mo5380x77ba97d1(f917xa6430dcc, -1L)).longValue();
    }

    /* renamed from: getCameraProviderInitRetryPolicy */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda m4336xb108c3fe() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda interfaceC0559x1327bdda = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda) this.f924xfeabaa0f.mo5380x77ba97d1(f918xd99d86da, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.f1182x86df6221);
        java.util.Objects.requireNonNull(interfaceC0559x1327bdda);
        return interfaceC0559x1327bdda;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0745x2e0bb72
    /* renamed from: getConfig */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 mo3494x1456a638() {
        return this.f924xfeabaa0f;
    }

    /* renamed from: getDeviceSurfaceManagerProvider */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0670x512d391b.Provider m4337x47b64bd(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0670x512d391b.Provider provider) {
        return (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0670x512d391b.Provider) this.f924xfeabaa0f.mo5380x77ba97d1(f919x2f2f79d4, provider);
    }

    /* renamed from: getMinimumLoggingLevel */
    public int m4338x955c3f5d() {
        return ((java.lang.Integer) this.f924xfeabaa0f.mo5380x77ba97d1(f920x93a01cd, 3)).intValue();
    }

    /* renamed from: getQuirkSettings */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0741x281ed9e1 m4339xb5df664b() {
        return (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0741x281ed9e1) this.f924xfeabaa0f.mo5380x77ba97d1(f921x6d3b38ae, null);
    }

    /* renamed from: getSchedulerHandler */
    public android.os.Handler m4340x2b45d85(android.os.Handler handler) {
        return (android.os.Handler) this.f924xfeabaa0f.mo5380x77ba97d1(f922x7041a23c, handler);
    }

    /* renamed from: getUseCaseConfigFactoryProvider */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.Provider m4341xab1fa2d8(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.Provider provider) {
        return (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.Provider) this.f924xfeabaa0f.mo5380x77ba97d1(f923xdb32611, provider);
    }
}
