package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.MediaStreamTrack */
/* loaded from: classes15.dex */
public class C29816x8efc747 {

    /* renamed from: AUDIO_TRACK_KIND */
    public static final java.lang.String f75563x22a65a51 = "audio";

    /* renamed from: VIDEO_TRACK_KIND */
    public static final java.lang.String f75564xb348788c = "video";

    /* renamed from: nativeTrack */
    private long f75565x67c42774;

    /* renamed from: org.webrtc.MediaStreamTrack$MediaType */
    /* loaded from: classes11.dex */
    public enum MediaType {
        MEDIA_TYPE_AUDIO(0),
        MEDIA_TYPE_VIDEO(1);


        /* renamed from: nativeIndex */
        private final int f75569x67275efb;

        MediaType(int i17) {
            this.f75569x67275efb = i17;
        }

        /* renamed from: fromNativeIndex */
        public static org.p3371xd0ce3e8d.C29816x8efc747.MediaType m155772xde3460f1(int i17) {
            for (org.p3371xd0ce3e8d.C29816x8efc747.MediaType mediaType : m155774xcee59d22()) {
                if (mediaType.m155775x2659730d() == i17) {
                    return mediaType;
                }
            }
            throw new java.lang.IllegalArgumentException("Unknown native media type: " + i17);
        }

        /* renamed from: getNative */
        public int m155775x2659730d() {
            return this.f75569x67275efb;
        }
    }

    /* renamed from: org.webrtc.MediaStreamTrack$State */
    /* loaded from: classes6.dex */
    public enum State {
        LIVE,
        ENDED;

        /* renamed from: fromNativeIndex */
        public static org.p3371xd0ce3e8d.C29816x8efc747.State m155777xde3460f1(int i17) {
            return m155779xcee59d22()[i17];
        }
    }

    public C29816x8efc747(long j17) {
        if (j17 == 0) {
            throw new java.lang.IllegalArgumentException("nativeTrack may not be null");
        }
        this.f75565x67c42774 = j17;
    }

    /* renamed from: checkMediaStreamTrackExists */
    private void m155758x32ac58b() {
        if (this.f75565x67c42774 == 0) {
            throw new java.lang.IllegalStateException("MediaStreamTrack has been disposed.");
        }
    }

    /* renamed from: createMediaStreamTrack */
    public static org.p3371xd0ce3e8d.C29816x8efc747 m155759xe04bf043(long j17) {
        if (j17 == 0) {
            return null;
        }
        java.lang.String m155762xc278f3f3 = m155762xc278f3f3(j17);
        if (m155762xc278f3f3.equals("audio")) {
            return new org.p3371xd0ce3e8d.C29727xd28f3735(j17);
        }
        if (m155762xc278f3f3.equals("video")) {
            return new org.p3371xd0ce3e8d.C29912x15c75db0(j17);
        }
        return null;
    }

    /* renamed from: nativeGetEnabled */
    private static native boolean m155760xc3d90282(long j17);

    /* renamed from: nativeGetId */
    private static native java.lang.String m155761x6707513a(long j17);

    /* renamed from: nativeGetKind */
    private static native java.lang.String m155762xc278f3f3(long j17);

    /* renamed from: nativeGetState */
    private static native org.p3371xd0ce3e8d.C29816x8efc747.State m155763x8d1b1812(long j17);

    /* renamed from: nativeSetEnabled */
    private static native boolean m155764x374a4ff6(long j17, boolean z17);

    /* renamed from: dispose */
    public void mo155765x63a5261f() {
        m155758x32ac58b();
        org.p3371xd0ce3e8d.C29797xa99bc1d0.m155650x8b8e8283(this.f75565x67c42774);
        this.f75565x67c42774 = 0L;
    }

    /* renamed from: enabled */
    public boolean m155766xa00f8b41() {
        m155758x32ac58b();
        return m155760xc3d90282(this.f75565x67c42774);
    }

    /* renamed from: getNativeMediaStreamTrack */
    public long m155767xc4a38054() {
        m155758x32ac58b();
        return this.f75565x67c42774;
    }

    public java.lang.String id() {
        m155758x32ac58b();
        return m155761x6707513a(this.f75565x67c42774);
    }

    /* renamed from: kind */
    public java.lang.String m155768x323b94() {
        m155758x32ac58b();
        return m155762xc278f3f3(this.f75565x67c42774);
    }

    /* renamed from: setEnabled */
    public boolean m155769x514e147f(boolean z17) {
        m155758x32ac58b();
        return m155764x374a4ff6(this.f75565x67c42774, z17);
    }

    /* renamed from: state */
    public org.p3371xd0ce3e8d.C29816x8efc747.State m155770x68ac491() {
        m155758x32ac58b();
        return m155763x8d1b1812(this.f75565x67c42774);
    }
}
