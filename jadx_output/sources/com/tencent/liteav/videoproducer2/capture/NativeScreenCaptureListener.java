package com.tencent.liteav.videoproducer2.capture;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::video")
/* loaded from: classes16.dex */
public class NativeScreenCaptureListener implements android.graphics.SurfaceTexture.OnFrameAvailableListener, com.tencent.liteav.videoproducer.capture.VirtualDisplayManager.VirtualDisplayListener {
    private final com.tencent.liteav.base.util.CustomHandler mCallbackHandler = new com.tencent.liteav.base.util.CustomHandler(android.os.Looper.myLooper());
    private long mNativeHandle;

    public NativeScreenCaptureListener(long j17) {
        this.mNativeHandle = j17;
    }

    private static native void nativeOnCaptureError(long j17);

    private static native void nativeOnFrameAvailable(long j17, android.graphics.SurfaceTexture surfaceTexture);

    private static native void nativeOnStartFinish(long j17, boolean z17, boolean z18);

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void notifyCaptureError() {
        long j17 = this.mNativeHandle;
        if (j17 != 0) {
            nativeOnCaptureError(j17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void notifyFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        long j17 = this.mNativeHandle;
        if (j17 != 0) {
            nativeOnFrameAvailable(j17, surfaceTexture);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void notifyStartFinish(boolean z17, boolean z18) {
        long j17 = this.mNativeHandle;
        if (j17 != 0) {
            nativeOnStartFinish(j17, z17, z18);
        }
    }

    public android.os.Handler getCallbackHandler() {
        return this.mCallbackHandler;
    }

    @Override // com.tencent.liteav.videoproducer.capture.VirtualDisplayManager.VirtualDisplayListener
    public void onCaptureError() {
        this.mCallbackHandler.runOrPost(com.tencent.liteav.videoproducer2.capture.g.a(this));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        this.mCallbackHandler.runOrPost(com.tencent.liteav.videoproducer2.capture.e.a(this, surfaceTexture));
    }

    @Override // com.tencent.liteav.videoproducer.capture.VirtualDisplayManager.VirtualDisplayListener
    public void onStartFinish(boolean z17, boolean z18) {
        this.mCallbackHandler.runOrPost(com.tencent.liteav.videoproducer2.capture.f.a(this, z17, z18));
    }

    public synchronized void resetNativeHandle() {
        this.mNativeHandle = 0L;
    }
}
