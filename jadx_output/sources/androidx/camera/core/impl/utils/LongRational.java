package androidx.camera.core.impl.utils;

/* loaded from: classes13.dex */
final class LongRational {
    private final long mDenominator;
    private final long mNumerator;

    public LongRational(long j17, long j18) {
        this.mNumerator = j17;
        this.mDenominator = j18;
    }

    public long getDenominator() {
        return this.mDenominator;
    }

    public long getNumerator() {
        return this.mNumerator;
    }

    public double toDouble() {
        return this.mNumerator / this.mDenominator;
    }

    public java.lang.String toString() {
        return this.mNumerator + "/" + this.mDenominator;
    }

    public LongRational(double d17) {
        this((long) (d17 * 10000.0d), com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
    }
}
