package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.CameraStateRegistry */
/* loaded from: classes14.dex */
public final class C0684x851c70a9 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p035xa7ffe5b7.InterfaceC0584xe74c66ab.ConcurrentCameraModeListener {

    /* renamed from: MAX_ALLOWED_CONCURRENT_CAMERAS_IN_CONCURRENT_MODE */
    private static final int f1586x2c4df478 = 2;

    /* renamed from: MAX_ALLOWED_CONCURRENT_CAMERAS_IN_SINGLE_MODE */
    private static final int f1587x8496f07 = 1;
    private static final java.lang.String TAG = "CameraStateRegistry";

    /* renamed from: mAvailableCameras */
    private int f1588xacaa7572;

    /* renamed from: mCameraCoordinator */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p035xa7ffe5b7.InterfaceC0584xe74c66ab f1589x9969adde;

    /* renamed from: mCameraStates */
    private final java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0465x77deaf45, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0684x851c70a9.CameraRegistration> f1590x5fe9e694;

    /* renamed from: mDebugString */
    private final java.lang.StringBuilder f1591x4d54a997 = new java.lang.StringBuilder();

    /* renamed from: mLock */
    private final java.lang.Object f1592x6243b38;

    /* renamed from: mMaxAllowedOpenedCameras */
    private int f1593xc6fde4d4;

    /* renamed from: androidx.camera.core.impl.CameraStateRegistry$CameraRegistration */
    /* loaded from: classes14.dex */
    public static class CameraRegistration {

        /* renamed from: mNotifyExecutor */
        private final java.util.concurrent.Executor f1594xf457a509;

        /* renamed from: mOnConfigureAvailableListener */
        private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0684x851c70a9.OnConfigureAvailableListener f1595xfc1280a3;

        /* renamed from: mOnOpenAvailableListener */
        private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0684x851c70a9.OnOpenAvailableListener f1596x6405b1a7;

        /* renamed from: mState */
        private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State f1597xbec81024;

        public CameraRegistration(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State state, java.util.concurrent.Executor executor, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0684x851c70a9.OnConfigureAvailableListener onConfigureAvailableListener, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0684x851c70a9.OnOpenAvailableListener onOpenAvailableListener) {
            this.f1597xbec81024 = state;
            this.f1594xf457a509 = executor;
            this.f1595xfc1280a3 = onConfigureAvailableListener;
            this.f1596x6405b1a7 = onOpenAvailableListener;
        }

        /* renamed from: getState */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State m5317x75286adb() {
            return this.f1597xbec81024;
        }

        /* renamed from: notifyOnConfigureAvailableListener */
        public void m5318x4e25757f() {
            try {
                java.util.concurrent.Executor executor = this.f1594xf457a509;
                final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0684x851c70a9.OnConfigureAvailableListener onConfigureAvailableListener = this.f1595xfc1280a3;
                java.util.Objects.requireNonNull(onConfigureAvailableListener);
                executor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.impl.CameraStateRegistry$CameraRegistration$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0684x851c70a9.OnConfigureAvailableListener.this.mo3124xdb5dac2();
                    }
                });
            } catch (java.util.concurrent.RejectedExecutionException e17) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0684x851c70a9.TAG, "Unable to notify camera to configure.", e17);
            }
        }

        /* renamed from: notifyOnOpenAvailableListener */
        public void m5319xc52c234b() {
            try {
                java.util.concurrent.Executor executor = this.f1594xf457a509;
                final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0684x851c70a9.OnOpenAvailableListener onOpenAvailableListener = this.f1596x6405b1a7;
                java.util.Objects.requireNonNull(onOpenAvailableListener);
                executor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.impl.CameraStateRegistry$CameraRegistration$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0684x851c70a9.OnOpenAvailableListener.this.mo3123xfd13dc00();
                    }
                });
            } catch (java.util.concurrent.RejectedExecutionException e17) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0684x851c70a9.TAG, "Unable to notify camera to open.", e17);
            }
        }

        /* renamed from: setState */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State m5320x53b6854f(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State state) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State state2 = this.f1597xbec81024;
            this.f1597xbec81024 = state;
            return state2;
        }
    }

    /* renamed from: androidx.camera.core.impl.CameraStateRegistry$OnConfigureAvailableListener */
    /* loaded from: classes14.dex */
    public interface OnConfigureAvailableListener {
        /* renamed from: onConfigureAvailable */
        void mo3124xdb5dac2();
    }

    /* renamed from: androidx.camera.core.impl.CameraStateRegistry$OnOpenAvailableListener */
    /* loaded from: classes14.dex */
    public interface OnOpenAvailableListener {
        /* renamed from: onOpenAvailable */
        void mo3123xfd13dc00();
    }

    public C0684x851c70a9(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p035xa7ffe5b7.InterfaceC0584xe74c66ab interfaceC0584xe74c66ab, int i17) {
        java.lang.Object obj = new java.lang.Object();
        this.f1592x6243b38 = obj;
        this.f1590x5fe9e694 = new java.util.HashMap();
        this.f1593xc6fde4d4 = i17;
        synchronized (obj) {
            this.f1589x9969adde = interfaceC0584xe74c66ab;
            this.f1588xacaa7572 = this.f1593xc6fde4d4;
        }
    }

    /* renamed from: getCameraRegistration */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0684x851c70a9.CameraRegistration m5305xd488d274(java.lang.String str) {
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0465x77deaf45 interfaceC0465x77deaf45 : this.f1590x5fe9e694.keySet()) {
            if (str.equals(((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570) interfaceC0465x77deaf45.mo4253x764d3969()).mo3161x72efd496())) {
                return this.f1590x5fe9e694.get(interfaceC0465x77deaf45);
            }
        }
        return null;
    }

    /* renamed from: isOpen */
    private static boolean m5306xb9a70294(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State state) {
        return state != null && state.m5295xf2981d77();
    }

    /* renamed from: recalculateAvailableCameras */
    private void m5307xcff3a798() {
        if (p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.m4672xa8834bb8(TAG)) {
            this.f1591x4d54a997.setLength(0);
            this.f1591x4d54a997.append("Recalculating open cameras:\n");
            this.f1591x4d54a997.append(java.lang.String.format(java.util.Locale.US, "%-45s%-22s\n", "Camera", "State"));
            this.f1591x4d54a997.append("-------------------------------------------------------------------\n");
        }
        int i17 = 0;
        for (java.util.Map.Entry<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0465x77deaf45, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0684x851c70a9.CameraRegistration> entry : this.f1590x5fe9e694.entrySet()) {
            if (p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.m4672xa8834bb8(TAG)) {
                this.f1591x4d54a997.append(java.lang.String.format(java.util.Locale.US, "%-45s%-22s\n", entry.getKey().toString(), entry.getValue().m5317x75286adb() != null ? entry.getValue().m5317x75286adb().toString() : "UNKNOWN"));
            }
            if (m5306xb9a70294(entry.getValue().m5317x75286adb())) {
                i17++;
            }
        }
        if (p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.m4672xa8834bb8(TAG)) {
            this.f1591x4d54a997.append("-------------------------------------------------------------------\n");
            this.f1591x4d54a997.append(java.lang.String.format(java.util.Locale.US, "Open count: %d (Max allowed: %d)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f1593xc6fde4d4)));
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, this.f1591x4d54a997.toString());
        }
        this.f1588xacaa7572 = java.lang.Math.max(this.f1593xc6fde4d4 - i17, 0);
    }

    /* renamed from: traceState */
    private static void m5308x3a3ce64c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0465x77deaf45 interfaceC0465x77deaf45, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State state) {
        if (t4.a.d()) {
            t4.a.e("CX:State[" + interfaceC0465x77deaf45 + "]", state.ordinal());
        }
    }

    /* renamed from: unregisterCamera */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State m5309x7aea2681(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0465x77deaf45 interfaceC0465x77deaf45) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0684x851c70a9.CameraRegistration remove = this.f1590x5fe9e694.remove(interfaceC0465x77deaf45);
        if (remove == null) {
            return null;
        }
        m5307xcff3a798();
        return remove.m5317x75286adb();
    }

    /* renamed from: updateAndVerifyState */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State m5310xa026926a(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0465x77deaf45 interfaceC0465x77deaf45, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State state) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0684x851c70a9.CameraRegistration cameraRegistration = this.f1590x5fe9e694.get(interfaceC0465x77deaf45);
        m3.h.d(cameraRegistration, "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()");
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State m5320x53b6854f = cameraRegistration.m5320x53b6854f(state);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State state2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State.OPENING;
        if (state == state2) {
            m3.h.e(m5306xb9a70294(state) || m5320x53b6854f == state2, "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()");
        }
        if (m5320x53b6854f != state) {
            m5308x3a3ce64c(interfaceC0465x77deaf45, state);
            m5307xcff3a798();
        }
        return m5320x53b6854f;
    }

    /* renamed from: isCameraClosing */
    public boolean m5311x683ea4c6() {
        synchronized (this.f1592x6243b38) {
            java.util.Iterator<java.util.Map.Entry<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0465x77deaf45, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0684x851c70a9.CameraRegistration>> it = this.f1590x5fe9e694.entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue().m5317x75286adb() == p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State.CLOSING) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: markCameraState */
    public void m5312x228b8f5f(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0465x77deaf45 interfaceC0465x77deaf45, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State state) {
        m5313x228b8f5f(interfaceC0465x77deaf45, state, true);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p035xa7ffe5b7.InterfaceC0584xe74c66ab.ConcurrentCameraModeListener
    /* renamed from: onCameraOperatingModeUpdated */
    public void mo4867x24f4559b(int i17, int i18) {
        synchronized (this.f1592x6243b38) {
            boolean z17 = true;
            this.f1593xc6fde4d4 = i18 == 2 ? 2 : 1;
            boolean z18 = i17 != 2 && i18 == 2;
            if (i17 != 2 || i18 == 2) {
                z17 = false;
            }
            if (z18 || z17) {
                m5307xcff3a798();
            }
        }
    }

    /* renamed from: registerCamera */
    public void m5314xc6f817a8(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0465x77deaf45 interfaceC0465x77deaf45, java.util.concurrent.Executor executor, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0684x851c70a9.OnConfigureAvailableListener onConfigureAvailableListener, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0684x851c70a9.OnOpenAvailableListener onOpenAvailableListener) {
        synchronized (this.f1592x6243b38) {
            m3.h.e(!this.f1590x5fe9e694.containsKey(interfaceC0465x77deaf45), "Camera is already registered: " + interfaceC0465x77deaf45);
            this.f1590x5fe9e694.put(interfaceC0465x77deaf45, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0684x851c70a9.CameraRegistration(null, executor, onConfigureAvailableListener, onOpenAvailableListener));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0071 A[Catch: all -> 0x009b, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x001a, B:7:0x004f, B:9:0x0053, B:13:0x0069, B:15:0x0071, B:18:0x0080, B:21:0x0096, B:22:0x0099, B:26:0x0060), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0096 A[Catch: all -> 0x009b, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x001a, B:7:0x004f, B:9:0x0053, B:13:0x0069, B:15:0x0071, B:18:0x0080, B:21:0x0096, B:22:0x0099, B:26:0x0060), top: B:3:0x0003 }] */
    /* renamed from: tryOpenCamera */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m5315x4fd0662a(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0465x77deaf45 r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f1592x6243b38
            monitor-enter(r0)
            java.util.Map<androidx.camera.core.Camera, androidx.camera.core.impl.CameraStateRegistry$CameraRegistration> r1 = r10.f1590x5fe9e694     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r1 = r1.get(r11)     // Catch: java.lang.Throwable -> L9b
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r1 = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0684x851c70a9.CameraRegistration) r1     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = "Camera must first be registered with registerCamera()"
            m3.h.d(r1, r2)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = "CameraStateRegistry"
            boolean r2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.m4672xa8834bb8(r2)     // Catch: java.lang.Throwable -> L9b
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L4f
            java.lang.StringBuilder r2 = r10.f1591x4d54a997     // Catch: java.lang.Throwable -> L9b
            r2.setLength(r4)     // Catch: java.lang.Throwable -> L9b
            java.lang.StringBuilder r2 = r10.f1591x4d54a997     // Catch: java.lang.Throwable -> L9b
            java.util.Locale r5 = java.util.Locale.US     // Catch: java.lang.Throwable -> L9b
            java.lang.String r6 = "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]"
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L9b
            r7[r4] = r11     // Catch: java.lang.Throwable -> L9b
            int r8 = r10.f1588xacaa7572     // Catch: java.lang.Throwable -> L9b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L9b
            r7[r3] = r8     // Catch: java.lang.Throwable -> L9b
            androidx.camera.core.impl.CameraInternal$State r8 = r1.m5317x75286adb()     // Catch: java.lang.Throwable -> L9b
            boolean r8 = m5306xb9a70294(r8)     // Catch: java.lang.Throwable -> L9b
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Throwable -> L9b
            r9 = 2
            r7[r9] = r8     // Catch: java.lang.Throwable -> L9b
            androidx.camera.core.impl.CameraInternal$State r8 = r1.m5317x75286adb()     // Catch: java.lang.Throwable -> L9b
            r9 = 3
            r7[r9] = r8     // Catch: java.lang.Throwable -> L9b
            java.lang.String r5 = java.lang.String.format(r5, r6, r7)     // Catch: java.lang.Throwable -> L9b
            r2.append(r5)     // Catch: java.lang.Throwable -> L9b
        L4f:
            int r2 = r10.f1588xacaa7572     // Catch: java.lang.Throwable -> L9b
            if (r2 > 0) goto L60
            androidx.camera.core.impl.CameraInternal$State r2 = r1.m5317x75286adb()     // Catch: java.lang.Throwable -> L9b
            boolean r2 = m5306xb9a70294(r2)     // Catch: java.lang.Throwable -> L9b
            if (r2 == 0) goto L5e
            goto L60
        L5e:
            r11 = r4
            goto L69
        L60:
            androidx.camera.core.impl.CameraInternal$State r2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State.OPENING     // Catch: java.lang.Throwable -> L9b
            r1.m5320x53b6854f(r2)     // Catch: java.lang.Throwable -> L9b
            m5308x3a3ce64c(r11, r2)     // Catch: java.lang.Throwable -> L9b
            r11 = r3
        L69:
            java.lang.String r1 = "CameraStateRegistry"
            boolean r1 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.m4672xa8834bb8(r1)     // Catch: java.lang.Throwable -> L9b
            if (r1 == 0) goto L94
            java.lang.StringBuilder r1 = r10.f1591x4d54a997     // Catch: java.lang.Throwable -> L9b
            java.util.Locale r2 = java.util.Locale.US     // Catch: java.lang.Throwable -> L9b
            java.lang.String r5 = " --> %s"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L9b
            if (r11 == 0) goto L7e
            java.lang.String r6 = "SUCCESS"
            goto L80
        L7e:
            java.lang.String r6 = "FAIL"
        L80:
            r3[r4] = r6     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = java.lang.String.format(r2, r5, r3)     // Catch: java.lang.Throwable -> L9b
            r1.append(r2)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r1 = "CameraStateRegistry"
            java.lang.StringBuilder r2 = r10.f1591x4d54a997     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L9b
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(r1, r2)     // Catch: java.lang.Throwable -> L9b
        L94:
            if (r11 == 0) goto L99
            r10.m5307xcff3a798()     // Catch: java.lang.Throwable -> L9b
        L99:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9b
            return r11
        L9b:
            r11 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9b
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0684x851c70a9.m5315x4fd0662a(androidx.camera.core.Camera):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0053 A[ADDED_TO_REGION] */
    /* renamed from: tryOpenCaptureSession */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m5316x72878675(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f1592x6243b38
            monitor-enter(r0)
            androidx.camera.core.concurrent.CameraCoordinator r1 = r5.f1589x9969adde     // Catch: java.lang.Throwable -> L59
            int r1 = r1.mo4121x7ef94829()     // Catch: java.lang.Throwable -> L59
            r2 = 2
            r3 = 1
            if (r1 == r2) goto Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L59
            return r3
        Lf:
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r6 = r5.m5305xd488d274(r6)     // Catch: java.lang.Throwable -> L59
            r1 = 0
            if (r6 == 0) goto L1b
            androidx.camera.core.impl.CameraInternal$State r6 = r6.m5317x75286adb()     // Catch: java.lang.Throwable -> L59
            goto L1c
        L1b:
            r6 = r1
        L1c:
            if (r7 == 0) goto L23
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r7 = r5.m5305xd488d274(r7)     // Catch: java.lang.Throwable -> L59
            goto L24
        L23:
            r7 = r1
        L24:
            if (r7 == 0) goto L2a
            androidx.camera.core.impl.CameraInternal$State r1 = r7.m5317x75286adb()     // Catch: java.lang.Throwable -> L59
        L2a:
            androidx.camera.core.impl.CameraInternal$State r7 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State.OPEN     // Catch: java.lang.Throwable -> L59
            boolean r2 = r7.equals(r6)     // Catch: java.lang.Throwable -> L59
            r4 = 0
            if (r2 != 0) goto L3e
            androidx.camera.core.impl.CameraInternal$State r2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State.CONFIGURED     // Catch: java.lang.Throwable -> L59
            boolean r6 = r2.equals(r6)     // Catch: java.lang.Throwable -> L59
            if (r6 == 0) goto L3c
            goto L3e
        L3c:
            r6 = r4
            goto L3f
        L3e:
            r6 = r3
        L3f:
            boolean r7 = r7.equals(r1)     // Catch: java.lang.Throwable -> L59
            if (r7 != 0) goto L50
            androidx.camera.core.impl.CameraInternal$State r7 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State.CONFIGURED     // Catch: java.lang.Throwable -> L59
            boolean r7 = r7.equals(r1)     // Catch: java.lang.Throwable -> L59
            if (r7 == 0) goto L4e
            goto L50
        L4e:
            r7 = r4
            goto L51
        L50:
            r7 = r3
        L51:
            if (r6 == 0) goto L56
            if (r7 == 0) goto L56
            goto L57
        L56:
            r3 = r4
        L57:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L59
            return r3
        L59:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L59
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0684x851c70a9.m5316x72878675(java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* renamed from: markCameraState */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m5313x228b8f5f(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0465x77deaf45 r7, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State r8, boolean r9) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f1592x6243b38
            monitor-enter(r0)
            int r1 = r6.f1588xacaa7572     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.impl.CameraInternal$State r2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State.RELEASED     // Catch: java.lang.Throwable -> Lbc
            if (r8 != r2) goto Le
            androidx.camera.core.impl.CameraInternal$State r2 = r6.m5309x7aea2681(r7)     // Catch: java.lang.Throwable -> Lbc
            goto L12
        Le:
            androidx.camera.core.impl.CameraInternal$State r2 = r6.m5310xa026926a(r7, r8)     // Catch: java.lang.Throwable -> Lbc
        L12:
            if (r2 != r8) goto L16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbc
            return
        L16:
            androidx.camera.core.concurrent.CameraCoordinator r2 = r6.f1589x9969adde     // Catch: java.lang.Throwable -> Lbc
            int r2 = r2.mo4121x7ef94829()     // Catch: java.lang.Throwable -> Lbc
            r3 = 2
            r4 = 0
            if (r2 != r3) goto L3b
            androidx.camera.core.impl.CameraInternal$State r2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State.CONFIGURED     // Catch: java.lang.Throwable -> Lbc
            if (r8 != r2) goto L3b
            androidx.camera.core.CameraInfo r2 = r7.mo4253x764d3969()     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.impl.CameraInfoInternal r2 = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570) r2     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r2 = r2.mo3161x72efd496()     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.concurrent.CameraCoordinator r3 = r6.f1589x9969adde     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r2 = r3.mo4123xe5cebc46(r2)     // Catch: java.lang.Throwable -> Lbc
            if (r2 == 0) goto L3b
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r2 = r6.m5305xd488d274(r2)     // Catch: java.lang.Throwable -> Lbc
            goto L3c
        L3b:
            r2 = r4
        L3c:
            r3 = 1
            if (r1 >= r3) goto L7c
            int r1 = r6.f1588xacaa7572     // Catch: java.lang.Throwable -> Lbc
            if (r1 <= 0) goto L7c
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lbc
            r4.<init>()     // Catch: java.lang.Throwable -> Lbc
            java.util.Map<androidx.camera.core.Camera, androidx.camera.core.impl.CameraStateRegistry$CameraRegistration> r8 = r6.f1590x5fe9e694     // Catch: java.lang.Throwable -> Lbc
            java.util.Set r8 = r8.entrySet()     // Catch: java.lang.Throwable -> Lbc
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> Lbc
        L52:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Throwable -> Lbc
            if (r1 == 0) goto L94
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Throwable -> Lbc
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r3 = r1.getValue()     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r3 = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0684x851c70a9.CameraRegistration) r3     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.impl.CameraInternal$State r3 = r3.m5317x75286adb()     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.impl.CameraInternal$State r5 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State.PENDING_OPEN     // Catch: java.lang.Throwable -> Lbc
            if (r3 != r5) goto L52
            java.lang.Object r3 = r1.getKey()     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.Camera r3 = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0465x77deaf45) r3     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r1 = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0684x851c70a9.CameraRegistration) r1     // Catch: java.lang.Throwable -> Lbc
            r4.put(r3, r1)     // Catch: java.lang.Throwable -> Lbc
            goto L52
        L7c:
            androidx.camera.core.impl.CameraInternal$State r1 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State.PENDING_OPEN     // Catch: java.lang.Throwable -> Lbc
            if (r8 != r1) goto L94
            int r8 = r6.f1588xacaa7572     // Catch: java.lang.Throwable -> Lbc
            if (r8 <= 0) goto L94
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lbc
            r4.<init>()     // Catch: java.lang.Throwable -> Lbc
            java.util.Map<androidx.camera.core.Camera, androidx.camera.core.impl.CameraStateRegistry$CameraRegistration> r8 = r6.f1590x5fe9e694     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r8 = r8.get(r7)     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r8 = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0684x851c70a9.CameraRegistration) r8     // Catch: java.lang.Throwable -> Lbc
            r4.put(r7, r8)     // Catch: java.lang.Throwable -> Lbc
        L94:
            if (r4 == 0) goto L9b
            if (r9 != 0) goto L9b
            r4.remove(r7)     // Catch: java.lang.Throwable -> Lbc
        L9b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbc
            if (r4 == 0) goto Lb6
            java.util.Collection r7 = r4.values()
            java.util.Iterator r7 = r7.iterator()
        La6:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lb6
            java.lang.Object r8 = r7.next()
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r8 = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0684x851c70a9.CameraRegistration) r8
            r8.m5319xc52c234b()
            goto La6
        Lb6:
            if (r2 == 0) goto Lbb
            r2.m5318x4e25757f()
        Lbb:
            return
        Lbc:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbc
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0684x851c70a9.m5313x228b8f5f(androidx.camera.core.Camera, androidx.camera.core.impl.CameraInternal$State, boolean):void");
    }
}
