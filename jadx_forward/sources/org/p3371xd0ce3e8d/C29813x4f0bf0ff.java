package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.MediaSource */
/* loaded from: classes16.dex */
public class C29813x4f0bf0ff {

    /* renamed from: nativeSource */
    private long f75552x8eeaf712;

    /* renamed from: refCountDelegate */
    private final org.p3371xd0ce3e8d.C29845xdcc09601 f75553xefc51e1;

    /* renamed from: org.webrtc.MediaSource$State */
    /* loaded from: classes6.dex */
    public enum State {
        INITIALIZING,
        LIVE,
        ENDED,
        MUTED;

        /* renamed from: fromNativeIndex */
        public static org.p3371xd0ce3e8d.C29813x4f0bf0ff.State m155735xde3460f1(int i17) {
            return m155737xcee59d22()[i17];
        }
    }

    public C29813x4f0bf0ff(final long j17) {
        this.f75553xefc51e1 = new org.p3371xd0ce3e8d.C29845xdcc09601(new java.lang.Runnable() { // from class: org.webrtc.MediaSource$$a
            @Override // java.lang.Runnable
            public final void run() {
                org.p3371xd0ce3e8d.C29797xa99bc1d0.m155650x8b8e8283(j17);
            }
        });
        this.f75552x8eeaf712 = j17;
    }

    /* renamed from: checkMediaSourceExists */
    private void m155727xd8c9a233() {
        if (this.f75552x8eeaf712 == 0) {
            throw new java.lang.IllegalStateException("MediaSource has been disposed.");
        }
    }

    /* renamed from: nativeGetState */
    private static native org.p3371xd0ce3e8d.C29813x4f0bf0ff.State m155729x8d1b1812(long j17);

    /* renamed from: dispose */
    public void mo155730x63a5261f() {
        m155727xd8c9a233();
        this.f75553xefc51e1.mo155513x41012807();
        this.f75552x8eeaf712 = 0L;
    }

    /* renamed from: getNativeMediaSource */
    public long m155731x186203d2() {
        m155727xd8c9a233();
        return this.f75552x8eeaf712;
    }

    /* renamed from: runWithReference */
    public void m155732xbdb15c5a(java.lang.Runnable runnable) {
        if (this.f75553xefc51e1.m156225xbf2bfef2()) {
            try {
                runnable.run();
            } finally {
                this.f75553xefc51e1.mo155513x41012807();
            }
        }
    }

    /* renamed from: state */
    public org.p3371xd0ce3e8d.C29813x4f0bf0ff.State m155733x68ac491() {
        m155727xd8c9a233();
        return m155729x8d1b1812(this.f75552x8eeaf712);
    }
}
