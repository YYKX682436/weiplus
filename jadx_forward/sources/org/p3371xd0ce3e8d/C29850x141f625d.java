package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.RtpReceiver */
/* loaded from: classes15.dex */
public class C29850x141f625d {

    /* renamed from: cachedTrack */
    private org.p3371xd0ce3e8d.C29816x8efc747 f75908x3c852549;

    /* renamed from: nativeObserver */
    private long f75909x2cba000d;

    /* renamed from: nativeRtpReceiver */
    private long f75910x8a40ede6;

    /* renamed from: org.webrtc.RtpReceiver$Observer */
    /* loaded from: classes6.dex */
    public interface Observer {
        /* renamed from: onFirstPacketReceived */
        void m156293x5fc114fa(org.p3371xd0ce3e8d.C29816x8efc747.MediaType mediaType);
    }

    public C29850x141f625d(long j17) {
        this.f75910x8a40ede6 = j17;
        this.f75908x3c852549 = org.p3371xd0ce3e8d.C29816x8efc747.m155759xe04bf043(m156284x8d2844cc(j17));
    }

    /* renamed from: checkRtpReceiverExists */
    private void m156281x504e1511() {
        if (this.f75910x8a40ede6 == 0) {
            throw new java.lang.IllegalStateException("RtpReceiver has been disposed.");
        }
    }

    /* renamed from: nativeGetId */
    private static native java.lang.String m156282x6707513a(long j17);

    /* renamed from: nativeGetParameters */
    private static native org.p3371xd0ce3e8d.C29849x98aed6d8 m156283xad247709(long j17);

    /* renamed from: nativeGetTrack */
    private static native long m156284x8d2844cc(long j17);

    /* renamed from: nativeSetFrameDecryptor */
    private static native void m156285xde96eee(long j17, long j18);

    /* renamed from: nativeSetObserver */
    private static native long m156286x64e524c1(long j17, org.p3371xd0ce3e8d.C29850x141f625d.Observer observer);

    /* renamed from: nativeUnsetObserver */
    private static native void m156287x7f1cf648(long j17, long j18);

    /* renamed from: SetObserver */
    public void m156288xeec39938(org.p3371xd0ce3e8d.C29850x141f625d.Observer observer) {
        m156281x504e1511();
        long j17 = this.f75909x2cba000d;
        if (j17 != 0) {
            m156287x7f1cf648(this.f75910x8a40ede6, j17);
        }
        this.f75909x2cba000d = m156286x64e524c1(this.f75910x8a40ede6, observer);
    }

    /* renamed from: dispose */
    public void m156289x63a5261f() {
        m156281x504e1511();
        this.f75908x3c852549.mo155765x63a5261f();
        long j17 = this.f75909x2cba000d;
        if (j17 != 0) {
            m156287x7f1cf648(this.f75910x8a40ede6, j17);
            this.f75909x2cba000d = 0L;
        }
        org.p3371xd0ce3e8d.C29797xa99bc1d0.m155650x8b8e8283(this.f75910x8a40ede6);
        this.f75910x8a40ede6 = 0L;
    }

    /* renamed from: getParameters */
    public org.p3371xd0ce3e8d.C29849x98aed6d8 m156290x99879e0() {
        m156281x504e1511();
        return m156283xad247709(this.f75910x8a40ede6);
    }

    public java.lang.String id() {
        m156281x504e1511();
        return m156282x6707513a(this.f75910x8a40ede6);
    }

    /* renamed from: setFrameDecryptor */
    public void m156291x38622e45(org.p3371xd0ce3e8d.InterfaceC29777x461ac563 interfaceC29777x461ac563) {
        m156281x504e1511();
        m156285xde96eee(this.f75910x8a40ede6, interfaceC29777x461ac563.m155533xfd935db0());
    }

    /* renamed from: track */
    public org.p3371xd0ce3e8d.C29816x8efc747 m156292x697f14b() {
        return this.f75908x3c852549;
    }
}
