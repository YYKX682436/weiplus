package org.p3371xd0ce3e8d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.webrtc.Camera2Session */
/* loaded from: classes14.dex */
public class C29743x9bb57849 implements org.p3371xd0ce3e8d.InterfaceC29748x5948a391 {
    private static final java.lang.String TAG = "Camera2Session";

    /* renamed from: applicationContext */
    private final android.content.Context f75162x5b0a2e3f;

    /* renamed from: callback */
    private final org.p3371xd0ce3e8d.InterfaceC29748x5948a391.CreateSessionCallback f75163xf5bc2045;

    /* renamed from: cameraCharacteristics */
    private android.hardware.camera2.CameraCharacteristics f75164x8fea5853;

    /* renamed from: cameraDevice */
    private android.hardware.camera2.CameraDevice f75165xadf21ddb;

    /* renamed from: cameraId */
    private final java.lang.String f75166xf7159720;

    /* renamed from: cameraManager */
    private final android.hardware.camera2.CameraManager f75167xe52200c8;

    /* renamed from: cameraOrientation */
    private int f75168x3727e16b;

    /* renamed from: cameraThreadHandler */
    private final android.os.Handler f75169x542b52bb;

    /* renamed from: captureFormat */
    private org.p3371xd0ce3e8d.C29746x65bafa4d.CaptureFormat f75170x5e779edd;

    /* renamed from: captureSession */
    private android.hardware.camera2.CameraCaptureSession f75171xf2db870;

    /* renamed from: constructionTimeNs */
    private final long f75172xcc0439a3;

    /* renamed from: events */
    private final org.p3371xd0ce3e8d.InterfaceC29748x5948a391.Events f75173xb307e119;

    /* renamed from: firstFrameReported */
    private boolean f75174xd137090;

    /* renamed from: fpsUnitFactor */
    private int f75175x2b1aa5bc;

    /* renamed from: framerate */
    private final int f75176x208b77cd;

    /* renamed from: height */
    private final int f75177xb7389127;

    /* renamed from: isCameraFrontFacing */
    private boolean f75178x9db06ef4;

    /* renamed from: state */
    private org.p3371xd0ce3e8d.C29743x9bb57849.SessionState f75179x68ac491 = org.p3371xd0ce3e8d.C29743x9bb57849.SessionState.RUNNING;

    /* renamed from: surface */
    private android.view.Surface f75180x9189ecad;

    /* renamed from: surfaceTextureHelper */
    private final org.p3371xd0ce3e8d.C29864x472c891c f75181x3b6754fc;

    /* renamed from: width */
    private final int f75182x6be2dc6;

    /* renamed from: camera2StartTimeMsHistogram */
    private static final org.p3371xd0ce3e8d.C29790xde462144 f75160xe1731dc = org.p3371xd0ce3e8d.C29790xde462144.m155613x3ff7b160("WebRTC.Android.Camera2.StartTimeMs", 1, 10000, 50);

    /* renamed from: camera2StopTimeMsHistogram */
    private static final org.p3371xd0ce3e8d.C29790xde462144 f75161xcf666202 = org.p3371xd0ce3e8d.C29790xde462144.m155613x3ff7b160("WebRTC.Android.Camera2.StopTimeMs", 1, 10000, 50);

    /* renamed from: camera2ResolutionHistogram */
    private static final org.p3371xd0ce3e8d.C29790xde462144 f75159x86890f2b = org.p3371xd0ce3e8d.C29790xde462144.m155614x87f9dbab("WebRTC.Android.Camera2.Resolution", org.p3371xd0ce3e8d.C29746x65bafa4d.f75232x64a324d3.size());

    /* renamed from: org.webrtc.Camera2Session$CameraCaptureCallback */
    /* loaded from: classes14.dex */
    public static class CameraCaptureCallback extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {
        private CameraCaptureCallback() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.CaptureFailure captureFailure) {
            org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.C29743x9bb57849.TAG, "Capture failed: " + captureFailure);
        }
    }

    /* renamed from: org.webrtc.Camera2Session$CameraStateCallback */
    /* loaded from: classes14.dex */
    public class CameraStateCallback extends android.hardware.camera2.CameraDevice.StateCallback {
        private CameraStateCallback() {
        }

        /* renamed from: getErrorDescription */
        private java.lang.String m155246x1368ac4a(int i17) {
            if (i17 == 1) {
                return "Camera device is in use already.";
            }
            if (i17 == 2) {
                return "Camera device could not be opened because there are too many other open camera devices.";
            }
            if (i17 == 3) {
                return "Camera device could not be opened due to a device policy.";
            }
            if (i17 == 4) {
                return "Camera device has encountered a fatal error.";
            }
            if (i17 == 5) {
                return "Camera service has encountered a fatal error.";
            }
            return "Unknown camera error: " + i17;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(android.hardware.camera2.CameraDevice cameraDevice) {
            org.p3371xd0ce3e8d.C29743x9bb57849.this.m155238x8ba33a00();
            org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.C29743x9bb57849.TAG, "Camera device closed.");
            org.p3371xd0ce3e8d.C29743x9bb57849.this.f75173xb307e119.mo155293x21df6c70(org.p3371xd0ce3e8d.C29743x9bb57849.this);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(android.hardware.camera2.CameraDevice cameraDevice) {
            org.p3371xd0ce3e8d.C29743x9bb57849.this.m155238x8ba33a00();
            boolean z17 = org.p3371xd0ce3e8d.C29743x9bb57849.this.f75171xf2db870 == null && org.p3371xd0ce3e8d.C29743x9bb57849.this.f75179x68ac491 != org.p3371xd0ce3e8d.C29743x9bb57849.SessionState.STOPPED;
            org.p3371xd0ce3e8d.C29743x9bb57849.this.f75179x68ac491 = org.p3371xd0ce3e8d.C29743x9bb57849.SessionState.STOPPED;
            org.p3371xd0ce3e8d.C29743x9bb57849.this.m155245xdc1110df();
            if (z17) {
                org.p3371xd0ce3e8d.C29743x9bb57849.this.f75163xf5bc2045.mo155292xee232ab(org.p3371xd0ce3e8d.InterfaceC29748x5948a391.FailureType.DISCONNECTED, "Camera disconnected / evicted.");
            } else {
                org.p3371xd0ce3e8d.C29743x9bb57849.this.f75173xb307e119.mo155294xfb77e63f(org.p3371xd0ce3e8d.C29743x9bb57849.this);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(android.hardware.camera2.CameraDevice cameraDevice, int i17) {
            org.p3371xd0ce3e8d.C29743x9bb57849.this.m155238x8ba33a00();
            org.p3371xd0ce3e8d.C29743x9bb57849.this.m155243xefdead34(m155246x1368ac4a(i17));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(android.hardware.camera2.CameraDevice cameraDevice) {
            org.p3371xd0ce3e8d.C29743x9bb57849.this.m155238x8ba33a00();
            org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.C29743x9bb57849.TAG, "Camera opened.");
            org.p3371xd0ce3e8d.C29743x9bb57849.this.f75165xadf21ddb = cameraDevice;
            org.p3371xd0ce3e8d.C29743x9bb57849.this.f75181x3b6754fc.m156410xd06addfa(org.p3371xd0ce3e8d.C29743x9bb57849.this.f75170x5e779edd.f75245x6be2dc6, org.p3371xd0ce3e8d.C29743x9bb57849.this.f75170x5e779edd.f75243xb7389127);
            org.p3371xd0ce3e8d.C29743x9bb57849.this.f75180x9189ecad = new android.view.Surface(org.p3371xd0ce3e8d.C29743x9bb57849.this.f75181x3b6754fc.m156407x182e20a4());
            try {
                cameraDevice.createCaptureSession(java.util.Arrays.asList(org.p3371xd0ce3e8d.C29743x9bb57849.this.f75180x9189ecad), new org.p3371xd0ce3e8d.C29743x9bb57849.CaptureSessionCallback(), org.p3371xd0ce3e8d.C29743x9bb57849.this.f75169x542b52bb);
            } catch (android.hardware.camera2.CameraAccessException e17) {
                org.p3371xd0ce3e8d.C29743x9bb57849.this.m155243xefdead34("Failed to create capture session. " + e17);
            }
        }
    }

    /* renamed from: org.webrtc.Camera2Session$CaptureSessionCallback */
    /* loaded from: classes14.dex */
    public class CaptureSessionCallback extends android.hardware.camera2.CameraCaptureSession.StateCallback {
        private CaptureSessionCallback() {
        }

        /* renamed from: chooseFocusMode */
        private void m155247x5f026a44(android.hardware.camera2.CaptureRequest.Builder builder) {
            for (int i17 : (int[]) org.p3371xd0ce3e8d.C29743x9bb57849.this.f75164x8fea5853.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES)) {
                if (i17 == 3) {
                    builder.set(android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE, 3);
                    org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.C29743x9bb57849.TAG, "Using continuous video auto-focus.");
                    return;
                }
            }
            org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.C29743x9bb57849.TAG, "Auto-focus is not available.");
        }

        /* renamed from: chooseStabilizationMode */
        private void m155248x53cc9ecb(android.hardware.camera2.CaptureRequest.Builder builder) {
            int[] iArr = (int[]) org.p3371xd0ce3e8d.C29743x9bb57849.this.f75164x8fea5853.get(android.hardware.camera2.CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
            if (iArr != null) {
                for (int i17 : iArr) {
                    if (i17 == 1) {
                        builder.set(android.hardware.camera2.CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 1);
                        builder.set(android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
                        org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.C29743x9bb57849.TAG, "Using optical stabilization.");
                        return;
                    }
                }
            }
            int[] iArr2 = (int[]) org.p3371xd0ce3e8d.C29743x9bb57849.this.f75164x8fea5853.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
            if (iArr2 != null) {
                for (int i18 : iArr2) {
                    if (i18 == 1) {
                        builder.set(android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
                        builder.set(android.hardware.camera2.CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 0);
                        org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.C29743x9bb57849.TAG, "Using video stabilization.");
                        return;
                    }
                }
            }
            org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.C29743x9bb57849.TAG, "Stabilization not available.");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onConfigured$0 */
        public /* synthetic */ void m155249x3ec4a946(org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d2) {
            org.p3371xd0ce3e8d.C29743x9bb57849.this.m155238x8ba33a00();
            if (org.p3371xd0ce3e8d.C29743x9bb57849.this.f75179x68ac491 != org.p3371xd0ce3e8d.C29743x9bb57849.SessionState.RUNNING) {
                org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.C29743x9bb57849.TAG, "Texture frame captured but camera is no longer running.");
                return;
            }
            if (!org.p3371xd0ce3e8d.C29743x9bb57849.this.f75174xd137090) {
                org.p3371xd0ce3e8d.C29743x9bb57849.this.f75174xd137090 = true;
                org.p3371xd0ce3e8d.C29743x9bb57849.f75160xe1731dc.m155618xfeff1dab((int) java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(java.lang.System.nanoTime() - org.p3371xd0ce3e8d.C29743x9bb57849.this.f75172xcc0439a3));
            }
            org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d22 = new org.p3371xd0ce3e8d.C29904x150215d2(org.p3371xd0ce3e8d.InterfaceC29748x5948a391.m155321x9f4b7f7f((org.p3371xd0ce3e8d.C29875x346d5db) c29904x150215d2.m156544x12f2b736(), org.p3371xd0ce3e8d.C29743x9bb57849.this.f75178x9db06ef4, -org.p3371xd0ce3e8d.C29743x9bb57849.this.f75168x3727e16b), org.p3371xd0ce3e8d.C29743x9bb57849.this.m155241xc5322599(), c29904x150215d2.m156548x2f798c45());
            org.p3371xd0ce3e8d.C29743x9bb57849.this.f75173xb307e119.mo155297x962f56cc(org.p3371xd0ce3e8d.C29743x9bb57849.this, c29904x150215d22);
            c29904x150215d22.mo155513x41012807();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            org.p3371xd0ce3e8d.C29743x9bb57849.this.m155238x8ba33a00();
            cameraCaptureSession.close();
            org.p3371xd0ce3e8d.C29743x9bb57849.this.m155243xefdead34("Failed to configure capture session.");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            org.p3371xd0ce3e8d.C29743x9bb57849.this.m155238x8ba33a00();
            org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.C29743x9bb57849.TAG, "Camera capture session configured.");
            org.p3371xd0ce3e8d.C29743x9bb57849.this.f75171xf2db870 = cameraCaptureSession;
            try {
                android.hardware.camera2.CaptureRequest.Builder createCaptureRequest = org.p3371xd0ce3e8d.C29743x9bb57849.this.f75165xadf21ddb.createCaptureRequest(3);
                createCaptureRequest.set(android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new android.util.Range(java.lang.Integer.valueOf(org.p3371xd0ce3e8d.C29743x9bb57849.this.f75170x5e779edd.f75242x208b77cd.min / org.p3371xd0ce3e8d.C29743x9bb57849.this.f75175x2b1aa5bc), java.lang.Integer.valueOf(org.p3371xd0ce3e8d.C29743x9bb57849.this.f75170x5e779edd.f75242x208b77cd.max / org.p3371xd0ce3e8d.C29743x9bb57849.this.f75175x2b1aa5bc)));
                createCaptureRequest.set(android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE, 1);
                createCaptureRequest.set(android.hardware.camera2.CaptureRequest.CONTROL_AE_LOCK, java.lang.Boolean.FALSE);
                m155248x53cc9ecb(createCaptureRequest);
                m155247x5f026a44(createCaptureRequest);
                createCaptureRequest.addTarget(org.p3371xd0ce3e8d.C29743x9bb57849.this.f75180x9189ecad);
                cameraCaptureSession.setRepeatingRequest(createCaptureRequest.build(), new org.p3371xd0ce3e8d.C29743x9bb57849.CameraCaptureCallback(), org.p3371xd0ce3e8d.C29743x9bb57849.this.f75169x542b52bb);
                org.p3371xd0ce3e8d.C29743x9bb57849.this.f75181x3b6754fc.m156411xa23d0a79(new org.p3371xd0ce3e8d.InterfaceC29908xc6e4d18e() { // from class: org.webrtc.Camera2Session$CaptureSessionCallback$$a
                    @Override // org.p3371xd0ce3e8d.InterfaceC29908xc6e4d18e
                    /* renamed from: onFrame */
                    public final void mo155128xaf987ece(org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d2) {
                        org.p3371xd0ce3e8d.C29743x9bb57849.CaptureSessionCallback.this.m155249x3ec4a946(c29904x150215d2);
                    }
                });
                org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.C29743x9bb57849.TAG, "Camera device successfully started.");
                org.p3371xd0ce3e8d.C29743x9bb57849.this.f75163xf5bc2045.mo155291xc3989e01(org.p3371xd0ce3e8d.C29743x9bb57849.this);
            } catch (android.hardware.camera2.CameraAccessException e17) {
                org.p3371xd0ce3e8d.C29743x9bb57849.this.m155243xefdead34("Failed to start capture request. " + e17);
            }
        }
    }

    /* renamed from: org.webrtc.Camera2Session$SessionState */
    /* loaded from: classes6.dex */
    public enum SessionState {
        RUNNING,
        STOPPED
    }

    private C29743x9bb57849(org.p3371xd0ce3e8d.InterfaceC29748x5948a391.CreateSessionCallback createSessionCallback, org.p3371xd0ce3e8d.InterfaceC29748x5948a391.Events events, android.content.Context context, android.hardware.camera2.CameraManager cameraManager, org.p3371xd0ce3e8d.C29864x472c891c c29864x472c891c, java.lang.String str, int i17, int i18, int i19) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Create new camera2 session on camera " + str);
        this.f75172xcc0439a3 = java.lang.System.nanoTime();
        this.f75169x542b52bb = new android.os.Handler();
        this.f75163xf5bc2045 = createSessionCallback;
        this.f75173xb307e119 = events;
        this.f75162x5b0a2e3f = context;
        this.f75167xe52200c8 = cameraManager;
        this.f75181x3b6754fc = c29864x472c891c;
        this.f75166xf7159720 = str;
        this.f75182x6be2dc6 = i17;
        this.f75177xb7389127 = i18;
        this.f75176x208b77cd = i19;
        m155244x68ac462();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: checkIsOnCameraThread */
    public void m155238x8ba33a00() {
        if (java.lang.Thread.currentThread() != this.f75169x542b52bb.getLooper().getThread()) {
            throw new java.lang.IllegalStateException("Wrong thread");
        }
    }

    /* renamed from: create */
    public static void m155239xaf65a0fc(org.p3371xd0ce3e8d.InterfaceC29748x5948a391.CreateSessionCallback createSessionCallback, org.p3371xd0ce3e8d.InterfaceC29748x5948a391.Events events, android.content.Context context, android.hardware.camera2.CameraManager cameraManager, org.p3371xd0ce3e8d.C29864x472c891c c29864x472c891c, java.lang.String str, int i17, int i18, int i19) {
        new org.p3371xd0ce3e8d.C29743x9bb57849(createSessionCallback, events, context, cameraManager, c29864x472c891c, str, i17, i18, i19);
    }

    /* renamed from: findCaptureFormat */
    private void m155240xd83ada4() {
        m155238x8ba33a00();
        android.util.Range[] rangeArr = (android.util.Range[]) this.f75164x8fea5853.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        int m155207xe87a6206 = org.p3371xd0ce3e8d.C29742x68ec2131.m155207xe87a6206(rangeArr);
        this.f75175x2b1aa5bc = m155207xe87a6206;
        java.util.List<org.p3371xd0ce3e8d.C29746x65bafa4d.CaptureFormat.FramerateRange> m155204x1e963859 = org.p3371xd0ce3e8d.C29742x68ec2131.m155204x1e963859(rangeArr, m155207xe87a6206);
        java.util.List<org.p3371xd0ce3e8d.C29857x275421> m155210x7b78e57a = org.p3371xd0ce3e8d.C29742x68ec2131.m155210x7b78e57a(this.f75164x8fea5853);
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Available preview sizes: " + m155210x7b78e57a);
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Available fps ranges: " + m155204x1e963859);
        if (m155204x1e963859.isEmpty() || m155210x7b78e57a.isEmpty()) {
            m155243xefdead34("No supported capture formats.");
            return;
        }
        org.p3371xd0ce3e8d.C29746x65bafa4d.CaptureFormat.FramerateRange m155308x5c36181b = org.p3371xd0ce3e8d.C29746x65bafa4d.m155308x5c36181b(m155204x1e963859, this.f75176x208b77cd);
        org.p3371xd0ce3e8d.C29857x275421 m155309x4491986c = org.p3371xd0ce3e8d.C29746x65bafa4d.m155309x4491986c(m155210x7b78e57a, this.f75182x6be2dc6, this.f75177xb7389127);
        org.p3371xd0ce3e8d.C29746x65bafa4d.m155310xc32adf05(f75159x86890f2b, m155309x4491986c);
        this.f75170x5e779edd = new org.p3371xd0ce3e8d.C29746x65bafa4d.CaptureFormat(m155309x4491986c.f75950x6be2dc6, m155309x4491986c.f75949xb7389127, m155308x5c36181b);
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Using capture format: " + this.f75170x5e779edd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getFrameOrientation */
    public int m155241xc5322599() {
        int m155322x3694d4e4 = org.p3371xd0ce3e8d.InterfaceC29748x5948a391.m155322x3694d4e4(this.f75162x5b0a2e3f);
        if (!this.f75178x9db06ef4) {
            m155322x3694d4e4 = 360 - m155322x3694d4e4;
        }
        return (this.f75168x3727e16b + m155322x3694d4e4) % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
    }

    /* renamed from: openCamera */
    private void m155242xf86b760f() {
        m155238x8ba33a00();
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Opening camera " + this.f75166xf7159720);
        this.f75173xb307e119.mo155296x9b1d2ad4();
        try {
            android.hardware.camera2.CameraManager cameraManager = this.f75167xe52200c8;
            java.lang.String str = this.f75166xf7159720;
            org.p3371xd0ce3e8d.C29743x9bb57849.CameraStateCallback cameraStateCallback = new org.p3371xd0ce3e8d.C29743x9bb57849.CameraStateCallback();
            android.os.Handler handler = this.f75169x542b52bb;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(handler);
            arrayList.add(cameraStateCallback);
            arrayList.add(str);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(cameraManager, arrayList.toArray(), "org/webrtc/Camera2Session", "openCamera", "()V", "android/hardware/camera2/CameraManager", "openCamera", "(Ljava/lang/String;Landroid/hardware/camera2/CameraDevice$StateCallback;Landroid/os/Handler;)V");
        } catch (android.hardware.camera2.CameraAccessException | java.lang.IllegalArgumentException e17) {
            m155243xefdead34("Failed to open camera: " + e17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reportError */
    public void m155243xefdead34(java.lang.String str) {
        m155238x8ba33a00();
        org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Error: " + str);
        boolean z17 = this.f75171xf2db870 == null && this.f75179x68ac491 != org.p3371xd0ce3e8d.C29743x9bb57849.SessionState.STOPPED;
        this.f75179x68ac491 = org.p3371xd0ce3e8d.C29743x9bb57849.SessionState.STOPPED;
        m155245xdc1110df();
        if (z17) {
            this.f75163xf5bc2045.mo155292xee232ab(org.p3371xd0ce3e8d.InterfaceC29748x5948a391.FailureType.ERROR, str);
        } else {
            this.f75173xb307e119.mo155295x95dbd684(this, str);
        }
    }

    /* renamed from: start */
    private void m155244x68ac462() {
        m155238x8ba33a00();
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "start");
        try {
            android.hardware.camera2.CameraCharacteristics cameraCharacteristics = this.f75167xe52200c8.getCameraCharacteristics(this.f75166xf7159720);
            this.f75164x8fea5853 = cameraCharacteristics;
            this.f75168x3727e16b = ((java.lang.Integer) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
            this.f75178x9db06ef4 = ((java.lang.Integer) this.f75164x8fea5853.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING)).intValue() == 0;
            m155240xd83ada4();
            if (this.f75170x5e779edd == null) {
                return;
            }
            m155242xf86b760f();
        } catch (android.hardware.camera2.CameraAccessException | java.lang.IllegalArgumentException e17) {
            m155243xefdead34("getCameraCharacteristics(): " + e17.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: stopInternal */
    public void m155245xdc1110df() {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Stop internal");
        m155238x8ba33a00();
        this.f75181x3b6754fc.m156412x3f73dad9();
        android.hardware.camera2.CameraCaptureSession cameraCaptureSession = this.f75171xf2db870;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.f75171xf2db870 = null;
        }
        android.view.Surface surface = this.f75180x9189ecad;
        if (surface != null) {
            surface.release();
            this.f75180x9189ecad = null;
        }
        android.hardware.camera2.CameraDevice cameraDevice = this.f75165xadf21ddb;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.f75165xadf21ddb = null;
        }
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Stop done");
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29748x5948a391
    /* renamed from: stop */
    public void mo155197x360802() {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Stop camera2 session on camera " + this.f75166xf7159720);
        m155238x8ba33a00();
        org.p3371xd0ce3e8d.C29743x9bb57849.SessionState sessionState = this.f75179x68ac491;
        org.p3371xd0ce3e8d.C29743x9bb57849.SessionState sessionState2 = org.p3371xd0ce3e8d.C29743x9bb57849.SessionState.STOPPED;
        if (sessionState != sessionState2) {
            long nanoTime = java.lang.System.nanoTime();
            this.f75179x68ac491 = sessionState2;
            m155245xdc1110df();
            f75161xcf666202.m155618xfeff1dab((int) java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(java.lang.System.nanoTime() - nanoTime));
        }
    }
}
