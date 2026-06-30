package com.tencent.liteav.videoconsumer.consumer;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::video")
/* loaded from: classes7.dex */
public class NativeSnapshotListener {
    private long mNativeVideoSnapListener;

    private NativeSnapshotListener(long j17) {
        this.mNativeVideoSnapListener = j17;
    }

    private native void nativeDestroy(long j17);

    private native void nativeOnComplete(long j17, android.graphics.Bitmap bitmap);

    public void finalize() {
        long j17 = this.mNativeVideoSnapListener;
        if (j17 != 0) {
            nativeDestroy(j17);
            this.mNativeVideoSnapListener = 0L;
        }
        super.finalize();
    }

    public void onComplete(android.graphics.Bitmap bitmap) {
        long j17 = this.mNativeVideoSnapListener;
        if (j17 != 0) {
            nativeOnComplete(j17, bitmap);
            this.mNativeVideoSnapListener = 0L;
        }
    }
}
