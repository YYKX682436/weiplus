package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.Camera2CameraImpl */
/* loaded from: classes14.dex */
public final class C0133x27d8c852 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 {

    /* renamed from: ERROR_NONE */
    private static final int f181x8030772f = 0;
    private static final java.lang.String TAG = "Camera2CameraImpl";

    /* renamed from: mCameraAvailability */
    final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.CameraAvailability f182x8807f86d;

    /* renamed from: mCameraCharacteristicsCompat */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 f183x9aefb908;

    /* renamed from: mCameraConfig */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0665xb691d6e7 f184x445b9bd4;

    /* renamed from: mCameraConfigureAvailable */
    final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.CameraConfigureAvailable f185xec01f815;

    /* renamed from: mCameraControlInternal */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab f186x331a4ee8;

    /* renamed from: mCameraCoordinator */
    final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p035xa7ffe5b7.InterfaceC0584xe74c66ab f187x9969adde;

    /* renamed from: mCameraDevice */
    android.hardware.camera2.CameraDevice f188x458736e8;

    /* renamed from: mCameraDeviceError */
    int f189xcc70bc00;

    /* renamed from: mCameraInfoInternal */
    final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0160xa6db3120 f190xf7e2e49d;

    /* renamed from: mCameraManager */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a f191x4030095b;

    /* renamed from: mCameraStateMachine */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0211xbaf1465b f192x4c7ce588;

    /* renamed from: mCameraStateRegistry */
    final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0684x851c70a9 f193x2504b71c;

    /* renamed from: mCaptureSession */
    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0221xac172a89 f194x15e0c23d;

    /* renamed from: mCaptureSessionOpenerBuilder */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.OpenerBuilder f195x3af653e7;

    /* renamed from: mCaptureSessionRepository */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0222xaa5cc7fa f196xf2ed9167;

    /* renamed from: mCloseCameraBeforeCreateNewSessionQuirk */
    private final boolean f197xd2d13efd;

    /* renamed from: mConfigAndCloseQuirk */
    private final boolean f198xf533200e;

    /* renamed from: mDisplayInfoManager */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0226x5ccce11d f199xee58804a;

    /* renamed from: mDynamicRangesCompat */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0345x87152bb7 f200x26fd722a;

    /* renamed from: mErrorTimeoutReopenScheduler */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.ErrorTimeoutReopenScheduler f201x2d98ba18;

    /* renamed from: mExecutor */
    private final java.util.concurrent.Executor f202x9ec3a060;

    /* renamed from: mIsActiveResumingMode */
    boolean f203x93c91f6a;

    /* renamed from: mIsConfigAndCloseRequired */
    private boolean f204x31faafd9;

    /* renamed from: mIsConfiguringForClose */
    private boolean f205x7d2471fb;

    /* renamed from: mIsPrimary */
    private boolean f206x45659f8b;

    /* renamed from: mLock */
    final java.lang.Object f207x6243b38;

    /* renamed from: mMeteringRepeatingSession */
    private p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0253xf8939228 f208x41245b95;

    /* renamed from: mNotifyStateAttachedSet */
    private final java.util.Set<java.lang.String> f209x8ef25903;

    /* renamed from: mObservableState */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0722x9a8be0b9<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State> f210x46bfe0e1;

    /* renamed from: mReleaseRequestCount */
    final java.util.concurrent.atomic.AtomicInteger f211x6a367ba;

    /* renamed from: mReleasedCaptureSessions */
    final java.util.Map<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0221xac172a89, wa.a> f212x9ce39fd9;

    /* renamed from: mScheduledExecutorService */
    private final java.util.concurrent.ScheduledExecutorService f213xf3483782;

    /* renamed from: mSessionProcessor */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc f214x6e733d29;

    /* renamed from: mState */
    volatile p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState f215xbec81024 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.INITIALIZED;

    /* renamed from: mStateCallback */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.StateCallback f216x90ee3089;

    /* renamed from: mSupportedSurfaceCombination */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0263xf6062110 f217x7f064483;

    /* renamed from: mTraceStateErrorCount */
    private int f218x8b6ba360;

    /* renamed from: mUseCaseAttachState */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0763xfca96795 f219x8e3506c2;

    /* renamed from: mUserReleaseFuture */
    wa.a f220xace7cdb2;

    /* renamed from: mUserReleaseNotifier */
    t2.k f221x1320b9d5;

    /* renamed from: androidx.camera.camera2.internal.Camera2CameraImpl$CameraAvailability */
    /* loaded from: classes14.dex */
    public final class CameraAvailability extends android.hardware.camera2.CameraManager.AvailabilityCallback implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0684x851c70a9.OnOpenAvailableListener {

        /* renamed from: mCameraAvailable */
        private boolean f229xe4d0d0f7 = true;

        /* renamed from: mCameraId */
        private final java.lang.String f230x1c133ead;

        public CameraAvailability(java.lang.String str) {
            this.f230x1c133ead = str;
        }

        /* renamed from: isCameraAvailable */
        public boolean m3122x43e8129a() {
            return this.f229xe4d0d0f7;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(java.lang.String str) {
            if (this.f230x1c133ead.equals(str)) {
                this.f229xe4d0d0f7 = true;
                if (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.f215xbec81024 == p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.PENDING_OPEN) {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3117x1701a920(false);
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(java.lang.String str) {
            if (this.f230x1c133ead.equals(str)) {
                this.f229xe4d0d0f7 = false;
            }
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0684x851c70a9.OnOpenAvailableListener
        /* renamed from: onOpenAvailable */
        public void mo3123xfd13dc00() {
            if (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.f215xbec81024 == p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.PENDING_OPEN) {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3117x1701a920(false);
            }
        }
    }

    /* renamed from: androidx.camera.camera2.internal.Camera2CameraImpl$CameraConfigureAvailable */
    /* loaded from: classes14.dex */
    public final class CameraConfigureAvailable implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0684x851c70a9.OnConfigureAvailableListener {
        public CameraConfigureAvailable() {
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0684x851c70a9.OnConfigureAvailableListener
        /* renamed from: onConfigureAvailable */
        public void mo3124xdb5dac2() {
            if (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.f215xbec81024 == p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.OPENED) {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3102xf3dae15a();
            }
        }
    }

    /* renamed from: androidx.camera.camera2.internal.Camera2CameraImpl$ControlUpdateListenerInternal */
    /* loaded from: classes14.dex */
    public final class ControlUpdateListenerInternal implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0669xec29d935.ControlUpdateCallback {
        public ControlUpdateListenerInternal() {
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0669xec29d935.ControlUpdateCallback
        /* renamed from: onCameraControlCaptureRequests */
        public void mo3125x4fd63511(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08> list) {
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852 c0133x27d8c852 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this;
            list.getClass();
            c0133x27d8c852.m3113x6eb429f2(list);
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0669xec29d935.ControlUpdateCallback
        /* renamed from: onCameraControlUpdateSessionConfig */
        public void mo3126x9cc47396() {
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3118x84f4423b();
        }
    }

    /* renamed from: androidx.camera.camera2.internal.Camera2CameraImpl$ErrorTimeoutReopenScheduler */
    /* loaded from: classes14.dex */
    public class ErrorTimeoutReopenScheduler {

        /* renamed from: ERROR_TIMEOUT_MILLIS */
        private static final long f234x31f67e3b = 2000;

        /* renamed from: mScheduleNode */
        private p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.ErrorTimeoutReopenScheduler.ScheduleNode f235xdcd7aa46;

        /* renamed from: androidx.camera.camera2.internal.Camera2CameraImpl$ErrorTimeoutReopenScheduler$ScheduleNode */
        /* loaded from: classes14.dex */
        public class ScheduleNode {

            /* renamed from: mIsDone */
            private final java.util.concurrent.atomic.AtomicBoolean f237x90e2699 = new java.util.concurrent.atomic.AtomicBoolean(false);

            /* renamed from: mScheduledFuture */
            private final java.util.concurrent.ScheduledFuture<?> f238xf3fa74a3;

            public ScheduleNode() {
                this.f238xf3fa74a3 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.f213xf3483782.schedule(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$ErrorTimeoutReopenScheduler$ScheduleNode$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.ErrorTimeoutReopenScheduler.ScheduleNode.this.m3131xb158f775();
                    }
                }, 2000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: execute */
            public void m3131xb158f775() {
                if (this.f237x90e2699.getAndSet(true)) {
                    return;
                }
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.f202x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$ErrorTimeoutReopenScheduler$ScheduleNode$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.ErrorTimeoutReopenScheduler.ScheduleNode.this.m3132xc992dd52();
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: executeInternal */
            public void m3132xc992dd52() {
                if (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.f215xbec81024 == p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.OPENING) {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3085x20a68ff1("Camera onError timeout, reopen it.");
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3110x53b6854f(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.REOPENING);
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.f216x90ee3089.m3143xa6029eb9();
                } else {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3085x20a68ff1("Camera skip reopen at state: " + p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.f215xbec81024);
                }
            }

            /* renamed from: cancel */
            public void m3133xae7a2e7a() {
                this.f237x90e2699.set(true);
                this.f238xf3fa74a3.cancel(true);
            }

            /* renamed from: isDone */
            public boolean m3134xb9a1ffcc() {
                return this.f237x90e2699.get();
            }
        }

        private ErrorTimeoutReopenScheduler() {
            this.f235xdcd7aa46 = null;
        }

        /* renamed from: cancel */
        public void m3127xae7a2e7a() {
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.ErrorTimeoutReopenScheduler.ScheduleNode scheduleNode = this.f235xdcd7aa46;
            if (scheduleNode != null) {
                scheduleNode.m3133xae7a2e7a();
            }
            this.f235xdcd7aa46 = null;
        }

        /* renamed from: deviceOnError */
        public void m3128x6cdf7433() {
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3085x20a68ff1("Camera receive onErrorCallback");
            m3127xae7a2e7a();
        }

        /* renamed from: isErrorHandling */
        public boolean m3129x4c2fa603() {
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.ErrorTimeoutReopenScheduler.ScheduleNode scheduleNode = this.f235xdcd7aa46;
            return (scheduleNode == null || scheduleNode.m3134xb9a1ffcc()) ? false : true;
        }

        /* renamed from: start */
        public void m3130x68ac462() {
            if (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.f215xbec81024 != p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.OPENING) {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3085x20a68ff1("Don't need the onError timeout handler.");
                return;
            }
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3085x20a68ff1("Camera waiting for onError.");
            m3127xae7a2e7a();
            this.f235xdcd7aa46 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.ErrorTimeoutReopenScheduler.ScheduleNode();
        }
    }

    /* renamed from: androidx.camera.camera2.internal.Camera2CameraImpl$InternalState */
    /* loaded from: classes14.dex */
    public enum InternalState {
        RELEASED,
        RELEASING,
        INITIALIZED,
        PENDING_OPEN,
        CLOSING,
        REOPENING_QUIRK,
        REOPENING,
        OPENING,
        OPENED,
        CONFIGURED
    }

    /* renamed from: androidx.camera.camera2.internal.Camera2CameraImpl$StateCallback */
    /* loaded from: classes14.dex */
    public final class StateCallback extends android.hardware.camera2.CameraDevice.StateCallback {

        /* renamed from: mCameraReopenMonitor */
        private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.StateCallback.CameraReopenMonitor f251x8b690acb;

        /* renamed from: mExecutor */
        private final java.util.concurrent.Executor f252x9ec3a060;

        /* renamed from: mScheduledReopenHandle */
        java.util.concurrent.ScheduledFuture<?> f253xb3e8a65;

        /* renamed from: mScheduledReopenRunnable */
        private p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.StateCallback.ScheduledReopen f254x6715d41a;

        /* renamed from: mScheduler */
        private final java.util.concurrent.ScheduledExecutorService f255x71230ace;

        /* renamed from: androidx.camera.camera2.internal.Camera2CameraImpl$StateCallback$CameraReopenMonitor */
        /* loaded from: classes14.dex */
        public class CameraReopenMonitor {

            /* renamed from: ACTIVE_REOPEN_DELAY_BASE_MS */
            static final int f257x761c18cf = 1000;

            /* renamed from: ACTIVE_REOPEN_LIMIT_MS */
            static final int f258x4b169493 = 1800000;

            /* renamed from: INVALID_TIME */
            static final int f259xab4e9435 = -1;

            /* renamed from: REOPEN_DELAY_MS */
            static final int f260x9fb7f504 = 700;

            /* renamed from: REOPEN_LIMIT_MS */
            static final int f261xb47d97cc = 10000;

            /* renamed from: mCameraOpenRetryMaxTimeoutInMs */
            private final long f262xce38e674;

            /* renamed from: mFirstReopenTime */
            private long f263x44b260d = -1;

            public CameraReopenMonitor(long j17) {
                this.f262xce38e674 = j17;
            }

            /* renamed from: canScheduleCameraReopen */
            public boolean m3145xc55b4aa9() {
                if (!(m3146xbced4133() >= ((long) m3148xfb92dd4e()))) {
                    return true;
                }
                m3149x6761d4f();
                return false;
            }

            /* renamed from: getElapsedTime */
            public long m3146xbced4133() {
                long uptimeMillis = android.os.SystemClock.uptimeMillis();
                if (this.f263x44b260d == -1) {
                    this.f263x44b260d = uptimeMillis;
                }
                return uptimeMillis - this.f263x44b260d;
            }

            /* renamed from: getReopenDelayMs */
            public int m3147x4d7bf916() {
                if (!p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.StateCallback.this.m3144xc308cc26()) {
                    return 700;
                }
                long m3146xbced4133 = m3146xbced4133();
                if (m3146xbced4133 <= u04.d.f505010c) {
                    return 1000;
                }
                return m3146xbced4133 <= 300000 ? 2000 : 4000;
            }

            /* renamed from: getReopenLimitMs */
            public int m3148xfb92dd4e() {
                if (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.StateCallback.this.m3144xc308cc26()) {
                    long j17 = this.f262xce38e674;
                    return j17 > 0 ? java.lang.Math.min((int) j17, f258x4b169493) : f258x4b169493;
                }
                long j18 = this.f262xce38e674;
                if (j18 > 0) {
                    return java.lang.Math.min((int) j18, 10000);
                }
                return 10000;
            }

            /* renamed from: reset */
            public void m3149x6761d4f() {
                this.f263x44b260d = -1L;
            }
        }

        /* renamed from: androidx.camera.camera2.internal.Camera2CameraImpl$StateCallback$ScheduledReopen */
        /* loaded from: classes14.dex */
        public class ScheduledReopen implements java.lang.Runnable {

            /* renamed from: mCancelled */
            private boolean f265x971f7364 = false;

            /* renamed from: mExecutor */
            private java.util.concurrent.Executor f266x9ec3a060;

            public ScheduledReopen(java.util.concurrent.Executor executor) {
                this.f266x9ec3a060 = executor;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: lambda$run$0 */
            public void m3150x522ee13a() {
                if (this.f265x971f7364) {
                    return;
                }
                m3.h.e(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.f215xbec81024 == p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.REOPENING || p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.f215xbec81024 == p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.REOPENING_QUIRK, null);
                if (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.StateCallback.this.m3144xc308cc26()) {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3116x5ada9355(true);
                } else {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3117x1701a920(true);
                }
            }

            /* renamed from: cancel */
            public void m3151xae7a2e7a() {
                this.f265x971f7364 = true;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f266x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$StateCallback$ScheduledReopen$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.StateCallback.ScheduledReopen.this.m3150x522ee13a();
                    }
                });
            }
        }

        public StateCallback(java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, long j17) {
            this.f252x9ec3a060 = executor;
            this.f255x71230ace = scheduledExecutorService;
            this.f251x8b690acb = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.StateCallback.CameraReopenMonitor(j17);
        }

        /* renamed from: handleErrorOnOpen */
        private void m3139xd38c09a9(android.hardware.camera2.CameraDevice cameraDevice, int i17) {
            m3.h.e(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.f215xbec81024 == p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.OPENING || p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.f215xbec81024 == p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.OPENED || p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.f215xbec81024 == p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.CONFIGURED || p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.f215xbec81024 == p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.REOPENING || p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.f215xbec81024 == p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.REOPENING_QUIRK, "Attempt to handle open error from non open state: " + p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.f215xbec81024);
            if (i17 == 1 || i17 == 2 || i17 == 4) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.TAG, java.lang.String.format("Attempt to reopen camera[%s] after error[%s]", cameraDevice.getId(), p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.m3044xa8aa7f55(i17)));
                m3140x83ae67ae(i17);
                return;
            }
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.TAG, "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.m3044xa8aa7f55(i17) + " closing camera.");
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3111x53b6854f(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.CLOSING, p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.StateError.m4296xaf65a0fc(i17 == 3 ? 5 : 6));
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3084xedf4333d(false);
        }

        /* renamed from: reopenCameraAfterError */
        private void m3140x83ae67ae(int i17) {
            int i18 = 1;
            m3.h.e(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.f189xcc70bc00 != 0, "Can only reopen camera device after error if the camera device is actually in an error state.");
            if (i17 == 1) {
                i18 = 2;
            } else if (i17 != 2) {
                i18 = 3;
            }
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3111x53b6854f(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.REOPENING, p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.StateError.m4296xaf65a0fc(i18));
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3084xedf4333d(false);
        }

        /* renamed from: cancelScheduledReopen */
        public boolean m3141x1d2030() {
            if (this.f253xb3e8a65 == null) {
                return false;
            }
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3085x20a68ff1("Cancelling scheduled re-open: " + this.f254x6715d41a);
            this.f254x6715d41a.m3151xae7a2e7a();
            this.f254x6715d41a = null;
            this.f253xb3e8a65.cancel(false);
            this.f253xb3e8a65 = null;
            return true;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(android.hardware.camera2.CameraDevice cameraDevice) {
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3085x20a68ff1("CameraDevice.onClosed()");
            m3.h.e(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.f188x458736e8 == null, "Unexpected onClose callback on camera device: " + cameraDevice);
            int ordinal = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.f215xbec81024.ordinal();
            if (ordinal == 1 || ordinal == 4) {
                m3.h.e(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3095x7bdf14a5(), null);
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3039xdac63015();
                return;
            }
            if (ordinal != 5 && ordinal != 6) {
                throw new java.lang.IllegalStateException("Camera closed while in state: " + p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.f215xbec81024);
            }
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852 c0133x27d8c852 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this;
            if (c0133x27d8c852.f189xcc70bc00 == 0) {
                c0133x27d8c852.m3117x1701a920(false);
                return;
            }
            c0133x27d8c852.m3085x20a68ff1("Camera closed due to error: " + p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.m3044xa8aa7f55(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.f189xcc70bc00));
            m3143xa6029eb9();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(android.hardware.camera2.CameraDevice cameraDevice) {
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3085x20a68ff1("CameraDevice.onDisconnected()");
            onError(cameraDevice, 1);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(android.hardware.camera2.CameraDevice cameraDevice, int i17) {
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852 c0133x27d8c852 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this;
            c0133x27d8c852.f188x458736e8 = cameraDevice;
            c0133x27d8c852.f189xcc70bc00 = i17;
            c0133x27d8c852.f201x2d98ba18.m3128x6cdf7433();
            int ordinal = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.f215xbec81024.ordinal();
            if (ordinal != 1) {
                switch (ordinal) {
                    case 4:
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.TAG, java.lang.String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error.", cameraDevice.getId(), p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.m3044xa8aa7f55(i17), p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.f215xbec81024.name()));
                        m3139xd38c09a9(cameraDevice, i17);
                        return;
                    default:
                        throw new java.lang.IllegalStateException("onError() should not be possible from state: " + p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.f215xbec81024);
                }
            }
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.TAG, java.lang.String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera.", cameraDevice.getId(), p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.m3044xa8aa7f55(i17), p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.f215xbec81024.name()));
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3084xedf4333d(false);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(android.hardware.camera2.CameraDevice cameraDevice) {
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3085x20a68ff1("CameraDevice.onOpened()");
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852 c0133x27d8c852 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this;
            c0133x27d8c852.f188x458736e8 = cameraDevice;
            c0133x27d8c852.f189xcc70bc00 = 0;
            m3142x2995f68e();
            int ordinal = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.f215xbec81024.ordinal();
            if (ordinal == 1 || ordinal == 4) {
                m3.h.e(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3095x7bdf14a5(), null);
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.f188x458736e8.close();
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.f188x458736e8 = null;
            } else {
                if (ordinal != 5 && ordinal != 6 && ordinal != 7) {
                    throw new java.lang.IllegalStateException("onOpened() should not be possible from state: " + p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.f215xbec81024);
                }
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3110x53b6854f(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.OPENED);
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0684x851c70a9 c0684x851c70a9 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.f193x2504b71c;
                java.lang.String id6 = cameraDevice.getId();
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852 c0133x27d8c8522 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this;
                if (c0684x851c70a9.m5316x72878675(id6, c0133x27d8c8522.f187x9969adde.mo4123xe5cebc46(c0133x27d8c8522.f188x458736e8.getId()))) {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3102xf3dae15a();
                }
            }
        }

        /* renamed from: resetReopenMonitor */
        public void m3142x2995f68e() {
            this.f251x8b690acb.m3149x6761d4f();
        }

        /* renamed from: scheduleCameraReopen */
        public void m3143xa6029eb9() {
            m3.h.e(this.f254x6715d41a == null, null);
            m3.h.e(this.f253xb3e8a65 == null, null);
            if (!this.f251x8b690acb.m3145xc55b4aa9()) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.TAG, "Camera reopening attempted for " + this.f251x8b690acb.m3148xfb92dd4e() + "ms without success.");
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3112x53b6854f(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.PENDING_OPEN, null, false);
                return;
            }
            this.f254x6715d41a = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.StateCallback.ScheduledReopen(this.f252x9ec3a060);
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3085x20a68ff1("Attempting camera re-open in " + this.f251x8b690acb.m3147x4d7bf916() + "ms: " + this.f254x6715d41a + " activeResuming = " + p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.f203x93c91f6a);
            this.f253xb3e8a65 = this.f255x71230ace.schedule(this.f254x6715d41a, (long) this.f251x8b690acb.m3147x4d7bf916(), java.util.concurrent.TimeUnit.MILLISECONDS);
        }

        /* renamed from: shouldActiveResume */
        public boolean m3144xc308cc26() {
            int i17;
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852 c0133x27d8c852 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this;
            return c0133x27d8c852.f203x93c91f6a && ((i17 = c0133x27d8c852.f189xcc70bc00) == 1 || i17 == 2);
        }
    }

    /* renamed from: androidx.camera.camera2.internal.Camera2CameraImpl$UseCaseInfo */
    /* loaded from: classes14.dex */
    public static abstract class UseCaseInfo {
        /* renamed from: create */
        public static p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.UseCaseInfo m3152xaf65a0fc(java.lang.String str, java.lang.Class<?> cls, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b59, android.util.Size size, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType> list) {
            return new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0110xd123637b(str, cls, c0750xb915958, interfaceC0768x83509b59, size, abstractC0756x2f9ad77b, list);
        }

        /* renamed from: from */
        public static p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.UseCaseInfo m3153x3017aa(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137, boolean z17) {
            return m3152xaf65a0fc(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.m3047xc3921a1c(abstractC0580x5a5e3137), abstractC0580x5a5e3137.getClass(), z17 ? abstractC0580x5a5e3137.m4826x9951e5c2() : abstractC0580x5a5e3137.m4824xd31a5b5a(), abstractC0580x5a5e3137.m4814x27802a65(), abstractC0580x5a5e3137.m4810x59ee93f(), abstractC0580x5a5e3137.m4809xfdddfa15(), p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.m3043x8e12cf49(abstractC0580x5a5e3137));
        }

        /* renamed from: getCaptureTypes */
        public abstract java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType> mo2902x8e12cf49();

        /* renamed from: getSessionConfig */
        public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 mo2903x9951e5c2();

        /* renamed from: getStreamSpec */
        public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b mo2904xa709b351();

        /* renamed from: getSurfaceResolution */
        public abstract android.util.Size mo2905xd8479483();

        /* renamed from: getUseCaseConfig */
        public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> mo2906x111127c3();

        /* renamed from: getUseCaseId */
        public abstract java.lang.String mo2907xc3921a1c();

        /* renamed from: getUseCaseType */
        public abstract java.lang.Class<?> mo2908x27795ffb();
    }

    public C0133x27d8c852(android.content.Context context, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a c0332x1ad8324a, java.lang.String str, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0160xa6db3120 c0160xa6db3120, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p035xa7ffe5b7.InterfaceC0584xe74c66ab interfaceC0584xe74c66ab, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0684x851c70a9 c0684x851c70a9, java.util.concurrent.Executor executor, android.os.Handler handler, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0226x5ccce11d c0226x5ccce11d, long j17) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0722x9a8be0b9<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State> c0722x9a8be0b9 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0722x9a8be0b9<>();
        this.f210x46bfe0e1 = c0722x9a8be0b9;
        this.f189xcc70bc00 = 0;
        this.f211x6a367ba = new java.util.concurrent.atomic.AtomicInteger(0);
        this.f212x9ce39fd9 = new java.util.LinkedHashMap();
        this.f218x8b6ba360 = 0;
        this.f204x31faafd9 = false;
        this.f205x7d2471fb = false;
        this.f206x45659f8b = true;
        this.f209x8ef25903 = new java.util.HashSet();
        this.f184x445b9bd4 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0668x1ba9066c.m5276x1e74d0e3();
        this.f207x6243b38 = new java.lang.Object();
        this.f203x93c91f6a = false;
        this.f201x2d98ba18 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.ErrorTimeoutReopenScheduler();
        this.f191x4030095b = c0332x1ad8324a;
        this.f187x9969adde = interfaceC0584xe74c66ab;
        this.f193x2504b71c = c0684x851c70a9;
        java.util.concurrent.ScheduledExecutorService m5984x3281647d = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5984x3281647d(handler);
        this.f213xf3483782 = m5984x3281647d;
        java.util.concurrent.Executor m5985x592e8cb2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5985x592e8cb2(executor);
        this.f202x9ec3a060 = m5985x592e8cb2;
        this.f216x90ee3089 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.StateCallback(m5985x592e8cb2, m5984x3281647d, j17);
        this.f219x8e3506c2 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0763xfca96795(str);
        c0722x9a8be0b9.m5506x76db6cb1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State.CLOSED);
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0211xbaf1465b c0211xbaf1465b = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0211xbaf1465b(c0684x851c70a9);
        this.f192x4c7ce588 = c0211xbaf1465b;
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0222xaa5cc7fa c0222xaa5cc7fa = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0222xaa5cc7fa(m5985x592e8cb2);
        this.f196xf2ed9167 = c0222xaa5cc7fa;
        this.f199xee58804a = c0226x5ccce11d;
        try {
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 m3757xc2a5207f = c0332x1ad8324a.m3757xc2a5207f(str);
            this.f183x9aefb908 = m3757xc2a5207f;
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab c0116xda12e2ab = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0116xda12e2ab(m3757xc2a5207f, m5984x3281647d, m5985x592e8cb2, new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.ControlUpdateListenerInternal(), c0160xa6db3120.mo3162x25ef6270());
            this.f186x331a4ee8 = c0116xda12e2ab;
            this.f190xf7e2e49d = c0160xa6db3120;
            c0160xa6db3120.m3190x5ddc0a78(c0116xda12e2ab);
            c0160xa6db3120.m3193x2842765(c0211xbaf1465b.m3313x51fc82b1());
            this.f200x26fd722a = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0345x87152bb7.m3798x532ddec9(m3757xc2a5207f);
            this.f194x15e0c23d = m3069x3ffcd630();
            this.f195x3af653e7 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.OpenerBuilder(m5985x592e8cb2, m5984x3281647d, handler, c0222xaa5cc7fa, c0160xa6db3120.mo3162x25ef6270(), p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0370xcf1a968b.m3936xb5882a6b());
            this.f197xd2d13efd = c0160xa6db3120.mo3162x25ef6270().m5568xde2d761f(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0390xb1b77ff9.class);
            this.f198xf533200e = c0160xa6db3120.mo3162x25ef6270().m5568xde2d761f(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0391x471f3579.class);
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.CameraAvailability cameraAvailability = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.CameraAvailability(str);
            this.f182x8807f86d = cameraAvailability;
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.CameraConfigureAvailable cameraConfigureAvailable = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.CameraConfigureAvailable();
            this.f185xec01f815 = cameraConfigureAvailable;
            c0684x851c70a9.m5314xc6f817a8(this, m5985x592e8cb2, cameraConfigureAvailable, cameraAvailability);
            c0332x1ad8324a.m3761x1037c203(m5985x592e8cb2, cameraAvailability);
            this.f217x7f064483 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0263xf6062110(context, str, c0332x1ad8324a, new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0113x4cf54b9d() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl.1
                @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0113x4cf54b9d
                public android.media.CamcorderProfile get(int i17, int i18) {
                    return android.media.CamcorderProfile.get(i17, i18);
                }

                @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0113x4cf54b9d
                /* renamed from: hasProfile */
                public boolean mo2925x66b24daf(int i17, int i18) {
                    return android.media.CamcorderProfile.hasProfile(i17, i18);
                }
            });
        } catch (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0302x1aaa9468 e17) {
            throw p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0212x8dc75992.m3316x51964ec6(e17);
        }
    }

    /* renamed from: addMeteringRepeating */
    private void m3034xebd7aa0d() {
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0253xf8939228 c0253xf8939228 = this.f208x41245b95;
        if (c0253xf8939228 != null) {
            java.lang.String m3045x26e1f33 = m3045x26e1f33(c0253xf8939228);
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0763xfca96795 c0763xfca96795 = this.f219x8e3506c2;
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 m3489x9951e5c2 = this.f208x41245b95.m3489x9951e5c2();
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> m3490x111127c3 = this.f208x41245b95.m3490x111127c3();
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType captureType = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType.METERING_REPEATING;
            c0763xfca96795.m5727x8aed9f59(m3045x26e1f33, m3489x9951e5c2, m3490x111127c3, null, java.util.Collections.singletonList(captureType));
            this.f219x8e3506c2.m5726x9fd789fb(m3045x26e1f33, this.f208x41245b95.m3489x9951e5c2(), this.f208x41245b95.m3490x111127c3(), null, java.util.Collections.singletonList(captureType));
        }
    }

    /* renamed from: addOrRemoveMeteringRepeatingUseCase */
    private void m3035xb8f978f1() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 m5645x59bc66e = this.f219x8e3506c2.m5720x9cebfb21().m5645x59bc66e();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08 m5597x57482ff7 = m5645x59bc66e.m5597x57482ff7();
        int size = m5597x57482ff7.m5335x1b8de6dc().size();
        int size2 = m5645x59bc66e.m5601x1b8de6dc().size();
        if (m5645x59bc66e.m5601x1b8de6dc().isEmpty()) {
            return;
        }
        if (m5597x57482ff7.m5335x1b8de6dc().isEmpty()) {
            if (this.f208x41245b95 == null) {
                this.f208x41245b95 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0253xf8939228(this.f190xf7e2e49d.m3159xc2a5207f(), this.f199xee58804a, new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0253xf8939228.SurfaceResetCallback() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$j
                    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0253xf8939228.SurfaceResetCallback
                    /* renamed from: onSurfaceReset */
                    public final void mo3119x54f5b021() {
                        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3049x6d6df236();
                    }
                });
            }
            if (m3048x48914ed2()) {
                m3034xebd7aa0d();
                return;
            } else {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Failed to add a repeating surface, CameraControl and ImageCapture may encounter issues due to the absence of repeating surface. Please add a UseCase (Preview or ImageAnalysis) that can provide a repeating surface for CameraControl and ImageCapture to function properly.");
                return;
            }
        }
        if (size2 == 1 && size == 1) {
            m3076x4b378c8a();
            return;
        }
        if (size >= 2) {
            m3076x4b378c8a();
            return;
        }
        if (this.f208x41245b95 != null && !m3048x48914ed2()) {
            m3076x4b378c8a();
            return;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "No need to remove a previous mMeteringRepeating, SessionConfig Surfaces: " + size2 + ", CaptureConfig Surfaces: " + size);
    }

    /* renamed from: checkAndAttachRepeatingSurface */
    private boolean m3036x49ca93a(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.Builder builder) {
        if (!builder.m5354x1b8de6dc().isEmpty()) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "The capture config builder already has surface inside.");
            return false;
        }
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958> it = this.f219x8e3506c2.m5719x66d6cda().iterator();
        while (it.hasNext()) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08 m5597x57482ff7 = it.next().m5597x57482ff7();
            java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> m5335x1b8de6dc = m5597x57482ff7.m5335x1b8de6dc();
            if (!m5335x1b8de6dc.isEmpty()) {
                if (m5597x57482ff7.m5334x732bab0() != 0) {
                    builder.m5365xb21eba79(m5597x57482ff7.m5334x732bab0());
                }
                if (m5597x57482ff7.m5338x96948bdd() != 0) {
                    builder.m5368xc6227d26(m5597x57482ff7.m5338x96948bdd());
                }
                java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> it6 = m5335x1b8de6dc.iterator();
                while (it6.hasNext()) {
                    builder.m5348x34744cc(it6.next());
                }
            }
        }
        if (!builder.m5354x1b8de6dc().isEmpty()) {
            return true;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "Unable to find a repeating surface to attach to CaptureConfig");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: closeInternal */
    public void m3037x6c9e90d5() {
        m3085x20a68ff1("Closing camera.");
        switch (this.f215xbec81024.ordinal()) {
            case 3:
                m3.h.e(this.f188x458736e8 == null, null);
                m3110x53b6854f(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.INITIALIZED);
                return;
            case 4:
            default:
                m3085x20a68ff1("close() ignored due to being in state: " + this.f215xbec81024);
                return;
            case 5:
            case 6:
            case 7:
                if (!this.f216x90ee3089.m3141x1d2030() && !this.f201x2d98ba18.m3129x4c2fa603()) {
                    r2 = false;
                }
                this.f201x2d98ba18.m3127xae7a2e7a();
                m3110x53b6854f(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.CLOSING);
                if (r2) {
                    m3.h.e(m3095x7bdf14a5(), null);
                    m3039xdac63015();
                    return;
                }
                return;
            case 8:
            case 9:
                m3110x53b6854f(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.CLOSING);
                m3084xedf4333d(false);
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: configAndClose */
    public wa.a m3038x85287c3(android.hardware.camera2.CameraDevice cameraDevice) {
        final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490 c0216xd3748490 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490(this.f200x26fd722a);
        final android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        final android.view.Surface surface = new android.view.Surface(surfaceTexture);
        final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0720x9cc637dc c0720x9cc637dc = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0720x9cc637dc(surface);
        c0720x9cc637dc.m5408x5f9b7531().mo606x162a7075(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$l
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.m3051xb634b2ce(surface, surfaceTexture);
            }
        }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc());
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder builder = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder();
        builder.m5611x96a2a8d2(c0720x9cc637dc);
        builder.m5631x5d0f9056(1);
        m3085x20a68ff1("Start configAndClose.");
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0814x43c6229e.m6001x3017aa(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6032x7f0c59ab(c0216xd3748490.mo3346x34264a(builder.m5619x59bc66e(), cameraDevice, this.f195x3af653e7.m3609x59bc66e()))).m6005x9aa1ea70(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$o
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54
            /* renamed from: apply */
            public final wa.a mo3010x58b836e(java.lang.Object obj) {
                wa.a m3052xb634b2cf;
                m3052xb634b2cf = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.m3052xb634b2cf(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490.this, c0720x9cc637dc, (java.lang.Void) obj);
                return m3052xb634b2cf;
            }
        }, this.f202x9ec3a060);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: configAndCloseIfNeeded */
    public void m3039xdac63015() {
        m3.h.e(this.f215xbec81024 == p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.RELEASING || this.f215xbec81024 == p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.CLOSING, null);
        m3.h.e(this.f212x9ce39fd9.isEmpty(), null);
        if (!this.f204x31faafd9) {
            m3088x4ec94525();
            return;
        }
        if (this.f205x7d2471fb) {
            m3085x20a68ff1("Ignored since configAndClose is processing");
            return;
        }
        if (!this.f182x8807f86d.m3122x43e8129a()) {
            this.f204x31faafd9 = false;
            m3088x4ec94525();
            m3085x20a68ff1("Ignore configAndClose and finish the close flow directly since camera is unavailable.");
        } else {
            m3085x20a68ff1("Open camera to configAndClose");
            wa.a m3072x949983b2 = m3072x949983b2();
            this.f205x7d2471fb = true;
            m3072x949983b2.mo606x162a7075(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$s
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3053xca73019e();
                }
            }, this.f202x9ec3a060);
        }
    }

    /* renamed from: createDeviceStateCallback */
    private android.hardware.camera2.CameraDevice.StateCallback m3040xd18fe2a4() {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.f219x8e3506c2.m5720x9cebfb21().m5645x59bc66e().m5589xf78bafa9());
        arrayList.add(this.f196xf2ed9167.m3361xb178759b());
        arrayList.add(this.f216x90ee3089);
        return p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0208x27708218.m3306x20225057(arrayList);
    }

    /* renamed from: getCameraMode */
    private int m3042x764f0e5e() {
        synchronized (this.f207x6243b38) {
            return this.f187x9969adde.mo4121x7ef94829() == 2 ? 1 : 0;
        }
    }

    /* renamed from: getCaptureTypes */
    public static java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType> m3043x8e12cf49(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137) {
        if (abstractC0580x5a5e3137.m4811x1390e61b() == null) {
            return null;
        }
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0959xc642f91c.m6560x8e12cf49(abstractC0580x5a5e3137);
    }

    /* renamed from: getErrorMessage */
    public static java.lang.String m3044xa8aa7f55(int i17) {
        return i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? i17 != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    /* renamed from: getMeteringRepeatingId */
    public static java.lang.String m3045x26e1f33(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0253xf8939228 c0253xf8939228) {
        return c0253xf8939228.m3488xfb82e301() + c0253xf8939228.hashCode();
    }

    /* renamed from: getOrCreateUserReleaseFuture */
    private wa.a m3046x23e8f4ea() {
        if (this.f220xace7cdb2 == null) {
            if (this.f215xbec81024 != p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.RELEASED) {
                this.f220xace7cdb2 = t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$q
                    @Override // t2.m
                    /* renamed from: attachCompleter */
                    public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                        java.lang.Object m3055x7fd8379;
                        m3055x7fd8379 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3055x7fd8379(kVar);
                        return m3055x7fd8379;
                    }
                });
            } else {
                this.f220xace7cdb2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6013x95a8e8d4(null);
            }
        }
        return this.f220xace7cdb2;
    }

    /* renamed from: getUseCaseId */
    public static java.lang.String m3047xc3921a1c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137) {
        return abstractC0580x5a5e3137.m4818xfb82e301() + abstractC0580x5a5e3137.hashCode();
    }

    /* renamed from: isSurfaceCombinationWithMeteringRepeatingSupported */
    private boolean m3048x48914ed2() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int m3042x764f0e5e = m3042x764f0e5e();
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0763xfca96795.UseCaseAttachInfo useCaseAttachInfo : this.f219x8e3506c2.m5723xab28c72b()) {
            if (useCaseAttachInfo.m5734x8e12cf49() == null || useCaseAttachInfo.m5734x8e12cf49().get(0) != p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType.METERING_REPEATING) {
                if (useCaseAttachInfo.m5736xa709b351() == null || useCaseAttachInfo.m5734x8e12cf49() == null) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "Invalid stream spec or capture types in " + useCaseAttachInfo);
                    return false;
                }
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 m5735x9951e5c2 = useCaseAttachInfo.m5735x9951e5c2();
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> m5737x111127c3 = useCaseAttachInfo.m5737x111127c3();
                for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 abstractC0697x654a0293 : m5735x9951e5c2.m5601x1b8de6dc()) {
                    arrayList.add(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97.m5092xaf65a0fc(this.f217x7f064483.m3584x501b1a43(m3042x764f0e5e, m5737x111127c3.mo5446xb124032b(), abstractC0697x654a0293.m5405xee2bb02e()), m5737x111127c3.mo5446xb124032b(), abstractC0697x654a0293.m5405xee2bb02e(), useCaseAttachInfo.m5736xa709b351().mo5188x82dbcab4(), useCaseAttachInfo.m5734x8e12cf49(), useCaseAttachInfo.m5736xa709b351().mo5190xca0018d6(), m5737x111127c3.m5754x871a9f26(null)));
                }
            }
        }
        this.f208x41245b95.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(this.f208x41245b95.m3490x111127c3(), java.util.Collections.singletonList(this.f208x41245b95.m3487x1f67cc19()));
        try {
            this.f217x7f064483.m3580x29b7b37d(m3042x764f0e5e, arrayList, hashMap, false, false);
            m3085x20a68ff1("Surface combination with metering repeating supported!");
            return true;
        } catch (java.lang.IllegalArgumentException e17) {
            m3041x20a68ff1("Surface combination with metering repeating  not supported!", e17);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$addOrRemoveMeteringRepeatingUseCase$17 */
    public /* synthetic */ void m3049x6d6df236() {
        if (m3094x3d1b9668()) {
            m3077xd3ba4d08(m3045x26e1f33(this.f208x41245b95), this.f208x41245b95.m3489x9951e5c2(), this.f208x41245b95.m3490x111127c3(), null, java.util.Collections.singletonList(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType.METERING_REPEATING));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$attachUseCases$15 */
    public /* synthetic */ void m3050xb517d2aa(java.util.List list) {
        try {
            m3079x721439fc(list);
        } finally {
            this.f186x331a4ee8.m2960xc13e57b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$configAndClose$2 */
    public static /* synthetic */ void m3051xb634b2ce(android.view.Surface surface, android.graphics.SurfaceTexture surfaceTexture) {
        surface.release();
        surfaceTexture.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$configAndClose$3 */
    public static /* synthetic */ wa.a m3052xb634b2cf(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490 c0216xd3748490, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 abstractC0697x654a0293, java.lang.Void r27) {
        c0216xd3748490.mo3336x5a5ddf8();
        abstractC0697x654a0293.mo5401x5a5ddf8();
        return c0216xd3748490.mo3347x41012807(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$configAndCloseIfNeeded$0 */
    public void m3053xca73019e() {
        this.f205x7d2471fb = false;
        this.f204x31faafd9 = false;
        m3085x20a68ff1("OpenCameraConfigAndClose is done, state: " + this.f215xbec81024);
        int ordinal = this.f215xbec81024.ordinal();
        if (ordinal == 1 || ordinal == 4) {
            m3.h.e(m3095x7bdf14a5(), null);
            m3088x4ec94525();
            return;
        }
        if (ordinal != 6) {
            m3085x20a68ff1("OpenCameraConfigAndClose finished while in state: " + this.f215xbec81024);
        } else {
            if (this.f189xcc70bc00 == 0) {
                m3117x1701a920(false);
                return;
            }
            m3085x20a68ff1("OpenCameraConfigAndClose in error: " + m3044xa8aa7f55(this.f189xcc70bc00));
            this.f216x90ee3089.m3143xa6029eb9();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getOrCreateUserReleaseFuture$6 */
    public /* synthetic */ java.lang.Object m3055x7fd8379(t2.k kVar) {
        m3.h.e(this.f221x1320b9d5 == null, "Camera can only be released once, so release completer should be null on creation.");
        this.f221x1320b9d5 = kVar;
        return "Release[camera=" + this + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$isMeteringRepeatingAttached$13 */
    public /* synthetic */ void m3056x67e29a5b(t2.k kVar) {
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0253xf8939228 c0253xf8939228 = this.f208x41245b95;
        if (c0253xf8939228 == null) {
            kVar.a(java.lang.Boolean.FALSE);
        } else {
            kVar.a(java.lang.Boolean.valueOf(this.f219x8e3506c2.m5724x9e7aa591(m3045x26e1f33(c0253xf8939228))));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$isMeteringRepeatingAttached$14 */
    public /* synthetic */ java.lang.Object m3057x67e29a5c(final t2.k kVar) {
        try {
            this.f202x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$t
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3056x67e29a5b(kVar);
                }
            });
            return "isMeteringRepeatingAttached";
        } catch (java.util.concurrent.RejectedExecutionException unused) {
            kVar.b(new java.lang.RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
            return "isMeteringRepeatingAttached";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$isUseCaseAttached$11 */
    public /* synthetic */ void m3058xbeccd6d0(t2.k kVar, java.lang.String str) {
        kVar.a(java.lang.Boolean.valueOf(this.f219x8e3506c2.m5724x9e7aa591(str)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$isUseCaseAttached$12 */
    public /* synthetic */ java.lang.Object m3059xbeccd6d1(final java.lang.String str, final t2.k kVar) {
        try {
            this.f202x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$i
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3058xbeccd6d0(kVar, str);
                }
            });
            return "isUseCaseAttached";
        } catch (java.util.concurrent.RejectedExecutionException unused) {
            kVar.b(new java.lang.RuntimeException("Unable to check if use case is attached. Camera executor shut down."));
            return "isUseCaseAttached";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onUseCaseActive$7 */
    public /* synthetic */ void m3060x2c083d14(java.lang.String str, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59 interfaceC0768x83509b59, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b, java.util.List list) {
        m3085x20a68ff1("Use case " + str + " ACTIVE");
        this.f219x8e3506c2.m5726x9fd789fb(str, c0750xb915958, interfaceC0768x83509b59, abstractC0756x2f9ad77b, list);
        this.f219x8e3506c2.m5730x9dfb344e(str, c0750xb915958, interfaceC0768x83509b59, abstractC0756x2f9ad77b, list);
        m3118x84f4423b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onUseCaseInactive$8 */
    public /* synthetic */ void m3061x5602827a(java.lang.String str) {
        m3085x20a68ff1("Use case " + str + " INACTIVE");
        this.f219x8e3506c2.m5729x6c497e20(str);
        m3118x84f4423b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onUseCaseUpdated$9 */
    public /* synthetic */ void m3062xd4a19ef5(java.lang.String str, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59 interfaceC0768x83509b59, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b, java.util.List list) {
        m3085x20a68ff1("Use case " + str + " UPDATED");
        this.f219x8e3506c2.m5730x9dfb344e(str, c0750xb915958, interfaceC0768x83509b59, abstractC0756x2f9ad77b, list);
        m3118x84f4423b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$openCameraConfigAndClose$1 */
    public /* synthetic */ java.lang.Object m3063x209946bc(final t2.k kVar) {
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList(this.f219x8e3506c2.m5720x9cebfb21().m5645x59bc66e().m5589xf78bafa9());
            arrayList.add(this.f196xf2ed9167.m3361xb178759b());
            arrayList.add(new android.hardware.camera2.CameraDevice.StateCallback() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl.2
                @Override // android.hardware.camera2.CameraDevice.StateCallback
                public void onClosed(android.hardware.camera2.CameraDevice cameraDevice) {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3085x20a68ff1("openCameraConfigAndClose camera closed");
                    kVar.a(null);
                }

                @Override // android.hardware.camera2.CameraDevice.StateCallback
                public void onDisconnected(android.hardware.camera2.CameraDevice cameraDevice) {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3085x20a68ff1("openCameraConfigAndClose camera disconnected");
                    kVar.a(null);
                }

                @Override // android.hardware.camera2.CameraDevice.StateCallback
                public void onError(android.hardware.camera2.CameraDevice cameraDevice, int i17) {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3085x20a68ff1("openCameraConfigAndClose camera error " + i17);
                    kVar.a(null);
                }

                @Override // android.hardware.camera2.CameraDevice.StateCallback
                public void onOpened(final android.hardware.camera2.CameraDevice cameraDevice) {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3085x20a68ff1("openCameraConfigAndClose camera opened");
                    wa.a m3038x85287c3 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3038x85287c3(cameraDevice);
                    java.util.Objects.requireNonNull(cameraDevice);
                    m3038x85287c3.mo606x162a7075(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$2$$a
                        @Override // java.lang.Runnable
                        public final void run() {
                            cameraDevice.close();
                        }
                    }, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.f202x9ec3a060);
                }
            });
            this.f191x4030095b.m3760xf86b760f(this.f190xf7e2e49d.mo3161x72efd496(), this.f202x9ec3a060, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0208x27708218.m3306x20225057(arrayList));
            return "configAndCloseTask";
        } catch (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0302x1aaa9468 | java.lang.SecurityException e17) {
            m3041x20a68ff1("Unable to open camera for configAndClose: " + e17.getMessage(), e17);
            kVar.b(e17);
            return "configAndCloseTask";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$postSurfaceClosedError$19 */
    public static /* synthetic */ void m3064x9b066280(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.ErrorListener errorListener, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958) {
        errorListener.mo3491xaf8aa769(c0750xb915958, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.SessionError.SESSION_ERROR_SURFACE_NEEDS_RESET);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$release$4 */
    public /* synthetic */ void m3065x7afbb63a(t2.k kVar) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6026xd4b03729(m3075x95125be4(), kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$release$5 */
    public /* synthetic */ java.lang.Object m3066x7afbb63b(final t2.k kVar) {
        this.f202x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$d
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3065x7afbb63a(kVar);
            }
        });
        return "Release[request=" + this.f211x6a367ba.getAndIncrement() + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$resetUseCase$10 */
    public /* synthetic */ void m3067xf068dc5e(java.lang.String str, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59 interfaceC0768x83509b59, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b, java.util.List list) {
        m3085x20a68ff1("Use case " + str + " RESET");
        this.f219x8e3506c2.m5730x9dfb344e(str, c0750xb915958, interfaceC0768x83509b59, abstractC0756x2f9ad77b, list);
        m3035xb8f978f1();
        m3106xe929ab9f(false);
        m3118x84f4423b();
        if (this.f215xbec81024 == p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.OPENED) {
            m3102xf3dae15a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setActiveResumingMode$18 */
    public /* synthetic */ void m3068xe5392d3(boolean z17) {
        this.f203x93c91f6a = z17;
        if (z17 && this.f215xbec81024 == p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.PENDING_OPEN) {
            m3116x5ada9355(false);
        }
    }

    /* renamed from: newCaptureSession */
    private p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0221xac172a89 m3069x3ffcd630() {
        synchronized (this.f207x6243b38) {
            if (this.f214x6e733d29 == null) {
                return new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0216xd3748490(this.f200x26fd722a, this.f190xf7e2e49d.mo3162x25ef6270());
            }
            return new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0256xeb77a83(this.f214x6e733d29, this.f190xf7e2e49d, this.f200x26fd722a, this.f202x9ec3a060, this.f213xf3483782);
        }
    }

    /* renamed from: notifyStateAttachedAndCameraControlReady */
    private void m3070xa433cf16(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> list) {
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137 : list) {
            java.lang.String m3047xc3921a1c = m3047xc3921a1c(abstractC0580x5a5e3137);
            if (!this.f209x8ef25903.contains(m3047xc3921a1c)) {
                this.f209x8ef25903.add(m3047xc3921a1c);
                abstractC0580x5a5e3137.mo4839x934f69b6();
                abstractC0580x5a5e3137.mo4543xec538e4a();
            }
        }
    }

    /* renamed from: notifyStateDetachedToUseCases */
    private void m3071xaf999791(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> list) {
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137 : list) {
            java.lang.String m3047xc3921a1c = m3047xc3921a1c(abstractC0580x5a5e3137);
            if (this.f209x8ef25903.contains(m3047xc3921a1c)) {
                abstractC0580x5a5e3137.mo4544xb1757784();
                this.f209x8ef25903.remove(m3047xc3921a1c);
            }
        }
    }

    /* renamed from: openCameraConfigAndClose */
    private wa.a m3072x949983b2() {
        return t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$u
            @Override // t2.m
            /* renamed from: attachCompleter */
            public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                java.lang.Object m3063x209946bc;
                m3063x209946bc = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3063x209946bc(kVar);
                return m3063x209946bc;
            }
        });
    }

    /* renamed from: openCameraDevice */
    private void m3073x6ec87945(boolean z17) {
        if (!z17) {
            this.f216x90ee3089.m3142x2995f68e();
        }
        this.f216x90ee3089.m3141x1d2030();
        this.f201x2d98ba18.m3127xae7a2e7a();
        m3085x20a68ff1("Opening camera.");
        m3110x53b6854f(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.OPENING);
        try {
            this.f191x4030095b.m3760xf86b760f(this.f190xf7e2e49d.mo3161x72efd496(), this.f202x9ec3a060, m3040xd18fe2a4());
        } catch (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0302x1aaa9468 e17) {
            m3085x20a68ff1("Unable to open camera due to " + e17.getMessage());
            if (e17.m3700x2d5cb53a() != 10001) {
                this.f201x2d98ba18.m3130x68ac462();
            } else {
                m3111x53b6854f(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.INITIALIZED, p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.StateError.m4297xaf65a0fc(7, e17));
            }
        } catch (java.lang.SecurityException e18) {
            m3085x20a68ff1("Unable to open camera due to " + e18.getMessage());
            m3110x53b6854f(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.REOPENING);
            this.f216x90ee3089.m3143xa6029eb9();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: openInternal */
    public void m3074xb6506727() {
        int ordinal = this.f215xbec81024.ordinal();
        if (ordinal == 2 || ordinal == 3) {
            m3116x5ada9355(false);
            return;
        }
        if (ordinal != 4) {
            m3085x20a68ff1("open() ignored due to being in state: " + this.f215xbec81024);
            return;
        }
        m3110x53b6854f(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.REOPENING);
        if (m3095x7bdf14a5() || this.f205x7d2471fb || this.f189xcc70bc00 != 0) {
            return;
        }
        m3.h.e(this.f188x458736e8 != null, "Camera Device should be open if session close is not complete");
        m3110x53b6854f(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.OPENED);
        m3102xf3dae15a();
    }

    /* renamed from: releaseInternal */
    private wa.a m3075x95125be4() {
        wa.a m3046x23e8f4ea = m3046x23e8f4ea();
        switch (this.f215xbec81024.ordinal()) {
            case 1:
            case 4:
            case 5:
            case 6:
            case 7:
                if (!this.f216x90ee3089.m3141x1d2030() && !this.f201x2d98ba18.m3129x4c2fa603()) {
                    r2 = false;
                }
                this.f201x2d98ba18.m3127xae7a2e7a();
                m3110x53b6854f(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.RELEASING);
                if (r2) {
                    m3.h.e(m3095x7bdf14a5(), null);
                    m3039xdac63015();
                }
                return m3046x23e8f4ea;
            case 2:
            case 3:
                m3.h.e(this.f188x458736e8 == null, null);
                m3110x53b6854f(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.RELEASING);
                m3.h.e(m3095x7bdf14a5(), null);
                m3039xdac63015();
                return m3046x23e8f4ea;
            case 8:
            case 9:
                m3110x53b6854f(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.RELEASING);
                m3084xedf4333d(false);
                return m3046x23e8f4ea;
            default:
                m3085x20a68ff1("release() ignored due to being in state: " + this.f215xbec81024);
                return m3046x23e8f4ea;
        }
    }

    /* renamed from: removeMeteringRepeating */
    private void m3076x4b378c8a() {
        if (this.f208x41245b95 != null) {
            this.f219x8e3506c2.m5728xa913ad27(this.f208x41245b95.m3488xfb82e301() + this.f208x41245b95.hashCode());
            this.f219x8e3506c2.m5729x6c497e20(this.f208x41245b95.m3488xfb82e301() + this.f208x41245b95.hashCode());
            this.f208x41245b95.m3485x5a5b64d();
            this.f208x41245b95 = null;
        }
    }

    /* renamed from: resetUseCase */
    private void m3077xd3ba4d08(final java.lang.String str, final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958, final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b59, final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b, final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType> list) {
        this.f202x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$g
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3067xf068dc5e(str, c0750xb915958, interfaceC0768x83509b59, abstractC0756x2f9ad77b, list);
            }
        });
    }

    /* renamed from: toUseCaseInfos */
    private java.util.Collection<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.UseCaseInfo> m3078x333a6889(java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.UseCaseInfo.m3153x3017aa(it.next(), this.f206x45659f8b));
        }
        return arrayList;
    }

    /* renamed from: tryAttachUseCases */
    private void m3079x721439fc(java.util.Collection<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.UseCaseInfo> collection) {
        android.util.Size mo2905xd8479483;
        boolean isEmpty = this.f219x8e3506c2.m5721x42f617b5().isEmpty();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.util.Rational rational = null;
        for (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.UseCaseInfo useCaseInfo : collection) {
            if (!this.f219x8e3506c2.m5724x9e7aa591(useCaseInfo.mo2907xc3921a1c())) {
                this.f219x8e3506c2.m5727x8aed9f59(useCaseInfo.mo2907xc3921a1c(), useCaseInfo.mo2903x9951e5c2(), useCaseInfo.mo2906x111127c3(), useCaseInfo.mo2904xa709b351(), useCaseInfo.mo2902x8e12cf49());
                arrayList.add(useCaseInfo.mo2907xc3921a1c());
                if (useCaseInfo.mo2908x27795ffb() == p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.class && (mo2905xd8479483 = useCaseInfo.mo2905xd8479483()) != null) {
                    rational = new android.util.Rational(mo2905xd8479483.getWidth(), mo2905xd8479483.getHeight());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        m3085x20a68ff1("Use cases [" + android.text.TextUtils.join(", ", arrayList) + "] now ATTACHED");
        if (isEmpty) {
            this.f186x331a4ee8.m2993x37bd608(true);
            this.f186x331a4ee8.m2985x8d860857();
        }
        m3035xb8f978f1();
        m3081x2aeacf2e();
        m3118x84f4423b();
        m3106xe929ab9f(false);
        if (this.f215xbec81024 == p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.OPENED) {
            m3102xf3dae15a();
        } else {
            m3074xb6506727();
        }
        if (rational != null) {
            this.f186x331a4ee8.m2997xf56f3dad(rational);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tryDetachUseCases, reason: merged with bridge method [inline-methods] */
    public void m3054x6f896c9d(java.util.Collection<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.UseCaseInfo> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z17 = false;
        for (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.UseCaseInfo useCaseInfo : collection) {
            if (this.f219x8e3506c2.m5724x9e7aa591(useCaseInfo.mo2907xc3921a1c())) {
                this.f219x8e3506c2.m5725x3e675c33(useCaseInfo.mo2907xc3921a1c());
                arrayList.add(useCaseInfo.mo2907xc3921a1c());
                if (useCaseInfo.mo2908x27795ffb() == p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.class) {
                    z17 = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        m3085x20a68ff1("Use cases [" + android.text.TextUtils.join(", ", arrayList) + "] now DETACHED for camera");
        if (z17) {
            this.f186x331a4ee8.m2997xf56f3dad(null);
        }
        m3035xb8f978f1();
        if (this.f219x8e3506c2.m5722xc31f15d4().isEmpty()) {
            this.f186x331a4ee8.mo3001xc45bf941(false);
        } else {
            m3081x2aeacf2e();
        }
        if (this.f219x8e3506c2.m5721x42f617b5().isEmpty()) {
            this.f186x331a4ee8.m2960xc13e57b();
            m3106xe929ab9f(false);
            this.f186x331a4ee8.m2993x37bd608(false);
            this.f194x15e0c23d = m3069x3ffcd630();
            m3037x6c9e90d5();
            return;
        }
        m3118x84f4423b();
        m3106xe929ab9f(false);
        if (this.f215xbec81024 == p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.OPENED) {
            m3102xf3dae15a();
        }
    }

    /* renamed from: updateZslDisabledByUseCaseConfigStatus */
    private void m3081x2aeacf2e() {
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>> it = this.f219x8e3506c2.m5722xc31f15d4().iterator();
        boolean z17 = false;
        while (it.hasNext()) {
            z17 |= it.next().m5757xfecf1065(false);
        }
        this.f186x331a4ee8.mo3001xc45bf941(z17);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522
    /* renamed from: attachUseCases */
    public void mo3082x352acf61(java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        this.f186x331a4ee8.m2985x8d860857();
        m3070xa433cf16(new java.util.ArrayList<>(arrayList));
        final java.util.ArrayList arrayList2 = new java.util.ArrayList(m3078x333a6889(arrayList));
        try {
            this.f202x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$n
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3050xb517d2aa(arrayList2);
                }
            });
        } catch (java.util.concurrent.RejectedExecutionException e17) {
            m3041x20a68ff1("Unable to attach use cases.", e17);
            this.f186x331a4ee8.m2960xc13e57b();
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522
    /* renamed from: close */
    public void mo3083x5a5ddf8() {
        this.f202x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$m
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3037x6c9e90d5();
            }
        });
    }

    /* renamed from: closeCamera */
    public void m3084xedf4333d(boolean z17) {
        m3.h.e(this.f215xbec81024 == p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.CLOSING || this.f215xbec81024 == p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.RELEASING || (this.f215xbec81024 == p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.REOPENING && this.f189xcc70bc00 != 0), "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.f215xbec81024 + " (error: " + m3044xa8aa7f55(this.f189xcc70bc00) + ")");
        m3106xe929ab9f(z17);
        this.f194x15e0c23d.mo3335x247bf0a5();
    }

    /* renamed from: debugLog */
    public void m3085x20a68ff1(java.lang.String str) {
        m3041x20a68ff1(str, null);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522
    /* renamed from: detachUseCases */
    public void mo3086xe116caaf(java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        final java.util.ArrayList arrayList2 = new java.util.ArrayList(m3078x333a6889(arrayList));
        m3071xaf999791(new java.util.ArrayList<>(arrayList));
        this.f202x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$k
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3054x6f896c9d(arrayList2);
            }
        });
    }

    /* renamed from: findSessionConfigForSurface */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 m3087x5da9c543(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 abstractC0697x654a0293) {
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958 : this.f219x8e3506c2.m5721x42f617b5()) {
            if (c0750xb915958.m5601x1b8de6dc().contains(abstractC0697x654a0293)) {
                return c0750xb915958;
            }
        }
        return null;
    }

    /* renamed from: finishClose */
    public void m3088x4ec94525() {
        m3.h.e(this.f215xbec81024 == p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.RELEASING || this.f215xbec81024 == p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.CLOSING, null);
        m3.h.e(this.f212x9ce39fd9.isEmpty(), null);
        this.f188x458736e8 = null;
        if (this.f215xbec81024 == p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.CLOSING) {
            m3110x53b6854f(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.INITIALIZED);
            return;
        }
        this.f191x4030095b.m3762x1f76611c(this.f182x8807f86d);
        m3110x53b6854f(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.RELEASED);
        t2.k kVar = this.f221x1320b9d5;
        if (kVar != null) {
            kVar.a(null);
            this.f221x1320b9d5 = null;
        }
    }

    /* renamed from: getCameraAvailability */
    public p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.CameraAvailability m3089x9c14ff16() {
        return this.f182x8807f86d;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522
    /* renamed from: getCameraControlInternal */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0669xec29d935 mo3090x8af45b9f() {
        return this.f186x331a4ee8;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522
    /* renamed from: getCameraInfoInternal */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570 mo3091xbefeb46() {
        return this.f190xf7e2e49d;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522
    /* renamed from: getCameraState */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0734x770dd163<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State> mo3092x53e98736() {
        return this.f210x46bfe0e1;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0465x77deaf45
    /* renamed from: getExtendedConfig */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0665xb691d6e7 mo3093x13f11ad1() {
        return this.f184x445b9bd4;
    }

    /* renamed from: isMeteringRepeatingAttached */
    public boolean m3094x3d1b9668() {
        try {
            return ((java.lang.Boolean) ((t2.o) t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$r
                @Override // t2.m
                /* renamed from: attachCompleter */
                public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                    java.lang.Object m3057x67e29a5c;
                    m3057x67e29a5c = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3057x67e29a5c(kVar);
                    return m3057x67e29a5c;
                }
            })).get()).booleanValue();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e17) {
            throw new java.lang.RuntimeException("Unable to check if MeteringRepeating is attached.", e17);
        }
    }

    /* renamed from: isSessionCloseComplete */
    public boolean m3095x7bdf14a5() {
        return this.f212x9ce39fd9.isEmpty();
    }

    /* renamed from: isUseCaseAttached */
    public boolean m3096x9e7aa591(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137) {
        try {
            final java.lang.String m3047xc3921a1c = m3047xc3921a1c(abstractC0580x5a5e3137);
            return ((java.lang.Boolean) ((t2.o) t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$f
                @Override // t2.m
                /* renamed from: attachCompleter */
                public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                    java.lang.Object m3059xbeccd6d1;
                    m3059xbeccd6d1 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3059xbeccd6d1(m3047xc3921a1c, kVar);
                    return m3059xbeccd6d1;
                }
            })).get()).booleanValue();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e17) {
            throw new java.lang.RuntimeException("Unable to check if use case is attached.", e17);
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137.StateChangeCallback
    /* renamed from: onUseCaseActive */
    public void mo3097x82b04b9e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137) {
        abstractC0580x5a5e3137.getClass();
        final java.lang.String m3047xc3921a1c = m3047xc3921a1c(abstractC0580x5a5e3137);
        final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 m4826x9951e5c2 = this.f206x45659f8b ? abstractC0580x5a5e3137.m4826x9951e5c2() : abstractC0580x5a5e3137.m4824xd31a5b5a();
        final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> m4814x27802a65 = abstractC0580x5a5e3137.m4814x27802a65();
        final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b m4809xfdddfa15 = abstractC0580x5a5e3137.m4809xfdddfa15();
        final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType> m3043x8e12cf49 = m3043x8e12cf49(abstractC0580x5a5e3137);
        this.f202x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$b
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3060x2c083d14(m3047xc3921a1c, m4826x9951e5c2, m4814x27802a65, m4809xfdddfa15, m3043x8e12cf49);
            }
        });
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137.StateChangeCallback
    /* renamed from: onUseCaseInactive */
    public void mo3098xfbf86303(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137) {
        abstractC0580x5a5e3137.getClass();
        final java.lang.String m3047xc3921a1c = m3047xc3921a1c(abstractC0580x5a5e3137);
        this.f202x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$a
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3061x5602827a(m3047xc3921a1c);
            }
        });
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137.StateChangeCallback
    /* renamed from: onUseCaseReset */
    public void mo3099xdbdd5db7(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137) {
        abstractC0580x5a5e3137.getClass();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 m4826x9951e5c2 = this.f206x45659f8b ? abstractC0580x5a5e3137.m4826x9951e5c2() : abstractC0580x5a5e3137.m4824xd31a5b5a();
        m3077xd3ba4d08(m3047xc3921a1c(abstractC0580x5a5e3137), m4826x9951e5c2, abstractC0580x5a5e3137.m4814x27802a65(), abstractC0580x5a5e3137.m4809xfdddfa15(), m3043x8e12cf49(abstractC0580x5a5e3137));
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137.StateChangeCallback
    /* renamed from: onUseCaseUpdated */
    public void mo3100xa9fa723(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137) {
        abstractC0580x5a5e3137.getClass();
        final java.lang.String m3047xc3921a1c = m3047xc3921a1c(abstractC0580x5a5e3137);
        final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 m4826x9951e5c2 = this.f206x45659f8b ? abstractC0580x5a5e3137.m4826x9951e5c2() : abstractC0580x5a5e3137.m4824xd31a5b5a();
        final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> m4814x27802a65 = abstractC0580x5a5e3137.m4814x27802a65();
        final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b m4809xfdddfa15 = abstractC0580x5a5e3137.m4809xfdddfa15();
        final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType> m3043x8e12cf49 = m3043x8e12cf49(abstractC0580x5a5e3137);
        this.f202x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$e
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3062xd4a19ef5(m3047xc3921a1c, m4826x9951e5c2, m4814x27802a65, m4809xfdddfa15, m3043x8e12cf49);
            }
        });
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522
    /* renamed from: open */
    public void mo3101x34264a() {
        this.f202x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$h
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3074xb6506727();
            }
        });
    }

    /* renamed from: openCaptureSession */
    public void m3102xf3dae15a() {
        m3.h.e(this.f215xbec81024 == p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.OPENED, null);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.ValidatingBuilder m5720x9cebfb21 = this.f219x8e3506c2.m5720x9cebfb21();
        if (!m5720x9cebfb21.m5647x7b953cf2()) {
            m3085x20a68ff1("Unable to create capture session due to conflicting configurations");
            return;
        }
        if (!this.f193x2504b71c.m5316x72878675(this.f188x458736e8.getId(), this.f187x9969adde.mo4123xe5cebc46(this.f188x458736e8.getId()))) {
            m3085x20a68ff1("Unable to create capture session in camera operating mode = " + this.f187x9969adde.mo4121x7ef94829());
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0262xd4b76239.m3537xc1387a75(this.f219x8e3506c2.m5721x42f617b5(), this.f219x8e3506c2.m5722xc31f15d4(), hashMap);
        this.f194x15e0c23d.mo3349x8d2f48a7(hashMap);
        final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0221xac172a89 interfaceC0221xac172a89 = this.f194x15e0c23d;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 m5645x59bc66e = m5720x9cebfb21.m5645x59bc66e();
        android.hardware.camera2.CameraDevice cameraDevice = this.f188x458736e8;
        cameraDevice.getClass();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6007xbba9cc06(interfaceC0221xac172a89.mo3346x34264a(m5645x59bc66e, cameraDevice, this.f195x3af653e7.m3609x59bc66e()), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48<java.lang.Void>() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl.4
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48
            /* renamed from: onFailure */
            public void mo3120xee232ab(java.lang.Throwable th6) {
                if (th6 instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293.SurfaceClosedException) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 m3087x5da9c543 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3087x5da9c543(((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293.SurfaceClosedException) th6).m5413xcdba49fd());
                    if (m3087x5da9c543 != null) {
                        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3103xcbfc6dcf(m3087x5da9c543);
                        return;
                    }
                    return;
                }
                if (th6 instanceof java.util.concurrent.CancellationException) {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3085x20a68ff1("Unable to configure camera cancelled");
                    return;
                }
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState internalState = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.f215xbec81024;
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState internalState2 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.OPENED;
                if (internalState == internalState2) {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3111x53b6854f(internalState2, p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.StateError.m4297xaf65a0fc(4, th6));
                }
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.TAG, "Unable to configure camera " + p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this, th6);
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852 c0133x27d8c852 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this;
                if (c0133x27d8c852.f194x15e0c23d == interfaceC0221xac172a89) {
                    c0133x27d8c852.m3106xe929ab9f(false);
                }
            }

            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48
            /* renamed from: onSuccess, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public void mo3121xe05b4124(java.lang.Void r27) {
                if (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.f187x9969adde.mo4121x7ef94829() == 2 && p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.f215xbec81024 == p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.OPENED) {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3110x53b6854f(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.CONFIGURED);
                }
            }
        }, this.f202x9ec3a060);
    }

    /* renamed from: postSurfaceClosedError */
    public void m3103xcbfc6dcf(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958) {
        java.util.concurrent.ScheduledExecutorService m5982x891c9b16 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5982x891c9b16();
        final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.ErrorListener m5590xd86d2f26 = c0750xb915958.m5590xd86d2f26();
        if (m5590xd86d2f26 != null) {
            m3041x20a68ff1("Posting surface closed", new java.lang.Throwable());
            m5982x891c9b16.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$c
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.m3064x9b066280(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.ErrorListener.this, c0750xb915958);
                }
            });
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522
    /* renamed from: release */
    public wa.a mo3104x41012807() {
        return t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$v
            @Override // t2.m
            /* renamed from: attachCompleter */
            public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                java.lang.Object m3066x7afbb63b;
                m3066x7afbb63b = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3066x7afbb63b(kVar);
                return m3066x7afbb63b;
            }
        });
    }

    /* renamed from: releaseSession */
    public wa.a m3105xab932c8f(final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0221xac172a89 interfaceC0221xac172a89, boolean z17) {
        interfaceC0221xac172a89.mo3336x5a5ddf8();
        wa.a mo3347x41012807 = interfaceC0221xac172a89.mo3347x41012807(z17);
        m3085x20a68ff1("Releasing session in state " + this.f215xbec81024.name());
        this.f212x9ce39fd9.put(interfaceC0221xac172a89, mo3347x41012807);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6007xbba9cc06(mo3347x41012807, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48<java.lang.Void>() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl.3
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48
            /* renamed from: onFailure */
            public void mo3120xee232ab(java.lang.Throwable th6) {
            }

            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48
            /* renamed from: onSuccess, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public void mo3121xe05b4124(java.lang.Void r27) {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.f212x9ce39fd9.remove(interfaceC0221xac172a89);
                int ordinal = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.f215xbec81024.ordinal();
                if (ordinal != 1 && ordinal != 4) {
                    if (ordinal != 5 && (ordinal != 6 || p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.f189xcc70bc00 == 0)) {
                        return;
                    } else {
                        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3085x20a68ff1("Camera reopen required. Checking if the current camera can be closed safely.");
                    }
                }
                if (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3095x7bdf14a5()) {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852 c0133x27d8c852 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this;
                    if (c0133x27d8c852.f188x458736e8 != null) {
                        c0133x27d8c852.m3085x20a68ff1("closing camera");
                        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0301x42f63e1c.Api21Impl.m3689x5a5ddf8(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.f188x458736e8);
                        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.f188x458736e8 = null;
                    }
                }
            }
        }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc());
        return mo3347x41012807;
    }

    /* renamed from: resetCaptureSession */
    public void m3106xe929ab9f(boolean z17) {
        m3.h.e(this.f194x15e0c23d != null, null);
        m3085x20a68ff1("Resetting Capture Session");
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0221xac172a89 interfaceC0221xac172a89 = this.f194x15e0c23d;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 mo3339x9951e5c2 = interfaceC0221xac172a89.mo3339x9951e5c2();
        java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08> mo3338xc025e841 = interfaceC0221xac172a89.mo3338xc025e841();
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0221xac172a89 m3069x3ffcd630 = m3069x3ffcd630();
        this.f194x15e0c23d = m3069x3ffcd630;
        m3069x3ffcd630.mo3348x2c284c36(mo3339x9951e5c2);
        this.f194x15e0c23d.mo3343xbe8e0711(mo3338xc025e841);
        if (this.f215xbec81024.ordinal() != 8) {
            m3085x20a68ff1("Skipping Capture Session state check due to current camera state: " + this.f215xbec81024 + " and previous session status: " + interfaceC0221xac172a89.mo3341x8844b538());
        } else if (this.f197xd2d13efd && interfaceC0221xac172a89.mo3341x8844b538()) {
            m3085x20a68ff1("Close camera before creating new session");
            m3110x53b6854f(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.REOPENING_QUIRK);
        }
        if (this.f198xf533200e && interfaceC0221xac172a89.mo3341x8844b538()) {
            m3085x20a68ff1("ConfigAndClose is required when close the camera.");
            this.f204x31faafd9 = true;
        }
        m3105xab932c8f(interfaceC0221xac172a89, z17);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522
    /* renamed from: setActiveResumingMode */
    public void mo3107x2bcb495(final boolean z17) {
        this.f202x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$p
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.this.m3068xe5392d3(z17);
            }
        });
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522
    /* renamed from: setExtendedConfig */
    public void mo3108xdbe782dd(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0665xb691d6e7 interfaceC0665xb691d6e7) {
        if (interfaceC0665xb691d6e7 == null) {
            interfaceC0665xb691d6e7 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0668x1ba9066c.m5276x1e74d0e3();
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc m5260xf033da12 = interfaceC0665xb691d6e7.m5260xf033da12(null);
        this.f184x445b9bd4 = interfaceC0665xb691d6e7;
        synchronized (this.f207x6243b38) {
            this.f214x6e733d29 = m5260xf033da12;
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522
    /* renamed from: setPrimary */
    public void mo3109x9e7b9740(boolean z17) {
        this.f206x45659f8b = z17;
    }

    /* renamed from: setState */
    public void m3110x53b6854f(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState internalState) {
        m3111x53b6854f(internalState, null);
    }

    /* renamed from: submitCaptureRequests */
    public void m3113x6eb429f2(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08 c0690x88f65a08 : list) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.Builder m5342x3017aa = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.Builder.m5342x3017aa(c0690x88f65a08);
            if (c0690x88f65a08.m5337x26c6954a() == 5 && c0690x88f65a08.m5330xedfdbca8() != null) {
                m5342x3017aa.m5360x3c427c1c(c0690x88f65a08.m5330xedfdbca8());
            }
            if (!c0690x88f65a08.m5335x1b8de6dc().isEmpty() || !c0690x88f65a08.m5340x4b66b463() || m3036x49ca93a(m5342x3017aa)) {
                arrayList.add(m5342x3017aa.m5350x59bc66e());
            }
        }
        m3085x20a68ff1("Issue capture request");
        this.f194x15e0c23d.mo3343xbe8e0711(arrayList);
    }

    /* renamed from: toString */
    public java.lang.String m3114x9616526c() {
        return java.lang.String.format(java.util.Locale.US, "Camera@%x[id=%s]", java.lang.Integer.valueOf(hashCode()), this.f190xf7e2e49d.mo3161x72efd496());
    }

    /* renamed from: traceInternalState */
    public void m3115xee35f28f(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState internalState, p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.StateError stateError) {
        if (t4.a.d()) {
            t4.a.e("CX:C2State[" + this + "]", internalState.ordinal());
            if (stateError != null) {
                this.f218x8b6ba360++;
            }
            if (this.f218x8b6ba360 > 0) {
                t4.a.e("CX:C2StateErrorCode[" + this + "]", stateError != null ? stateError.mo4200xfb7e1663() : 0);
            }
        }
    }

    /* renamed from: tryForceOpenCameraDevice */
    public void m3116x5ada9355(boolean z17) {
        m3085x20a68ff1("Attempting to force open the camera.");
        if (this.f193x2504b71c.m5315x4fd0662a(this)) {
            m3073x6ec87945(z17);
        } else {
            m3085x20a68ff1("No cameras available. Waiting for available camera before opening camera.");
            m3110x53b6854f(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.PENDING_OPEN);
        }
    }

    /* renamed from: tryOpenCameraDevice */
    public void m3117x1701a920(boolean z17) {
        m3085x20a68ff1("Attempting to open the camera.");
        if (this.f182x8807f86d.m3122x43e8129a() && this.f193x2504b71c.m5315x4fd0662a(this)) {
            m3073x6ec87945(z17);
        } else {
            m3085x20a68ff1("No cameras available. Waiting for available camera before opening camera.");
            m3110x53b6854f(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState.PENDING_OPEN);
        }
    }

    /* renamed from: updateCaptureSessionConfig */
    public void m3118x84f4423b() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.ValidatingBuilder m5718x9217f59c = this.f219x8e3506c2.m5718x9217f59c();
        if (!m5718x9217f59c.m5647x7b953cf2()) {
            this.f186x331a4ee8.m2992x673c8ee9();
            this.f194x15e0c23d.mo3348x2c284c36(this.f186x331a4ee8.mo2977x9951e5c2());
            return;
        }
        this.f186x331a4ee8.m2999x27cd6afc(m5718x9217f59c.m5645x59bc66e().m5602x26c6954a());
        m5718x9217f59c.add(this.f186x331a4ee8.mo2977x9951e5c2());
        this.f194x15e0c23d.mo3348x2c284c36(m5718x9217f59c.m5645x59bc66e());
    }

    /* renamed from: debugLog */
    private void m3041x20a68ff1(java.lang.String str, java.lang.Throwable th6) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, java.lang.String.format("{%s} %s", m3114x9616526c(), str), th6);
    }

    /* renamed from: setState */
    public void m3111x53b6854f(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState internalState, p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.StateError stateError) {
        m3112x53b6854f(internalState, stateError, true);
    }

    /* renamed from: setState */
    public void m3112x53b6854f(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.InternalState internalState, p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.StateError stateError, boolean z17) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State state;
        m3085x20a68ff1("Transitioning camera internal state: " + this.f215xbec81024 + " --> " + internalState);
        m3115xee35f28f(internalState, stateError);
        this.f215xbec81024 = internalState;
        switch (internalState) {
            case RELEASED:
                state = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State.RELEASED;
                break;
            case RELEASING:
                state = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State.RELEASING;
                break;
            case INITIALIZED:
                state = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State.CLOSED;
                break;
            case PENDING_OPEN:
                state = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State.PENDING_OPEN;
                break;
            case CLOSING:
            case REOPENING_QUIRK:
                state = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State.CLOSING;
                break;
            case REOPENING:
            case OPENING:
                state = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State.OPENING;
                break;
            case OPENED:
                state = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State.OPEN;
                break;
            case CONFIGURED:
                state = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State.CONFIGURED;
                break;
            default:
                throw new java.lang.IllegalStateException("Unknown state: " + internalState);
        }
        this.f193x2504b71c.m5313x228b8f5f(this, state, z17);
        this.f210x46bfe0e1.m5506x76db6cb1(state);
        this.f192x4c7ce588.m3314xdd28b148(state, stateError);
    }
}
