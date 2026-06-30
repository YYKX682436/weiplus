package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.VideoTrack */
/* loaded from: classes15.dex */
public class C29912x15c75db0 extends org.p3371xd0ce3e8d.C29816x8efc747 {

    /* renamed from: sinks */
    private final java.util.IdentityHashMap<org.p3371xd0ce3e8d.InterfaceC29908xc6e4d18e, java.lang.Long> f76147x685f440;

    public C29912x15c75db0(long j17) {
        super(j17);
        this.f76147x685f440 = new java.util.IdentityHashMap<>();
    }

    /* renamed from: nativeAddSink */
    private static native void m156585x8280e2bd(long j17, long j18);

    /* renamed from: nativeFreeSink */
    private static native void m156586xbc410056(long j17);

    /* renamed from: nativeRemoveSink */
    private static native void m156587x2776a4ae(long j17, long j18);

    /* renamed from: nativeWrapSink */
    private static native long m156588x9bfc9b34(org.p3371xd0ce3e8d.InterfaceC29908xc6e4d18e interfaceC29908xc6e4d18e);

    /* renamed from: addSink */
    public void m156589xbb8992d4(org.p3371xd0ce3e8d.InterfaceC29908xc6e4d18e interfaceC29908xc6e4d18e) {
        if (interfaceC29908xc6e4d18e == null) {
            throw new java.lang.IllegalArgumentException("The VideoSink is not allowed to be null");
        }
        if (this.f76147x685f440.containsKey(interfaceC29908xc6e4d18e)) {
            return;
        }
        long m156588x9bfc9b34 = m156588x9bfc9b34(interfaceC29908xc6e4d18e);
        this.f76147x685f440.put(interfaceC29908xc6e4d18e, java.lang.Long.valueOf(m156588x9bfc9b34));
        m156585x8280e2bd(m155767xc4a38054(), m156588x9bfc9b34);
    }

    @Override // org.p3371xd0ce3e8d.C29816x8efc747
    /* renamed from: dispose */
    public void mo155765x63a5261f() {
        java.util.Iterator<java.lang.Long> it = this.f76147x685f440.values().iterator();
        while (it.hasNext()) {
            long longValue = it.next().longValue();
            m156587x2776a4ae(m155767xc4a38054(), longValue);
            m156586xbc410056(longValue);
        }
        this.f76147x685f440.clear();
        super.mo155765x63a5261f();
    }

    /* renamed from: getNativeVideoTrack */
    public long m156590x2cca247d() {
        return m155767xc4a38054();
    }

    /* renamed from: removeSink */
    public void m156591x417a6937(org.p3371xd0ce3e8d.InterfaceC29908xc6e4d18e interfaceC29908xc6e4d18e) {
        java.lang.Long remove = this.f76147x685f440.remove(interfaceC29908xc6e4d18e);
        if (remove != null) {
            m156587x2776a4ae(m155767xc4a38054(), remove.longValue());
            m156586xbc410056(remove.longValue());
        }
    }
}
