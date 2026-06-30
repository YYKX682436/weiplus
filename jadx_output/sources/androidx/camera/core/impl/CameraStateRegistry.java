package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public final class CameraStateRegistry implements androidx.camera.core.concurrent.CameraCoordinator.ConcurrentCameraModeListener {
    private static final int MAX_ALLOWED_CONCURRENT_CAMERAS_IN_CONCURRENT_MODE = 2;
    private static final int MAX_ALLOWED_CONCURRENT_CAMERAS_IN_SINGLE_MODE = 1;
    private static final java.lang.String TAG = "CameraStateRegistry";
    private int mAvailableCameras;
    private final androidx.camera.core.concurrent.CameraCoordinator mCameraCoordinator;
    private final java.util.Map<androidx.camera.core.Camera, androidx.camera.core.impl.CameraStateRegistry.CameraRegistration> mCameraStates;
    private final java.lang.StringBuilder mDebugString = new java.lang.StringBuilder();
    private final java.lang.Object mLock;
    private int mMaxAllowedOpenedCameras;

    /* loaded from: classes14.dex */
    public static class CameraRegistration {
        private final java.util.concurrent.Executor mNotifyExecutor;
        private final androidx.camera.core.impl.CameraStateRegistry.OnConfigureAvailableListener mOnConfigureAvailableListener;
        private final androidx.camera.core.impl.CameraStateRegistry.OnOpenAvailableListener mOnOpenAvailableListener;
        private androidx.camera.core.impl.CameraInternal.State mState;

        public CameraRegistration(androidx.camera.core.impl.CameraInternal.State state, java.util.concurrent.Executor executor, androidx.camera.core.impl.CameraStateRegistry.OnConfigureAvailableListener onConfigureAvailableListener, androidx.camera.core.impl.CameraStateRegistry.OnOpenAvailableListener onOpenAvailableListener) {
            this.mState = state;
            this.mNotifyExecutor = executor;
            this.mOnConfigureAvailableListener = onConfigureAvailableListener;
            this.mOnOpenAvailableListener = onOpenAvailableListener;
        }

        public androidx.camera.core.impl.CameraInternal.State getState() {
            return this.mState;
        }

        public void notifyOnConfigureAvailableListener() {
            try {
                java.util.concurrent.Executor executor = this.mNotifyExecutor;
                final androidx.camera.core.impl.CameraStateRegistry.OnConfigureAvailableListener onConfigureAvailableListener = this.mOnConfigureAvailableListener;
                java.util.Objects.requireNonNull(onConfigureAvailableListener);
                executor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.impl.CameraStateRegistry$CameraRegistration$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.core.impl.CameraStateRegistry.OnConfigureAvailableListener.this.onConfigureAvailable();
                    }
                });
            } catch (java.util.concurrent.RejectedExecutionException e17) {
                androidx.camera.core.Logger.e(androidx.camera.core.impl.CameraStateRegistry.TAG, "Unable to notify camera to configure.", e17);
            }
        }

        public void notifyOnOpenAvailableListener() {
            try {
                java.util.concurrent.Executor executor = this.mNotifyExecutor;
                final androidx.camera.core.impl.CameraStateRegistry.OnOpenAvailableListener onOpenAvailableListener = this.mOnOpenAvailableListener;
                java.util.Objects.requireNonNull(onOpenAvailableListener);
                executor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.impl.CameraStateRegistry$CameraRegistration$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.core.impl.CameraStateRegistry.OnOpenAvailableListener.this.onOpenAvailable();
                    }
                });
            } catch (java.util.concurrent.RejectedExecutionException e17) {
                androidx.camera.core.Logger.e(androidx.camera.core.impl.CameraStateRegistry.TAG, "Unable to notify camera to open.", e17);
            }
        }

        public androidx.camera.core.impl.CameraInternal.State setState(androidx.camera.core.impl.CameraInternal.State state) {
            androidx.camera.core.impl.CameraInternal.State state2 = this.mState;
            this.mState = state;
            return state2;
        }
    }

    /* loaded from: classes14.dex */
    public interface OnConfigureAvailableListener {
        void onConfigureAvailable();
    }

    /* loaded from: classes14.dex */
    public interface OnOpenAvailableListener {
        void onOpenAvailable();
    }

    public CameraStateRegistry(androidx.camera.core.concurrent.CameraCoordinator cameraCoordinator, int i17) {
        java.lang.Object obj = new java.lang.Object();
        this.mLock = obj;
        this.mCameraStates = new java.util.HashMap();
        this.mMaxAllowedOpenedCameras = i17;
        synchronized (obj) {
            this.mCameraCoordinator = cameraCoordinator;
            this.mAvailableCameras = this.mMaxAllowedOpenedCameras;
        }
    }

    private androidx.camera.core.impl.CameraStateRegistry.CameraRegistration getCameraRegistration(java.lang.String str) {
        for (androidx.camera.core.Camera camera : this.mCameraStates.keySet()) {
            if (str.equals(((androidx.camera.core.impl.CameraInfoInternal) camera.getCameraInfo()).getCameraId())) {
                return this.mCameraStates.get(camera);
            }
        }
        return null;
    }

    private static boolean isOpen(androidx.camera.core.impl.CameraInternal.State state) {
        return state != null && state.holdsCameraSlot();
    }

    private void recalculateAvailableCameras() {
        if (androidx.camera.core.Logger.isDebugEnabled(TAG)) {
            this.mDebugString.setLength(0);
            this.mDebugString.append("Recalculating open cameras:\n");
            this.mDebugString.append(java.lang.String.format(java.util.Locale.US, "%-45s%-22s\n", "Camera", "State"));
            this.mDebugString.append("-------------------------------------------------------------------\n");
        }
        int i17 = 0;
        for (java.util.Map.Entry<androidx.camera.core.Camera, androidx.camera.core.impl.CameraStateRegistry.CameraRegistration> entry : this.mCameraStates.entrySet()) {
            if (androidx.camera.core.Logger.isDebugEnabled(TAG)) {
                this.mDebugString.append(java.lang.String.format(java.util.Locale.US, "%-45s%-22s\n", entry.getKey().toString(), entry.getValue().getState() != null ? entry.getValue().getState().toString() : "UNKNOWN"));
            }
            if (isOpen(entry.getValue().getState())) {
                i17++;
            }
        }
        if (androidx.camera.core.Logger.isDebugEnabled(TAG)) {
            this.mDebugString.append("-------------------------------------------------------------------\n");
            this.mDebugString.append(java.lang.String.format(java.util.Locale.US, "Open count: %d (Max allowed: %d)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.mMaxAllowedOpenedCameras)));
            androidx.camera.core.Logger.d(TAG, this.mDebugString.toString());
        }
        this.mAvailableCameras = java.lang.Math.max(this.mMaxAllowedOpenedCameras - i17, 0);
    }

    private static void traceState(androidx.camera.core.Camera camera, androidx.camera.core.impl.CameraInternal.State state) {
        if (t4.a.d()) {
            t4.a.e("CX:State[" + camera + "]", state.ordinal());
        }
    }

    private androidx.camera.core.impl.CameraInternal.State unregisterCamera(androidx.camera.core.Camera camera) {
        androidx.camera.core.impl.CameraStateRegistry.CameraRegistration remove = this.mCameraStates.remove(camera);
        if (remove == null) {
            return null;
        }
        recalculateAvailableCameras();
        return remove.getState();
    }

    private androidx.camera.core.impl.CameraInternal.State updateAndVerifyState(androidx.camera.core.Camera camera, androidx.camera.core.impl.CameraInternal.State state) {
        androidx.camera.core.impl.CameraStateRegistry.CameraRegistration cameraRegistration = this.mCameraStates.get(camera);
        m3.h.d(cameraRegistration, "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()");
        androidx.camera.core.impl.CameraInternal.State state2 = cameraRegistration.setState(state);
        androidx.camera.core.impl.CameraInternal.State state3 = androidx.camera.core.impl.CameraInternal.State.OPENING;
        if (state == state3) {
            m3.h.e(isOpen(state) || state2 == state3, "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()");
        }
        if (state2 != state) {
            traceState(camera, state);
            recalculateAvailableCameras();
        }
        return state2;
    }

    public boolean isCameraClosing() {
        synchronized (this.mLock) {
            java.util.Iterator<java.util.Map.Entry<androidx.camera.core.Camera, androidx.camera.core.impl.CameraStateRegistry.CameraRegistration>> it = this.mCameraStates.entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue().getState() == androidx.camera.core.impl.CameraInternal.State.CLOSING) {
                    return true;
                }
            }
            return false;
        }
    }

    public void markCameraState(androidx.camera.core.Camera camera, androidx.camera.core.impl.CameraInternal.State state) {
        markCameraState(camera, state, true);
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator.ConcurrentCameraModeListener
    public void onCameraOperatingModeUpdated(int i17, int i18) {
        synchronized (this.mLock) {
            boolean z17 = true;
            this.mMaxAllowedOpenedCameras = i18 == 2 ? 2 : 1;
            boolean z18 = i17 != 2 && i18 == 2;
            if (i17 != 2 || i18 == 2) {
                z17 = false;
            }
            if (z18 || z17) {
                recalculateAvailableCameras();
            }
        }
    }

    public void registerCamera(androidx.camera.core.Camera camera, java.util.concurrent.Executor executor, androidx.camera.core.impl.CameraStateRegistry.OnConfigureAvailableListener onConfigureAvailableListener, androidx.camera.core.impl.CameraStateRegistry.OnOpenAvailableListener onOpenAvailableListener) {
        synchronized (this.mLock) {
            m3.h.e(!this.mCameraStates.containsKey(camera), "Camera is already registered: " + camera);
            this.mCameraStates.put(camera, new androidx.camera.core.impl.CameraStateRegistry.CameraRegistration(null, executor, onConfigureAvailableListener, onOpenAvailableListener));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0071 A[Catch: all -> 0x009b, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x001a, B:7:0x004f, B:9:0x0053, B:13:0x0069, B:15:0x0071, B:18:0x0080, B:21:0x0096, B:22:0x0099, B:26:0x0060), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0096 A[Catch: all -> 0x009b, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x001a, B:7:0x004f, B:9:0x0053, B:13:0x0069, B:15:0x0071, B:18:0x0080, B:21:0x0096, B:22:0x0099, B:26:0x0060), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean tryOpenCamera(androidx.camera.core.Camera r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.mLock
            monitor-enter(r0)
            java.util.Map<androidx.camera.core.Camera, androidx.camera.core.impl.CameraStateRegistry$CameraRegistration> r1 = r10.mCameraStates     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r1 = r1.get(r11)     // Catch: java.lang.Throwable -> L9b
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r1 = (androidx.camera.core.impl.CameraStateRegistry.CameraRegistration) r1     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = "Camera must first be registered with registerCamera()"
            m3.h.d(r1, r2)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = "CameraStateRegistry"
            boolean r2 = androidx.camera.core.Logger.isDebugEnabled(r2)     // Catch: java.lang.Throwable -> L9b
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L4f
            java.lang.StringBuilder r2 = r10.mDebugString     // Catch: java.lang.Throwable -> L9b
            r2.setLength(r4)     // Catch: java.lang.Throwable -> L9b
            java.lang.StringBuilder r2 = r10.mDebugString     // Catch: java.lang.Throwable -> L9b
            java.util.Locale r5 = java.util.Locale.US     // Catch: java.lang.Throwable -> L9b
            java.lang.String r6 = "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]"
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L9b
            r7[r4] = r11     // Catch: java.lang.Throwable -> L9b
            int r8 = r10.mAvailableCameras     // Catch: java.lang.Throwable -> L9b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L9b
            r7[r3] = r8     // Catch: java.lang.Throwable -> L9b
            androidx.camera.core.impl.CameraInternal$State r8 = r1.getState()     // Catch: java.lang.Throwable -> L9b
            boolean r8 = isOpen(r8)     // Catch: java.lang.Throwable -> L9b
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Throwable -> L9b
            r9 = 2
            r7[r9] = r8     // Catch: java.lang.Throwable -> L9b
            androidx.camera.core.impl.CameraInternal$State r8 = r1.getState()     // Catch: java.lang.Throwable -> L9b
            r9 = 3
            r7[r9] = r8     // Catch: java.lang.Throwable -> L9b
            java.lang.String r5 = java.lang.String.format(r5, r6, r7)     // Catch: java.lang.Throwable -> L9b
            r2.append(r5)     // Catch: java.lang.Throwable -> L9b
        L4f:
            int r2 = r10.mAvailableCameras     // Catch: java.lang.Throwable -> L9b
            if (r2 > 0) goto L60
            androidx.camera.core.impl.CameraInternal$State r2 = r1.getState()     // Catch: java.lang.Throwable -> L9b
            boolean r2 = isOpen(r2)     // Catch: java.lang.Throwable -> L9b
            if (r2 == 0) goto L5e
            goto L60
        L5e:
            r11 = r4
            goto L69
        L60:
            androidx.camera.core.impl.CameraInternal$State r2 = androidx.camera.core.impl.CameraInternal.State.OPENING     // Catch: java.lang.Throwable -> L9b
            r1.setState(r2)     // Catch: java.lang.Throwable -> L9b
            traceState(r11, r2)     // Catch: java.lang.Throwable -> L9b
            r11 = r3
        L69:
            java.lang.String r1 = "CameraStateRegistry"
            boolean r1 = androidx.camera.core.Logger.isDebugEnabled(r1)     // Catch: java.lang.Throwable -> L9b
            if (r1 == 0) goto L94
            java.lang.StringBuilder r1 = r10.mDebugString     // Catch: java.lang.Throwable -> L9b
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
            java.lang.StringBuilder r2 = r10.mDebugString     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L9b
            androidx.camera.core.Logger.d(r1, r2)     // Catch: java.lang.Throwable -> L9b
        L94:
            if (r11 == 0) goto L99
            r10.recalculateAvailableCameras()     // Catch: java.lang.Throwable -> L9b
        L99:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9b
            return r11
        L9b:
            r11 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9b
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.CameraStateRegistry.tryOpenCamera(androidx.camera.core.Camera):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0053 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean tryOpenCaptureSession(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.mLock
            monitor-enter(r0)
            androidx.camera.core.concurrent.CameraCoordinator r1 = r5.mCameraCoordinator     // Catch: java.lang.Throwable -> L59
            int r1 = r1.getCameraOperatingMode()     // Catch: java.lang.Throwable -> L59
            r2 = 2
            r3 = 1
            if (r1 == r2) goto Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L59
            return r3
        Lf:
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r6 = r5.getCameraRegistration(r6)     // Catch: java.lang.Throwable -> L59
            r1 = 0
            if (r6 == 0) goto L1b
            androidx.camera.core.impl.CameraInternal$State r6 = r6.getState()     // Catch: java.lang.Throwable -> L59
            goto L1c
        L1b:
            r6 = r1
        L1c:
            if (r7 == 0) goto L23
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r7 = r5.getCameraRegistration(r7)     // Catch: java.lang.Throwable -> L59
            goto L24
        L23:
            r7 = r1
        L24:
            if (r7 == 0) goto L2a
            androidx.camera.core.impl.CameraInternal$State r1 = r7.getState()     // Catch: java.lang.Throwable -> L59
        L2a:
            androidx.camera.core.impl.CameraInternal$State r7 = androidx.camera.core.impl.CameraInternal.State.OPEN     // Catch: java.lang.Throwable -> L59
            boolean r2 = r7.equals(r6)     // Catch: java.lang.Throwable -> L59
            r4 = 0
            if (r2 != 0) goto L3e
            androidx.camera.core.impl.CameraInternal$State r2 = androidx.camera.core.impl.CameraInternal.State.CONFIGURED     // Catch: java.lang.Throwable -> L59
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
            androidx.camera.core.impl.CameraInternal$State r7 = androidx.camera.core.impl.CameraInternal.State.CONFIGURED     // Catch: java.lang.Throwable -> L59
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.CameraStateRegistry.tryOpenCaptureSession(java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void markCameraState(androidx.camera.core.Camera r7, androidx.camera.core.impl.CameraInternal.State r8, boolean r9) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.mLock
            monitor-enter(r0)
            int r1 = r6.mAvailableCameras     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.impl.CameraInternal$State r2 = androidx.camera.core.impl.CameraInternal.State.RELEASED     // Catch: java.lang.Throwable -> Lbc
            if (r8 != r2) goto Le
            androidx.camera.core.impl.CameraInternal$State r2 = r6.unregisterCamera(r7)     // Catch: java.lang.Throwable -> Lbc
            goto L12
        Le:
            androidx.camera.core.impl.CameraInternal$State r2 = r6.updateAndVerifyState(r7, r8)     // Catch: java.lang.Throwable -> Lbc
        L12:
            if (r2 != r8) goto L16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbc
            return
        L16:
            androidx.camera.core.concurrent.CameraCoordinator r2 = r6.mCameraCoordinator     // Catch: java.lang.Throwable -> Lbc
            int r2 = r2.getCameraOperatingMode()     // Catch: java.lang.Throwable -> Lbc
            r3 = 2
            r4 = 0
            if (r2 != r3) goto L3b
            androidx.camera.core.impl.CameraInternal$State r2 = androidx.camera.core.impl.CameraInternal.State.CONFIGURED     // Catch: java.lang.Throwable -> Lbc
            if (r8 != r2) goto L3b
            androidx.camera.core.CameraInfo r2 = r7.getCameraInfo()     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.impl.CameraInfoInternal r2 = (androidx.camera.core.impl.CameraInfoInternal) r2     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r2 = r2.getCameraId()     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.concurrent.CameraCoordinator r3 = r6.mCameraCoordinator     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r2 = r3.getPairedConcurrentCameraId(r2)     // Catch: java.lang.Throwable -> Lbc
            if (r2 == 0) goto L3b
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r2 = r6.getCameraRegistration(r2)     // Catch: java.lang.Throwable -> Lbc
            goto L3c
        L3b:
            r2 = r4
        L3c:
            r3 = 1
            if (r1 >= r3) goto L7c
            int r1 = r6.mAvailableCameras     // Catch: java.lang.Throwable -> Lbc
            if (r1 <= 0) goto L7c
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lbc
            r4.<init>()     // Catch: java.lang.Throwable -> Lbc
            java.util.Map<androidx.camera.core.Camera, androidx.camera.core.impl.CameraStateRegistry$CameraRegistration> r8 = r6.mCameraStates     // Catch: java.lang.Throwable -> Lbc
            java.util.Set r8 = r8.entrySet()     // Catch: java.lang.Throwable -> Lbc
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> Lbc
        L52:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Throwable -> Lbc
            if (r1 == 0) goto L94
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Throwable -> Lbc
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r3 = r1.getValue()     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r3 = (androidx.camera.core.impl.CameraStateRegistry.CameraRegistration) r3     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.impl.CameraInternal$State r3 = r3.getState()     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.impl.CameraInternal$State r5 = androidx.camera.core.impl.CameraInternal.State.PENDING_OPEN     // Catch: java.lang.Throwable -> Lbc
            if (r3 != r5) goto L52
            java.lang.Object r3 = r1.getKey()     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.Camera r3 = (androidx.camera.core.Camera) r3     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r1 = (androidx.camera.core.impl.CameraStateRegistry.CameraRegistration) r1     // Catch: java.lang.Throwable -> Lbc
            r4.put(r3, r1)     // Catch: java.lang.Throwable -> Lbc
            goto L52
        L7c:
            androidx.camera.core.impl.CameraInternal$State r1 = androidx.camera.core.impl.CameraInternal.State.PENDING_OPEN     // Catch: java.lang.Throwable -> Lbc
            if (r8 != r1) goto L94
            int r8 = r6.mAvailableCameras     // Catch: java.lang.Throwable -> Lbc
            if (r8 <= 0) goto L94
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lbc
            r4.<init>()     // Catch: java.lang.Throwable -> Lbc
            java.util.Map<androidx.camera.core.Camera, androidx.camera.core.impl.CameraStateRegistry$CameraRegistration> r8 = r6.mCameraStates     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r8 = r8.get(r7)     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r8 = (androidx.camera.core.impl.CameraStateRegistry.CameraRegistration) r8     // Catch: java.lang.Throwable -> Lbc
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
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r8 = (androidx.camera.core.impl.CameraStateRegistry.CameraRegistration) r8
            r8.notifyOnOpenAvailableListener()
            goto La6
        Lb6:
            if (r2 == 0) goto Lbb
            r2.notifyOnConfigureAvailableListener()
        Lbb:
            return
        Lbc:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbc
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.CameraStateRegistry.markCameraState(androidx.camera.core.Camera, androidx.camera.core.impl.CameraInternal$State, boolean):void");
    }
}
