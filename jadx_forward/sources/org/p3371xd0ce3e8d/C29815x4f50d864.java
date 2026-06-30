package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.MediaStream */
/* loaded from: classes15.dex */
public class C29815x4f50d864 {
    private static final java.lang.String TAG = "MediaStream";

    /* renamed from: nativeStream */
    private long f75560x8f2fde77;

    /* renamed from: audioTracks */
    public final java.util.List<org.p3371xd0ce3e8d.C29727xd28f3735> f75559x1bee07fe = new java.util.ArrayList();

    /* renamed from: videoTracks */
    public final java.util.List<org.p3371xd0ce3e8d.C29912x15c75db0> f75562x3fbab0e3 = new java.util.ArrayList();

    /* renamed from: preservedVideoTracks */
    public final java.util.List<org.p3371xd0ce3e8d.C29912x15c75db0> f75561x93418e2b = new java.util.ArrayList();

    public C29815x4f50d864(long j17) {
        this.f75560x8f2fde77 = j17;
    }

    /* renamed from: checkMediaStreamExists */
    private void m155738x345aa9d8() {
        if (this.f75560x8f2fde77 == 0) {
            throw new java.lang.IllegalStateException("MediaStream has been disposed.");
        }
    }

    /* renamed from: nativeAddAudioTrackToNativeStream */
    private static native boolean m155739xef0c4a31(long j17, long j18);

    /* renamed from: nativeAddVideoTrackToNativeStream */
    private static native boolean m155740xee75fd6c(long j17, long j18);

    /* renamed from: nativeGetId */
    private static native java.lang.String m155741x6707513a(long j17);

    /* renamed from: nativeRemoveAudioTrack */
    private static native boolean m155742xb919e0f0(long j17, long j18);

    /* renamed from: nativeRemoveVideoTrack */
    private static native boolean m155743xfc52076b(long j17, long j18);

    /* renamed from: removeMediaStreamTrack */
    private static void m155744x23e137cb(java.util.List<? extends org.p3371xd0ce3e8d.C29816x8efc747> list, long j17) {
        java.util.Iterator<? extends org.p3371xd0ce3e8d.C29816x8efc747> it = list.iterator();
        while (it.hasNext()) {
            org.p3371xd0ce3e8d.C29816x8efc747 next = it.next();
            if (next.m155767xc4a38054() == j17) {
                next.mo155765x63a5261f();
                it.remove();
                return;
            }
        }
        org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Couldn't not find track");
    }

    /* renamed from: addNativeAudioTrack */
    public void m155745x4863f14d(long j17) {
        this.f75559x1bee07fe.add(new org.p3371xd0ce3e8d.C29727xd28f3735(j17));
    }

    /* renamed from: addNativeVideoTrack */
    public void m155746x8b9c17c8(long j17) {
        this.f75562x3fbab0e3.add(new org.p3371xd0ce3e8d.C29912x15c75db0(j17));
    }

    /* renamed from: addPreservedTrack */
    public boolean m155747x56147b94(org.p3371xd0ce3e8d.C29912x15c75db0 c29912x15c75db0) {
        m155738x345aa9d8();
        if (!m155740xee75fd6c(this.f75560x8f2fde77, c29912x15c75db0.m156590x2cca247d())) {
            return false;
        }
        this.f75561x93418e2b.add(c29912x15c75db0);
        return true;
    }

    /* renamed from: addTrack */
    public boolean m155748xb5bac52a(org.p3371xd0ce3e8d.C29727xd28f3735 c29727xd28f3735) {
        m155738x345aa9d8();
        if (!m155739xef0c4a31(this.f75560x8f2fde77, c29727xd28f3735.m155136xe991fe02())) {
            return false;
        }
        this.f75559x1bee07fe.add(c29727xd28f3735);
        return true;
    }

    /* renamed from: dispose */
    public void m155750x63a5261f() {
        m155738x345aa9d8();
        while (!this.f75559x1bee07fe.isEmpty()) {
            org.p3371xd0ce3e8d.C29727xd28f3735 c29727xd28f3735 = this.f75559x1bee07fe.get(0);
            m155754xede4bb27(c29727xd28f3735);
            c29727xd28f3735.mo155765x63a5261f();
        }
        while (!this.f75562x3fbab0e3.isEmpty()) {
            org.p3371xd0ce3e8d.C29912x15c75db0 c29912x15c75db0 = this.f75562x3fbab0e3.get(0);
            m155755xede4bb27(c29912x15c75db0);
            c29912x15c75db0.mo155765x63a5261f();
        }
        while (!this.f75561x93418e2b.isEmpty()) {
            m155755xede4bb27(this.f75561x93418e2b.get(0));
        }
        org.p3371xd0ce3e8d.C29797xa99bc1d0.m155650x8b8e8283(this.f75560x8f2fde77);
        this.f75560x8f2fde77 = 0L;
    }

    /* renamed from: getId */
    public java.lang.String m155751x5db1b11() {
        m155738x345aa9d8();
        return m155741x6707513a(this.f75560x8f2fde77);
    }

    /* renamed from: getNativeMediaStream */
    public long m155752x18a6eb37() {
        m155738x345aa9d8();
        return this.f75560x8f2fde77;
    }

    /* renamed from: removeAudioTrack */
    public void m155753x99705ab9(long j17) {
        m155744x23e137cb(this.f75559x1bee07fe, j17);
    }

    /* renamed from: removeTrack */
    public boolean m155754xede4bb27(org.p3371xd0ce3e8d.C29727xd28f3735 c29727xd28f3735) {
        m155738x345aa9d8();
        this.f75559x1bee07fe.remove(c29727xd28f3735);
        return m155742xb919e0f0(this.f75560x8f2fde77, c29727xd28f3735.m155136xe991fe02());
    }

    /* renamed from: removeVideoTrack */
    public void m155756xdca88134(long j17) {
        m155744x23e137cb(this.f75562x3fbab0e3, j17);
    }

    /* renamed from: toString */
    public java.lang.String m155757x9616526c() {
        return "[" + m155751x5db1b11() + ":A=" + this.f75559x1bee07fe.size() + ":V=" + this.f75562x3fbab0e3.size() + "]";
    }

    /* renamed from: addTrack */
    public boolean m155749xb5bac52a(org.p3371xd0ce3e8d.C29912x15c75db0 c29912x15c75db0) {
        m155738x345aa9d8();
        if (!m155740xee75fd6c(this.f75560x8f2fde77, c29912x15c75db0.m156590x2cca247d())) {
            return false;
        }
        this.f75562x3fbab0e3.add(c29912x15c75db0);
        return true;
    }

    /* renamed from: removeTrack */
    public boolean m155755xede4bb27(org.p3371xd0ce3e8d.C29912x15c75db0 c29912x15c75db0) {
        m155738x345aa9d8();
        this.f75562x3fbab0e3.remove(c29912x15c75db0);
        this.f75561x93418e2b.remove(c29912x15c75db0);
        return m155743xfc52076b(this.f75560x8f2fde77, c29912x15c75db0.m156590x2cca247d());
    }
}
