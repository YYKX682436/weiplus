package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.CameraVideoCapturer */
/* loaded from: classes16.dex */
public interface InterfaceC29749x5b3d2842 extends org.p3371xd0ce3e8d.InterfaceC29885x1cc01f67 {

    /* renamed from: org.webrtc.CameraVideoCapturer$CameraEventsHandler */
    /* loaded from: classes16.dex */
    public interface CameraEventsHandler {
        /* renamed from: onCameraClosed */
        void mo155298x21df6c70();

        /* renamed from: onCameraDisconnected */
        void mo155299xfb77e63f();

        /* renamed from: onCameraError */
        void mo155300x95dbd684(java.lang.String str);

        /* renamed from: onCameraFreezed */
        void mo155301xc26aee29(java.lang.String str);

        /* renamed from: onCameraOpening */
        void mo155302x9b1d2ad4(java.lang.String str);

        /* renamed from: onFirstFrameAvailable */
        void mo155303xc73bce4d();
    }

    /* renamed from: org.webrtc.CameraVideoCapturer$CameraStatistics */
    /* loaded from: classes16.dex */
    public static class CameraStatistics {

        /* renamed from: CAMERA_FREEZE_REPORT_TIMOUT_MS */
        private static final int f75249x182d312 = 4000;

        /* renamed from: CAMERA_OBSERVER_PERIOD_MS */
        private static final int f75250xcedf7615 = 2000;
        private static final java.lang.String TAG = "CameraStatistics";

        /* renamed from: cameraObserver */
        private final java.lang.Runnable f75251xcc8c851b;

        /* renamed from: eventsHandler */
        private final org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842.CameraEventsHandler f75252xc10a4ff1;

        /* renamed from: frameCount */
        private int f75253xee5393a2;

        /* renamed from: freezePeriodCount */
        private int f75254x2df14b7;

        /* renamed from: surfaceTextureHelper */
        private final org.p3371xd0ce3e8d.C29864x472c891c f75255x3b6754fc;

        public CameraStatistics(org.p3371xd0ce3e8d.C29864x472c891c c29864x472c891c, org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842.CameraEventsHandler cameraEventsHandler) {
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: org.webrtc.CameraVideoCapturer.CameraStatistics.1
                @Override // java.lang.Runnable
                public void run() {
                    org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842.CameraStatistics.TAG, "Camera fps: " + java.lang.Math.round((org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842.CameraStatistics.this.f75253xee5393a2 * 1000.0f) / 2000.0f) + ".");
                    if (org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842.CameraStatistics.this.f75253xee5393a2 == 0) {
                        org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842.CameraStatistics.m155332xbbd77eb5(org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842.CameraStatistics.this);
                        if (org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842.CameraStatistics.this.f75254x2df14b7 * 2000 >= 4000 && org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842.CameraStatistics.this.f75252xc10a4ff1 != null) {
                            org.p3371xd0ce3e8d.C29806x779f633f.e(org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842.CameraStatistics.TAG, "Camera freezed.");
                            if (org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842.CameraStatistics.this.f75255x3b6754fc.m156408x77c91811()) {
                                org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842.CameraStatistics.this.f75252xc10a4ff1.mo155301xc26aee29("Camera failure. Client must return video buffers.");
                                return;
                            } else {
                                org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842.CameraStatistics.this.f75252xc10a4ff1.mo155301xc26aee29("Camera failure.");
                                return;
                            }
                        }
                    } else {
                        org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842.CameraStatistics.this.f75254x2df14b7 = 0;
                    }
                    org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842.CameraStatistics.this.f75253xee5393a2 = 0;
                    org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842.CameraStatistics.this.f75255x3b6754fc.m156406x67189314().postDelayed(this, 2000L);
                }
            };
            this.f75251xcc8c851b = runnable;
            if (c29864x472c891c == null) {
                throw new java.lang.IllegalArgumentException("SurfaceTextureHelper is null");
            }
            this.f75255x3b6754fc = c29864x472c891c;
            this.f75252xc10a4ff1 = cameraEventsHandler;
            this.f75253xee5393a2 = 0;
            this.f75254x2df14b7 = 0;
            c29864x472c891c.m156406x67189314().postDelayed(runnable, 2000L);
        }

        /* renamed from: access$104 */
        public static /* synthetic */ int m155332xbbd77eb5(org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842.CameraStatistics cameraStatistics) {
            int i17 = cameraStatistics.f75254x2df14b7 + 1;
            cameraStatistics.f75254x2df14b7 = i17;
            return i17;
        }

        /* renamed from: checkThread */
        private void m155335x2edbf932() {
            if (java.lang.Thread.currentThread() != this.f75255x3b6754fc.m156406x67189314().getLooper().getThread()) {
                throw new java.lang.IllegalStateException("Wrong thread");
            }
        }

        /* renamed from: addFrame */
        public void m155336xb4f57d4c() {
            m155335x2edbf932();
            this.f75253xee5393a2++;
        }

        /* renamed from: release */
        public void m155337x41012807() {
            this.f75255x3b6754fc.m156406x67189314().removeCallbacks(this.f75251xcc8c851b);
        }
    }

    /* renamed from: org.webrtc.CameraVideoCapturer$CameraSwitchHandler */
    /* loaded from: classes16.dex */
    public interface CameraSwitchHandler {
        /* renamed from: onCameraSwitchDone */
        void m155338x7889fdda(boolean z17);

        /* renamed from: onCameraSwitchError */
        void m155339x98c542b0(java.lang.String str);
    }

    @java.lang.Deprecated
    /* renamed from: org.webrtc.CameraVideoCapturer$MediaRecorderHandler */
    /* loaded from: classes6.dex */
    public interface MediaRecorderHandler {
        /* renamed from: onMediaRecorderError */
        void m155340x7d7062a5(java.lang.String str);

        /* renamed from: onMediaRecorderSuccess */
        void m155341xcbbf1d60();
    }

    @java.lang.Deprecated
    /* renamed from: addMediaRecorderToCamera */
    default void m155326xab28c641(android.media.MediaRecorder mediaRecorder, org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842.MediaRecorderHandler mediaRecorderHandler) {
        throw new java.lang.UnsupportedOperationException("Deprecated and not implemented.");
    }

    @java.lang.Deprecated
    /* renamed from: removeMediaRecorderFromCamera */
    default void m155327x234b14ad(org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842.MediaRecorderHandler mediaRecorderHandler) {
        throw new java.lang.UnsupportedOperationException("Deprecated and not implemented.");
    }

    /* renamed from: switchCamera */
    void mo155159x2db92f79(org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842.CameraSwitchHandler cameraSwitchHandler);

    /* renamed from: switchCamera */
    void mo155160x2db92f79(org.p3371xd0ce3e8d.InterfaceC29749x5b3d2842.CameraSwitchHandler cameraSwitchHandler, java.lang.String str);
}
