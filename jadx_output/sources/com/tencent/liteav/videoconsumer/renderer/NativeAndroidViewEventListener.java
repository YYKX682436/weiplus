package com.tencent.liteav.videoconsumer.renderer;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::video")
/* loaded from: classes13.dex */
public class NativeAndroidViewEventListener implements com.tencent.rtmp.ui.AndroidViewEventListener {
    private long mNativeHandler;

    public NativeAndroidViewEventListener(long j17) {
        this.mNativeHandler = j17;
    }

    private static native void nativeOnTap(long j17, int i17, int i18, int i19, int i27);

    private static native void nativeOnZoom(long j17, float f17);

    private static native void nativeonSizeChanged(long j17, int i17, int i18, int i19, int i27);

    @Override // com.tencent.rtmp.ui.AndroidViewEventListener
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        long j17 = this.mNativeHandler;
        if (j17 != 0) {
            nativeonSizeChanged(j17, i17, i18, i19, i27);
        }
    }

    @Override // com.tencent.rtmp.ui.AndroidViewEventListener
    public synchronized void onTap(int i17, int i18, int i19, int i27) {
        long j17 = this.mNativeHandler;
        if (j17 != 0) {
            nativeOnTap(j17, i17, i18, i19, i27);
        }
    }

    @Override // com.tencent.rtmp.ui.AndroidViewEventListener
    public void onZoom(float f17) {
        long j17 = this.mNativeHandler;
        if (j17 != 0) {
            nativeOnZoom(j17, f17);
        }
    }

    public synchronized void resetNativeHandle() {
        this.mNativeHandler = 0L;
    }
}
