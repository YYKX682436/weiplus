package org.p3371xd0ce3e8d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.webrtc.Camera1Session */
/* loaded from: classes14.dex */
public class C29737x33d44b6a implements org.p3371xd0ce3e8d.InterfaceC29748x5948a391 {

    /* renamed from: NUMBER_OF_CAPTURE_BUFFERS */
    private static final int f75132xa057fe48 = 3;
    private static final java.lang.String TAG = "Camera1Session";

    /* renamed from: applicationContext */
    private final android.content.Context f75136x5b0a2e3f;

    /* renamed from: camera */
    private final android.hardware.Camera f75137xae79c325;

    /* renamed from: cameraId */
    private final int f75138xf7159720;

    /* renamed from: cameraThreadHandler */
    private final android.os.Handler f75139x542b52bb;

    /* renamed from: captureFormat */
    private final org.p3371xd0ce3e8d.C29746x65bafa4d.CaptureFormat f75140x5e779edd;

    /* renamed from: captureToTexture */
    private final boolean f75141x1ec2557a;

    /* renamed from: constructionTimeNs */
    private final long f75142xcc0439a3;

    /* renamed from: events */
    private final org.p3371xd0ce3e8d.InterfaceC29748x5948a391.Events f75143xb307e119;

    /* renamed from: firstFrameReported */
    private boolean f75144xd137090;

    /* renamed from: info */
    private final android.hardware.Camera.CameraInfo f75145x3164ae;

    /* renamed from: state */
    private org.p3371xd0ce3e8d.C29737x33d44b6a.SessionState f75146x68ac491;

    /* renamed from: surfaceTextureHelper */
    private final org.p3371xd0ce3e8d.C29864x472c891c f75147x3b6754fc;

    /* renamed from: camera1StartTimeMsHistogram */
    private static final org.p3371xd0ce3e8d.C29790xde462144 f75134x17e3c5b = org.p3371xd0ce3e8d.C29790xde462144.m155613x3ff7b160("WebRTC.Android.Camera1.StartTimeMs", 1, 10000, 50);

    /* renamed from: camera1StopTimeMsHistogram */
    private static final org.p3371xd0ce3e8d.C29790xde462144 f75135xe7c48ba3 = org.p3371xd0ce3e8d.C29790xde462144.m155613x3ff7b160("WebRTC.Android.Camera1.StopTimeMs", 1, 10000, 50);

    /* renamed from: camera1ResolutionHistogram */
    private static final org.p3371xd0ce3e8d.C29790xde462144 f75133x9ee738cc = org.p3371xd0ce3e8d.C29790xde462144.m155614x87f9dbab("WebRTC.Android.Camera1.Resolution", org.p3371xd0ce3e8d.C29746x65bafa4d.f75232x64a324d3.size());

    /* renamed from: org.webrtc.Camera1Session$2, reason: invalid class name */
    /* loaded from: classes14.dex */
    public class AnonymousClass2 implements android.hardware.Camera.PreviewCallback {
        public AnonymousClass2() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onPreviewFrame$0 */
        public /* synthetic */ void m155198x92e61ccd(byte[] bArr) {
            if (org.p3371xd0ce3e8d.C29737x33d44b6a.this.f75146x68ac491 == org.p3371xd0ce3e8d.C29737x33d44b6a.SessionState.RUNNING) {
                org.p3371xd0ce3e8d.C29737x33d44b6a.this.f75137xae79c325.addCallbackBuffer(bArr);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onPreviewFrame$1 */
        public /* synthetic */ void m155199x92e61cce(final byte[] bArr) {
            org.p3371xd0ce3e8d.C29737x33d44b6a.this.f75139x542b52bb.post(new java.lang.Runnable() { // from class: org.webrtc.Camera1Session$2$$a
                @Override // java.lang.Runnable
                public final void run() {
                    org.p3371xd0ce3e8d.C29737x33d44b6a.AnonymousClass2.this.m155198x92e61ccd(bArr);
                }
            });
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(final byte[] bArr, android.hardware.Camera camera) {
            org.p3371xd0ce3e8d.C29737x33d44b6a.this.m155186x8ba33a00();
            if (camera != org.p3371xd0ce3e8d.C29737x33d44b6a.this.f75137xae79c325) {
                org.p3371xd0ce3e8d.C29806x779f633f.e(org.p3371xd0ce3e8d.C29737x33d44b6a.TAG, "Callback from a different camera. This should never happen.");
                return;
            }
            if (org.p3371xd0ce3e8d.C29737x33d44b6a.this.f75146x68ac491 != org.p3371xd0ce3e8d.C29737x33d44b6a.SessionState.RUNNING) {
                org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.C29737x33d44b6a.TAG, "Bytebuffer frame captured but camera is no longer running.");
                return;
            }
            long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(android.os.SystemClock.elapsedRealtime());
            if (!org.p3371xd0ce3e8d.C29737x33d44b6a.this.f75144xd137090) {
                org.p3371xd0ce3e8d.C29737x33d44b6a.f75134x17e3c5b.m155618xfeff1dab((int) java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(java.lang.System.nanoTime() - org.p3371xd0ce3e8d.C29737x33d44b6a.this.f75142xcc0439a3));
                org.p3371xd0ce3e8d.C29737x33d44b6a.this.f75144xd137090 = true;
            }
            org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d2 = new org.p3371xd0ce3e8d.C29904x150215d2(new org.p3371xd0ce3e8d.C29819x1eaa5d27(bArr, org.p3371xd0ce3e8d.C29737x33d44b6a.this.f75140x5e779edd.f75245x6be2dc6, org.p3371xd0ce3e8d.C29737x33d44b6a.this.f75140x5e779edd.f75243xb7389127, new java.lang.Runnable() { // from class: org.webrtc.Camera1Session$2$$b
                @Override // java.lang.Runnable
                public final void run() {
                    org.p3371xd0ce3e8d.C29737x33d44b6a.AnonymousClass2.this.m155199x92e61cce(bArr);
                }
            }), org.p3371xd0ce3e8d.C29737x33d44b6a.this.m155190xc5322599(), nanos);
            org.p3371xd0ce3e8d.C29737x33d44b6a.this.f75143xb307e119.mo155297x962f56cc(org.p3371xd0ce3e8d.C29737x33d44b6a.this, c29904x150215d2);
            c29904x150215d2.mo155513x41012807();
        }
    }

    /* renamed from: org.webrtc.Camera1Session$SessionState */
    /* loaded from: classes6.dex */
    public enum SessionState {
        RUNNING,
        STOPPED
    }

    private C29737x33d44b6a(org.p3371xd0ce3e8d.InterfaceC29748x5948a391.Events events, boolean z17, android.content.Context context, org.p3371xd0ce3e8d.C29864x472c891c c29864x472c891c, int i17, android.hardware.Camera camera, android.hardware.Camera.CameraInfo cameraInfo, org.p3371xd0ce3e8d.C29746x65bafa4d.CaptureFormat captureFormat, long j17) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Create new camera1 session on camera " + i17);
        this.f75139x542b52bb = new android.os.Handler();
        this.f75143xb307e119 = events;
        this.f75141x1ec2557a = z17;
        this.f75136x5b0a2e3f = context;
        this.f75147x3b6754fc = c29864x472c891c;
        this.f75138xf7159720 = i17;
        this.f75137xae79c325 = camera;
        this.f75145x3164ae = cameraInfo;
        this.f75140x5e779edd = captureFormat;
        this.f75142xcc0439a3 = j17;
        c29864x472c891c.m156410xd06addfa(captureFormat.f75245x6be2dc6, captureFormat.f75243xb7389127);
        m155194x8efc5441();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: checkIsOnCameraThread */
    public void m155186x8ba33a00() {
        if (java.lang.Thread.currentThread() != this.f75139x542b52bb.getLooper().getThread()) {
            throw new java.lang.IllegalStateException("Wrong thread");
        }
    }

    /* renamed from: create */
    public static void m155187xaf65a0fc(org.p3371xd0ce3e8d.InterfaceC29748x5948a391.CreateSessionCallback createSessionCallback, org.p3371xd0ce3e8d.InterfaceC29748x5948a391.Events events, boolean z17, android.content.Context context, org.p3371xd0ce3e8d.C29864x472c891c c29864x472c891c, java.lang.String str, int i17, int i18, int i19) {
        long nanoTime = java.lang.System.nanoTime();
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Open camera " + str);
        events.mo155296x9b1d2ad4();
        try {
            int m155164x5359eb77 = org.p3371xd0ce3e8d.C29736xd4076e70.m155164x5359eb77(str);
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(m155164x5359eb77));
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                android.hardware.Camera camera = (android.hardware.Camera) yj0.a.k(obj, arrayList.toArray(), "org/webrtc/Camera1Session", "create", "(Lorg/webrtc/CameraSession$CreateSessionCallback;Lorg/webrtc/CameraSession$Events;ZLandroid/content/Context;Lorg/webrtc/SurfaceTextureHelper;Ljava/lang/String;III)V", "android/hardware/Camera", "open", "(I)Landroid/hardware/Camera;");
                if (camera == null) {
                    createSessionCallback.mo155292xee232ab(org.p3371xd0ce3e8d.InterfaceC29748x5948a391.FailureType.ERROR, "Camera.open returned null for camera id = " + m155164x5359eb77);
                    return;
                }
                try {
                    camera.setPreviewTexture(c29864x472c891c.m156407x182e20a4());
                    android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
                    android.hardware.Camera.getCameraInfo(m155164x5359eb77, cameraInfo);
                    try {
                        android.hardware.Camera.Parameters parameters = camera.getParameters();
                        org.p3371xd0ce3e8d.C29746x65bafa4d.CaptureFormat m155188xadac6c5d = m155188xadac6c5d(parameters, i17, i18, i19);
                        m155196x104d41d8(camera, parameters, m155188xadac6c5d, m155189x1d2f2f9f(parameters, i17, i18), z17);
                        if (!z17) {
                            int m155315x207d7f0e = m155188xadac6c5d.m155315x207d7f0e();
                            for (int i27 = 0; i27 < 3; i27++) {
                                camera.addCallbackBuffer(java.nio.ByteBuffer.allocateDirect(m155315x207d7f0e).array());
                            }
                        }
                        try {
                            camera.setDisplayOrientation(0);
                            createSessionCallback.mo155291xc3989e01(new org.p3371xd0ce3e8d.C29737x33d44b6a(events, z17, context, c29864x472c891c, m155164x5359eb77, camera, cameraInfo, m155188xadac6c5d, nanoTime));
                        } catch (java.lang.RuntimeException e17) {
                            yj0.a.j(camera, "org/webrtc/Camera1Session", "create", "(Lorg/webrtc/CameraSession$CreateSessionCallback;Lorg/webrtc/CameraSession$Events;ZLandroid/content/Context;Lorg/webrtc/SurfaceTextureHelper;Ljava/lang/String;III)V", "android/hardware/Camera", "release", "()V");
                            createSessionCallback.mo155292xee232ab(org.p3371xd0ce3e8d.InterfaceC29748x5948a391.FailureType.ERROR, e17.getMessage());
                        }
                    } catch (java.lang.RuntimeException e18) {
                        yj0.a.j(camera, "org/webrtc/Camera1Session", "create", "(Lorg/webrtc/CameraSession$CreateSessionCallback;Lorg/webrtc/CameraSession$Events;ZLandroid/content/Context;Lorg/webrtc/SurfaceTextureHelper;Ljava/lang/String;III)V", "android/hardware/Camera", "release", "()V");
                        createSessionCallback.mo155292xee232ab(org.p3371xd0ce3e8d.InterfaceC29748x5948a391.FailureType.ERROR, e18.getMessage());
                    }
                } catch (java.io.IOException | java.lang.RuntimeException e19) {
                    yj0.a.j(camera, "org/webrtc/Camera1Session", "create", "(Lorg/webrtc/CameraSession$CreateSessionCallback;Lorg/webrtc/CameraSession$Events;ZLandroid/content/Context;Lorg/webrtc/SurfaceTextureHelper;Ljava/lang/String;III)V", "android/hardware/Camera", "release", "()V");
                    createSessionCallback.mo155292xee232ab(org.p3371xd0ce3e8d.InterfaceC29748x5948a391.FailureType.ERROR, e19.getMessage());
                }
            } catch (java.lang.RuntimeException e27) {
                createSessionCallback.mo155292xee232ab(org.p3371xd0ce3e8d.InterfaceC29748x5948a391.FailureType.ERROR, e27.getMessage());
            }
        } catch (java.lang.IllegalArgumentException e28) {
            createSessionCallback.mo155292xee232ab(org.p3371xd0ce3e8d.InterfaceC29748x5948a391.FailureType.ERROR, e28.getMessage());
        }
    }

    /* renamed from: findClosestCaptureFormat */
    private static org.p3371xd0ce3e8d.C29746x65bafa4d.CaptureFormat m155188xadac6c5d(android.hardware.Camera.Parameters parameters, int i17, int i18, int i19) {
        java.util.List<org.p3371xd0ce3e8d.C29746x65bafa4d.CaptureFormat.FramerateRange> m155161x1e963859 = org.p3371xd0ce3e8d.C29736xd4076e70.m155161x1e963859(parameters.getSupportedPreviewFpsRange());
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Available fps ranges: " + m155161x1e963859);
        org.p3371xd0ce3e8d.C29746x65bafa4d.CaptureFormat.FramerateRange m155308x5c36181b = org.p3371xd0ce3e8d.C29746x65bafa4d.m155308x5c36181b(m155161x1e963859, i19);
        org.p3371xd0ce3e8d.C29857x275421 m155309x4491986c = org.p3371xd0ce3e8d.C29746x65bafa4d.m155309x4491986c(org.p3371xd0ce3e8d.C29736xd4076e70.m155162x2d08aa9f(parameters.getSupportedPreviewSizes()), i17, i18);
        org.p3371xd0ce3e8d.C29746x65bafa4d.m155310xc32adf05(f75133x9ee738cc, m155309x4491986c);
        return new org.p3371xd0ce3e8d.C29746x65bafa4d.CaptureFormat(m155309x4491986c.f75950x6be2dc6, m155309x4491986c.f75949xb7389127, m155308x5c36181b);
    }

    /* renamed from: findClosestPictureSize */
    private static org.p3371xd0ce3e8d.C29857x275421 m155189x1d2f2f9f(android.hardware.Camera.Parameters parameters, int i17, int i18) {
        return org.p3371xd0ce3e8d.C29746x65bafa4d.m155309x4491986c(org.p3371xd0ce3e8d.C29736xd4076e70.m155162x2d08aa9f(parameters.getSupportedPictureSizes()), i17, i18);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getFrameOrientation */
    public int m155190xc5322599() {
        int m155322x3694d4e4 = org.p3371xd0ce3e8d.InterfaceC29748x5948a391.m155322x3694d4e4(this.f75136x5b0a2e3f);
        android.hardware.Camera.CameraInfo cameraInfo = this.f75145x3164ae;
        if (cameraInfo.facing == 0) {
            m155322x3694d4e4 = 360 - m155322x3694d4e4;
        }
        return (cameraInfo.orientation + m155322x3694d4e4) % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$listenForTextureFrames$0 */
    public /* synthetic */ void m155191x31dbca48(org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d2) {
        m155186x8ba33a00();
        if (this.f75146x68ac491 != org.p3371xd0ce3e8d.C29737x33d44b6a.SessionState.RUNNING) {
            org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Texture frame captured but camera is no longer running.");
            return;
        }
        if (!this.f75144xd137090) {
            f75134x17e3c5b.m155618xfeff1dab((int) java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(java.lang.System.nanoTime() - this.f75142xcc0439a3));
            this.f75144xd137090 = true;
        }
        org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d22 = new org.p3371xd0ce3e8d.C29904x150215d2(org.p3371xd0ce3e8d.InterfaceC29748x5948a391.m155321x9f4b7f7f((org.p3371xd0ce3e8d.C29875x346d5db) c29904x150215d2.m156544x12f2b736(), this.f75145x3164ae.facing == 1, 0), m155190xc5322599(), c29904x150215d2.m156548x2f798c45());
        this.f75143xb307e119.mo155297x962f56cc(this, c29904x150215d22);
        c29904x150215d22.mo155513x41012807();
    }

    /* renamed from: listenForBytebufferFrames */
    private void m155192xcf1847b0() {
        this.f75137xae79c325.setPreviewCallbackWithBuffer(new org.p3371xd0ce3e8d.C29737x33d44b6a.AnonymousClass2());
    }

    /* renamed from: listenForTextureFrames */
    private void m155193xc43d1b3f() {
        this.f75147x3b6754fc.m156411xa23d0a79(new org.p3371xd0ce3e8d.InterfaceC29908xc6e4d18e() { // from class: org.webrtc.Camera1Session$$a
            @Override // org.p3371xd0ce3e8d.InterfaceC29908xc6e4d18e
            /* renamed from: onFrame */
            public final void mo155128xaf987ece(org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d2) {
                org.p3371xd0ce3e8d.C29737x33d44b6a.this.m155191x31dbca48(c29904x150215d2);
            }
        });
    }

    /* renamed from: startCapturing */
    private void m155194x8efc5441() {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Start capturing");
        m155186x8ba33a00();
        this.f75146x68ac491 = org.p3371xd0ce3e8d.C29737x33d44b6a.SessionState.RUNNING;
        this.f75137xae79c325.setErrorCallback(new android.hardware.Camera.ErrorCallback() { // from class: org.webrtc.Camera1Session.1
            @Override // android.hardware.Camera.ErrorCallback
            public void onError(int i17, android.hardware.Camera camera) {
                java.lang.String str;
                if (i17 == 100) {
                    str = "Camera server died!";
                } else {
                    str = "Camera error: " + i17;
                }
                org.p3371xd0ce3e8d.C29806x779f633f.e(org.p3371xd0ce3e8d.C29737x33d44b6a.TAG, str);
                org.p3371xd0ce3e8d.C29737x33d44b6a.this.m155195xdc1110df();
                if (i17 == 2) {
                    org.p3371xd0ce3e8d.C29737x33d44b6a.this.f75143xb307e119.mo155294xfb77e63f(org.p3371xd0ce3e8d.C29737x33d44b6a.this);
                } else {
                    org.p3371xd0ce3e8d.C29737x33d44b6a.this.f75143xb307e119.mo155295x95dbd684(org.p3371xd0ce3e8d.C29737x33d44b6a.this, str);
                }
            }
        });
        if (this.f75141x1ec2557a) {
            m155193xc43d1b3f();
        } else {
            m155192xcf1847b0();
        }
        try {
            yj0.a.j(this.f75137xae79c325, "org/webrtc/Camera1Session", "startCapturing", "()V", "android/hardware/Camera", "startPreview", "()V");
        } catch (java.lang.RuntimeException e17) {
            m155195xdc1110df();
            this.f75143xb307e119.mo155295x95dbd684(this, e17.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: stopInternal */
    public void m155195xdc1110df() {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Stop internal");
        m155186x8ba33a00();
        org.p3371xd0ce3e8d.C29737x33d44b6a.SessionState sessionState = this.f75146x68ac491;
        org.p3371xd0ce3e8d.C29737x33d44b6a.SessionState sessionState2 = org.p3371xd0ce3e8d.C29737x33d44b6a.SessionState.STOPPED;
        if (sessionState == sessionState2) {
            org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Camera is already stopped");
            return;
        }
        this.f75146x68ac491 = sessionState2;
        this.f75147x3b6754fc.m156412x3f73dad9();
        this.f75137xae79c325.stopPreview();
        yj0.a.j(this.f75137xae79c325, "org/webrtc/Camera1Session", "stopInternal", "()V", "android/hardware/Camera", "release", "()V");
        this.f75143xb307e119.mo155293x21df6c70(this);
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Stop done");
    }

    /* renamed from: updateCameraParameters */
    private static void m155196x104d41d8(android.hardware.Camera camera, android.hardware.Camera.Parameters parameters, org.p3371xd0ce3e8d.C29746x65bafa4d.CaptureFormat captureFormat, org.p3371xd0ce3e8d.C29857x275421 c29857x275421, boolean z17) {
        java.util.List<java.lang.String> supportedFocusModes = parameters.getSupportedFocusModes();
        org.p3371xd0ce3e8d.C29746x65bafa4d.CaptureFormat.FramerateRange framerateRange = captureFormat.f75242x208b77cd;
        parameters.setPreviewFpsRange(framerateRange.min, framerateRange.max);
        parameters.setPreviewSize(captureFormat.f75245x6be2dc6, captureFormat.f75243xb7389127);
        parameters.setPictureSize(c29857x275421.f75950x6be2dc6, c29857x275421.f75949xb7389127);
        if (!z17) {
            parameters.setPreviewFormat(17);
        }
        if (parameters.isVideoStabilizationSupported()) {
            parameters.setVideoStabilization(true);
        }
        if (supportedFocusModes != null && supportedFocusModes.contains("continuous-video")) {
            parameters.setFocusMode("continuous-video");
        }
        camera.setParameters(parameters);
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29748x5948a391
    /* renamed from: stop */
    public void mo155197x360802() {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Stop camera1 session on camera " + this.f75138xf7159720);
        m155186x8ba33a00();
        if (this.f75146x68ac491 != org.p3371xd0ce3e8d.C29737x33d44b6a.SessionState.STOPPED) {
            long nanoTime = java.lang.System.nanoTime();
            m155195xdc1110df();
            f75135xe7c48ba3.m155618xfeff1dab((int) java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(java.lang.System.nanoTime() - nanoTime));
        }
    }
}
