package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.RtpTransceiver */
/* loaded from: classes15.dex */
public class C29852xb0ad6b76 {

    /* renamed from: cachedReceiver */
    private org.p3371xd0ce3e8d.C29850x141f625d f75915x4e614d31;

    /* renamed from: cachedSender */
    private org.p3371xd0ce3e8d.C29851x4812d623 f75916x51b965f7;

    /* renamed from: nativeRtpTransceiver */
    private long f75917xba5a474d;

    /* renamed from: org.webrtc.RtpTransceiver$RtpTransceiverDirection */
    /* loaded from: classes11.dex */
    public enum RtpTransceiverDirection {
        SEND_RECV(0),
        SEND_ONLY(1),
        RECV_ONLY(2),
        INACTIVE(3);


        /* renamed from: nativeIndex */
        private final int f75923x67275efb;

        RtpTransceiverDirection(int i17) {
            this.f75923x67275efb = i17;
        }

        /* renamed from: fromNativeIndex */
        public static org.p3371xd0ce3e8d.C29852xb0ad6b76.RtpTransceiverDirection m156338xde3460f1(int i17) {
            for (org.p3371xd0ce3e8d.C29852xb0ad6b76.RtpTransceiverDirection rtpTransceiverDirection : m156340xcee59d22()) {
                if (rtpTransceiverDirection.m156341x40fda5c5() == i17) {
                    return rtpTransceiverDirection;
                }
            }
            throw new java.lang.IllegalArgumentException("Uknown native RtpTransceiverDirection type" + i17);
        }

        /* renamed from: getNativeIndex */
        public int m156341x40fda5c5() {
            return this.f75923x67275efb;
        }
    }

    /* renamed from: org.webrtc.RtpTransceiver$RtpTransceiverInit */
    /* loaded from: classes11.dex */
    public static final class RtpTransceiverInit {

        /* renamed from: direction */
        private final org.p3371xd0ce3e8d.C29852xb0ad6b76.RtpTransceiverDirection f75924xc6a0077f;

        /* renamed from: sendEncodings */
        private final java.util.List<org.p3371xd0ce3e8d.C29849x98aed6d8.Encoding> f75925x663fc6d8;

        /* renamed from: streamIds */
        private final java.util.List<java.lang.String> f75926xed2f9f18;

        public RtpTransceiverInit() {
            this(org.p3371xd0ce3e8d.C29852xb0ad6b76.RtpTransceiverDirection.SEND_RECV);
        }

        /* renamed from: getDirectionNativeIndex */
        public int m156342xfa636672() {
            return this.f75924xc6a0077f.m156341x40fda5c5();
        }

        /* renamed from: getSendEncodings */
        public java.util.List<org.p3371xd0ce3e8d.C29849x98aed6d8.Encoding> m156343x239f8322() {
            return new java.util.ArrayList(this.f75925x663fc6d8);
        }

        /* renamed from: getStreamIds */
        public java.util.List<java.lang.String> m156344xec9d1062() {
            return new java.util.ArrayList(this.f75926xed2f9f18);
        }

        public RtpTransceiverInit(org.p3371xd0ce3e8d.C29852xb0ad6b76.RtpTransceiverDirection rtpTransceiverDirection) {
            this(rtpTransceiverDirection, java.util.Collections.emptyList(), java.util.Collections.emptyList());
        }

        public RtpTransceiverInit(org.p3371xd0ce3e8d.C29852xb0ad6b76.RtpTransceiverDirection rtpTransceiverDirection, java.util.List<java.lang.String> list) {
            this(rtpTransceiverDirection, list, java.util.Collections.emptyList());
        }

        public RtpTransceiverInit(org.p3371xd0ce3e8d.C29852xb0ad6b76.RtpTransceiverDirection rtpTransceiverDirection, java.util.List<java.lang.String> list, java.util.List<org.p3371xd0ce3e8d.C29849x98aed6d8.Encoding> list2) {
            this.f75924xc6a0077f = rtpTransceiverDirection;
            this.f75926xed2f9f18 = new java.util.ArrayList(list);
            this.f75925x663fc6d8 = new java.util.ArrayList(list2);
        }
    }

    public C29852xb0ad6b76(long j17) {
        this.f75917xba5a474d = j17;
        this.f75916x51b965f7 = m156320x157a36d4(j17);
        this.f75915x4e614d31 = m156319x25315ace(j17);
    }

    /* renamed from: checkRtpTransceiverExists */
    private void m156314xe2e26c7a() {
        if (this.f75917xba5a474d == 0) {
            throw new java.lang.IllegalStateException("RtpTransceiver has been disposed.");
        }
    }

    /* renamed from: nativeCurrentDirection */
    private static native org.p3371xd0ce3e8d.C29852xb0ad6b76.RtpTransceiverDirection m156315x2a2b083d(long j17);

    /* renamed from: nativeDirection */
    private static native org.p3371xd0ce3e8d.C29852xb0ad6b76.RtpTransceiverDirection m156316xad030128(long j17);

    /* renamed from: nativeGetMediaType */
    private static native org.p3371xd0ce3e8d.C29816x8efc747.MediaType m156317xd6dd8c3f(long j17);

    /* renamed from: nativeGetMid */
    private static native java.lang.String m156318x79e2e609(long j17);

    /* renamed from: nativeGetReceiver */
    private static native org.p3371xd0ce3e8d.C29850x141f625d m156319x25315ace(long j17);

    /* renamed from: nativeGetSender */
    private static native org.p3371xd0ce3e8d.C29851x4812d623 m156320x157a36d4(long j17);

    /* renamed from: nativeSetDirection */
    private static native boolean m156321x7a3c72f4(long j17, org.p3371xd0ce3e8d.C29852xb0ad6b76.RtpTransceiverDirection rtpTransceiverDirection);

    /* renamed from: nativeStopInternal */
    private static native void m156322x33ec4a96(long j17);

    /* renamed from: nativeStopStandard */
    private static native void m156323x6029a296(long j17);

    /* renamed from: nativeStopped */
    private static native boolean m156324x56a6e1b6(long j17);

    /* renamed from: dispose */
    public void m156325x63a5261f() {
        m156314xe2e26c7a();
        this.f75916x51b965f7.m156304x63a5261f();
        this.f75915x4e614d31.m156289x63a5261f();
        org.p3371xd0ce3e8d.C29797xa99bc1d0.m155650x8b8e8283(this.f75917xba5a474d);
        this.f75917xba5a474d = 0L;
    }

    /* renamed from: getCurrentDirection */
    public org.p3371xd0ce3e8d.C29852xb0ad6b76.RtpTransceiverDirection m156326xb259e97c() {
        m156314xe2e26c7a();
        return m156315x2a2b083d(this.f75917xba5a474d);
    }

    /* renamed from: getDirection */
    public org.p3371xd0ce3e8d.C29852xb0ad6b76.RtpTransceiverDirection m156327xc60d78c9() {
        m156314xe2e26c7a();
        return m156316xad030128(this.f75917xba5a474d);
    }

    /* renamed from: getMediaType */
    public org.p3371xd0ce3e8d.C29816x8efc747.MediaType m156328x7f025288() {
        m156314xe2e26c7a();
        return m156317xd6dd8c3f(this.f75917xba5a474d);
    }

    /* renamed from: getMid */
    public java.lang.String m156329xb5885712() {
        m156314xe2e26c7a();
        return m156318x79e2e609(this.f75917xba5a474d);
    }

    /* renamed from: getReceiver */
    public org.p3371xd0ce3e8d.C29850x141f625d m156330x4ba62765() {
        return this.f75915x4e614d31;
    }

    /* renamed from: getSender */
    public org.p3371xd0ce3e8d.C29851x4812d623 m156331x2f173d2b() {
        return this.f75916x51b965f7;
    }

    /* renamed from: isStopped */
    public boolean m156332x6d20d943() {
        m156314xe2e26c7a();
        return m156324x56a6e1b6(this.f75917xba5a474d);
    }

    /* renamed from: setDirection */
    public boolean m156333x2261393d(org.p3371xd0ce3e8d.C29852xb0ad6b76.RtpTransceiverDirection rtpTransceiverDirection) {
        m156314xe2e26c7a();
        return m156321x7a3c72f4(this.f75917xba5a474d, rtpTransceiverDirection);
    }

    /* renamed from: stop */
    public void m156334x360802() {
        m156314xe2e26c7a();
        m156322x33ec4a96(this.f75917xba5a474d);
    }

    /* renamed from: stopInternal */
    public void m156335xdc1110df() {
        m156314xe2e26c7a();
        m156322x33ec4a96(this.f75917xba5a474d);
    }

    /* renamed from: stopStandard */
    public void m156336x84e68df() {
        m156314xe2e26c7a();
        m156323x6029a296(this.f75917xba5a474d);
    }
}
