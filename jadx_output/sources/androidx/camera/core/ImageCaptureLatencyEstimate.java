package androidx.camera.core;

/* loaded from: classes4.dex */
public class ImageCaptureLatencyEstimate {
    public static final long UNDEFINED_CAPTURE_LATENCY = -1;
    public static final androidx.camera.core.ImageCaptureLatencyEstimate UNDEFINED_IMAGE_CAPTURE_LATENCY = new androidx.camera.core.ImageCaptureLatencyEstimate(-1, -1);
    public static final long UNDEFINED_PROCESSING_LATENCY = -1;
    private final long mCaptureLatencyMillis;
    private final long mProcessingLatencyMillis;
    private final long mTotalCaptureLatencyMillis;

    public ImageCaptureLatencyEstimate(long j17, long j18) {
        this.mCaptureLatencyMillis = j17;
        this.mProcessingLatencyMillis = j18;
        this.mTotalCaptureLatencyMillis = computeTotalCaptureLatencyMillis(j17, j18);
    }

    private long computeTotalCaptureLatencyMillis(long j17, long j18) {
        if (j17 == -1 || j18 == -1) {
            return -1L;
        }
        return j17 + j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.ImageCaptureLatencyEstimate)) {
            return false;
        }
        androidx.camera.core.ImageCaptureLatencyEstimate imageCaptureLatencyEstimate = (androidx.camera.core.ImageCaptureLatencyEstimate) obj;
        return this.mCaptureLatencyMillis == imageCaptureLatencyEstimate.getCaptureLatencyMillis() && this.mProcessingLatencyMillis == imageCaptureLatencyEstimate.getProcessingLatencyMillis() && this.mTotalCaptureLatencyMillis == imageCaptureLatencyEstimate.getTotalCaptureLatencyMillis();
    }

    public long getCaptureLatencyMillis() {
        return this.mCaptureLatencyMillis;
    }

    public long getProcessingLatencyMillis() {
        return this.mProcessingLatencyMillis;
    }

    public long getTotalCaptureLatencyMillis() {
        return this.mTotalCaptureLatencyMillis;
    }

    public int hashCode() {
        return java.util.Objects.hash(java.lang.Long.valueOf(this.mCaptureLatencyMillis), java.lang.Long.valueOf(this.mProcessingLatencyMillis), java.lang.Long.valueOf(this.mTotalCaptureLatencyMillis));
    }

    public java.lang.String toString() {
        return "captureLatencyMillis=" + this.mCaptureLatencyMillis + ", processingLatencyMillis=" + this.mProcessingLatencyMillis + ", totalCaptureLatencyMillis=" + this.mTotalCaptureLatencyMillis;
    }
}
