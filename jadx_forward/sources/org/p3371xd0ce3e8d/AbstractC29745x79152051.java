package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.CameraCapturer */
/* loaded from: classes16.dex */
abstract class AbstractC29745x79152051 implements org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842 {

    /* renamed from: MAX_OPEN_CAMERA_ATTEMPTS */
    private static final int f75188x4c82ef46 = 3;

    /* renamed from: OPEN_CAMERA_DELAY_MS */
    private static final int f75189xcf0461e7 = 500;

    /* renamed from: OPEN_CAMERA_TIMEOUT */
    private static final int f75190x2225f4bc = 10000;
    private static final java.lang.String TAG = "CameraCapturer";

    /* renamed from: applicationContext */
    private android.content.Context f75191x5b0a2e3f;

    /* renamed from: cameraEnumerator */
    private final org.p3371xd0ce3e8d.InterfaceC29747x7225d0e9 f75192xa4618cc9;

    /* renamed from: cameraName */
    private java.lang.String f75193x880e9750;

    /* renamed from: cameraStatistics */
    private org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842.CameraStatistics f75195xd59e6628;

    /* renamed from: cameraThreadHandler */
    private android.os.Handler f75196x542b52bb;

    /* renamed from: capturerObserver */
    private org.p3371xd0ce3e8d.InterfaceC29751x4bd47102 f75197x7e102ce2;

    /* renamed from: currentSession */
    private org.p3371xd0ce3e8d.InterfaceC29748x5948a391 f75199x178cf2dd;

    /* renamed from: eventsHandler */
    private final org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842.CameraEventsHandler f75200xc10a4ff1;

    /* renamed from: firstFrameObserved */
    private boolean f75201x3b4ede85;

    /* renamed from: framerate */
    private int f75202x208b77cd;

    /* renamed from: height */
    private int f75203xb7389127;

    /* renamed from: openAttemptsRemaining */
    private int f75204xb89a4c26;

    /* renamed from: pendingCameraName */
    private java.lang.String f75206x28bf2c47;

    /* renamed from: sessionOpening */
    private boolean f75207x1e5775e2;

    /* renamed from: surfaceHelper */
    private org.p3371xd0ce3e8d.C29864x472c891c f75209x59df2bb;

    /* renamed from: switchEventsHandler */
    private org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842.CameraSwitchHandler f75210x81bc1d1d;

    /* renamed from: uiThreadHandler */
    private final android.os.Handler f75212x15a153ac;

    /* renamed from: width */
    private int f75213x6be2dc6;

    /* renamed from: createSessionCallback */
    private final org.p3371xd0ce3e8d.InterfaceC29748x5948a391.CreateSessionCallback f75198xb52d905f = new org.p3371xd0ce3e8d.InterfaceC29748x5948a391.CreateSessionCallback() { // from class: org.webrtc.CameraCapturer.1
        @Override // org.p3371xd0ce3e8d.InterfaceC29748x5948a391.CreateSessionCallback
        /* renamed from: onDone */
        public void mo155291xc3989e01(org.p3371xd0ce3e8d.InterfaceC29748x5948a391 interfaceC29748x5948a391) {
            org.p3371xd0ce3e8d.AbstractC29745x79152051.this.m155286x8ba33a00();
            org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.AbstractC29745x79152051.TAG, "Create session done. Switch state: " + org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75211x7e427dbd);
            org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75212x15a153ac.removeCallbacks(org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75205x87e3158f);
            synchronized (org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75208x83a84d5c) {
                org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75197x7e102ce2.mo155342x5e404516(true);
                org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75207x1e5775e2 = false;
                org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75199x178cf2dd = interfaceC29748x5948a391;
                org.p3371xd0ce3e8d.AbstractC29745x79152051 abstractC29745x79152051 = org.p3371xd0ce3e8d.AbstractC29745x79152051.this;
                abstractC29745x79152051.f75195xd59e6628 = new org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842.CameraStatistics(abstractC29745x79152051.f75209x59df2bb, org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75200xc10a4ff1);
                org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75201x3b4ede85 = false;
                org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75208x83a84d5c.notifyAll();
                if (org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75211x7e427dbd == org.p3371xd0ce3e8d.AbstractC29745x79152051.SwitchState.IN_PROGRESS) {
                    org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75211x7e427dbd = org.p3371xd0ce3e8d.AbstractC29745x79152051.SwitchState.IDLE;
                    if (org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75210x81bc1d1d != null) {
                        org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75210x81bc1d1d.m155338x7889fdda(org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75192xa4618cc9.mo155172x298133d9(org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75193x880e9750));
                        org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75210x81bc1d1d = null;
                    }
                } else if (org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75211x7e427dbd == org.p3371xd0ce3e8d.AbstractC29745x79152051.SwitchState.PENDING) {
                    java.lang.String str = org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75206x28bf2c47;
                    org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75206x28bf2c47 = null;
                    org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75211x7e427dbd = org.p3371xd0ce3e8d.AbstractC29745x79152051.SwitchState.IDLE;
                    org.p3371xd0ce3e8d.AbstractC29745x79152051 abstractC29745x791520512 = org.p3371xd0ce3e8d.AbstractC29745x79152051.this;
                    abstractC29745x791520512.m155289x2f4cd156(abstractC29745x791520512.f75210x81bc1d1d, str);
                }
            }
        }

        @Override // org.p3371xd0ce3e8d.InterfaceC29748x5948a391.CreateSessionCallback
        /* renamed from: onFailure */
        public void mo155292xee232ab(org.p3371xd0ce3e8d.InterfaceC29748x5948a391.FailureType failureType, java.lang.String str) {
            org.p3371xd0ce3e8d.AbstractC29745x79152051.this.m155286x8ba33a00();
            org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75212x15a153ac.removeCallbacks(org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75205x87e3158f);
            synchronized (org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75208x83a84d5c) {
                org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75197x7e102ce2.mo155342x5e404516(false);
                org.p3371xd0ce3e8d.AbstractC29745x79152051.m155267xbf187205(org.p3371xd0ce3e8d.AbstractC29745x79152051.this);
                if (org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75204xb89a4c26 <= 0) {
                    org.p3371xd0ce3e8d.C29806x779f633f.w(org.p3371xd0ce3e8d.AbstractC29745x79152051.TAG, "Opening camera failed, passing: " + str);
                    org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75207x1e5775e2 = false;
                    org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75208x83a84d5c.notifyAll();
                    org.p3371xd0ce3e8d.AbstractC29745x79152051.SwitchState switchState = org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75211x7e427dbd;
                    org.p3371xd0ce3e8d.AbstractC29745x79152051.SwitchState switchState2 = org.p3371xd0ce3e8d.AbstractC29745x79152051.SwitchState.IDLE;
                    if (switchState != switchState2) {
                        if (org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75210x81bc1d1d != null) {
                            org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75210x81bc1d1d.m155339x98c542b0(str);
                            org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75210x81bc1d1d = null;
                        }
                        org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75211x7e427dbd = switchState2;
                    }
                    if (failureType == org.p3371xd0ce3e8d.InterfaceC29748x5948a391.FailureType.DISCONNECTED) {
                        org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75200xc10a4ff1.mo155299xfb77e63f();
                    } else {
                        org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75200xc10a4ff1.mo155300x95dbd684(str);
                    }
                } else {
                    org.p3371xd0ce3e8d.C29806x779f633f.w(org.p3371xd0ce3e8d.AbstractC29745x79152051.TAG, "Opening camera failed, retry: " + str);
                    org.p3371xd0ce3e8d.AbstractC29745x79152051.this.m155287xe17136d7(500);
                }
            }
        }
    };

    /* renamed from: cameraSessionEventsHandler */
    private final org.p3371xd0ce3e8d.InterfaceC29748x5948a391.Events f75194x4d8b53c0 = new org.p3371xd0ce3e8d.InterfaceC29748x5948a391.Events() { // from class: org.webrtc.CameraCapturer.2
        @Override // org.p3371xd0ce3e8d.InterfaceC29748x5948a391.Events
        /* renamed from: onCameraClosed */
        public void mo155293x21df6c70(org.p3371xd0ce3e8d.InterfaceC29748x5948a391 interfaceC29748x5948a391) {
            org.p3371xd0ce3e8d.AbstractC29745x79152051.this.m155286x8ba33a00();
            synchronized (org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75208x83a84d5c) {
                if (interfaceC29748x5948a391 == org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75199x178cf2dd || org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75199x178cf2dd == null) {
                    org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75200xc10a4ff1.mo155298x21df6c70();
                } else {
                    org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.AbstractC29745x79152051.TAG, "onCameraClosed from another session.");
                }
            }
        }

        @Override // org.p3371xd0ce3e8d.InterfaceC29748x5948a391.Events
        /* renamed from: onCameraDisconnected */
        public void mo155294xfb77e63f(org.p3371xd0ce3e8d.InterfaceC29748x5948a391 interfaceC29748x5948a391) {
            org.p3371xd0ce3e8d.AbstractC29745x79152051.this.m155286x8ba33a00();
            synchronized (org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75208x83a84d5c) {
                if (interfaceC29748x5948a391 != org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75199x178cf2dd) {
                    org.p3371xd0ce3e8d.C29806x779f633f.w(org.p3371xd0ce3e8d.AbstractC29745x79152051.TAG, "onCameraDisconnected from another session.");
                } else {
                    org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75200xc10a4ff1.mo155299xfb77e63f();
                    org.p3371xd0ce3e8d.AbstractC29745x79152051.this.mo155158xd45bb0e4();
                }
            }
        }

        @Override // org.p3371xd0ce3e8d.InterfaceC29748x5948a391.Events
        /* renamed from: onCameraError */
        public void mo155295x95dbd684(org.p3371xd0ce3e8d.InterfaceC29748x5948a391 interfaceC29748x5948a391, java.lang.String str) {
            org.p3371xd0ce3e8d.AbstractC29745x79152051.this.m155286x8ba33a00();
            synchronized (org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75208x83a84d5c) {
                if (interfaceC29748x5948a391 == org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75199x178cf2dd) {
                    org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75200xc10a4ff1.mo155300x95dbd684(str);
                    org.p3371xd0ce3e8d.AbstractC29745x79152051.this.mo155158xd45bb0e4();
                } else {
                    org.p3371xd0ce3e8d.C29806x779f633f.w(org.p3371xd0ce3e8d.AbstractC29745x79152051.TAG, "onCameraError from another session: " + str);
                }
            }
        }

        @Override // org.p3371xd0ce3e8d.InterfaceC29748x5948a391.Events
        /* renamed from: onCameraOpening */
        public void mo155296x9b1d2ad4() {
            org.p3371xd0ce3e8d.AbstractC29745x79152051.this.m155286x8ba33a00();
            synchronized (org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75208x83a84d5c) {
                if (org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75199x178cf2dd != null) {
                    org.p3371xd0ce3e8d.C29806x779f633f.w(org.p3371xd0ce3e8d.AbstractC29745x79152051.TAG, "onCameraOpening while session was open.");
                } else {
                    org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75200xc10a4ff1.mo155302x9b1d2ad4(org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75193x880e9750);
                }
            }
        }

        @Override // org.p3371xd0ce3e8d.InterfaceC29748x5948a391.Events
        /* renamed from: onFrameCaptured */
        public void mo155297x962f56cc(org.p3371xd0ce3e8d.InterfaceC29748x5948a391 interfaceC29748x5948a391, org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d2) {
            org.p3371xd0ce3e8d.AbstractC29745x79152051.this.m155286x8ba33a00();
            synchronized (org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75208x83a84d5c) {
                if (interfaceC29748x5948a391 != org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75199x178cf2dd) {
                    org.p3371xd0ce3e8d.C29806x779f633f.w(org.p3371xd0ce3e8d.AbstractC29745x79152051.TAG, "onFrameCaptured from another session.");
                    return;
                }
                if (!org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75201x3b4ede85) {
                    org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75200xc10a4ff1.mo155303xc73bce4d();
                    org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75201x3b4ede85 = true;
                }
                org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75195xd59e6628.m155336xb4f57d4c();
                org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75197x7e102ce2.mo155344x962f56cc(c29904x150215d2);
            }
        }
    };

    /* renamed from: openCameraTimeoutRunnable */
    private final java.lang.Runnable f75205x87e3158f = new java.lang.Runnable() { // from class: org.webrtc.CameraCapturer.3
        @Override // java.lang.Runnable
        public void run() {
            org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75200xc10a4ff1.mo155300x95dbd684("Camera failed to start within timeout.");
        }
    };

    /* renamed from: stateLock */
    private final java.lang.Object f75208x83a84d5c = new java.lang.Object();

    /* renamed from: switchState */
    private org.p3371xd0ce3e8d.AbstractC29745x79152051.SwitchState f75211x7e427dbd = org.p3371xd0ce3e8d.AbstractC29745x79152051.SwitchState.IDLE;

    /* renamed from: org.webrtc.CameraCapturer$SwitchState */
    /* loaded from: classes16.dex */
    public enum SwitchState {
        IDLE,
        PENDING,
        IN_PROGRESS
    }

    public AbstractC29745x79152051(java.lang.String str, org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842.CameraEventsHandler cameraEventsHandler, org.p3371xd0ce3e8d.InterfaceC29747x7225d0e9 interfaceC29747x7225d0e9) {
        this.f75200xc10a4ff1 = cameraEventsHandler == null ? new org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842.CameraEventsHandler() { // from class: org.webrtc.CameraCapturer.4
            @Override // org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842.CameraEventsHandler
            /* renamed from: onCameraClosed */
            public void mo155298x21df6c70() {
            }

            @Override // org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842.CameraEventsHandler
            /* renamed from: onCameraDisconnected */
            public void mo155299xfb77e63f() {
            }

            @Override // org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842.CameraEventsHandler
            /* renamed from: onCameraError */
            public void mo155300x95dbd684(java.lang.String str2) {
            }

            @Override // org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842.CameraEventsHandler
            /* renamed from: onCameraFreezed */
            public void mo155301xc26aee29(java.lang.String str2) {
            }

            @Override // org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842.CameraEventsHandler
            /* renamed from: onCameraOpening */
            public void mo155302x9b1d2ad4(java.lang.String str2) {
            }

            @Override // org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842.CameraEventsHandler
            /* renamed from: onFirstFrameAvailable */
            public void mo155303xc73bce4d() {
            }
        } : cameraEventsHandler;
        this.f75192xa4618cc9 = interfaceC29747x7225d0e9;
        this.f75193x880e9750 = str;
        java.util.List asList = java.util.Arrays.asList(interfaceC29747x7225d0e9.mo155169x7ce7955c());
        this.f75212x15a153ac = new android.os.Handler(android.os.Looper.getMainLooper());
        if (asList.isEmpty()) {
            throw new java.lang.RuntimeException("No cameras attached.");
        }
        if (asList.contains(this.f75193x880e9750)) {
            return;
        }
        throw new java.lang.IllegalArgumentException("Camera name " + this.f75193x880e9750 + " does not match any known camera device.");
    }

    /* renamed from: access$1710 */
    public static /* synthetic */ int m155267xbf187205(org.p3371xd0ce3e8d.AbstractC29745x79152051 abstractC29745x79152051) {
        int i17 = abstractC29745x79152051.f75204xb89a4c26;
        abstractC29745x79152051.f75204xb89a4c26 = i17 - 1;
        return i17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: checkIsOnCameraThread */
    public void m155286x8ba33a00() {
        if (java.lang.Thread.currentThread() == this.f75196x542b52bb.getLooper().getThread()) {
            return;
        }
        org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Check is on camera thread failed.");
        throw new java.lang.RuntimeException("Not on camera thread.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createSessionInternal */
    public void m155287xe17136d7(int i17) {
        this.f75212x15a153ac.postDelayed(this.f75205x87e3158f, i17 + 10000);
        this.f75196x542b52bb.postDelayed(new java.lang.Runnable() { // from class: org.webrtc.CameraCapturer.5
            @Override // java.lang.Runnable
            public void run() {
                org.p3371xd0ce3e8d.AbstractC29745x79152051 abstractC29745x79152051 = org.p3371xd0ce3e8d.AbstractC29745x79152051.this;
                abstractC29745x79152051.mo155152x8a597c15(abstractC29745x79152051.f75198xb52d905f, org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75194x4d8b53c0, org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75191x5b0a2e3f, org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75209x59df2bb, org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75193x880e9750, org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75213x6be2dc6, org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75203xb7389127, org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75202x208b77cd);
            }
        }, i17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reportCameraSwitchError */
    public void m155288xac1feffb(java.lang.String str, org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842.CameraSwitchHandler cameraSwitchHandler) {
        org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, str);
        if (cameraSwitchHandler != null) {
            cameraSwitchHandler.m155339x98c542b0(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: switchCameraInternal */
    public void m155289x2f4cd156(org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842.CameraSwitchHandler cameraSwitchHandler, java.lang.String str) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "switchCamera internal");
        if (!java.util.Arrays.asList(this.f75192xa4618cc9.mo155169x7ce7955c()).contains(str)) {
            m155288xac1feffb("Attempted to switch to unknown camera device " + str, cameraSwitchHandler);
            return;
        }
        synchronized (this.f75208x83a84d5c) {
            if (this.f75211x7e427dbd != org.p3371xd0ce3e8d.AbstractC29745x79152051.SwitchState.IDLE) {
                m155288xac1feffb("Camera switch already in progress.", cameraSwitchHandler);
                return;
            }
            boolean z17 = this.f75207x1e5775e2;
            if (!z17 && this.f75199x178cf2dd == null) {
                m155288xac1feffb("switchCamera: camera is not running.", cameraSwitchHandler);
                return;
            }
            this.f75210x81bc1d1d = cameraSwitchHandler;
            if (z17) {
                this.f75211x7e427dbd = org.p3371xd0ce3e8d.AbstractC29745x79152051.SwitchState.PENDING;
                this.f75206x28bf2c47 = str;
                return;
            }
            this.f75211x7e427dbd = org.p3371xd0ce3e8d.AbstractC29745x79152051.SwitchState.IN_PROGRESS;
            org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "switchCamera: Stopping session");
            this.f75195xd59e6628.m155337x41012807();
            this.f75195xd59e6628 = null;
            final org.p3371xd0ce3e8d.InterfaceC29748x5948a391 interfaceC29748x5948a391 = this.f75199x178cf2dd;
            this.f75196x542b52bb.post(new java.lang.Runnable() { // from class: org.webrtc.CameraCapturer.9
                @Override // java.lang.Runnable
                public void run() {
                    interfaceC29748x5948a391.mo155197x360802();
                }
            });
            this.f75199x178cf2dd = null;
            this.f75193x880e9750 = str;
            this.f75207x1e5775e2 = true;
            this.f75204xb89a4c26 = 1;
            m155287xe17136d7(0);
            org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "switchCamera done");
        }
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29885x1cc01f67
    /* renamed from: changeCaptureFormat */
    public void mo155151xb311390d(int i17, int i18, int i19) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "changeCaptureFormat: " + i17 + "x" + i18 + "@" + i19);
        synchronized (this.f75208x83a84d5c) {
            mo155158xd45bb0e4();
            mo155157x18ec4884(i17, i18, i19);
        }
    }

    /* renamed from: createCameraSession */
    public abstract void mo155152x8a597c15(org.p3371xd0ce3e8d.InterfaceC29748x5948a391.CreateSessionCallback createSessionCallback, org.p3371xd0ce3e8d.InterfaceC29748x5948a391.Events events, android.content.Context context, org.p3371xd0ce3e8d.C29864x472c891c c29864x472c891c, java.lang.String str, int i17, int i18, int i19);

    @Override // org.p3371xd0ce3e8d.InterfaceC29885x1cc01f67
    /* renamed from: dispose */
    public void mo155153x63a5261f() {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "dispose");
        mo155158xd45bb0e4();
    }

    /* renamed from: getCameraName */
    public java.lang.String m155290x764f4f46() {
        java.lang.String str;
        synchronized (this.f75208x83a84d5c) {
            str = this.f75193x880e9750;
        }
        return str;
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29885x1cc01f67
    /* renamed from: initialize */
    public void mo155154x33ebcb90(org.p3371xd0ce3e8d.C29864x472c891c c29864x472c891c, android.content.Context context, org.p3371xd0ce3e8d.InterfaceC29751x4bd47102 interfaceC29751x4bd47102) {
        this.f75191x5b0a2e3f = context;
        this.f75197x7e102ce2 = interfaceC29751x4bd47102;
        this.f75209x59df2bb = c29864x472c891c;
        this.f75196x542b52bb = c29864x472c891c.m156406x67189314();
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29885x1cc01f67
    /* renamed from: isScreencast */
    public boolean mo155155x68912275() {
        return false;
    }

    /* renamed from: printStackTrace */
    public void mo155156x6e0e6e2a() {
        android.os.Handler handler = this.f75196x542b52bb;
        java.lang.Thread thread = handler != null ? handler.getLooper().getThread() : null;
        if (thread != null) {
            java.lang.StackTraceElement[] stackTrace = thread.getStackTrace();
            if (stackTrace.length > 0) {
                org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "CameraCapturer stack trace:");
                for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
                    org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, stackTraceElement.toString());
                }
            }
        }
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29885x1cc01f67
    /* renamed from: startCapture */
    public void mo155157x18ec4884(int i17, int i18, int i19) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "startCapture: " + i17 + "x" + i18 + "@" + i19);
        if (this.f75191x5b0a2e3f == null) {
            throw new java.lang.RuntimeException("CameraCapturer must be initialized before calling startCapture.");
        }
        synchronized (this.f75208x83a84d5c) {
            if (!this.f75207x1e5775e2 && this.f75199x178cf2dd == null) {
                this.f75213x6be2dc6 = i17;
                this.f75203xb7389127 = i18;
                this.f75202x208b77cd = i19;
                this.f75207x1e5775e2 = true;
                this.f75204xb89a4c26 = 3;
                m155287xe17136d7(0);
                return;
            }
            org.p3371xd0ce3e8d.C29806x779f633f.w(TAG, "Session already open");
        }
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29885x1cc01f67
    /* renamed from: stopCapture */
    public void mo155158xd45bb0e4() {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Stop capture");
        synchronized (this.f75208x83a84d5c) {
            while (this.f75207x1e5775e2) {
                org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Stop capture: Waiting for session to open");
                try {
                    this.f75208x83a84d5c.wait();
                } catch (java.lang.InterruptedException unused) {
                    org.p3371xd0ce3e8d.C29806x779f633f.w(TAG, "Stop capture interrupted while waiting for the session to open.");
                    java.lang.Thread.currentThread().interrupt();
                    return;
                }
            }
            if (this.f75199x178cf2dd != null) {
                org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Stop capture: Nulling session");
                this.f75195xd59e6628.m155337x41012807();
                this.f75195xd59e6628 = null;
                final org.p3371xd0ce3e8d.InterfaceC29748x5948a391 interfaceC29748x5948a391 = this.f75199x178cf2dd;
                this.f75196x542b52bb.post(new java.lang.Runnable() { // from class: org.webrtc.CameraCapturer.6
                    @Override // java.lang.Runnable
                    public void run() {
                        interfaceC29748x5948a391.mo155197x360802();
                    }
                });
                this.f75199x178cf2dd = null;
                this.f75197x7e102ce2.mo155343x5f049662();
            } else {
                org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Stop capture: No session open");
            }
        }
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Stop capture done");
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842
    /* renamed from: switchCamera */
    public void mo155159x2db92f79(final org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842.CameraSwitchHandler cameraSwitchHandler) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "switchCamera");
        this.f75196x542b52bb.post(new java.lang.Runnable() { // from class: org.webrtc.CameraCapturer.7
            @Override // java.lang.Runnable
            public void run() {
                java.util.List asList = java.util.Arrays.asList(org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75192xa4618cc9.mo155169x7ce7955c());
                if (asList.size() < 2) {
                    org.p3371xd0ce3e8d.AbstractC29745x79152051.this.m155288xac1feffb("No camera to switch to.", cameraSwitchHandler);
                } else {
                    org.p3371xd0ce3e8d.AbstractC29745x79152051.this.m155289x2f4cd156(cameraSwitchHandler, (java.lang.String) asList.get((asList.indexOf(org.p3371xd0ce3e8d.AbstractC29745x79152051.this.f75193x880e9750) + 1) % asList.size()));
                }
            }
        });
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842
    /* renamed from: switchCamera */
    public void mo155160x2db92f79(final org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842.CameraSwitchHandler cameraSwitchHandler, final java.lang.String str) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "switchCamera");
        this.f75196x542b52bb.post(new java.lang.Runnable() { // from class: org.webrtc.CameraCapturer.8
            @Override // java.lang.Runnable
            public void run() {
                org.p3371xd0ce3e8d.AbstractC29745x79152051.this.m155289x2f4cd156(cameraSwitchHandler, str);
            }
        });
    }
}
