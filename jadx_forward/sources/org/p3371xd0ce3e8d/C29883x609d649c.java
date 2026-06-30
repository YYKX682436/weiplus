package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.TimestampAligner */
/* loaded from: classes16.dex */
public class C29883x609d649c {

    /* renamed from: nativeTimestampAligner */
    private volatile long f76036xb282a6b3 = m156484x155d4e8f();

    /* renamed from: checkNativeAlignerExists */
    private void m156482xffcf2c6f() {
        if (this.f76036xb282a6b3 == 0) {
            throw new java.lang.IllegalStateException("TimestampAligner has been disposed.");
        }
    }

    /* renamed from: getRtcTimeNanos */
    public static long m156483x36bf6687() {
        return m156486x2da80dc8();
    }

    /* renamed from: nativeCreateTimestampAligner */
    private static native long m156484x155d4e8f();

    /* renamed from: nativeReleaseTimestampAligner */
    private static native void m156485xe07fc8c(long j17);

    /* renamed from: nativeRtcTimeNanos */
    private static native long m156486x2da80dc8();

    /* renamed from: nativeTranslateTimestamp */
    private static native long m156487x413ac3df(long j17, long j18);

    /* renamed from: dispose */
    public void m156488x63a5261f() {
        m156482xffcf2c6f();
        m156485xe07fc8c(this.f76036xb282a6b3);
        this.f76036xb282a6b3 = 0L;
    }

    /* renamed from: translateTimestamp */
    public long m156489x65d9ef68(long j17) {
        m156482xffcf2c6f();
        return m156487x413ac3df(this.f76036xb282a6b3, j17);
    }
}
