package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.CallSessionFileRotatingLogSink */
/* loaded from: classes7.dex */
public class C29732x49294f0b {

    /* renamed from: nativeSink */
    private long f75128xb905bf4a;

    public C29732x49294f0b(java.lang.String str, int i17, org.p3371xd0ce3e8d.C29806x779f633f.Severity severity) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("dirPath may not be null.");
        }
        this.f75128xb905bf4a = m155145x8280e2bd(str, i17, severity.ordinal());
    }

    /* renamed from: getLogData */
    public static byte[] m155144x522400d8(java.lang.String str) {
        if (str != null) {
            return m155147x38203c4f(str);
        }
        throw new java.lang.IllegalArgumentException("dirPath may not be null.");
    }

    /* renamed from: nativeAddSink */
    private static native long m155145x8280e2bd(java.lang.String str, int i17, int i18);

    /* renamed from: nativeDeleteSink */
    private static native void m155146x4f294655(long j17);

    /* renamed from: nativeGetLogData */
    private static native byte[] m155147x38203c4f(java.lang.String str);

    /* renamed from: dispose */
    public void m155148x63a5261f() {
        long j17 = this.f75128xb905bf4a;
        if (j17 != 0) {
            m155146x4f294655(j17);
            this.f75128xb905bf4a = 0L;
        }
    }
}
