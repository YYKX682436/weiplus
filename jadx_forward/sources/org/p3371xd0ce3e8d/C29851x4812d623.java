package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.RtpSender */
/* loaded from: classes15.dex */
public class C29851x4812d623 {

    /* renamed from: cachedTrack */
    private org.p3371xd0ce3e8d.C29816x8efc747 f75911x3c852549;

    /* renamed from: dtmfSender */
    private final org.p3371xd0ce3e8d.C29757xf48515de f75912x7db339be;

    /* renamed from: nativeRtpSender */
    private long f75913xb703afec;

    /* renamed from: ownsTrack */
    private boolean f75914x1757c39e = true;

    public C29851x4812d623(long j17) {
        this.f75913xb703afec = j17;
        this.f75911x3c852549 = org.p3371xd0ce3e8d.C29816x8efc747.m155759xe04bf043(m156299x8d2844cc(j17));
        long m156295xf7feedd = m156295xf7feedd(j17);
        this.f75912x7db339be = m156295xf7feedd != 0 ? new org.p3371xd0ce3e8d.C29757xf48515de(m156295xf7feedd) : null;
    }

    /* renamed from: checkRtpSenderExists */
    private void m156294xc823ba57() {
        if (this.f75913xb703afec == 0) {
            throw new java.lang.IllegalStateException("RtpSender has been disposed.");
        }
    }

    /* renamed from: nativeGetDtmfSender */
    private static native long m156295xf7feedd(long j17);

    /* renamed from: nativeGetId */
    private static native java.lang.String m156296x6707513a(long j17);

    /* renamed from: nativeGetParameters */
    private static native org.p3371xd0ce3e8d.C29849x98aed6d8 m156297xad247709(long j17);

    /* renamed from: nativeGetStreams */
    private static native java.util.List<java.lang.String> m156298xb39e1834(long j17);

    /* renamed from: nativeGetTrack */
    private static native long m156299x8d2844cc(long j17);

    /* renamed from: nativeSetFrameEncryptor */
    private static native void m156300x491871c6(long j17, long j18);

    /* renamed from: nativeSetParameters */
    private static native boolean m156301xdb48c515(long j17, org.p3371xd0ce3e8d.C29849x98aed6d8 c29849x98aed6d8);

    /* renamed from: nativeSetStreams */
    private static native void m156302x270f65a8(long j17, java.util.List<java.lang.String> list);

    /* renamed from: nativeSetTrack */
    private static native boolean m156303x6bb65f40(long j17, long j18);

    /* renamed from: dispose */
    public void m156304x63a5261f() {
        m156294xc823ba57();
        org.p3371xd0ce3e8d.C29757xf48515de c29757xf48515de = this.f75912x7db339be;
        if (c29757xf48515de != null) {
            c29757xf48515de.m155401x63a5261f();
        }
        org.p3371xd0ce3e8d.C29816x8efc747 c29816x8efc747 = this.f75911x3c852549;
        if (c29816x8efc747 != null && this.f75914x1757c39e) {
            c29816x8efc747.mo155765x63a5261f();
        }
        org.p3371xd0ce3e8d.C29797xa99bc1d0.m155650x8b8e8283(this.f75913xb703afec);
        this.f75913xb703afec = 0L;
    }

    /* renamed from: dtmf */
    public org.p3371xd0ce3e8d.C29757xf48515de m156305x2f3629() {
        return this.f75912x7db339be;
    }

    /* renamed from: getNativeRtpSender */
    public long m156306x9b6581b6() {
        m156294xc823ba57();
        return this.f75913xb703afec;
    }

    /* renamed from: getParameters */
    public org.p3371xd0ce3e8d.C29849x98aed6d8 m156307x99879e0() {
        m156294xc823ba57();
        return m156297xad247709(this.f75913xb703afec);
    }

    /* renamed from: getStreams */
    public java.util.List<java.lang.String> m156308xcda1dcbd() {
        m156294xc823ba57();
        return m156298xb39e1834(this.f75913xb703afec);
    }

    public java.lang.String id() {
        m156294xc823ba57();
        return m156296x6707513a(this.f75913xb703afec);
    }

    /* renamed from: setFrameEncryptor */
    public void m156309x7391311d(org.p3371xd0ce3e8d.InterfaceC29778x8149c83b interfaceC29778x8149c83b) {
        m156294xc823ba57();
        m156300x491871c6(this.f75913xb703afec, interfaceC29778x8149c83b.m155534x38c26088());
    }

    /* renamed from: setParameters */
    public boolean m156310x37bcc7ec(org.p3371xd0ce3e8d.C29849x98aed6d8 c29849x98aed6d8) {
        m156294xc823ba57();
        return m156301xdb48c515(this.f75913xb703afec, c29849x98aed6d8);
    }

    /* renamed from: setStreams */
    public void m156311x41132a31(java.util.List<java.lang.String> list) {
        m156294xc823ba57();
        m156302x270f65a8(this.f75913xb703afec, list);
    }

    /* renamed from: setTrack */
    public boolean m156312x53c3b209(org.p3371xd0ce3e8d.C29816x8efc747 c29816x8efc747, boolean z17) {
        m156294xc823ba57();
        if (!m156303x6bb65f40(this.f75913xb703afec, c29816x8efc747 == null ? 0L : c29816x8efc747.m155767xc4a38054())) {
            return false;
        }
        org.p3371xd0ce3e8d.C29816x8efc747 c29816x8efc7472 = this.f75911x3c852549;
        if (c29816x8efc7472 != null && this.f75914x1757c39e) {
            c29816x8efc7472.mo155765x63a5261f();
        }
        this.f75911x3c852549 = c29816x8efc747;
        this.f75914x1757c39e = z17;
        return true;
    }

    /* renamed from: track */
    public org.p3371xd0ce3e8d.C29816x8efc747 m156313x697f14b() {
        return this.f75911x3c852549;
    }
}
