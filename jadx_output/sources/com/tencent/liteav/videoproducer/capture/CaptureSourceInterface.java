package com.tencent.liteav.videoproducer.capture;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::video")
/* loaded from: classes14.dex */
public abstract class CaptureSourceInterface {
    private static final java.lang.String TAG = "CaptureSourceInterface";

    /* loaded from: classes14.dex */
    public static class CaptureParams {

        /* renamed from: b, reason: collision with root package name */
        public int f46998b;

        /* renamed from: c, reason: collision with root package name */
        public int f46999c;

        /* renamed from: d, reason: collision with root package name */
        public int f47000d;

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof com.tencent.liteav.videoproducer.capture.CaptureSourceInterface.CaptureParams)) {
                return false;
            }
            com.tencent.liteav.videoproducer.capture.CaptureSourceInterface.CaptureParams captureParams = (com.tencent.liteav.videoproducer.capture.CaptureSourceInterface.CaptureParams) obj;
            return this.f46998b == captureParams.f46998b && this.f46999c == captureParams.f46999c && this.f47000d == captureParams.f47000d;
        }

        public java.lang.String toString() {
            return java.lang.String.format(java.util.Locale.ENGLISH, "size: %dx%d, fps: %d", java.lang.Integer.valueOf(this.f46999c), java.lang.Integer.valueOf(this.f47000d), java.lang.Integer.valueOf(this.f46998b));
        }
    }

    /* loaded from: classes14.dex */
    public interface CaptureSourceListener {
    }

    public abstract void pause();

    public abstract void resume();

    public void setServerConfig(com.tencent.liteav.videoproducer.producer.ServerVideoProducerConfig serverVideoProducerConfig) {
    }

    public abstract void start(java.lang.Object obj, com.tencent.liteav.videoproducer.capture.CaptureSourceInterface.CaptureParams captureParams, com.tencent.liteav.videoproducer.capture.CaptureSourceInterface.CaptureSourceListener captureSourceListener);

    public abstract void stop();

    public abstract void updateParams(com.tencent.liteav.videoproducer.capture.CaptureSourceInterface.CaptureParams captureParams);
}
