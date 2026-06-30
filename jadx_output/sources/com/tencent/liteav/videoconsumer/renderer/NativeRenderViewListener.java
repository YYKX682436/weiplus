package com.tencent.liteav.videoconsumer.renderer;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::video")
/* loaded from: classes13.dex */
class NativeRenderViewListener implements com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface.RenderViewListener {
    private long mNativeHandler;

    public NativeRenderViewListener(long j17) {
        this.mNativeHandler = j17;
    }

    private static native void nativeOnRequestRedraw(long j17, android.graphics.Bitmap bitmap);

    private static native void nativeOnSurfaceChanged(long j17, android.view.Surface surface, boolean z17);

    private static native void nativeOnSurfaceDestroy(long j17);

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface.RenderViewListener
    public synchronized void onRequestRedraw(android.graphics.Bitmap bitmap) {
        long j17 = this.mNativeHandler;
        if (j17 != 0) {
            nativeOnRequestRedraw(j17, bitmap);
        }
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface.RenderViewListener
    public synchronized void onSurfaceChanged(android.view.Surface surface, boolean z17) {
        long j17 = this.mNativeHandler;
        if (j17 != 0) {
            nativeOnSurfaceChanged(j17, surface, z17);
        }
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface.RenderViewListener
    public synchronized void onSurfaceDestroy() {
        long j17 = this.mNativeHandler;
        if (j17 != 0) {
            nativeOnSurfaceDestroy(j17);
        }
    }

    public synchronized void resetNativeHandle() {
        this.mNativeHandler = 0L;
    }
}
