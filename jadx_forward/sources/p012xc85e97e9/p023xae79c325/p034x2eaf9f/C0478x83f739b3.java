package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* renamed from: androidx.camera.core.CameraX */
/* loaded from: classes14.dex */
public final class C0478x83f739b3 {

    /* renamed from: RETRY_TOKEN */
    private static final java.lang.String f891x808d4962 = "retry_token";
    private static final java.lang.String TAG = "CameraX";

    /* renamed from: mCameraExecutor */
    private final java.util.concurrent.Executor f893x383e34e5;

    /* renamed from: mCameraFactory */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0671xa1e35205 f894xcd522ab8;

    /* renamed from: mCameraRepository */
    final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0681x1d4cd46f f895x75a05adc;

    /* renamed from: mCameraXConfig */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0484x278856d5 f896x52f72f88;

    /* renamed from: mDefaultConfigFactory */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771 f897x13357eb4;

    /* renamed from: mInitInternalFuture */
    private final wa.a f898x4d50ef5d;

    /* renamed from: mInitState */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0478x83f739b3.InternalInitState f899x6ab26374;

    /* renamed from: mInitializeLock */
    private final java.lang.Object f900x81d2c6a8;

    /* renamed from: mMinLogLevel */
    private final java.lang.Integer f901x71c31c65;

    /* renamed from: mRetryPolicy */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda f902x59cb274d;

    /* renamed from: mSchedulerHandler */
    private final android.os.Handler f903x80f3c09c;

    /* renamed from: mSchedulerThread */
    private final android.os.HandlerThread f904xefbd3278;

    /* renamed from: mShutdownInternalFuture */
    private wa.a f905x63706fa3;

    /* renamed from: mSurfaceManager */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0670x512d391b f906xb694980d;

    /* renamed from: MIN_LOG_LEVEL_LOCK */
    private static final java.lang.Object f890x699abace = new java.lang.Object();

    /* renamed from: sMinLogLevelReferenceCountMap */
    private static final android.util.SparseArray<java.lang.Integer> f892x44706b59 = new android.util.SparseArray<>();

    /* renamed from: androidx.camera.core.CameraX$InternalInitState */
    /* loaded from: classes14.dex */
    public enum InternalInitState {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZING_ERROR,
        INITIALIZED,
        SHUTDOWN
    }

    public C0478x83f739b3(android.content.Context context, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0484x278856d5.Provider provider) {
        this(context, provider, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0743x482c4954());
    }

    /* renamed from: decreaseMinLogLevelReference */
    private static void m4305x5926ea17(java.lang.Integer num) {
        synchronized (f890x699abace) {
            if (num == null) {
                return;
            }
            android.util.SparseArray<java.lang.Integer> sparseArray = f892x44706b59;
            int intValue = sparseArray.get(num.intValue()).intValue() - 1;
            if (intValue == 0) {
                sparseArray.remove(num.intValue());
            } else {
                sparseArray.put(num.intValue(), java.lang.Integer.valueOf(intValue));
            }
            m4318x8f0e5eef();
        }
    }

    /* renamed from: getConfigProvider */
    private static p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0484x278856d5.Provider m4306xf6475849(android.content.Context context) {
        android.content.ComponentCallbacks2 m5817xfe224a2b = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0784x5d48d231.m5817xfe224a2b(context);
        if (m5817xfe224a2b instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0484x278856d5.Provider) {
            return (p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0484x278856d5.Provider) m5817xfe224a2b;
        }
        try {
            android.content.Context m5816x6e669035 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0784x5d48d231.m5816x6e669035(context);
            android.os.Bundle bundle = m5816x6e669035.getPackageManager().getServiceInfo(new android.content.ComponentName(m5816x6e669035, (java.lang.Class<?>) p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.ServiceC0728x633a005a.class), 640).metaData;
            java.lang.String string = bundle != null ? bundle.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
            if (string != null) {
                return (p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0484x278856d5.Provider) java.lang.Class.forName(string).getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            }
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            return null;
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchMethodException | java.lang.NullPointerException | java.lang.reflect.InvocationTargetException e17) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Failed to retrieve default CameraXConfig.Provider from meta-data", e17);
            return null;
        }
    }

    /* renamed from: increaseMinLogLevelReference */
    private static void m4307x1115a5bb(java.lang.Integer num) {
        synchronized (f890x699abace) {
            if (num == null) {
                return;
            }
            m3.h.c(num.intValue(), 3, 6, "minLogLevel");
            android.util.SparseArray<java.lang.Integer> sparseArray = f892x44706b59;
            sparseArray.put(num.intValue(), java.lang.Integer.valueOf(sparseArray.get(num.intValue()) != null ? 1 + sparseArray.get(num.intValue()).intValue() : 1));
            m4318x8f0e5eef();
        }
    }

    /* renamed from: initAndRetryRecursively */
    private void m4308xaea3d23e(final java.util.concurrent.Executor executor, final long j17, final int i17, final android.content.Context context, final t2.k kVar) {
        executor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.CameraX$$a
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0478x83f739b3.this.m4311x1b8f88af(context, executor, i17, kVar, j17);
            }
        });
    }

    /* renamed from: initInternal */
    private wa.a m4309xa91d7fed(final android.content.Context context) {
        wa.a a17;
        synchronized (this.f900x81d2c6a8) {
            m3.h.e(this.f899x6ab26374 == p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0478x83f739b3.InternalInitState.UNINITIALIZED, "CameraX.initInternal() should only be called once per instance");
            this.f899x6ab26374 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0478x83f739b3.InternalInitState.INITIALIZING;
            a17 = t2.p.a(new t2.m() { // from class: androidx.camera.core.CameraX$$e
                @Override // t2.m
                /* renamed from: attachCompleter */
                public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                    java.lang.Object m4312x5b75f3b6;
                    m4312x5b75f3b6 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0478x83f739b3.this.m4312x5b75f3b6(context, kVar);
                    return m4312x5b75f3b6;
                }
            });
        }
        return a17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$initAndRetryRecursively$1 */
    public /* synthetic */ void m4310x1b8f88ae(java.util.concurrent.Executor executor, long j17, int i17, android.content.Context context, t2.k kVar) {
        m4308xaea3d23e(executor, j17, i17 + 1, context, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: lambda$initAndRetryRecursively$2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m4311x1b8f88af(android.content.Context r19, final java.util.concurrent.Executor r20, final int r21, final t2.k r22, final long r23) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0478x83f739b3.m4311x1b8f88af(android.content.Context, java.util.concurrent.Executor, int, t2.k, long):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$initInternal$0 */
    public /* synthetic */ java.lang.Object m4312x5b75f3b6(android.content.Context context, t2.k kVar) {
        m4308xaea3d23e(this.f893x383e34e5, android.os.SystemClock.elapsedRealtime(), 1, context, kVar);
        return "CameraX initInternal";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$shutdownInternal$3 */
    public /* synthetic */ void m4313x2036aeff(t2.k kVar) {
        if (this.f904xefbd3278 != null) {
            java.util.concurrent.Executor executor = this.f893x383e34e5;
            if (executor instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.ExecutorC0469xf5d1f738) {
                ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.ExecutorC0469xf5d1f738) executor).m4269xb0654911();
            }
            this.f904xefbd3278.quit();
        }
        kVar.a(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$shutdownInternal$4 */
    public /* synthetic */ java.lang.Object m4314x2036af00(final t2.k kVar) {
        this.f895x75a05adc.m5300xb0654911().mo606x162a7075(new java.lang.Runnable() { // from class: androidx.camera.core.CameraX$$d
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0478x83f739b3.this.m4313x2036aeff(kVar);
            }
        }, this.f893x383e34e5);
        return "CameraX shutdownInternal";
    }

    /* renamed from: setStateToInitialized */
    private void m4315x1736f84a() {
        synchronized (this.f900x81d2c6a8) {
            this.f899x6ab26374 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0478x83f739b3.InternalInitState.INITIALIZED;
        }
    }

    /* renamed from: shutdownInternal */
    private wa.a m4316x1d597b33() {
        synchronized (this.f900x81d2c6a8) {
            this.f903x80f3c09c.removeCallbacksAndMessages(f891x808d4962);
            int ordinal = this.f899x6ab26374.ordinal();
            if (ordinal == 0) {
                this.f899x6ab26374 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0478x83f739b3.InternalInitState.SHUTDOWN;
                return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6013x95a8e8d4(null);
            }
            if (ordinal == 1) {
                throw new java.lang.IllegalStateException("CameraX could not be shutdown when it is initializing.");
            }
            if (ordinal == 2 || ordinal == 3) {
                this.f899x6ab26374 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0478x83f739b3.InternalInitState.SHUTDOWN;
                m4305x5926ea17(this.f901x71c31c65);
                this.f905x63706fa3 = t2.p.a(new t2.m() { // from class: androidx.camera.core.CameraX$$b
                    @Override // t2.m
                    /* renamed from: attachCompleter */
                    public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                        java.lang.Object m4314x2036af00;
                        m4314x2036af00 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0478x83f739b3.this.m4314x2036af00(kVar);
                        return m4314x2036af00;
                    }
                });
            }
            return this.f905x63706fa3;
        }
    }

    /* renamed from: traceExecutionState */
    private void m4317x657a98fe(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.ExecutionState executionState) {
        if (t4.a.d()) {
            t4.a.e("CX:CameraProvider-RetryStatus", executionState != null ? executionState.mo4749x2fe4f2e8() : -1);
        }
    }

    /* renamed from: updateOrResetMinLogLevel */
    private static void m4318x8f0e5eef() {
        android.util.SparseArray<java.lang.Integer> sparseArray = f892x44706b59;
        if (sparseArray.size() == 0) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.m4678x1e777e43();
            return;
        }
        if (sparseArray.get(3) != null) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.m4679x37f1c550(3);
            return;
        }
        if (sparseArray.get(4) != null) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.m4679x37f1c550(4);
        } else if (sparseArray.get(5) != null) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.m4679x37f1c550(5);
        } else if (sparseArray.get(6) != null) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.m4679x37f1c550(6);
        }
    }

    /* renamed from: updateQuirkSettings */
    private static void m4319xf55cefb8(android.content.Context context, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0741x281ed9e1 c0741x281ed9e1, r.a aVar) {
        if (c0741x281ed9e1 != null) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "QuirkSettings from CameraXConfig: " + c0741x281ed9e1);
        } else {
            c0741x281ed9e1 = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0741x281ed9e1) aVar.mo1850x58b836e(context);
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "QuirkSettings from app metadata: " + c0741x281ed9e1);
        }
        if (c0741x281ed9e1 == null) {
            c0741x281ed9e1 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0742x415de6ed.f1721x86df6221;
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "QuirkSettings by default: " + c0741x281ed9e1);
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0742x415de6ed.m5558x21169495().set(c0741x281ed9e1);
    }

    /* renamed from: getCameraDeviceSurfaceManager */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0670x512d391b m4320xeb85a8f1() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0670x512d391b interfaceC0670x512d391b = this.f906xb694980d;
        if (interfaceC0670x512d391b != null) {
            return interfaceC0670x512d391b;
        }
        throw new java.lang.IllegalStateException("CameraX not initialized yet.");
    }

    /* renamed from: getCameraFactory */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0671xa1e35205 m4321x2fa3de6f() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0671xa1e35205 interfaceC0671xa1e35205 = this.f894xcd522ab8;
        if (interfaceC0671xa1e35205 != null) {
            return interfaceC0671xa1e35205;
        }
        throw new java.lang.IllegalStateException("CameraX not initialized yet.");
    }

    /* renamed from: getCameraRepository */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0681x1d4cd46f m4322xf760f7c5() {
        return this.f895x75a05adc;
    }

    /* renamed from: getDefaultConfigFactory */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771 m4323x581b7f1d() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771 interfaceC0769xb8476771 = this.f897x13357eb4;
        if (interfaceC0769xb8476771 != null) {
            return interfaceC0769xb8476771;
        }
        throw new java.lang.IllegalStateException("CameraX not initialized yet.");
    }

    /* renamed from: getInitializeFuture */
    public wa.a m4324xd01bc0e9() {
        return this.f898x4d50ef5d;
    }

    /* renamed from: isInitialized */
    public boolean m4325xf582434a() {
        boolean z17;
        synchronized (this.f900x81d2c6a8) {
            z17 = this.f899x6ab26374 == p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0478x83f739b3.InternalInitState.INITIALIZED;
        }
        return z17;
    }

    /* renamed from: shutdown */
    public wa.a m4326xf5e80656() {
        return m4316x1d597b33();
    }

    public C0478x83f739b3(android.content.Context context, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0484x278856d5.Provider provider, r.a aVar) {
        this.f895x75a05adc = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0681x1d4cd46f();
        this.f900x81d2c6a8 = new java.lang.Object();
        this.f899x6ab26374 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0478x83f739b3.InternalInitState.UNINITIALIZED;
        this.f905x63706fa3 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6013x95a8e8d4(null);
        if (provider != null) {
            this.f896x52f72f88 = provider.mo2877xb548e33f();
        } else {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0484x278856d5.Provider m4306xf6475849 = m4306xf6475849(context);
            if (m4306xf6475849 != null) {
                this.f896x52f72f88 = m4306xf6475849.mo2877xb548e33f();
            } else {
                throw new java.lang.IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            }
        }
        m4319xf55cefb8(context, this.f896x52f72f88.m4339xb5df664b(), aVar);
        java.util.concurrent.Executor m4333x2022f80e = this.f896x52f72f88.m4333x2022f80e(null);
        android.os.Handler m4340x2b45d85 = this.f896x52f72f88.m4340x2b45d85(null);
        this.f893x383e34e5 = m4333x2022f80e == null ? new p012xc85e97e9.p023xae79c325.p034x2eaf9f.ExecutorC0469xf5d1f738() : m4333x2022f80e;
        if (m4340x2b45d85 == null) {
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("CameraX-scheduler", 10);
            this.f904xefbd3278 = handlerThread;
            handlerThread.start();
            this.f903x80f3c09c = j3.k.a(handlerThread.getLooper());
        } else {
            this.f904xefbd3278 = null;
            this.f903x80f3c09c = m4340x2b45d85;
        }
        java.lang.Integer num = (java.lang.Integer) this.f896x52f72f88.mo5380x77ba97d1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0484x278856d5.f920x93a01cd, null);
        this.f901x71c31c65 = num;
        m4307x1115a5bb(num);
        this.f902x59cb274d = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.Builder(this.f896x52f72f88.m4336xb108c3fe()).m4744x59bc66e();
        this.f898x4d50ef5d = m4309xa91d7fed(context);
    }
}
