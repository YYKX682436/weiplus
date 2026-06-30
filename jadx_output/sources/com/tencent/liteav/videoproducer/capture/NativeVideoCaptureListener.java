package com.tencent.liteav.videoproducer.capture;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::video")
/* loaded from: classes14.dex */
class NativeVideoCaptureListener implements com.tencent.liteav.videobase.videobase.c, com.tencent.liteav.videoproducer.capture.CaptureSourceInterface.CaptureSourceListener {
    private static final java.lang.String TAG = "NativeVideoCaptureListener";
    private long mNativeHandler;

    public NativeVideoCaptureListener(long j17) {
        this.mNativeHandler = j17;
    }

    private static native void nativeOnAutoFocusEnabled(long j17, boolean z17);

    private static native void nativeOnCaptureError(long j17, int i17, java.lang.String str);

    private static native void nativeOnCaptureFirstFrame(long j17);

    private static native void nativeOnCapturePaused(long j17);

    private static native void nativeOnCaptureResumed(long j17);

    private static native void nativeOnCaptureStopped(long j17);

    private static native void nativeOnFrameAvailable(long j17, com.tencent.liteav.videobase.frame.PixelFrame pixelFrame);

    private static native void nativeOnScreenDisplayOrientationChanged(long j17, int i17);

    private static native void nativeOnStartFinish(long j17, boolean z17);

    private static native void nativeOnZoomEnabled(long j17, boolean z17);

    public synchronized void notifyError(com.tencent.liteav.videobase.videobase.e.a aVar, java.lang.String str) {
        if (this.mNativeHandler == 0) {
            return;
        }
        int a17 = com.tencent.liteav.videobase.videobase.e.a(aVar);
        if (a17 != 0) {
            nativeOnCaptureError(this.mNativeHandler, a17, str);
            return;
        }
        com.tencent.liteav.base.util.LiteavLog.i(TAG, "notifyError error code:" + aVar + ", do not need transfer to LiteAvCode:" + a17);
    }

    public void notifyEvent(com.tencent.liteav.videobase.videobase.e.b bVar, int i17, java.lang.String str) {
    }

    @Override // com.tencent.liteav.videobase.videobase.c
    public synchronized void notifyWarning(com.tencent.liteav.videobase.videobase.e.c cVar, java.lang.String str) {
    }

    public synchronized void onCameraTouchEnable(boolean z17) {
        long j17 = this.mNativeHandler;
        if (j17 != 0) {
            nativeOnAutoFocusEnabled(j17, !z17);
        }
    }

    public synchronized void onCameraZoomEnable(boolean z17) {
        long j17 = this.mNativeHandler;
        if (j17 != 0) {
            nativeOnZoomEnabled(j17, z17);
        }
    }

    public synchronized void onCaptureError() {
    }

    public synchronized void onCaptureFirstFrame() {
        long j17 = this.mNativeHandler;
        if (j17 != 0) {
            nativeOnCaptureFirstFrame(j17);
        }
    }

    public synchronized void onFrameAvailable(com.tencent.liteav.videoproducer.capture.CaptureSourceInterface captureSourceInterface, com.tencent.liteav.videobase.frame.PixelFrame pixelFrame) {
        long j17 = this.mNativeHandler;
        if (j17 != 0) {
            nativeOnFrameAvailable(j17, pixelFrame);
        }
    }

    public synchronized void onScreenDisplayOrientationChanged(com.tencent.liteav.base.util.k kVar) {
        long j17 = this.mNativeHandler;
        if (j17 != 0) {
            nativeOnScreenDisplayOrientationChanged(j17, com.tencent.liteav.base.util.k.a(kVar));
        }
    }

    public synchronized void onStartFinish(boolean z17) {
        long j17 = this.mNativeHandler;
        if (j17 != 0) {
            nativeOnStartFinish(j17, z17);
        }
    }

    public synchronized void resetNativeHandle() {
        this.mNativeHandler = 0L;
    }

    public synchronized void updateStatus(com.tencent.liteav.videobase.videobase.f fVar, java.lang.Object obj) {
    }

    public synchronized void notifyEvent(com.tencent.liteav.videobase.videobase.e.b bVar, java.lang.Object obj, java.lang.String str) {
        long j17 = this.mNativeHandler;
        if (j17 == 0) {
            return;
        }
        if (bVar == com.tencent.liteav.videobase.videobase.e.b.EVT_VIDEO_CAPTURE_FIRST_FRAME) {
            nativeOnCaptureFirstFrame(j17);
            return;
        }
        if (bVar == com.tencent.liteav.videobase.videobase.e.b.EVT_VIDEO_CAPTURE_SCREEN_CAPTURE_INTERRUPTED) {
            nativeOnCapturePaused(j17);
        } else if (bVar == com.tencent.liteav.videobase.videobase.e.b.EVT_VIDEO_CAPTURE_SCREEN_CAPTURE_RESUME) {
            nativeOnCaptureResumed(j17);
        } else {
            if (bVar == com.tencent.liteav.videobase.videobase.e.b.EVT_VIDEO_CAPTURE_SCREEN_CAPTURE_STOP_SUCCESS) {
                nativeOnCaptureStopped(j17);
            }
        }
    }

    @Override // com.tencent.liteav.videobase.videobase.c
    public synchronized void updateStatus(com.tencent.liteav.videobase.videobase.f fVar, int i17, java.lang.Object obj) {
    }
}
